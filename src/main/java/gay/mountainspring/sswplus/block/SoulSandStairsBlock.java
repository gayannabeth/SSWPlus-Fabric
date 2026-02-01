package gay.mountainspring.sswplus.block;

import java.util.stream.IntStream;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.BubbleColumnBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.block.enums.StairShape;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class SoulSandStairsBlock extends StairsBlock {
	public static final MapCodec<SoulSandStairsBlock> CODEC = RecordCodecBuilder.mapCodec(
			instance -> instance.group(BlockState.CODEC.fieldOf("base_state").forGetter(block -> block.baseBlockState), createSettingsCodec())
			.apply(instance, SoulSandStairsBlock::new));
	
	protected static final VoxelShape TOP_COLLISION_SHAPE = MudSlabBlock.TOP_COLLISION_SHAPE;
	protected static final VoxelShape BOTTOM_COLLISION_SHAPE = MudSlabBlock.BOTTOM_COLLISION_SHAPE;
	protected static final VoxelShape BOTTOM_NORTH_WEST_CORNER_COLLISION_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 8.0, 6.0, 8.0);
	protected static final VoxelShape BOTTOM_SOUTH_WEST_CORNER_COLLISION_SHAPE = Block.createCuboidShape(0.0, 0.0, 8.0, 8.0, 6.0, 16.0);
	protected static final VoxelShape TOP_NORTH_WEST_CORNER_COLLISION_SHAPE = Block.createCuboidShape(0.0, 6.0, 0.0, 8.0, 14.0, 8.0);
	protected static final VoxelShape TOP_SOUTH_WEST_CORNER_COLLISION_SHAPE = Block.createCuboidShape(0.0, 6.0, 8.0, 8.0, 14.0, 16.0);
	protected static final VoxelShape BOTTOM_NORTH_EAST_CORNER_COLLISION_SHAPE = Block.createCuboidShape(8.0, 0.0, 0.0, 16.0, 6.0, 8.0);
	protected static final VoxelShape BOTTOM_SOUTH_EAST_CORNER_COLLISION_SHAPE = Block.createCuboidShape(8.0, 0.0, 8.0, 16.0, 6.0, 16.0);
	protected static final VoxelShape TOP_NORTH_EAST_CORNER_COLLISION_SHAPE = Block.createCuboidShape(8.0, 6.0, 0.0, 16.0, 14.0, 8.0);
	protected static final VoxelShape TOP_SOUTH_EAST_CORNER_COLLISION_SHAPE = Block.createCuboidShape(8.0, 6.0, 8.0, 16.0, 14.0, 16.0);
	protected static final VoxelShape[] TOP_COLLISION_SHAPES = composeShapes(
		TOP_COLLISION_SHAPE, BOTTOM_NORTH_WEST_CORNER_COLLISION_SHAPE, BOTTOM_NORTH_EAST_CORNER_COLLISION_SHAPE, BOTTOM_SOUTH_WEST_CORNER_COLLISION_SHAPE, BOTTOM_SOUTH_EAST_CORNER_COLLISION_SHAPE
	);
	protected static final VoxelShape[] BOTTOM_COLLISION_SHAPES = composeShapes(
		BOTTOM_COLLISION_SHAPE, TOP_NORTH_WEST_CORNER_COLLISION_SHAPE, TOP_NORTH_EAST_CORNER_COLLISION_SHAPE, TOP_SOUTH_WEST_CORNER_COLLISION_SHAPE, TOP_SOUTH_EAST_CORNER_COLLISION_SHAPE
	);
	private static final int[] SHAPE_INDICES = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
	
	private static VoxelShape[] composeShapes(VoxelShape base, VoxelShape northWest, VoxelShape northEast, VoxelShape southWest, VoxelShape southEast) {
		return (VoxelShape[])IntStream.range(0, 16).mapToObj(i -> composeShape(i, base, northWest, northEast, southWest, southEast)).toArray(VoxelShape[]::new);
	}

	private static VoxelShape composeShape(int i, VoxelShape base, VoxelShape northWest, VoxelShape northEast, VoxelShape southWest, VoxelShape southEast) {
		VoxelShape voxelShape = base;
		if ((i & 1) != 0) {
			voxelShape = VoxelShapes.union(base, northWest);
		}

		if ((i & 2) != 0) {
			voxelShape = VoxelShapes.union(voxelShape, northEast);
		}

		if ((i & 4) != 0) {
			voxelShape = VoxelShapes.union(voxelShape, southWest);
		}

		if ((i & 8) != 0) {
			voxelShape = VoxelShapes.union(voxelShape, southEast);
		}

		return voxelShape;
	}
	
	@Override
	public MapCodec<SoulSandStairsBlock> getCodec() {
		return CODEC;
	}
	
	public SoulSandStairsBlock(BlockState baseBlockState, Settings settings) {
		super(baseBlockState, settings);
	}
	
	@Override
	protected VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return (state.get(HALF) == BlockHalf.TOP ? TOP_COLLISION_SHAPES : BOTTOM_COLLISION_SHAPES)[SHAPE_INDICES[this.getShapeIndexIndex(state)]];
	}
	
	private int getShapeIndexIndex(BlockState state) {
		return ((StairShape)state.get(SHAPE)).ordinal() * 4 + ((Direction)state.get(FACING)).getHorizontal();
	}
	
	@Override
	protected VoxelShape getSidesShape(BlockState state, BlockView world, BlockPos pos) {
		return this.getOutlineShape(state, world, pos, ShapeContext.absent());
	}
	
	@Override
	protected VoxelShape getCameraCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return this.getOutlineShape(state, world, pos, context);
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