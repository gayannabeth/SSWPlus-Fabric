package gay.mountainspring.sswplus.block;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import gay.mountainspring.aquifer.block.DecayableSnowyStairsBlock;
import net.minecraft.block.BlockState;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class MyceliumStairsBlock extends DecayableSnowyStairsBlock {
	public static final MapCodec<MyceliumStairsBlock> CODEC = RecordCodecBuilder.mapCodec(
			instance -> instance.group(BlockState.CODEC.fieldOf("base_state").forGetter(block -> block.baseBlockState), createSettingsCodec())
			.apply(instance, MyceliumStairsBlock::new));
	
	public MyceliumStairsBlock(BlockState baseBlockState, Settings settings) {
		super(baseBlockState, settings);
	}
	
	@Override
	public MapCodec<? extends DecayableSnowyStairsBlock> getCodec() {
		return CODEC;
	}
	
	@Override
	protected BlockState getDecayState(BlockState state) {
		return SSWPBlocks.DIRT_STAIRS.getStateWithProperties(state);
	}
	
	@Override
	public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
		super.randomDisplayTick(state, world, pos, random);
		if (random.nextInt(10) == 0) {
			world.addParticle(ParticleTypes.MYCELIUM, pos.getX() + random.nextDouble(), pos.getY() + 1.1, pos.getZ() + random.nextDouble(), 0.0, 0.0, 0.0);
		}
	}
}