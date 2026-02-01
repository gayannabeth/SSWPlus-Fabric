package gay.mountainspring.sswplus.block;

import com.mojang.serialization.MapCodec;

import gay.mountainspring.aquifer.block.DecayableSnowyWallBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.WallBlock;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class MyceliumWallBlock extends DecayableSnowyWallBlock {
	public static final MapCodec<WallBlock> CODEC = createCodec(MyceliumWallBlock::new);
	
	public MyceliumWallBlock(Settings settings) {
		super(settings);
	}
	
	@Override
	public MapCodec<WallBlock> getCodec() {
		return CODEC;
	}
	
	@Override
	protected BlockState getDecayState(BlockState state) {
		return SSWPBlocks.DIRT_WALL.getStateWithProperties(state);
	}
	
	@Override
	public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
		super.randomDisplayTick(state, world, pos, random);
		if (random.nextInt(10) == 0) {
			world.addParticle(ParticleTypes.MYCELIUM, pos.getX() + random.nextDouble(), pos.getY() + 1.1, pos.getZ() + random.nextDouble(), 0.0, 0.0, 0.0);
		}
	}
}