package gay.mountainspring.sswplus.block;

import com.mojang.serialization.MapCodec;

import net.minecraft.block.BlockState;
import net.minecraft.block.PaneBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class TintedGlassPaneBlock extends PaneBlock {
	public static final MapCodec<TintedGlassPaneBlock> CODEC = createCodec(TintedGlassPaneBlock::new);
	
	@Override
	public MapCodec<TintedGlassPaneBlock> getCodec() {
		return CODEC;
	}
	
	public TintedGlassPaneBlock(Settings settings) {
		super(settings);
	}
	
	@Override
	public boolean isTransparent(BlockState state, BlockView world, BlockPos pos) {
		return false;
	}
	
	@Override
	protected int getOpacity(BlockState state, BlockView world, BlockPos pos) {
		return world.getMaxLightLevel();
	}
}