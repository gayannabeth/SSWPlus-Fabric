package gay.mountainspring.sswplus.block;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import gay.mountainspring.aquifer.block.DecayableSnowyStairsBlock;
import net.minecraft.block.BlockState;

public class GrassStairsBlock extends DecayableSnowyStairsBlock {
	public static final MapCodec<GrassStairsBlock> CODEC = RecordCodecBuilder.mapCodec(
			instance -> instance.group(BlockState.CODEC.fieldOf("base_state").forGetter(block -> block.baseBlockState), createSettingsCodec())
			.apply(instance, GrassStairsBlock::new));
	
	public GrassStairsBlock(BlockState baseBlockState, Settings settings) {
		super(baseBlockState, settings);
	}
	
	@Override
	public MapCodec<GrassStairsBlock> getCodec() {
		return CODEC;
	}
	
	@Override
	protected BlockState getDecayState(BlockState state) {
		return SSWPBlocks.DIRT_STAIRS.getStateWithProperties(state);
	}
}