package gay.mountainspring.sswplus.block;

import com.mojang.serialization.MapCodec;

import net.minecraft.block.BlockState;
import net.minecraft.block.WallBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.BlockView;

public class RedstoneWallBlock extends WallBlock {
	public static final MapCodec<WallBlock> CODEC = createCodec(RedstoneWallBlock::new);
	
	@Override
	public MapCodec<WallBlock> getCodec() {
		return CODEC;
	}
	
	public RedstoneWallBlock(Settings settings) {
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