package gay.mountainspring.sswplus.block;

import com.mojang.serialization.MapCodec;

import gay.mountainspring.sswplus.SSWPlus;
import net.minecraft.block.Block;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class SSWPBlockTypes {
	private SSWPBlockTypes() {}
	
	public static void init() {
		register("amethyst_slab", AmethystSlabBlock.CODEC);
		register("amethyst_stairs", AmethystStairsBlock.CODEC);
		register("amethyst_wall", AmethystWallBlock.CODEC);
		register("cherry_leaf_carpet", CherryLeafCarpetBlock.CODEC);
		register("cherry_leaf_slab", CherryLeafSlabBlock.CODEC);
		register("cherry_leaf_stairs", CherryLeafStairsBlock.CODEC);
		register("cherry_leaf_wall", CherryLeafWallBlock.CODEC);
		register("coral_slab", CoralSlabBlock.CODEC);
		register("coral_stairs", CoralStairsBlock.CODEC);
		register("coral_wall", CoralWallBlock.CODEC);
		register("crying_obsidian_slab", CryingObsidianSlabBlock.CODEC);
		register("crying_obsidian_stairs", CryingObsidianStairsBlock.CODEC);
		register("crying_obsidian_wall", CryingObsidianWallBlock.CODEC);
		register("dirt_path_slab", DirtPathSlabBlock.CODEC);
		register("dirt_path_stairs", DirtPathStairsBlock.CODEC);
		register("dirt_path_wall", DirtPathWallBlock.CODEC);
		register("grass_slab", GrassSlabBlock.CODEC);
		register("grass_stairs", GrassStairsBlock.CODEC);
		register("grass_wall", GrassWallBlock.CODEC);
		register("ice_slab", IceSlabBlock.CODEC);
		register("ice_stairs", IceStairsBlock.CODEC);
		register("ice_wall", IceWallBlock.CODEC);
		register("magma_slab", MagmaSlabBlock.CODEC);
		register("magma_stairs", MagmaStairsBlock.CODEC);
		register("magma_wall", MagmaWallBlock.CODEC);
		register("mangrove_roots_slab", MangroveRootsSlabBlock.CODEC);
		register("mangrove_roots_stairs", MangroveRootsStairsBlock.CODEC);
		register("mangrove_roots_wall", MangroveRootsWallBlock.CODEC);
		register("mud_slab", MudSlabBlock.CODEC);
		register("mud_stairs", MudStairsBlock.CODEC);
		register("mud_wall", MudWallBlock.CODEC);
		register("mycelium_slab", MyceliumSlabBlock.CODEC);
		register("mycelium_stairs", MyceliumStairsBlock.CODEC);
		register("mycelium_wall", MyceliumWallBlock.CODEC);
		register("nylium_slab", NyliumSlabBlock.CODEC);
		register("nylium_stairs", NyliumStairsBlock.CODEC);
		register("nylium_wall", NyliumWallBlock.CODEC);
		register("redstone_lamp_slab", RedstoneLampSlabBlock.CODEC);
		register("redstone_lamp_stairs", RedstoneLampStairsBlock.CODEC);
		register("redstone_lamp_wall", RedstoneLampWallBlock.CODEC);
		register("redstone_ore_slab", RedstoneOreSlabBlock.CODEC);
		register("redstone_ore_stairs", RedstoneOreStairsBlock.CODEC);
		register("redstone_ore_wall", RedstoneOreWallBlock.CODEC);
		register("redstone_slab", RedstoneSlabBlock.CODEC);
		register("redstone_stairs", RedstoneStairsBlock.CODEC);
		register("redstone_wall", RedstoneWallBlock.CODEC);
		register("soul_sand_slab", SoulSandSlabBlock.CODEC);
		register("soul_sand_stairs", SoulSandStairsBlock.CODEC);
		register("soul_sand_wall", SoulSandWallBlock.CODEC);
		register("tinted_glass_pane", TintedGlassPaneBlock.CODEC);
		register("tinted_glass_slab", TintedGlassSlabBlock.CODEC);
		register("tinted_glass_stairs", TintedGlassStairsBlock.CODEC);
		register("tinted_glass_slab", TintedGlassWallBlock.CODEC);
	}
	
	private static void register(String name, MapCodec<? extends Block> codec) {
		Registry.register(Registries.BLOCK_TYPE, Identifier.of(SSWPlus.MOD_ID, name), codec);
	}
}