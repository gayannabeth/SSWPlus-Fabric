package gay.mountainspring.sswplus.block;

import com.mojang.serialization.MapCodec;

import gay.mountainspring.aquifer.block.TransparentSlabBlock;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class TintedGlassSlabBlock extends TransparentSlabBlock {
	public static final MapCodec<TintedGlassSlabBlock> CODEC = createCodec(TintedGlassSlabBlock::new);
	
	@Override
	public MapCodec<TintedGlassSlabBlock> getCodec() {
		return CODEC;
	}
	
	public TintedGlassSlabBlock(Settings settings) {
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