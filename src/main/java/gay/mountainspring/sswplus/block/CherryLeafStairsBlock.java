package gay.mountainspring.sswplus.block;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import gay.mountainspring.aquifer.block.LeafStairsBlock;
import net.minecraft.block.BlockState;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.particle.ParticleUtil;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class CherryLeafStairsBlock extends LeafStairsBlock {
	public static final MapCodec<CherryLeafStairsBlock> CODEC = RecordCodecBuilder.mapCodec(
			instance -> instance.group(BlockState.CODEC.fieldOf("base_state").forGetter(block -> block.baseBlockState), createSettingsCodec())
			.apply(instance, CherryLeafStairsBlock::new));
	
	@Override
	public MapCodec<CherryLeafStairsBlock> getCodec() {
		return CODEC;
	}
	
	public CherryLeafStairsBlock(BlockState baseBlockState, Settings settings) {
		super(baseBlockState, settings);
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