package gay.mountainspring.sswplus.block;

import com.mojang.serialization.MapCodec;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.enums.SlabType;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;
import net.minecraft.world.event.GameEvent;

public class DirtPathSlabBlock extends SlabBlock {
	public static final MapCodec<DirtPathSlabBlock> CODEC = createCodec(DirtPathSlabBlock::new);
	protected static final VoxelShape BOTTOM_SHAPE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 7.0D, 16.0D);
	protected static final VoxelShape TOP_SHAPE = Block.createCuboidShape(0.0D, 7.0D, 0.0D, 16.0D, 15.0D, 16.0D);
	protected static final VoxelShape DOUBLE_SHAPE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 15.0D, 16.0D);
	
	@Override
	public MapCodec<DirtPathSlabBlock> getCodec() {
		return CODEC;
	}
	
	public DirtPathSlabBlock(Settings settings) {
		super(settings);
	}
	
	@Override
	protected boolean hasSidedTransparency(BlockState state) {
		return true;
	}
	
	@Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		BlockState state = super.getPlacementState(ctx);
		return !state.canPlaceAt(ctx.getWorld(), ctx.getBlockPos()) ? Block.pushEntitiesUpBeforeBlockChange(state, SSWPBlocks.DIRT_SLAB.getStateWithProperties(state), ctx.getWorld(), ctx.getBlockPos()) : state;
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
		BlockState blockState = pushEntitiesUpBeforeBlockChange(state, SSWPBlocks.DIRT_SLAB.getStateWithProperties(state), world, pos);
		world.setBlockState(pos, blockState);
		world.emitGameEvent(GameEvent.BLOCK_CHANGE, pos, GameEvent.Emitter.of(null, blockState));
	}
	
	@SuppressWarnings("deprecation")
	@Override
	protected boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
		BlockState blockState = world.getBlockState(pos.up());
		return !blockState.isSolid() || blockState.getBlock() instanceof FenceBlock || state.get(TYPE) == SlabType.BOTTOM;
	}
	
	@Override
	protected VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
		switch (state.get(TYPE)) {
			case BOTTOM: return BOTTOM_SHAPE;
			case TOP: return TOP_SHAPE;
			case DOUBLE:
			default: return DOUBLE_SHAPE;
		}
	}
}