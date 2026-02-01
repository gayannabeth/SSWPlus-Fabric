package gay.mountainspring.sswplus.block;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import gay.mountainspring.aquifer.block.DecayableSlabBlock;
import net.minecraft.block.BlockState;

public class NyliumSlabBlock extends DecayableSlabBlock {
	public static final MapCodec<NyliumSlabBlock> CODEC = RecordCodecBuilder.mapCodec(
			instance -> instance.group(BlockState.CODEC.fieldOf("decays_to").forGetter(block -> block.decays_to), createSettingsCodec())
			.apply(instance, NyliumSlabBlock::new));
	protected final BlockState decays_to;
	
	@Override
	public MapCodec<NyliumSlabBlock> getCodec() {
		return CODEC;
	}
	
	public NyliumSlabBlock(BlockState decaysTo, Settings settings) {
		super(settings);
		this.decays_to = decaysTo;
	}
	
	@Override
	protected BlockState getDoubleDecayState(BlockState state) {
		return this.decays_to;
	}
	
	@Override
	protected BlockState getDecayState(BlockState state) {
		return SSWPBlocks.NETHERRACK_SLAB.getStateWithProperties(state);
	}
}