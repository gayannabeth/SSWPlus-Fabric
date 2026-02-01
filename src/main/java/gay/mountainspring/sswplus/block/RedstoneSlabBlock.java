package gay.mountainspring.sswplus.block;

import com.mojang.serialization.MapCodec;

import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;

public class RedstoneSlabBlock extends SlabBlock {
	public static final MapCodec<RedstoneSlabBlock> CODEC = createCodec(RedstoneSlabBlock::new);
	
	@Override
	public MapCodec<RedstoneSlabBlock> getCodec() {
		return CODEC;
	}
	
	public RedstoneSlabBlock(Settings settings) {
		super(settings);
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