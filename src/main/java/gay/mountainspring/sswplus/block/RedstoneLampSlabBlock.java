package gay.mountainspring.sswplus.block;

import org.jetbrains.annotations.Nullable;

import com.mojang.serialization.MapCodec;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.RedstoneLampBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class RedstoneLampSlabBlock extends SlabBlock {
	public static final MapCodec<RedstoneLampSlabBlock> CODEC = createCodec(RedstoneLampSlabBlock::new);
	public static final BooleanProperty LIT = RedstoneLampBlock.LIT;
	
	@Override
	public MapCodec<RedstoneLampSlabBlock> getCodec() {
		return CODEC;
	}
	
	public RedstoneLampSlabBlock(Settings settings) {
		super(settings);
		this.setDefaultState(this.getDefaultState().with(LIT, false));
	}
	
	@Nullable
	@Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		return super.getPlacementState(ctx).with(LIT, ctx.getWorld().isReceivingRedstonePower(ctx.getBlockPos()));
	}
	
	@Override
	protected void neighborUpdate(BlockState state, World world, BlockPos pos, Block sourceBlock, BlockPos sourcePos, boolean notify) {
		if (!world.isClient) {
			boolean bl = (Boolean)state.get(LIT);
			if (bl != world.isReceivingRedstonePower(pos)) {
				if (bl) {
					world.scheduleBlockTick(pos, this, 4);
				} else {
					world.setBlockState(pos, state.cycle(LIT), Block.NOTIFY_LISTENERS);
				}
			}
		}
	}
	
	@Override
	protected void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
		if ((Boolean)state.get(LIT) && !world.isReceivingRedstonePower(pos)) {
			world.setBlockState(pos, state.cycle(LIT), Block.NOTIFY_LISTENERS);
		}
	}
	
	@Override
	protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		super.appendProperties(builder);
		builder.add(LIT);
	}
}