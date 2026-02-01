package gay.mountainspring.sswplus.block;

import gay.mountainspring.sswplus.SSWPSoundEvents;
import gay.mountainspring.sswplus.SSWPlus;
import net.fabricmc.fabric.api.object.builder.v1.block.type.WoodTypeBuilder;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.WoodType;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;

public class SSWPWoodTypes {
	private SSWPWoodTypes() {}
	
	public static final WoodType NETHER_BRICK = new WoodTypeBuilder().fenceGateCloseSound(SSWPSoundEvents.BLOCK_NETHER_BRICK_FENCE_GATE_CLOSE).fenceGateOpenSound(SSWPSoundEvents.BLOCK_NETHER_BRICK_FENCE_GATE_OPEN).hangingSignSoundGroup(BlockSoundGroup.NETHER_BRICKS).soundGroup(BlockSoundGroup.NETHER_BRICKS).register(Identifier.of(SSWPlus.MOD_ID, "nether_brick"), SSWPBlockSetTypes.NETHER_BRICK);
	public static final WoodType IRON = new WoodTypeBuilder().fenceGateCloseSound(SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE).fenceGateOpenSound(SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN).hangingSignSoundGroup(BlockSoundGroup.CHAIN).soundGroup(BlockSoundGroup.METAL).register(Identifier.of(SSWPlus.MOD_ID, "iron"), BlockSetType.IRON);
	public static final WoodType GOLD = new WoodTypeBuilder().fenceGateCloseSound(SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE).fenceGateOpenSound(SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN).hangingSignSoundGroup(BlockSoundGroup.CHAIN).soundGroup(BlockSoundGroup.METAL).register(Identifier.of(SSWPlus.MOD_ID, "gold"), BlockSetType.GOLD);
	public static final WoodType NETHERITE = new WoodTypeBuilder().fenceGateCloseSound(SoundEvents.BLOCK_IRON_TRAPDOOR_CLOSE).fenceGateOpenSound(SoundEvents.BLOCK_IRON_TRAPDOOR_OPEN).hangingSignSoundGroup(BlockSoundGroup.CHAIN).soundGroup(BlockSoundGroup.NETHERITE).register(Identifier.of(SSWPlus.MOD_ID, "netherite"), SSWPBlockSetTypes.NETHERITE);
	public static final WoodType COPPER = new WoodTypeBuilder().fenceGateCloseSound(SoundEvents.BLOCK_COPPER_TRAPDOOR_CLOSE).fenceGateCloseSound(SoundEvents.BLOCK_COPPER_TRAPDOOR_OPEN).hangingSignSoundGroup(BlockSoundGroup.CHAIN).soundGroup(BlockSoundGroup.COPPER).register(Identifier.of(SSWPlus.MOD_ID, "copper"), BlockSetType.COPPER);
	public static final WoodType EXPOSED_COPPER = new WoodTypeBuilder().fenceGateCloseSound(SoundEvents.BLOCK_COPPER_TRAPDOOR_CLOSE).fenceGateCloseSound(SoundEvents.BLOCK_COPPER_TRAPDOOR_OPEN).hangingSignSoundGroup(BlockSoundGroup.CHAIN).soundGroup(BlockSoundGroup.COPPER).register(Identifier.of(SSWPlus.MOD_ID, "exposed_copper"), BlockSetType.COPPER);
	public static final WoodType WEATHERED_COPPER = new WoodTypeBuilder().fenceGateCloseSound(SoundEvents.BLOCK_COPPER_TRAPDOOR_CLOSE).fenceGateCloseSound(SoundEvents.BLOCK_COPPER_TRAPDOOR_OPEN).hangingSignSoundGroup(BlockSoundGroup.CHAIN).soundGroup(BlockSoundGroup.COPPER).register(Identifier.of(SSWPlus.MOD_ID, "weathered_copper"), BlockSetType.COPPER);
	public static final WoodType OXIDIZED_COPPER = new WoodTypeBuilder().fenceGateCloseSound(SoundEvents.BLOCK_COPPER_TRAPDOOR_CLOSE).fenceGateCloseSound(SoundEvents.BLOCK_COPPER_TRAPDOOR_OPEN).hangingSignSoundGroup(BlockSoundGroup.CHAIN).soundGroup(BlockSoundGroup.COPPER).register(Identifier.of(SSWPlus.MOD_ID, "oxidized_copper"), BlockSetType.COPPER);
}