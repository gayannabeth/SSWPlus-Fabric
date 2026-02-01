package gay.mountainspring.sswplus.block;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import gay.mountainspring.aquifer.block.DecayableStairsBlock;
import net.minecraft.block.BlockState;

public class NyliumStairsBlock extends DecayableStairsBlock {
	public static final MapCodec<NyliumStairsBlock> CODEC = RecordCodecBuilder.mapCodec(
			instance -> instance.group(BlockState.CODEC.fieldOf("base_state").forGetter(block -> block.baseBlockState), createSettingsCodec())
			.apply(instance, NyliumStairsBlock::new));
	
	@Override
	public MapCodec<NyliumStairsBlock> getCodec() {
		return CODEC;
	}
	
	public NyliumStairsBlock(BlockState baseBlockState, Settings settings) {
		super(baseBlockState, settings);
	}
	
	@Override
	protected BlockState getDecayState(BlockState state) {
		return SSWPBlocks.NETHERRACK_STAIRS.getStateWithProperties(state);
	}
}