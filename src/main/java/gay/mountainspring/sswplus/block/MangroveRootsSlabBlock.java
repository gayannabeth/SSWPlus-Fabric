package gay.mountainspring.sswplus.block;

import com.mojang.serialization.MapCodec;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.enums.SlabType;
import net.minecraft.util.math.Direction;

public class MangroveRootsSlabBlock extends SlabBlock {
	public static final MapCodec<MangroveRootsSlabBlock> CODEC = createCodec(MangroveRootsSlabBlock::new);
	
	@Override
	public MapCodec<MangroveRootsSlabBlock> getCodec() {
		return CODEC;
	}
	
	public MangroveRootsSlabBlock(Settings settings) {
		super(settings);
	}
	
	@Override
	public boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
		Block other = stateFrom.getBlock();
		
		if (other == this && direction.getAxis() == Direction.Axis.Y) {
			SlabType thisType = state.get(TYPE);
			SlabType otherType = state.get(TYPE);
			
			if (direction == Direction.UP) {
				return otherType != SlabType.TOP && thisType != SlabType.BOTTOM;
			}
			
			if (direction == Direction.DOWN) {
				return otherType != SlabType.BOTTOM && thisType != SlabType.TOP;
			}
		}
		
		return false;
	}
}