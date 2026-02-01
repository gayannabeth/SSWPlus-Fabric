package gay.mountainspring.sswplus.block;

import com.mojang.serialization.MapCodec;

import gay.mountainspring.aquifer.block.LeafCarpetBlock;
import net.minecraft.block.BlockState;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.particle.ParticleUtil;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class CherryLeafCarpetBlock extends LeafCarpetBlock {
	public static final MapCodec<CherryLeafCarpetBlock> CODEC = createCodec(CherryLeafCarpetBlock::new);
	
	@Override
	public MapCodec<CherryLeafCarpetBlock> getCodec() {
		return CODEC;
	}
	
	public CherryLeafCarpetBlock(Settings settings) {
		super(settings);
	}
	
	@Override
	public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
		super.randomDisplayTick(state, world, pos, random);
		if (random.nextInt(10) == 0) {
			BlockPos blockPos = pos.down();
			BlockState blockState = world.getBlockState(blockPos);
			if (!isFaceFullSquare(blockState.getCollisionShape(world, blockPos), Direction.UP)) {
				ParticleUtil.spawnParticle(world, pos, random, ParticleTypes.CHERRY_LEAVES);
			}
		}
	}
}