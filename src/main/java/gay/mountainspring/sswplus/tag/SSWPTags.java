package gay.mountainspring.sswplus.tag;

import gay.mountainspring.sswplus.SSWPlus;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class SSWPTags {
	private SSWPTags() {}
	
	public static <T> TagKey<T> create(RegistryKey<? extends Registry<T>> registryKey, String path) {
		return TagKey.of(registryKey, Identifier.of(SSWPlus.MOD_ID, path));
	}
	
	public static <T> TagKey<T> createConventional(RegistryKey<? extends Registry<T>> registryKey, String path) {
		return TagKey.of(registryKey, Identifier.of("c", path));
	}
	
	public static class Blocks {
		private Blocks() {}
		
		public static final TagKey<Block> OAK_SLABS = create("oak_slabs");
		public static final TagKey<Block> OAK_STAIRS = create("oak_stairs");
		public static final TagKey<Block> OAK_WALLS = create("oak_walls");
		
		public static final TagKey<Block> SPRUCE_SLABS = create("spruce_slabs");
		public static final TagKey<Block> SPRUCE_STAIRS = create("spruce_stairs");
		public static final TagKey<Block> SPRUCE_WALLS = create("spruce_walls");
		
		public static final TagKey<Block> BIRCH_SLABS = create("birch_slabs");
		public static final TagKey<Block> BIRCH_STAIRS = create("birch_stairs");
		public static final TagKey<Block> BIRCH_WALLS = create("birch_walls");
		
		public static final TagKey<Block> JUNGLE_SLABS = create("jungle_slabs");
		public static final TagKey<Block> JUNGLE_STAIRS = create("jungle_stairs");
		public static final TagKey<Block> JUNGLE_WALLS = create("jungle_walls");
		
		public static final TagKey<Block> ACACIA_SLABS = create("acacia_slabs");
		public static final TagKey<Block> ACACIA_STAIRS = create("acacia_stairs");
		public static final TagKey<Block> ACACIA_WALLS = create("acacia_walls");
		
		public static final TagKey<Block> DARK_OAK_SLABS = create("dark_oak_slabs");
		public static final TagKey<Block> DARK_OAK_STAIRS = create("dark_oak_stairs");
		public static final TagKey<Block> DARK_OAK_WALLS = create("dark_oak_walls");
		
		public static final TagKey<Block> MANGROVE_SLABS = create("mangrove_slabs");
		public static final TagKey<Block> MANGROVE_STAIRS = create("mangrove_stairs");
		public static final TagKey<Block> MANGROVE_WALLS = create("mangrove_walls");
		
		public static final TagKey<Block> CHERRY_SLABS = create("cherry_slabs");
		public static final TagKey<Block> CHERRY_STAIRS = create("cherry_stairs");
		public static final TagKey<Block> CHERRY_WALLS = create("cherry_walls");
		
		public static final TagKey<Block> BAMBOO_PLANKS = create("bamboo_planks");
		public static final TagKey<Block> BAMBOO_SLABS = create("bamboo_slabs");
		public static final TagKey<Block> BAMBOO_STAIRS = create("bamboo_stairs");
		public static final TagKey<Block> BAMBOO_WALLS = create("bamboo_walls");
		
		public static final TagKey<Block> CRIMSON_SLABS = create("crimson_slabs");
		public static final TagKey<Block> CRIMSON_STAIRS = create("crimson_stairs");
		public static final TagKey<Block> CRIMSON_WALLS = create("crimson_walls");
		
		public static final TagKey<Block> WARPED_SLABS = create("warped_slabs");
		public static final TagKey<Block> WARPED_STAIRS = create("warped_stairs");
		public static final TagKey<Block> WARPED_WALLS = create("warped_walls");
		
		public static final TagKey<Block> STONE = create("stone");
		public static final TagKey<Block> STONE_SLABS = create("stone_slabs");
		public static final TagKey<Block> STONE_STAIRS = create("stone_stairs");
		public static final TagKey<Block> STONE_WALLS = create("stone_walls");
		
		public static final TagKey<Block> STONE_BRICK_SLABS = create("stone_brick_slabs");
		public static final TagKey<Block> STONE_BRICK_STAIRS = create("stone_brick_stairs");
		public static final TagKey<Block> STONE_BRICK_WALLS = create("stone_brick_walls");
		
		public static final TagKey<Block> GRANITE = create("granite");
		public static final TagKey<Block> GRANITE_SLABS = create("granite_slabs");
		public static final TagKey<Block> GRANITE_STAIRS = create("granite_stairs");
		public static final TagKey<Block> GRANITE_WALLS = create("granite_walls");
		
		public static final TagKey<Block> DIORITE = create("diorite");
		public static final TagKey<Block> DIORITE_SLABS = create("diorite_slabs");
		public static final TagKey<Block> DIORITE_STAIRS = create("diorite_stairs");
		public static final TagKey<Block> DIORITE_WALLS = create("diorite_walls");
		
		public static final TagKey<Block> ANDESITE = create("andesite");
		public static final TagKey<Block> ANDESITE_SLABS = create("andesite_slabs");
		public static final TagKey<Block> ANDESITE_STAIRS = create("andesite_stairs");
		public static final TagKey<Block> ANDESITE_WALLS = create("andesite_walls");
		
		public static final TagKey<Block> DEEPSLATE = create("deepslate");
		public static final TagKey<Block> DEEPSLATE_SLABS = create("deepslate_slabs");
		public static final TagKey<Block> DEEPSLATE_STAIRS = create("deepslate_stairs");
		public static final TagKey<Block> DEEPSLATE_WALLS = create("deepslate_walls");
		
		public static final TagKey<Block> DEEPSLATE_BRICKS = create("deepslate_bricks");
		public static final TagKey<Block> DEEPSLATE_BRICK_SLABS = create("deepslate_brick_slabs");
		public static final TagKey<Block> DEEPSLATE_BRICK_STAIRS = create("deepslate_brick_stairs");
		public static final TagKey<Block> DEEPSLATE_BRICK_WALLS = create("deepslate_brick_walls");
		
		public static final TagKey<Block> DEEPSLATE_TILES = create("deepslate_tiles");
		public static final TagKey<Block> DEEPSLATE_TILE_SLABS = create("deepslate_tile_slabs");
		public static final TagKey<Block> DEEPSLATE_TILE_STAIRS = create("deepslate_tile_stairs");
		public static final TagKey<Block> DEEPSLATE_TILE_WALLS = create("deepslate_tile_walls");
		
		public static final TagKey<Block> TUFF = create("tuff");
		public static final TagKey<Block> TUFF_SLABS = create("tuff_slabs");
		public static final TagKey<Block> TUFF_STAIRS = create("tuff_stairs");
		public static final TagKey<Block> TUFF_WALLS = create("tuff_walls");
		
		public static final TagKey<Block> TUFF_BRICKS = create("tuff_bricks");
		public static final TagKey<Block> TUFF_BRICK_SLABS = create("tuff_brick_slabs");
		public static final TagKey<Block> TUFF_BRICK_STAIRS = create("tuff_brick_stairs");
		public static final TagKey<Block> TUFF_BRICK_WALLS = create("tuff_brick_walls");
		
		public static final TagKey<Block> SANDSTONE = create("sandstone");
		public static final TagKey<Block> SANDSTONE_SLABS = create("sandstone_slabs");
		public static final TagKey<Block> SANDSTONE_STAIRS = create("sandstone_stairs");
		public static final TagKey<Block> SANDSTONE_WALLS = create("sandstone_walls");
		
		public static final TagKey<Block> BEIGE_SANDSTONE = create("sandstone/beige");
		public static final TagKey<Block> BEIGE_SANDSTONE_SLABS = create("sandstone_slabs/beige");
		public static final TagKey<Block> BEIGE_SANDSTONE_STAIRS = create("sandstone_stairs/beige");
		public static final TagKey<Block> BEIGE_SANDSTONE_WALLS = create("sandstone_walls/beige");
		
		public static final TagKey<Block> RED_SANDSTONE = create("sandstone/red");
		public static final TagKey<Block> RED_SANDSTONE_SLABS = create("sandstone_slabs/red");
		public static final TagKey<Block> RED_SANDSTONE_STAIRS = create("sandstone_stairs/red");
		public static final TagKey<Block> RED_SANDSTONE_WALLS = create("sandstone_walls/red");
		
		public static final TagKey<Block> PRISMARINE = create("prismarine");
		public static final TagKey<Block> PRISMARINE_SLABS = create("prismarine_slabs");
		public static final TagKey<Block> PRISMARINE_STAIRS = create("prismarine_stairs");
		public static final TagKey<Block> PRISMARINE_WALLS = create("prismarine_walls");
		
		public static final TagKey<Block> NETHER_BRICK_BLOCKS = create("nether_brick_blocks");
		public static final TagKey<Block> NETHER_BRICK_SLABS = create("nether_brick_slabs");
		public static final TagKey<Block> NETHER_BRICK_STAIRS = create("nether_brick_stairs");
		public static final TagKey<Block> NETHER_BRICK_WALLS = create("nether_brick_walls");
		public static final TagKey<Block> NETHER_BRICK_FENCES = create("nether_brick_fences");
		public static final TagKey<Block> NETHER_BRICK_FENCE_GATES = create("nether_brick_fence_gates");
		
		public static final TagKey<Block> BASALT = create("basalt");
		public static final TagKey<Block> BASALT_SLABS = create("basalt_slabs");
		public static final TagKey<Block> BASALT_STAIRS = create("basalt_stairs");
		public static final TagKey<Block> BASALT_WALLS = create("basalt_walls");
		
		public static final TagKey<Block> BLACKSTONE = create("blackstone");
		public static final TagKey<Block> BLACKSTONE_SLABS = create("blackstone_slabs");
		public static final TagKey<Block> BLACKSTONE_STAIRS = create("blackstone_stairs");
		public static final TagKey<Block> BLACKSTONE_WALLS = create("blackstone_walls");
		
		public static final TagKey<Block> BLACKSTONE_BRICKS = create("blackstone_bricks");
		public static final TagKey<Block> BLACKSTONE_BRICK_SLABS = create("blackstone_brick_slabs");
		public static final TagKey<Block> BLACKSTONE_BRICK_STAIRS = create("blackstone_brick_stairs");
		public static final TagKey<Block> BLACKSTONE_BRICK_WALLS = create("blackstone_brick_walls");
		
		public static final TagKey<Block> PURPUR_BLOCKS = create("purpur_blocks");
		public static final TagKey<Block> PURPUR_SLABS = create("purpur_slabs");
		public static final TagKey<Block> PURPUR_STAIRS = create("purpur_stairs");
		public static final TagKey<Block> PURPUR_WALLS = create("purpur_walls");
		
		public static final TagKey<Block> QUARTZ_BLOCKS = create("quartz_blocks");
		public static final TagKey<Block> QUARTZ_SLABS = create("quartz_slabs");
		public static final TagKey<Block> QUARTZ_STAIRS = create("quartz_stairs");
		public static final TagKey<Block> QUARTZ_WALLS = create("quartz_walls");
		
		public static final TagKey<Block> COPPER_BLOCKS = create("copper_blocks");
		public static final TagKey<Block> COPPER_SLABS = create("copper_slabs");
		public static final TagKey<Block> COPPER_STAIRS = create("copper_stairs");
		public static final TagKey<Block> COPPER_WALLS = create("copper_walls");
		public static final TagKey<Block> COPPER_FENCES = create("copper_fences");
		public static final TagKey<Block> COPPER_FENCE_GATES = create("copper_fence_gates");
		public static final TagKey<Block> COPPER_BARS = create("copper_bars");
		public static final TagKey<Block> COPPER_DOORS = create("copper_doors");
		public static final TagKey<Block> COPPER_TRAPDOORS = create("copper_trapdoors");
		public static final TagKey<Block> COPPER_PRESSURE_PLATES = create("copper_pressure_plates");
		public static final TagKey<Block> COPPER_BUTTONS = create("copper_buttons");
		public static final TagKey<Block> COPPER_CHAINS = create("copper_buttons");
		public static final TagKey<Block> COPPER_BULBS = create("copper_bulbs");
		
		public static final TagKey<Block> UNWAXED_COPPER_BLOCKS = create("copper_blocks/unwaxed");
		public static final TagKey<Block> UNWAXED_COPPER_SLABS = create("copper_slabs/unwaxed");
		public static final TagKey<Block> UNWAXED_COPPER_STAIRS = create("copper_stairs/unwaxed");
		public static final TagKey<Block> UNWAXED_COPPER_WALLS = create("copper_walls/unwaxed");
		public static final TagKey<Block> UNWAXED_COPPER_FENCES = create("copper_fences/unwaxed");
		public static final TagKey<Block> UNWAXED_COPPER_FENCE_GATES = create("copper_fence_gates/unwaxed");
		public static final TagKey<Block> UNWAXED_COPPER_BARS = create("copper_bars/unwaxed");
		public static final TagKey<Block> UNWAXED_COPPER_DOORS = create("copper_doors/unwaxed");
		public static final TagKey<Block> UNWAXED_COPPER_TRAPDOORS = create("copper_trapdoors/unwaxed");
		public static final TagKey<Block> UNWAXED_COPPER_PRESSURE_PLATES = create("copper_pressure_plates/unwaxed");
		public static final TagKey<Block> UNWAXED_COPPER_BUTTONS = create("copper_buttons/unwaxed");
		public static final TagKey<Block> UNWAXED_COPPER_CHAINS = create("copper_buttons/unwaxed");
		public static final TagKey<Block> UNWAXED_COPPER_BULBS = create("copper_bulbs/unwaxed");
		
		public static final TagKey<Block> WAXED_COPPER_BLOCKS = create("copper_blocks/waxed");
		public static final TagKey<Block> WAXED_COPPER_SLABS = create("copper_slabs/waxed");
		public static final TagKey<Block> WAXED_COPPER_STAIRS = create("copper_stairs/waxed");
		public static final TagKey<Block> WAXED_COPPER_WALLS = create("copper_walls/waxed");
		public static final TagKey<Block> WAXED_COPPER_FENCES = create("copper_fences/waxed");
		public static final TagKey<Block> WAXED_COPPER_FENCE_GATES = create("copper_fence_gates/waxed");
		public static final TagKey<Block> WAXED_COPPER_BARS = create("copper_bars/waxed");
		public static final TagKey<Block> WAXED_COPPER_DOORS = create("copper_doors/waxed");
		public static final TagKey<Block> WAXED_COPPER_TRAPDOORS = create("copper_trapdoors/waxed");
		public static final TagKey<Block> WAXED_COPPER_PRESSURE_PLATES = create("copper_pressure_plates/waxed");
		public static final TagKey<Block> WAXED_COPPER_BUTTONS = create("copper_buttons/waxed");
		public static final TagKey<Block> WAXED_COPPER_CHAINS = create("copper_buttons/waxed");
		public static final TagKey<Block> WAXED_COPPER_BULBS = create("copper_bulbs/waxed");
		
		public static final TagKey<Block> WOOL_SLABS = create("wool_slabs");
		public static final TagKey<Block> WOOL_STAIRS = create("wool_stairs");
		public static final TagKey<Block> WOOL_WALLS = create("wool_walls");
		
		public static final TagKey<Block> TERRACOTTA_SLABS = create("terracotta_slabs");
		public static final TagKey<Block> TERRACOTTA_STAIRS = create("terracotta_stairs");
		public static final TagKey<Block> TERRACOTTA_WALLS = create("terracotta_walls");
		
		public static final TagKey<Block> CONCRETE_SLABS = create("concrete_slabs");
		public static final TagKey<Block> CONCRETE_STAIRS = create("concrete_stairs");
		public static final TagKey<Block> CONCRETE_WALLS = create("concrete_walls");
		
		public static final TagKey<Block> GLASS_SLABS = create("glass_slabs");
		public static final TagKey<Block> GLASS_STAIRS = create("glass_stairs");
		public static final TagKey<Block> GLASS_WALLS = create("glass_walls");
		
		public static final TagKey<Block> DIRT_SLABS = create("dirt_slabs");
		public static final TagKey<Block> DIRT_STAIRS = create("dirt_stairs");
		public static final TagKey<Block> DIRT_WALLS = create("dirt_walls");
		
		public static final TagKey<Block> ICE_SLABS = create("ice_slabs");
		public static final TagKey<Block> ICE_STAIRS = create("ice_stairs");
		public static final TagKey<Block> ICE_WALLS = create("ice_walls");
		
		public static final TagKey<Block> OBSIDIAN = create("obsidian");
		public static final TagKey<Block> OBSIDIAN_SLABS = create("obsidian_slabs");
		public static final TagKey<Block> OBSIDIAN_STAIRS = create("obsidian_stairs");
		public static final TagKey<Block> OBSIDIAN_WALLS = create("obsidian_walls");
		
		public static final TagKey<Block> NYLIUM_SLABS = create("nylium_slabs");
		public static final TagKey<Block> NYLIUM_STAIRS = create("nylium_stairs");
		public static final TagKey<Block> NYLIUM_WALLS = create("nylium_walls");
		
		public static final TagKey<Block> COAL_ORE_SLABS = create("coal_ore_slabs");
		public static final TagKey<Block> COAL_ORE_STAIRS = create("coal_ore_stairs");
		public static final TagKey<Block> COAL_ORE_WALLS = create("coal_ore_walls");
		
		public static final TagKey<Block> IRON_ORE_SLABS = create("iron_ore_slabs");
		public static final TagKey<Block> IRON_ORE_STAIRS = create("iron_ore_stairs");
		public static final TagKey<Block> IRON_ORE_WALLS = create("iron_ore_walls");
		
		public static final TagKey<Block> COPPER_ORE_SLABS = create("copper_ore_slabs");
		public static final TagKey<Block> COPPER_ORE_STAIRS = create("copper_ore_stairs");
		public static final TagKey<Block> COPPER_ORE_WALLS = create("copper_ore_walls");
		
		public static final TagKey<Block> GOLD_ORE_SLABS = create("gold_ore_slabs");
		public static final TagKey<Block> GOLD_ORE_STAIRS = create("gold_ore_stairs");
		public static final TagKey<Block> GOLD_ORE_WALLS = create("gold_ore_walls");
		
		public static final TagKey<Block> REDSTONE_ORE_SLABS = create("redstone_ore_slabs");
		public static final TagKey<Block> REDSTONE_ORE_STAIRS = create("redstone_ore_stairs");
		public static final TagKey<Block> REDSTONE_ORE_WALLS = create("redstone_ore_walls");
		
		public static final TagKey<Block> EMERALD_ORE_SLABS = create("emerald_ore_slabs");
		public static final TagKey<Block> EMERALD_ORE_STAIRS = create("emerald_ore_stairs");
		public static final TagKey<Block> EMERALD_ORE_WALLS = create("emerald_ore_walls");
		
		public static final TagKey<Block> LAPIS_ORE_SLABS = create("lapis_ore_slabs");
		public static final TagKey<Block> LAPIS_ORE_STAIRS = create("lapis_ore_stairs");
		public static final TagKey<Block> LAPIS_ORE_WALLS = create("lapis_ore_walls");
		
		public static final TagKey<Block> DIAMOND_ORE_SLABS = create("diamond_ore_slabs");
		public static final TagKey<Block> DIAMOND_ORE_STAIRS = create("diamond_ore_stairs");
		public static final TagKey<Block> DIAMOND_ORE_WALLS = create("diamond_ore_walls");
		
		public static final TagKey<Block> QUARTZ_ORES = create("quartz_ores");
		public static final TagKey<Block> QUARTZ_ORE_SLABS = create("quartz_ore_slabs");
		public static final TagKey<Block> QUARTZ_ORE_STAIRS = create("quartz_ore_stairs");
		public static final TagKey<Block> QUARTZ_ORE_WALLS = create("quartz_ore_walls");
		
		public static final TagKey<Block> MUSHROOM_BLOCKS = create("mushroom_blocks");
		public static final TagKey<Block> MUSHROOM_SLABS = create("mushroom_slabs");
		public static final TagKey<Block> MUSHROOM_STAIRS = create("mushroom_stairs");
		public static final TagKey<Block> MUSHROOM_WALLS = create("mushroom_walls");
		
		public static final TagKey<Block> WART_BLOCKS = create("wart_blocks");
		public static final TagKey<Block> WART_SLABS = create("wart_slabs");
		public static final TagKey<Block> WART_STAIRS = create("wart_stairs");
		public static final TagKey<Block> WART_WALLS = create("wart_walls");
		
		public static final TagKey<Block> CORAL_SLABS = create("coral_slabs");
		public static final TagKey<Block> CORAL_STAIRS = create("coral_stairs");
		public static final TagKey<Block> CORAL_WALLS = create("coral_walls");
		public static final TagKey<Block> DEAD_CORAL_SLABS = create("dead_coral_slabs");
		public static final TagKey<Block> DEAD_CORAL_STAIRS = create("dead_coral_stairs");
		public static final TagKey<Block> DEAD_CORAL_WALLS = create("dead_coral_walls");
		
		public static final TagKey<Block> FROGLIGHTS = create("froglights");
		public static final TagKey<Block> FROGLIGHT_SLABS = create("froglight_slabs");
		public static final TagKey<Block> FROGLIGHT_STAIRS = create("froglight_stairs");
		public static final TagKey<Block> FROGLIGHT_WALLS = create("froglight_walls");
		
		public static final TagKey<Block> COPPER_LADDERS = create("copper_ladders");
		public static final TagKey<Block> UNWAXED_COPPER_LADDERS = create("unwaxed_copper_ladders");
		public static final TagKey<Block> WAXED_COPPER_LADDERS = create("waxed_copper_ladders");
		
		public static final TagKey<Block> ALL_COPPER_SIGNS = create("all_copper_signs");
		public static final TagKey<Block> COPPER_SIGNS = create("copper_signs");
		public static final TagKey<Block> COPPER_HANGING_SIGNS = create("copper_hanging_signs");
		public static final TagKey<Block> COPPER_STANDING_SIGNS = create("copper_standing_signs");
		public static final TagKey<Block> COPPER_CEILING_HANGING_SIGNS = create("copper_ceiling_hanging_signs");
		public static final TagKey<Block> COPPER_WALL_SIGNS = create("copper_wall_signs");
		public static final TagKey<Block> COPPER_WALL_HANGING_SIGNS = create("copper_wall_hanging_signs");
		public static final TagKey<Block> ALL_UNWAXED_COPPER_SIGNS = create("all_unwaxed_copper_signs");
		public static final TagKey<Block> UNWAXED_COPPER_SIGNS = create("unwaxed_copper_signs");
		public static final TagKey<Block> UNWAXED_COPPER_HANGING_SIGNS = create("unwaxed_copper_hanging_signs");
		public static final TagKey<Block> UNWAXED_COPPER_STANDING_SIGNS = create("unwaxed_copper_standing_signs");
		public static final TagKey<Block> UNWAXED_COPPER_CEILING_HANGING_SIGNS = create("unwaxed_copper_ceiling_hanging_signs");
		public static final TagKey<Block> UNWAXED_COPPER_WALL_SIGNS = create("unwaxed_copper_wall_signs");
		public static final TagKey<Block> UNWAXED_COPPER_WALL_HANGING_SIGNS = create("unwaxed_copper_wall_hanging_signs");
		public static final TagKey<Block> ALL_WAXED_COPPER_SIGNS = create("all_waxed_copper_signs");
		public static final TagKey<Block> WAXED_COPPER_SIGNS = create("waxed_copper_signs");
		public static final TagKey<Block> WAXED_COPPER_HANGING_SIGNS = create("waxed_copper_hanging_signs");
		public static final TagKey<Block> WAXED_COPPER_STANDING_SIGNS = create("waxed_copper_standing_signs");
		public static final TagKey<Block> WAXED_COPPER_CEILING_HANGING_SIGNS = create("waxed_copper_ceiling_hanging_signs");
		public static final TagKey<Block> WAXED_COPPER_WALL_SIGNS = create("waxed_copper_wall_signs");
		public static final TagKey<Block> WAXED_COPPER_WALL_HANGING_SIGNS = create("waxed_copper_wall_hanging_signs");
		
		public static final TagKey<Block> COPPER_CAULDRONS = create("copper_cauldrons");
		public static final TagKey<Block> UNWAXED_COPPER_CAULDRONS = create("unwaxed_copper_cauldrons");
		public static final TagKey<Block> WAXED_COPPER_CAULDRONS = create("waxed_copper_cauldrons");
		
		public static final TagKey<Block> LANTERNS = create("lanterns");
		public static final TagKey<Block> NORMAL_LANTERNS = create("normal_lanterns");
		public static final TagKey<Block> SOUL_LANTERNS = create("soul_lanterns");
		public static final TagKey<Block> COPPER_LANTERNS = create("copper_lanterns");
		public static final TagKey<Block> UNWAXED_COPPER_LANTERNS = create("unwaxed_copper_lanterns");
		public static final TagKey<Block> WAXED_COPPER_LANTERNS = create("waxed_copper_lanterns");
		public static final TagKey<Block> COPPER_NORMAL_LANTERNS = create("copper_normal_lanterns");
		public static final TagKey<Block> UNWAXED_COPPER_NORMAL_LANTERNS = create("unwaxed_copper_normal_lanterns");
		public static final TagKey<Block> WAXED_COPPER_NORMAL_LANTERNS = create("waxed_copper_normal_lanterns");
		public static final TagKey<Block> COPPER_SOUL_LANTERNS = create("copper_soul_lanterns");
		public static final TagKey<Block> UNWAXED_COPPER_SOUL_LANTERNS = create("unwaxed_copper_soul_lanterns");
		public static final TagKey<Block> WAXED_COPPER_SOUL_LANTERNS = create("waxed_copper_soul_lanterns");
		
		public static final TagKey<Block> CONVERTS_TO_MUD_SLAB = create("converts_to_mud_slab");
		public static final TagKey<Block> CONVERTS_TO_MUD_STAIRS = create("converts_to_mud_stairs");
		public static final TagKey<Block> CONVERTS_TO_MUD_WALL = create("converts_to_mud_wall");
		
		public static TagKey<Block> create(String name) {
			return SSWPTags.create(RegistryKeys.BLOCK, name);
		}
		
		public static TagKey<Block> createConventional(String name) {
			return SSWPTags.createConventional(RegistryKeys.BLOCK, name);
		}
	}
	
	public static class Items {
		private Items() {}
		
		public static final TagKey<Item> OAK_SLABS = create("oak_slabs");
		public static final TagKey<Item> OAK_STAIRS = create("oak_stairs");
		public static final TagKey<Item> OAK_WALLS = create("oak_walls");
		
		public static final TagKey<Item> SPRUCE_SLABS = create("spruce_slabs");
		public static final TagKey<Item> SPRUCE_STAIRS = create("spruce_stairs");
		public static final TagKey<Item> SPRUCE_WALLS = create("spruce_walls");
		
		public static final TagKey<Item> BIRCH_SLABS = create("birch_slabs");
		public static final TagKey<Item> BIRCH_STAIRS = create("birch_stairs");
		public static final TagKey<Item> BIRCH_WALLS = create("birch_walls");
		
		public static final TagKey<Item> JUNGLE_SLABS = create("jungle_slabs");
		public static final TagKey<Item> JUNGLE_STAIRS = create("jungle_stairs");
		public static final TagKey<Item> JUNGLE_WALLS = create("jungle_walls");
		
		public static final TagKey<Item> ACACIA_SLABS = create("acacia_slabs");
		public static final TagKey<Item> ACACIA_STAIRS = create("acacia_stairs");
		public static final TagKey<Item> ACACIA_WALLS = create("acacia_walls");
		
		public static final TagKey<Item> DARK_OAK_SLABS = create("dark_oak_slabs");
		public static final TagKey<Item> DARK_OAK_STAIRS = create("dark_oak_stairs");
		public static final TagKey<Item> DARK_OAK_WALLS = create("dark_oak_walls");
		
		public static final TagKey<Item> MANGROVE_SLABS = create("mangrove_slabs");
		public static final TagKey<Item> MANGROVE_STAIRS = create("mangrove_stairs");
		public static final TagKey<Item> MANGROVE_WALLS = create("mangrove_walls");
		
		public static final TagKey<Item> CHERRY_SLABS = create("cherry_slabs");
		public static final TagKey<Item> CHERRY_STAIRS = create("cherry_stairs");
		public static final TagKey<Item> CHERRY_WALLS = create("cherry_walls");
		
		public static final TagKey<Item> BAMBOO_PLANKS = create("bamboo_planks");
		public static final TagKey<Item> BAMBOO_SLABS = create("bamboo_slabs");
		public static final TagKey<Item> BAMBOO_STAIRS = create("bamboo_stairs");
		public static final TagKey<Item> BAMBOO_WALLS = create("bamboo_walls");
		
		public static final TagKey<Item> CRIMSON_SLABS = create("crimson_slabs");
		public static final TagKey<Item> CRIMSON_STAIRS = create("crimson_stairs");
		public static final TagKey<Item> CRIMSON_WALLS = create("crimson_walls");
		
		public static final TagKey<Item> WARPED_SLABS = create("warped_slabs");
		public static final TagKey<Item> WARPED_STAIRS = create("warped_stairs");
		public static final TagKey<Item> WARPED_WALLS = create("warped_walls");
		
		public static final TagKey<Item> STONE = create("stone");
		public static final TagKey<Item> STONE_SLABS = create("stone_slabs");
		public static final TagKey<Item> STONE_STAIRS = create("stone_stairs");
		public static final TagKey<Item> STONE_WALLS = create("stone_walls");
		
		public static final TagKey<Item> STONE_BRICK_SLABS = create("stone_brick_slabs");
		public static final TagKey<Item> STONE_BRICK_STAIRS = create("stone_brick_stairs");
		public static final TagKey<Item> STONE_BRICK_WALLS = create("stone_brick_walls");
		
		public static final TagKey<Item> GRANITE = create("granite");
		public static final TagKey<Item> GRANITE_SLABS = create("granite_slabs");
		public static final TagKey<Item> GRANITE_STAIRS = create("granite_stairs");
		public static final TagKey<Item> GRANITE_WALLS = create("granite_walls");
		
		public static final TagKey<Item> DIORITE = create("diorite");
		public static final TagKey<Item> DIORITE_SLABS = create("diorite_slabs");
		public static final TagKey<Item> DIORITE_STAIRS = create("diorite_stairs");
		public static final TagKey<Item> DIORITE_WALLS = create("diorite_walls");
		
		public static final TagKey<Item> ANDESITE = create("andesite");
		public static final TagKey<Item> ANDESITE_SLABS = create("andesite_slabs");
		public static final TagKey<Item> ANDESITE_STAIRS = create("andesite_stairs");
		public static final TagKey<Item> ANDESITE_WALLS = create("andesite_walls");
		
		public static final TagKey<Item> DEEPSLATE = create("deepslate");
		public static final TagKey<Item> DEEPSLATE_SLABS = create("deepslate_slabs");
		public static final TagKey<Item> DEEPSLATE_STAIRS = create("deepslate_stairs");
		public static final TagKey<Item> DEEPSLATE_WALLS = create("deepslate_walls");
		
		public static final TagKey<Item> DEEPSLATE_BRICKS = create("deepslate_bricks");
		public static final TagKey<Item> DEEPSLATE_BRICK_SLABS = create("deepslate_brick_slabs");
		public static final TagKey<Item> DEEPSLATE_BRICK_STAIRS = create("deepslate_brick_stairs");
		public static final TagKey<Item> DEEPSLATE_BRICK_WALLS = create("deepslate_brick_walls");
		
		public static final TagKey<Item> DEEPSLATE_TILES = create("deepslate_tiles");
		public static final TagKey<Item> DEEPSLATE_TILE_SLABS = create("deepslate_tile_slabs");
		public static final TagKey<Item> DEEPSLATE_TILE_STAIRS = create("deepslate_tile_stairs");
		public static final TagKey<Item> DEEPSLATE_TILE_WALLS = create("deepslate_tile_walls");
		
		public static final TagKey<Item> TUFF = create("tuff");
		public static final TagKey<Item> TUFF_SLABS = create("tuff_slabs");
		public static final TagKey<Item> TUFF_STAIRS = create("tuff_stairs");
		public static final TagKey<Item> TUFF_WALLS = create("tuff_walls");
		
		public static final TagKey<Item> TUFF_BRICKS = create("tuff_bricks");
		public static final TagKey<Item> TUFF_BRICK_SLABS = create("tuff_brick_slabs");
		public static final TagKey<Item> TUFF_BRICK_STAIRS = create("tuff_brick_stairs");
		public static final TagKey<Item> TUFF_BRICK_WALLS = create("tuff_brick_walls");
		
		public static final TagKey<Item> SANDSTONE = create("sandstone");
		public static final TagKey<Item> SANDSTONE_SLABS = create("sandstone_slabs");
		public static final TagKey<Item> SANDSTONE_STAIRS = create("sandstone_stairs");
		public static final TagKey<Item> SANDSTONE_WALLS = create("sandstone_walls");
		
		public static final TagKey<Item> BEIGE_SANDSTONE = create("sandstone/beige");
		public static final TagKey<Item> BEIGE_SANDSTONE_SLABS = create("sandstone_slabs/beige");
		public static final TagKey<Item> BEIGE_SANDSTONE_STAIRS = create("sandstone_stairs/beige");
		public static final TagKey<Item> BEIGE_SANDSTONE_WALLS = create("sandstone_walls/beige");
		
		public static final TagKey<Item> RED_SANDSTONE = create("sandstone/red");
		public static final TagKey<Item> RED_SANDSTONE_SLABS = create("sandstone_slabs/red");
		public static final TagKey<Item> RED_SANDSTONE_STAIRS = create("sandstone_stairs/red");
		public static final TagKey<Item> RED_SANDSTONE_WALLS = create("sandstone_walls/red");
		
		public static final TagKey<Item> PRISMARINE = create("prismarine");
		public static final TagKey<Item> PRISMARINE_SLABS = create("prismarine_slabs");
		public static final TagKey<Item> PRISMARINE_STAIRS = create("prismarine_stairs");
		public static final TagKey<Item> PRISMARINE_WALLS = create("prismarine_walls");
		
		public static final TagKey<Item> NETHER_BRICK_BLOCKS = create("nether_brick_blocks");
		public static final TagKey<Item> NETHER_BRICK_SLABS = create("nether_brick_slabs");
		public static final TagKey<Item> NETHER_BRICK_STAIRS = create("nether_brick_stairs");
		public static final TagKey<Item> NETHER_BRICK_WALLS = create("nether_brick_walls");
		public static final TagKey<Item> NETHER_BRICK_FENCES = create("nether_brick_fences");
		public static final TagKey<Item> NETHER_BRICK_FENCE_GATES = create("nether_brick_fence_gates");
		public static final TagKey<Item> NETHER_BRICKS = create("nether_bricks");
		
		public static final TagKey<Item> BASALT = create("basalt");
		public static final TagKey<Item> BASALT_SLABS = create("basalt_slabs");
		public static final TagKey<Item> BASALT_STAIRS = create("basalt_stairs");
		public static final TagKey<Item> BASALT_WALLS = create("basalt_walls");
		
		public static final TagKey<Item> BLACKSTONE = create("blackstone");
		public static final TagKey<Item> BLACKSTONE_SLABS = create("blackstone_slabs");
		public static final TagKey<Item> BLACKSTONE_STAIRS = create("blackstone_stairs");
		public static final TagKey<Item> BLACKSTONE_WALLS = create("blackstone_walls");
		
		public static final TagKey<Item> BLACKSTONE_BRICKS = create("blackstone_bricks");
		public static final TagKey<Item> BLACKSTONE_BRICK_SLABS = create("blackstone_brick_slabs");
		public static final TagKey<Item> BLACKSTONE_BRICK_STAIRS = create("blackstone_brick_stairs");
		public static final TagKey<Item> BLACKSTONE_BRICK_WALLS = create("blackstone_brick_walls");
		
		public static final TagKey<Item> PURPUR_BLOCKS = create("purpur_blocks");
		public static final TagKey<Item> PURPUR_SLABS = create("purpur_slabs");
		public static final TagKey<Item> PURPUR_STAIRS = create("purpur_stairs");
		public static final TagKey<Item> PURPUR_WALLS = create("purpur_walls");
		
		public static final TagKey<Item> QUARTZ_BLOCKS = create("quartz_blocks");
		public static final TagKey<Item> QUARTZ_SLABS = create("quartz_slabs");
		public static final TagKey<Item> QUARTZ_STAIRS = create("quartz_stairs");
		public static final TagKey<Item> QUARTZ_WALLS = create("quartz_walls");
		
		public static final TagKey<Item> COPPER_BLOCKS = create("copper_blocks");
		public static final TagKey<Item> COPPER_SLABS = create("copper_slabs");
		public static final TagKey<Item> COPPER_STAIRS = create("copper_stairs");
		public static final TagKey<Item> COPPER_WALLS = create("copper_walls");
		public static final TagKey<Item> COPPER_FENCES = create("copper_fences");
		public static final TagKey<Item> COPPER_FENCE_GATES = create("copper_fence_gates");
		public static final TagKey<Item> COPPER_BARS = create("copper_bars");
		public static final TagKey<Item> COPPER_DOORS = create("copper_doors");
		public static final TagKey<Item> COPPER_TRAPDOORS = create("copper_trapdoors");
		public static final TagKey<Item> COPPER_PRESSURE_PLATES = create("copper_pressure_plates");
		public static final TagKey<Item> COPPER_BUTTONS = create("copper_buttons");
		public static final TagKey<Item> COPPER_CHAINS = create("copper_chains");
		public static final TagKey<Item> COPPER_BULBS = create("copper_bulbs");
		
		public static final TagKey<Item> UNWAXED_COPPER_BLOCKS = create("copper_blocks/unwaxed");
		public static final TagKey<Item> UNWAXED_COPPER_SLABS = create("copper_slabs/unwaxed");
		public static final TagKey<Item> UNWAXED_COPPER_STAIRS = create("copper_stairs/unwaxed");
		public static final TagKey<Item> UNWAXED_COPPER_WALLS = create("copper_walls/unwaxed");
		public static final TagKey<Item> UNWAXED_COPPER_FENCES = create("copper_fences/unwaxed");
		public static final TagKey<Item> UNWAXED_COPPER_FENCE_GATES = create("copper_fence_gates/unwaxed");
		public static final TagKey<Item> UNWAXED_COPPER_BARS = create("copper_bars/unwaxed");
		public static final TagKey<Item> UNWAXED_COPPER_DOORS = create("copper_doors/unwaxed");
		public static final TagKey<Item> UNWAXED_COPPER_TRAPDOORS = create("copper_trapdoors/unwaxed");
		public static final TagKey<Item> UNWAXED_COPPER_PRESSURE_PLATES = create("copper_pressure_plates/unwaxed");
		public static final TagKey<Item> UNWAXED_COPPER_BUTTONS = create("copper_buttons/unwaxed");
		public static final TagKey<Item> UNWAXED_COPPER_CHAINS = create("copper_chains/unwaxed");
		public static final TagKey<Item> UNWAXED_COPPER_BULBS = create("copper_bulbs/unwaxed");
		
		public static final TagKey<Item> WAXED_COPPER_BLOCKS = create("copper_blocks/waxed");
		public static final TagKey<Item> WAXED_COPPER_SLABS = create("copper_slabs/waxed");
		public static final TagKey<Item> WAXED_COPPER_STAIRS = create("copper_stairs/waxed");
		public static final TagKey<Item> WAXED_COPPER_WALLS = create("copper_walls/waxed");
		public static final TagKey<Item> WAXED_COPPER_FENCES = create("copper_fences/waxed");
		public static final TagKey<Item> WAXED_COPPER_FENCE_GATES = create("copper_fence_gates/waxed");
		public static final TagKey<Item> WAXED_COPPER_BARS = create("copper_bars/waxed");
		public static final TagKey<Item> WAXED_COPPER_DOORS = create("copper_doors/waxed");
		public static final TagKey<Item> WAXED_COPPER_TRAPDOORS = create("copper_trapdoors/waxed");
		public static final TagKey<Item> WAXED_COPPER_PRESSURE_PLATES = create("copper_pressure_plates/waxed");
		public static final TagKey<Item> WAXED_COPPER_BUTTONS = create("copper_buttons/waxed");
		public static final TagKey<Item> WAXED_COPPER_CHAINS = create("copper_chains/waxed");
		public static final TagKey<Item> WAXED_COPPER_BULBS = create("copper_bulbs/waxed");
		
		public static final TagKey<Item> WOOL_SLABS = create("wool_slabs");
		public static final TagKey<Item> WOOL_STAIRS = create("wool_stairs");
		public static final TagKey<Item> WOOL_WALLS = create("wool_walls");
		
		public static final TagKey<Item> TERRACOTTA_SLABS = create("terracotta_slabs");
		public static final TagKey<Item> TERRACOTTA_STAIRS = create("terracotta_stairs");
		public static final TagKey<Item> TERRACOTTA_WALLS = create("terracotta_walls");
		
		public static final TagKey<Item> CONCRETE_SLABS = create("concrete_slabs");
		public static final TagKey<Item> CONCRETE_STAIRS = create("concrete_stairs");
		public static final TagKey<Item> CONCRETE_WALLS = create("concrete_walls");
		
		public static final TagKey<Item> GLASS_SLABS = create("glass_slabs");
		public static final TagKey<Item> GLASS_STAIRS = create("glass_stairs");
		public static final TagKey<Item> GLASS_WALLS = create("glass_walls");
		
		public static final TagKey<Item> DIRT_SLABS = create("dirt_slabs");
		public static final TagKey<Item> DIRT_STAIRS = create("dirt_stairs");
		public static final TagKey<Item> DIRT_WALLS = create("dirt_walls");
		
		public static final TagKey<Item> ICE_SLABS = create("ice_slabs");
		public static final TagKey<Item> ICE_STAIRS = create("ice_stairs");
		public static final TagKey<Item> ICE_WALLS = create("ice_walls");
		
		public static final TagKey<Item> OBSIDIAN = create("obsidian");
		public static final TagKey<Item> OBSIDIAN_SLABS = create("obsidian_slabs");
		public static final TagKey<Item> OBSIDIAN_STAIRS = create("obsidian_stairs");
		public static final TagKey<Item> OBSIDIAN_WALLS = create("obsidian_walls");
		
		public static final TagKey<Item> NYLIUM_SLABS = create("nylium_slabs");
		public static final TagKey<Item> NYLIUM_STAIRS = create("nylium_stairs");
		public static final TagKey<Item> NYLIUM_WALLS = create("nylium_walls");
		
		public static final TagKey<Item> COAL_ORE_SLABS = create("coal_ore_slabs");
		public static final TagKey<Item> COAL_ORE_STAIRS = create("coal_ore_stairs");
		public static final TagKey<Item> COAL_ORE_WALLS = create("coal_ore_walls");
		
		public static final TagKey<Item> IRON_ORE_SLABS = create("iron_ore_slabs");
		public static final TagKey<Item> IRON_ORE_STAIRS = create("iron_ore_stairs");
		public static final TagKey<Item> IRON_ORE_WALLS = create("iron_ore_walls");
		
		public static final TagKey<Item> COPPER_ORE_SLABS = create("copper_ore_slabs");
		public static final TagKey<Item> COPPER_ORE_STAIRS = create("copper_ore_stairs");
		public static final TagKey<Item> COPPER_ORE_WALLS = create("copper_ore_walls");
		
		public static final TagKey<Item> GOLD_ORE_SLABS = create("gold_ore_slabs");
		public static final TagKey<Item> GOLD_ORE_STAIRS = create("gold_ore_stairs");
		public static final TagKey<Item> GOLD_ORE_WALLS = create("gold_ore_walls");
		
		public static final TagKey<Item> REDSTONE_ORE_SLABS = create("redstone_ore_slabs");
		public static final TagKey<Item> REDSTONE_ORE_STAIRS = create("redstone_ore_stairs");
		public static final TagKey<Item> REDSTONE_ORE_WALLS = create("redstone_ore_walls");
		
		public static final TagKey<Item> EMERALD_ORE_SLABS = create("emerald_ore_slabs");
		public static final TagKey<Item> EMERALD_ORE_STAIRS = create("emerald_ore_stairs");
		public static final TagKey<Item> EMERALD_ORE_WALLS = create("emerald_ore_walls");
		
		public static final TagKey<Item> LAPIS_ORE_SLABS = create("lapis_ore_slabs");
		public static final TagKey<Item> LAPIS_ORE_STAIRS = create("lapis_ore_stairs");
		public static final TagKey<Item> LAPIS_ORE_WALLS = create("lapis_ore_walls");
		
		public static final TagKey<Item> DIAMOND_ORE_SLABS = create("diamond_ore_slabs");
		public static final TagKey<Item> DIAMOND_ORE_STAIRS = create("diamond_ore_stairs");
		public static final TagKey<Item> DIAMOND_ORE_WALLS = create("diamond_ore_walls");
		
		public static final TagKey<Item> QUARTZ_ORES = create("quartz_ores");
		public static final TagKey<Item> QUARTZ_ORE_SLABS = create("quartz_ore_slabs");
		public static final TagKey<Item> QUARTZ_ORE_STAIRS = create("quartz_ore_stairs");
		public static final TagKey<Item> QUARTZ_ORE_WALLS = create("quartz_ore_walls");
		
		public static final TagKey<Item> MUSHROOM_BLOCKS = create("mushroom_blocks");
		public static final TagKey<Item> MUSHROOM_SLABS = create("mushroom_slabs");
		public static final TagKey<Item> MUSHROOM_STAIRS = create("mushroom_stairs");
		public static final TagKey<Item> MUSHROOM_WALLS = create("mushroom_walls");
		
		public static final TagKey<Item> WART_BLOCKS = create("wart_blocks");
		public static final TagKey<Item> WART_SLABS = create("wart_slabs");
		public static final TagKey<Item> WART_STAIRS = create("wart_stairs");
		public static final TagKey<Item> WART_WALLS = create("wart_walls");
		
		public static final TagKey<Item> CORAL_SLABS = create("coral_slabs");
		public static final TagKey<Item> CORAL_STAIRS = create("coral_stairs");
		public static final TagKey<Item> CORAL_WALLS = create("coral_walls");
		public static final TagKey<Item> DEAD_CORAL_SLABS = create("dead_coral_slabs");
		public static final TagKey<Item> DEAD_CORAL_STAIRS = create("dead_coral_stairs");
		public static final TagKey<Item> DEAD_CORAL_WALLS = create("dead_coral_walls");
		
		public static final TagKey<Item> FROGLIGHTS = create("froglights");
		public static final TagKey<Item> FROGLIGHT_SLABS = create("froglight_slabs");
		public static final TagKey<Item> FROGLIGHT_STAIRS = create("froglight_stairs");
		public static final TagKey<Item> FROGLIGHT_WALLS = create("froglight_walls");
		
		public static final TagKey<Item> COPPER_LADDERS = create("copper_ladders");
		public static final TagKey<Item> UNWAXED_COPPER_LADDERS = create("unwaxed_copper_ladders");
		public static final TagKey<Item> WAXED_COPPER_LADDERS = create("waxed_copper_ladders");
		
		public static final TagKey<Item> ALL_COPPER_SIGNS = create("all_copper_signs");
		public static final TagKey<Item> COPPER_SIGNS = create("copper_signs");
		public static final TagKey<Item> COPPER_HANGING_SIGNS = create("copper_hanging_signs");
		public static final TagKey<Item> ALL_UNWAXED_COPPER_SIGNS = create("all_unwaxed_copper_signs");
		public static final TagKey<Item> UNWAXED_COPPER_SIGNS = create("unwaxed_copper_signs");
		public static final TagKey<Item> UNWAXED_COPPER_HANGING_SIGNS = create("unwaxed_copper_hanging_signs");
		public static final TagKey<Item> ALL_WAXED_COPPER_SIGNS = create("all_waxed_copper_signs");
		public static final TagKey<Item> WAXED_COPPER_SIGNS = create("waxed_copper_signs");
		public static final TagKey<Item> WAXED_COPPER_HANGING_SIGNS = create("waxed_copper_hanging_signs");
		
		public static final TagKey<Item> COPPER_CAULDRONS = create("copper_cauldrons");
		public static final TagKey<Item> UNWAXED_COPPER_CAULDRONS = create("unwaxed_copper_cauldrons");
		public static final TagKey<Item> WAXED_COPPER_CAULDRONS = create("waxed_copper_cauldrons");
		
		public static final TagKey<Item> LANTERNS = create("lanterns");
		public static final TagKey<Item> NORMAL_LANTERNS = create("normal_lanterns");
		public static final TagKey<Item> SOUL_LANTERNS = create("soul_lanterns");
		public static final TagKey<Item> COPPER_LANTERNS = create("copper_lanterns");
		public static final TagKey<Item> UNWAXED_COPPER_LANTERNS = create("unwaxed_copper_lanterns");
		public static final TagKey<Item> WAXED_COPPER_LANTERNS = create("waxed_copper_lanterns");
		public static final TagKey<Item> COPPER_NORMAL_LANTERNS = create("copper_normal_lanterns");
		public static final TagKey<Item> UNWAXED_COPPER_NORMAL_LANTERNS = create("unwaxed_copper_normal_lanterns");
		public static final TagKey<Item> WAXED_COPPER_NORMAL_LANTERNS = create("waxed_copper_normal_lanterns");
		public static final TagKey<Item> COPPER_SOUL_LANTERNS = create("copper_soul_lanterns");
		public static final TagKey<Item> UNWAXED_COPPER_SOUL_LANTERNS = create("unwaxed_copper_soul_lanterns");
		public static final TagKey<Item> WAXED_COPPER_SOUL_LANTERNS = create("waxed_copper_soul_lanterns");
		
		public static final TagKey<Item> COPPER_NUGGETS = createConventional("nuggets/copper");
		public static final TagKey<Item> NETHERITE_NUGGETS = createConventional("nuggets/netherite");
		
		public static TagKey<Item> create(String name) {
			return SSWPTags.create(RegistryKeys.ITEM, name);
		}
		
		public static TagKey<Item> createConventional(String name) {
			return SSWPTags.createConventional(RegistryKeys.ITEM, name);
		}
	}
}