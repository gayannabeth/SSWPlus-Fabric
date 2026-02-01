package gay.mountainspring.sswplus.block;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import gay.mountainspring.aquifer.block.TransparentStairsBlock;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;

public class TintedGlassStairsBlock extends TransparentStairsBlock {
	public static final MapCodec<TintedGlassStairsBlock> CODEC = RecordCodecBuilder.mapCodec(
			instance -> instance.group(BlockState.CODEC.fieldOf("base_state").forGetter(block -> block.baseBlockState), createSettingsCodec())
			.apply(instance, TintedGlassStairsBlock::new));
	
	@Override
	public MapCodec<TintedGlassStairsBlock> getCodec() {
		return CODEC;
	}
	
	public TintedGlassStairsBlock(BlockState baseBlockState, Settings settings) {
		super(baseBlockState, settings);
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