package gay.mountainspring.sswplus.block;

import com.mojang.serialization.MapCodec;

import gay.mountainspring.aquifer.block.DecayableSnowySlabBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;

public class GrassSlabBlock extends DecayableSnowySlabBlock {
	public static final MapCodec<GrassSlabBlock> CODEC = createCodec(GrassSlabBlock::new);
	
	public GrassSlabBlock(Settings settings) {
		super(settings);
	}
	
	@Override
	public MapCodec<GrassSlabBlock> getCodec() {
		return CODEC;
	}
	
	@Override
	protected BlockState getDoubleDecayState(BlockState state) {
		return Blocks.GRASS_BLOCK.getDefaultState().with(SNOWY, state.get(SNOWY));
	}

	@Override
	protected BlockState getDecayState(BlockState state) {
		return SSWPBlocks.DIRT_SLAB.getStateWithProperties(state);
	}
}