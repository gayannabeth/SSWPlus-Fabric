package gay.mountainspring.sswplus.block;

import org.jetbrains.annotations.Nullable;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import gay.mountainspring.aquifer.block.TranslucentStairsBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.IceBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.EnchantmentTags;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.LightType;
import net.minecraft.world.World;

public class IceStairsBlock extends TranslucentStairsBlock {
	public static final MapCodec<IceStairsBlock> CODEC = RecordCodecBuilder.mapCodec(
			instance -> instance.group(BlockState.CODEC.fieldOf("base_state").forGetter(block -> block.baseBlockState), createSettingsCodec())
			.apply(instance, IceStairsBlock::new));
	
	@Override
	public MapCodec<IceStairsBlock> getCodec() {
		return CODEC;
	}
	
	public IceStairsBlock(BlockState baseBlockState, Settings settings) {
		super(baseBlockState, settings);
	}
	
	private BlockState getMeltedState(BlockState state) {
		return IceBlock.getMeltedState();
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void afterBreak(World world, PlayerEntity player, BlockPos pos, BlockState state, @Nullable BlockEntity blockEntity, ItemStack tool) {
		super.afterBreak(world, player, pos, state, blockEntity, tool);
		if (!EnchantmentHelper.hasAnyEnchantmentsIn(tool, EnchantmentTags.PREVENTS_ICE_MELTING)) {
			if (world.getDimension().ultrawarm()) {
				world.removeBlock(pos, false);
				return;
			}
			
			BlockState blockState = world.getBlockState(pos.down());
			if (blockState.blocksMovement() || blockState.isLiquid()) {
				world.setBlockState(pos, this.getMeltedState(state));
			}
		}
	}
	
	@Override
	protected void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
		if (world.getLightLevel(LightType.BLOCK, pos) > 11 - state.getOpacity(world, pos)) {
			this.melt(state, world, pos);
		}
	}
	
	protected void melt(BlockState state, World world, BlockPos pos) {
		if (world.getDimension().ultrawarm()) {
			world.removeBlock(pos, false);
		} else {
			world.setBlockState(pos, this.getMeltedState(state));
			world.updateNeighbor(pos, this.getMeltedState(state).getBlock(), pos);
		}
	}
}