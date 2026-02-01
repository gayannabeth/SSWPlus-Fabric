package gay.mountainspring.sswplus.block;

import com.mojang.serialization.MapCodec;

import gay.mountainspring.aquifer.block.TransparentWallBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.WallBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class TintedGlassWallBlock extends TransparentWallBlock {
	public static final MapCodec<WallBlock> CODEC = createCodec(TintedGlassWallBlock::new);
	
	@Override
	public MapCodec<WallBlock> getCodec() {
		return CODEC;
	}
	
	public TintedGlassWallBlock(Settings settings) {
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