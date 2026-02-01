package gay.mountainspring.sswplus.block;

import java.util.Map;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.mojang.serialization.MapCodec;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.WallBlock;
import net.minecraft.block.enums.WallShape;
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

public class DirtPathWallBlock extends WallBlock {
	public static final MapCodec<WallBlock> CODEC = createCodec(DirtPathWallBlock::new);
	
	private final Map<BlockState, VoxelShape> shapeMap;
	private final Map<BlockState, VoxelShape> collisionShapeMap;
	
	@Override
	public MapCodec<WallBlock> getCodec() {
		return CODEC;
	}
	
	private static VoxelShape getVoxelShape(VoxelShape base, WallShape wallShape, VoxelShape tall, VoxelShape low) {
		if (wallShape == WallShape.TALL) {
			return VoxelShapes.union(base, low);
		} else {
			return wallShape == WallShape.LOW ? VoxelShapes.union(base, tall) : base;
		}
	}

	private Map<BlockState, VoxelShape> getShapeMap(float f, float g, float h, float i, float j, float k) {
		float l = 8.0F - f;
		float m = 8.0F + f;
		float n = 8.0F - g;
		float o = 8.0F + g;
		VoxelShape voxelShape = Block.createCuboidShape(l, 0.0, l, m, h, m);
		VoxelShape voxelShape2 = Block.createCuboidShape(n, i, 0.0, o, j, o);
		VoxelShape voxelShape3 = Block.createCuboidShape(n, i, n, o, j, 16.0);
		VoxelShape voxelShape4 = Block.createCuboidShape(0.0, i, n, o, j, o);
		VoxelShape voxelShape5 = Block.createCuboidShape(n, i, n, 16.0, j, o);
		VoxelShape voxelShape6 = Block.createCuboidShape(n, i, 0.0, o, k, o);
		VoxelShape voxelShape7 = Block.createCuboidShape(n, i, n, o, k, 16.0);
		VoxelShape voxelShape8 = Block.createCuboidShape(0.0, i, n, o, k, o);
		VoxelShape voxelShape9 = Block.createCuboidShape(n, i, n, 16.0, k, o);
		Builder<BlockState, VoxelShape> builder = ImmutableMap.builder();

		for (Boolean boolean_ : UP.getValues()) {
			for (WallShape wallShape : EAST_SHAPE.getValues()) {
				for (WallShape wallShape2 : NORTH_SHAPE.getValues()) {
					for (WallShape wallShape3 : WEST_SHAPE.getValues()) {
						for (WallShape wallShape4 : SOUTH_SHAPE.getValues()) {
							VoxelShape voxelShape10 = VoxelShapes.empty();
							voxelShape10 = getVoxelShape(voxelShape10, wallShape, voxelShape5, voxelShape9);
							voxelShape10 = getVoxelShape(voxelShape10, wallShape3, voxelShape4, voxelShape8);
							voxelShape10 = getVoxelShape(voxelShape10, wallShape2, voxelShape2, voxelShape6);
							voxelShape10 = getVoxelShape(voxelShape10, wallShape4, voxelShape3, voxelShape7);
							if (boolean_) {
								voxelShape10 = VoxelShapes.union(voxelShape10, voxelShape);
							}

							BlockState blockState = this.getDefaultState()
								.with(UP, boolean_)
								.with(EAST_SHAPE, wallShape)
								.with(WEST_SHAPE, wallShape3)
								.with(NORTH_SHAPE, wallShape2)
								.with(SOUTH_SHAPE, wallShape4);
							builder.put(blockState.with(WATERLOGGED, false), voxelShape10);
							builder.put(blockState.with(WATERLOGGED, true), voxelShape10);
						}
					}
				}
			}
		}

		return builder.build();
	}
	
	public DirtPathWallBlock(Settings settings) {
		super(settings);
		this.shapeMap = this.getShapeMap(4.0F, 3.0F, 15.0F, 0.0F, 13.0F, 15.0F);
		this.collisionShapeMap = this.getShapeMap(4.0F, 3.0F, 23.0F, 0.0F, 23.0F, 23.0F);
	}
	
	@Override
	protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return this.shapeMap.get(state);
	}
	
	@Override
	protected VoxelShape getCollisionShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		return this.collisionShapeMap.get(state);
	}
	
	@Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		BlockState state = super.getPlacementState(ctx);
		return !state.canPlaceAt(ctx.getWorld(), ctx.getBlockPos()) ? Block.pushEntitiesUpBeforeBlockChange(state, SSWPBlocks.DIRT_WALL.getStateWithProperties(state), ctx.getWorld(), ctx.getBlockPos()) : state;
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
		BlockState blockState = pushEntitiesUpBeforeBlockChange(state, SSWPBlocks.DIRT_WALL.getStateWithProperties(state), world, pos);
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