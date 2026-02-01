package gay.mountainspring.sswplus.block;

import gay.mountainspring.sswplus.SSWPlus;
import net.fabricmc.fabric.api.object.builder.v1.block.type.BlockSetTypeBuilder;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.BlockSetType.ActivationRule;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

public class SSWPBlockSetTypes {
	private SSWPBlockSetTypes() {}
	
	public static final BlockSetType NETHER_BRICK = new BlockSetTypeBuilder().buttonClickOffSound(SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF).buttonClickOnSound(SoundEvents.BLOCK_STONE_BUTTON_CLICK_ON).doorCloseSound(SoundEvents.BLOCK_IRON_DOOR_CLOSE).doorOpenSound(SoundEvents.BLOCK_IRON_DOOR_OPEN).openableByWindCharge(false).pressurePlateActivationRule(ActivationRule.MOBS).pressurePlateClickOffSound(SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_OFF).pressurePlateClickOnSound(SoundEvents.BLOCK_STONE_PRESSURE_PLATE_CLICK_ON).soundGroup(BlockSoundGroup.NETHER_BRICKS).trapdoorCloseSound(SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE).trapdoorOpenSound(SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN).register(Identifier.of(SSWPlus.MOD_ID, "nether_brick"));
	public static final BlockSetType NETHERITE = new BlockSetTypeBuilder().buttonActivatedByArrows(false).buttonClickOffSound(SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF).buttonClickOnSound(SoundEvents.BLOCK_STONE_BUTTON_CLICK_OFF).doorCloseSound(SoundEvents.BLOCK_IRON_DOOR_CLOSE).doorOpenSound(SoundEvents.BLOCK_IRON_DOOR_OPEN).openableByHand(false).openableByWindCharge(false).pressurePlateActivationRule(ActivationRule.MOBS).pressurePlateClickOffSound(SoundEvents.BLOCK_METAL_PRESSURE_PLATE_CLICK_OFF).pressurePlateClickOnSound(SoundEvents.BLOCK_METAL_PRESSURE_PLATE_CLICK_ON).soundGroup(BlockSoundGroup.NETHERITE).trapdoorCloseSound(SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE).trapdoorOpenSound(SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN).register(Identifier.of(SSWPlus.MOD_ID, "netherite"));
}