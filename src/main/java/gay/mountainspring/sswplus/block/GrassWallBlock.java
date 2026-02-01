package gay.mountainspring.sswplus.block;

import com.mojang.serialization.MapCodec;

import gay.mountainspring.aquifer.block.DecayableSnowyWallBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.WallBlock;

public class GrassWallBlock extends DecayableSnowyWallBlock {
	public static final MapCodec<WallBlock> CODEC = createCodec(GrassWallBlock::new);
	
	public GrassWallBlock(Settings settings) {
		super(settings);
	}
	
	@Override
	public MapCodec<WallBlock> getCodec() {
		return CODEC;
	}
	
	@Override
	protected BlockState getDecayState(BlockState state) {
		return SSWPBlocks.DIRT_WALL.getDefaultState();
	}
}