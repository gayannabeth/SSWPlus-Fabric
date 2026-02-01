package gay.mountainspring.sswplus.block;

import com.mojang.serialization.MapCodec;

import gay.mountainspring.aquifer.block.DecayableSnowySlabBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class MyceliumSlabBlock extends DecayableSnowySlabBlock {
	public static final MapCodec<MyceliumSlabBlock> CODEC = createCodec(MyceliumSlabBlock::new);
	
	public MyceliumSlabBlock(Settings settings) {
		super(settings);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public MapCodec<MyceliumSlabBlock> getCodec() {
		return CODEC;
	}
	
	@Override
	protected BlockState getDoubleDecayState(BlockState state) {
		return Blocks.MYCELIUM.getDefaultState().with(SNOWY, state.get(SNOWY));
	}
	
	@Override
	protected BlockState getDecayState(BlockState state) {
		return SSWPBlocks.DIRT_SLAB.getStateWithProperties(state);
	}
	
	@Override
	public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
		super.randomDisplayTick(state, world, pos, random);
		if (random.nextInt(10) == 0) {
			world.addParticle(ParticleTypes.MYCELIUM, pos.getX() + random.nextDouble(), pos.getY() + 1.1, pos.getZ() + random.nextDouble(), 0.0, 0.0, 0.0);
		}
	}
}