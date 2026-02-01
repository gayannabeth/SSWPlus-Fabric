package gay.mountainspring.sswplus.block;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

import net.minecraft.block.BlockState;
import net.minecraft.block.StairsBlock;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

public class CryingObsidianStairsBlock extends StairsBlock {
	public static final MapCodec<CryingObsidianStairsBlock> CODEC = RecordCodecBuilder.mapCodec(
			instance -> instance.group(BlockState.CODEC.fieldOf("base_state").forGetter(block -> block.baseBlockState), createSettingsCodec())
			.apply(instance, CryingObsidianStairsBlock::new));
	
	@Override
	public MapCodec<CryingObsidianStairsBlock> getCodec() {
		return CODEC;
	}
	
	public CryingObsidianStairsBlock(BlockState baseBlockState, Settings settings) {
		super(baseBlockState, settings);
	}
	
	@Override
	public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
		if (random.nextInt(5) == 0) {
			Direction direction = Direction.random(random);
			if (direction != Direction.UP) {
				BlockPos blockPos = pos.offset(direction);
				BlockState blockState = world.getBlockState(blockPos);
				if (!state.isOpaque() || !blockState.isSideSolidFullSquare(world, blockPos, direction.getOpposite())) {
					double d = direction.getOffsetX() == 0 ? random.nextDouble() : 0.5 + direction.getOffsetX() * 0.6;
					double e = direction.getOffsetY() == 0 ? random.nextDouble() : 0.5 + direction.getOffsetY() * 0.6;
					double f = direction.getOffsetZ() == 0 ? random.nextDouble() : 0.5 + direction.getOffsetZ() * 0.6;
					world.addParticle(ParticleTypes.DRIPPING_OBSIDIAN_TEAR, pos.getX() + d, pos.getY() + e, pos.getZ() + f, 0.0, 0.0, 0.0);
				}
			}
		}
	}
}