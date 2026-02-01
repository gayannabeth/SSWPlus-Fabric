package gay.mountainspring.sswplus.block;

import com.mojang.serialization.MapCodec;

import gay.mountainspring.aquifer.block.DecayableWallBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.WallBlock;

public class NyliumWallBlock extends DecayableWallBlock {
	public static final MapCodec<WallBlock> CODEC = createCodec(NyliumWallBlock::new);
	
	@Override
	public MapCodec<WallBlock> getCodec() {
		return CODEC;
	}
	
	public NyliumWallBlock(Settings settings) {
		super(settings);
	}
	
	@Override
	protected BlockState getDecayState(BlockState state) {
		return SSWPBlocks.NETHERRACK_WALL.getStateWithProperties(state);
	}
}