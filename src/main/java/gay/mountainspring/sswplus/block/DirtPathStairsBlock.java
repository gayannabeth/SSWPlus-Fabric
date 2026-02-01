package gay.mountainspring.sswplus.block;

import java.util.stream.IntStream;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.block.enums.StairShape;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.minecraft.world.event.GameEvent;

public class DirtPathStairsBlock extends StairsBlock {
	public static final MapCodec<DirtPathStairsBlock> CODEC = RecordCodecBuilder.mapCodec(
			instance -> instance.group(BlockState.CODEC.fieldOf("base_state").forGetter(block -> block.baseBlockState), createSettingsCodec())
			.apply(instance, DirtPathStairsBlock::new));
	protected static final VoxelShape TOP_SHAPE = DirtPathSlabBlock.TOP_SHAPE;
	protected static final VoxelShape BOTTOM_SHAPE = DirtPathSlabBlock.BOTTOM_SHAPE;
	protected static final VoxelShape BOTTOM_NORTH_WEST_CORNER_SHAPE = Block.createCuboidShape(0.0, 0.0, 0.0, 8.0, 7.0, 8.0);
	protected static final VoxelShape BOTTOM_SOUTH_WEST_CORNER_SHAPE = Block.createCuboidShape(0.0, 0.0, 8.0, 8.0, 7.0, 16.0);
	protected static final VoxelShape TOP_NORTH_WEST_CORNER_SHAPE = Block.createCuboidShape(0.0, 7.0, 0.0, 8.0, 15.0, 8.0);
	protected static final VoxelShape TOP_SOUTH_WEST_CORNER_SHAPE = Block.createCuboidShape(0.0, 7.0, 8.0, 8.0, 15.0, 16.0);
	protected static final VoxelShape BOTTOM_NORTH_EAST_CORNER_SHAPE = Block.createCuboidShape(8.0, 0.0, 0.0, 16.0, 7.0, 8.0);
	protected static final VoxelShape BOTTOM_SOUTH_EAST_CORNER_SHAPE = Block.createCuboidShape(8.0, 0.0, 8.0, 16.0, 7.0, 16.0);
	protected static final VoxelShape TOP_NORTH_EAST_CORNER_SHAPE = Block.createCuboidShape(8.0, 7.0, 0.0, 16.0, 15.0, 8.0);
	protected static final VoxelShape TOP_SOUTH_EAST_CORNER_SHAPE = Block.createCuboidShape(8.0, 7.0, 8.0, 16.0, 15.0, 16.0);
	protected static final VoxelShape[] TOP_SHAPES = composeShapes(
		TOP_SHAPE, BOTTOM_NORTH_WEST_CORNER_SHAPE, BOTTOM_NORTH_EAST_CORNER_SHAPE, BOTTOM_SOUTH_WEST_CORNER_SHAPE, BOTTOM_SOUTH_EAST_CORNER_SHAPE
	);
	protected static final VoxelShape[] BOTTOM_SHAPES = composeShapes(
		BOTTOM_SHAPE, TOP_NORTH_WEST_CORNER_SHAPE, TOP_NORTH_EAST_CORNER_SHAPE, TOP_SOUTH_WEST_CORNER_SHAPE, TOP_SOUTH_EAST_CORNER_SHAPE
	);
	private static final int[] SHAPE_INDICES = new int[]{12, 5, 3, 10, 14, 13, 7, 11, 13, 7, 11, 14, 8, 4, 1, 2, 4, 1, 2, 8};
	
	@Override
	public MapCodec<DirtPathStairsBlock> getCodec() {
		return CODEC;
	}
	
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
	
	public DirtPathStairsBlock(BlockState baseBlockState, Settings settings) {
		super(baseBlockState, settings);
	}
	
	@Override
	protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return (state.get(HALF) == BlockHalf.TOP ? TOP_SHAPES : BOTTOM_SHAPES)[SHAPE_INDICES[this.getShapeIndexIndex(state)]];
	}
	
	private int getShapeIndexIndex(BlockState state) {
		return ((StairShape)state.get(SHAPE)).ordinal() * 4 + ((Direction)state.get(FACING)).getHorizontal();
	}
	
	@Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		BlockState state = super.getPlacementState(ctx);
		return !state.canPlaceAt(ctx.getWorld(), ctx.getBlockPos()) ? Block.pushEntitiesUpBeforeBlockChange(state, SSWPBlocks.DIRT_STAIRS.getStateWithProperties(state), ctx.getWorld(), ctx.getBlockPos()) : state;
	}
	
	@Override
	protected BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
		if (direction == Direction.UP && !state.canPlaceAt(world, pos)) {
			world.scheduleBlockTick(pos, this, 1);
		}
		
		return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
	}
	
	@Override
	protected void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
		BlockState blockState = pushEntitiesUpBeforeBlockChange(state, SSWPBlocks.DIRT_STAIRS.getStateWithProperties(state), world, pos);
		world.setBlockState(pos, blockState);
		world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(null, blockState));
	}
	
	@SuppressWarnings("deprecation")
	@Override
	protected boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
		BlockState blockState = world.getBlockState(pos.up());
		return !blockState.isSolid() || blockState.getBlock() instanceof FenceBlock;
	}
}