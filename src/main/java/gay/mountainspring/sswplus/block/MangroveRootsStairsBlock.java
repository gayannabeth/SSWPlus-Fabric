package gay.mountainspring.sswplus.block;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShapes;

public class MangroveRootsStairsBlock extends StairsBlock {
	public static final MapCodec<MangroveRootsStairsBlock> CODEC = RecordCodecBuilder.mapCodec(
			instance -> instance.group(BlockState.CODEC.fieldOf("base_state").forGetter(block -> block.baseBlockState), createSettingsCodec())
			.apply(instance, MangroveRootsStairsBlock::new));
	
	@Override
	public MapCodec<MangroveRootsStairsBlock> getCodec() {
		return CODEC;
	}
	
	public MangroveRootsStairsBlock(BlockState baseBlockState, Settings settings) {
		super(baseBlockState, settings);
	}
	
	@Override
	public boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
		return this == stateFrom.getBlock() && direction.getAxis() == Direction.Axis.Y && VoxelShapes.isSideCovered(state.getCullingFace(null, null, direction), stateFrom.getCullingFace(null, null, direction.getOpposite()), direction);
	}
}