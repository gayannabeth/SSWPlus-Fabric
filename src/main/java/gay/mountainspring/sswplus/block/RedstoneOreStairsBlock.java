package gay.mountainspring.sswplus.block;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import gay.mountainspring.aquifer.block.ExperienceDroppingStairsBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RedstoneOreBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.DustParticleEffect;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.Hand;
import net.minecraft.util.ItemActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class RedstoneOreStairsBlock extends ExperienceDroppingStairsBlock {
	public static final MapCodec<RedstoneOreStairsBlock> CODEC = RecordCodecBuilder.mapCodec(
			instance -> instance.group(BlockState.CODEC.fieldOf("base_state").forGetter(block -> block.baseBlockState), createSettingsCodec())
			.apply(instance, RedstoneOreStairsBlock::new));
	public static final BooleanProperty LIT = RedstoneOreBlock.LIT;
	
	@Override
	public MapCodec<RedstoneOreStairsBlock> getCodec() {
		return CODEC;
	}
	
	public RedstoneOreStairsBlock(BlockState baseBlockState, Settings settings) {
		super(UniformIntProvider.create(1, 5), baseBlockState, settings);
		this.setDefaultState(this.getDefaultState().with(LIT, false));
	}
	
	@Override
	protected void onBlockBreakStart(BlockState state, World world, BlockPos pos, PlayerEntity player) {
		light(state, world, pos);
		super.onBlockBreakStart(state, world, pos, player);
	}
	
	@Override
	public void onSteppedOn(World world, BlockPos pos, BlockState state, Entity entity) {
		if (!entity.bypassesSteppingEffects()) {
			light(state, world, pos);
		}
		
		super.onSteppedOn(world, pos, state, entity);
	}
	
	@Override
	protected ItemActionResult onUseWithItem(ItemStack stack, BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockHitResult hit) {
		if (world.isClient) {
			spawnParticles(world, pos);
		} else {
			light(state, world, pos);
		}
		
		return stack.getItem() instanceof BlockItem && new ItemPlacementContext(player, hand, stack, hit).canPlace()
			? ItemActionResult.SKIP_DEFAULT_BLOCK_INTERACTION
			: ItemActionResult.SUCCESS;
	}
	
	private static void light(BlockState state, World world, BlockPos pos) {
		spawnParticles(world, pos);
		if (!(Boolean)state.get(LIT)) {
			world.setBlockState(pos, state.with(LIT, true), Block.NOTIFY_ALL);
		}
	}
	
	@Override
	protected boolean hasRandomTicks(BlockState state) {
		return (Boolean)state.get(LIT);
	}
	
	@Override
	public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
		if ((Boolean)state.get(LIT)) {
			spawnParticles(world, pos);
		}
	}
	
	private static void spawnParticles(World world, BlockPos pos) {
		Random random = world.random;
		
		for (Direction direction : Direction.values()) {
			BlockPos blockPos = pos.offset(direction);
			if (!world.getBlockState(blockPos).isOpaqueFullCube(world, blockPos)) {
				Direction.Axis axis = direction.getAxis();
				double e = axis == Direction.Axis.X ? 0.5 + 0.5625 * direction.getOffsetX() : random.nextFloat();
				double f = axis == Direction.Axis.Y ? 0.5 + 0.5625 * direction.getOffsetY() : random.nextFloat();
				double g = axis == Direction.Axis.Z ? 0.5 + 0.5625 * direction.getOffsetZ() : random.nextFloat();
				world.addParticle(DustParticleEffect.DEFAULT, pos.getX() + e, pos.getY() + f, pos.getZ() + g, 0.0, 0.0, 0.0);
			}
		}
	}
	
	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		super.appendProperties(builder);
		builder.add(LIT);
	}
}