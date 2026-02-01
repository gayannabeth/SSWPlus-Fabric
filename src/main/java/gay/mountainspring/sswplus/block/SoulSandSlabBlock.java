package gay.mountainspring.sswplus.block;

import com.mojang.serialization.MapCodec;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.BubbleColumnBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.SlabBlock;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class SoulSandSlabBlock extends SlabBlock {
	public static final MapCodec<SoulSandSlabBlock> CODEC = createCodec(SoulSandSlabBlock::new);
	protected static final VoxelShape BOTTOM_COLLISION_SHAPE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D);
	protected static final VoxelShape TOP_COLLISION_SHAPE = Block.createCuboidShape(0.0D, 8.0D, 0.0D, 16.0D, 14.0D, 16.0D);
	protected static final VoxelShape DOUBLE_COLLISION_SHAPE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D);
	
	@Override
	public MapCodec<SoulSandSlabBlock> getCodec() {
		return CODEC;
	}
	
	public SoulSandSlabBlock(Settings settings) {
		super(settings);
	}
	
	@Override
	protected VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return switch(state.get(TYPE)) {
			case BOTTOM -> BOTTOM_COLLISION_SHAPE;
			case TOP -> TOP_COLLISION_SHAPE;
			case DOUBLE -> DOUBLE_COLLISION_SHAPE;
		};
	}
	
	@Override
	protected VoxelShape getSidesShape(BlockState state, BlockView world, BlockPos pos) {
		return switch (state.get(TYPE)) {
			case BOTTOM -> BOTTOM_SHAPE;
			case TOP -> TOP_SHAPE;
			case DOUBLE -> VoxelShapes.fullCube();
		};
	}
	
	@Override
	protected VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return switch (state.get(TYPE)) {
			case BOTTOM -> BOTTOM_SHAPE;
			case TOP -> TOP_SHAPE;
			case DOUBLE -> VoxelShapes.fullCube();
		};
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
	
	@Override
	protected float getAmbientOcclusionLightLevel(BlockState state, BlockView world, BlockPos pos) {
		return 0.2f;
	}
}