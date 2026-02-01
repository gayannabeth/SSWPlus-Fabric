package gay.mountainspring.sswplus.block;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;

public class RedstoneStairsBlock extends StairsBlock {
	public static final MapCodec<RedstoneStairsBlock> CODEC = RecordCodecBuilder.mapCodec(
		instance -> instance.group(BlockState.CODEC.fieldOf("base_state").forGetter(block -> block.baseBlockState), createSettingsCodec())
		.apply(instance, RedstoneStairsBlock::new)
	);
	
	@Override
	public MapCodec<RedstoneStairsBlock> getCodec() {
		return CODEC;
	}
	
	public RedstoneStairsBlock(BlockState baseBlockState, Settings settings) {
		super(baseBlockState, settings);
	}
	
	@Override
	protected boolean emitsRedstonePower(BlockState state) {
		return true;
	}
	
	@Override
	protected int getWeakRedstonePower(BlockState state, BlockView world, BlockPos pos, Direction direction) {
		return 15;
	}
}