package gay.mountainspring.sswplus.block;

import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;

public class SSWPBlockSoundGroups {
	private SSWPBlockSoundGroups() {}
	
	public static final BlockSoundGroup BAMBOO_LADDER = new BlockSoundGroup(
		1.0f,
		1.0f,
		SoundEvents.BLOCK_BAMBOO_WOOD_BREAK,
		SoundEvents.BLOCK_LADDER_STEP,
		SoundEvents.BLOCK_BAMBOO_WOOD_PLACE,
		SoundEvents.BLOCK_LADDER_HIT,
		SoundEvents.BLOCK_LADDER_FALL
	);
	
	public static final BlockSoundGroup NETHER_WOOD_LADDER = new BlockSoundGroup(
		1.0f,
		1.0f,
		SoundEvents.BLOCK_NETHER_WOOD_BREAK,
		SoundEvents.BLOCK_LADDER_STEP,
		SoundEvents.BLOCK_NETHER_WOOD_PLACE,
		SoundEvents.BLOCK_LADDER_HIT,
		SoundEvents.BLOCK_LADDER_FALL
	);
	
	public static final BlockSoundGroup CHERRY_LADDER = new BlockSoundGroup(
		1.0f,
		1.0f,
		SoundEvents.BLOCK_CHERRY_WOOD_BREAK,
		SoundEvents.BLOCK_LADDER_STEP,
		SoundEvents.BLOCK_CHERRY_WOOD_PLACE,
		SoundEvents.BLOCK_LADDER_HIT,
		SoundEvents.BLOCK_LADDER_FALL
	);
	
	public static final BlockSoundGroup NETHERITE_ANVIL = new BlockSoundGroup(
		1.0f,
		1.0f,
		SoundEvents.BLOCK_NETHERITE_BLOCK_BREAK,
		SoundEvents.BLOCK_NETHERITE_BLOCK_STEP,
		SoundEvents.BLOCK_ANVIL_PLACE,
		SoundEvents.BLOCK_NETHERITE_BLOCK_HIT,
		SoundEvents.BLOCK_NETHERITE_BLOCK_FALL
	);
}