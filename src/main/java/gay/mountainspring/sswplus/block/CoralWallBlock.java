package gay.mountainspring.sswplus.block;

import org.jetbrains.annotations.Nullable;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import gay.mountainspring.aquifer.block.Coral;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CoralBlockBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;

public class CoralWallBlock extends WallBlock implements Coral {
	public static final MapCodec<WallBlock> CODEC = RecordCodecBuilder.mapCodec(
			instance -> instance.group(CoralBlockBlock.DEAD_FIELD.forGetter(block -> ((CoralWallBlock) block).deadBlock), createSettingsCodec())
			.apply(instance, CoralWallBlock::new));
	
	protected final Block deadBlock;
	
	@Override
	public MapCodec<WallBlock> getCodec() {
		return CODEC;
	}
	
	public CoralWallBlock(Block deadBlock, Settings settings) {
		super(settings);
		this.deadBlock = deadBlock;
	}
	
	@Override
	public BlockState aquifer$getDeadState(BlockState state, BlockView world, BlockPos pos) {
		return this.deadBlock.getStateWithProperties(state);
	}
	
	@Override
	protected void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
		if (!this.aquifer$isInWater(state, world, pos)) {
			world.setBlockState(pos, this.aquifer$getDeadState(state, world, pos), Block.NOTIFY_LISTENERS);
		}
	}
	
	@Override
	protected BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
		if (!this.aquifer$isInWater(state, world, pos)) {
			world.scheduleBlockTick(pos, this, 60 + world.getRandom().nextInt(40));
		}
		
		return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
	}
	
	@Nullable
	@Override
	public BlockState getPlacementState(ItemPlacementContext ctx) {
		BlockPos pos = ctx.getBlockPos();
		World world = ctx.getWorld();
		BlockState state = world.getBlockState(pos);
		if (!this.aquifer$isInWater(state, world, pos)) {
			ctx.getWorld().scheduleBlockTick(ctx.getBlockPos(), this, 60 + ctx.getWorld().getRandom().nextInt(40));
		}
		
		return super.getPlacementState(ctx);
	}
}