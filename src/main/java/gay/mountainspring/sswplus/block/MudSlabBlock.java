package gay.mountainspring.sswplus.block;

import com.mojang.serialization.MapCodec;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.block.SlabBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class MudSlabBlock extends SlabBlock {
	public static final MapCodec<MudSlabBlock> CODEC = createCodec(MudSlabBlock::new);
	protected static final VoxelShape BOTTOM_COLLISION_SHAPE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 6.0D, 16.0D);
	protected static final VoxelShape TOP_COLLISION_SHAPE = Block.createCuboidShape(0.0D, 8.0D, 0.0D, 16.0D, 14.0D, 16.0D);
	protected static final VoxelShape DOUBLE_COLLISION_SHAPE = Block.createCuboidShape(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D);
	
	@Override
	public MapCodec<MudSlabBlock> getCodec() {
		return CODEC;
	}
	
	public MudSlabBlock(Settings settings) {
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
	protected float getAmbientOcclusionLightLevel(BlockState state, BlockView world, BlockPos pos) {
		return 0.2f;
	}
}