package gay.mountainspring.sswplus.block;

import com.mojang.serialization.MapCodec;

import gay.mountainspring.aquifer.block.HotFloorSlabBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.BubbleColumnBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class MagmaSlabBlock extends HotFloorSlabBlock {
	public static final MapCodec<MagmaSlabBlock> CODEC = createCodec(MagmaSlabBlock::new);
	
	@Override
	public MapCodec<MagmaSlabBlock> getCodec() {
		return CODEC;
	}
	
	public MagmaSlabBlock(Settings settings) {
		super(settings);
	}
	
	@Override
	protected void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
		BubbleColumnBlock.update(world, pos.up(), state);
	}
	
	@Override
	protected BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
		if (direction == Direction.UP && neighborState.isOf(Blocks.WATER)) {
			world.scheduleBlockTick(pos, this, 20);
		}
		
		return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
	}
	
	@Override
	protected void onBlockAdded(BlockState state, World world, BlockPos pos, BlockState oldState, boolean notify) {
		world.scheduleBlockTick(pos, this, 20);
	}
}