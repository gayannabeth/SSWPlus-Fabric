package gay.mountainspring.sswplus.item;

import gay.mountainspring.sswplus.SSWPlus;
import gay.mountainspring.sswplus.block.SSWPBlocks;
import gay.mountainspring.sswplus.tag.SSWPTags;
import net.fabricmc.fabric.api.registry.CompostingChanceRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.HangingSignItem;
import net.minecraft.item.Item;
import net.minecraft.item.SignItem;
import net.minecraft.item.TallBlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class SSWPItems {
	private SSWPItems() {}
	
	public static void init() {
		compostableItems();
		fuel();
	}
	
	public static final Item OAK_LOG_SLAB = registerBlock(SSWPBlocks.OAK_LOG_SLAB);
	public static final Item OAK_LOG_STAIRS = registerBlock(SSWPBlocks.OAK_LOG_STAIRS);
	public static final Item OAK_LOG_WALL = registerBlock(SSWPBlocks.OAK_LOG_WALL);
	public static final Item OAK_WOOD_SLAB = registerBlock(SSWPBlocks.OAK_WOOD_SLAB);
	public static final Item OAK_WOOD_STAIRS = registerBlock(SSWPBlocks.OAK_WOOD_STAIRS);
	public static final Item OAK_WOOD_WALL = registerBlock(SSWPBlocks.OAK_WOOD_WALL);
	public static final Item STRIPPED_OAK_LOG_SLAB = registerBlock(SSWPBlocks.STRIPPED_OAK_LOG_SLAB);
	public static final Item STRIPPED_OAK_LOG_STAIRS = registerBlock(SSWPBlocks.STRIPPED_OAK_LOG_STAIRS);
	public static final Item STRIPPED_OAK_LOG_WALL = registerBlock(SSWPBlocks.STRIPPED_OAK_LOG_WALL);
	public static final Item STRIPPED_OAK_WOOD_SLAB = registerBlock(SSWPBlocks.STRIPPED_OAK_WOOD_SLAB);
	public static final Item STRIPPED_OAK_WOOD_STAIRS = registerBlock(SSWPBlocks.STRIPPED_OAK_WOOD_STAIRS);
	public static final Item STRIPPED_OAK_WOOD_WALL = registerBlock(SSWPBlocks.STRIPPED_OAK_WOOD_WALL);
	
	public static final Item SPRUCE_LOG_SLAB = registerBlock(SSWPBlocks.SPRUCE_LOG_SLAB);
	public static final Item SPRUCE_LOG_STAIRS = registerBlock(SSWPBlocks.SPRUCE_LOG_STAIRS);
	public static final Item SPRUCE_LOG_WALL = registerBlock(SSWPBlocks.SPRUCE_LOG_WALL);
	public static final Item SPRUCE_WOOD_SLAB = registerBlock(SSWPBlocks.SPRUCE_WOOD_SLAB);
	public static final Item SPRUCE_WOOD_STAIRS = registerBlock(SSWPBlocks.SPRUCE_WOOD_STAIRS);
	public static final Item SPRUCE_WOOD_WALL = registerBlock(SSWPBlocks.SPRUCE_WOOD_WALL);
	public static final Item STRIPPED_SPRUCE_LOG_SLAB = registerBlock(SSWPBlocks.STRIPPED_SPRUCE_LOG_SLAB);
	public static final Item STRIPPED_SPRUCE_LOG_STAIRS = registerBlock(SSWPBlocks.STRIPPED_SPRUCE_LOG_STAIRS);
	public static final Item STRIPPED_SPRUCE_LOG_WALL = registerBlock(SSWPBlocks.STRIPPED_SPRUCE_LOG_WALL);
	public static final Item STRIPPED_SPRUCE_WOOD_SLAB = registerBlock(SSWPBlocks.STRIPPED_SPRUCE_WOOD_SLAB);
	public static final Item STRIPPED_SPRUCE_WOOD_STAIRS = registerBlock(SSWPBlocks.STRIPPED_SPRUCE_WOOD_STAIRS);
	public static final Item STRIPPED_SPRUCE_WOOD_WALL = registerBlock(SSWPBlocks.STRIPPED_SPRUCE_WOOD_WALL);
	
	public static final Item BIRCH_LOG_SLAB = registerBlock(SSWPBlocks.BIRCH_LOG_SLAB);
	public static final Item BIRCH_LOG_STAIRS = registerBlock(SSWPBlocks.BIRCH_LOG_STAIRS);
	public static final Item BIRCH_LOG_WALL = registerBlock(SSWPBlocks.BIRCH_LOG_WALL);
	public static final Item BIRCH_WOOD_SLAB = registerBlock(SSWPBlocks.BIRCH_WOOD_SLAB);
	public static final Item BIRCH_WOOD_STAIRS = registerBlock(SSWPBlocks.BIRCH_WOOD_STAIRS);
	public static final Item BIRCH_WOOD_WALL = registerBlock(SSWPBlocks.BIRCH_WOOD_WALL);
	public static final Item STRIPPED_BIRCH_LOG_SLAB = registerBlock(SSWPBlocks.STRIPPED_BIRCH_LOG_SLAB);
	public static final Item STRIPPED_BIRCH_LOG_STAIRS = registerBlock(SSWPBlocks.STRIPPED_BIRCH_LOG_STAIRS);
	public static final Item STRIPPED_BIRCH_LOG_WALL = registerBlock(SSWPBlocks.STRIPPED_BIRCH_LOG_WALL);
	public static final Item STRIPPED_BIRCH_WOOD_SLAB = registerBlock(SSWPBlocks.STRIPPED_BIRCH_WOOD_SLAB);
	public static final Item STRIPPED_BIRCH_WOOD_STAIRS = registerBlock(SSWPBlocks.STRIPPED_BIRCH_WOOD_STAIRS);
	public static final Item STRIPPED_BIRCH_WOOD_WALL = registerBlock(SSWPBlocks.STRIPPED_BIRCH_WOOD_WALL);
	
	public static final Item JUNGLE_LOG_SLAB = registerBlock(SSWPBlocks.JUNGLE_LOG_SLAB);
	public static final Item JUNGLE_LOG_STAIRS = registerBlock(SSWPBlocks.JUNGLE_LOG_STAIRS);
	public static final Item JUNGLE_LOG_WALL = registerBlock(SSWPBlocks.JUNGLE_LOG_WALL);
	public static final Item JUNGLE_WOOD_SLAB = registerBlock(SSWPBlocks.JUNGLE_WOOD_SLAB);
	public static final Item JUNGLE_WOOD_STAIRS = registerBlock(SSWPBlocks.JUNGLE_WOOD_STAIRS);
	public static final Item JUNGLE_WOOD_WALL = registerBlock(SSWPBlocks.JUNGLE_WOOD_WALL);
	public static final Item STRIPPED_JUNGLE_LOG_SLAB = registerBlock(SSWPBlocks.STRIPPED_JUNGLE_LOG_SLAB);
	public static final Item STRIPPED_JUNGLE_LOG_STAIRS = registerBlock(SSWPBlocks.STRIPPED_JUNGLE_LOG_STAIRS);
	public static final Item STRIPPED_JUNGLE_LOG_WALL = registerBlock(SSWPBlocks.STRIPPED_JUNGLE_LOG_WALL);
	public static final Item STRIPPED_JUNGLE_WOOD_SLAB = registerBlock(SSWPBlocks.STRIPPED_JUNGLE_WOOD_SLAB);
	public static final Item STRIPPED_JUNGLE_WOOD_STAIRS = registerBlock(SSWPBlocks.STRIPPED_JUNGLE_WOOD_STAIRS);
	public static final Item STRIPPED_JUNGLE_WOOD_WALL = registerBlock(SSWPBlocks.STRIPPED_JUNGLE_WOOD_WALL);
	
	public static final Item ACACIA_LOG_SLAB = registerBlock(SSWPBlocks.ACACIA_LOG_SLAB);
	public static final Item ACACIA_LOG_STAIRS = registerBlock(SSWPBlocks.ACACIA_LOG_STAIRS);
	public static final Item ACACIA_LOG_WALL = registerBlock(SSWPBlocks.ACACIA_LOG_WALL);
	public static final Item ACACIA_WOOD_SLAB = registerBlock(SSWPBlocks.ACACIA_WOOD_SLAB);
	public static final Item ACACIA_WOOD_STAIRS = registerBlock(SSWPBlocks.ACACIA_WOOD_STAIRS);
	public static final Item ACACIA_WOOD_WALL = registerBlock(SSWPBlocks.ACACIA_WOOD_WALL);
	public static final Item STRIPPED_ACACIA_LOG_SLAB = registerBlock(SSWPBlocks.STRIPPED_ACACIA_LOG_SLAB);
	public static final Item STRIPPED_ACACIA_LOG_STAIRS = registerBlock(SSWPBlocks.STRIPPED_ACACIA_LOG_STAIRS);
	public static final Item STRIPPED_ACACIA_LOG_WALL = registerBlock(SSWPBlocks.STRIPPED_ACACIA_LOG_WALL);
	public static final Item STRIPPED_ACACIA_WOOD_SLAB = registerBlock(SSWPBlocks.STRIPPED_ACACIA_WOOD_SLAB);
	public static final Item STRIPPED_ACACIA_WOOD_STAIRS = registerBlock(SSWPBlocks.STRIPPED_ACACIA_WOOD_STAIRS);
	public static final Item STRIPPED_ACACIA_WOOD_WALL = registerBlock(SSWPBlocks.STRIPPED_ACACIA_WOOD_WALL);
	
	public static final Item DARK_OAK_LOG_SLAB = registerBlock(SSWPBlocks.DARK_OAK_LOG_SLAB);
	public static final Item DARK_OAK_LOG_STAIRS = registerBlock(SSWPBlocks.DARK_OAK_LOG_STAIRS);
	public static final Item DARK_OAK_LOG_WALL = registerBlock(SSWPBlocks.DARK_OAK_LOG_WALL);
	public static final Item DARK_OAK_WOOD_SLAB = registerBlock(SSWPBlocks.DARK_OAK_WOOD_SLAB);
	public static final Item DARK_OAK_WOOD_STAIRS = registerBlock(SSWPBlocks.DARK_OAK_WOOD_STAIRS);
	public static final Item DARK_OAK_WOOD_WALL = registerBlock(SSWPBlocks.DARK_OAK_WOOD_WALL);
	public static final Item STRIPPED_DARK_OAK_LOG_SLAB = registerBlock(SSWPBlocks.STRIPPED_DARK_OAK_LOG_SLAB);
	public static final Item STRIPPED_DARK_OAK_LOG_STAIRS = registerBlock(SSWPBlocks.STRIPPED_DARK_OAK_LOG_STAIRS);
	public static final Item STRIPPED_DARK_OAK_LOG_WALL = registerBlock(SSWPBlocks.STRIPPED_DARK_OAK_LOG_WALL);
	public static final Item STRIPPED_DARK_OAK_WOOD_SLAB = registerBlock(SSWPBlocks.STRIPPED_DARK_OAK_WOOD_SLAB);
	public static final Item STRIPPED_DARK_OAK_WOOD_STAIRS = registerBlock(SSWPBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS);
	public static final Item STRIPPED_DARK_OAK_WOOD_WALL = registerBlock(SSWPBlocks.STRIPPED_DARK_OAK_WOOD_WALL);
	
	public static final Item MANGROVE_LOG_SLAB = registerBlock(SSWPBlocks.MANGROVE_LOG_SLAB);
	public static final Item MANGROVE_LOG_STAIRS = registerBlock(SSWPBlocks.MANGROVE_LOG_STAIRS);
	public static final Item MANGROVE_LOG_WALL = registerBlock(SSWPBlocks.MANGROVE_LOG_WALL);
	public static final Item MANGROVE_WOOD_SLAB = registerBlock(SSWPBlocks.MANGROVE_WOOD_SLAB);
	public static final Item MANGROVE_WOOD_STAIRS = registerBlock(SSWPBlocks.MANGROVE_WOOD_STAIRS);
	public static final Item MANGROVE_WOOD_WALL = registerBlock(SSWPBlocks.MANGROVE_WOOD_WALL);
	public static final Item STRIPPED_MANGROVE_LOG_SLAB = registerBlock(SSWPBlocks.STRIPPED_MANGROVE_LOG_SLAB);
	public static final Item STRIPPED_MANGROVE_LOG_STAIRS = registerBlock(SSWPBlocks.STRIPPED_MANGROVE_LOG_STAIRS);
	public static final Item STRIPPED_MANGROVE_LOG_WALL = registerBlock(SSWPBlocks.STRIPPED_MANGROVE_LOG_WALL);
	public static final Item STRIPPED_MANGROVE_WOOD_SLAB = registerBlock(SSWPBlocks.STRIPPED_MANGROVE_WOOD_SLAB);
	public static final Item STRIPPED_MANGROVE_WOOD_STAIRS = registerBlock(SSWPBlocks.STRIPPED_MANGROVE_WOOD_STAIRS);
	public static final Item STRIPPED_MANGROVE_WOOD_WALL = registerBlock(SSWPBlocks.STRIPPED_MANGROVE_WOOD_WALL);
	
	public static final Item CHERRY_LOG_SLAB = registerBlock(SSWPBlocks.CHERRY_LOG_SLAB);
	public static final Item CHERRY_LOG_STAIRS = registerBlock(SSWPBlocks.CHERRY_LOG_STAIRS);
	public static final Item CHERRY_LOG_WALL = registerBlock(SSWPBlocks.CHERRY_LOG_WALL);
	public static final Item CHERRY_WOOD_SLAB = registerBlock(SSWPBlocks.CHERRY_WOOD_SLAB);
	public static final Item CHERRY_WOOD_STAIRS = registerBlock(SSWPBlocks.CHERRY_WOOD_STAIRS);
	public static final Item CHERRY_WOOD_WALL = registerBlock(SSWPBlocks.CHERRY_WOOD_WALL);
	public static final Item STRIPPED_CHERRY_LOG_SLAB = registerBlock(SSWPBlocks.STRIPPED_CHERRY_LOG_SLAB);
	public static final Item STRIPPED_CHERRY_LOG_STAIRS = registerBlock(SSWPBlocks.STRIPPED_CHERRY_LOG_STAIRS);
	public static final Item STRIPPED_CHERRY_LOG_WALL = registerBlock(SSWPBlocks.STRIPPED_CHERRY_LOG_WALL);
	public static final Item STRIPPED_CHERRY_WOOD_SLAB = registerBlock(SSWPBlocks.STRIPPED_CHERRY_WOOD_SLAB);
	public static final Item STRIPPED_CHERRY_WOOD_STAIRS = registerBlock(SSWPBlocks.STRIPPED_CHERRY_WOOD_STAIRS);
	public static final Item STRIPPED_CHERRY_WOOD_WALL = registerBlock(SSWPBlocks.STRIPPED_CHERRY_WOOD_WALL);
	
	public static final Item BAMBOO_BLOCK_SLAB = registerBlock(SSWPBlocks.BAMBOO_BLOCK_SLAB);
	public static final Item BAMBOO_BLOCK_STAIRS = registerBlock(SSWPBlocks.BAMBOO_BLOCK_STAIRS);
	public static final Item BAMBOO_BLOCK_WALL = registerBlock(SSWPBlocks.BAMBOO_BLOCK_WALL);
	public static final Item STRIPPED_BAMBOO_BLOCK_SLAB = registerBlock(SSWPBlocks.STRIPPED_BAMBOO_BLOCK_SLAB);
	public static final Item STRIPPED_BAMBOO_BLOCK_STAIRS = registerBlock(SSWPBlocks.STRIPPED_BAMBOO_BLOCK_STAIRS);
	public static final Item STRIPPED_BAMBOO_BLOCK_WALL = registerBlock(SSWPBlocks.STRIPPED_BAMBOO_BLOCK_WALL);
	
	public static final Item CRIMSON_STEM_SLAB = registerBlock(SSWPBlocks.CRIMSON_STEM_SLAB);
	public static final Item CRIMSON_STEM_STAIRS = registerBlock(SSWPBlocks.CRIMSON_STEM_STAIRS);
	public static final Item CRIMSON_STEM_WALL = registerBlock(SSWPBlocks.CRIMSON_STEM_WALL);
	public static final Item CRIMSON_HYPHAE_SLAB = registerBlock(SSWPBlocks.CRIMSON_HYPHAE_SLAB);
	public static final Item CRIMSON_HYPHAE_STAIRS = registerBlock(SSWPBlocks.CRIMSON_HYPHAE_STAIRS);
	public static final Item CRIMSON_HYPHAE_WALL = registerBlock(SSWPBlocks.CRIMSON_HYPHAE_WALL);
	public static final Item STRIPPED_CRIMSON_STEM_SLAB = registerBlock(SSWPBlocks.STRIPPED_CRIMSON_STEM_SLAB);
	public static final Item STRIPPED_CRIMSON_STEM_STAIRS = registerBlock(SSWPBlocks.STRIPPED_CRIMSON_STEM_STAIRS);
	public static final Item STRIPPED_CRIMSON_STEM_WALL = registerBlock(SSWPBlocks.STRIPPED_CRIMSON_STEM_WALL);
	public static final Item STRIPPED_CRIMSON_HYPHAE_SLAB = registerBlock(SSWPBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB);
	public static final Item STRIPPED_CRIMSON_HYPHAE_STAIRS = registerBlock(SSWPBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS);
	public static final Item STRIPPED_CRIMSON_HYPHAE_WALL = registerBlock(SSWPBlocks.STRIPPED_CRIMSON_HYPHAE_WALL);
	
	public static final Item WARPED_STEM_SLAB = registerBlock(SSWPBlocks.WARPED_STEM_SLAB);
	public static final Item WARPED_STEM_STAIRS = registerBlock(SSWPBlocks.WARPED_STEM_STAIRS);
	public static final Item WARPED_STEM_WALL = registerBlock(SSWPBlocks.WARPED_STEM_WALL);
	public static final Item WARPED_HYPHAE_SLAB = registerBlock(SSWPBlocks.WARPED_HYPHAE_SLAB);
	public static final Item WARPED_HYPHAE_STAIRS = registerBlock(SSWPBlocks.WARPED_HYPHAE_STAIRS);
	public static final Item WARPED_HYPHAE_WALL = registerBlock(SSWPBlocks.WARPED_HYPHAE_WALL);
	public static final Item STRIPPED_WARPED_STEM_SLAB = registerBlock(SSWPBlocks.STRIPPED_WARPED_STEM_SLAB);
	public static final Item STRIPPED_WARPED_STEM_STAIRS = registerBlock(SSWPBlocks.STRIPPED_WARPED_STEM_STAIRS);
	public static final Item STRIPPED_WARPED_STEM_WALL = registerBlock(SSWPBlocks.STRIPPED_WARPED_STEM_WALL);
	public static final Item STRIPPED_WARPED_HYPHAE_SLAB = registerBlock(SSWPBlocks.STRIPPED_WARPED_HYPHAE_SLAB);
	public static final Item STRIPPED_WARPED_HYPHAE_STAIRS = registerBlock(SSWPBlocks.STRIPPED_WARPED_HYPHAE_STAIRS);
	public static final Item STRIPPED_WARPED_HYPHAE_WALL = registerBlock(SSWPBlocks.STRIPPED_WARPED_HYPHAE_WALL);
	
	public static final Item STONE_WALL = registerBlock(SSWPBlocks.STONE_WALL);
	
	public static final Item SMOOTH_STONE_STAIRS = registerBlock(SSWPBlocks.SMOOTH_STONE_STAIRS);
	public static final Item SMOOTH_STONE_WALL = registerBlock(SSWPBlocks.SMOOTH_STONE_WALL);
	
	public static final Item CRACKED_STONE_BRICK_SLAB = registerBlock(SSWPBlocks.CRACKED_STONE_BRICK_SLAB);
	public static final Item CRACKED_STONE_BRICK_STAIRS = registerBlock(SSWPBlocks.CRACKED_STONE_BRICK_STAIRS);
	public static final Item CRACKED_STONE_BRICK_WALL = registerBlock(SSWPBlocks.CRACKED_STONE_BRICK_WALL);
	public static final Item CHISELED_STONE_BRICK_SLAB = registerBlock(SSWPBlocks.CHISELED_STONE_BRICK_SLAB);
	public static final Item CHISELED_STONE_BRICK_STAIRS = registerBlock(SSWPBlocks.CHISELED_STONE_BRICK_STAIRS);
	public static final Item CHISELED_STONE_BRICK_WALL = registerBlock(SSWPBlocks.CHISELED_STONE_BRICK_WALL);
	
	public static final Item POLISHED_GRANITE_WALL = registerBlock(SSWPBlocks.POLISHED_GRANITE_WALL);
	
	public static final Item POLISHED_DIORITE_WALL = registerBlock(SSWPBlocks.POLISHED_DIORITE_WALL);
	
	public static final Item POLISHED_ANDESITE_WALL = registerBlock(SSWPBlocks.POLISHED_ANDESITE_WALL);
	
	public static final Item DEEPSLATE_SLAB = registerBlock(SSWPBlocks.DEEPSLATE_SLAB);
	public static final Item DEEPSLATE_STAIRS = registerBlock(SSWPBlocks.DEEPSLATE_STAIRS);
	public static final Item DEEPSLATE_WALL = registerBlock(SSWPBlocks.DEEPSLATE_WALL);
	public static final Item CHISELED_DEEPSLATE_SLAB = registerBlock(SSWPBlocks.CHISELED_DEEPSLATE_SLAB);
	public static final Item CHISELED_DEEPSLATE_STAIRS = registerBlock(SSWPBlocks.CHISELED_DEEPSLATE_STAIRS);
	public static final Item CHISELED_DEEPSLATE_WALL = registerBlock(SSWPBlocks.CHISELED_DEEPSLATE_WALL);
	public static final Item CRACKED_DEEPSLATE_BRICK_SLAB = registerBlock(SSWPBlocks.CRACKED_DEEPSLATE_BRICK_SLAB);
	public static final Item CRACKED_DEEPSLATE_BRICK_STAIRS = registerBlock(SSWPBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS);
	public static final Item CRACKED_DEEPSLATE_BRICK_WALL = registerBlock(SSWPBlocks.CRACKED_DEEPSLATE_BRICK_WALL);
	public static final Item CRACKED_DEEPSLATE_TILE_SLAB = registerBlock(SSWPBlocks.CRACKED_DEEPSLATE_TILE_SLAB);
	public static final Item CRACKED_DEEPSLATE_TILE_STAIRS = registerBlock(SSWPBlocks.CRACKED_DEEPSLATE_TILE_STAIRS);
	public static final Item CRACKED_DEEPSLATE_TILE_WALL = registerBlock(SSWPBlocks.CRACKED_DEEPSLATE_TILE_WALL);
	
	public static final Item CHISELED_TUFF_SLAB = registerBlock(SSWPBlocks.CHISELED_TUFF_SLAB);
	public static final Item CHISELED_TUFF_STAIRS = registerBlock(SSWPBlocks.CHISELED_TUFF_STAIRS);
	public static final Item CHISELED_TUFF_WALL = registerBlock(SSWPBlocks.CHISELED_TUFF_WALL);
	public static final Item CHISELED_TUFF_BRICK_SLAB = registerBlock(SSWPBlocks.CHISELED_TUFF_BRICK_SLAB);
	public static final Item CHISELED_TUFF_BRICK_STAIRS = registerBlock(SSWPBlocks.CHISELED_TUFF_BRICK_STAIRS);
	public static final Item CHISELED_TUFF_BRICK_WALL = registerBlock(SSWPBlocks.CHISELED_TUFF_BRICK_WALL);
	
	public static final Item PACKED_MUD_SLAB = registerBlock(SSWPBlocks.PACKED_MUD_SLAB);
	public static final Item PACKED_MUD_STAIRS = registerBlock(SSWPBlocks.PACKED_MUD_STAIRS);
	public static final Item PACKED_MUD_WALL = registerBlock(SSWPBlocks.PACKED_MUD_WALL);
	
	public static final Item CHISELED_SANDSTONE_SLAB = registerBlock(SSWPBlocks.CHISELED_SANDSTONE_SLAB);
	public static final Item CHISELED_SANDSTONE_STAIRS = registerBlock(SSWPBlocks.CHISELED_SANDSTONE_STAIRS);
	public static final Item CHISELED_SANDSTONE_WALL = registerBlock(SSWPBlocks.CHISELED_SANDSTONE_WALL);
	public static final Item SMOOTH_SANDSTONE_WALL = registerBlock(SSWPBlocks.SMOOTH_SANDSTONE_WALL);
	public static final Item CUT_SANDSTONE_STAIRS = registerBlock(SSWPBlocks.CUT_SANDSTONE_STAIRS);
	public static final Item CUT_SANDSTONE_WALL = registerBlock(SSWPBlocks.CUT_SANDSTONE_WALL);
	
	public static final Item CHISELED_RED_SANDSTONE_SLAB = registerBlock(SSWPBlocks.CHISELED_RED_SANDSTONE_SLAB);
	public static final Item CHISELED_RED_SANDSTONE_STAIRS = registerBlock(SSWPBlocks.CHISELED_RED_SANDSTONE_STAIRS);
	public static final Item CHISELED_RED_SANDSTONE_WALL = registerBlock(SSWPBlocks.CHISELED_RED_SANDSTONE_WALL);
	public static final Item SMOOTH_RED_SANDSTONE_WALL = registerBlock(SSWPBlocks.SMOOTH_RED_SANDSTONE_WALL);
	public static final Item CUT_RED_SANDSTONE_STAIRS = registerBlock(SSWPBlocks.CUT_RED_SANDSTONE_STAIRS);
	public static final Item CUT_RED_SANDSTONE_WALL = registerBlock(SSWPBlocks.CUT_RED_SANDSTONE_WALL);
	
	public static final Item SEA_LANTERN_SLAB = registerBlock(SSWPBlocks.SEA_LANTERN_SLAB);
	public static final Item SEA_LANTERN_STAIRS = registerBlock(SSWPBlocks.SEA_LANTERN_STAIRS);
	public static final Item SEA_LANTERN_WALL = registerBlock(SSWPBlocks.SEA_LANTERN_WALL);
	
	public static final Item PRISMARINE_BRICK_WALL = registerBlock(SSWPBlocks.PRISMARINE_BRICK_WALL);
	public static final Item DARK_PRISMARINE_WALL = registerBlock(SSWPBlocks.DARK_PRISMARINE_WALL);
	
	public static final Item NETHERRACK_SLAB = registerBlock(SSWPBlocks.NETHERRACK_SLAB);
	public static final Item NETHERRACK_STAIRS = registerBlock(SSWPBlocks.NETHERRACK_STAIRS);
	public static final Item NETHERRACK_WALL = registerBlock(SSWPBlocks.NETHERRACK_WALL);
	
	public static final Item NETHER_BRICK_FENCE_GATE = registerBlock(SSWPBlocks.NETHER_BRICK_FENCE_GATE);
	public static final Item CRACKED_NETHER_BRICK_SLAB = registerBlock(SSWPBlocks.CRACKED_NETHER_BRICK_SLAB);
	public static final Item CRACKED_NETHER_BRICK_STAIRS = registerBlock(SSWPBlocks.CRACKED_NETHER_BRICK_STAIRS);
	public static final Item CRACKED_NETHER_BRICK_WALL = registerBlock(SSWPBlocks.CRACKED_NETHER_BRICK_WALL);
	public static final Item CRACKED_NETHER_BRICK_FENCE = registerBlock(SSWPBlocks.CRACKED_NETHER_BRICK_FENCE);
	public static final Item CRACKED_NETHER_BRICK_FENCE_GATE = registerBlock(SSWPBlocks.CRACKED_NETHER_BRICK_FENCE_GATE);
	public static final Item CHISELED_NETHER_BRICK_SLAB = registerBlock(SSWPBlocks.CHISELED_NETHER_BRICK_SLAB);
	public static final Item CHISELED_NETHER_BRICK_STAIRS = registerBlock(SSWPBlocks.CHISELED_NETHER_BRICK_STAIRS);
	public static final Item CHISELED_NETHER_BRICK_WALL = registerBlock(SSWPBlocks.CHISELED_NETHER_BRICK_WALL);
	public static final Item RED_NETHER_BRICK_FENCE = registerBlock(SSWPBlocks.RED_NETHER_BRICK_FENCE);
	public static final Item RED_NETHER_BRICK_FENCE_GATE = registerBlock(SSWPBlocks.RED_NETHER_BRICK_FENCE_GATE);
	
	public static final Item BASALT_SLAB = registerBlock(SSWPBlocks.BASALT_SLAB);
	public static final Item BASALT_STAIRS = registerBlock(SSWPBlocks.BASALT_STAIRS);
	public static final Item BASALT_WALL = registerBlock(SSWPBlocks.BASALT_WALL);
	public static final Item SMOOTH_BASALT_SLAB = registerBlock(SSWPBlocks.SMOOTH_BASALT_SLAB);
	public static final Item SMOOTH_BASALT_STAIRS = registerBlock(SSWPBlocks.SMOOTH_BASALT_STAIRS);
	public static final Item SMOOTH_BASALT_WALL = registerBlock(SSWPBlocks.SMOOTH_BASALT_WALL);
	public static final Item POLISHED_BASALT_SLAB = registerBlock(SSWPBlocks.POLISHED_BASALT_SLAB);
	public static final Item POLISHED_BASALT_STAIRS = registerBlock(SSWPBlocks.POLISHED_BASALT_STAIRS);
	public static final Item POLISHED_BASALT_WALL = registerBlock(SSWPBlocks.POLISHED_BASALT_WALL);
	
	public static final Item GILDED_BLACKSTONE_SLAB = registerBlock(SSWPBlocks.GILDED_BLACKSTONE_SLAB);
	public static final Item GILDED_BLACKSTONE_STAIRS = registerBlock(SSWPBlocks.GILDED_BLACKSTONE_STAIRS);
	public static final Item GILDED_BLACKSTONE_WALL = registerBlock(SSWPBlocks.GILDED_BLACKSTONE_WALL);
	public static final Item CHISELED_POLISHED_BLACKSTONE_SLAB = registerBlock(SSWPBlocks.CHISELED_POLISHED_BLACKSTONE_SLAB);
	public static final Item CHISELED_POLISHED_BLACKSTONE_STAIRS = registerBlock(SSWPBlocks.CHISELED_POLISHED_BLACKSTONE_STAIRS);
	public static final Item CHISELED_POLISHED_BLACKSTONE_WALL = registerBlock(SSWPBlocks.CHISELED_POLISHED_BLACKSTONE_WALL);
	public static final Item CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = registerBlock(SSWPBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB);
	public static final Item CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = registerBlock(SSWPBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS);
	public static final Item CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = registerBlock(SSWPBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL);
	
	public static final Item END_STONE_SLAB = registerBlock(SSWPBlocks.END_STONE_SLAB);
	public static final Item END_STONE_STAIRS = registerBlock(SSWPBlocks.END_STONE_STAIRS);
	public static final Item END_STONE_WALL = registerBlock(SSWPBlocks.END_STONE_WALL);
	
	public static final Item PURPUR_WALL = registerBlock(SSWPBlocks.PURPUR_WALL);
	public static final Item PURPUR_PILLAR_SLAB = registerBlock(SSWPBlocks.PURPUR_PILLAR_SLAB);
	public static final Item PURPUR_PILLAR_STAIRS = registerBlock(SSWPBlocks.PURPUR_PILLAR_STAIRS);
	public static final Item PURPUR_PILLAR_WALL = registerBlock(SSWPBlocks.PURPUR_PILLAR_WALL);
	
	public static final Item COAL_SLAB = registerBlock(SSWPBlocks.COAL_SLAB);
	public static final Item COAL_STAIRS = registerBlock(SSWPBlocks.COAL_STAIRS);
	public static final Item COAL_WALL = registerBlock(SSWPBlocks.COAL_WALL);
	
	public static final Item IRON_SLAB = registerBlock(SSWPBlocks.IRON_SLAB);
	public static final Item IRON_STAIRS = registerBlock(SSWPBlocks.IRON_STAIRS);
	public static final Item IRON_WALL = registerBlock(SSWPBlocks.IRON_WALL);
	public static final Item IRON_FENCE = registerBlock(SSWPBlocks.IRON_FENCE);
	public static final Item IRON_FENCE_GATE = registerBlock(SSWPBlocks.IRON_FENCE_GATE);
	public static final Item IRON_BUTTON = registerBlock(SSWPBlocks.IRON_BUTTON);
	
	public static final Item GOLD_SLAB = registerBlock(SSWPBlocks.GOLD_SLAB);
	public static final Item GOLD_STAIRS = registerBlock(SSWPBlocks.GOLD_STAIRS);
	public static final Item GOLD_WALL = registerBlock(SSWPBlocks.GOLD_WALL);
	public static final Item GOLD_FENCE = registerBlock(SSWPBlocks.GOLD_FENCE);
	public static final Item GOLD_FENCE_GATE = registerBlock(SSWPBlocks.GOLD_FENCE_GATE);
	public static final Item GOLD_BARS = registerBlock(SSWPBlocks.GOLD_BARS);
	public static final Item GOLD_DOOR = registerTallBlock(SSWPBlocks.GOLD_DOOR);
	public static final Item GOLD_TRAPDOOR = registerBlock(SSWPBlocks.GOLD_TRAPDOOR);
	public static final Item GOLD_BUTTON = registerBlock(SSWPBlocks.GOLD_BUTTON);
	public static final Item GOLD_CHAIN = registerBlock(SSWPBlocks.GOLD_CHAIN);
	
	public static final Item REDSTONE_SLAB = registerBlock(SSWPBlocks.REDSTONE_SLAB);
	public static final Item REDSTONE_STAIRS = registerBlock(SSWPBlocks.REDSTONE_STAIRS);
	public static final Item REDSTONE_WALL = registerBlock(SSWPBlocks.REDSTONE_WALL);
	
	public static final Item EMERALD_SLAB = registerBlock(SSWPBlocks.EMERALD_SLAB);
	public static final Item EMERALD_STAIRS = registerBlock(SSWPBlocks.EMERALD_STAIRS);
	public static final Item EMERALD_WALL = registerBlock(SSWPBlocks.EMERALD_WALL);
	
	public static final Item LAPIS_SLAB = registerBlock(SSWPBlocks.LAPIS_SLAB);
	public static final Item LAPIS_STAIRS = registerBlock(SSWPBlocks.LAPIS_STAIRS);
	public static final Item LAPIS_WALL = registerBlock(SSWPBlocks.LAPIS_WALL);
	
	public static final Item DIAMOND_SLAB = registerBlock(SSWPBlocks.DIAMOND_SLAB);
	public static final Item DIAMOND_STAIRS = registerBlock(SSWPBlocks.DIAMOND_STAIRS);
	public static final Item DIAMOND_WALL = registerBlock(SSWPBlocks.DIAMOND_WALL);
	
	public static final Item NETHERITE_SLAB = registerBlock(SSWPBlocks.NETHERITE_SLAB, new Item.Settings().fireproof());
	public static final Item NETHERITE_STAIRS = registerBlock(SSWPBlocks.NETHERITE_STAIRS, new Item.Settings().fireproof());
	public static final Item NETHERITE_WALL = registerBlock(SSWPBlocks.NETHERITE_WALL, new Item.Settings().fireproof());
	public static final Item NETHERITE_FENCE = registerBlock(SSWPBlocks.NETHERITE_FENCE, new Item.Settings().fireproof());
	public static final Item NETHERITE_FENCE_GATE = registerBlock(SSWPBlocks.NETHERITE_FENCE_GATE, new Item.Settings().fireproof());
	public static final Item NETHERITE_BARS = registerBlock(SSWPBlocks.NETHERITE_BARS, new Item.Settings().fireproof());
	public static final Item NETHERITE_DOOR = registerTallBlock(SSWPBlocks.NETHERITE_DOOR, new Item.Settings().fireproof());
	public static final Item NETHERITE_TRAPDOOR = registerBlock(SSWPBlocks.NETHERITE_TRAPDOOR, new Item.Settings().fireproof());
	public static final Item NETHERITE_PRESSURE_PLATE = registerBlock(SSWPBlocks.NETHERITE_PRESSURE_PLATE, new Item.Settings().fireproof());
	public static final Item NETHERITE_BUTTON = registerBlock(SSWPBlocks.NETHERITE_BUTTON, new Item.Settings().fireproof());
	public static final Item NETHERITE_CHAIN = registerBlock(SSWPBlocks.NETHERITE_CHAIN, new Item.Settings().fireproof());
	
	public static final Item QUARTZ_WALL = registerBlock(SSWPBlocks.QUARTZ_WALL);
	public static final Item CHISELED_QUARTZ_SLAB = registerBlock(SSWPBlocks.CHISELED_QUARTZ_SLAB);
	public static final Item CHISELED_QUARTZ_STAIRS = registerBlock(SSWPBlocks.CHISELED_QUARTZ_STAIRS);
	public static final Item CHISELED_QUARTZ_WALL = registerBlock(SSWPBlocks.CHISELED_QUARTZ_WALL);
	public static final Item QUARTZ_BRICK_SLAB = registerBlock(SSWPBlocks.QUARTZ_BRICK_SLAB);
	public static final Item QUARTZ_BRICK_STAIRS = registerBlock(SSWPBlocks.QUARTZ_BRICK_STAIRS);
	public static final Item QUARTZ_BRICK_WALL = registerBlock(SSWPBlocks.QUARTZ_BRICK_WALL);
	public static final Item QUARTZ_PILLAR_SLAB = registerBlock(SSWPBlocks.QUARTZ_PILLAR_SLAB);
	public static final Item QUARTZ_PILLAR_STAIRS = registerBlock(SSWPBlocks.QUARTZ_PILLAR_STAIRS);
	public static final Item QUARTZ_PILLAR_WALL = registerBlock(SSWPBlocks.QUARTZ_PILLAR_WALL);
	public static final Item SMOOTH_QUARTZ_WALL = registerBlock(SSWPBlocks.SMOOTH_QUARTZ_WALL);
	
	public static final Item AMETHYST_SLAB = registerBlock(SSWPBlocks.AMETHYST_SLAB);
	public static final Item AMETHYST_STAIRS = registerBlock(SSWPBlocks.AMETHYST_STAIRS);
	public static final Item AMETHYST_WALL = registerBlock(SSWPBlocks.AMETHYST_WALL);
	
	public static final Item COPPER_SLAB = registerBlock(SSWPBlocks.COPPER_SLAB);
	public static final Item COPPER_STAIRS = registerBlock(SSWPBlocks.COPPER_STAIRS);
	public static final Item COPPER_WALL = registerBlock(SSWPBlocks.COPPER_WALL);
	public static final Item COPPER_FENCE = registerBlock(SSWPBlocks.COPPER_FENCE);
	public static final Item COPPER_FENCE_GATE = registerBlock(SSWPBlocks.COPPER_FENCE_GATE);
	public static final Item COPPER_BARS = registerBlock(SSWPBlocks.COPPER_BARS);
	public static final Item COPPER_PRESSURE_PLATE = registerBlock(SSWPBlocks.COPPER_PRESSURE_PLATE);
	public static final Item COPPER_BUTTON = registerBlock(SSWPBlocks.COPPER_BUTTON);
	public static final Item COPPER_CHAIN = registerBlock(SSWPBlocks.COPPER_CHAIN);
	public static final Item CHISELED_COPPER_SLAB = registerBlock(SSWPBlocks.CHISELED_COPPER_SLAB);
	public static final Item CHISELED_COPPER_STAIRS = registerBlock(SSWPBlocks.CHISELED_COPPER_STAIRS);
	public static final Item CHISELED_COPPER_WALL = registerBlock(SSWPBlocks.CHISELED_COPPER_WALL);
	public static final Item COPPER_GRATE_SLAB = registerBlock(SSWPBlocks.COPPER_GRATE_SLAB);
	public static final Item COPPER_GRATE_STAIRS = registerBlock(SSWPBlocks.COPPER_GRATE_STAIRS);
	public static final Item COPPER_GRATE_WALL = registerBlock(SSWPBlocks.COPPER_GRATE_WALL);
	public static final Item CUT_COPPER_WALL = registerBlock(SSWPBlocks.CUT_COPPER_WALL);
	public static final Item EXPOSED_COPPER_SLAB = registerBlock(SSWPBlocks.EXPOSED_COPPER_SLAB);
	public static final Item EXPOSED_COPPER_STAIRS = registerBlock(SSWPBlocks.EXPOSED_COPPER_STAIRS);
	public static final Item EXPOSED_COPPER_WALL = registerBlock(SSWPBlocks.EXPOSED_COPPER_WALL);
	public static final Item EXPOSED_COPPER_FENCE = registerBlock(SSWPBlocks.EXPOSED_COPPER_FENCE);
	public static final Item EXPOSED_COPPER_FENCE_GATE = registerBlock(SSWPBlocks.EXPOSED_COPPER_FENCE_GATE);
	public static final Item EXPOSED_COPPER_BARS = registerBlock(SSWPBlocks.EXPOSED_COPPER_BARS);
	public static final Item EXPOSED_COPPER_PRESSURE_PLATE = registerBlock(SSWPBlocks.EXPOSED_COPPER_PRESSURE_PLATE);
	public static final Item EXPOSED_COPPER_BUTTON = registerBlock(SSWPBlocks.EXPOSED_COPPER_BUTTON);
	public static final Item EXPOSED_COPPER_CHAIN = registerBlock(SSWPBlocks.EXPOSED_COPPER_CHAIN);
	public static final Item EXPOSED_CHISELED_COPPER_SLAB = registerBlock(SSWPBlocks.EXPOSED_CHISELED_COPPER_SLAB);
	public static final Item EXPOSED_CHISELED_COPPER_STAIRS = registerBlock(SSWPBlocks.EXPOSED_CHISELED_COPPER_STAIRS);
	public static final Item EXPOSED_CHISELED_COPPER_WALL = registerBlock(SSWPBlocks.EXPOSED_CHISELED_COPPER_WALL);
	public static final Item EXPOSED_COPPER_GRATE_SLAB = registerBlock(SSWPBlocks.EXPOSED_COPPER_GRATE_SLAB);
	public static final Item EXPOSED_COPPER_GRATE_STAIRS = registerBlock(SSWPBlocks.EXPOSED_COPPER_GRATE_STAIRS);
	public static final Item EXPOSED_COPPER_GRATE_WALL = registerBlock(SSWPBlocks.EXPOSED_COPPER_GRATE_WALL);
	public static final Item EXPOSED_CUT_COPPER_WALL = registerBlock(SSWPBlocks.EXPOSED_CUT_COPPER_WALL);
	public static final Item WEATHERED_COPPER_SLAB = registerBlock(SSWPBlocks.WEATHERED_COPPER_SLAB);
	public static final Item WEATHERED_COPPER_STAIRS = registerBlock(SSWPBlocks.WEATHERED_COPPER_STAIRS);
	public static final Item WEATHERED_COPPER_WALL = registerBlock(SSWPBlocks.WEATHERED_COPPER_WALL);
	public static final Item WEATHERED_COPPER_FENCE = registerBlock(SSWPBlocks.WEATHERED_COPPER_FENCE);
	public static final Item WEATHERED_COPPER_FENCE_GATE = registerBlock(SSWPBlocks.WEATHERED_COPPER_FENCE_GATE);
	public static final Item WEATHERED_COPPER_BARS = registerBlock(SSWPBlocks.WEATHERED_COPPER_BARS);
	public static final Item WEATHERED_COPPER_PRESSURE_PLATE = registerBlock(SSWPBlocks.WEATHERED_COPPER_PRESSURE_PLATE);
	public static final Item WEATHERED_COPPER_BUTTON = registerBlock(SSWPBlocks.WEATHERED_COPPER_BUTTON);
	public static final Item WEATHERED_COPPER_CHAIN = registerBlock(SSWPBlocks.WEATHERED_COPPER_CHAIN);
	public static final Item WEATHERED_CHISELED_COPPER_SLAB = registerBlock(SSWPBlocks.WEATHERED_CHISELED_COPPER_SLAB);
	public static final Item WEATHERED_CHISELED_COPPER_STAIRS = registerBlock(SSWPBlocks.WEATHERED_CHISELED_COPPER_STAIRS);
	public static final Item WEATHERED_CHISELED_COPPER_WALL = registerBlock(SSWPBlocks.WEATHERED_CHISELED_COPPER_WALL);
	public static final Item WEATHERED_COPPER_GRATE_SLAB = registerBlock(SSWPBlocks.WEATHERED_COPPER_GRATE_SLAB);
	public static final Item WEATHERED_COPPER_GRATE_STAIRS = registerBlock(SSWPBlocks.WEATHERED_COPPER_GRATE_STAIRS);
	public static final Item WEATHERED_COPPER_GRATE_WALL = registerBlock(SSWPBlocks.WEATHERED_COPPER_GRATE_WALL);
	public static final Item WEATHERED_CUT_COPPER_WALL = registerBlock(SSWPBlocks.WEATHERED_CUT_COPPER_WALL);
	public static final Item OXIDIZED_COPPER_SLAB = registerBlock(SSWPBlocks.OXIDIZED_COPPER_SLAB);
	public static final Item OXIDIZED_COPPER_STAIRS = registerBlock(SSWPBlocks.OXIDIZED_COPPER_STAIRS);
	public static final Item OXIDIZED_COPPER_WALL = registerBlock(SSWPBlocks.OXIDIZED_COPPER_WALL);
	public static final Item OXIDIZED_COPPER_FENCE = registerBlock(SSWPBlocks.OXIDIZED_COPPER_FENCE);
	public static final Item OXIDIZED_COPPER_FENCE_GATE = registerBlock(SSWPBlocks.OXIDIZED_COPPER_FENCE_GATE);
	public static final Item OXIDIZED_COPPER_BARS = registerBlock(SSWPBlocks.OXIDIZED_COPPER_BARS);
	public static final Item OXIDIZED_COPPER_PRESSURE_PLATE = registerBlock(SSWPBlocks.OXIDIZED_COPPER_PRESSURE_PLATE);
	public static final Item OXIDIZED_COPPER_BUTTON = registerBlock(SSWPBlocks.OXIDIZED_COPPER_BUTTON);
	public static final Item OXIDIZED_COPPER_CHAIN = registerBlock(SSWPBlocks.OXIDIZED_COPPER_CHAIN);
	public static final Item OXIDIZED_CHISELED_COPPER_SLAB = registerBlock(SSWPBlocks.OXIDIZED_CHISELED_COPPER_SLAB);
	public static final Item OXIDIZED_CHISELED_COPPER_STAIRS = registerBlock(SSWPBlocks.OXIDIZED_CHISELED_COPPER_STAIRS);
	public static final Item OXIDIZED_CHISELED_COPPER_WALL = registerBlock(SSWPBlocks.OXIDIZED_CHISELED_COPPER_WALL);
	public static final Item OXIDIZED_COPPER_GRATE_SLAB = registerBlock(SSWPBlocks.OXIDIZED_COPPER_GRATE_SLAB);
	public static final Item OXIDIZED_COPPER_GRATE_STAIRS = registerBlock(SSWPBlocks.OXIDIZED_COPPER_GRATE_STAIRS);
	public static final Item OXIDIZED_COPPER_GRATE_WALL = registerBlock(SSWPBlocks.OXIDIZED_COPPER_GRATE_WALL);
	public static final Item OXIDIZED_CUT_COPPER_WALL = registerBlock(SSWPBlocks.OXIDIZED_CUT_COPPER_WALL);
	public static final Item WAXED_COPPER_SLAB = registerBlock(SSWPBlocks.WAXED_COPPER_SLAB);
	public static final Item WAXED_COPPER_STAIRS = registerBlock(SSWPBlocks.WAXED_COPPER_STAIRS);
	public static final Item WAXED_COPPER_WALL = registerBlock(SSWPBlocks.WAXED_COPPER_WALL);
	public static final Item WAXED_COPPER_FENCE = registerBlock(SSWPBlocks.WAXED_COPPER_FENCE);
	public static final Item WAXED_COPPER_FENCE_GATE = registerBlock(SSWPBlocks.WAXED_COPPER_FENCE_GATE);
	public static final Item WAXED_COPPER_BARS = registerBlock(SSWPBlocks.WAXED_COPPER_BARS);
	public static final Item WAXED_COPPER_PRESSURE_PLATE = registerBlock(SSWPBlocks.WAXED_COPPER_PRESSURE_PLATE);
	public static final Item WAXED_COPPER_BUTTON = registerBlock(SSWPBlocks.WAXED_COPPER_BUTTON);
	public static final Item WAXED_COPPER_CHAIN = registerBlock(SSWPBlocks.WAXED_COPPER_CHAIN);
	public static final Item WAXED_CHISELED_COPPER_SLAB = registerBlock(SSWPBlocks.WAXED_CHISELED_COPPER_SLAB);
	public static final Item WAXED_CHISELED_COPPER_STAIRS = registerBlock(SSWPBlocks.WAXED_CHISELED_COPPER_STAIRS);
	public static final Item WAXED_CHISELED_COPPER_WALL = registerBlock(SSWPBlocks.WAXED_CHISELED_COPPER_WALL);
	public static final Item WAXED_COPPER_GRATE_SLAB = registerBlock(SSWPBlocks.WAXED_COPPER_GRATE_SLAB);
	public static final Item WAXED_COPPER_GRATE_STAIRS = registerBlock(SSWPBlocks.WAXED_COPPER_GRATE_STAIRS);
	public static final Item WAXED_COPPER_GRATE_WALL = registerBlock(SSWPBlocks.WAXED_COPPER_GRATE_WALL);
	public static final Item WAXED_CUT_COPPER_WALL = registerBlock(SSWPBlocks.WAXED_CUT_COPPER_WALL);
	public static final Item WAXED_EXPOSED_COPPER_SLAB = registerBlock(SSWPBlocks.WAXED_EXPOSED_COPPER_SLAB);
	public static final Item WAXED_EXPOSED_COPPER_STAIRS = registerBlock(SSWPBlocks.WAXED_EXPOSED_COPPER_STAIRS);
	public static final Item WAXED_EXPOSED_COPPER_WALL = registerBlock(SSWPBlocks.WAXED_EXPOSED_COPPER_WALL);
	public static final Item WAXED_EXPOSED_COPPER_FENCE = registerBlock(SSWPBlocks.WAXED_EXPOSED_COPPER_FENCE);
	public static final Item WAXED_EXPOSED_COPPER_FENCE_GATE = registerBlock(SSWPBlocks.WAXED_EXPOSED_COPPER_FENCE_GATE);
	public static final Item WAXED_EXPOSED_COPPER_BARS = registerBlock(SSWPBlocks.WAXED_EXPOSED_COPPER_BARS);
	public static final Item WAXED_EXPOSED_COPPER_PRESSURE_PLATE = registerBlock(SSWPBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE);
	public static final Item WAXED_EXPOSED_COPPER_BUTTON = registerBlock(SSWPBlocks.WAXED_EXPOSED_COPPER_BUTTON);
	public static final Item WAXED_EXPOSED_COPPER_CHAIN = registerBlock(SSWPBlocks.WAXED_EXPOSED_COPPER_CHAIN);
	public static final Item WAXED_EXPOSED_CHISELED_COPPER_SLAB = registerBlock(SSWPBlocks.WAXED_EXPOSED_CHISELED_COPPER_SLAB);
	public static final Item WAXED_EXPOSED_CHISELED_COPPER_STAIRS = registerBlock(SSWPBlocks.WAXED_EXPOSED_CHISELED_COPPER_STAIRS);
	public static final Item WAXED_EXPOSED_CHISELED_COPPER_WALL = registerBlock(SSWPBlocks.WAXED_EXPOSED_CHISELED_COPPER_WALL);
	public static final Item WAXED_EXPOSED_COPPER_GRATE_SLAB = registerBlock(SSWPBlocks.WAXED_EXPOSED_COPPER_GRATE_SLAB);
	public static final Item WAXED_EXPOSED_COPPER_GRATE_STAIRS = registerBlock(SSWPBlocks.WAXED_EXPOSED_COPPER_GRATE_STAIRS);
	public static final Item WAXED_EXPOSED_COPPER_GRATE_WALL = registerBlock(SSWPBlocks.WAXED_EXPOSED_COPPER_GRATE_WALL);
	public static final Item WAXED_EXPOSED_CUT_COPPER_WALL = registerBlock(SSWPBlocks.WAXED_EXPOSED_CUT_COPPER_WALL);
	public static final Item WAXED_WEATHERED_COPPER_SLAB = registerBlock(SSWPBlocks.WAXED_WEATHERED_COPPER_SLAB);
	public static final Item WAXED_WEATHERED_COPPER_STAIRS = registerBlock(SSWPBlocks.WAXED_WEATHERED_COPPER_STAIRS);
	public static final Item WAXED_WEATHERED_COPPER_WALL = registerBlock(SSWPBlocks.WAXED_WEATHERED_COPPER_WALL);
	public static final Item WAXED_WEATHERED_COPPER_FENCE = registerBlock(SSWPBlocks.WAXED_WEATHERED_COPPER_FENCE);
	public static final Item WAXED_WEATHERED_COPPER_FENCE_GATE = registerBlock(SSWPBlocks.WAXED_WEATHERED_COPPER_FENCE_GATE);
	public static final Item WAXED_WEATHERED_COPPER_BARS = registerBlock(SSWPBlocks.WAXED_WEATHERED_COPPER_BARS);
	public static final Item WAXED_WEATHERED_COPPER_PRESSURE_PLATE = registerBlock(SSWPBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE);
	public static final Item WAXED_WEATHERED_COPPER_BUTTON = registerBlock(SSWPBlocks.WAXED_WEATHERED_COPPER_BUTTON);
	public static final Item WAXED_WEATHERED_COPPER_CHAIN = registerBlock(SSWPBlocks.WAXED_WEATHERED_COPPER_CHAIN);
	public static final Item WAXED_WEATHERED_CHISELED_COPPER_SLAB = registerBlock(SSWPBlocks.WAXED_WEATHERED_CHISELED_COPPER_SLAB);
	public static final Item WAXED_WEATHERED_CHISELED_COPPER_STAIRS = registerBlock(SSWPBlocks.WAXED_WEATHERED_CHISELED_COPPER_STAIRS);
	public static final Item WAXED_WEATHERED_CHISELED_COPPER_WALL = registerBlock(SSWPBlocks.WAXED_WEATHERED_CHISELED_COPPER_WALL);
	public static final Item WAXED_WEATHERED_COPPER_GRATE_SLAB = registerBlock(SSWPBlocks.WAXED_WEATHERED_COPPER_GRATE_SLAB);
	public static final Item WAXED_WEATHERED_COPPER_GRATE_STAIRS = registerBlock(SSWPBlocks.WAXED_WEATHERED_COPPER_GRATE_STAIRS);
	public static final Item WAXED_WEATHERED_COPPER_GRATE_WALL = registerBlock(SSWPBlocks.WAXED_WEATHERED_COPPER_GRATE_WALL);
	public static final Item WAXED_WEATHERED_CUT_COPPER_WALL = registerBlock(SSWPBlocks.WAXED_WEATHERED_CUT_COPPER_WALL);
	public static final Item WAXED_OXIDIZED_COPPER_SLAB = registerBlock(SSWPBlocks.WAXED_OXIDIZED_COPPER_SLAB);
	public static final Item WAXED_OXIDIZED_COPPER_STAIRS = registerBlock(SSWPBlocks.WAXED_OXIDIZED_COPPER_STAIRS);
	public static final Item WAXED_OXIDIZED_COPPER_WALL = registerBlock(SSWPBlocks.WAXED_OXIDIZED_COPPER_WALL);
	public static final Item WAXED_OXIDIZED_COPPER_FENCE = registerBlock(SSWPBlocks.WAXED_OXIDIZED_COPPER_FENCE);
	public static final Item WAXED_OXIDIZED_COPPER_FENCE_GATE = registerBlock(SSWPBlocks.WAXED_OXIDIZED_COPPER_FENCE_GATE);
	public static final Item WAXED_OXIDIZED_COPPER_BARS = registerBlock(SSWPBlocks.WAXED_OXIDIZED_COPPER_BARS);
	public static final Item WAXED_OXIDIZED_COPPER_PRESSURE_PLATE = registerBlock(SSWPBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE);
	public static final Item WAXED_OXIDIZED_COPPER_BUTTON = registerBlock(SSWPBlocks.WAXED_OXIDIZED_COPPER_BUTTON);
	public static final Item WAXED_OXIDIZED_COPPER_CHAIN = registerBlock(SSWPBlocks.WAXED_OXIDIZED_COPPER_CHAIN);
	public static final Item WAXED_OXIDIZED_CHISELED_COPPER_SLAB = registerBlock(SSWPBlocks.WAXED_OXIDIZED_CHISELED_COPPER_SLAB);
	public static final Item WAXED_OXIDIZED_CHISELED_COPPER_STAIRS = registerBlock(SSWPBlocks.WAXED_OXIDIZED_CHISELED_COPPER_STAIRS);
	public static final Item WAXED_OXIDIZED_CHISELED_COPPER_WALL = registerBlock(SSWPBlocks.WAXED_OXIDIZED_CHISELED_COPPER_WALL);
	public static final Item WAXED_OXIDIZED_COPPER_GRATE_SLAB = registerBlock(SSWPBlocks.WAXED_OXIDIZED_COPPER_GRATE_SLAB);
	public static final Item WAXED_OXIDIZED_COPPER_GRATE_STAIRS = registerBlock(SSWPBlocks.WAXED_OXIDIZED_COPPER_GRATE_STAIRS);
	public static final Item WAXED_OXIDIZED_COPPER_GRATE_WALL = registerBlock(SSWPBlocks.WAXED_OXIDIZED_COPPER_GRATE_WALL);
	public static final Item WAXED_OXIDIZED_CUT_COPPER_WALL = registerBlock(SSWPBlocks.WAXED_OXIDIZED_CUT_COPPER_WALL);
	
	public static final Item WHITE_WOOL_SLAB = registerBlock(SSWPBlocks.WHITE_WOOL_SLAB);
	public static final Item WHITE_WOOL_STAIRS = registerBlock(SSWPBlocks.WHITE_WOOL_STAIRS);
	public static final Item WHITE_WOOL_WALL = registerBlock(SSWPBlocks.WHITE_WOOL_WALL);
	public static final Item LIGHT_GRAY_WOOL_SLAB = registerBlock(SSWPBlocks.LIGHT_GRAY_WOOL_SLAB);
	public static final Item LIGHT_GRAY_WOOL_STAIRS = registerBlock(SSWPBlocks.LIGHT_GRAY_WOOL_STAIRS);
	public static final Item LIGHT_GRAY_WOOL_WALL = registerBlock(SSWPBlocks.LIGHT_GRAY_WOOL_WALL);
	public static final Item GRAY_WOOL_SLAB = registerBlock(SSWPBlocks.GRAY_WOOL_SLAB);
	public static final Item GRAY_WOOL_STAIRS = registerBlock(SSWPBlocks.GRAY_WOOL_STAIRS);
	public static final Item GRAY_WOOL_WALL = registerBlock(SSWPBlocks.GRAY_WOOL_WALL);
	public static final Item BLACK_WOOL_SLAB = registerBlock(SSWPBlocks.BLACK_WOOL_SLAB);
	public static final Item BLACK_WOOL_STAIRS = registerBlock(SSWPBlocks.BLACK_WOOL_STAIRS);
	public static final Item BLACK_WOOL_WALL = registerBlock(SSWPBlocks.BLACK_WOOL_WALL);
	public static final Item BROWN_WOOL_SLAB = registerBlock(SSWPBlocks.BROWN_WOOL_SLAB);
	public static final Item BROWN_WOOL_STAIRS = registerBlock(SSWPBlocks.BROWN_WOOL_STAIRS);
	public static final Item BROWN_WOOL_WALL = registerBlock(SSWPBlocks.BROWN_WOOL_WALL);
	public static final Item RED_WOOL_SLAB = registerBlock(SSWPBlocks.RED_WOOL_SLAB);
	public static final Item RED_WOOL_STAIRS = registerBlock(SSWPBlocks.RED_WOOL_STAIRS);
	public static final Item RED_WOOL_WALL = registerBlock(SSWPBlocks.RED_WOOL_WALL);
	public static final Item ORANGE_WOOL_SLAB = registerBlock(SSWPBlocks.ORANGE_WOOL_SLAB);
	public static final Item ORANGE_WOOL_STAIRS = registerBlock(SSWPBlocks.ORANGE_WOOL_STAIRS);
	public static final Item ORANGE_WOOL_WALL = registerBlock(SSWPBlocks.ORANGE_WOOL_WALL);
	public static final Item YELLOW_WOOL_SLAB = registerBlock(SSWPBlocks.YELLOW_WOOL_SLAB);
	public static final Item YELLOW_WOOL_STAIRS = registerBlock(SSWPBlocks.YELLOW_WOOL_STAIRS);
	public static final Item YELLOW_WOOL_WALL = registerBlock(SSWPBlocks.YELLOW_WOOL_WALL);
	public static final Item LIME_WOOL_SLAB = registerBlock(SSWPBlocks.LIME_WOOL_SLAB);
	public static final Item LIME_WOOL_STAIRS = registerBlock(SSWPBlocks.LIME_WOOL_STAIRS);
	public static final Item LIME_WOOL_WALL = registerBlock(SSWPBlocks.LIME_WOOL_WALL);
	public static final Item GREEN_WOOL_SLAB = registerBlock(SSWPBlocks.GREEN_WOOL_SLAB);
	public static final Item GREEN_WOOL_STAIRS = registerBlock(SSWPBlocks.GREEN_WOOL_STAIRS);
	public static final Item GREEN_WOOL_WALL = registerBlock(SSWPBlocks.GREEN_WOOL_WALL);
	public static final Item CYAN_WOOL_SLAB = registerBlock(SSWPBlocks.CYAN_WOOL_SLAB);
	public static final Item CYAN_WOOL_STAIRS = registerBlock(SSWPBlocks.CYAN_WOOL_STAIRS);
	public static final Item CYAN_WOOL_WALL = registerBlock(SSWPBlocks.CYAN_WOOL_WALL);
	public static final Item LIGHT_BLUE_WOOL_SLAB = registerBlock(SSWPBlocks.LIGHT_BLUE_WOOL_SLAB);
	public static final Item LIGHT_BLUE_WOOL_STAIRS = registerBlock(SSWPBlocks.LIGHT_BLUE_WOOL_STAIRS);
	public static final Item LIGHT_BLUE_WOOL_WALL = registerBlock(SSWPBlocks.LIGHT_BLUE_WOOL_WALL);
	public static final Item BLUE_WOOL_SLAB = registerBlock(SSWPBlocks.BLUE_WOOL_SLAB);
	public static final Item BLUE_WOOL_STAIRS = registerBlock(SSWPBlocks.BLUE_WOOL_STAIRS);
	public static final Item BLUE_WOOL_WALL = registerBlock(SSWPBlocks.BLUE_WOOL_WALL);
	public static final Item PURPLE_WOOL_SLAB = registerBlock(SSWPBlocks.PURPLE_WOOL_SLAB);
	public static final Item PURPLE_WOOL_STAIRS = registerBlock(SSWPBlocks.PURPLE_WOOL_STAIRS);
	public static final Item PURPLE_WOOL_WALL = registerBlock(SSWPBlocks.PURPLE_WOOL_WALL);
	public static final Item MAGENTA_WOOL_SLAB = registerBlock(SSWPBlocks.MAGENTA_WOOL_SLAB);
	public static final Item MAGENTA_WOOL_STAIRS = registerBlock(SSWPBlocks.MAGENTA_WOOL_STAIRS);
	public static final Item MAGENTA_WOOL_WALL = registerBlock(SSWPBlocks.MAGENTA_WOOL_WALL);
	public static final Item PINK_WOOL_SLAB = registerBlock(SSWPBlocks.PINK_WOOL_SLAB);
	public static final Item PINK_WOOL_STAIRS = registerBlock(SSWPBlocks.PINK_WOOL_STAIRS);
	public static final Item PINK_WOOL_WALL = registerBlock(SSWPBlocks.PINK_WOOL_WALL);
	
	public static final Item TERRACOTTA_SLAB = registerBlock(SSWPBlocks.TERRACOTTA_SLAB);
	public static final Item TERRACOTTA_STAIRS = registerBlock(SSWPBlocks.TERRACOTTA_STAIRS);
	public static final Item TERRACOTTA_WALL = registerBlock(SSWPBlocks.TERRACOTTA_WALL);
	public static final Item WHITE_TERRACOTTA_SLAB = registerBlock(SSWPBlocks.WHITE_TERRACOTTA_SLAB);
	public static final Item WHITE_TERRACOTTA_STAIRS = registerBlock(SSWPBlocks.WHITE_TERRACOTTA_STAIRS);
	public static final Item WHITE_TERRACOTTA_WALL = registerBlock(SSWPBlocks.WHITE_TERRACOTTA_WALL);
	public static final Item LIGHT_GRAY_TERRACOTTA_SLAB = registerBlock(SSWPBlocks.LIGHT_GRAY_TERRACOTTA_SLAB);
	public static final Item LIGHT_GRAY_TERRACOTTA_STAIRS = registerBlock(SSWPBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
	public static final Item LIGHT_GRAY_TERRACOTTA_WALL = registerBlock(SSWPBlocks.LIGHT_GRAY_TERRACOTTA_WALL);
	public static final Item GRAY_TERRACOTTA_SLAB = registerBlock(SSWPBlocks.GRAY_TERRACOTTA_SLAB);
	public static final Item GRAY_TERRACOTTA_STAIRS = registerBlock(SSWPBlocks.GRAY_TERRACOTTA_STAIRS);
	public static final Item GRAY_TERRACOTTA_WALL = registerBlock(SSWPBlocks.GRAY_TERRACOTTA_WALL);
	public static final Item BLACK_TERRACOTTA_SLAB = registerBlock(SSWPBlocks.BLACK_TERRACOTTA_SLAB);
	public static final Item BLACK_TERRACOTTA_STAIRS = registerBlock(SSWPBlocks.BLACK_TERRACOTTA_STAIRS);
	public static final Item BLACK_TERRACOTTA_WALL = registerBlock(SSWPBlocks.BLACK_TERRACOTTA_WALL);
	public static final Item BROWN_TERRACOTTA_SLAB = registerBlock(SSWPBlocks.BROWN_TERRACOTTA_SLAB);
	public static final Item BROWN_TERRACOTTA_STAIRS = registerBlock(SSWPBlocks.BROWN_TERRACOTTA_STAIRS);
	public static final Item BROWN_TERRACOTTA_WALL = registerBlock(SSWPBlocks.BROWN_TERRACOTTA_WALL);
	public static final Item RED_TERRACOTTA_SLAB = registerBlock(SSWPBlocks.RED_TERRACOTTA_SLAB);
	public static final Item RED_TERRACOTTA_STAIRS = registerBlock(SSWPBlocks.RED_TERRACOTTA_STAIRS);
	public static final Item RED_TERRACOTTA_WALL = registerBlock(SSWPBlocks.RED_TERRACOTTA_WALL);
	public static final Item ORANGE_TERRACOTTA_SLAB = registerBlock(SSWPBlocks.ORANGE_TERRACOTTA_SLAB);
	public static final Item ORANGE_TERRACOTTA_STAIRS = registerBlock(SSWPBlocks.ORANGE_TERRACOTTA_STAIRS);
	public static final Item ORANGE_TERRACOTTA_WALL = registerBlock(SSWPBlocks.ORANGE_TERRACOTTA_WALL);
	public static final Item YELLOW_TERRACOTTA_SLAB = registerBlock(SSWPBlocks.YELLOW_TERRACOTTA_SLAB);
	public static final Item YELLOW_TERRACOTTA_STAIRS = registerBlock(SSWPBlocks.YELLOW_TERRACOTTA_STAIRS);
	public static final Item YELLOW_TERRACOTTA_WALL = registerBlock(SSWPBlocks.YELLOW_TERRACOTTA_WALL);
	public static final Item LIME_TERRACOTTA_SLAB = registerBlock(SSWPBlocks.LIME_TERRACOTTA_SLAB);
	public static final Item LIME_TERRACOTTA_STAIRS = registerBlock(SSWPBlocks.LIME_TERRACOTTA_STAIRS);
	public static final Item LIME_TERRACOTTA_WALL = registerBlock(SSWPBlocks.LIME_TERRACOTTA_WALL);
	public static final Item GREEN_TERRACOTTA_SLAB = registerBlock(SSWPBlocks.GREEN_TERRACOTTA_SLAB);
	public static final Item GREEN_TERRACOTTA_STAIRS = registerBlock(SSWPBlocks.GREEN_TERRACOTTA_STAIRS);
	public static final Item GREEN_TERRACOTTA_WALL = registerBlock(SSWPBlocks.GREEN_TERRACOTTA_WALL);
	public static final Item CYAN_TERRACOTTA_SLAB = registerBlock(SSWPBlocks.CYAN_TERRACOTTA_SLAB);
	public static final Item CYAN_TERRACOTTA_STAIRS = registerBlock(SSWPBlocks.CYAN_TERRACOTTA_STAIRS);
	public static final Item CYAN_TERRACOTTA_WALL = registerBlock(SSWPBlocks.CYAN_TERRACOTTA_WALL);
	public static final Item LIGHT_BLUE_TERRACOTTA_SLAB = registerBlock(SSWPBlocks.LIGHT_BLUE_TERRACOTTA_SLAB);
	public static final Item LIGHT_BLUE_TERRACOTTA_STAIRS = registerBlock(SSWPBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
	public static final Item LIGHT_BLUE_TERRACOTTA_WALL = registerBlock(SSWPBlocks.LIGHT_BLUE_TERRACOTTA_WALL);
	public static final Item BLUE_TERRACOTTA_SLAB = registerBlock(SSWPBlocks.BLUE_TERRACOTTA_SLAB);
	public static final Item BLUE_TERRACOTTA_STAIRS = registerBlock(SSWPBlocks.BLUE_TERRACOTTA_STAIRS);
	public static final Item BLUE_TERRACOTTA_WALL = registerBlock(SSWPBlocks.BLUE_TERRACOTTA_WALL);
	public static final Item PURPLE_TERRACOTTA_SLAB = registerBlock(SSWPBlocks.PURPLE_TERRACOTTA_SLAB);
	public static final Item PURPLE_TERRACOTTA_STAIRS = registerBlock(SSWPBlocks.PURPLE_TERRACOTTA_STAIRS);
	public static final Item PURPLE_TERRACOTTA_WALL = registerBlock(SSWPBlocks.PURPLE_TERRACOTTA_WALL);
	public static final Item MAGENTA_TERRACOTTA_SLAB = registerBlock(SSWPBlocks.MAGENTA_TERRACOTTA_SLAB);
	public static final Item MAGENTA_TERRACOTTA_STAIRS = registerBlock(SSWPBlocks.MAGENTA_TERRACOTTA_STAIRS);
	public static final Item MAGENTA_TERRACOTTA_WALL = registerBlock(SSWPBlocks.MAGENTA_TERRACOTTA_WALL);
	public static final Item PINK_TERRACOTTA_SLAB = registerBlock(SSWPBlocks.PINK_TERRACOTTA_SLAB);
	public static final Item PINK_TERRACOTTA_STAIRS = registerBlock(SSWPBlocks.PINK_TERRACOTTA_STAIRS);
	public static final Item PINK_TERRACOTTA_WALL = registerBlock(SSWPBlocks.PINK_TERRACOTTA_WALL);
	
	public static final Item WHITE_CONCRETE_SLAB = registerBlock(SSWPBlocks.WHITE_CONCRETE_SLAB);
	public static final Item WHITE_CONCRETE_STAIRS = registerBlock(SSWPBlocks.WHITE_CONCRETE_STAIRS);
	public static final Item WHITE_CONCRETE_WALL = registerBlock(SSWPBlocks.WHITE_CONCRETE_WALL);
	public static final Item LIGHT_GRAY_CONCRETE_SLAB = registerBlock(SSWPBlocks.LIGHT_GRAY_CONCRETE_SLAB);
	public static final Item LIGHT_GRAY_CONCRETE_STAIRS = registerBlock(SSWPBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
	public static final Item LIGHT_GRAY_CONCRETE_WALL = registerBlock(SSWPBlocks.LIGHT_GRAY_CONCRETE_WALL);
	public static final Item GRAY_CONCRETE_SLAB = registerBlock(SSWPBlocks.GRAY_CONCRETE_SLAB);
	public static final Item GRAY_CONCRETE_STAIRS = registerBlock(SSWPBlocks.GRAY_CONCRETE_STAIRS);
	public static final Item GRAY_CONCRETE_WALL = registerBlock(SSWPBlocks.GRAY_CONCRETE_WALL);
	public static final Item BLACK_CONCRETE_SLAB = registerBlock(SSWPBlocks.BLACK_CONCRETE_SLAB);
	public static final Item BLACK_CONCRETE_STAIRS = registerBlock(SSWPBlocks.BLACK_CONCRETE_STAIRS);
	public static final Item BLACK_CONCRETE_WALL = registerBlock(SSWPBlocks.BLACK_CONCRETE_WALL);
	public static final Item BROWN_CONCRETE_SLAB = registerBlock(SSWPBlocks.BROWN_CONCRETE_SLAB);
	public static final Item BROWN_CONCRETE_STAIRS = registerBlock(SSWPBlocks.BROWN_CONCRETE_STAIRS);
	public static final Item BROWN_CONCRETE_WALL = registerBlock(SSWPBlocks.BROWN_CONCRETE_WALL);
	public static final Item RED_CONCRETE_SLAB = registerBlock(SSWPBlocks.RED_CONCRETE_SLAB);
	public static final Item RED_CONCRETE_STAIRS = registerBlock(SSWPBlocks.RED_CONCRETE_STAIRS);
	public static final Item RED_CONCRETE_WALL = registerBlock(SSWPBlocks.RED_CONCRETE_WALL);
	public static final Item ORANGE_CONCRETE_SLAB = registerBlock(SSWPBlocks.ORANGE_CONCRETE_SLAB);
	public static final Item ORANGE_CONCRETE_STAIRS = registerBlock(SSWPBlocks.ORANGE_CONCRETE_STAIRS);
	public static final Item ORANGE_CONCRETE_WALL = registerBlock(SSWPBlocks.ORANGE_CONCRETE_WALL);
	public static final Item YELLOW_CONCRETE_SLAB = registerBlock(SSWPBlocks.YELLOW_CONCRETE_SLAB);
	public static final Item YELLOW_CONCRETE_STAIRS = registerBlock(SSWPBlocks.YELLOW_CONCRETE_STAIRS);
	public static final Item YELLOW_CONCRETE_WALL = registerBlock(SSWPBlocks.YELLOW_CONCRETE_WALL);
	public static final Item LIME_CONCRETE_SLAB = registerBlock(SSWPBlocks.LIME_CONCRETE_SLAB);
	public static final Item LIME_CONCRETE_STAIRS = registerBlock(SSWPBlocks.LIME_CONCRETE_STAIRS);
	public static final Item LIME_CONCRETE_WALL = registerBlock(SSWPBlocks.LIME_CONCRETE_WALL);
	public static final Item GREEN_CONCRETE_SLAB = registerBlock(SSWPBlocks.GREEN_CONCRETE_SLAB);
	public static final Item GREEN_CONCRETE_STAIRS = registerBlock(SSWPBlocks.GREEN_CONCRETE_STAIRS);
	public static final Item GREEN_CONCRETE_WALL = registerBlock(SSWPBlocks.GREEN_CONCRETE_WALL);
	public static final Item CYAN_CONCRETE_SLAB = registerBlock(SSWPBlocks.CYAN_CONCRETE_SLAB);
	public static final Item CYAN_CONCRETE_STAIRS = registerBlock(SSWPBlocks.CYAN_CONCRETE_STAIRS);
	public static final Item CYAN_CONCRETE_WALL = registerBlock(SSWPBlocks.CYAN_CONCRETE_WALL);
	public static final Item LIGHT_BLUE_CONCRETE_SLAB = registerBlock(SSWPBlocks.LIGHT_BLUE_CONCRETE_SLAB);
	public static final Item LIGHT_BLUE_CONCRETE_STAIRS = registerBlock(SSWPBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
	public static final Item LIGHT_BLUE_CONCRETE_WALL = registerBlock(SSWPBlocks.LIGHT_BLUE_CONCRETE_WALL);
	public static final Item BLUE_CONCRETE_SLAB = registerBlock(SSWPBlocks.BLUE_CONCRETE_SLAB);
	public static final Item BLUE_CONCRETE_STAIRS = registerBlock(SSWPBlocks.BLUE_CONCRETE_STAIRS);
	public static final Item BLUE_CONCRETE_WALL = registerBlock(SSWPBlocks.BLUE_CONCRETE_WALL);
	public static final Item PURPLE_CONCRETE_SLAB = registerBlock(SSWPBlocks.PURPLE_CONCRETE_SLAB);
	public static final Item PURPLE_CONCRETE_STAIRS = registerBlock(SSWPBlocks.PURPLE_CONCRETE_STAIRS);
	public static final Item PURPLE_CONCRETE_WALL = registerBlock(SSWPBlocks.PURPLE_CONCRETE_WALL);
	public static final Item MAGENTA_CONCRETE_SLAB = registerBlock(SSWPBlocks.MAGENTA_CONCRETE_SLAB);
	public static final Item MAGENTA_CONCRETE_STAIRS = registerBlock(SSWPBlocks.MAGENTA_CONCRETE_STAIRS);
	public static final Item MAGENTA_CONCRETE_WALL = registerBlock(SSWPBlocks.MAGENTA_CONCRETE_WALL);
	public static final Item PINK_CONCRETE_SLAB = registerBlock(SSWPBlocks.PINK_CONCRETE_SLAB);
	public static final Item PINK_CONCRETE_STAIRS = registerBlock(SSWPBlocks.PINK_CONCRETE_STAIRS);
	public static final Item PINK_CONCRETE_WALL = registerBlock(SSWPBlocks.PINK_CONCRETE_WALL);
	
	public static final Item GLASS_SLAB = registerBlock(SSWPBlocks.GLASS_SLAB);
	public static final Item GLASS_STAIRS = registerBlock(SSWPBlocks.GLASS_STAIRS);
	public static final Item GLASS_WALL = registerBlock(SSWPBlocks.GLASS_WALL);
	public static final Item TINTED_GLASS_SLAB = registerBlock(SSWPBlocks.TINTED_GLASS_SLAB);
	public static final Item TINTED_GLASS_STAIRS = registerBlock(SSWPBlocks.TINTED_GLASS_STAIRS);
	public static final Item TINTED_GLASS_WALL = registerBlock(SSWPBlocks.TINTED_GLASS_WALL);
	public static final Item TINTED_GLASS_PANE = registerBlock(SSWPBlocks.TINTED_GLASS_PANE);
	public static final Item WHITE_STAINED_GLASS_SLAB = registerBlock(SSWPBlocks.WHITE_STAINED_GLASS_SLAB);
	public static final Item WHITE_STAINED_GLASS_STAIRS = registerBlock(SSWPBlocks.WHITE_STAINED_GLASS_STAIRS);
	public static final Item WHITE_STAINED_GLASS_WALL = registerBlock(SSWPBlocks.WHITE_STAINED_GLASS_WALL);
	public static final Item LIGHT_GRAY_STAINED_GLASS_SLAB = registerBlock(SSWPBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB);
	public static final Item LIGHT_GRAY_STAINED_GLASS_STAIRS = registerBlock(SSWPBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS);
	public static final Item LIGHT_GRAY_STAINED_GLASS_WALL = registerBlock(SSWPBlocks.LIGHT_GRAY_STAINED_GLASS_WALL);
	public static final Item GRAY_STAINED_GLASS_SLAB = registerBlock(SSWPBlocks.GRAY_STAINED_GLASS_SLAB);
	public static final Item GRAY_STAINED_GLASS_STAIRS = registerBlock(SSWPBlocks.GRAY_STAINED_GLASS_STAIRS);
	public static final Item GRAY_STAINED_GLASS_WALL = registerBlock(SSWPBlocks.GRAY_STAINED_GLASS_WALL);
	public static final Item BLACK_STAINED_GLASS_SLAB = registerBlock(SSWPBlocks.BLACK_STAINED_GLASS_SLAB);
	public static final Item BLACK_STAINED_GLASS_STAIRS = registerBlock(SSWPBlocks.BLACK_STAINED_GLASS_STAIRS);
	public static final Item BLACK_STAINED_GLASS_WALL = registerBlock(SSWPBlocks.BLACK_STAINED_GLASS_WALL);
	public static final Item BROWN_STAINED_GLASS_SLAB = registerBlock(SSWPBlocks.BROWN_STAINED_GLASS_SLAB);
	public static final Item BROWN_STAINED_GLASS_STAIRS = registerBlock(SSWPBlocks.BROWN_STAINED_GLASS_STAIRS);
	public static final Item BROWN_STAINED_GLASS_WALL = registerBlock(SSWPBlocks.BROWN_STAINED_GLASS_WALL);
	public static final Item RED_STAINED_GLASS_SLAB = registerBlock(SSWPBlocks.RED_STAINED_GLASS_SLAB);
	public static final Item RED_STAINED_GLASS_STAIRS = registerBlock(SSWPBlocks.RED_STAINED_GLASS_STAIRS);
	public static final Item RED_STAINED_GLASS_WALL = registerBlock(SSWPBlocks.RED_STAINED_GLASS_WALL);
	public static final Item ORANGE_STAINED_GLASS_SLAB = registerBlock(SSWPBlocks.ORANGE_STAINED_GLASS_SLAB);
	public static final Item ORANGE_STAINED_GLASS_STAIRS = registerBlock(SSWPBlocks.ORANGE_STAINED_GLASS_STAIRS);
	public static final Item ORANGE_STAINED_GLASS_WALL = registerBlock(SSWPBlocks.ORANGE_STAINED_GLASS_WALL);
	public static final Item YELLOW_STAINED_GLASS_SLAB = registerBlock(SSWPBlocks.YELLOW_STAINED_GLASS_SLAB);
	public static final Item YELLOW_STAINED_GLASS_STAIRS = registerBlock(SSWPBlocks.YELLOW_STAINED_GLASS_STAIRS);
	public static final Item YELLOW_STAINED_GLASS_WALL = registerBlock(SSWPBlocks.YELLOW_STAINED_GLASS_WALL);
	public static final Item LIME_STAINED_GLASS_SLAB = registerBlock(SSWPBlocks.LIME_STAINED_GLASS_SLAB);
	public static final Item LIME_STAINED_GLASS_STAIRS = registerBlock(SSWPBlocks.LIME_STAINED_GLASS_STAIRS);
	public static final Item LIME_STAINED_GLASS_WALL = registerBlock(SSWPBlocks.LIME_STAINED_GLASS_WALL);
	public static final Item GREEN_STAINED_GLASS_SLAB = registerBlock(SSWPBlocks.GREEN_STAINED_GLASS_SLAB);
	public static final Item GREEN_STAINED_GLASS_STAIRS = registerBlock(SSWPBlocks.GREEN_STAINED_GLASS_STAIRS);
	public static final Item GREEN_STAINED_GLASS_WALL = registerBlock(SSWPBlocks.GREEN_STAINED_GLASS_WALL);
	public static final Item CYAN_STAINED_GLASS_SLAB = registerBlock(SSWPBlocks.CYAN_STAINED_GLASS_SLAB);
	public static final Item CYAN_STAINED_GLASS_STAIRS = registerBlock(SSWPBlocks.CYAN_STAINED_GLASS_STAIRS);
	public static final Item CYAN_STAINED_GLASS_WALL = registerBlock(SSWPBlocks.CYAN_STAINED_GLASS_WALL);
	public static final Item LIGHT_BLUE_STAINED_GLASS_SLAB = registerBlock(SSWPBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB);
	public static final Item LIGHT_BLUE_STAINED_GLASS_STAIRS = registerBlock(SSWPBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS);
	public static final Item LIGHT_BLUE_STAINED_GLASS_WALL = registerBlock(SSWPBlocks.LIGHT_BLUE_STAINED_GLASS_WALL);
	public static final Item BLUE_STAINED_GLASS_SLAB = registerBlock(SSWPBlocks.BLUE_STAINED_GLASS_SLAB);
	public static final Item BLUE_STAINED_GLASS_STAIRS = registerBlock(SSWPBlocks.BLUE_STAINED_GLASS_STAIRS);
	public static final Item BLUE_STAINED_GLASS_WALL = registerBlock(SSWPBlocks.BLUE_STAINED_GLASS_WALL);
	public static final Item PURPLE_STAINED_GLASS_SLAB = registerBlock(SSWPBlocks.PURPLE_STAINED_GLASS_SLAB);
	public static final Item PURPLE_STAINED_GLASS_STAIRS = registerBlock(SSWPBlocks.PURPLE_STAINED_GLASS_STAIRS);
	public static final Item PURPLE_STAINED_GLASS_WALL = registerBlock(SSWPBlocks.PURPLE_STAINED_GLASS_WALL);
	public static final Item MAGENTA_STAINED_GLASS_SLAB = registerBlock(SSWPBlocks.MAGENTA_STAINED_GLASS_SLAB);
	public static final Item MAGENTA_STAINED_GLASS_STAIRS = registerBlock(SSWPBlocks.MAGENTA_STAINED_GLASS_STAIRS);
	public static final Item MAGENTA_STAINED_GLASS_WALL = registerBlock(SSWPBlocks.MAGENTA_STAINED_GLASS_WALL);
	public static final Item PINK_STAINED_GLASS_SLAB = registerBlock(SSWPBlocks.PINK_STAINED_GLASS_SLAB);
	public static final Item PINK_STAINED_GLASS_STAIRS = registerBlock(SSWPBlocks.PINK_STAINED_GLASS_STAIRS);
	public static final Item PINK_STAINED_GLASS_WALL = registerBlock(SSWPBlocks.PINK_STAINED_GLASS_WALL);
	
	public static final Item GRASS_SLAB = registerBlock(SSWPBlocks.GRASS_SLAB);
	public static final Item GRASS_STAIRS = registerBlock(SSWPBlocks.GRASS_STAIRS);
	public static final Item GRASS_WALL = registerBlock(SSWPBlocks.GRASS_WALL);
	public static final Item PODZOL_SLAB = registerBlock(SSWPBlocks.PODZOL_SLAB);
	public static final Item PODZOL_STAIRS = registerBlock(SSWPBlocks.PODZOL_STAIRS);
	public static final Item PODZOL_WALL = registerBlock(SSWPBlocks.PODZOL_WALL);
	public static final Item MYCELIUM_SLAB = registerBlock(SSWPBlocks.MYCELIUM_SLAB);
	public static final Item MYCELIUM_STAIRS = registerBlock(SSWPBlocks.MYCELIUM_STAIRS);
	public static final Item MYCELIUM_WALL = registerBlock(SSWPBlocks.MYCELIUM_WALL);
	public static final Item DIRT_PATH_SLAB = registerBlock(SSWPBlocks.DIRT_PATH_SLAB);
	public static final Item DIRT_PATH_STAIRS = registerBlock(SSWPBlocks.DIRT_PATH_STAIRS);
	public static final Item DIRT_PATH_WALL = registerBlock(SSWPBlocks.DIRT_PATH_WALL);
	public static final Item DIRT_SLAB = registerBlock(SSWPBlocks.DIRT_SLAB);
	public static final Item DIRT_STAIRS = registerBlock(SSWPBlocks.DIRT_STAIRS);
	public static final Item DIRT_WALL = registerBlock(SSWPBlocks.DIRT_WALL);
	public static final Item COARSE_DIRT_SLAB = registerBlock(SSWPBlocks.COARSE_DIRT_SLAB);
	public static final Item COARSE_DIRT_STAIRS = registerBlock(SSWPBlocks.COARSE_DIRT_STAIRS);
	public static final Item COARSE_DIRT_WALL = registerBlock(SSWPBlocks.COARSE_DIRT_WALL);
	public static final Item ROOTED_DIRT_SLAB = registerBlock(SSWPBlocks.ROOTED_DIRT_SLAB);
	public static final Item ROOTED_DIRT_STAIRS = registerBlock(SSWPBlocks.ROOTED_DIRT_STAIRS);
	public static final Item ROOTED_DIRT_WALL = registerBlock(SSWPBlocks.ROOTED_DIRT_WALL);
	
	public static final Item MUD_SLAB = registerBlock(SSWPBlocks.MUD_SLAB);
	public static final Item MUD_STAIRS = registerBlock(SSWPBlocks.MUD_STAIRS);
	public static final Item MUD_WALL = registerBlock(SSWPBlocks.MUD_WALL);
	
	public static final Item CLAY_SLAB = registerBlock(SSWPBlocks.CLAY_SLAB);
	public static final Item CLAY_STAIRS = registerBlock(SSWPBlocks.CLAY_STAIRS);
	public static final Item CLAY_WALL = registerBlock(SSWPBlocks.CLAY_WALL);
	
	public static final Item ICE_SLAB = registerBlock(SSWPBlocks.ICE_SLAB);
	public static final Item ICE_STAIRS = registerBlock(SSWPBlocks.ICE_STAIRS);
	public static final Item ICE_WALL = registerBlock(SSWPBlocks.ICE_WALL);
	public static final Item PACKED_ICE_SLAB = registerBlock(SSWPBlocks.PACKED_ICE_SLAB);
	public static final Item PACKED_ICE_STAIRS = registerBlock(SSWPBlocks.PACKED_ICE_STAIRS);
	public static final Item PACKED_ICE_WALL = registerBlock(SSWPBlocks.PACKED_ICE_WALL);
	public static final Item BLUE_ICE_SLAB = registerBlock(SSWPBlocks.BLUE_ICE_SLAB);
	public static final Item BLUE_ICE_STAIRS = registerBlock(SSWPBlocks.BLUE_ICE_STAIRS);
	public static final Item BLUE_ICE_WALL = registerBlock(SSWPBlocks.BLUE_ICE_WALL);
	public static final Item SNOW_SLAB = registerBlock(SSWPBlocks.SNOW_SLAB);
	public static final Item SNOW_STAIRS = registerBlock(SSWPBlocks.SNOW_STAIRS);
	public static final Item SNOW_WALL = registerBlock(SSWPBlocks.SNOW_WALL);
	
	public static final Item MOSS_SLAB = registerBlock(SSWPBlocks.MOSS_SLAB);
	public static final Item MOSS_STAIRS = registerBlock(SSWPBlocks.MOSS_STAIRS);
	public static final Item MOSS_WALL = registerBlock(SSWPBlocks.MOSS_WALL);
	
	public static final Item CALCITE_SLAB = registerBlock(SSWPBlocks.CALCITE_SLAB);
	public static final Item CALCITE_STAIRS = registerBlock(SSWPBlocks.CALCITE_STAIRS);
	public static final Item CALCITE_WALL = registerBlock(SSWPBlocks.CALCITE_WALL);
	public static final Item DRIPSTONE_SLAB = registerBlock(SSWPBlocks.DRIPSTONE_SLAB);
	public static final Item DRIPSTONE_STAIRS = registerBlock(SSWPBlocks.DRIPSTONE_STAIRS);
	public static final Item DRIPSTONE_WALL = registerBlock(SSWPBlocks.DRIPSTONE_WALL);
	
	public static final Item MAGMA_SLAB = registerBlock(SSWPBlocks.MAGMA_SLAB);
	public static final Item MAGMA_STAIRS = registerBlock(SSWPBlocks.MAGMA_STAIRS);
	public static final Item MAGMA_WALL = registerBlock(SSWPBlocks.MAGMA_WALL);
	
	public static final Item OBSIDIAN_SLAB = registerBlock(SSWPBlocks.OBSIDIAN_SLAB);
	public static final Item OBSIDIAN_STAIRS = registerBlock(SSWPBlocks.OBSIDIAN_STAIRS);
	public static final Item OBSIDIAN_WALL = registerBlock(SSWPBlocks.OBSIDIAN_WALL);
	public static final Item CRYING_OBSIDIAN_SLAB = registerBlock(SSWPBlocks.CRYING_OBSIDIAN_SLAB);
	public static final Item CRYING_OBSIDIAN_STAIRS = registerBlock(SSWPBlocks.CRYING_OBSIDIAN_STAIRS);
	public static final Item CRYING_OBSIDIAN_WALL = registerBlock(SSWPBlocks.CRYING_OBSIDIAN_WALL);
	
	public static final Item CRIMSON_NYLIUM_SLAB = registerBlock(SSWPBlocks.CRIMSON_NYLIUM_SLAB);
	public static final Item CRIMSON_NYLIUM_STAIRS = registerBlock(SSWPBlocks.CRIMSON_NYLIUM_STAIRS);
	public static final Item CRIMSON_NYLIUM_WALL = registerBlock(SSWPBlocks.CRIMSON_NYLIUM_WALL);
	public static final Item WARPED_NYLIUM_SLAB = registerBlock(SSWPBlocks.WARPED_NYLIUM_SLAB);
	public static final Item WARPED_NYLIUM_STAIRS = registerBlock(SSWPBlocks.WARPED_NYLIUM_STAIRS);
	public static final Item WARPED_NYLIUM_WALL = registerBlock(SSWPBlocks.WARPED_NYLIUM_WALL);
	
	public static final Item SOUL_SAND_SLAB = registerBlock(SSWPBlocks.SOUL_SAND_SLAB);
	public static final Item SOUL_SAND_STAIRS = registerBlock(SSWPBlocks.SOUL_SAND_STAIRS);
	public static final Item SOUL_SAND_WALL = registerBlock(SSWPBlocks.SOUL_SAND_WALL);
	public static final Item SOUL_SOIL_SLAB = registerBlock(SSWPBlocks.SOUL_SOIL_SLAB);
	public static final Item SOUL_SOIL_STAIRS = registerBlock(SSWPBlocks.SOUL_SOIL_STAIRS);
	public static final Item SOUL_SOIL_WALL = registerBlock(SSWPBlocks.SOUL_SOIL_WALL);
	
	public static final Item BONE_SLAB = registerBlock(SSWPBlocks.BONE_SLAB);
	public static final Item BONE_STAIRS = registerBlock(SSWPBlocks.BONE_STAIRS);
	public static final Item BONE_WALL = registerBlock(SSWPBlocks.BONE_WALL);
	
	public static final Item COAL_ORE_SLAB = registerBlock(SSWPBlocks.COAL_ORE_SLAB);
	public static final Item COAL_ORE_STAIRS = registerBlock(SSWPBlocks.COAL_ORE_STAIRS);
	public static final Item COAL_ORE_WALL = registerBlock(SSWPBlocks.COAL_ORE_WALL);
	public static final Item DEEPSLATE_COAL_ORE_SLAB = registerBlock(SSWPBlocks.DEEPSLATE_COAL_ORE_SLAB);
	public static final Item DEEPSLATE_COAL_ORE_STAIRS = registerBlock(SSWPBlocks.DEEPSLATE_COAL_ORE_STAIRS);
	public static final Item DEEPSLATE_COAL_ORE_WALL = registerBlock(SSWPBlocks.DEEPSLATE_COAL_ORE_WALL);
	
	public static final Item IRON_ORE_SLAB = registerBlock(SSWPBlocks.IRON_ORE_SLAB);
	public static final Item IRON_ORE_STAIRS = registerBlock(SSWPBlocks.IRON_ORE_STAIRS);
	public static final Item IRON_ORE_WALL = registerBlock(SSWPBlocks.IRON_ORE_WALL);
	public static final Item DEEPSLATE_IRON_ORE_SLAB = registerBlock(SSWPBlocks.DEEPSLATE_IRON_ORE_SLAB);
	public static final Item DEEPSLATE_IRON_ORE_STAIRS = registerBlock(SSWPBlocks.DEEPSLATE_IRON_ORE_STAIRS);
	public static final Item DEEPSLATE_IRON_ORE_WALL = registerBlock(SSWPBlocks.DEEPSLATE_IRON_ORE_WALL);
	
	public static final Item COPPER_ORE_SLAB = registerBlock(SSWPBlocks.COPPER_ORE_SLAB);
	public static final Item COPPER_ORE_STAIRS = registerBlock(SSWPBlocks.COPPER_ORE_STAIRS);
	public static final Item COPPER_ORE_WALL = registerBlock(SSWPBlocks.COPPER_ORE_WALL);
	public static final Item DEEPSLATE_COPPER_ORE_SLAB = registerBlock(SSWPBlocks.DEEPSLATE_COPPER_ORE_SLAB);
	public static final Item DEEPSLATE_COPPER_ORE_STAIRS = registerBlock(SSWPBlocks.DEEPSLATE_COPPER_ORE_STAIRS);
	public static final Item DEEPSLATE_COPPER_ORE_WALL = registerBlock(SSWPBlocks.DEEPSLATE_COPPER_ORE_WALL);
	
	public static final Item GOLD_ORE_SLAB = registerBlock(SSWPBlocks.GOLD_ORE_SLAB);
	public static final Item GOLD_ORE_STAIRS = registerBlock(SSWPBlocks.GOLD_ORE_STAIRS);
	public static final Item GOLD_ORE_WALL = registerBlock(SSWPBlocks.GOLD_ORE_WALL);
	public static final Item DEEPSLATE_GOLD_ORE_SLAB = registerBlock(SSWPBlocks.DEEPSLATE_GOLD_ORE_SLAB);
	public static final Item DEEPSLATE_GOLD_ORE_STAIRS = registerBlock(SSWPBlocks.DEEPSLATE_GOLD_ORE_STAIRS);
	public static final Item DEEPSLATE_GOLD_ORE_WALL = registerBlock(SSWPBlocks.DEEPSLATE_GOLD_ORE_WALL);
	
	public static final Item REDSTONE_ORE_SLAB = registerBlock(SSWPBlocks.REDSTONE_ORE_SLAB);
	public static final Item REDSTONE_ORE_STAIRS = registerBlock(SSWPBlocks.REDSTONE_ORE_STAIRS);
	public static final Item REDSTONE_ORE_WALL = registerBlock(SSWPBlocks.REDSTONE_ORE_WALL);
	public static final Item DEEPSLATE_REDSTONE_ORE_SLAB = registerBlock(SSWPBlocks.DEEPSLATE_REDSTONE_ORE_SLAB);
	public static final Item DEEPSLATE_REDSTONE_ORE_STAIRS = registerBlock(SSWPBlocks.DEEPSLATE_REDSTONE_ORE_STAIRS);
	public static final Item DEEPSLATE_REDSTONE_ORE_WALL = registerBlock(SSWPBlocks.DEEPSLATE_REDSTONE_ORE_WALL);
	
	public static final Item EMERALD_ORE_SLAB = registerBlock(SSWPBlocks.EMERALD_ORE_SLAB);
	public static final Item EMERALD_ORE_STAIRS = registerBlock(SSWPBlocks.EMERALD_ORE_STAIRS);
	public static final Item EMERALD_ORE_WALL = registerBlock(SSWPBlocks.EMERALD_ORE_WALL);
	public static final Item DEEPSLATE_EMERALD_ORE_SLAB = registerBlock(SSWPBlocks.DEEPSLATE_EMERALD_ORE_SLAB);
	public static final Item DEEPSLATE_EMERALD_ORE_STAIRS = registerBlock(SSWPBlocks.DEEPSLATE_EMERALD_ORE_STAIRS);
	public static final Item DEEPSLATE_EMERALD_ORE_WALL = registerBlock(SSWPBlocks.DEEPSLATE_EMERALD_ORE_WALL);
	
	public static final Item LAPIS_ORE_SLAB = registerBlock(SSWPBlocks.LAPIS_ORE_SLAB);
	public static final Item LAPIS_ORE_STAIRS = registerBlock(SSWPBlocks.LAPIS_ORE_STAIRS);
	public static final Item LAPIS_ORE_WALL = registerBlock(SSWPBlocks.LAPIS_ORE_WALL);
	public static final Item DEEPSLATE_LAPIS_ORE_SLAB = registerBlock(SSWPBlocks.DEEPSLATE_LAPIS_ORE_SLAB);
	public static final Item DEEPSLATE_LAPIS_ORE_STAIRS = registerBlock(SSWPBlocks.DEEPSLATE_LAPIS_ORE_STAIRS);
	public static final Item DEEPSLATE_LAPIS_ORE_WALL = registerBlock(SSWPBlocks.DEEPSLATE_LAPIS_ORE_WALL);
	
	public static final Item DIAMOND_ORE_SLAB = registerBlock(SSWPBlocks.DIAMOND_ORE_SLAB);
	public static final Item DIAMOND_ORE_STAIRS = registerBlock(SSWPBlocks.DIAMOND_ORE_STAIRS);
	public static final Item DIAMOND_ORE_WALL = registerBlock(SSWPBlocks.DIAMOND_ORE_WALL);
	public static final Item DEEPSLATE_DIAMOND_ORE_SLAB = registerBlock(SSWPBlocks.DEEPSLATE_DIAMOND_ORE_SLAB);
	public static final Item DEEPSLATE_DIAMOND_ORE_STAIRS = registerBlock(SSWPBlocks.DEEPSLATE_DIAMOND_ORE_STAIRS);
	public static final Item DEEPSLATE_DIAMOND_ORE_WALL = registerBlock(SSWPBlocks.DEEPSLATE_DIAMOND_ORE_WALL);
	
	public static final Item NETHER_QUARTZ_ORE_SLAB = registerBlock(SSWPBlocks.NETHER_QUARTZ_ORE_SLAB);
	public static final Item NETHER_QUARTZ_ORE_STAIRS = registerBlock(SSWPBlocks.NETHER_QUARTZ_ORE_STAIRS);
	public static final Item NETHER_QUARTZ_ORE_WALL = registerBlock(SSWPBlocks.NETHER_QUARTZ_ORE_WALL);
	
	public static final Item NETHER_GOLD_ORE_SLAB = registerBlock(SSWPBlocks.NETHER_GOLD_ORE_SLAB);
	public static final Item NETHER_GOLD_ORE_STAIRS = registerBlock(SSWPBlocks.NETHER_GOLD_ORE_STAIRS);
	public static final Item NETHER_GOLD_ORE_WALL = registerBlock(SSWPBlocks.NETHER_GOLD_ORE_WALL);
	
	public static final Item ANCIENT_DEBRIS_SLAB = registerBlock(SSWPBlocks.ANCIENT_DEBRIS_SLAB, new Item.Settings().fireproof());
	public static final Item ANCIENT_DEBRIS_STAIRS = registerBlock(SSWPBlocks.ANCIENT_DEBRIS_STAIRS, new Item.Settings().fireproof());
	public static final Item ANCIENT_DEBRIS_WALL = registerBlock(SSWPBlocks.ANCIENT_DEBRIS_WALL, new Item.Settings().fireproof());
	
	public static final Item RAW_IRON_SLAB = registerBlock(SSWPBlocks.RAW_IRON_SLAB);
	public static final Item RAW_IRON_STAIRS = registerBlock(SSWPBlocks.RAW_IRON_STAIRS);
	public static final Item RAW_IRON_WALL = registerBlock(SSWPBlocks.RAW_IRON_WALL);
	
	public static final Item RAW_COPPER_SLAB = registerBlock(SSWPBlocks.RAW_COPPER_SLAB);
	public static final Item RAW_COPPER_STAIRS = registerBlock(SSWPBlocks.RAW_COPPER_STAIRS);
	public static final Item RAW_COPPER_WALL = registerBlock(SSWPBlocks.RAW_COPPER_WALL);
	
	public static final Item RAW_GOLD_SLAB = registerBlock(SSWPBlocks.RAW_GOLD_SLAB);
	public static final Item RAW_GOLD_STAIRS = registerBlock(SSWPBlocks.RAW_GOLD_STAIRS);
	public static final Item RAW_GOLD_WALL = registerBlock(SSWPBlocks.RAW_GOLD_WALL);
	
	public static final Item GLOWSTONE_SLAB = registerBlock(SSWPBlocks.GLOWSTONE_SLAB);
	public static final Item GLOWSTONE_STAIRS = registerBlock(SSWPBlocks.GLOWSTONE_STAIRS);
	public static final Item GLOWSTONE_WALL = registerBlock(SSWPBlocks.GLOWSTONE_WALL);
	
	public static final Item MANGROVE_ROOT_SLAB = registerBlock(SSWPBlocks.MANGROVE_ROOT_SLAB);
	public static final Item MANGROVE_ROOT_STAIRS = registerBlock(SSWPBlocks.MANGROVE_ROOT_STAIRS);
	public static final Item MANGROVE_ROOT_WALL = registerBlock(SSWPBlocks.MANGROVE_ROOT_WALL);
	public static final Item MANGROVE_ROOT_CARPET = registerBlock(SSWPBlocks.MANGROVE_ROOT_CARPET);
	public static final Item MUDDY_MANGROVE_ROOT_SLAB = registerBlock(SSWPBlocks.MUDDY_MANGROVE_ROOT_SLAB);
	public static final Item MUDDY_MANGROVE_ROOT_STAIRS = registerBlock(SSWPBlocks.MUDDY_MANGROVE_ROOT_STAIRS);
	public static final Item MUDDY_MANGROVE_ROOT_WALL = registerBlock(SSWPBlocks.MUDDY_MANGROVE_ROOT_WALL);
	
	public static final Item MUSHROOM_STEM_SLAB = registerBlock(SSWPBlocks.MUSHROOM_STEM_SLAB);
	public static final Item MUSHROOM_STEM_STAIRS = registerBlock(SSWPBlocks.MUSHROOM_STEM_STAIRS);
	public static final Item MUSHROOM_STEM_WALL = registerBlock(SSWPBlocks.MUSHROOM_STEM_WALL);
	
	public static final Item OAK_LEAF_SLAB = registerBlock(SSWPBlocks.OAK_LEAF_SLAB);
	public static final Item OAK_LEAF_STAIRS = registerBlock(SSWPBlocks.OAK_LEAF_STAIRS);
	public static final Item OAK_LEAF_WALL = registerBlock(SSWPBlocks.OAK_LEAF_WALL);
	public static final Item OAK_LEAF_CARPET = registerBlock(SSWPBlocks.OAK_LEAF_CARPET);
	public static final Item SPRUCE_LEAF_SLAB = registerBlock(SSWPBlocks.SPRUCE_LEAF_SLAB);
	public static final Item SPRUCE_LEAF_STAIRS = registerBlock(SSWPBlocks.SPRUCE_LEAF_STAIRS);
	public static final Item SPRUCE_LEAF_WALL = registerBlock(SSWPBlocks.SPRUCE_LEAF_WALL);
	public static final Item SPRUCE_LEAF_CARPET = registerBlock(SSWPBlocks.SPRUCE_LEAF_CARPET);
	public static final Item BIRCH_LEAF_SLAB = registerBlock(SSWPBlocks.BIRCH_LEAF_SLAB);
	public static final Item BIRCH_LEAF_STAIRS = registerBlock(SSWPBlocks.BIRCH_LEAF_STAIRS);
	public static final Item BIRCH_LEAF_WALL = registerBlock(SSWPBlocks.BIRCH_LEAF_WALL);
	public static final Item BIRCH_LEAF_CARPET = registerBlock(SSWPBlocks.BIRCH_LEAF_CARPET);
	public static final Item JUNGLE_LEAF_SLAB = registerBlock(SSWPBlocks.JUNGLE_LEAF_SLAB);
	public static final Item JUNGLE_LEAF_STAIRS = registerBlock(SSWPBlocks.JUNGLE_LEAF_STAIRS);
	public static final Item JUNGLE_LEAF_WALL = registerBlock(SSWPBlocks.JUNGLE_LEAF_WALL);
	public static final Item JUNGLE_LEAF_CARPET = registerBlock(SSWPBlocks.JUNGLE_LEAF_CARPET);
	public static final Item ACACIA_LEAF_SLAB = registerBlock(SSWPBlocks.ACACIA_LEAF_SLAB);
	public static final Item ACACIA_LEAF_STAIRS = registerBlock(SSWPBlocks.ACACIA_LEAF_STAIRS);
	public static final Item ACACIA_LEAF_WALL = registerBlock(SSWPBlocks.ACACIA_LEAF_WALL);
	public static final Item ACACIA_LEAF_CARPET = registerBlock(SSWPBlocks.ACACIA_LEAF_CARPET);
	public static final Item DARK_OAK_LEAF_SLAB = registerBlock(SSWPBlocks.DARK_OAK_LEAF_SLAB);
	public static final Item DARK_OAK_LEAF_STAIRS = registerBlock(SSWPBlocks.DARK_OAK_LEAF_STAIRS);
	public static final Item DARK_OAK_LEAF_WALL = registerBlock(SSWPBlocks.DARK_OAK_LEAF_WALL);
	public static final Item DARK_OAK_LEAF_CARPET = registerBlock(SSWPBlocks.DARK_OAK_LEAF_CARPET);
	public static final Item MANGROVE_LEAF_SLAB = registerBlock(SSWPBlocks.MANGROVE_LEAF_SLAB);
	public static final Item MANGROVE_LEAF_STAIRS = registerBlock(SSWPBlocks.MANGROVE_LEAF_STAIRS);
	public static final Item MANGROVE_LEAF_WALL = registerBlock(SSWPBlocks.MANGROVE_LEAF_WALL);
	public static final Item MANGROVE_LEAF_CARPET = registerBlock(SSWPBlocks.MANGROVE_LEAF_CARPET);
	public static final Item CHERRY_LEAF_SLAB = registerBlock(SSWPBlocks.CHERRY_LEAF_SLAB);
	public static final Item CHERRY_LEAF_STAIRS = registerBlock(SSWPBlocks.CHERRY_LEAF_STAIRS);
	public static final Item CHERRY_LEAF_WALL = registerBlock(SSWPBlocks.CHERRY_LEAF_WALL);
	public static final Item CHERRY_LEAF_CARPET = registerBlock(SSWPBlocks.CHERRY_LEAF_CARPET);
	public static final Item AZALEA_LEAF_SLAB = registerBlock(SSWPBlocks.AZALEA_LEAF_SLAB);
	public static final Item AZALEA_LEAF_STAIRS = registerBlock(SSWPBlocks.AZALEA_LEAF_STAIRS);
	public static final Item AZALEA_LEAF_WALL = registerBlock(SSWPBlocks.AZALEA_LEAF_WALL);
	public static final Item AZALEA_LEAF_CARPET = registerBlock(SSWPBlocks.AZALEA_LEAF_CARPET);
	public static final Item FLOWERING_AZALEA_LEAF_SLAB = registerBlock(SSWPBlocks.FLOWERING_AZALEA_LEAF_SLAB);
	public static final Item FLOWERING_AZALEA_LEAF_STAIRS = registerBlock(SSWPBlocks.FLOWERING_AZALEA_LEAF_STAIRS);
	public static final Item FLOWERING_AZALEA_LEAF_WALL = registerBlock(SSWPBlocks.FLOWERING_AZALEA_LEAF_WALL);
	public static final Item FLOWERING_AZALEA_LEAF_CARPET = registerBlock(SSWPBlocks.FLOWERING_AZALEA_LEAF_CARPET);
	
	public static final Item BROWN_MUSHROOM_SLAB = registerBlock(SSWPBlocks.BROWN_MUSHROOM_SLAB);
	public static final Item BROWN_MUSHROOM_STAIRS = registerBlock(SSWPBlocks.BROWN_MUSHROOM_STAIRS);
	public static final Item BROWN_MUSHROOM_WALL = registerBlock(SSWPBlocks.BROWN_MUSHROOM_WALL);
	public static final Item RED_MUSHROOM_SLAB = registerBlock(SSWPBlocks.RED_MUSHROOM_SLAB);
	public static final Item RED_MUSHROOM_STAIRS = registerBlock(SSWPBlocks.RED_MUSHROOM_STAIRS);
	public static final Item RED_MUSHROOM_WALL = registerBlock(SSWPBlocks.RED_MUSHROOM_WALL);
	
	public static final Item NETHER_WART_SLAB = registerBlock(SSWPBlocks.NETHER_WART_SLAB);
	public static final Item NETHER_WART_STAIRS = registerBlock(SSWPBlocks.NETHER_WART_STAIRS);
	public static final Item NETHER_WART_WALL = registerBlock(SSWPBlocks.NETHER_WART_WALL);
	public static final Item WARPED_WART_SLAB = registerBlock(SSWPBlocks.WARPED_WART_SLAB);
	public static final Item WARPED_WART_STAIRS = registerBlock(SSWPBlocks.WARPED_WART_STAIRS);
	public static final Item WARPED_WART_WALL = registerBlock(SSWPBlocks.WARPED_WART_WALL);
	
	public static final Item SHROOMLIGHT_SLAB = registerBlock(SSWPBlocks.SHROOMLIGHT_SLAB);
	public static final Item SHROOMLIGHT_STAIRS = registerBlock(SSWPBlocks.SHROOMLIGHT_STAIRS);
	public static final Item SHROOMLIGHT_WALL = registerBlock(SSWPBlocks.SHROOMLIGHT_WALL);
	
	public static final Item DRIED_KELP_SLAB = registerBlock(SSWPBlocks.DRIED_KELP_SLAB);
	public static final Item DRIED_KELP_STAIRS = registerBlock(SSWPBlocks.DRIED_KELP_STAIRS);
	public static final Item DRIED_KELP_WALL = registerBlock(SSWPBlocks.DRIED_KELP_WALL);
	
	public static final Item TUBE_CORAL_SLAB = registerBlock(SSWPBlocks.TUBE_CORAL_SLAB);
	public static final Item TUBE_CORAL_STAIRS = registerBlock(SSWPBlocks.TUBE_CORAL_STAIRS);
	public static final Item TUBE_CORAL_WALL = registerBlock(SSWPBlocks.TUBE_CORAL_WALL);
	public static final Item BRAIN_CORAL_SLAB = registerBlock(SSWPBlocks.BRAIN_CORAL_SLAB);
	public static final Item BRAIN_CORAL_STAIRS = registerBlock(SSWPBlocks.BRAIN_CORAL_STAIRS);
	public static final Item BRAIN_CORAL_WALL = registerBlock(SSWPBlocks.BRAIN_CORAL_WALL);
	public static final Item BUBBLE_CORAL_SLAB = registerBlock(SSWPBlocks.BUBBLE_CORAL_SLAB);
	public static final Item BUBBLE_CORAL_STAIRS = registerBlock(SSWPBlocks.BUBBLE_CORAL_STAIRS);
	public static final Item BUBBLE_CORAL_WALL = registerBlock(SSWPBlocks.BUBBLE_CORAL_WALL);
	public static final Item FIRE_CORAL_SLAB = registerBlock(SSWPBlocks.FIRE_CORAL_SLAB);
	public static final Item FIRE_CORAL_STAIRS = registerBlock(SSWPBlocks.FIRE_CORAL_STAIRS);
	public static final Item FIRE_CORAL_WALL = registerBlock(SSWPBlocks.FIRE_CORAL_WALL);
	public static final Item HORN_CORAL_SLAB = registerBlock(SSWPBlocks.HORN_CORAL_SLAB);
	public static final Item HORN_CORAL_STAIRS = registerBlock(SSWPBlocks.HORN_CORAL_STAIRS);
	public static final Item HORN_CORAL_WALL = registerBlock(SSWPBlocks.HORN_CORAL_WALL);
	
	public static final Item DEAD_TUBE_CORAL_SLAB = registerBlock(SSWPBlocks.DEAD_TUBE_CORAL_SLAB);
	public static final Item DEAD_TUBE_CORAL_STAIRS = registerBlock(SSWPBlocks.DEAD_TUBE_CORAL_STAIRS);
	public static final Item DEAD_TUBE_CORAL_WALL = registerBlock(SSWPBlocks.DEAD_TUBE_CORAL_WALL);
	public static final Item DEAD_BRAIN_CORAL_SLAB = registerBlock(SSWPBlocks.DEAD_BRAIN_CORAL_SLAB);
	public static final Item DEAD_BRAIN_CORAL_STAIRS = registerBlock(SSWPBlocks.DEAD_BRAIN_CORAL_STAIRS);
	public static final Item DEAD_BRAIN_CORAL_WALL = registerBlock(SSWPBlocks.DEAD_BRAIN_CORAL_WALL);
	public static final Item DEAD_BUBBLE_CORAL_SLAB = registerBlock(SSWPBlocks.DEAD_BUBBLE_CORAL_SLAB);
	public static final Item DEAD_BUBBLE_CORAL_STAIRS = registerBlock(SSWPBlocks.DEAD_BUBBLE_CORAL_STAIRS);
	public static final Item DEAD_BUBBLE_CORAL_WALL = registerBlock(SSWPBlocks.DEAD_BUBBLE_CORAL_WALL);
	public static final Item DEAD_FIRE_CORAL_SLAB = registerBlock(SSWPBlocks.DEAD_FIRE_CORAL_SLAB);
	public static final Item DEAD_FIRE_CORAL_STAIRS = registerBlock(SSWPBlocks.DEAD_FIRE_CORAL_STAIRS);
	public static final Item DEAD_FIRE_CORAL_WALL = registerBlock(SSWPBlocks.DEAD_FIRE_CORAL_WALL);
	public static final Item DEAD_HORN_CORAL_SLAB = registerBlock(SSWPBlocks.DEAD_HORN_CORAL_SLAB);
	public static final Item DEAD_HORN_CORAL_STAIRS = registerBlock(SSWPBlocks.DEAD_HORN_CORAL_STAIRS);
	public static final Item DEAD_HORN_CORAL_WALL = registerBlock(SSWPBlocks.DEAD_HORN_CORAL_WALL);
	
	public static final Item HAY_SLAB = registerBlock(SSWPBlocks.HAY_SLAB);
	public static final Item HAY_STAIRS = registerBlock(SSWPBlocks.HAY_STAIRS);
	public static final Item HAY_WALL = registerBlock(SSWPBlocks.HAY_WALL);
	
	public static final Item HONEYCOMB_SLAB = registerBlock(SSWPBlocks.HONEYCOMB_SLAB);
	public static final Item HONEYCOMB_STAIRS = registerBlock(SSWPBlocks.HONEYCOMB_STAIRS);
	public static final Item HONEYCOMB_WALL = registerBlock(SSWPBlocks.HONEYCOMB_WALL);
	
	public static final Item OCHRE_FROGLIGHT_SLAB = registerBlock(SSWPBlocks.OCHRE_FROGLIGHT_SLAB);
	public static final Item OCHRE_FROGLIGHT_STAIRS = registerBlock(SSWPBlocks.OCHRE_FROGLIGHT_STAIRS);
	public static final Item OCHRE_FROGLIGHT_WALL = registerBlock(SSWPBlocks.OCHRE_FROGLIGHT_WALL);
	public static final Item VERDANT_FROGLIGHT_SLAB = registerBlock(SSWPBlocks.VERDANT_FROGLIGHT_SLAB);
	public static final Item VERDANT_FROGLIGHT_STAIRS = registerBlock(SSWPBlocks.VERDANT_FROGLIGHT_STAIRS);
	public static final Item VERDANT_FROGLIGHT_WALL = registerBlock(SSWPBlocks.VERDANT_FROGLIGHT_WALL);
	public static final Item PEARLESCENT_FROGLIGHT_SLAB = registerBlock(SSWPBlocks.PEARLESCENT_FROGLIGHT_SLAB);
	public static final Item PEARLESCENT_FROGLIGHT_STAIRS = registerBlock(SSWPBlocks.PEARLESCENT_FROGLIGHT_STAIRS);
	public static final Item PEARLESCENT_FROGLIGHT_WALL = registerBlock(SSWPBlocks.PEARLESCENT_FROGLIGHT_WALL);
	
	public static final Item SCULK_SLAB = registerBlock(SSWPBlocks.SCULK_SLAB);
	public static final Item SCULK_STAIRS = registerBlock(SSWPBlocks.SCULK_STAIRS);
	public static final Item SCULK_WALL = registerBlock(SSWPBlocks.SCULK_WALL);
	
	public static final Item BEDROCK_SLAB = registerBlock(SSWPBlocks.BEDROCK_SLAB);
	public static final Item BEDROCK_STAIRS = registerBlock(SSWPBlocks.BEDROCK_STAIRS);
	public static final Item BEDROCK_WALL = registerBlock(SSWPBlocks.BEDROCK_WALL);
	
	public static final Item REDSTONE_LAMP_SLAB = registerBlock(SSWPBlocks.REDSTONE_LAMP_SLAB);
	public static final Item REDSTONE_LAMP_STAIRS = registerBlock(SSWPBlocks.REDSTONE_LAMP_STAIRS);
	public static final Item REDSTONE_LAMP_WALL = registerBlock(SSWPBlocks.REDSTONE_LAMP_WALL);
	
	public static final Item INFESTED_MOSSY_COBBLESTONE = registerBlock(SSWPBlocks.INFESTED_MOSSY_COBBLESTONE);
	public static final Item INFESTED_SMOOTH_STONE = registerBlock(SSWPBlocks.INFESTED_SMOOTH_STONE);
	public static final Item INFESTED_GRANITE = registerBlock(SSWPBlocks.INFESTED_GRANITE);
	public static final Item INFESTED_POLISHED_GRANITE = registerBlock(SSWPBlocks.INFESTED_POLISHED_GRANITE);
	public static final Item INFESTED_DIORITE = registerBlock(SSWPBlocks.INFESTED_DIORITE);
	public static final Item INFESTED_POLISHED_DIORITE = registerBlock(SSWPBlocks.INFESTED_POLISHED_DIORITE);
	public static final Item INFESTED_ANDESITE = registerBlock(SSWPBlocks.INFESTED_ANDESITE);
	public static final Item INFESTED_POLISHED_ANDESITE = registerBlock(SSWPBlocks.INFESTED_POLISHED_ANDESITE);
	public static final Item INFESTED_COBBLED_DEEPSLATE = registerBlock(SSWPBlocks.INFESTED_COBBLED_DEEPSLATE);
	public static final Item INFESTED_CHISELED_DEEPSLATE = registerBlock(SSWPBlocks.INFESTED_CHISELED_DEEPSLATE);
	public static final Item INFESTED_POLISHED_DEEPSLATE = registerBlock(SSWPBlocks.INFESTED_POLISHED_DEEPSLATE);
	public static final Item INFESTED_DEEPSLATE_BRICKS = registerBlock(SSWPBlocks.INFESTED_DEEPSLATE_BRICKS);
	public static final Item INFESTED_CRACKED_DEEPSLATE_BRICKS = registerBlock(SSWPBlocks.INFESTED_CRACKED_DEEPSLATE_BRICKS);
	public static final Item INFESTED_DEEPSLATE_TILES = registerBlock(SSWPBlocks.INFESTED_DEEPSLATE_TILES);
	public static final Item INFESTED_CRACKED_DEEPSLATE_TILES = registerBlock(SSWPBlocks.INFESTED_CRACKED_DEEPSLATE_TILES);
	public static final Item INFESTED_TUFF = registerBlock(SSWPBlocks.INFESTED_TUFF);
	public static final Item INFESTED_CHISELED_TUFF = registerBlock(SSWPBlocks.INFESTED_CHISELED_TUFF);
	public static final Item INFESTED_POLISHED_TUFF = registerBlock(SSWPBlocks.INFESTED_POLISHED_TUFF);
	public static final Item INFESTED_TUFF_BRICKS = registerBlock(SSWPBlocks.INFESTED_TUFF_BRICKS);
	public static final Item INFESTED_CHISELED_TUFF_BRICKS = registerBlock(SSWPBlocks.INFESTED_CHISELED_TUFF_BRICKS);
	public static final Item INFESTED_CALCITE = registerBlock(SSWPBlocks.INFESTED_CALCITE);
	public static final Item INFESTED_DRIPSTONE_BLOCK = registerBlock(SSWPBlocks.INFESTED_DRIPSTONE_BLOCK);
	
	public static final Item OAK_LADDER = registerBlock(SSWPBlocks.OAK_LADDER);
	public static final Item SPRUCE_LADDER = registerBlock(SSWPBlocks.SPRUCE_LADDER);
	public static final Item BIRCH_LADDER = registerBlock(SSWPBlocks.BIRCH_LADDER);
	public static final Item JUNGLE_LADDER = registerBlock(SSWPBlocks.JUNGLE_LADDER);
	public static final Item ACACIA_LADDER = registerBlock(SSWPBlocks.ACACIA_LADDER);
	public static final Item DARK_OAK_LADDER = registerBlock(SSWPBlocks.DARK_OAK_LADDER);
	public static final Item MANGROVE_LADDER = registerBlock(SSWPBlocks.MANGROVE_LADDER);
	public static final Item CHERRY_LADDER = registerBlock(SSWPBlocks.CHERRY_LADDER);
	public static final Item BAMBOO_LADDER = registerBlock(SSWPBlocks.BAMBOO_LADDER);
	public static final Item CRIMSON_LADDER = registerBlock(SSWPBlocks.CRIMSON_LADDER);
	public static final Item WARPED_LADDER = registerBlock(SSWPBlocks.WARPED_LADDER);
	
	public static final Item IRON_LADDER = registerBlock(SSWPBlocks.IRON_LADDER);
	
	public static final Item GOLD_LADDER = registerBlock(SSWPBlocks.GOLD_LADDER);
	
	public static final Item NETHERITE_LADDER = registerBlock(SSWPBlocks.NETHERITE_LADDER, new Item.Settings().fireproof());
	
	public static final Item COPPER_LADDER = registerBlock(SSWPBlocks.COPPER_LADDER);
	public static final Item EXPOSED_COPPER_LADDER = registerBlock(SSWPBlocks.EXPOSED_COPPER_LADDER);
	public static final Item WEATHERED_COPPER_LADDER = registerBlock(SSWPBlocks.WEATHERED_COPPER_LADDER);
	public static final Item OXIDIZED_COPPER_LADDER = registerBlock(SSWPBlocks.OXIDIZED_COPPER_LADDER);
	public static final Item WAXED_COPPER_LADDER = registerBlock(SSWPBlocks.WAXED_COPPER_LADDER);
	public static final Item WAXED_EXPOSED_COPPER_LADDER = registerBlock(SSWPBlocks.WAXED_EXPOSED_COPPER_LADDER);
	public static final Item WAXED_WEATHERED_COPPER_LADDER = registerBlock(SSWPBlocks.WAXED_WEATHERED_COPPER_LADDER);
	public static final Item WAXED_OXIDIZED_COPPER_LADDER = registerBlock(SSWPBlocks.WAXED_OXIDIZED_COPPER_LADDER);
	
	public static final Item IRON_SIGN = registerSign(SSWPBlocks.IRON_SIGN, SSWPBlocks.IRON_WALL_SIGN);
	public static final Item IRON_HANGING_SIGN = registerHangingSign(SSWPBlocks.IRON_HANGING_SIGN, SSWPBlocks.IRON_WALL_HANGING_SIGN);
	
	public static final Item GOLD_SIGN = registerSign(SSWPBlocks.GOLD_SIGN, SSWPBlocks.GOLD_WALL_SIGN);
	public static final Item GOLD_HANGING_SIGN = registerHangingSign(SSWPBlocks.GOLD_HANGING_SIGN, SSWPBlocks.GOLD_WALL_HANGING_SIGN);
	
	public static final Item NETHERITE_SIGN = registerSign(SSWPBlocks.NETHERITE_SIGN, SSWPBlocks.NETHERITE_WALL_SIGN, new Item.Settings().fireproof());
	public static final Item NETHERITE_HANGING_SIGN = registerHangingSign(SSWPBlocks.NETHERITE_HANGING_SIGN, SSWPBlocks.NETHERITE_WALL_HANGING_SIGN, new Item.Settings().fireproof());
	
	public static final Item COPPER_SIGN = registerSign(SSWPBlocks.COPPER_SIGN, SSWPBlocks.COPPER_WALL_SIGN);
	public static final Item COPPER_HANGING_SIGN = registerHangingSign(SSWPBlocks.COPPER_HANGING_SIGN, SSWPBlocks.COPPER_WALL_HANGING_SIGN);
	public static final Item EXPOSED_COPPER_SIGN = registerSign(SSWPBlocks.EXPOSED_COPPER_SIGN, SSWPBlocks.EXPOSED_COPPER_WALL_SIGN);
	public static final Item EXPOSED_COPPER_HANGING_SIGN = registerHangingSign(SSWPBlocks.EXPOSED_COPPER_HANGING_SIGN, SSWPBlocks.EXPOSED_COPPER_WALL_HANGING_SIGN);
	public static final Item WEATHERED_COPPER_SIGN = registerSign(SSWPBlocks.WEATHERED_COPPER_SIGN, SSWPBlocks.WEATHERED_COPPER_WALL_SIGN);
	public static final Item WEATHERED_COPPER_HANGING_SIGN = registerHangingSign(SSWPBlocks.WEATHERED_COPPER_HANGING_SIGN, SSWPBlocks.WEATHERED_COPPER_WALL_HANGING_SIGN);
	public static final Item OXIDIZED_COPPER_SIGN = registerSign(SSWPBlocks.OXIDIZED_COPPER_SIGN, SSWPBlocks.OXIDIZED_COPPER_WALL_SIGN);
	public static final Item OXIDIZED_COPPER_HANGING_SIGN = registerHangingSign(SSWPBlocks.OXIDIZED_COPPER_HANGING_SIGN, SSWPBlocks.OXIDIZED_COPPER_WALL_HANGING_SIGN);
	public static final Item WAXED_COPPER_SIGN = registerSign(SSWPBlocks.WAXED_COPPER_SIGN, SSWPBlocks.WAXED_COPPER_WALL_SIGN);
	public static final Item WAXED_COPPER_HANGING_SIGN = registerHangingSign(SSWPBlocks.WAXED_COPPER_HANGING_SIGN, SSWPBlocks.WAXED_COPPER_WALL_HANGING_SIGN);
	public static final Item WAXED_EXPOSED_COPPER_SIGN = registerSign(SSWPBlocks.WAXED_EXPOSED_COPPER_SIGN, SSWPBlocks.WAXED_EXPOSED_COPPER_WALL_SIGN);
	public static final Item WAXED_EXPOSED_COPPER_HANGING_SIGN = registerHangingSign(SSWPBlocks.WAXED_EXPOSED_COPPER_HANGING_SIGN, SSWPBlocks.WAXED_EXPOSED_COPPER_WALL_HANGING_SIGN);
	public static final Item WAXED_WEATHERED_COPPER_SIGN = registerSign(SSWPBlocks.WAXED_WEATHERED_COPPER_SIGN, SSWPBlocks.WAXED_WEATHERED_COPPER_WALL_SIGN);
	public static final Item WAXED_WEATHERED_COPPER_HANGING_SIGN = registerHangingSign(SSWPBlocks.WAXED_WEATHERED_COPPER_HANGING_SIGN, SSWPBlocks.WAXED_WEATHERED_COPPER_WALL_HANGING_SIGN);
	public static final Item WAXED_OXIDIZED_COPPER_SIGN = registerSign(SSWPBlocks.WAXED_OXIDIZED_COPPER_SIGN, SSWPBlocks.WAXED_OXIDIZED_COPPER_WALL_SIGN);
	public static final Item WAXED_OXIDIZED_COPPER_HANGING_SIGN = registerHangingSign(SSWPBlocks.WAXED_OXIDIZED_COPPER_HANGING_SIGN, SSWPBlocks.WAXED_OXIDIZED_COPPER_WALL_HANGING_SIGN);
	
	public static final Item OAK_BOOKSHELF = registerBlock(SSWPBlocks.OAK_BOOKSHELF);
	public static final Item SPRUCE_BOOKSHELF = registerBlock(SSWPBlocks.SPRUCE_BOOKSHELF);
	public static final Item BIRCH_BOOKSHELF = registerBlock(SSWPBlocks.BIRCH_BOOKSHELF);
	public static final Item JUNGLE_BOOKSHELF = registerBlock(SSWPBlocks.JUNGLE_BOOKSHELF);
	public static final Item ACACIA_BOOKSHELF = registerBlock(SSWPBlocks.ACACIA_BOOKSHELF);
	public static final Item DARK_OAK_BOOKSHELF = registerBlock(SSWPBlocks.DARK_OAK_BOOKSHELF);
	public static final Item MANGROVE_BOOKSHELF = registerBlock(SSWPBlocks.MANGROVE_BOOKSHELF);
	public static final Item CHERRY_BOOKSHELF = registerBlock(SSWPBlocks.CHERRY_BOOKSHELF);
	public static final Item BAMBOO_BOOKSHELF = registerBlock(SSWPBlocks.BAMBOO_BOOKSHELF);
	public static final Item CRIMSON_BOOKSHELF = registerBlock(SSWPBlocks.CRIMSON_BOOKSHELF);
	public static final Item WARPED_BOOKSHELF = registerBlock(SSWPBlocks.WARPED_BOOKSHELF);
	
	public static final Item OAK_CRAFTING_TABLE = registerBlock(SSWPBlocks.OAK_CRAFTING_TABLE);
	public static final Item SPRUCE_CRAFTING_TABLE = registerBlock(SSWPBlocks.SPRUCE_CRAFTING_TABLE);
	public static final Item BIRCH_CRAFTING_TABLE = registerBlock(SSWPBlocks.BIRCH_CRAFTING_TABLE);
	public static final Item JUNGLE_CRAFTING_TABLE = registerBlock(SSWPBlocks.JUNGLE_CRAFTING_TABLE);
	public static final Item ACACIA_CRAFTING_TABLE = registerBlock(SSWPBlocks.ACACIA_CRAFTING_TABLE);
	public static final Item DARK_OAK_CRAFTING_TABLE = registerBlock(SSWPBlocks.DARK_OAK_CRAFTING_TABLE);
	public static final Item MANGROVE_CRAFTING_TABLE = registerBlock(SSWPBlocks.MANGROVE_CRAFTING_TABLE);
	public static final Item CHERRY_CRAFTING_TABLE = registerBlock(SSWPBlocks.CHERRY_CRAFTING_TABLE);
	public static final Item BAMBOO_CRAFTING_TABLE = registerBlock(SSWPBlocks.BAMBOO_CRAFTING_TABLE);
	public static final Item CRIMSON_CRAFTING_TABLE = registerBlock(SSWPBlocks.CRIMSON_CRAFTING_TABLE);
	public static final Item WARPED_CRAFTING_TABLE = registerBlock(SSWPBlocks.WARPED_CRAFTING_TABLE);
	
	public static final Item OAK_LOOM = registerBlock(SSWPBlocks.OAK_LOOM);
	public static final Item SPRUCE_LOOM = registerBlock(SSWPBlocks.SPRUCE_LOOM);
	public static final Item BIRCH_LOOM = registerBlock(SSWPBlocks.BIRCH_LOOM);
	public static final Item JUNGLE_LOOM = registerBlock(SSWPBlocks.JUNGLE_LOOM);
	public static final Item ACACIA_LOOM = registerBlock(SSWPBlocks.ACACIA_LOOM);
	public static final Item DARK_OAK_LOOM = registerBlock(SSWPBlocks.DARK_OAK_LOOM);
	public static final Item MANGROVE_LOOM = registerBlock(SSWPBlocks.MANGROVE_LOOM);
	public static final Item CHERRY_LOOM = registerBlock(SSWPBlocks.CHERRY_LOOM);
	public static final Item BAMBOO_LOOM = registerBlock(SSWPBlocks.BAMBOO_LOOM);
	public static final Item CRIMSON_LOOM = registerBlock(SSWPBlocks.CRIMSON_LOOM);
	public static final Item WARPED_LOOM = registerBlock(SSWPBlocks.WARPED_LOOM);
	
	public static final Item OAK_CARTOGRAPHY_TABLE = registerBlock(SSWPBlocks.OAK_CARTOGRAPHY_TABLE);
	public static final Item SPRUCE_CARTOGRAPHY_TABLE = registerBlock(SSWPBlocks.SPRUCE_CARTOGRAPHY_TABLE);
	public static final Item BIRCH_CARTOGRAPHY_TABLE = registerBlock(SSWPBlocks.BIRCH_CARTOGRAPHY_TABLE);
	public static final Item JUNGLE_CARTOGRAPHY_TABLE = registerBlock(SSWPBlocks.JUNGLE_CARTOGRAPHY_TABLE);
	public static final Item ACACIA_CARTOGRAPHY_TABLE = registerBlock(SSWPBlocks.ACACIA_CARTOGRAPHY_TABLE);
	public static final Item DARK_OAK_CARTOGRAPHY_TABLE = registerBlock(SSWPBlocks.DARK_OAK_CARTOGRAPHY_TABLE);
	public static final Item MANGROVE_CARTOGRAPHY_TABLE = registerBlock(SSWPBlocks.MANGROVE_CARTOGRAPHY_TABLE);
	public static final Item CHERRY_CARTOGRAPHY_TABLE = registerBlock(SSWPBlocks.CHERRY_CARTOGRAPHY_TABLE);
	public static final Item BAMBOO_CARTOGRAPHY_TABLE = registerBlock(SSWPBlocks.BAMBOO_CARTOGRAPHY_TABLE);
	public static final Item CRIMSON_CARTOGRAPHY_TABLE = registerBlock(SSWPBlocks.CRIMSON_CARTOGRAPHY_TABLE);
	public static final Item WARPED_CARTOGRAPHY_TABLE = registerBlock(SSWPBlocks.WARPED_CARTOGRAPHY_TABLE);
	
	public static final Item OAK_FLETCHING_TABLE = registerBlock(SSWPBlocks.OAK_FLETCHING_TABLE);
	public static final Item SPRUCE_FLETCHING_TABLE = registerBlock(SSWPBlocks.SPRUCE_FLETCHING_TABLE);
	public static final Item BIRCH_FLETCHING_TABLE = registerBlock(SSWPBlocks.BIRCH_FLETCHING_TABLE);
	public static final Item JUNGLE_FLETCHING_TABLE = registerBlock(SSWPBlocks.JUNGLE_FLETCHING_TABLE);
	public static final Item ACACIA_FLETCHING_TABLE = registerBlock(SSWPBlocks.ACACIA_FLETCHING_TABLE);
	public static final Item DARK_OAK_FLETCHING_TABLE = registerBlock(SSWPBlocks.DARK_OAK_FLETCHING_TABLE);
	public static final Item MANGROVE_FLETCHING_TABLE = registerBlock(SSWPBlocks.MANGROVE_FLETCHING_TABLE);
	public static final Item CHERRY_FLETCHING_TABLE = registerBlock(SSWPBlocks.CHERRY_FLETCHING_TABLE);
	public static final Item BAMBOO_FLETCHING_TABLE = registerBlock(SSWPBlocks.BAMBOO_FLETCHING_TABLE);
	public static final Item CRIMSON_FLETCHING_TABLE = registerBlock(SSWPBlocks.CRIMSON_FLETCHING_TABLE);
	public static final Item WARPED_FLETCHING_TABLE = registerBlock(SSWPBlocks.WARPED_FLETCHING_TABLE);
	
	public static final Item OAK_SMITHING_TABLE = registerBlock(SSWPBlocks.OAK_SMITHING_TABLE);
	public static final Item SPRUCE_SMITHING_TABLE = registerBlock(SSWPBlocks.SPRUCE_SMITHING_TABLE);
	public static final Item BIRCH_SMITHING_TABLE = registerBlock(SSWPBlocks.BIRCH_SMITHING_TABLE);
	public static final Item JUNGLE_SMITHING_TABLE = registerBlock(SSWPBlocks.JUNGLE_SMITHING_TABLE);
	public static final Item ACACIA_SMITHING_TABLE = registerBlock(SSWPBlocks.ACACIA_SMITHING_TABLE);
	public static final Item DARK_OAK_SMITHING_TABLE = registerBlock(SSWPBlocks.DARK_OAK_SMITHING_TABLE);
	public static final Item MANGROVE_SMITHING_TABLE = registerBlock(SSWPBlocks.MANGROVE_SMITHING_TABLE);
	public static final Item CHERRY_SMITHING_TABLE = registerBlock(SSWPBlocks.CHERRY_SMITHING_TABLE);
	public static final Item BAMBOO_SMITHING_TABLE = registerBlock(SSWPBlocks.BAMBOO_SMITHING_TABLE);
	public static final Item CRIMSON_SMITHING_TABLE = registerBlock(SSWPBlocks.CRIMSON_SMITHING_TABLE);
	public static final Item WARPED_SMITHING_TABLE = registerBlock(SSWPBlocks.WARPED_SMITHING_TABLE);
	
	public static final Item OAK_COMPOSTER = registerBlock(SSWPBlocks.OAK_COMPOSTER);
	public static final Item SPRUCE_COMPOSTER = registerBlock(SSWPBlocks.SPRUCE_COMPOSTER);
	public static final Item BIRCH_COMPOSTER = registerBlock(SSWPBlocks.BIRCH_COMPOSTER);
	public static final Item JUNGLE_COMPOSTER = registerBlock(SSWPBlocks.JUNGLE_COMPOSTER);
	public static final Item ACACIA_COMPOSTER = registerBlock(SSWPBlocks.ACACIA_COMPOSTER);
	public static final Item DARK_OAK_COMPOSTER = registerBlock(SSWPBlocks.DARK_OAK_COMPOSTER);
	public static final Item MANGROVE_COMPOSTER = registerBlock(SSWPBlocks.MANGROVE_COMPOSTER);
	public static final Item CHERRY_COMPOSTER = registerBlock(SSWPBlocks.CHERRY_COMPOSTER);
	public static final Item BAMBOO_COMPOSTER = registerBlock(SSWPBlocks.BAMBOO_COMPOSTER);
	public static final Item CRIMSON_COMPOSTER = registerBlock(SSWPBlocks.CRIMSON_COMPOSTER);
	public static final Item WARPED_COMPOSTER = registerBlock(SSWPBlocks.WARPED_COMPOSTER);
	
	public static final Item OAK_LECTERN = registerBlock(SSWPBlocks.OAK_LECTERN);
	public static final Item SPRUCE_LECTERN = registerBlock(SSWPBlocks.SPRUCE_LECTERN);
	public static final Item BIRCH_LECTERN = registerBlock(SSWPBlocks.BIRCH_LECTERN);
	public static final Item JUNGLE_LECTERN = registerBlock(SSWPBlocks.JUNGLE_LECTERN);
	public static final Item ACACIA_LECTERN = registerBlock(SSWPBlocks.ACACIA_LECTERN);
	public static final Item DARK_OAK_LECTERN = registerBlock(SSWPBlocks.DARK_OAK_LECTERN);
	public static final Item MANGROVE_LECTERN = registerBlock(SSWPBlocks.MANGROVE_LECTERN);
	public static final Item CHERRY_LECTERN = registerBlock(SSWPBlocks.CHERRY_LECTERN);
	public static final Item BAMBOO_LECTERN = registerBlock(SSWPBlocks.BAMBOO_LECTERN);
	public static final Item CRIMSON_LECTERN = registerBlock(SSWPBlocks.CRIMSON_LECTERN);
	public static final Item WARPED_LECTERN = registerBlock(SSWPBlocks.WARPED_LECTERN);
	
	public static final Item OAK_BARREL = registerBlock(SSWPBlocks.OAK_BARREL);
	public static final Item SPRUCE_BARREL = registerBlock(SSWPBlocks.SPRUCE_BARREL);
	public static final Item BIRCH_BARREL = registerBlock(SSWPBlocks.BIRCH_BARREL);
	public static final Item JUNGLE_BARREL = registerBlock(SSWPBlocks.JUNGLE_BARREL);
	public static final Item ACACIA_BARREL = registerBlock(SSWPBlocks.ACACIA_BARREL);
	public static final Item DARK_OAK_BARREL = registerBlock(SSWPBlocks.DARK_OAK_BARREL);
	public static final Item MANGROVE_BARREL = registerBlock(SSWPBlocks.MANGROVE_BARREL);
	public static final Item CHERRY_BARREL = registerBlock(SSWPBlocks.CHERRY_BARREL);
	public static final Item BAMBOO_BARREL = registerBlock(SSWPBlocks.BAMBOO_BARREL);
	public static final Item CRIMSON_BARREL = registerBlock(SSWPBlocks.CRIMSON_BARREL);
	public static final Item WARPED_BARREL = registerBlock(SSWPBlocks.WARPED_BARREL);
	
	public static final Item OAK_TRIPWIRE_HOOK = registerBlock(SSWPBlocks.OAK_TRIPWIRE_HOOK);
	public static final Item SPRUCE_TRIPWIRE_HOOK = registerBlock(SSWPBlocks.SPRUCE_TRIPWIRE_HOOK);
	public static final Item BIRCH_TRIPWIRE_HOOK = registerBlock(SSWPBlocks.BIRCH_TRIPWIRE_HOOK);
	public static final Item JUNGLE_TRIPWIRE_HOOK = registerBlock(SSWPBlocks.JUNGLE_TRIPWIRE_HOOK);
	public static final Item ACACIA_TRIPWIRE_HOOK = registerBlock(SSWPBlocks.ACACIA_TRIPWIRE_HOOK);
	public static final Item DARK_OAK_TRIPWIRE_HOOK = registerBlock(SSWPBlocks.DARK_OAK_TRIPWIRE_HOOK);
	public static final Item MANGROVE_TRIPWIRE_HOOK = registerBlock(SSWPBlocks.MANGROVE_TRIPWIRE_HOOK);
	public static final Item CHERRY_TRIPWIRE_HOOK = registerBlock(SSWPBlocks.CHERRY_TRIPWIRE_HOOK);
	public static final Item BAMBOO_TRIPWIRE_HOOK = registerBlock(SSWPBlocks.BAMBOO_TRIPWIRE_HOOK);
	public static final Item CRIMSON_TRIPWIRE_HOOK = registerBlock(SSWPBlocks.CRIMSON_TRIPWIRE_HOOK);
	public static final Item WARPED_TRIPWIRE_HOOK = registerBlock(SSWPBlocks.WARPED_TRIPWIRE_HOOK);
	
	public static final Item OAK_BEEHIVE = registerBlock(SSWPBlocks.OAK_BEEHIVE);
	public static final Item SPRUCE_BEEHIVE = registerBlock(SSWPBlocks.SPRUCE_BEEHIVE);
	public static final Item BIRCH_BEEHIVE = registerBlock(SSWPBlocks.BIRCH_BEEHIVE);
	public static final Item JUNGLE_BEEHIVE = registerBlock(SSWPBlocks.JUNGLE_BEEHIVE);
	public static final Item ACACIA_BEEHIVE = registerBlock(SSWPBlocks.ACACIA_BEEHIVE);
	public static final Item DARK_OAK_BEEHIVE = registerBlock(SSWPBlocks.DARK_OAK_BEEHIVE);
	public static final Item MANGROVE_BEEHIVE = registerBlock(SSWPBlocks.MANGROVE_BEEHIVE);
	public static final Item CHERRY_BEEHIVE = registerBlock(SSWPBlocks.CHERRY_BEEHIVE);
	public static final Item BAMBOO_BEEHIVE = registerBlock(SSWPBlocks.BAMBOO_BEEHIVE);
	public static final Item CRIMSON_BEEHIVE = registerBlock(SSWPBlocks.CRIMSON_BEEHIVE);
	public static final Item WARPED_BEEHIVE = registerBlock(SSWPBlocks.WARPED_BEEHIVE);
	
	public static final Item OAK_CHISELED_BOOKSHELF = registerBlock(SSWPBlocks.OAK_CHISELED_BOOKSHELF);
	public static final Item SPRUCE_CHISELED_BOOKSHELF = registerBlock(SSWPBlocks.SPRUCE_CHISELED_BOOKSHELF);
	public static final Item BIRCH_CHISELED_BOOKSHELF = registerBlock(SSWPBlocks.BIRCH_CHISELED_BOOKSHELF);
	public static final Item JUNGLE_CHISELED_BOOKSHELF = registerBlock(SSWPBlocks.JUNGLE_CHISELED_BOOKSHELF);
	public static final Item ACACIA_CHISELED_BOOKSHELF = registerBlock(SSWPBlocks.ACACIA_CHISELED_BOOKSHELF);
	public static final Item DARK_OAK_CHISELED_BOOKSHELF = registerBlock(SSWPBlocks.DARK_OAK_CHISELED_BOOKSHELF);
	public static final Item MANGROVE_CHISELED_BOOKSHELF = registerBlock(SSWPBlocks.MANGROVE_CHISELED_BOOKSHELF);
	public static final Item CHERRY_CHISELED_BOOKSHELF = registerBlock(SSWPBlocks.CHERRY_CHISELED_BOOKSHELF);
	public static final Item BAMBOO_CHISELED_BOOKSHELF = registerBlock(SSWPBlocks.BAMBOO_CHISELED_BOOKSHELF);
	public static final Item CRIMSON_CHISELED_BOOKSHELF = registerBlock(SSWPBlocks.CRIMSON_CHISELED_BOOKSHELF);
	public static final Item WARPED_CHISELED_BOOKSHELF = registerBlock(SSWPBlocks.WARPED_CHISELED_BOOKSHELF);
	
	public static final Item OAK_CHEST = registerBlock(SSWPBlocks.OAK_CHEST);
	public static final Item SPRUCE_CHEST = registerBlock(SSWPBlocks.SPRUCE_CHEST);
	public static final Item BIRCH_CHEST = registerBlock(SSWPBlocks.BIRCH_CHEST);
	public static final Item JUNGLE_CHEST = registerBlock(SSWPBlocks.JUNGLE_CHEST);
	public static final Item ACACIA_CHEST = registerBlock(SSWPBlocks.ACACIA_CHEST);
	public static final Item DARK_OAK_CHEST = registerBlock(SSWPBlocks.DARK_OAK_CHEST);
	public static final Item MANGROVE_CHEST = registerBlock(SSWPBlocks.MANGROVE_CHEST);
	public static final Item CHERRY_CHEST = registerBlock(SSWPBlocks.CHERRY_CHEST);
	public static final Item BAMBOO_CHEST = registerBlock(SSWPBlocks.BAMBOO_CHEST);
	public static final Item CRIMSON_CHEST = registerBlock(SSWPBlocks.CRIMSON_CHEST);
	public static final Item WARPED_CHEST = registerBlock(SSWPBlocks.WARPED_CHEST);
	
	public static final Item OAK_TRAPPED_CHEST = registerBlock(SSWPBlocks.OAK_TRAPPED_CHEST);
	public static final Item SPRUCE_TRAPPED_CHEST = registerBlock(SSWPBlocks.SPRUCE_TRAPPED_CHEST);
	public static final Item BIRCH_TRAPPED_CHEST = registerBlock(SSWPBlocks.BIRCH_TRAPPED_CHEST);
	public static final Item JUNGLE_TRAPPED_CHEST = registerBlock(SSWPBlocks.JUNGLE_TRAPPED_CHEST);
	public static final Item ACACIA_TRAPPED_CHEST = registerBlock(SSWPBlocks.ACACIA_TRAPPED_CHEST);
	public static final Item DARK_OAK_TRAPPED_CHEST = registerBlock(SSWPBlocks.DARK_OAK_TRAPPED_CHEST);
	public static final Item MANGROVE_TRAPPED_CHEST = registerBlock(SSWPBlocks.MANGROVE_TRAPPED_CHEST);
	public static final Item CHERRY_TRAPPED_CHEST = registerBlock(SSWPBlocks.CHERRY_TRAPPED_CHEST);
	public static final Item BAMBOO_TRAPPED_CHEST = registerBlock(SSWPBlocks.BAMBOO_TRAPPED_CHEST);
	public static final Item CRIMSON_TRAPPED_CHEST = registerBlock(SSWPBlocks.CRIMSON_TRAPPED_CHEST);
	public static final Item WARPED_TRAPPED_CHEST = registerBlock(SSWPBlocks.WARPED_TRAPPED_CHEST);
	
	public static final Item GOLD_CAULDRON = registerCauldron(SSWPBlocks.GOLD_CAULDRON, SSWPBlocks.GOLD_WATER_CAULDRON, SSWPBlocks.GOLD_LAVA_CAULDRON, SSWPBlocks.GOLD_POWDER_SNOW_CAULDRON);
	
	public static final Item NETHERITE_CAULDRON = registerCauldron(SSWPBlocks.NETHERITE_CAULDRON, SSWPBlocks.NETHERITE_WATER_CAULDRON, SSWPBlocks.NETHERITE_LAVA_CAULDRON, SSWPBlocks.NETHERITE_POWDER_SNOW_CAULDRON, new Item.Settings().fireproof());
	
	public static final Item COPPER_CAULDRON = registerCauldron(SSWPBlocks.COPPER_CAULDRON, SSWPBlocks.COPPER_WATER_CAULDRON, SSWPBlocks.COPPER_LAVA_CAULDRON, SSWPBlocks.COPPER_POWDER_SNOW_CAULDRON);
	public static final Item EXPOSED_COPPER_CAULDRON = registerCauldron(SSWPBlocks.EXPOSED_COPPER_CAULDRON, SSWPBlocks.EXPOSED_COPPER_WATER_CAULDRON, SSWPBlocks.EXPOSED_COPPER_LAVA_CAULDRON, SSWPBlocks.EXPOSED_COPPER_POWDER_SNOW_CAULDRON);
	public static final Item WEATHERED_COPPER_CAULDRON = registerCauldron(SSWPBlocks.WEATHERED_COPPER_CAULDRON, SSWPBlocks.WEATHERED_COPPER_WATER_CAULDRON, SSWPBlocks.WEATHERED_COPPER_LAVA_CAULDRON, SSWPBlocks.WEATHERED_COPPER_POWDER_SNOW_CAULDRON);
	public static final Item OXIDIZED_COPPER_CAULDRON = registerCauldron(SSWPBlocks.OXIDIZED_COPPER_CAULDRON, SSWPBlocks.OXIDIZED_COPPER_WATER_CAULDRON, SSWPBlocks.OXIDIZED_COPPER_LAVA_CAULDRON, SSWPBlocks.OXIDIZED_COPPER_POWDER_SNOW_CAULDRON);
	public static final Item WAXED_COPPER_CAULDRON = registerCauldron(SSWPBlocks.WAXED_COPPER_CAULDRON, SSWPBlocks.WAXED_COPPER_WATER_CAULDRON, SSWPBlocks.WAXED_COPPER_LAVA_CAULDRON, SSWPBlocks.WAXED_COPPER_POWDER_SNOW_CAULDRON);
	public static final Item WAXED_EXPOSED_COPPER_CAULDRON = registerCauldron(SSWPBlocks.WAXED_EXPOSED_COPPER_CAULDRON, SSWPBlocks.WAXED_EXPOSED_COPPER_WATER_CAULDRON, SSWPBlocks.WAXED_EXPOSED_COPPER_LAVA_CAULDRON, SSWPBlocks.WAXED_EXPOSED_COPPER_POWDER_SNOW_CAULDRON);
	public static final Item WAXED_WEATHERED_COPPER_CAULDRON = registerCauldron(SSWPBlocks.WAXED_WEATHERED_COPPER_CAULDRON, SSWPBlocks.WAXED_WEATHERED_COPPER_WATER_CAULDRON, SSWPBlocks.WAXED_WEATHERED_COPPER_LAVA_CAULDRON, SSWPBlocks.WAXED_WEATHERED_COPPER_POWDER_SNOW_CAULDRON);
	public static final Item WAXED_OXIDIZED_COPPER_CAULDRON = registerCauldron(SSWPBlocks.WAXED_OXIDIZED_COPPER_CAULDRON, SSWPBlocks.WAXED_OXIDIZED_COPPER_WATER_CAULDRON, SSWPBlocks.WAXED_OXIDIZED_COPPER_LAVA_CAULDRON, SSWPBlocks.WAXED_OXIDIZED_COPPER_POWDER_SNOW_CAULDRON);
	
	public static final Item GOLD_LANTERN = registerBlock(SSWPBlocks.GOLD_LANTERN);
	public static final Item GOLD_SOUL_LANTERN = registerBlock(SSWPBlocks.GOLD_SOUL_LANTERN);
	
	public static final Item NETHERITE_LANTERN = registerBlock(SSWPBlocks.NETHERITE_LANTERN, new Item.Settings().fireproof());
	public static final Item NETHERITE_SOUL_LANTERN = registerBlock(SSWPBlocks.NETHERITE_SOUL_LANTERN, new Item.Settings().fireproof());
	
	public static final Item COPPER_LANTERN = registerBlock(SSWPBlocks.COPPER_LANTERN);
	public static final Item COPPER_SOUL_LANTERN = registerBlock(SSWPBlocks.COPPER_SOUL_LANTERN);
	public static final Item EXPOSED_COPPER_LANTERN = registerBlock(SSWPBlocks.EXPOSED_COPPER_LANTERN);
	public static final Item EXPOSED_COPPER_SOUL_LANTERN = registerBlock(SSWPBlocks.EXPOSED_COPPER_SOUL_LANTERN);
	public static final Item WEATHERED_COPPER_LANTERN = registerBlock(SSWPBlocks.WEATHERED_COPPER_LANTERN);
	public static final Item WEATHERED_COPPER_SOUL_LANTERN = registerBlock(SSWPBlocks.WEATHERED_COPPER_SOUL_LANTERN);
	public static final Item OXIDIZED_COPPER_LANTERN = registerBlock(SSWPBlocks.OXIDIZED_COPPER_LANTERN);
	public static final Item OXIDIZED_COPPER_SOUL_LANTERN = registerBlock(SSWPBlocks.OXIDIZED_COPPER_SOUL_LANTERN);
	public static final Item WAXED_COPPER_LANTERN = registerBlock(SSWPBlocks.WAXED_COPPER_LANTERN);
	public static final Item WAXED_COPPER_SOUL_LANTERN = registerBlock(SSWPBlocks.WAXED_COPPER_SOUL_LANTERN);
	public static final Item WAXED_EXPOSED_COPPER_LANTERN = registerBlock(SSWPBlocks.WAXED_EXPOSED_COPPER_LANTERN);
	public static final Item WAXED_EXPOSED_COPPER_SOUL_LANTERN = registerBlock(SSWPBlocks.WAXED_EXPOSED_COPPER_SOUL_LANTERN);
	public static final Item WAXED_WEATHERED_COPPER_LANTERN = registerBlock(SSWPBlocks.WAXED_WEATHERED_COPPER_LANTERN);
	public static final Item WAXED_WEATHERED_COPPER_SOUL_LANTERN = registerBlock(SSWPBlocks.WAXED_WEATHERED_COPPER_SOUL_LANTERN);
	public static final Item WAXED_OXIDIZED_COPPER_LANTERN = registerBlock(SSWPBlocks.WAXED_OXIDIZED_COPPER_LANTERN);
	public static final Item WAXED_OXIDIZED_COPPER_SOUL_LANTERN = registerBlock(SSWPBlocks.WAXED_OXIDIZED_COPPER_SOUL_LANTERN);
	
	public static final Item NETHERITE_ANVIL = registerBlock(SSWPBlocks.NETHERITE_ANVIL, new Item.Settings().fireproof());
	
	public static final Item RED_NETHER_BRICK = register("red_nether_brick");
	public static final Item COPPER_NUGGET = register("copper_nugget");
	public static final Item NETHERITE_NUGGET = register("netherite_nugget");
	
	public static final Item OAK_STICK = register("oak_stick");
	public static final Item SPRUCE_STICK = register("spruce_stick");
	public static final Item BIRCH_STICK = register("birch_stick");
	public static final Item JUNGLE_STICK = register("jungle_stick");
	public static final Item ACACIA_STICK = register("acacia_stick");
	public static final Item DARK_OAK_STICK = register("dark_oak_stick");
	public static final Item MANGROVE_STICK = register("mangrove_stick");
	public static final Item CHERRY_STICK = register("cherry_stick");
	public static final Item BAMBOO_STICK = register("bamboo_stick");
	public static final Item CRIMSON_STICK = register("crimson_stick");
	public static final Item WARPED_STICK = register("warped_stick");
	
	public static Item register(String name) {
		return register(name, new Item.Settings());
	}
	
	public static Item register(String name, Item.Settings settings) {
		return register(name, new Item(settings));
	}
	
	public static Item register(String name, Item item) {
		return Registry.register(Registries.ITEM, Identifier.of(SSWPlus.MOD_ID, name), item);
	}
	
	public static Item registerBlock(Block block) {
		return registerBlock(block, new Item.Settings());
	}
	
	public static Item registerBlock(Block block, Item.Settings settings) {
		return register(Registries.BLOCK.getId(block).getPath(), new BlockItem(block, settings));
	}
	
	public static Item registerTallBlock(Block block) {
		return registerTallBlock(block, new Item.Settings());
	}
	
	public static Item registerTallBlock(Block block, Item.Settings settings) {
		return register(Registries.BLOCK.getId(block).getPath(), new TallBlockItem(block, settings));
	}
	
	public static Item registerSign(Block sign, Block wallSign) {
		return registerSign(sign, wallSign, new Item.Settings());
	}
	
	public static Item registerSign(Block sign, Block wallSign, Item.Settings settings) {
		return register(Registries.BLOCK.getId(sign).getPath(), new SignItem(settings, sign, wallSign));
	}
	
	public static Item registerHangingSign(Block hangingSign, Block wallHangingSign) {
		return registerHangingSign(hangingSign, wallHangingSign, new Item.Settings());
	}
	
	public static Item registerHangingSign(Block hangingSign, Block wallHangingSign, Item.Settings settings) {
		return register(Registries.BLOCK.getId(hangingSign).getPath(), new HangingSignItem(hangingSign, wallHangingSign, settings));
	}
	
	public static Item registerCauldron(Block empty, Block water, Block lava, Block powderSnow) {
		Item item = registerBlock(empty);
		Item.BLOCK_ITEMS.put(water, item);
		Item.BLOCK_ITEMS.put(lava, item);
		Item.BLOCK_ITEMS.put(powderSnow, item);
		return item;
	}
	
	public static Item registerCauldron(Block empty, Block water, Block lava, Block powderSnow, Item.Settings settings) {
		Item item = registerBlock(empty, settings);
		Item.BLOCK_ITEMS.put(water, item);
		Item.BLOCK_ITEMS.put(lava, item);
		Item.BLOCK_ITEMS.put(powderSnow, item);
		return item;
	}
	
	private static void fuel() {
		FuelRegistry reg = FuelRegistry.INSTANCE;
		
		reg.add(COAL_SLAB, 8000);
		reg.add(COAL_STAIRS, 16000);
		reg.add(COAL_WALL, 16000);
		reg.add(SSWPTags.Items.WOOL_SLABS, 50);
		reg.add(SSWPTags.Items.WOOL_STAIRS, 100);
		reg.add(SSWPTags.Items.WOOL_WALLS, 100);
		reg.add(SSWPItems.DRIED_KELP_SLAB, 2001);
		reg.add(SSWPItems.DRIED_KELP_STAIRS, 4001);
		reg.add(SSWPItems.DRIED_KELP_WALL, 4001);
	}
	
	private static void compostableItems() {
		CompostingChanceRegistry reg = CompostingChanceRegistry.INSTANCE;
		
		reg.add(MOSS_SLAB, 0.325f);
		reg.add(MOSS_STAIRS, 0.65f);
		reg.add(MOSS_WALL, 0.65f);
		reg.add(MANGROVE_ROOT_SLAB, 0.15f);
		reg.add(MANGROVE_ROOT_STAIRS, 0.3f);
		reg.add(MANGROVE_ROOT_WALL, 0.3f);
		reg.add(MUSHROOM_STEM_SLAB, 0.325f);
		reg.add(MUSHROOM_STEM_STAIRS, 0.65f);
		reg.add(MUSHROOM_STEM_WALL, 0.65f);
		reg.add(OAK_LEAF_SLAB, 0.15f);
		reg.add(OAK_LEAF_STAIRS, 0.3f);
		reg.add(OAK_LEAF_WALL, 0.3f);
		reg.add(OAK_LEAF_CARPET, 0.125f);
		reg.add(SPRUCE_LEAF_SLAB, 0.15f);
		reg.add(SPRUCE_LEAF_STAIRS, 0.3f);
		reg.add(SPRUCE_LEAF_WALL, 0.3f);
		reg.add(SPRUCE_LEAF_CARPET, 0.125f);
		reg.add(BIRCH_LEAF_SLAB, 0.15f);
		reg.add(BIRCH_LEAF_STAIRS, 0.3f);
		reg.add(BIRCH_LEAF_WALL, 0.3f);
		reg.add(BIRCH_LEAF_CARPET, 0.125f);
		reg.add(JUNGLE_LEAF_SLAB, 0.15f);
		reg.add(JUNGLE_LEAF_STAIRS, 0.3f);
		reg.add(JUNGLE_LEAF_WALL, 0.3f);
		reg.add(JUNGLE_LEAF_CARPET, 0.125f);
		reg.add(ACACIA_LEAF_SLAB, 0.15f);
		reg.add(ACACIA_LEAF_STAIRS, 0.3f);
		reg.add(ACACIA_LEAF_WALL, 0.3f);
		reg.add(ACACIA_LEAF_CARPET, 0.125f);
		reg.add(DARK_OAK_LEAF_SLAB, 0.15f);
		reg.add(DARK_OAK_LEAF_STAIRS, 0.3f);
		reg.add(DARK_OAK_LEAF_WALL, 0.3f);
		reg.add(DARK_OAK_LEAF_CARPET, 0.125f);
		reg.add(MANGROVE_LEAF_SLAB, 0.15f);
		reg.add(MANGROVE_LEAF_STAIRS, 0.3f);
		reg.add(MANGROVE_LEAF_WALL, 0.3f);
		reg.add(MANGROVE_LEAF_CARPET, 0.125f);
		reg.add(CHERRY_LEAF_SLAB, 0.15f);
		reg.add(CHERRY_LEAF_STAIRS, 0.3f);
		reg.add(CHERRY_LEAF_WALL, 0.3f);
		reg.add(CHERRY_LEAF_CARPET, 0.125f);
		reg.add(AZALEA_LEAF_SLAB, 0.15f);
		reg.add(AZALEA_LEAF_STAIRS, 0.3f);
		reg.add(AZALEA_LEAF_WALL, 0.3f);
		reg.add(AZALEA_LEAF_CARPET, 0.125f);
		reg.add(FLOWERING_AZALEA_LEAF_SLAB, 0.15f);
		reg.add(FLOWERING_AZALEA_LEAF_STAIRS, 0.3f);
		reg.add(FLOWERING_AZALEA_LEAF_WALL, 0.3f);
		reg.add(FLOWERING_AZALEA_LEAF_CARPET, 0.125f);
		reg.add(BROWN_MUSHROOM_SLAB, 0.425f);
		reg.add(BROWN_MUSHROOM_STAIRS, 0.85f);
		reg.add(BROWN_MUSHROOM_WALL, 0.85f);
		reg.add(RED_MUSHROOM_SLAB, 0.425f);
		reg.add(RED_MUSHROOM_STAIRS, 0.85f);
		reg.add(RED_MUSHROOM_WALL, 0.85f);
		reg.add(NETHER_WART_SLAB, 0.425f);
		reg.add(NETHER_WART_STAIRS, 0.85f);
		reg.add(NETHER_WART_WALL, 0.85f);
		reg.add(WARPED_WART_SLAB, 0.425f);
		reg.add(WARPED_WART_STAIRS, 0.85f);
		reg.add(WARPED_WART_WALL, 0.85f);
		reg.add(SHROOMLIGHT_SLAB, 0.325f);
		reg.add(SHROOMLIGHT_STAIRS, 0.65f);
		reg.add(SHROOMLIGHT_WALL, 0.65f);
		reg.add(DRIED_KELP_SLAB, 0.25f);
		reg.add(DRIED_KELP_STAIRS, 0.5f);
		reg.add(DRIED_KELP_WALL, 0.5f);
		reg.add(HAY_SLAB, 0.425f);
		reg.add(HAY_STAIRS, 0.85f);
		reg.add(HAY_WALL, 0.85f);
	}
}