package gay.mountainspring.sswplus.datagen;

import java.util.concurrent.CompletableFuture;

import gay.mountainspring.aquifer.tag.AquiferTags;
import gay.mountainspring.sswplus.block.SSWPBlocks;
import gay.mountainspring.sswplus.item.SSWPItems;
import gay.mountainspring.sswplus.tag.SSWPTags;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider.BlockTagProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider.ItemTagProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalBlockTags;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;

public class SSWPTagGen {
	private SSWPTagGen() {}
	
	protected static final class BlockTagGen extends BlockTagProvider {
		protected BlockTagGen(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
			super(output, registriesFuture);
		}
		
		@Override
		public void configure(WrapperLookup wrapperLookup) {
			this.getOrCreateTagBuilder(SSWPTags.Blocks.OAK_SLABS)
			.add(Blocks.OAK_SLAB,
					SSWPBlocks.OAK_LOG_SLAB,
					SSWPBlocks.OAK_WOOD_SLAB,
					SSWPBlocks.STRIPPED_OAK_LOG_SLAB,
					SSWPBlocks.STRIPPED_OAK_WOOD_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.OAK_STAIRS)
			.add(Blocks.OAK_STAIRS,
					SSWPBlocks.OAK_LOG_STAIRS,
					SSWPBlocks.OAK_WOOD_STAIRS,
					SSWPBlocks.STRIPPED_OAK_LOG_STAIRS,
					SSWPBlocks.STRIPPED_OAK_WOOD_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.OAK_WALLS)
			.add(SSWPBlocks.OAK_LOG_WALL,
					SSWPBlocks.OAK_WOOD_WALL,
					SSWPBlocks.STRIPPED_OAK_LOG_WALL,
					SSWPBlocks.STRIPPED_OAK_WOOD_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.SPRUCE_SLABS)
			.add(Blocks.SPRUCE_SLAB,
					SSWPBlocks.SPRUCE_LOG_SLAB,
					SSWPBlocks.SPRUCE_WOOD_SLAB,
					SSWPBlocks.STRIPPED_SPRUCE_LOG_SLAB,
					SSWPBlocks.STRIPPED_SPRUCE_WOOD_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.SPRUCE_STAIRS)
			.add(Blocks.SPRUCE_STAIRS,
					SSWPBlocks.SPRUCE_LOG_STAIRS,
					SSWPBlocks.SPRUCE_WOOD_STAIRS,
					SSWPBlocks.STRIPPED_SPRUCE_LOG_STAIRS,
					SSWPBlocks.STRIPPED_SPRUCE_WOOD_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.SPRUCE_WALLS)
			.add(SSWPBlocks.SPRUCE_LOG_WALL,
					SSWPBlocks.SPRUCE_WOOD_WALL,
					SSWPBlocks.STRIPPED_SPRUCE_LOG_WALL,
					SSWPBlocks.STRIPPED_SPRUCE_WOOD_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.BIRCH_SLABS)
			.add(Blocks.BIRCH_SLAB,
					SSWPBlocks.BIRCH_LOG_SLAB,
					SSWPBlocks.BIRCH_WOOD_SLAB,
					SSWPBlocks.STRIPPED_BIRCH_LOG_SLAB,
					SSWPBlocks.STRIPPED_BIRCH_WOOD_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.BIRCH_STAIRS)
			.add(Blocks.BIRCH_STAIRS,
					SSWPBlocks.BIRCH_LOG_STAIRS,
					SSWPBlocks.BIRCH_WOOD_STAIRS,
					SSWPBlocks.STRIPPED_BIRCH_LOG_STAIRS,
					SSWPBlocks.STRIPPED_BIRCH_WOOD_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.BIRCH_WALLS)
			.add(SSWPBlocks.BIRCH_LOG_WALL,
					SSWPBlocks.BIRCH_WOOD_WALL,
					SSWPBlocks.STRIPPED_BIRCH_LOG_WALL,
					SSWPBlocks.STRIPPED_BIRCH_WOOD_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.JUNGLE_SLABS)
			.add(Blocks.JUNGLE_SLAB,
					SSWPBlocks.JUNGLE_LOG_SLAB,
					SSWPBlocks.JUNGLE_WOOD_SLAB,
					SSWPBlocks.STRIPPED_JUNGLE_LOG_SLAB,
					SSWPBlocks.STRIPPED_JUNGLE_WOOD_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.JUNGLE_STAIRS)
			.add(Blocks.JUNGLE_STAIRS,
					SSWPBlocks.JUNGLE_LOG_STAIRS,
					SSWPBlocks.JUNGLE_WOOD_STAIRS,
					SSWPBlocks.STRIPPED_JUNGLE_LOG_STAIRS,
					SSWPBlocks.STRIPPED_JUNGLE_WOOD_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.JUNGLE_WALLS)
			.add(SSWPBlocks.JUNGLE_LOG_WALL,
					SSWPBlocks.JUNGLE_WOOD_WALL,
					SSWPBlocks.STRIPPED_JUNGLE_LOG_WALL,
					SSWPBlocks.STRIPPED_JUNGLE_WOOD_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.ACACIA_SLABS)
			.add(Blocks.ACACIA_SLAB,
					SSWPBlocks.ACACIA_LOG_SLAB,
					SSWPBlocks.ACACIA_WOOD_SLAB,
					SSWPBlocks.STRIPPED_ACACIA_LOG_SLAB,
					SSWPBlocks.STRIPPED_ACACIA_WOOD_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.ACACIA_STAIRS)
			.add(Blocks.ACACIA_STAIRS,
					SSWPBlocks.ACACIA_LOG_STAIRS,
					SSWPBlocks.ACACIA_WOOD_STAIRS,
					SSWPBlocks.STRIPPED_ACACIA_LOG_STAIRS,
					SSWPBlocks.STRIPPED_ACACIA_WOOD_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.ACACIA_WALLS)
			.add(SSWPBlocks.ACACIA_LOG_WALL,
					SSWPBlocks.ACACIA_WOOD_WALL,
					SSWPBlocks.STRIPPED_ACACIA_LOG_WALL,
					SSWPBlocks.STRIPPED_ACACIA_WOOD_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DARK_OAK_SLABS)
			.add(Blocks.DARK_OAK_SLAB,
					SSWPBlocks.DARK_OAK_LOG_SLAB,
					SSWPBlocks.DARK_OAK_WOOD_SLAB,
					SSWPBlocks.STRIPPED_DARK_OAK_LOG_SLAB,
					SSWPBlocks.STRIPPED_DARK_OAK_WOOD_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DARK_OAK_STAIRS)
			.add(Blocks.DARK_OAK_STAIRS,
					SSWPBlocks.DARK_OAK_LOG_STAIRS,
					SSWPBlocks.DARK_OAK_WOOD_STAIRS,
					SSWPBlocks.STRIPPED_DARK_OAK_LOG_STAIRS,
					SSWPBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DARK_OAK_WALLS)
			.add(SSWPBlocks.DARK_OAK_LOG_WALL,
					SSWPBlocks.DARK_OAK_WOOD_WALL,
					SSWPBlocks.STRIPPED_DARK_OAK_LOG_WALL,
					SSWPBlocks.STRIPPED_DARK_OAK_WOOD_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.MANGROVE_SLABS)
			.add(Blocks.MANGROVE_SLAB,
					SSWPBlocks.MANGROVE_LOG_SLAB,
					SSWPBlocks.MANGROVE_WOOD_SLAB,
					SSWPBlocks.STRIPPED_MANGROVE_LOG_SLAB,
					SSWPBlocks.STRIPPED_MANGROVE_WOOD_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.MANGROVE_STAIRS)
			.add(Blocks.MANGROVE_STAIRS,
					SSWPBlocks.MANGROVE_LOG_STAIRS,
					SSWPBlocks.MANGROVE_WOOD_STAIRS,
					SSWPBlocks.STRIPPED_MANGROVE_LOG_STAIRS,
					SSWPBlocks.STRIPPED_MANGROVE_WOOD_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.MANGROVE_WALLS)
			.add(SSWPBlocks.MANGROVE_LOG_WALL,
					SSWPBlocks.MANGROVE_WOOD_WALL,
					SSWPBlocks.STRIPPED_MANGROVE_LOG_WALL,
					SSWPBlocks.STRIPPED_MANGROVE_WOOD_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.CHERRY_SLABS)
			.add(Blocks.CHERRY_SLAB,
					SSWPBlocks.CHERRY_LOG_SLAB,
					SSWPBlocks.CHERRY_WOOD_SLAB,
					SSWPBlocks.STRIPPED_CHERRY_LOG_SLAB,
					SSWPBlocks.STRIPPED_CHERRY_WOOD_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.CHERRY_STAIRS)
			.add(Blocks.CHERRY_STAIRS,
					SSWPBlocks.CHERRY_LOG_STAIRS,
					SSWPBlocks.CHERRY_WOOD_STAIRS,
					SSWPBlocks.STRIPPED_CHERRY_LOG_STAIRS,
					SSWPBlocks.STRIPPED_CHERRY_WOOD_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.CHERRY_WALLS)
			.add(SSWPBlocks.CHERRY_LOG_WALL,
					SSWPBlocks.CHERRY_WOOD_WALL,
					SSWPBlocks.STRIPPED_CHERRY_LOG_WALL,
					SSWPBlocks.STRIPPED_CHERRY_WOOD_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.BAMBOO_PLANKS)
			.add(Blocks.BAMBOO_PLANKS,
					Blocks.BAMBOO_MOSAIC);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.BAMBOO_SLABS)
			.add(Blocks.BAMBOO_SLAB,
					Blocks.BAMBOO_MOSAIC_SLAB,
					SSWPBlocks.BAMBOO_BLOCK_SLAB,
					SSWPBlocks.STRIPPED_BAMBOO_BLOCK_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.BAMBOO_STAIRS)
			.add(Blocks.BAMBOO_STAIRS,
					Blocks.BAMBOO_MOSAIC_STAIRS,
					SSWPBlocks.BAMBOO_BLOCK_STAIRS,
					SSWPBlocks.STRIPPED_BAMBOO_BLOCK_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.BAMBOO_WALLS)
			.add(SSWPBlocks.BAMBOO_BLOCK_WALL,
					SSWPBlocks.STRIPPED_BAMBOO_BLOCK_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.CRIMSON_SLABS)
			.add(Blocks.CRIMSON_SLAB,
					SSWPBlocks.CRIMSON_STEM_SLAB,
					SSWPBlocks.CRIMSON_HYPHAE_SLAB,
					SSWPBlocks.STRIPPED_CRIMSON_STEM_SLAB,
					SSWPBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.CRIMSON_STAIRS)
			.add(Blocks.CRIMSON_STAIRS,
					SSWPBlocks.CRIMSON_STEM_STAIRS,
					SSWPBlocks.CRIMSON_HYPHAE_STAIRS,
					SSWPBlocks.STRIPPED_CRIMSON_STEM_STAIRS,
					SSWPBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.CRIMSON_WALLS)
			.add(SSWPBlocks.CRIMSON_STEM_WALL,
					SSWPBlocks.CRIMSON_HYPHAE_WALL,
					SSWPBlocks.STRIPPED_CRIMSON_STEM_WALL,
					SSWPBlocks.STRIPPED_CRIMSON_HYPHAE_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.WARPED_SLABS)
			.add(Blocks.WARPED_SLAB,
					SSWPBlocks.WARPED_STEM_SLAB,
					SSWPBlocks.WARPED_HYPHAE_SLAB,
					SSWPBlocks.STRIPPED_WARPED_STEM_SLAB,
					SSWPBlocks.STRIPPED_WARPED_HYPHAE_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.WARPED_STAIRS)
			.add(Blocks.WARPED_STAIRS,
					SSWPBlocks.WARPED_STEM_STAIRS,
					SSWPBlocks.WARPED_HYPHAE_STAIRS,
					SSWPBlocks.STRIPPED_WARPED_STEM_STAIRS,
					SSWPBlocks.STRIPPED_WARPED_HYPHAE_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.WARPED_WALLS)
			.add(SSWPBlocks.WARPED_STEM_WALL,
					SSWPBlocks.WARPED_HYPHAE_WALL,
					SSWPBlocks.STRIPPED_WARPED_STEM_WALL,
					SSWPBlocks.STRIPPED_WARPED_HYPHAE_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.STONE_BRICK_SLABS)
			.add(Blocks.STONE_BRICK_SLAB,
					Blocks.MOSSY_STONE_BRICK_SLAB,
					SSWPBlocks.CRACKED_STONE_BRICK_SLAB,
					SSWPBlocks.CHISELED_STONE_BRICK_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.STONE_BRICK_STAIRS)
			.add(Blocks.STONE_BRICK_STAIRS,
					Blocks.MOSSY_STONE_BRICK_STAIRS,
					SSWPBlocks.CRACKED_STONE_BRICK_STAIRS,
					SSWPBlocks.CHISELED_STONE_BRICK_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.STONE_BRICK_WALLS)
			.add(Blocks.STONE_BRICK_WALL,
					Blocks.MOSSY_STONE_BRICK_WALL,
					SSWPBlocks.CRACKED_STONE_BRICK_WALL,
					SSWPBlocks.CHISELED_STONE_BRICK_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.STONE)
			.add(Blocks.STONE,
					Blocks.COBBLESTONE,
					Blocks.MOSSY_COBBLESTONE,
					Blocks.SMOOTH_STONE)
			.forceAddTag(BlockTags.STONE_BRICKS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.STONE_SLABS)
			.add(Blocks.STONE_SLAB,
					Blocks.COBBLESTONE_SLAB,
					Blocks.MOSSY_COBBLESTONE_SLAB,
					Blocks.SMOOTH_STONE_SLAB)
			.addTag(SSWPTags.Blocks.STONE_BRICK_SLABS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.STONE_STAIRS)
			.add(Blocks.STONE_STAIRS,
					Blocks.COBBLESTONE_STAIRS,
					Blocks.MOSSY_COBBLESTONE_STAIRS,
					SSWPBlocks.SMOOTH_STONE_STAIRS)
			.addTag(SSWPTags.Blocks.STONE_BRICK_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.STONE_WALLS)
			.add(SSWPBlocks.STONE_WALL,
					Blocks.COBBLESTONE_WALL,
					Blocks.MOSSY_COBBLESTONE_WALL,
					SSWPBlocks.SMOOTH_STONE_WALL)
			.addTag(SSWPTags.Blocks.STONE_BRICK_WALLS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.GRANITE)
			.add(Blocks.GRANITE,
					Blocks.POLISHED_GRANITE);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.GRANITE_SLABS)
			.add(Blocks.GRANITE_SLAB,
					Blocks.POLISHED_GRANITE_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.GRANITE_STAIRS)
			.add(Blocks.GRANITE_STAIRS,
					Blocks.POLISHED_GRANITE_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.GRANITE_WALLS)
			.add(Blocks.GRANITE_WALL,
					SSWPBlocks.POLISHED_GRANITE_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DIORITE)
			.add(Blocks.DIORITE,
					Blocks.POLISHED_DIORITE);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DIORITE_SLABS)
			.add(Blocks.DIORITE_SLAB,
					Blocks.POLISHED_DIORITE_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DIORITE_STAIRS)
			.add(Blocks.DIORITE_STAIRS,
					Blocks.POLISHED_DIORITE_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DIORITE_WALLS)
			.add(Blocks.DIORITE_WALL,
					SSWPBlocks.POLISHED_DIORITE_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.ANDESITE)
			.add(Blocks.ANDESITE,
					Blocks.POLISHED_ANDESITE);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.ANDESITE_SLABS)
			.add(Blocks.ANDESITE_SLAB,
					Blocks.POLISHED_ANDESITE_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.ANDESITE_STAIRS)
			.add(Blocks.ANDESITE_STAIRS,
					Blocks.POLISHED_ANDESITE_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.ANDESITE_WALLS)
			.add(Blocks.ANDESITE_WALL,
					SSWPBlocks.POLISHED_ANDESITE_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DEEPSLATE_BRICKS)
			.add(Blocks.DEEPSLATE_BRICKS,
					Blocks.CRACKED_DEEPSLATE_BRICKS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DEEPSLATE_BRICK_SLABS)
			.add(Blocks.DEEPSLATE_BRICK_SLAB,
					SSWPBlocks.CRACKED_DEEPSLATE_BRICK_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DEEPSLATE_BRICK_STAIRS)
			.add(Blocks.DEEPSLATE_BRICK_STAIRS,
					SSWPBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DEEPSLATE_BRICK_WALLS)
			.add(Blocks.DEEPSLATE_BRICK_WALL,
					SSWPBlocks.CRACKED_DEEPSLATE_BRICK_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DEEPSLATE_TILES)
			.add(Blocks.DEEPSLATE_TILES,
					Blocks.CRACKED_DEEPSLATE_TILES);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DEEPSLATE_TILE_SLABS)
			.add(Blocks.DEEPSLATE_TILE_SLAB,
					SSWPBlocks.CRACKED_DEEPSLATE_TILE_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DEEPSLATE_TILE_STAIRS)
			.add(Blocks.DEEPSLATE_TILE_STAIRS,
					SSWPBlocks.CRACKED_DEEPSLATE_TILE_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DEEPSLATE_TILE_WALLS)
			.add(Blocks.DEEPSLATE_TILE_WALL,
					SSWPBlocks.CRACKED_DEEPSLATE_TILE_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DEEPSLATE)
			.add(Blocks.DEEPSLATE,
					Blocks.COBBLED_DEEPSLATE,
					Blocks.CHISELED_DEEPSLATE,
					Blocks.POLISHED_DEEPSLATE)
			.addTag(SSWPTags.Blocks.DEEPSLATE_BRICKS)
			.addTag(SSWPTags.Blocks.DEEPSLATE_TILES);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DEEPSLATE_SLABS)
			.add(SSWPBlocks.DEEPSLATE_SLAB,
					Blocks.COBBLED_DEEPSLATE_SLAB,
					SSWPBlocks.CHISELED_DEEPSLATE_SLAB,
					Blocks.POLISHED_DEEPSLATE_SLAB)
			.addTag(SSWPTags.Blocks.DEEPSLATE_BRICK_SLABS)
			.addTag(SSWPTags.Blocks.DEEPSLATE_TILE_SLABS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DEEPSLATE_STAIRS)
			.add(SSWPBlocks.DEEPSLATE_STAIRS,
					Blocks.COBBLED_DEEPSLATE_STAIRS,
					SSWPBlocks.CHISELED_DEEPSLATE_STAIRS,
					Blocks.POLISHED_DEEPSLATE_STAIRS)
			.addTag(SSWPTags.Blocks.DEEPSLATE_BRICK_STAIRS)
			.addTag(SSWPTags.Blocks.DEEPSLATE_TILE_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DEEPSLATE_WALLS)
			.add(SSWPBlocks.DEEPSLATE_WALL,
					Blocks.COBBLED_DEEPSLATE_WALL,
					SSWPBlocks.CHISELED_DEEPSLATE_WALL,
					Blocks.POLISHED_DEEPSLATE_WALL)
			.addTag(SSWPTags.Blocks.DEEPSLATE_BRICK_WALLS)
			.addTag(SSWPTags.Blocks.DEEPSLATE_TILE_WALLS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.TUFF_BRICKS)
			.add(Blocks.TUFF_BRICKS,
					Blocks.CHISELED_TUFF_BRICKS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.TUFF_BRICK_SLABS)
			.add(Blocks.TUFF_BRICK_SLAB,
					SSWPBlocks.CHISELED_TUFF_BRICK_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.TUFF_BRICK_STAIRS)
			.add(Blocks.TUFF_BRICK_STAIRS,
					SSWPBlocks.CHISELED_TUFF_BRICK_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.TUFF_BRICK_WALLS)
			.add(Blocks.TUFF_BRICK_WALL,
					SSWPBlocks.CHISELED_TUFF_BRICK_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.TUFF)
			.add(Blocks.TUFF,
					Blocks.CHISELED_TUFF,
					Blocks.POLISHED_TUFF)
			.addTag(SSWPTags.Blocks.TUFF_BRICKS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.TUFF_SLABS)
			.add(Blocks.TUFF_SLAB,
					SSWPBlocks.CHISELED_TUFF_SLAB,
					Blocks.POLISHED_TUFF_SLAB)
			.addTag(SSWPTags.Blocks.TUFF_BRICK_SLABS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.TUFF_STAIRS)
			.add(Blocks.TUFF_STAIRS,
					SSWPBlocks.CHISELED_TUFF_STAIRS,
					Blocks.POLISHED_TUFF_STAIRS)
			.addTag(SSWPTags.Blocks.TUFF_BRICK_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.TUFF_WALLS)
			.add(Blocks.TUFF_WALL,
					SSWPBlocks.CHISELED_TUFF_WALL,
					Blocks.POLISHED_TUFF_WALL)
			.addTag(SSWPTags.Blocks.TUFF_BRICK_WALLS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.BEIGE_SANDSTONE)
			.add(Blocks.SANDSTONE,
					Blocks.CHISELED_SANDSTONE,
					Blocks.CUT_SANDSTONE,
					Blocks.SMOOTH_SANDSTONE);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.BEIGE_SANDSTONE_SLABS)
			.add(Blocks.SANDSTONE_SLAB,
					SSWPBlocks.CHISELED_SANDSTONE_SLAB,
					Blocks.CUT_SANDSTONE_SLAB,
					Blocks.SMOOTH_SANDSTONE_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.BEIGE_SANDSTONE_STAIRS)
			.add(Blocks.SANDSTONE_STAIRS,
					SSWPBlocks.CHISELED_SANDSTONE_STAIRS,
					SSWPBlocks.CUT_SANDSTONE_STAIRS,
					Blocks.SMOOTH_SANDSTONE_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.BEIGE_SANDSTONE_WALLS)
			.add(Blocks.SANDSTONE_WALL,
					SSWPBlocks.CHISELED_SANDSTONE_WALL,
					SSWPBlocks.CUT_SANDSTONE_WALL,
					SSWPBlocks.SMOOTH_SANDSTONE_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.RED_SANDSTONE)
			.add(Blocks.RED_SANDSTONE,
					Blocks.CHISELED_RED_SANDSTONE,
					Blocks.CUT_RED_SANDSTONE,
					Blocks.SMOOTH_RED_SANDSTONE);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.RED_SANDSTONE_SLABS)
			.add(Blocks.RED_SANDSTONE_SLAB,
					SSWPBlocks.CHISELED_RED_SANDSTONE_SLAB,
					Blocks.CUT_RED_SANDSTONE_SLAB,
					Blocks.SMOOTH_RED_SANDSTONE_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.RED_SANDSTONE_STAIRS)
			.add(Blocks.RED_SANDSTONE_STAIRS,
					SSWPBlocks.CHISELED_RED_SANDSTONE_STAIRS,
					SSWPBlocks.CUT_RED_SANDSTONE_STAIRS,
					Blocks.SMOOTH_RED_SANDSTONE_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.RED_SANDSTONE_WALLS)
			.add(Blocks.RED_SANDSTONE_WALL,
					SSWPBlocks.CHISELED_RED_SANDSTONE_WALL,
					SSWPBlocks.CUT_RED_SANDSTONE_WALL,
					SSWPBlocks.SMOOTH_RED_SANDSTONE_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.SANDSTONE)
			.addTag(SSWPTags.Blocks.BEIGE_SANDSTONE)
			.addTag(SSWPTags.Blocks.RED_SANDSTONE);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.SANDSTONE_SLABS)
			.addTag(SSWPTags.Blocks.BEIGE_SANDSTONE_SLABS)
			.addTag(SSWPTags.Blocks.RED_SANDSTONE_SLABS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.SANDSTONE_STAIRS)
			.addTag(SSWPTags.Blocks.BEIGE_SANDSTONE_STAIRS)
			.addTag(SSWPTags.Blocks.RED_SANDSTONE_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.SANDSTONE_WALLS)
			.addTag(SSWPTags.Blocks.BEIGE_SANDSTONE_WALLS)
			.addTag(SSWPTags.Blocks.RED_SANDSTONE_WALLS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.PRISMARINE)
			.add(Blocks.PRISMARINE,
					Blocks.PRISMARINE_BRICKS,
					Blocks.DARK_PRISMARINE);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.PRISMARINE_SLABS)
			.add(Blocks.PRISMARINE_SLAB,
					Blocks.PRISMARINE_BRICK_SLAB,
					Blocks.DARK_PRISMARINE_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.PRISMARINE_STAIRS)
			.add(Blocks.PRISMARINE_STAIRS,
					Blocks.PRISMARINE_BRICK_STAIRS,
					Blocks.DARK_PRISMARINE_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.PRISMARINE_WALLS)
			.add(Blocks.PRISMARINE_WALL,
					SSWPBlocks.PRISMARINE_BRICK_WALL,
					SSWPBlocks.DARK_PRISMARINE_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.NETHER_BRICK_BLOCKS)
			.add(Blocks.NETHER_BRICKS,
					Blocks.CRACKED_NETHER_BRICKS,
					Blocks.CHISELED_NETHER_BRICKS,
					Blocks.RED_NETHER_BRICKS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.NETHER_BRICK_SLABS)
			.add(Blocks.NETHER_BRICK_SLAB,
					SSWPBlocks.CRACKED_NETHER_BRICK_SLAB,
					SSWPBlocks.CHISELED_NETHER_BRICK_SLAB,
					Blocks.RED_NETHER_BRICK_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.NETHER_BRICK_STAIRS)
			.add(Blocks.NETHER_BRICK_STAIRS,
					SSWPBlocks.CRACKED_NETHER_BRICK_STAIRS,
					SSWPBlocks.CHISELED_NETHER_BRICK_STAIRS,
					Blocks.RED_NETHER_BRICK_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.NETHER_BRICK_WALLS)
			.add(Blocks.NETHER_BRICK_WALL,
					SSWPBlocks.CRACKED_NETHER_BRICK_WALL,
					SSWPBlocks.CHISELED_NETHER_BRICK_WALL,
					Blocks.RED_NETHER_BRICK_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.NETHER_BRICK_FENCES)
			.add(Blocks.NETHER_BRICK_FENCE,
					SSWPBlocks.CRACKED_NETHER_BRICK_FENCE,
					SSWPBlocks.RED_NETHER_BRICK_FENCE);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.NETHER_BRICK_FENCE_GATES)
			.add(SSWPBlocks.NETHER_BRICK_FENCE_GATE,
					SSWPBlocks.CRACKED_NETHER_BRICK_FENCE_GATE,
					SSWPBlocks.RED_NETHER_BRICK_FENCE_GATE);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.BASALT)
			.add(Blocks.BASALT,
					Blocks.SMOOTH_BASALT,
					Blocks.POLISHED_BASALT);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.BASALT_SLABS)
			.add(SSWPBlocks.BASALT_SLAB,
					SSWPBlocks.SMOOTH_BASALT_SLAB,
					SSWPBlocks.POLISHED_BASALT_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.BASALT_STAIRS)
			.add(SSWPBlocks.BASALT_STAIRS,
					SSWPBlocks.SMOOTH_BASALT_STAIRS,
					SSWPBlocks.POLISHED_BASALT_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.BASALT_WALLS)
			.add(SSWPBlocks.BASALT_WALL,
					SSWPBlocks.SMOOTH_BASALT_WALL,
					SSWPBlocks.POLISHED_BASALT_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.BLACKSTONE_BRICKS)
			.add(Blocks.POLISHED_BLACKSTONE_BRICKS,
					Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.BLACKSTONE_BRICK_SLABS)
			.add(Blocks.POLISHED_BLACKSTONE_BRICK_SLAB,
					SSWPBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.BLACKSTONE_BRICK_STAIRS)
			.add(Blocks.POLISHED_BLACKSTONE_BRICK_STAIRS,
					SSWPBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.BLACKSTONE_BRICK_WALLS)
			.add(Blocks.POLISHED_BLACKSTONE_BRICK_WALL,
					SSWPBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.BLACKSTONE)
			.add(Blocks.BLACKSTONE,
					Blocks.GILDED_BLACKSTONE,
					Blocks.CHISELED_POLISHED_BLACKSTONE,
					Blocks.POLISHED_BLACKSTONE)
			.addTag(SSWPTags.Blocks.BLACKSTONE_BRICKS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.BLACKSTONE_SLABS)
			.add(Blocks.BLACKSTONE_SLAB,
					SSWPBlocks.GILDED_BLACKSTONE_SLAB,
					SSWPBlocks.CHISELED_POLISHED_BLACKSTONE_SLAB,
					Blocks.POLISHED_BLACKSTONE_SLAB)
			.addTag(SSWPTags.Blocks.BLACKSTONE_BRICK_SLABS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.BLACKSTONE_STAIRS)
			.add(Blocks.BLACKSTONE_STAIRS,
					SSWPBlocks.GILDED_BLACKSTONE_STAIRS,
					SSWPBlocks.CHISELED_POLISHED_BLACKSTONE_STAIRS,
					Blocks.POLISHED_BLACKSTONE_STAIRS)
			.addTag(SSWPTags.Blocks.BLACKSTONE_BRICK_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.BLACKSTONE_WALLS)
			.add(Blocks.BLACKSTONE_WALL,
					SSWPBlocks.GILDED_BLACKSTONE_WALL,
					SSWPBlocks.CHISELED_POLISHED_BLACKSTONE_WALL,
					Blocks.POLISHED_BLACKSTONE_WALL)
			.addTag(SSWPTags.Blocks.BLACKSTONE_BRICK_WALLS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.PURPUR_BLOCKS)
			.add(Blocks.PURPUR_BLOCK,
					Blocks.PURPUR_PILLAR);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.PURPUR_SLABS)
			.add(Blocks.PURPUR_SLAB,
					SSWPBlocks.PURPUR_PILLAR_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.PURPUR_STAIRS)
			.add(Blocks.PURPUR_STAIRS,
					SSWPBlocks.PURPUR_PILLAR_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.PURPUR_WALLS)
			.add(SSWPBlocks.PURPUR_WALL,
					SSWPBlocks.PURPUR_PILLAR_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.QUARTZ_BLOCKS)
			.add(Blocks.QUARTZ_BLOCK,
					Blocks.CHISELED_QUARTZ_BLOCK,
					Blocks.QUARTZ_BRICKS,
					Blocks.QUARTZ_PILLAR,
					Blocks.SMOOTH_QUARTZ);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.QUARTZ_SLABS)
			.add(Blocks.QUARTZ_SLAB,
					SSWPBlocks.CHISELED_QUARTZ_SLAB,
					SSWPBlocks.QUARTZ_BRICK_SLAB,
					SSWPBlocks.QUARTZ_PILLAR_SLAB,
					Blocks.SMOOTH_QUARTZ_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.QUARTZ_STAIRS)
			.add(Blocks.QUARTZ_STAIRS,
					SSWPBlocks.CHISELED_QUARTZ_STAIRS,
					SSWPBlocks.QUARTZ_BRICK_STAIRS,
					SSWPBlocks.QUARTZ_PILLAR_STAIRS,
					Blocks.SMOOTH_QUARTZ_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.QUARTZ_WALLS)
			.add(SSWPBlocks.QUARTZ_WALL,
					SSWPBlocks.CHISELED_QUARTZ_WALL,
					SSWPBlocks.QUARTZ_BRICK_WALL,
					SSWPBlocks.QUARTZ_PILLAR_WALL,
					SSWPBlocks.SMOOTH_QUARTZ_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.UNWAXED_COPPER_BLOCKS)
			.add(Blocks.COPPER_BLOCK,
					Blocks.CHISELED_COPPER,
					Blocks.COPPER_GRATE,
					Blocks.CUT_COPPER,
					Blocks.EXPOSED_COPPER,
					Blocks.EXPOSED_CHISELED_COPPER,
					Blocks.EXPOSED_COPPER_GRATE,
					Blocks.EXPOSED_CUT_COPPER,
					Blocks.WEATHERED_COPPER,
					Blocks.WEATHERED_CHISELED_COPPER,
					Blocks.WEATHERED_COPPER_GRATE,
					Blocks.WEATHERED_CUT_COPPER,
					Blocks.OXIDIZED_COPPER,
					Blocks.OXIDIZED_CHISELED_COPPER,
					Blocks.OXIDIZED_COPPER_GRATE,
					Blocks.OXIDIZED_CUT_COPPER);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.UNWAXED_COPPER_SLABS)
			.add(SSWPBlocks.COPPER_SLAB,
					SSWPBlocks.CHISELED_COPPER_SLAB,
					SSWPBlocks.COPPER_GRATE_SLAB,
					Blocks.CUT_COPPER_SLAB,
					SSWPBlocks.EXPOSED_COPPER_SLAB,
					SSWPBlocks.EXPOSED_CHISELED_COPPER_SLAB,
					SSWPBlocks.EXPOSED_COPPER_GRATE_SLAB,
					Blocks.EXPOSED_CUT_COPPER_SLAB,
					SSWPBlocks.WEATHERED_COPPER_SLAB,
					SSWPBlocks.WEATHERED_CHISELED_COPPER_SLAB,
					SSWPBlocks.WEATHERED_COPPER_GRATE_SLAB,
					Blocks.WEATHERED_CUT_COPPER_SLAB,
					SSWPBlocks.OXIDIZED_COPPER_SLAB,
					SSWPBlocks.OXIDIZED_CHISELED_COPPER_SLAB,
					SSWPBlocks.OXIDIZED_COPPER_GRATE_SLAB,
					Blocks.OXIDIZED_CUT_COPPER_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.UNWAXED_COPPER_STAIRS)
			.add(SSWPBlocks.COPPER_STAIRS,
					SSWPBlocks.CHISELED_COPPER_STAIRS,
					SSWPBlocks.COPPER_GRATE_STAIRS,
					Blocks.CUT_COPPER_STAIRS,
					SSWPBlocks.EXPOSED_COPPER_STAIRS,
					SSWPBlocks.EXPOSED_CHISELED_COPPER_STAIRS,
					SSWPBlocks.EXPOSED_COPPER_GRATE_STAIRS,
					Blocks.EXPOSED_CUT_COPPER_STAIRS,
					SSWPBlocks.WEATHERED_COPPER_STAIRS,
					SSWPBlocks.WEATHERED_CHISELED_COPPER_STAIRS,
					SSWPBlocks.WEATHERED_COPPER_GRATE_STAIRS,
					Blocks.WEATHERED_CUT_COPPER_STAIRS,
					SSWPBlocks.OXIDIZED_COPPER_STAIRS,
					SSWPBlocks.OXIDIZED_CHISELED_COPPER_STAIRS,
					SSWPBlocks.OXIDIZED_COPPER_GRATE_STAIRS,
					Blocks.OXIDIZED_CUT_COPPER_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.UNWAXED_COPPER_WALLS)
			.add(SSWPBlocks.COPPER_WALL,
					SSWPBlocks.CHISELED_COPPER_WALL,
					SSWPBlocks.COPPER_GRATE_WALL,
					SSWPBlocks.CUT_COPPER_WALL,
					SSWPBlocks.EXPOSED_COPPER_WALL,
					SSWPBlocks.EXPOSED_CHISELED_COPPER_WALL,
					SSWPBlocks.EXPOSED_COPPER_GRATE_WALL,
					SSWPBlocks.EXPOSED_CUT_COPPER_WALL,
					SSWPBlocks.WEATHERED_COPPER_WALL,
					SSWPBlocks.WEATHERED_CHISELED_COPPER_WALL,
					SSWPBlocks.WEATHERED_COPPER_GRATE_WALL,
					SSWPBlocks.WEATHERED_CUT_COPPER_WALL,
					SSWPBlocks.OXIDIZED_COPPER_WALL,
					SSWPBlocks.OXIDIZED_CHISELED_COPPER_WALL,
					SSWPBlocks.OXIDIZED_COPPER_GRATE_WALL,
					SSWPBlocks.OXIDIZED_CUT_COPPER_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.UNWAXED_COPPER_FENCES)
			.add(SSWPBlocks.COPPER_FENCE,
					SSWPBlocks.EXPOSED_COPPER_FENCE,
					SSWPBlocks.WEATHERED_COPPER_FENCE,
					SSWPBlocks.OXIDIZED_COPPER_FENCE);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.UNWAXED_COPPER_FENCE_GATES)
			.add(SSWPBlocks.COPPER_FENCE_GATE,
					SSWPBlocks.EXPOSED_COPPER_FENCE_GATE,
					SSWPBlocks.WEATHERED_COPPER_FENCE_GATE,
					SSWPBlocks.OXIDIZED_COPPER_FENCE_GATE);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.UNWAXED_COPPER_BARS)
			.add(SSWPBlocks.COPPER_BARS,
					SSWPBlocks.EXPOSED_COPPER_BARS,
					SSWPBlocks.WEATHERED_COPPER_BARS,
					SSWPBlocks.OXIDIZED_COPPER_BARS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.UNWAXED_COPPER_DOORS)
			.add(Blocks.COPPER_DOOR,
					Blocks.EXPOSED_COPPER_DOOR,
					Blocks.WEATHERED_COPPER_DOOR,
					Blocks.OXIDIZED_COPPER_DOOR);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.UNWAXED_COPPER_TRAPDOORS)
			.add(Blocks.COPPER_TRAPDOOR,
					Blocks.EXPOSED_COPPER_TRAPDOOR,
					Blocks.WEATHERED_COPPER_TRAPDOOR,
					Blocks.OXIDIZED_COPPER_TRAPDOOR);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.UNWAXED_COPPER_PRESSURE_PLATES)
			.add(SSWPBlocks.COPPER_PRESSURE_PLATE,
					SSWPBlocks.EXPOSED_COPPER_PRESSURE_PLATE,
					SSWPBlocks.WEATHERED_COPPER_PRESSURE_PLATE,
					SSWPBlocks.OXIDIZED_COPPER_PRESSURE_PLATE);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.UNWAXED_COPPER_BUTTONS)
			.add(SSWPBlocks.COPPER_BUTTON,
					SSWPBlocks.EXPOSED_COPPER_BUTTON,
					SSWPBlocks.WEATHERED_COPPER_BUTTON,
					SSWPBlocks.OXIDIZED_COPPER_BUTTON);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.UNWAXED_COPPER_CHAINS)
			.add(SSWPBlocks.COPPER_CHAIN,
					SSWPBlocks.EXPOSED_COPPER_CHAIN,
					SSWPBlocks.WEATHERED_COPPER_CHAIN,
					SSWPBlocks.OXIDIZED_COPPER_CHAIN);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.UNWAXED_COPPER_BULBS)
			.add(Blocks.COPPER_BULB,
					Blocks.EXPOSED_COPPER_BULB,
					Blocks.WEATHERED_COPPER_BULB,
					Blocks.OXIDIZED_COPPER_BULB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.WAXED_COPPER_BLOCKS)
			.add(Blocks.WAXED_COPPER_BLOCK,
					Blocks.WAXED_CHISELED_COPPER,
					Blocks.WAXED_COPPER_GRATE,
					Blocks.WAXED_CUT_COPPER,
					Blocks.WAXED_EXPOSED_COPPER,
					Blocks.WAXED_EXPOSED_CHISELED_COPPER,
					Blocks.WAXED_EXPOSED_COPPER_GRATE,
					Blocks.WAXED_EXPOSED_CUT_COPPER,
					Blocks.WAXED_WEATHERED_COPPER,
					Blocks.WAXED_WEATHERED_CHISELED_COPPER,
					Blocks.WAXED_WEATHERED_COPPER_GRATE,
					Blocks.WAXED_WEATHERED_CUT_COPPER,
					Blocks.WAXED_OXIDIZED_COPPER,
					Blocks.WAXED_OXIDIZED_CHISELED_COPPER,
					Blocks.WAXED_OXIDIZED_COPPER_GRATE,
					Blocks.WAXED_OXIDIZED_CUT_COPPER);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.WAXED_COPPER_SLABS)
			.add(SSWPBlocks.WAXED_COPPER_SLAB,
					SSWPBlocks.WAXED_CHISELED_COPPER_SLAB,
					SSWPBlocks.WAXED_COPPER_GRATE_SLAB,
					Blocks.WAXED_CUT_COPPER_SLAB,
					SSWPBlocks.WAXED_EXPOSED_COPPER_SLAB,
					SSWPBlocks.WAXED_EXPOSED_CHISELED_COPPER_SLAB,
					SSWPBlocks.WAXED_EXPOSED_COPPER_GRATE_SLAB,
					Blocks.WAXED_EXPOSED_CUT_COPPER_SLAB,
					SSWPBlocks.WAXED_WEATHERED_COPPER_SLAB,
					SSWPBlocks.WAXED_WEATHERED_CHISELED_COPPER_SLAB,
					SSWPBlocks.WAXED_WEATHERED_COPPER_GRATE_SLAB,
					Blocks.WAXED_WEATHERED_CUT_COPPER_SLAB,
					SSWPBlocks.WAXED_OXIDIZED_COPPER_SLAB,
					SSWPBlocks.WAXED_OXIDIZED_CHISELED_COPPER_SLAB,
					SSWPBlocks.WAXED_OXIDIZED_COPPER_GRATE_SLAB,
					Blocks.WAXED_OXIDIZED_CUT_COPPER_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.WAXED_COPPER_STAIRS)
			.add(SSWPBlocks.WAXED_COPPER_STAIRS,
					SSWPBlocks.WAXED_CHISELED_COPPER_STAIRS,
					SSWPBlocks.WAXED_COPPER_GRATE_STAIRS,
					Blocks.WAXED_CUT_COPPER_STAIRS,
					SSWPBlocks.WAXED_EXPOSED_COPPER_STAIRS,
					SSWPBlocks.WAXED_EXPOSED_CHISELED_COPPER_STAIRS,
					SSWPBlocks.WAXED_EXPOSED_COPPER_GRATE_STAIRS,
					Blocks.WAXED_EXPOSED_CUT_COPPER_STAIRS,
					SSWPBlocks.WAXED_WEATHERED_COPPER_STAIRS,
					SSWPBlocks.WAXED_WEATHERED_CHISELED_COPPER_STAIRS,
					SSWPBlocks.WAXED_WEATHERED_COPPER_GRATE_STAIRS,
					Blocks.WAXED_WEATHERED_CUT_COPPER_STAIRS,
					SSWPBlocks.WAXED_OXIDIZED_COPPER_STAIRS,
					SSWPBlocks.WAXED_OXIDIZED_CHISELED_COPPER_STAIRS,
					SSWPBlocks.WAXED_OXIDIZED_COPPER_GRATE_STAIRS,
					Blocks.WAXED_OXIDIZED_CUT_COPPER_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.WAXED_COPPER_WALLS)
			.add(SSWPBlocks.WAXED_COPPER_WALL,
					SSWPBlocks.WAXED_CHISELED_COPPER_WALL,
					SSWPBlocks.WAXED_COPPER_GRATE_WALL,
					SSWPBlocks.WAXED_CUT_COPPER_WALL,
					SSWPBlocks.WAXED_EXPOSED_COPPER_WALL,
					SSWPBlocks.WAXED_EXPOSED_CHISELED_COPPER_WALL,
					SSWPBlocks.WAXED_EXPOSED_COPPER_GRATE_WALL,
					SSWPBlocks.WAXED_EXPOSED_CUT_COPPER_WALL,
					SSWPBlocks.WAXED_WEATHERED_COPPER_WALL,
					SSWPBlocks.WAXED_WEATHERED_CHISELED_COPPER_WALL,
					SSWPBlocks.WAXED_WEATHERED_COPPER_GRATE_WALL,
					SSWPBlocks.WAXED_WEATHERED_CUT_COPPER_WALL,
					SSWPBlocks.WAXED_OXIDIZED_COPPER_WALL,
					SSWPBlocks.WAXED_OXIDIZED_CHISELED_COPPER_WALL,
					SSWPBlocks.WAXED_OXIDIZED_COPPER_GRATE_WALL,
					SSWPBlocks.WAXED_OXIDIZED_CUT_COPPER_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.WAXED_COPPER_FENCES)
			.add(SSWPBlocks.WAXED_COPPER_FENCE,
					SSWPBlocks.WAXED_EXPOSED_COPPER_FENCE,
					SSWPBlocks.WAXED_WEATHERED_COPPER_FENCE,
					SSWPBlocks.WAXED_OXIDIZED_COPPER_FENCE);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.WAXED_COPPER_FENCE_GATES)
			.add(SSWPBlocks.WAXED_COPPER_FENCE_GATE,
					SSWPBlocks.WAXED_EXPOSED_COPPER_FENCE_GATE,
					SSWPBlocks.WAXED_WEATHERED_COPPER_FENCE_GATE,
					SSWPBlocks.WAXED_OXIDIZED_COPPER_FENCE_GATE);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.WAXED_COPPER_BARS)
			.add(SSWPBlocks.WAXED_COPPER_BARS,
					SSWPBlocks.WAXED_EXPOSED_COPPER_BARS,
					SSWPBlocks.WAXED_WEATHERED_COPPER_BARS,
					SSWPBlocks.WAXED_OXIDIZED_COPPER_BARS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.WAXED_COPPER_DOORS)
			.add(Blocks.WAXED_COPPER_DOOR,
					Blocks.WAXED_EXPOSED_COPPER_DOOR,
					Blocks.WAXED_WEATHERED_COPPER_DOOR,
					Blocks.WAXED_OXIDIZED_COPPER_DOOR);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.WAXED_COPPER_TRAPDOORS)
			.add(Blocks.WAXED_COPPER_TRAPDOOR,
					Blocks.WAXED_EXPOSED_COPPER_TRAPDOOR,
					Blocks.WAXED_WEATHERED_COPPER_TRAPDOOR,
					Blocks.WAXED_OXIDIZED_COPPER_TRAPDOOR);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.WAXED_COPPER_PRESSURE_PLATES)
			.add(SSWPBlocks.WAXED_COPPER_PRESSURE_PLATE,
					SSWPBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE,
					SSWPBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE,
					SSWPBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.WAXED_COPPER_BUTTONS)
			.add(SSWPBlocks.WAXED_COPPER_BUTTON,
					SSWPBlocks.WAXED_EXPOSED_COPPER_BUTTON,
					SSWPBlocks.WAXED_WEATHERED_COPPER_BUTTON,
					SSWPBlocks.WAXED_OXIDIZED_COPPER_BUTTON);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.WAXED_COPPER_CHAINS)
			.add(SSWPBlocks.WAXED_COPPER_CHAIN,
					SSWPBlocks.WAXED_EXPOSED_COPPER_CHAIN,
					SSWPBlocks.WAXED_WEATHERED_COPPER_CHAIN,
					SSWPBlocks.WAXED_OXIDIZED_COPPER_CHAIN);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.WAXED_COPPER_BULBS)
			.add(Blocks.WAXED_COPPER_BULB,
					Blocks.WAXED_EXPOSED_COPPER_BULB,
					Blocks.WAXED_WEATHERED_COPPER_BULB,
					Blocks.WAXED_OXIDIZED_COPPER_BULB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.COPPER_BLOCKS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_BLOCKS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_BLOCKS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.COPPER_SLABS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_SLABS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_SLABS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.COPPER_STAIRS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_STAIRS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.COPPER_WALLS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_WALLS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_WALLS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.COPPER_FENCES)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_FENCES)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_FENCES);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.COPPER_FENCE_GATES)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_FENCE_GATES)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_FENCE_GATES);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.COPPER_BARS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_BARS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_BARS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.COPPER_DOORS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_DOORS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_DOORS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.COPPER_TRAPDOORS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_TRAPDOORS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_TRAPDOORS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.COPPER_PRESSURE_PLATES)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_PRESSURE_PLATES)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_PRESSURE_PLATES);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.COPPER_BUTTONS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_BUTTONS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_BUTTONS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.COPPER_CHAINS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_CHAINS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_CHAINS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.COPPER_BULBS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_BULBS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_BULBS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.WOOL_SLABS)
			.add(SSWPBlocks.WHITE_WOOL_SLAB,
					SSWPBlocks.LIGHT_GRAY_WOOL_SLAB,
					SSWPBlocks.GRAY_WOOL_SLAB,
					SSWPBlocks.BLACK_WOOL_SLAB,
					SSWPBlocks.BROWN_WOOL_SLAB,
					SSWPBlocks.RED_WOOL_SLAB,
					SSWPBlocks.ORANGE_WOOL_SLAB,
					SSWPBlocks.YELLOW_WOOL_SLAB,
					SSWPBlocks.LIME_WOOL_SLAB,
					SSWPBlocks.GREEN_WOOL_SLAB,
					SSWPBlocks.CYAN_WOOL_SLAB,
					SSWPBlocks.LIGHT_BLUE_WOOL_SLAB,
					SSWPBlocks.BLUE_WOOL_SLAB,
					SSWPBlocks.PURPLE_WOOL_SLAB,
					SSWPBlocks.MAGENTA_WOOL_SLAB,
					SSWPBlocks.PINK_WOOL_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.WOOL_STAIRS)
			.add(SSWPBlocks.WHITE_WOOL_STAIRS,
					SSWPBlocks.LIGHT_GRAY_WOOL_STAIRS,
					SSWPBlocks.GRAY_WOOL_STAIRS,
					SSWPBlocks.BLACK_WOOL_STAIRS,
					SSWPBlocks.BROWN_WOOL_STAIRS,
					SSWPBlocks.RED_WOOL_STAIRS,
					SSWPBlocks.ORANGE_WOOL_STAIRS,
					SSWPBlocks.YELLOW_WOOL_STAIRS,
					SSWPBlocks.LIME_WOOL_STAIRS,
					SSWPBlocks.GREEN_WOOL_STAIRS,
					SSWPBlocks.CYAN_WOOL_STAIRS,
					SSWPBlocks.LIGHT_BLUE_WOOL_STAIRS,
					SSWPBlocks.BLUE_WOOL_STAIRS,
					SSWPBlocks.PURPLE_WOOL_STAIRS,
					SSWPBlocks.MAGENTA_WOOL_STAIRS,
					SSWPBlocks.PINK_WOOL_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.WOOL_WALLS)
			.add(SSWPBlocks.WHITE_WOOL_WALL,
					SSWPBlocks.LIGHT_GRAY_WOOL_WALL,
					SSWPBlocks.GRAY_WOOL_WALL,
					SSWPBlocks.BLACK_WOOL_WALL,
					SSWPBlocks.BROWN_WOOL_WALL,
					SSWPBlocks.RED_WOOL_WALL,
					SSWPBlocks.ORANGE_WOOL_WALL,
					SSWPBlocks.YELLOW_WOOL_WALL,
					SSWPBlocks.LIME_WOOL_WALL,
					SSWPBlocks.GREEN_WOOL_WALL,
					SSWPBlocks.CYAN_WOOL_WALL,
					SSWPBlocks.LIGHT_BLUE_WOOL_WALL,
					SSWPBlocks.BLUE_WOOL_WALL,
					SSWPBlocks.PURPLE_WOOL_WALL,
					SSWPBlocks.MAGENTA_WOOL_WALL,
					SSWPBlocks.PINK_WOOL_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.TERRACOTTA_SLABS)
			.add(SSWPBlocks.TERRACOTTA_SLAB,
					SSWPBlocks.WHITE_TERRACOTTA_SLAB,
					SSWPBlocks.LIGHT_GRAY_TERRACOTTA_SLAB,
					SSWPBlocks.GRAY_TERRACOTTA_SLAB,
					SSWPBlocks.BLACK_TERRACOTTA_SLAB,
					SSWPBlocks.BROWN_TERRACOTTA_SLAB,
					SSWPBlocks.RED_TERRACOTTA_SLAB,
					SSWPBlocks.ORANGE_TERRACOTTA_SLAB,
					SSWPBlocks.YELLOW_TERRACOTTA_SLAB,
					SSWPBlocks.LIME_TERRACOTTA_SLAB,
					SSWPBlocks.GREEN_TERRACOTTA_SLAB,
					SSWPBlocks.CYAN_TERRACOTTA_SLAB,
					SSWPBlocks.LIGHT_BLUE_TERRACOTTA_SLAB,
					SSWPBlocks.BLUE_TERRACOTTA_SLAB,
					SSWPBlocks.PURPLE_TERRACOTTA_SLAB,
					SSWPBlocks.MAGENTA_TERRACOTTA_SLAB,
					SSWPBlocks.PINK_TERRACOTTA_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.TERRACOTTA_STAIRS)
			.add(SSWPBlocks.TERRACOTTA_STAIRS,
					SSWPBlocks.WHITE_TERRACOTTA_STAIRS,
					SSWPBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS,
					SSWPBlocks.GRAY_TERRACOTTA_STAIRS,
					SSWPBlocks.BLACK_TERRACOTTA_STAIRS,
					SSWPBlocks.BROWN_TERRACOTTA_STAIRS,
					SSWPBlocks.RED_TERRACOTTA_STAIRS,
					SSWPBlocks.ORANGE_TERRACOTTA_STAIRS,
					SSWPBlocks.YELLOW_TERRACOTTA_STAIRS,
					SSWPBlocks.LIME_TERRACOTTA_STAIRS,
					SSWPBlocks.GREEN_TERRACOTTA_STAIRS,
					SSWPBlocks.CYAN_TERRACOTTA_STAIRS,
					SSWPBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS,
					SSWPBlocks.BLUE_TERRACOTTA_STAIRS,
					SSWPBlocks.PURPLE_TERRACOTTA_STAIRS,
					SSWPBlocks.MAGENTA_TERRACOTTA_STAIRS,
					SSWPBlocks.PINK_TERRACOTTA_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.TERRACOTTA_WALLS)
			.add(SSWPBlocks.TERRACOTTA_WALL,
					SSWPBlocks.WHITE_TERRACOTTA_WALL,
					SSWPBlocks.LIGHT_GRAY_TERRACOTTA_WALL,
					SSWPBlocks.GRAY_TERRACOTTA_WALL,
					SSWPBlocks.BLACK_TERRACOTTA_WALL,
					SSWPBlocks.BROWN_TERRACOTTA_WALL,
					SSWPBlocks.RED_TERRACOTTA_WALL,
					SSWPBlocks.ORANGE_TERRACOTTA_WALL,
					SSWPBlocks.YELLOW_TERRACOTTA_WALL,
					SSWPBlocks.LIME_TERRACOTTA_WALL,
					SSWPBlocks.GREEN_TERRACOTTA_WALL,
					SSWPBlocks.CYAN_TERRACOTTA_WALL,
					SSWPBlocks.LIGHT_BLUE_TERRACOTTA_WALL,
					SSWPBlocks.BLUE_TERRACOTTA_WALL,
					SSWPBlocks.PURPLE_TERRACOTTA_WALL,
					SSWPBlocks.MAGENTA_TERRACOTTA_WALL,
					SSWPBlocks.PINK_TERRACOTTA_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.CONCRETE_SLABS)
			.add(SSWPBlocks.WHITE_CONCRETE_SLAB,
					SSWPBlocks.LIGHT_GRAY_CONCRETE_SLAB,
					SSWPBlocks.GRAY_CONCRETE_SLAB,
					SSWPBlocks.BLACK_CONCRETE_SLAB,
					SSWPBlocks.BROWN_CONCRETE_SLAB,
					SSWPBlocks.RED_CONCRETE_SLAB,
					SSWPBlocks.ORANGE_CONCRETE_SLAB,
					SSWPBlocks.YELLOW_CONCRETE_SLAB,
					SSWPBlocks.LIME_CONCRETE_SLAB,
					SSWPBlocks.GREEN_CONCRETE_SLAB,
					SSWPBlocks.CYAN_CONCRETE_SLAB,
					SSWPBlocks.LIGHT_BLUE_CONCRETE_SLAB,
					SSWPBlocks.BLUE_CONCRETE_SLAB,
					SSWPBlocks.PURPLE_CONCRETE_SLAB,
					SSWPBlocks.MAGENTA_CONCRETE_SLAB,
					SSWPBlocks.PINK_CONCRETE_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.CONCRETE_STAIRS)
			.add(SSWPBlocks.WHITE_CONCRETE_STAIRS,
					SSWPBlocks.LIGHT_GRAY_CONCRETE_STAIRS,
					SSWPBlocks.GRAY_CONCRETE_STAIRS,
					SSWPBlocks.BLACK_CONCRETE_STAIRS,
					SSWPBlocks.BROWN_CONCRETE_STAIRS,
					SSWPBlocks.RED_CONCRETE_STAIRS,
					SSWPBlocks.ORANGE_CONCRETE_STAIRS,
					SSWPBlocks.YELLOW_CONCRETE_STAIRS,
					SSWPBlocks.LIME_CONCRETE_STAIRS,
					SSWPBlocks.GREEN_CONCRETE_STAIRS,
					SSWPBlocks.CYAN_CONCRETE_STAIRS,
					SSWPBlocks.LIGHT_BLUE_CONCRETE_STAIRS,
					SSWPBlocks.BLUE_CONCRETE_STAIRS,
					SSWPBlocks.PURPLE_CONCRETE_STAIRS,
					SSWPBlocks.MAGENTA_CONCRETE_STAIRS,
					SSWPBlocks.PINK_CONCRETE_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.CONCRETE_WALLS)
			.add(SSWPBlocks.WHITE_CONCRETE_WALL,
					SSWPBlocks.LIGHT_GRAY_CONCRETE_WALL,
					SSWPBlocks.GRAY_CONCRETE_WALL,
					SSWPBlocks.BLACK_CONCRETE_WALL,
					SSWPBlocks.BROWN_CONCRETE_WALL,
					SSWPBlocks.RED_CONCRETE_WALL,
					SSWPBlocks.ORANGE_CONCRETE_WALL,
					SSWPBlocks.YELLOW_CONCRETE_WALL,
					SSWPBlocks.LIME_CONCRETE_WALL,
					SSWPBlocks.GREEN_CONCRETE_WALL,
					SSWPBlocks.CYAN_CONCRETE_WALL,
					SSWPBlocks.LIGHT_BLUE_CONCRETE_WALL,
					SSWPBlocks.BLUE_CONCRETE_WALL,
					SSWPBlocks.PURPLE_CONCRETE_WALL,
					SSWPBlocks.MAGENTA_CONCRETE_WALL,
					SSWPBlocks.PINK_CONCRETE_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.GLASS_SLABS)
			.add(SSWPBlocks.GLASS_SLAB,
					SSWPBlocks.TINTED_GLASS_SLAB,
					SSWPBlocks.WHITE_STAINED_GLASS_SLAB,
					SSWPBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB,
					SSWPBlocks.GRAY_STAINED_GLASS_SLAB,
					SSWPBlocks.BLACK_STAINED_GLASS_SLAB,
					SSWPBlocks.BROWN_STAINED_GLASS_SLAB,
					SSWPBlocks.RED_STAINED_GLASS_SLAB,
					SSWPBlocks.ORANGE_STAINED_GLASS_SLAB,
					SSWPBlocks.YELLOW_STAINED_GLASS_SLAB,
					SSWPBlocks.LIME_STAINED_GLASS_SLAB,
					SSWPBlocks.GREEN_STAINED_GLASS_SLAB,
					SSWPBlocks.CYAN_STAINED_GLASS_SLAB,
					SSWPBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB,
					SSWPBlocks.BLUE_STAINED_GLASS_SLAB,
					SSWPBlocks.PURPLE_STAINED_GLASS_SLAB,
					SSWPBlocks.MAGENTA_STAINED_GLASS_SLAB,
					SSWPBlocks.PINK_STAINED_GLASS_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.GLASS_STAIRS)
			.add(SSWPBlocks.GLASS_STAIRS,
					SSWPBlocks.TINTED_GLASS_STAIRS,
					SSWPBlocks.WHITE_STAINED_GLASS_STAIRS,
					SSWPBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS,
					SSWPBlocks.GRAY_STAINED_GLASS_STAIRS,
					SSWPBlocks.BLACK_STAINED_GLASS_STAIRS,
					SSWPBlocks.BROWN_STAINED_GLASS_STAIRS,
					SSWPBlocks.RED_STAINED_GLASS_STAIRS,
					SSWPBlocks.ORANGE_STAINED_GLASS_STAIRS,
					SSWPBlocks.YELLOW_STAINED_GLASS_STAIRS,
					SSWPBlocks.LIME_STAINED_GLASS_STAIRS,
					SSWPBlocks.GREEN_STAINED_GLASS_STAIRS,
					SSWPBlocks.CYAN_STAINED_GLASS_STAIRS,
					SSWPBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS,
					SSWPBlocks.BLUE_STAINED_GLASS_STAIRS,
					SSWPBlocks.PURPLE_STAINED_GLASS_STAIRS,
					SSWPBlocks.MAGENTA_STAINED_GLASS_STAIRS,
					SSWPBlocks.PINK_STAINED_GLASS_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.GLASS_WALLS)
			.add(SSWPBlocks.GLASS_WALL,
					SSWPBlocks.TINTED_GLASS_WALL,
					SSWPBlocks.WHITE_STAINED_GLASS_WALL,
					SSWPBlocks.LIGHT_GRAY_STAINED_GLASS_WALL,
					SSWPBlocks.GRAY_STAINED_GLASS_WALL,
					SSWPBlocks.BLACK_STAINED_GLASS_WALL,
					SSWPBlocks.BROWN_STAINED_GLASS_WALL,
					SSWPBlocks.RED_STAINED_GLASS_WALL,
					SSWPBlocks.ORANGE_STAINED_GLASS_WALL,
					SSWPBlocks.YELLOW_STAINED_GLASS_WALL,
					SSWPBlocks.LIME_STAINED_GLASS_WALL,
					SSWPBlocks.GREEN_STAINED_GLASS_WALL,
					SSWPBlocks.CYAN_STAINED_GLASS_WALL,
					SSWPBlocks.LIGHT_BLUE_STAINED_GLASS_WALL,
					SSWPBlocks.BLUE_STAINED_GLASS_WALL,
					SSWPBlocks.PURPLE_STAINED_GLASS_WALL,
					SSWPBlocks.MAGENTA_STAINED_GLASS_WALL,
					SSWPBlocks.PINK_STAINED_GLASS_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DIRT_SLABS)
			.add(SSWPBlocks.GRASS_SLAB,
					SSWPBlocks.PODZOL_SLAB,
					SSWPBlocks.MYCELIUM_SLAB,
					SSWPBlocks.DIRT_SLAB,
					SSWPBlocks.COARSE_DIRT_SLAB,
					SSWPBlocks.ROOTED_DIRT_SLAB,
					SSWPBlocks.MUD_SLAB,
					SSWPBlocks.MOSS_SLAB,
					SSWPBlocks.MUDDY_MANGROVE_ROOT_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DIRT_STAIRS)
			.add(SSWPBlocks.GRASS_STAIRS,
					SSWPBlocks.PODZOL_STAIRS,
					SSWPBlocks.MYCELIUM_STAIRS,
					SSWPBlocks.DIRT_STAIRS,
					SSWPBlocks.COARSE_DIRT_STAIRS,
					SSWPBlocks.ROOTED_DIRT_STAIRS,
					SSWPBlocks.MUD_STAIRS,
					SSWPBlocks.MOSS_STAIRS,
					SSWPBlocks.MUDDY_MANGROVE_ROOT_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DIRT_WALLS)
			.add(SSWPBlocks.GRASS_WALL,
					SSWPBlocks.PODZOL_WALL,
					SSWPBlocks.MYCELIUM_WALL,
					SSWPBlocks.DIRT_WALL,
					SSWPBlocks.COARSE_DIRT_WALL,
					SSWPBlocks.ROOTED_DIRT_WALL,
					SSWPBlocks.MUD_WALL,
					SSWPBlocks.MOSS_WALL,
					SSWPBlocks.MUDDY_MANGROVE_ROOT_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.ICE_SLABS)
			.add(SSWPBlocks.ICE_SLAB,
					SSWPBlocks.PACKED_ICE_SLAB,
					SSWPBlocks.BLUE_ICE_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.ICE_STAIRS)
			.add(SSWPBlocks.ICE_STAIRS,
					SSWPBlocks.PACKED_ICE_STAIRS,
					SSWPBlocks.BLUE_ICE_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.ICE_WALLS)
			.add(SSWPBlocks.ICE_WALL,
					SSWPBlocks.PACKED_ICE_WALL,
					SSWPBlocks.BLUE_ICE_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.OBSIDIAN)
			.add(Blocks.OBSIDIAN,
					Blocks.CRYING_OBSIDIAN);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.OBSIDIAN_SLABS)
			.add(SSWPBlocks.OBSIDIAN_SLAB,
					SSWPBlocks.CRYING_OBSIDIAN_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.OBSIDIAN_STAIRS)
			.add(SSWPBlocks.OBSIDIAN_STAIRS,
					SSWPBlocks.CRYING_OBSIDIAN_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.OBSIDIAN_WALLS)
			.add(SSWPBlocks.OBSIDIAN_WALL,
					SSWPBlocks.CRYING_OBSIDIAN_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.NYLIUM_SLABS)
			.add(SSWPBlocks.CRIMSON_NYLIUM_SLAB,
					SSWPBlocks.WARPED_NYLIUM_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.NYLIUM_STAIRS)
			.add(SSWPBlocks.CRIMSON_NYLIUM_STAIRS,
					SSWPBlocks.WARPED_NYLIUM_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.NYLIUM_WALLS)
			.add(SSWPBlocks.CRIMSON_NYLIUM_WALL,
					SSWPBlocks.WARPED_NYLIUM_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.COAL_ORE_SLABS)
			.add(SSWPBlocks.COAL_ORE_SLAB,
					SSWPBlocks.DEEPSLATE_COAL_ORE_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.COAL_ORE_STAIRS)
			.add(SSWPBlocks.COAL_ORE_STAIRS,
					SSWPBlocks.DEEPSLATE_COAL_ORE_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.COAL_ORE_WALLS)
			.add(SSWPBlocks.COAL_ORE_WALL,
					SSWPBlocks.DEEPSLATE_COAL_ORE_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.IRON_ORE_SLABS)
			.add(SSWPBlocks.IRON_ORE_SLAB,
					SSWPBlocks.DEEPSLATE_IRON_ORE_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.IRON_ORE_STAIRS)
			.add(SSWPBlocks.IRON_ORE_STAIRS,
					SSWPBlocks.DEEPSLATE_IRON_ORE_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.IRON_ORE_WALLS)
			.add(SSWPBlocks.IRON_ORE_WALL,
					SSWPBlocks.DEEPSLATE_IRON_ORE_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.COPPER_ORE_SLABS)
			.add(SSWPBlocks.COPPER_ORE_SLAB,
					SSWPBlocks.DEEPSLATE_COPPER_ORE_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.COPPER_ORE_STAIRS)
			.add(SSWPBlocks.COPPER_ORE_STAIRS,
					SSWPBlocks.DEEPSLATE_COPPER_ORE_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.COPPER_ORE_WALLS)
			.add(SSWPBlocks.COPPER_ORE_WALL,
					SSWPBlocks.DEEPSLATE_COPPER_ORE_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.GOLD_ORE_SLABS)
			.add(SSWPBlocks.GOLD_ORE_SLAB,
					SSWPBlocks.DEEPSLATE_GOLD_ORE_SLAB,
					SSWPBlocks.NETHER_GOLD_ORE_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.GOLD_ORE_STAIRS)
			.add(SSWPBlocks.GOLD_ORE_STAIRS,
					SSWPBlocks.DEEPSLATE_GOLD_ORE_STAIRS,
					SSWPBlocks.NETHER_GOLD_ORE_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.GOLD_ORE_WALLS)
			.add(SSWPBlocks.GOLD_ORE_WALL,
					SSWPBlocks.DEEPSLATE_GOLD_ORE_WALL,
					SSWPBlocks.NETHER_GOLD_ORE_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.REDSTONE_ORE_SLABS)
			.add(SSWPBlocks.REDSTONE_ORE_SLAB,
					SSWPBlocks.DEEPSLATE_REDSTONE_ORE_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.REDSTONE_ORE_STAIRS)
			.add(SSWPBlocks.REDSTONE_ORE_STAIRS,
					SSWPBlocks.DEEPSLATE_REDSTONE_ORE_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.REDSTONE_ORE_WALLS)
			.add(SSWPBlocks.REDSTONE_ORE_WALL,
					SSWPBlocks.DEEPSLATE_REDSTONE_ORE_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.EMERALD_ORE_SLABS)
			.add(SSWPBlocks.EMERALD_ORE_SLAB,
					SSWPBlocks.DEEPSLATE_EMERALD_ORE_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.EMERALD_ORE_STAIRS)
			.add(SSWPBlocks.EMERALD_ORE_STAIRS,
					SSWPBlocks.DEEPSLATE_EMERALD_ORE_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.EMERALD_ORE_WALLS)
			.add(SSWPBlocks.EMERALD_ORE_WALL,
					SSWPBlocks.DEEPSLATE_EMERALD_ORE_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.LAPIS_ORE_SLABS)
			.add(SSWPBlocks.LAPIS_ORE_SLAB,
					SSWPBlocks.DEEPSLATE_LAPIS_ORE_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.LAPIS_ORE_STAIRS)
			.add(SSWPBlocks.LAPIS_ORE_STAIRS,
					SSWPBlocks.DEEPSLATE_LAPIS_ORE_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.LAPIS_ORE_WALLS)
			.add(SSWPBlocks.LAPIS_ORE_WALL,
					SSWPBlocks.DEEPSLATE_LAPIS_ORE_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DIAMOND_ORE_SLABS)
			.add(SSWPBlocks.DIAMOND_ORE_SLAB,
					SSWPBlocks.DEEPSLATE_DIAMOND_ORE_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DIAMOND_ORE_STAIRS)
			.add(SSWPBlocks.DIAMOND_ORE_STAIRS,
					SSWPBlocks.DEEPSLATE_DIAMOND_ORE_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DIAMOND_ORE_WALLS)
			.add(SSWPBlocks.DIAMOND_ORE_WALL,
					SSWPBlocks.DEEPSLATE_DIAMOND_ORE_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.QUARTZ_ORES)
			.add(Blocks.NETHER_QUARTZ_ORE);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.QUARTZ_ORE_SLABS)
			.add(SSWPBlocks.NETHER_QUARTZ_ORE_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.QUARTZ_ORE_STAIRS)
			.add(SSWPBlocks.NETHER_QUARTZ_ORE_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.QUARTZ_ORE_WALLS)
			.add(SSWPBlocks.NETHER_QUARTZ_ORE_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.MUSHROOM_BLOCKS)
			.add(Blocks.MUSHROOM_STEM,
					Blocks.BROWN_MUSHROOM_BLOCK,
					Blocks.RED_MUSHROOM_BLOCK);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.MUSHROOM_SLABS)
			.add(SSWPBlocks.MUSHROOM_STEM_SLAB,
					SSWPBlocks.BROWN_MUSHROOM_SLAB,
					SSWPBlocks.RED_MUSHROOM_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.MUSHROOM_STAIRS)
			.add(SSWPBlocks.MUSHROOM_STEM_STAIRS,
					SSWPBlocks.BROWN_MUSHROOM_STAIRS,
					SSWPBlocks.RED_MUSHROOM_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.MUSHROOM_WALLS)
			.add(SSWPBlocks.MUSHROOM_STEM_WALL,
					SSWPBlocks.BROWN_MUSHROOM_WALL,
					SSWPBlocks.RED_MUSHROOM_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.WART_BLOCKS)
			.add(Blocks.NETHER_WART_BLOCK,
					Blocks.WARPED_WART_BLOCK);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.WART_SLABS)
			.add(SSWPBlocks.NETHER_WART_SLAB,
					SSWPBlocks.WARPED_WART_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.WART_STAIRS)
			.add(SSWPBlocks.NETHER_WART_STAIRS,
					SSWPBlocks.WARPED_WART_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.WART_WALLS)
			.add(SSWPBlocks.NETHER_WART_WALL,
					SSWPBlocks.WARPED_WART_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.CORAL_SLABS)
			.add(SSWPBlocks.TUBE_CORAL_SLAB,
					SSWPBlocks.BRAIN_CORAL_SLAB,
					SSWPBlocks.BUBBLE_CORAL_SLAB,
					SSWPBlocks.FIRE_CORAL_SLAB,
					SSWPBlocks.HORN_CORAL_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.CORAL_STAIRS)
			.add(SSWPBlocks.TUBE_CORAL_STAIRS,
					SSWPBlocks.BRAIN_CORAL_STAIRS,
					SSWPBlocks.BUBBLE_CORAL_STAIRS,
					SSWPBlocks.FIRE_CORAL_STAIRS,
					SSWPBlocks.HORN_CORAL_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.CORAL_WALLS)
			.add(SSWPBlocks.TUBE_CORAL_WALL,
					SSWPBlocks.BRAIN_CORAL_WALL,
					SSWPBlocks.BUBBLE_CORAL_WALL,
					SSWPBlocks.FIRE_CORAL_WALL,
					SSWPBlocks.HORN_CORAL_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DEAD_CORAL_SLABS)
			.add(SSWPBlocks.DEAD_TUBE_CORAL_SLAB,
					SSWPBlocks.DEAD_BRAIN_CORAL_SLAB,
					SSWPBlocks.DEAD_BUBBLE_CORAL_SLAB,
					SSWPBlocks.DEAD_FIRE_CORAL_SLAB,
					SSWPBlocks.DEAD_HORN_CORAL_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DEAD_CORAL_STAIRS)
			.add(SSWPBlocks.DEAD_TUBE_CORAL_STAIRS,
					SSWPBlocks.DEAD_BRAIN_CORAL_STAIRS,
					SSWPBlocks.DEAD_BUBBLE_CORAL_STAIRS,
					SSWPBlocks.DEAD_FIRE_CORAL_STAIRS,
					SSWPBlocks.DEAD_HORN_CORAL_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.DEAD_CORAL_WALLS)
			.add(SSWPBlocks.DEAD_TUBE_CORAL_WALL,
					SSWPBlocks.DEAD_BRAIN_CORAL_WALL,
					SSWPBlocks.DEAD_BUBBLE_CORAL_WALL,
					SSWPBlocks.DEAD_FIRE_CORAL_WALL,
					SSWPBlocks.DEAD_HORN_CORAL_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.FROGLIGHTS)
			.add(Blocks.OCHRE_FROGLIGHT,
					Blocks.VERDANT_FROGLIGHT,
					Blocks.PEARLESCENT_FROGLIGHT);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.FROGLIGHT_SLABS)
			.add(SSWPBlocks.OCHRE_FROGLIGHT_SLAB,
					SSWPBlocks.VERDANT_FROGLIGHT_SLAB,
					SSWPBlocks.PEARLESCENT_FROGLIGHT_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.FROGLIGHT_STAIRS)
			.add(SSWPBlocks.OCHRE_FROGLIGHT_STAIRS,
					SSWPBlocks.VERDANT_FROGLIGHT_STAIRS,
					SSWPBlocks.PEARLESCENT_FROGLIGHT_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.FROGLIGHT_WALLS)
			.add(SSWPBlocks.OCHRE_FROGLIGHT_WALL,
					SSWPBlocks.VERDANT_FROGLIGHT_WALL,
					SSWPBlocks.PEARLESCENT_FROGLIGHT_WALL);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.UNWAXED_COPPER_LADDERS)
			.add(SSWPBlocks.COPPER_LADDER,
					SSWPBlocks.EXPOSED_COPPER_LADDER,
					SSWPBlocks.WEATHERED_COPPER_LADDER,
					SSWPBlocks.OXIDIZED_COPPER_LADDER);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.WAXED_COPPER_LADDERS)
			.add(SSWPBlocks.WAXED_COPPER_LADDER,
					SSWPBlocks.WAXED_EXPOSED_COPPER_LADDER,
					SSWPBlocks.WAXED_WEATHERED_COPPER_LADDER,
					SSWPBlocks.WAXED_OXIDIZED_COPPER_LADDER);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.COPPER_LADDERS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_LADDERS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_LADDERS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.UNWAXED_COPPER_STANDING_SIGNS)
			.add(SSWPBlocks.COPPER_SIGN,
					SSWPBlocks.EXPOSED_COPPER_SIGN,
					SSWPBlocks.WEATHERED_COPPER_SIGN,
					SSWPBlocks.OXIDIZED_COPPER_SIGN);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.UNWAXED_COPPER_WALL_SIGNS)
			.add(SSWPBlocks.COPPER_WALL_SIGN,
					SSWPBlocks.EXPOSED_COPPER_WALL_SIGN,
					SSWPBlocks.WEATHERED_COPPER_WALL_SIGN,
					SSWPBlocks.OXIDIZED_COPPER_WALL_SIGN);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.UNWAXED_COPPER_SIGNS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_STANDING_SIGNS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_WALL_SIGNS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.UNWAXED_COPPER_CEILING_HANGING_SIGNS)
			.add(SSWPBlocks.COPPER_HANGING_SIGN,
					SSWPBlocks.EXPOSED_COPPER_HANGING_SIGN,
					SSWPBlocks.WEATHERED_COPPER_HANGING_SIGN,
					SSWPBlocks.OXIDIZED_COPPER_HANGING_SIGN);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.UNWAXED_COPPER_WALL_HANGING_SIGNS)
			.add(SSWPBlocks.COPPER_WALL_HANGING_SIGN,
					SSWPBlocks.EXPOSED_COPPER_WALL_HANGING_SIGN,
					SSWPBlocks.WEATHERED_COPPER_WALL_HANGING_SIGN,
					SSWPBlocks.OXIDIZED_COPPER_WALL_HANGING_SIGN);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.UNWAXED_COPPER_HANGING_SIGNS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_CEILING_HANGING_SIGNS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_WALL_HANGING_SIGNS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.ALL_UNWAXED_COPPER_SIGNS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_SIGNS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_HANGING_SIGNS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.WAXED_COPPER_STANDING_SIGNS)
			.add(SSWPBlocks.WAXED_COPPER_SIGN,
					SSWPBlocks.WAXED_EXPOSED_COPPER_SIGN,
					SSWPBlocks.WAXED_WEATHERED_COPPER_SIGN,
					SSWPBlocks.WAXED_OXIDIZED_COPPER_SIGN);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.WAXED_COPPER_WALL_SIGNS)
			.add(SSWPBlocks.WAXED_COPPER_WALL_SIGN,
					SSWPBlocks.WAXED_EXPOSED_COPPER_WALL_SIGN,
					SSWPBlocks.WAXED_WEATHERED_COPPER_WALL_SIGN,
					SSWPBlocks.WAXED_OXIDIZED_COPPER_WALL_SIGN);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.WAXED_COPPER_SIGNS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_STANDING_SIGNS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_WALL_SIGNS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.WAXED_COPPER_CEILING_HANGING_SIGNS)
			.add(SSWPBlocks.WAXED_COPPER_HANGING_SIGN,
					SSWPBlocks.WAXED_EXPOSED_COPPER_HANGING_SIGN,
					SSWPBlocks.WAXED_WEATHERED_COPPER_HANGING_SIGN,
					SSWPBlocks.WAXED_OXIDIZED_COPPER_HANGING_SIGN);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.WAXED_COPPER_WALL_HANGING_SIGNS)
			.add(SSWPBlocks.WAXED_COPPER_WALL_HANGING_SIGN,
					SSWPBlocks.WAXED_EXPOSED_COPPER_WALL_HANGING_SIGN,
					SSWPBlocks.WAXED_WEATHERED_COPPER_WALL_HANGING_SIGN,
					SSWPBlocks.WAXED_OXIDIZED_COPPER_WALL_HANGING_SIGN);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.WAXED_COPPER_HANGING_SIGNS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_CEILING_HANGING_SIGNS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_WALL_HANGING_SIGNS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.ALL_WAXED_COPPER_SIGNS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_SIGNS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_HANGING_SIGNS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.COPPER_STANDING_SIGNS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_STANDING_SIGNS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_STANDING_SIGNS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.COPPER_WALL_SIGNS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_WALL_SIGNS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_WALL_SIGNS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.COPPER_SIGNS)
			.addTag(SSWPTags.Blocks.COPPER_STANDING_SIGNS)
			.addTag(SSWPTags.Blocks.COPPER_WALL_SIGNS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.COPPER_CEILING_HANGING_SIGNS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_CEILING_HANGING_SIGNS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_CEILING_HANGING_SIGNS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.COPPER_WALL_HANGING_SIGNS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_WALL_HANGING_SIGNS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_WALL_HANGING_SIGNS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.COPPER_HANGING_SIGNS)
			.addTag(SSWPTags.Blocks.COPPER_CEILING_HANGING_SIGNS)
			.addTag(SSWPTags.Blocks.COPPER_WALL_HANGING_SIGNS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.ALL_COPPER_SIGNS)
			.addTag(SSWPTags.Blocks.COPPER_SIGNS)
			.addTag(SSWPTags.Blocks.COPPER_HANGING_SIGNS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.UNWAXED_COPPER_CAULDRONS)
			.add(SSWPBlocks.COPPER_CAULDRON,
					SSWPBlocks.COPPER_WATER_CAULDRON,
					SSWPBlocks.COPPER_LAVA_CAULDRON,
					SSWPBlocks.COPPER_POWDER_SNOW_CAULDRON,
					SSWPBlocks.EXPOSED_COPPER_CAULDRON,
					SSWPBlocks.EXPOSED_COPPER_WATER_CAULDRON,
					SSWPBlocks.EXPOSED_COPPER_LAVA_CAULDRON,
					SSWPBlocks.EXPOSED_COPPER_POWDER_SNOW_CAULDRON,
					SSWPBlocks.WEATHERED_COPPER_CAULDRON,
					SSWPBlocks.WEATHERED_COPPER_WATER_CAULDRON,
					SSWPBlocks.WEATHERED_COPPER_LAVA_CAULDRON,
					SSWPBlocks.WEATHERED_COPPER_POWDER_SNOW_CAULDRON,
					SSWPBlocks.OXIDIZED_COPPER_CAULDRON,
					SSWPBlocks.OXIDIZED_COPPER_WATER_CAULDRON,
					SSWPBlocks.OXIDIZED_COPPER_LAVA_CAULDRON,
					SSWPBlocks.OXIDIZED_COPPER_POWDER_SNOW_CAULDRON);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.WAXED_COPPER_CAULDRONS)
			.add(SSWPBlocks.WAXED_COPPER_CAULDRON,
					SSWPBlocks.WAXED_COPPER_WATER_CAULDRON,
					SSWPBlocks.WAXED_COPPER_LAVA_CAULDRON,
					SSWPBlocks.WAXED_COPPER_POWDER_SNOW_CAULDRON,
					SSWPBlocks.WAXED_EXPOSED_COPPER_CAULDRON,
					SSWPBlocks.WAXED_EXPOSED_COPPER_WATER_CAULDRON,
					SSWPBlocks.WAXED_EXPOSED_COPPER_LAVA_CAULDRON,
					SSWPBlocks.WAXED_EXPOSED_COPPER_POWDER_SNOW_CAULDRON,
					SSWPBlocks.WAXED_WEATHERED_COPPER_CAULDRON,
					SSWPBlocks.WAXED_WEATHERED_COPPER_WATER_CAULDRON,
					SSWPBlocks.WAXED_WEATHERED_COPPER_LAVA_CAULDRON,
					SSWPBlocks.WAXED_WEATHERED_COPPER_POWDER_SNOW_CAULDRON,
					SSWPBlocks.WAXED_OXIDIZED_COPPER_CAULDRON,
					SSWPBlocks.WAXED_OXIDIZED_COPPER_WATER_CAULDRON,
					SSWPBlocks.WAXED_OXIDIZED_COPPER_LAVA_CAULDRON,
					SSWPBlocks.WAXED_OXIDIZED_COPPER_POWDER_SNOW_CAULDRON);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.COPPER_CAULDRONS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_CAULDRONS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_CAULDRONS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.UNWAXED_COPPER_NORMAL_LANTERNS)
			.add(SSWPBlocks.COPPER_LANTERN,
					SSWPBlocks.EXPOSED_COPPER_LANTERN,
					SSWPBlocks.WEATHERED_COPPER_LANTERN,
					SSWPBlocks.OXIDIZED_COPPER_LANTERN);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.WAXED_COPPER_NORMAL_LANTERNS)
			.add(SSWPBlocks.WAXED_COPPER_LANTERN,
					SSWPBlocks.WAXED_EXPOSED_COPPER_LANTERN,
					SSWPBlocks.WAXED_WEATHERED_COPPER_LANTERN,
					SSWPBlocks.WAXED_OXIDIZED_COPPER_LANTERN);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.COPPER_NORMAL_LANTERNS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_NORMAL_LANTERNS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_NORMAL_LANTERNS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.UNWAXED_COPPER_SOUL_LANTERNS)
			.add(SSWPBlocks.COPPER_SOUL_LANTERN,
					SSWPBlocks.EXPOSED_COPPER_SOUL_LANTERN,
					SSWPBlocks.WEATHERED_COPPER_SOUL_LANTERN,
					SSWPBlocks.OXIDIZED_COPPER_SOUL_LANTERN);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.WAXED_COPPER_SOUL_LANTERNS)
			.add(SSWPBlocks.WAXED_COPPER_SOUL_LANTERN,
					SSWPBlocks.WAXED_EXPOSED_COPPER_SOUL_LANTERN,
					SSWPBlocks.WAXED_WEATHERED_COPPER_SOUL_LANTERN,
					SSWPBlocks.WAXED_OXIDIZED_COPPER_SOUL_LANTERN);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.COPPER_SOUL_LANTERNS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_SOUL_LANTERNS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_SOUL_LANTERNS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.UNWAXED_COPPER_LANTERNS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_NORMAL_LANTERNS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_SOUL_LANTERNS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.WAXED_COPPER_LANTERNS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_NORMAL_LANTERNS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_SOUL_LANTERNS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.COPPER_LANTERNS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_LANTERNS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_LANTERNS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.NORMAL_LANTERNS)
			.add(Blocks.LANTERN,
					SSWPBlocks.GOLD_LANTERN,
					SSWPBlocks.NETHERITE_LANTERN)
			.addTag(SSWPTags.Blocks.COPPER_NORMAL_LANTERNS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.SOUL_LANTERNS)
			.add(Blocks.SOUL_LANTERN,
					SSWPBlocks.GOLD_SOUL_LANTERN,
					SSWPBlocks.NETHERITE_SOUL_LANTERN)
			.addTag(SSWPTags.Blocks.COPPER_SOUL_LANTERNS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.LANTERNS)
			.addTag(SSWPTags.Blocks.NORMAL_LANTERNS)
			.addTag(SSWPTags.Blocks.SOUL_LANTERNS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.CONVERTS_TO_MUD_SLAB)
			.add(SSWPBlocks.DIRT_SLAB,
					SSWPBlocks.COARSE_DIRT_SLAB,
					SSWPBlocks.ROOTED_DIRT_SLAB);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.CONVERTS_TO_MUD_STAIRS)
			.add(SSWPBlocks.DIRT_STAIRS,
					SSWPBlocks.COARSE_DIRT_STAIRS,
					SSWPBlocks.ROOTED_DIRT_STAIRS);
			
			this.getOrCreateTagBuilder(SSWPTags.Blocks.CONVERTS_TO_MUD_WALL)
			.add(SSWPBlocks.DIRT_WALL,
					SSWPBlocks.COARSE_DIRT_WALL,
					SSWPBlocks.ROOTED_DIRT_WALL);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.WOODEN_WALLS)
			.addTag(SSWPTags.Blocks.OAK_WALLS)
			.addTag(SSWPTags.Blocks.SPRUCE_WALLS)
			.addTag(SSWPTags.Blocks.BIRCH_WALLS)
			.addTag(SSWPTags.Blocks.JUNGLE_WALLS)
			.addTag(SSWPTags.Blocks.ACACIA_WALLS)
			.addTag(SSWPTags.Blocks.DARK_OAK_WALLS)
			.addTag(SSWPTags.Blocks.MANGROVE_WALLS)
			.addTag(SSWPTags.Blocks.CHERRY_WALLS)
			.addTag(SSWPTags.Blocks.BAMBOO_WALLS)
			.addTag(SSWPTags.Blocks.CRIMSON_WALLS)
			.addTag(SSWPTags.Blocks.WARPED_WALLS);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.WOODEN_LADDERS)
			.add(SSWPBlocks.OAK_LADDER,
					SSWPBlocks.SPRUCE_LADDER,
					SSWPBlocks.BIRCH_LADDER,
					SSWPBlocks.JUNGLE_LADDER,
					SSWPBlocks.ACACIA_LADDER,
					SSWPBlocks.DARK_OAK_LADDER,
					SSWPBlocks.MANGROVE_LADDER,
					SSWPBlocks.CHERRY_LADDER,
					SSWPBlocks.BAMBOO_LADDER,
					SSWPBlocks.CRIMSON_LADDER,
					SSWPBlocks.WARPED_LADDER);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.LADDERS)
			.add(SSWPBlocks.IRON_LADDER,
					SSWPBlocks.GOLD_LADDER,
					SSWPBlocks.NETHERITE_LADDER)
			.addTag(SSWPTags.Blocks.COPPER_LADDERS);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.LEAF_SLABS)
			.add(SSWPBlocks.OAK_LEAF_SLAB,
					SSWPBlocks.SPRUCE_LEAF_SLAB,
					SSWPBlocks.BIRCH_LEAF_SLAB,
					SSWPBlocks.JUNGLE_LEAF_SLAB,
					SSWPBlocks.ACACIA_LEAF_SLAB,
					SSWPBlocks.DARK_OAK_LEAF_SLAB,
					SSWPBlocks.MANGROVE_LEAF_SLAB,
					SSWPBlocks.CHERRY_LEAF_SLAB,
					SSWPBlocks.AZALEA_LEAF_SLAB,
					SSWPBlocks.FLOWERING_AZALEA_LEAF_SLAB);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.LEAF_STAIRS)
			.add(SSWPBlocks.OAK_LEAF_STAIRS,
					SSWPBlocks.SPRUCE_LEAF_STAIRS,
					SSWPBlocks.BIRCH_LEAF_STAIRS,
					SSWPBlocks.JUNGLE_LEAF_STAIRS,
					SSWPBlocks.ACACIA_LEAF_STAIRS,
					SSWPBlocks.DARK_OAK_LEAF_STAIRS,
					SSWPBlocks.MANGROVE_LEAF_STAIRS,
					SSWPBlocks.CHERRY_LEAF_STAIRS,
					SSWPBlocks.AZALEA_LEAF_STAIRS,
					SSWPBlocks.FLOWERING_AZALEA_LEAF_STAIRS);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.LEAF_WALLS)
			.add(SSWPBlocks.OAK_LEAF_WALL,
					SSWPBlocks.SPRUCE_LEAF_WALL,
					SSWPBlocks.BIRCH_LEAF_WALL,
					SSWPBlocks.JUNGLE_LEAF_WALL,
					SSWPBlocks.ACACIA_LEAF_WALL,
					SSWPBlocks.DARK_OAK_LEAF_WALL,
					SSWPBlocks.MANGROVE_LEAF_WALL,
					SSWPBlocks.CHERRY_LEAF_WALL,
					SSWPBlocks.AZALEA_LEAF_WALL,
					SSWPBlocks.FLOWERING_AZALEA_LEAF_WALL);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.LEAF_CARPETS)
			.add(SSWPBlocks.OAK_LEAF_CARPET,
					SSWPBlocks.SPRUCE_LEAF_CARPET,
					SSWPBlocks.BIRCH_LEAF_CARPET,
					SSWPBlocks.JUNGLE_LEAF_CARPET,
					SSWPBlocks.ACACIA_LEAF_CARPET,
					SSWPBlocks.DARK_OAK_LEAF_CARPET,
					SSWPBlocks.MANGROVE_LEAF_CARPET,
					SSWPBlocks.CHERRY_LEAF_CARPET,
					SSWPBlocks.AZALEA_LEAF_CARPET,
					SSWPBlocks.FLOWERING_AZALEA_LEAF_CARPET);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.BARS)
			.add(SSWPBlocks.GOLD_BARS,
					SSWPBlocks.NETHERITE_BARS)
			.addTag(SSWPTags.Blocks.COPPER_BARS);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.CHAINS)
			.add(SSWPBlocks.GOLD_CHAIN,
					SSWPBlocks.NETHERITE_CHAIN)
			.addTag(SSWPTags.Blocks.COPPER_CHAINS);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.BOOKSHELVES)
			.add(SSWPBlocks.OAK_BOOKSHELF,
					SSWPBlocks.SPRUCE_BOOKSHELF,
					SSWPBlocks.BIRCH_BOOKSHELF,
					SSWPBlocks.JUNGLE_BOOKSHELF,
					SSWPBlocks.ACACIA_BOOKSHELF,
					SSWPBlocks.DARK_OAK_BOOKSHELF,
					SSWPBlocks.MANGROVE_BOOKSHELF,
					SSWPBlocks.CHERRY_BOOKSHELF,
					SSWPBlocks.BAMBOO_BOOKSHELF,
					SSWPBlocks.CRIMSON_BOOKSHELF,
					SSWPBlocks.WARPED_BOOKSHELF);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.CRAFTING_TABLES)
			.add(SSWPBlocks.OAK_CRAFTING_TABLE,
					SSWPBlocks.SPRUCE_CRAFTING_TABLE,
					SSWPBlocks.BIRCH_CRAFTING_TABLE,
					SSWPBlocks.JUNGLE_CRAFTING_TABLE,
					SSWPBlocks.ACACIA_CRAFTING_TABLE,
					SSWPBlocks.DARK_OAK_CRAFTING_TABLE,
					SSWPBlocks.MANGROVE_CRAFTING_TABLE,
					SSWPBlocks.CHERRY_CRAFTING_TABLE,
					SSWPBlocks.BAMBOO_CRAFTING_TABLE,
					SSWPBlocks.CRIMSON_CRAFTING_TABLE,
					SSWPBlocks.WARPED_CRAFTING_TABLE);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.LOOMS)
			.add(SSWPBlocks.OAK_LOOM,
					SSWPBlocks.SPRUCE_LOOM,
					SSWPBlocks.BIRCH_LOOM,
					SSWPBlocks.JUNGLE_LOOM,
					SSWPBlocks.ACACIA_LOOM,
					SSWPBlocks.DARK_OAK_LOOM,
					SSWPBlocks.MANGROVE_LOOM,
					SSWPBlocks.CHERRY_LOOM,
					SSWPBlocks.BAMBOO_LOOM,
					SSWPBlocks.CRIMSON_LOOM,
					SSWPBlocks.WARPED_LOOM);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.CARTOGRAPHY_TABLES)
			.add(SSWPBlocks.OAK_CARTOGRAPHY_TABLE,
					SSWPBlocks.SPRUCE_CARTOGRAPHY_TABLE,
					SSWPBlocks.BIRCH_CARTOGRAPHY_TABLE,
					SSWPBlocks.JUNGLE_CARTOGRAPHY_TABLE,
					SSWPBlocks.ACACIA_CARTOGRAPHY_TABLE,
					SSWPBlocks.DARK_OAK_CARTOGRAPHY_TABLE,
					SSWPBlocks.MANGROVE_CARTOGRAPHY_TABLE,
					SSWPBlocks.CHERRY_CARTOGRAPHY_TABLE,
					SSWPBlocks.BAMBOO_CARTOGRAPHY_TABLE,
					SSWPBlocks.CRIMSON_CARTOGRAPHY_TABLE,
					SSWPBlocks.WARPED_CARTOGRAPHY_TABLE);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.FLETCHING_TABLES)
			.add(SSWPBlocks.OAK_FLETCHING_TABLE,
					SSWPBlocks.SPRUCE_FLETCHING_TABLE,
					SSWPBlocks.BIRCH_FLETCHING_TABLE,
					SSWPBlocks.JUNGLE_FLETCHING_TABLE,
					SSWPBlocks.ACACIA_FLETCHING_TABLE,
					SSWPBlocks.DARK_OAK_FLETCHING_TABLE,
					SSWPBlocks.MANGROVE_FLETCHING_TABLE,
					SSWPBlocks.CHERRY_FLETCHING_TABLE,
					SSWPBlocks.BAMBOO_FLETCHING_TABLE,
					SSWPBlocks.CRIMSON_FLETCHING_TABLE,
					SSWPBlocks.WARPED_FLETCHING_TABLE);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.SMITHING_TABLES)
			.add(SSWPBlocks.OAK_SMITHING_TABLE,
					SSWPBlocks.SPRUCE_SMITHING_TABLE,
					SSWPBlocks.BIRCH_SMITHING_TABLE,
					SSWPBlocks.JUNGLE_SMITHING_TABLE,
					SSWPBlocks.ACACIA_SMITHING_TABLE,
					SSWPBlocks.DARK_OAK_SMITHING_TABLE,
					SSWPBlocks.MANGROVE_SMITHING_TABLE,
					SSWPBlocks.CHERRY_SMITHING_TABLE,
					SSWPBlocks.BAMBOO_SMITHING_TABLE,
					SSWPBlocks.CRIMSON_SMITHING_TABLE,
					SSWPBlocks.WARPED_SMITHING_TABLE);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.COMPOSTERS)
			.add(SSWPBlocks.OAK_COMPOSTER,
					SSWPBlocks.SPRUCE_COMPOSTER,
					SSWPBlocks.BIRCH_COMPOSTER,
					SSWPBlocks.JUNGLE_COMPOSTER,
					SSWPBlocks.ACACIA_COMPOSTER,
					SSWPBlocks.DARK_OAK_COMPOSTER,
					SSWPBlocks.MANGROVE_COMPOSTER,
					SSWPBlocks.CHERRY_COMPOSTER,
					SSWPBlocks.BAMBOO_COMPOSTER,
					SSWPBlocks.CRIMSON_COMPOSTER,
					SSWPBlocks.WARPED_COMPOSTER);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.LECTERNS)
			.add(SSWPBlocks.OAK_LECTERN,
					SSWPBlocks.SPRUCE_LECTERN,
					SSWPBlocks.BIRCH_LECTERN,
					SSWPBlocks.JUNGLE_LECTERN,
					SSWPBlocks.ACACIA_LECTERN,
					SSWPBlocks.DARK_OAK_LECTERN,
					SSWPBlocks.MANGROVE_LECTERN,
					SSWPBlocks.CHERRY_LECTERN,
					SSWPBlocks.BAMBOO_LECTERN,
					SSWPBlocks.CRIMSON_LECTERN,
					SSWPBlocks.WARPED_LECTERN);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.WOODEN_BARRELS)
			.add(SSWPBlocks.OAK_BARREL,
					SSWPBlocks.SPRUCE_BARREL,
					SSWPBlocks.BIRCH_BARREL,
					SSWPBlocks.JUNGLE_BARREL,
					SSWPBlocks.ACACIA_BARREL,
					SSWPBlocks.DARK_OAK_BARREL,
					SSWPBlocks.MANGROVE_BARREL,
					SSWPBlocks.CHERRY_BARREL,
					SSWPBlocks.BAMBOO_BARREL,
					SSWPBlocks.CRIMSON_BARREL,
					SSWPBlocks.WARPED_BARREL);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.WOODEN_CHESTS)
			.add(SSWPBlocks.OAK_CHEST,
					SSWPBlocks.SPRUCE_CHEST,
					SSWPBlocks.BIRCH_CHEST,
					SSWPBlocks.JUNGLE_CHEST,
					SSWPBlocks.ACACIA_CHEST,
					SSWPBlocks.DARK_OAK_CHEST,
					SSWPBlocks.MANGROVE_CHEST,
					SSWPBlocks.CHERRY_CHEST,
					SSWPBlocks.BAMBOO_CHEST,
					SSWPBlocks.CRIMSON_CHEST,
					SSWPBlocks.WARPED_CHEST,
					SSWPBlocks.OAK_TRAPPED_CHEST,
					SSWPBlocks.SPRUCE_TRAPPED_CHEST,
					SSWPBlocks.BIRCH_TRAPPED_CHEST,
					SSWPBlocks.JUNGLE_TRAPPED_CHEST,
					SSWPBlocks.ACACIA_TRAPPED_CHEST,
					SSWPBlocks.DARK_OAK_TRAPPED_CHEST,
					SSWPBlocks.MANGROVE_TRAPPED_CHEST,
					SSWPBlocks.CHERRY_TRAPPED_CHEST,
					SSWPBlocks.BAMBOO_TRAPPED_CHEST,
					SSWPBlocks.CRIMSON_TRAPPED_CHEST,
					SSWPBlocks.WARPED_TRAPPED_CHEST);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.TRIPWIRE_HOOKS)
			.add(SSWPBlocks.OAK_TRIPWIRE_HOOK,
					SSWPBlocks.SPRUCE_TRIPWIRE_HOOK,
					SSWPBlocks.BIRCH_TRIPWIRE_HOOK,
					SSWPBlocks.JUNGLE_TRIPWIRE_HOOK,
					SSWPBlocks.ACACIA_TRIPWIRE_HOOK,
					SSWPBlocks.DARK_OAK_TRIPWIRE_HOOK,
					SSWPBlocks.MANGROVE_TRIPWIRE_HOOK,
					SSWPBlocks.CHERRY_TRIPWIRE_HOOK,
					SSWPBlocks.BAMBOO_TRIPWIRE_HOOK,
					SSWPBlocks.CRIMSON_TRIPWIRE_HOOK,
					SSWPBlocks.WARPED_TRIPWIRE_HOOK);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.CRAFTED_BEEHIVES)
			.add(SSWPBlocks.OAK_BEEHIVE,
					SSWPBlocks.SPRUCE_BEEHIVE,
					SSWPBlocks.BIRCH_BEEHIVE,
					SSWPBlocks.JUNGLE_BEEHIVE,
					SSWPBlocks.ACACIA_BEEHIVE,
					SSWPBlocks.DARK_OAK_BEEHIVE,
					SSWPBlocks.MANGROVE_BEEHIVE,
					SSWPBlocks.CHERRY_BEEHIVE,
					SSWPBlocks.BAMBOO_BEEHIVE,
					SSWPBlocks.CRIMSON_BEEHIVE,
					SSWPBlocks.WARPED_BEEHIVE);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.DIRT_LIKE)
			.addTag(SSWPTags.Blocks.DIRT_SLABS)
			.addTag(SSWPTags.Blocks.DIRT_STAIRS)
			.addTag(SSWPTags.Blocks.DIRT_WALLS);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.WITHER_ROSE_MAY_PLACE_ON)
			.add(SSWPBlocks.NETHERRACK_SLAB,
					SSWPBlocks.NETHERRACK_STAIRS,
					SSWPBlocks.NETHERRACK_WALL,
					SSWPBlocks.SOUL_SAND_SLAB,
					SSWPBlocks.SOUL_SAND_STAIRS,
					SSWPBlocks.SOUL_SAND_WALL,
					SSWPBlocks.SOUL_SOIL_SLAB,
					SSWPBlocks.SOUL_SOIL_STAIRS,
					SSWPBlocks.SOUL_SOIL_WALL);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.NETHER_WART_GROWABLE)
			.add(SSWPBlocks.SOUL_SAND_SLAB,
					SSWPBlocks.SOUL_SAND_STAIRS,
					SSWPBlocks.SOUL_SAND_WALL);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.NETHER_PLANT_MAY_PLACE_ON)
			.add(SSWPBlocks.SOUL_SOIL_SLAB,
					SSWPBlocks.SOUL_SOIL_STAIRS,
					SSWPBlocks.SOUL_SOIL_WALL)
			.addTag(SSWPTags.Blocks.NYLIUM_SLABS)
			.addTag(SSWPTags.Blocks.NYLIUM_STAIRS)
			.addTag(SSWPTags.Blocks.NYLIUM_WALLS);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.NETHER_FUNGUS_MAY_PLACE_ON)
			.add(SSWPBlocks.MYCELIUM_SLAB,
					SSWPBlocks.MYCELIUM_STAIRS,
					SSWPBlocks.MYCELIUM_WALL);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.COCOA_MAY_GROW_ON)
			.add(SSWPBlocks.JUNGLE_LOG_SLAB,
					SSWPBlocks.JUNGLE_LOG_STAIRS,
					SSWPBlocks.JUNGLE_LOG_WALL,
					SSWPBlocks.JUNGLE_WOOD_SLAB,
					SSWPBlocks.JUNGLE_WOOD_STAIRS,
					SSWPBlocks.JUNGLE_WOOD_WALL,
					SSWPBlocks.STRIPPED_JUNGLE_LOG_SLAB,
					SSWPBlocks.STRIPPED_JUNGLE_LOG_STAIRS,
					SSWPBlocks.STRIPPED_JUNGLE_LOG_WALL,
					SSWPBlocks.STRIPPED_JUNGLE_WOOD_SLAB,
					SSWPBlocks.STRIPPED_JUNGLE_WOOD_STAIRS,
					SSWPBlocks.STRIPPED_JUNGLE_WOOD_WALL);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.CHORUS_MAY_GROW_ON)
			.add(SSWPBlocks.END_STONE_SLAB,
					SSWPBlocks.END_STONE_STAIRS,
					SSWPBlocks.END_STONE_WALL);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.AZALEA_BUSH_MAY_PLACE_ON)
			.add(SSWPBlocks.CLAY_SLAB,
					SSWPBlocks.CLAY_STAIRS,
					SSWPBlocks.CLAY_WALL)
			.addTag(SSWPTags.Blocks.TERRACOTTA_SLABS)
			.addTag(SSWPTags.Blocks.TERRACOTTA_STAIRS)
			.addTag(SSWPTags.Blocks.TERRACOTTA_WALLS);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.PROPAGULE_MAY_PLANT_ON_TOP)
			.add(SSWPBlocks.CLAY_SLAB,
					SSWPBlocks.CLAY_STAIRS,
					SSWPBlocks.CLAY_WALL);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.CONDUIT_ACTIVATING_BLOCKS)
			.addTag(SSWPTags.Blocks.PRISMARINE);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.END_CRYSTAL_MAY_PLACE_ON)
			.add(SSWPBlocks.OBSIDIAN_SLAB,
					SSWPBlocks.OBSIDIAN_STAIRS,
					SSWPBlocks.OBSIDIAN_WALL,
					SSWPBlocks.BEDROCK_SLAB,
					SSWPBlocks.BEDROCK_STAIRS,
					SSWPBlocks.BEDROCK_WALL);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.SIGNAL_FIRE_BASE_BLOCKS)
			.add(SSWPBlocks.HAY_SLAB,
					SSWPBlocks.HAY_STAIRS,
					SSWPBlocks.HAY_WALL);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.INFESTABLE)
			.add(Blocks.MOSSY_COBBLESTONE,
					Blocks.SMOOTH_STONE,
					Blocks.GRANITE,
					Blocks.POLISHED_GRANITE,
					Blocks.DIORITE,
					Blocks.POLISHED_DIORITE,
					Blocks.ANDESITE,
					Blocks.POLISHED_ANDESITE,
					Blocks.COBBLED_DEEPSLATE,
					Blocks.CHISELED_DEEPSLATE,
					Blocks.POLISHED_DEEPSLATE,
					Blocks.DEEPSLATE_BRICKS,
					Blocks.CRACKED_DEEPSLATE_BRICKS,
					Blocks.DEEPSLATE_TILES,
					Blocks.CRACKED_DEEPSLATE_TILES,
					Blocks.TUFF,
					Blocks.CHISELED_TUFF,
					Blocks.POLISHED_TUFF,
					Blocks.TUFF_BRICKS,
					Blocks.CHISELED_TUFF_BRICKS,
					Blocks.CALCITE,
					Blocks.DRIPSTONE_BLOCK);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.INFESTED)
			.add(SSWPBlocks.INFESTED_MOSSY_COBBLESTONE,
					SSWPBlocks.INFESTED_SMOOTH_STONE,
					SSWPBlocks.INFESTED_GRANITE,
					SSWPBlocks.INFESTED_POLISHED_GRANITE,
					SSWPBlocks.INFESTED_DIORITE,
					SSWPBlocks.INFESTED_POLISHED_DIORITE,
					SSWPBlocks.INFESTED_ANDESITE,
					SSWPBlocks.INFESTED_POLISHED_ANDESITE,
					SSWPBlocks.INFESTED_COBBLED_DEEPSLATE,
					SSWPBlocks.INFESTED_CHISELED_DEEPSLATE,
					SSWPBlocks.INFESTED_POLISHED_DEEPSLATE,
					SSWPBlocks.INFESTED_DEEPSLATE_BRICKS,
					SSWPBlocks.INFESTED_CRACKED_DEEPSLATE_BRICKS,
					SSWPBlocks.INFESTED_DEEPSLATE_TILES,
					SSWPBlocks.INFESTED_CRACKED_DEEPSLATE_TILES,
					SSWPBlocks.INFESTED_TUFF,
					SSWPBlocks.INFESTED_CHISELED_TUFF,
					SSWPBlocks.INFESTED_POLISHED_TUFF,
					SSWPBlocks.INFESTED_TUFF_BRICKS,
					SSWPBlocks.INFESTED_CHISELED_TUFF_BRICKS,
					SSWPBlocks.INFESTED_CALCITE,
					SSWPBlocks.INFESTED_DRIPSTONE_BLOCK);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.UPWARDS_BUBBLE_COLUMN_SOURCE_BLOCKS)
			.add(SSWPBlocks.SOUL_SAND_SLAB,
					SSWPBlocks.SOUL_SAND_STAIRS,
					SSWPBlocks.SOUL_SAND_WALL);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.DOWNWARDS_BUBBLE_COLUMN_SOURCE_BLOCKS)
			.add(SSWPBlocks.MAGMA_SLAB,
					SSWPBlocks.MAGMA_STAIRS,
					SSWPBlocks.MAGMA_WALL);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.SHEARS_MINEABLE_MEDIUM)
			.addTag(SSWPTags.Blocks.WOOL_SLABS)
			.addTag(SSWPTags.Blocks.WOOL_STAIRS)
			.addTag(SSWPTags.Blocks.WOOL_WALLS);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.COMPLETES_WAX_ON_ADVANCEMENT)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_BLOCKS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_SLABS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_STAIRS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_WALLS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_FENCES)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_FENCE_GATES)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_BARS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_DOORS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_TRAPDOORS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_PRESSURE_PLATES)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_BUTTONS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_CHAINS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_BULBS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_LADDERS)
			.addTag(SSWPTags.Blocks.ALL_UNWAXED_COPPER_SIGNS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_CAULDRONS)
			.addTag(SSWPTags.Blocks.UNWAXED_COPPER_LANTERNS);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.COMPLETES_WAX_OFF_ADVANCEMENT)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_BLOCKS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_SLABS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_STAIRS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_WALLS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_FENCES)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_FENCE_GATES)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_BARS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_DOORS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_TRAPDOORS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_PRESSURE_PLATES)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_BUTTONS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_CHAINS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_BULBS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_LADDERS)
			.addTag(SSWPTags.Blocks.ALL_WAXED_COPPER_SIGNS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_CAULDRONS)
			.addTag(SSWPTags.Blocks.WAXED_COPPER_LANTERNS);
			
			this.getOrCreateTagBuilder(BlockTags.PLANKS)
			.addTag(SSWPTags.Blocks.BAMBOO_PLANKS);
			
			this.getOrCreateTagBuilder(BlockTags.WOODEN_SLABS)
			.addTag(SSWPTags.Blocks.OAK_SLABS)
			.addTag(SSWPTags.Blocks.SPRUCE_SLABS)
			.addTag(SSWPTags.Blocks.BIRCH_SLABS)
			.addTag(SSWPTags.Blocks.JUNGLE_SLABS)
			.addTag(SSWPTags.Blocks.ACACIA_SLABS)
			.addTag(SSWPTags.Blocks.DARK_OAK_SLABS)
			.addTag(SSWPTags.Blocks.MANGROVE_SLABS)
			.addTag(SSWPTags.Blocks.CHERRY_SLABS)
			.addTag(SSWPTags.Blocks.BAMBOO_SLABS)
			.addTag(SSWPTags.Blocks.CRIMSON_SLABS)
			.addTag(SSWPTags.Blocks.WARPED_SLABS);
			
			this.getOrCreateTagBuilder(BlockTags.WOODEN_STAIRS)
			.addTag(SSWPTags.Blocks.OAK_STAIRS)
			.addTag(SSWPTags.Blocks.SPRUCE_STAIRS)
			.addTag(SSWPTags.Blocks.BIRCH_STAIRS)
			.addTag(SSWPTags.Blocks.JUNGLE_STAIRS)
			.addTag(SSWPTags.Blocks.ACACIA_STAIRS)
			.addTag(SSWPTags.Blocks.DARK_OAK_STAIRS)
			.addTag(SSWPTags.Blocks.MANGROVE_STAIRS)
			.addTag(SSWPTags.Blocks.CHERRY_STAIRS)
			.addTag(SSWPTags.Blocks.BAMBOO_STAIRS)
			.addTag(SSWPTags.Blocks.CRIMSON_STAIRS)
			.addTag(SSWPTags.Blocks.WARPED_STAIRS);
			
			this.getOrCreateTagBuilder(BlockTags.SLABS)
			.add(SSWPBlocks.PACKED_MUD_SLAB,
					SSWPBlocks.SEA_LANTERN_SLAB,
					SSWPBlocks.NETHERRACK_SLAB,
					SSWPBlocks.END_STONE_SLAB,
					SSWPBlocks.COAL_SLAB,
					SSWPBlocks.IRON_SLAB,
					SSWPBlocks.GOLD_SLAB,
					SSWPBlocks.REDSTONE_SLAB,
					SSWPBlocks.EMERALD_SLAB,
					SSWPBlocks.LAPIS_SLAB,
					SSWPBlocks.DIAMOND_SLAB,
					SSWPBlocks.NETHERITE_SLAB,
					SSWPBlocks.AMETHYST_SLAB,
					SSWPBlocks.DIRT_PATH_SLAB,
					SSWPBlocks.CLAY_SLAB,
					SSWPBlocks.SNOW_SLAB,
					SSWPBlocks.CALCITE_SLAB,
					SSWPBlocks.DRIPSTONE_SLAB,
					SSWPBlocks.MAGMA_SLAB,
					SSWPBlocks.SOUL_SAND_SLAB,
					SSWPBlocks.SOUL_SOIL_SLAB,
					SSWPBlocks.BONE_SLAB,
					SSWPBlocks.ANCIENT_DEBRIS_SLAB,
					SSWPBlocks.RAW_IRON_SLAB,
					SSWPBlocks.RAW_COPPER_SLAB,
					SSWPBlocks.RAW_GOLD_SLAB,
					SSWPBlocks.GLOWSTONE_SLAB,
					SSWPBlocks.MANGROVE_ROOT_SLAB,
					SSWPBlocks.SHROOMLIGHT_SLAB,
					SSWPBlocks.DRIED_KELP_SLAB,
					SSWPBlocks.HAY_SLAB,
					SSWPBlocks.HONEYCOMB_SLAB,
					SSWPBlocks.SCULK_SLAB,
					SSWPBlocks.BEDROCK_SLAB,
					SSWPBlocks.REDSTONE_LAMP_SLAB)
			.addTag(SSWPTags.Blocks.STONE_SLABS)
			.addTag(SSWPTags.Blocks.GRANITE_SLABS)
			.addTag(SSWPTags.Blocks.DIORITE_SLABS)
			.addTag(SSWPTags.Blocks.ANDESITE_SLABS)
			.addTag(SSWPTags.Blocks.DEEPSLATE_SLABS)
			.addTag(SSWPTags.Blocks.TUFF_SLABS)
			.addTag(SSWPTags.Blocks.SANDSTONE_SLABS)
			.addTag(SSWPTags.Blocks.PRISMARINE_SLABS)
			.addTag(SSWPTags.Blocks.NETHER_BRICK_SLABS)
			.addTag(SSWPTags.Blocks.BASALT_SLABS)
			.addTag(SSWPTags.Blocks.BLACKSTONE_SLABS)
			.addTag(SSWPTags.Blocks.PURPUR_SLABS)
			.addTag(SSWPTags.Blocks.QUARTZ_SLABS)
			.addTag(SSWPTags.Blocks.COPPER_SLABS)
			.addTag(SSWPTags.Blocks.WOOL_SLABS)
			.addTag(SSWPTags.Blocks.TERRACOTTA_SLABS)
			.addTag(SSWPTags.Blocks.CONCRETE_SLABS)
			.addTag(SSWPTags.Blocks.GLASS_SLABS)
			.addTag(SSWPTags.Blocks.DIRT_SLABS)
			.addTag(SSWPTags.Blocks.ICE_SLABS)
			.addTag(SSWPTags.Blocks.OBSIDIAN_SLABS)
			.addTag(SSWPTags.Blocks.NYLIUM_SLABS)
			.addTag(SSWPTags.Blocks.COAL_ORE_SLABS)
			.addTag(SSWPTags.Blocks.IRON_ORE_SLABS)
			.addTag(SSWPTags.Blocks.COPPER_ORE_SLABS)
			.addTag(SSWPTags.Blocks.GOLD_ORE_SLABS)
			.addTag(SSWPTags.Blocks.REDSTONE_ORE_SLABS)
			.addTag(SSWPTags.Blocks.EMERALD_ORE_SLABS)
			.addTag(SSWPTags.Blocks.LAPIS_ORE_SLABS)
			.addTag(SSWPTags.Blocks.DIAMOND_ORE_SLABS)
			.addTag(SSWPTags.Blocks.QUARTZ_ORE_SLABS)
			.addTag(SSWPTags.Blocks.MUSHROOM_SLABS)
			.addTag(SSWPTags.Blocks.WART_SLABS)
			.addTag(SSWPTags.Blocks.CORAL_SLABS)
			.addTag(SSWPTags.Blocks.DEAD_CORAL_SLABS)
			.addTag(SSWPTags.Blocks.FROGLIGHT_SLABS);
			
			this.getOrCreateTagBuilder(BlockTags.STAIRS)
			.add(SSWPBlocks.PACKED_MUD_STAIRS,
					SSWPBlocks.SEA_LANTERN_STAIRS,
					SSWPBlocks.NETHERRACK_STAIRS,
					SSWPBlocks.END_STONE_STAIRS,
					SSWPBlocks.COAL_STAIRS,
					SSWPBlocks.IRON_STAIRS,
					SSWPBlocks.GOLD_STAIRS,
					SSWPBlocks.REDSTONE_STAIRS,
					SSWPBlocks.EMERALD_STAIRS,
					SSWPBlocks.LAPIS_STAIRS,
					SSWPBlocks.DIAMOND_STAIRS,
					SSWPBlocks.NETHERITE_STAIRS,
					SSWPBlocks.AMETHYST_STAIRS,
					SSWPBlocks.DIRT_PATH_STAIRS,
					SSWPBlocks.CLAY_STAIRS,
					SSWPBlocks.SNOW_STAIRS,
					SSWPBlocks.CALCITE_STAIRS,
					SSWPBlocks.DRIPSTONE_STAIRS,
					SSWPBlocks.MAGMA_STAIRS,
					SSWPBlocks.SOUL_SAND_STAIRS,
					SSWPBlocks.SOUL_SOIL_STAIRS,
					SSWPBlocks.BONE_STAIRS,
					SSWPBlocks.ANCIENT_DEBRIS_STAIRS,
					SSWPBlocks.RAW_IRON_STAIRS,
					SSWPBlocks.RAW_COPPER_STAIRS,
					SSWPBlocks.RAW_GOLD_STAIRS,
					SSWPBlocks.GLOWSTONE_STAIRS,
					SSWPBlocks.MANGROVE_ROOT_STAIRS,
					SSWPBlocks.SHROOMLIGHT_STAIRS,
					SSWPBlocks.DRIED_KELP_STAIRS,
					SSWPBlocks.HAY_STAIRS,
					SSWPBlocks.HONEYCOMB_STAIRS,
					SSWPBlocks.SCULK_STAIRS,
					SSWPBlocks.BEDROCK_STAIRS,
					SSWPBlocks.REDSTONE_LAMP_STAIRS)
			.addTag(SSWPTags.Blocks.STONE_STAIRS)
			.addTag(SSWPTags.Blocks.GRANITE_STAIRS)
			.addTag(SSWPTags.Blocks.DIORITE_STAIRS)
			.addTag(SSWPTags.Blocks.ANDESITE_STAIRS)
			.addTag(SSWPTags.Blocks.DEEPSLATE_STAIRS)
			.addTag(SSWPTags.Blocks.TUFF_STAIRS)
			.addTag(SSWPTags.Blocks.SANDSTONE_STAIRS)
			.addTag(SSWPTags.Blocks.PRISMARINE_STAIRS)
			.addTag(SSWPTags.Blocks.NETHER_BRICK_STAIRS)
			.addTag(SSWPTags.Blocks.BASALT_STAIRS)
			.addTag(SSWPTags.Blocks.BLACKSTONE_STAIRS)
			.addTag(SSWPTags.Blocks.PURPUR_STAIRS)
			.addTag(SSWPTags.Blocks.QUARTZ_STAIRS)
			.addTag(SSWPTags.Blocks.COPPER_STAIRS)
			.addTag(SSWPTags.Blocks.WOOL_STAIRS)
			.addTag(SSWPTags.Blocks.TERRACOTTA_STAIRS)
			.addTag(SSWPTags.Blocks.CONCRETE_STAIRS)
			.addTag(SSWPTags.Blocks.GLASS_STAIRS)
			.addTag(SSWPTags.Blocks.DIRT_STAIRS)
			.addTag(SSWPTags.Blocks.ICE_STAIRS)
			.addTag(SSWPTags.Blocks.OBSIDIAN_STAIRS)
			.addTag(SSWPTags.Blocks.NYLIUM_STAIRS)
			.addTag(SSWPTags.Blocks.COAL_ORE_STAIRS)
			.addTag(SSWPTags.Blocks.IRON_ORE_STAIRS)
			.addTag(SSWPTags.Blocks.COPPER_ORE_STAIRS)
			.addTag(SSWPTags.Blocks.GOLD_ORE_STAIRS)
			.addTag(SSWPTags.Blocks.REDSTONE_ORE_STAIRS)
			.addTag(SSWPTags.Blocks.EMERALD_ORE_STAIRS)
			.addTag(SSWPTags.Blocks.LAPIS_ORE_STAIRS)
			.addTag(SSWPTags.Blocks.DIAMOND_ORE_STAIRS)
			.addTag(SSWPTags.Blocks.QUARTZ_ORE_STAIRS)
			.addTag(SSWPTags.Blocks.MUSHROOM_STAIRS)
			.addTag(SSWPTags.Blocks.WART_STAIRS)
			.addTag(SSWPTags.Blocks.CORAL_STAIRS)
			.addTag(SSWPTags.Blocks.DEAD_CORAL_STAIRS)
			.addTag(SSWPTags.Blocks.FROGLIGHT_STAIRS);
			
			this.getOrCreateTagBuilder(BlockTags.WALLS)
			.add(SSWPBlocks.PACKED_MUD_WALL,
					SSWPBlocks.SEA_LANTERN_WALL,
					SSWPBlocks.NETHERRACK_WALL,
					SSWPBlocks.END_STONE_WALL,
					SSWPBlocks.COAL_WALL,
					SSWPBlocks.IRON_WALL,
					SSWPBlocks.GOLD_WALL,
					SSWPBlocks.REDSTONE_WALL,
					SSWPBlocks.EMERALD_WALL,
					SSWPBlocks.LAPIS_WALL,
					SSWPBlocks.DIAMOND_WALL,
					SSWPBlocks.NETHERITE_WALL,
					SSWPBlocks.AMETHYST_WALL,
					SSWPBlocks.DIRT_PATH_WALL,
					SSWPBlocks.CLAY_WALL,
					SSWPBlocks.SNOW_WALL,
					SSWPBlocks.CALCITE_WALL,
					SSWPBlocks.DRIPSTONE_WALL,
					SSWPBlocks.MAGMA_WALL,
					SSWPBlocks.SOUL_SAND_WALL,
					SSWPBlocks.SOUL_SOIL_WALL,
					SSWPBlocks.BONE_WALL,
					SSWPBlocks.ANCIENT_DEBRIS_WALL,
					SSWPBlocks.RAW_IRON_WALL,
					SSWPBlocks.RAW_COPPER_WALL,
					SSWPBlocks.RAW_GOLD_WALL,
					SSWPBlocks.GLOWSTONE_WALL,
					SSWPBlocks.MANGROVE_ROOT_WALL,
					SSWPBlocks.SHROOMLIGHT_WALL,
					SSWPBlocks.DRIED_KELP_WALL,
					SSWPBlocks.HAY_WALL,
					SSWPBlocks.HONEYCOMB_WALL,
					SSWPBlocks.SCULK_WALL,
					SSWPBlocks.BEDROCK_WALL,
					SSWPBlocks.REDSTONE_LAMP_WALL)
			.addTag(SSWPTags.Blocks.STONE_WALLS)
			.addTag(SSWPTags.Blocks.GRANITE_WALLS)
			.addTag(SSWPTags.Blocks.DIORITE_WALLS)
			.addTag(SSWPTags.Blocks.ANDESITE_WALLS)
			.addTag(SSWPTags.Blocks.DEEPSLATE_WALLS)
			.addTag(SSWPTags.Blocks.TUFF_WALLS)
			.addTag(SSWPTags.Blocks.SANDSTONE_WALLS)
			.addTag(SSWPTags.Blocks.PRISMARINE_WALLS)
			.addTag(SSWPTags.Blocks.NETHER_BRICK_WALLS)
			.addTag(SSWPTags.Blocks.BASALT_WALLS)
			.addTag(SSWPTags.Blocks.BLACKSTONE_WALLS)
			.addTag(SSWPTags.Blocks.PURPUR_WALLS)
			.addTag(SSWPTags.Blocks.QUARTZ_WALLS)
			.addTag(SSWPTags.Blocks.COPPER_WALLS)
			.addTag(SSWPTags.Blocks.WOOL_WALLS)
			.addTag(SSWPTags.Blocks.TERRACOTTA_WALLS)
			.addTag(SSWPTags.Blocks.CONCRETE_WALLS)
			.addTag(SSWPTags.Blocks.GLASS_WALLS)
			.addTag(SSWPTags.Blocks.DIRT_WALLS)
			.addTag(SSWPTags.Blocks.ICE_WALLS)
			.addTag(SSWPTags.Blocks.OBSIDIAN_WALLS)
			.addTag(SSWPTags.Blocks.NYLIUM_WALLS)
			.addTag(SSWPTags.Blocks.COAL_ORE_WALLS)
			.addTag(SSWPTags.Blocks.IRON_ORE_WALLS)
			.addTag(SSWPTags.Blocks.COPPER_ORE_WALLS)
			.addTag(SSWPTags.Blocks.GOLD_ORE_WALLS)
			.addTag(SSWPTags.Blocks.REDSTONE_ORE_WALLS)
			.addTag(SSWPTags.Blocks.EMERALD_ORE_WALLS)
			.addTag(SSWPTags.Blocks.LAPIS_ORE_WALLS)
			.addTag(SSWPTags.Blocks.DIAMOND_ORE_WALLS)
			.addTag(SSWPTags.Blocks.QUARTZ_ORE_WALLS)
			.addTag(SSWPTags.Blocks.MUSHROOM_WALLS)
			.addTag(SSWPTags.Blocks.WART_WALLS)
			.addTag(SSWPTags.Blocks.CORAL_WALLS)
			.addTag(SSWPTags.Blocks.DEAD_CORAL_WALLS)
			.addTag(SSWPTags.Blocks.FROGLIGHT_WALLS);
			
			this.getOrCreateTagBuilder(BlockTags.FENCES)
			.add(SSWPBlocks.IRON_FENCE,
					SSWPBlocks.GOLD_FENCE,
					SSWPBlocks.NETHERITE_FENCE)
			.addTag(SSWPTags.Blocks.NETHER_BRICK_FENCES)
			.addTag(SSWPTags.Blocks.COPPER_FENCES);
			
			this.getOrCreateTagBuilder(BlockTags.FENCE_GATES)
			.add(SSWPBlocks.IRON_FENCE_GATE,
					SSWPBlocks.GOLD_FENCE_GATE,
					SSWPBlocks.NETHERITE_FENCE_GATE)
			.addTag(SSWPTags.Blocks.NETHER_BRICK_FENCE_GATES)
			.addTag(SSWPTags.Blocks.COPPER_FENCE_GATES);
			
			this.getOrCreateTagBuilder(BlockTags.DOORS)
			.add(SSWPBlocks.GOLD_DOOR,
					SSWPBlocks.NETHERITE_DOOR)
			.addTag(SSWPTags.Blocks.COPPER_DOORS);
			
			this.getOrCreateTagBuilder(BlockTags.TRAPDOORS)
			.add(SSWPBlocks.GOLD_TRAPDOOR,
					SSWPBlocks.NETHERITE_TRAPDOOR)
			.addTag(SSWPTags.Blocks.COPPER_TRAPDOORS);
			
			this.getOrCreateTagBuilder(BlockTags.PRESSURE_PLATES)
			.add(SSWPBlocks.NETHERITE_PRESSURE_PLATE)
			.addTag(SSWPTags.Blocks.COPPER_PRESSURE_PLATES);
			
			this.getOrCreateTagBuilder(BlockTags.BUTTONS)
			.add(SSWPBlocks.IRON_BUTTON,
					SSWPBlocks.GOLD_BUTTON,
					SSWPBlocks.NETHERITE_BUTTON)
			.addTag(SSWPTags.Blocks.COPPER_BUTTONS);
			
			this.getOrCreateTagBuilder(BlockTags.STANDING_SIGNS)
			.add(SSWPBlocks.IRON_SIGN,
					SSWPBlocks.GOLD_SIGN,
					SSWPBlocks.NETHERITE_SIGN)
			.addTag(SSWPTags.Blocks.COPPER_STANDING_SIGNS);
			
			this.getOrCreateTagBuilder(BlockTags.WALL_SIGNS)
			.add(SSWPBlocks.IRON_WALL_SIGN,
					SSWPBlocks.GOLD_WALL_SIGN,
					SSWPBlocks.NETHERITE_WALL_SIGN)
			.addTag(SSWPTags.Blocks.COPPER_WALL_SIGNS);
			
			this.getOrCreateTagBuilder(BlockTags.CEILING_HANGING_SIGNS)
			.add(SSWPBlocks.IRON_HANGING_SIGN,
					SSWPBlocks.GOLD_HANGING_SIGN,
					SSWPBlocks.NETHERITE_HANGING_SIGN)
			.addTag(SSWPTags.Blocks.COPPER_CEILING_HANGING_SIGNS);
			
			this.getOrCreateTagBuilder(BlockTags.WALL_HANGING_SIGNS)
			.add(SSWPBlocks.IRON_WALL_HANGING_SIGN,
					SSWPBlocks.GOLD_WALL_HANGING_SIGN,
					SSWPBlocks.NETHERITE_WALL_HANGING_SIGN)
			.addTag(SSWPTags.Blocks.COPPER_WALL_HANGING_SIGNS);
			
			this.getOrCreateTagBuilder(BlockTags.CAULDRONS)
			.add(SSWPBlocks.GOLD_CAULDRON,
					SSWPBlocks.NETHERITE_CAULDRON)
			.addTag(SSWPTags.Blocks.COPPER_CAULDRONS);
			
			this.getOrCreateTagBuilder(BlockTags.ANVIL)
			.add(SSWPBlocks.NETHERITE_ANVIL);
			
			this.getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
			.add(SSWPBlocks.MANGROVE_ROOT_SLAB,
					SSWPBlocks.MANGROVE_ROOT_STAIRS,
					SSWPBlocks.MANGROVE_ROOT_WALL,
					SSWPBlocks.MANGROVE_ROOT_CARPET,
					SSWPBlocks.OAK_BOOKSHELF,
					SSWPBlocks.SPRUCE_BOOKSHELF,
					SSWPBlocks.BIRCH_BOOKSHELF,
					SSWPBlocks.JUNGLE_BOOKSHELF,
					SSWPBlocks.ACACIA_BOOKSHELF,
					SSWPBlocks.DARK_OAK_BOOKSHELF,
					SSWPBlocks.MANGROVE_BOOKSHELF,
					SSWPBlocks.CHERRY_BOOKSHELF,
					SSWPBlocks.BAMBOO_BOOKSHELF,
					SSWPBlocks.CRIMSON_BOOKSHELF,
					SSWPBlocks.WARPED_BOOKSHELF,
					SSWPBlocks.OAK_CRAFTING_TABLE,
					SSWPBlocks.SPRUCE_CRAFTING_TABLE,
					SSWPBlocks.BIRCH_CRAFTING_TABLE,
					SSWPBlocks.JUNGLE_CRAFTING_TABLE,
					SSWPBlocks.ACACIA_CRAFTING_TABLE,
					SSWPBlocks.DARK_OAK_CRAFTING_TABLE,
					SSWPBlocks.MANGROVE_CRAFTING_TABLE,
					SSWPBlocks.CHERRY_CRAFTING_TABLE,
					SSWPBlocks.BAMBOO_CRAFTING_TABLE,
					SSWPBlocks.CRIMSON_CRAFTING_TABLE,
					SSWPBlocks.WARPED_CRAFTING_TABLE,
					SSWPBlocks.OAK_LOOM,
					SSWPBlocks.SPRUCE_LOOM,
					SSWPBlocks.BIRCH_LOOM,
					SSWPBlocks.JUNGLE_LOOM,
					SSWPBlocks.ACACIA_LOOM,
					SSWPBlocks.DARK_OAK_LOOM,
					SSWPBlocks.MANGROVE_LOOM,
					SSWPBlocks.CHERRY_LOOM,
					SSWPBlocks.BAMBOO_LOOM,
					SSWPBlocks.CRIMSON_LOOM,
					SSWPBlocks.WARPED_LOOM,
					SSWPBlocks.OAK_CARTOGRAPHY_TABLE,
					SSWPBlocks.SPRUCE_CARTOGRAPHY_TABLE,
					SSWPBlocks.BIRCH_CARTOGRAPHY_TABLE,
					SSWPBlocks.JUNGLE_CARTOGRAPHY_TABLE,
					SSWPBlocks.ACACIA_CARTOGRAPHY_TABLE,
					SSWPBlocks.DARK_OAK_CARTOGRAPHY_TABLE,
					SSWPBlocks.MANGROVE_CARTOGRAPHY_TABLE,
					SSWPBlocks.CHERRY_CARTOGRAPHY_TABLE,
					SSWPBlocks.BAMBOO_CARTOGRAPHY_TABLE,
					SSWPBlocks.CRIMSON_CARTOGRAPHY_TABLE,
					SSWPBlocks.WARPED_CARTOGRAPHY_TABLE,
					SSWPBlocks.OAK_FLETCHING_TABLE,
					SSWPBlocks.SPRUCE_FLETCHING_TABLE,
					SSWPBlocks.BIRCH_FLETCHING_TABLE,
					SSWPBlocks.JUNGLE_FLETCHING_TABLE,
					SSWPBlocks.ACACIA_FLETCHING_TABLE,
					SSWPBlocks.DARK_OAK_FLETCHING_TABLE,
					SSWPBlocks.MANGROVE_FLETCHING_TABLE,
					SSWPBlocks.CHERRY_FLETCHING_TABLE,
					SSWPBlocks.BAMBOO_FLETCHING_TABLE,
					SSWPBlocks.CRIMSON_FLETCHING_TABLE,
					SSWPBlocks.WARPED_FLETCHING_TABLE,
					SSWPBlocks.OAK_SMITHING_TABLE,
					SSWPBlocks.SPRUCE_SMITHING_TABLE,
					SSWPBlocks.BIRCH_SMITHING_TABLE,
					SSWPBlocks.JUNGLE_SMITHING_TABLE,
					SSWPBlocks.ACACIA_SMITHING_TABLE,
					SSWPBlocks.DARK_OAK_SMITHING_TABLE,
					SSWPBlocks.MANGROVE_SMITHING_TABLE,
					SSWPBlocks.CHERRY_SMITHING_TABLE,
					SSWPBlocks.BAMBOO_SMITHING_TABLE,
					SSWPBlocks.CRIMSON_SMITHING_TABLE,
					SSWPBlocks.WARPED_SMITHING_TABLE,
					SSWPBlocks.OAK_COMPOSTER,
					SSWPBlocks.SPRUCE_COMPOSTER,
					SSWPBlocks.BIRCH_COMPOSTER,
					SSWPBlocks.JUNGLE_COMPOSTER,
					SSWPBlocks.ACACIA_COMPOSTER,
					SSWPBlocks.DARK_OAK_COMPOSTER,
					SSWPBlocks.MANGROVE_COMPOSTER,
					SSWPBlocks.CHERRY_COMPOSTER,
					SSWPBlocks.BAMBOO_COMPOSTER,
					SSWPBlocks.CRIMSON_COMPOSTER,
					SSWPBlocks.WARPED_COMPOSTER,
					SSWPBlocks.OAK_LECTERN,
					SSWPBlocks.SPRUCE_LECTERN,
					SSWPBlocks.BIRCH_LECTERN,
					SSWPBlocks.JUNGLE_LECTERN,
					SSWPBlocks.ACACIA_LECTERN,
					SSWPBlocks.DARK_OAK_LECTERN,
					SSWPBlocks.MANGROVE_LECTERN,
					SSWPBlocks.CHERRY_LECTERN,
					SSWPBlocks.BAMBOO_LECTERN,
					SSWPBlocks.CRIMSON_LECTERN,
					SSWPBlocks.WARPED_LECTERN,
					SSWPBlocks.OAK_BEEHIVE,
					SSWPBlocks.SPRUCE_BEEHIVE,
					SSWPBlocks.BIRCH_BEEHIVE,
					SSWPBlocks.JUNGLE_BEEHIVE,
					SSWPBlocks.ACACIA_BEEHIVE,
					SSWPBlocks.DARK_OAK_BEEHIVE,
					SSWPBlocks.MANGROVE_BEEHIVE,
					SSWPBlocks.CHERRY_BEEHIVE,
					SSWPBlocks.BAMBOO_BEEHIVE,
					SSWPBlocks.CRIMSON_BEEHIVE,
					SSWPBlocks.WARPED_BEEHIVE,
					SSWPBlocks.OAK_CHISELED_BOOKSHELF,
					SSWPBlocks.SPRUCE_CHISELED_BOOKSHELF,
					SSWPBlocks.BIRCH_CHISELED_BOOKSHELF,
					SSWPBlocks.JUNGLE_CHISELED_BOOKSHELF,
					SSWPBlocks.ACACIA_CHISELED_BOOKSHELF,
					SSWPBlocks.DARK_OAK_CHISELED_BOOKSHELF,
					SSWPBlocks.MANGROVE_CHISELED_BOOKSHELF,
					SSWPBlocks.CHERRY_CHISELED_BOOKSHELF,
					SSWPBlocks.BAMBOO_CHISELED_BOOKSHELF,
					SSWPBlocks.CRIMSON_CHISELED_BOOKSHELF,
					SSWPBlocks.WARPED_CHISELED_BOOKSHELF)
			.addTag(SSWPTags.Blocks.MUSHROOM_BLOCKS)
			.addTag(SSWPTags.Blocks.MUSHROOM_SLABS)
			.addTag(SSWPTags.Blocks.MUSHROOM_STAIRS)
			.addTag(SSWPTags.Blocks.MUSHROOM_WALLS);
			
			this.getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
			.add(SSWPBlocks.MOSS_SLAB,
					SSWPBlocks.MOSS_STAIRS,
					SSWPBlocks.MOSS_WALL,
					SSWPBlocks.SHROOMLIGHT_SLAB,
					SSWPBlocks.SHROOMLIGHT_STAIRS,
					SSWPBlocks.SHROOMLIGHT_WALL,
					SSWPBlocks.DRIED_KELP_SLAB,
					SSWPBlocks.DRIED_KELP_STAIRS,
					SSWPBlocks.DRIED_KELP_WALL,
					SSWPBlocks.HAY_SLAB,
					SSWPBlocks.HAY_STAIRS,
					SSWPBlocks.HAY_WALL,
					SSWPBlocks.SCULK_SLAB,
					SSWPBlocks.SCULK_STAIRS,
					SSWPBlocks.SCULK_WALL)
			.addTag(SSWPTags.Blocks.WART_BLOCKS)
			.addTag(SSWPTags.Blocks.WART_SLABS)
			.addTag(SSWPTags.Blocks.WART_STAIRS)
			.addTag(SSWPTags.Blocks.WART_WALLS);
			
			this.getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
			.add(SSWPBlocks.PACKED_MUD_SLAB,
					SSWPBlocks.PACKED_MUD_STAIRS,
					SSWPBlocks.PACKED_MUD_WALL,
					SSWPBlocks.NETHERRACK_SLAB,
					SSWPBlocks.NETHERRACK_STAIRS,
					SSWPBlocks.NETHERRACK_WALL,
					SSWPBlocks.END_STONE_SLAB,
					SSWPBlocks.END_STONE_STAIRS,
					SSWPBlocks.END_STONE_WALL,
					SSWPBlocks.COAL_SLAB,
					SSWPBlocks.COAL_STAIRS,
					SSWPBlocks.COAL_WALL,
					SSWPBlocks.IRON_SLAB,
					SSWPBlocks.IRON_STAIRS,
					SSWPBlocks.IRON_WALL,
					SSWPBlocks.IRON_FENCE,
					SSWPBlocks.IRON_FENCE_GATE,
					SSWPBlocks.IRON_BUTTON,
					SSWPBlocks.GOLD_SLAB,
					SSWPBlocks.GOLD_STAIRS,
					SSWPBlocks.GOLD_WALL,
					SSWPBlocks.GOLD_FENCE,
					SSWPBlocks.GOLD_FENCE_GATE,
					SSWPBlocks.GOLD_BARS,
					SSWPBlocks.GOLD_DOOR,
					SSWPBlocks.GOLD_TRAPDOOR,
					SSWPBlocks.GOLD_BUTTON,
					SSWPBlocks.GOLD_CHAIN,
					SSWPBlocks.REDSTONE_SLAB,
					SSWPBlocks.REDSTONE_STAIRS,
					SSWPBlocks.REDSTONE_WALL,
					SSWPBlocks.EMERALD_SLAB,
					SSWPBlocks.EMERALD_STAIRS,
					SSWPBlocks.EMERALD_WALL,
					SSWPBlocks.LAPIS_SLAB,
					SSWPBlocks.LAPIS_STAIRS,
					SSWPBlocks.LAPIS_WALL,
					SSWPBlocks.DIAMOND_SLAB,
					SSWPBlocks.DIAMOND_STAIRS,
					SSWPBlocks.DIAMOND_WALL,
					SSWPBlocks.NETHERITE_SLAB,
					SSWPBlocks.NETHERITE_STAIRS,
					SSWPBlocks.NETHERITE_WALL,
					SSWPBlocks.NETHERITE_FENCE,
					SSWPBlocks.NETHERITE_FENCE_GATE,
					SSWPBlocks.NETHERITE_BARS,
					SSWPBlocks.NETHERITE_DOOR,
					SSWPBlocks.NETHERITE_TRAPDOOR,
					SSWPBlocks.NETHERITE_PRESSURE_PLATE,
					SSWPBlocks.NETHERITE_BUTTON,
					SSWPBlocks.NETHERITE_CHAIN,
					SSWPBlocks.AMETHYST_SLAB,
					SSWPBlocks.AMETHYST_STAIRS,
					SSWPBlocks.AMETHYST_WALL,
					SSWPBlocks.CALCITE_SLAB,
					SSWPBlocks.CALCITE_STAIRS,
					SSWPBlocks.CALCITE_WALL,
					SSWPBlocks.DRIPSTONE_SLAB,
					SSWPBlocks.DRIPSTONE_STAIRS,
					SSWPBlocks.DRIPSTONE_WALL,
					SSWPBlocks.MAGMA_SLAB,
					SSWPBlocks.MAGMA_STAIRS,
					SSWPBlocks.MAGMA_WALL,
					SSWPBlocks.BONE_SLAB,
					SSWPBlocks.BONE_STAIRS,
					SSWPBlocks.BONE_WALL,
					SSWPBlocks.ANCIENT_DEBRIS_SLAB,
					SSWPBlocks.ANCIENT_DEBRIS_STAIRS,
					SSWPBlocks.ANCIENT_DEBRIS_WALL,
					SSWPBlocks.RAW_IRON_SLAB,
					SSWPBlocks.RAW_IRON_STAIRS,
					SSWPBlocks.RAW_IRON_WALL,
					SSWPBlocks.RAW_COPPER_SLAB,
					SSWPBlocks.RAW_COPPER_STAIRS,
					SSWPBlocks.RAW_COPPER_WALL,
					SSWPBlocks.RAW_GOLD_SLAB,
					SSWPBlocks.RAW_GOLD_STAIRS,
					SSWPBlocks.RAW_GOLD_WALL,
					SSWPBlocks.REDSTONE_LAMP_SLAB,
					SSWPBlocks.REDSTONE_LAMP_STAIRS,
					SSWPBlocks.REDSTONE_LAMP_WALL,
					SSWPBlocks.IRON_LADDER,
					SSWPBlocks.GOLD_LADDER,
					SSWPBlocks.NETHERITE_LADDER,
					SSWPBlocks.IRON_SIGN,
					SSWPBlocks.IRON_WALL_SIGN,
					SSWPBlocks.IRON_HANGING_SIGN,
					SSWPBlocks.IRON_WALL_HANGING_SIGN,
					SSWPBlocks.GOLD_SIGN,
					SSWPBlocks.GOLD_WALL_SIGN,
					SSWPBlocks.GOLD_HANGING_SIGN,
					SSWPBlocks.GOLD_WALL_HANGING_SIGN,
					SSWPBlocks.NETHERITE_SIGN,
					SSWPBlocks.NETHERITE_WALL_SIGN,
					SSWPBlocks.NETHERITE_HANGING_SIGN,
					SSWPBlocks.NETHERITE_WALL_HANGING_SIGN,
					SSWPBlocks.NETHERITE_ANVIL)
			.addTag(SSWPTags.Blocks.STONE)
			.addTag(SSWPTags.Blocks.STONE_SLABS)
			.addTag(SSWPTags.Blocks.STONE_STAIRS)
			.addTag(SSWPTags.Blocks.STONE_WALLS)
			.addTag(SSWPTags.Blocks.GRANITE)
			.addTag(SSWPTags.Blocks.GRANITE_SLABS)
			.addTag(SSWPTags.Blocks.GRANITE_STAIRS)
			.addTag(SSWPTags.Blocks.GRANITE_WALLS)
			.addTag(SSWPTags.Blocks.DIORITE)
			.addTag(SSWPTags.Blocks.DIORITE_SLABS)
			.addTag(SSWPTags.Blocks.DIORITE_STAIRS)
			.addTag(SSWPTags.Blocks.DIORITE_WALLS)
			.addTag(SSWPTags.Blocks.ANDESITE)
			.addTag(SSWPTags.Blocks.ANDESITE_SLABS)
			.addTag(SSWPTags.Blocks.ANDESITE_STAIRS)
			.addTag(SSWPTags.Blocks.ANDESITE_WALLS)
			.addTag(SSWPTags.Blocks.DEEPSLATE)
			.addTag(SSWPTags.Blocks.DEEPSLATE_SLABS)
			.addTag(SSWPTags.Blocks.DEEPSLATE_STAIRS)
			.addTag(SSWPTags.Blocks.DEEPSLATE_WALLS)
			.addTag(SSWPTags.Blocks.TUFF)
			.addTag(SSWPTags.Blocks.TUFF_SLABS)
			.addTag(SSWPTags.Blocks.TUFF_STAIRS)
			.addTag(SSWPTags.Blocks.TUFF_WALLS)
			.addTag(SSWPTags.Blocks.SANDSTONE)
			.addTag(SSWPTags.Blocks.SANDSTONE_SLABS)
			.addTag(SSWPTags.Blocks.SANDSTONE_STAIRS)
			.addTag(SSWPTags.Blocks.SANDSTONE_WALLS)
			.addTag(SSWPTags.Blocks.PRISMARINE)
			.addTag(SSWPTags.Blocks.PRISMARINE_SLABS)
			.addTag(SSWPTags.Blocks.PRISMARINE_STAIRS)
			.addTag(SSWPTags.Blocks.PRISMARINE_WALLS)
			.addTag(SSWPTags.Blocks.NETHER_BRICK_BLOCKS)
			.addTag(SSWPTags.Blocks.NETHER_BRICK_SLABS)
			.addTag(SSWPTags.Blocks.NETHER_BRICK_STAIRS)
			.addTag(SSWPTags.Blocks.NETHER_BRICK_WALLS)
			.addTag(SSWPTags.Blocks.NETHER_BRICK_FENCES)
			.addTag(SSWPTags.Blocks.NETHER_BRICK_FENCE_GATES)
			.addTag(SSWPTags.Blocks.BASALT)
			.addTag(SSWPTags.Blocks.BASALT_SLABS)
			.addTag(SSWPTags.Blocks.BASALT_STAIRS)
			.addTag(SSWPTags.Blocks.BASALT_WALLS)
			.addTag(SSWPTags.Blocks.BLACKSTONE)
			.addTag(SSWPTags.Blocks.BLACKSTONE_SLABS)
			.addTag(SSWPTags.Blocks.BLACKSTONE_STAIRS)
			.addTag(SSWPTags.Blocks.BLACKSTONE_WALLS)
			.addTag(SSWPTags.Blocks.PURPUR_BLOCKS)
			.addTag(SSWPTags.Blocks.PURPUR_SLABS)
			.addTag(SSWPTags.Blocks.PURPUR_STAIRS)
			.addTag(SSWPTags.Blocks.PURPUR_WALLS)
			.addTag(SSWPTags.Blocks.QUARTZ_BLOCKS)
			.addTag(SSWPTags.Blocks.QUARTZ_SLABS)
			.addTag(SSWPTags.Blocks.QUARTZ_STAIRS)
			.addTag(SSWPTags.Blocks.QUARTZ_WALLS)
			.addTag(SSWPTags.Blocks.COPPER_BLOCKS)
			.addTag(SSWPTags.Blocks.COPPER_SLABS)
			.addTag(SSWPTags.Blocks.COPPER_STAIRS)
			.addTag(SSWPTags.Blocks.COPPER_WALLS)
			.addTag(SSWPTags.Blocks.COPPER_FENCES)
			.addTag(SSWPTags.Blocks.COPPER_FENCE_GATES)
			.addTag(SSWPTags.Blocks.COPPER_BARS)
			.addTag(SSWPTags.Blocks.COPPER_DOORS)
			.addTag(SSWPTags.Blocks.COPPER_TRAPDOORS)
			.addTag(SSWPTags.Blocks.COPPER_PRESSURE_PLATES)
			.addTag(SSWPTags.Blocks.COPPER_BUTTONS)
			.addTag(SSWPTags.Blocks.COPPER_CHAINS)
			.addTag(SSWPTags.Blocks.COPPER_BULBS)
			.addTag(SSWPTags.Blocks.TERRACOTTA_SLABS)
			.addTag(SSWPTags.Blocks.TERRACOTTA_STAIRS)
			.addTag(SSWPTags.Blocks.TERRACOTTA_WALLS)
			.addTag(SSWPTags.Blocks.CONCRETE_SLABS)
			.addTag(SSWPTags.Blocks.CONCRETE_STAIRS)
			.addTag(SSWPTags.Blocks.CONCRETE_WALLS)
			.addTag(SSWPTags.Blocks.ICE_SLABS)
			.addTag(SSWPTags.Blocks.ICE_STAIRS)
			.addTag(SSWPTags.Blocks.ICE_WALLS)
			.addTag(SSWPTags.Blocks.OBSIDIAN)
			.addTag(SSWPTags.Blocks.OBSIDIAN_SLABS)
			.addTag(SSWPTags.Blocks.OBSIDIAN_STAIRS)
			.addTag(SSWPTags.Blocks.OBSIDIAN_WALLS)
			.addTag(SSWPTags.Blocks.NYLIUM_SLABS)
			.addTag(SSWPTags.Blocks.NYLIUM_STAIRS)
			.addTag(SSWPTags.Blocks.NYLIUM_WALLS)
			.addTag(SSWPTags.Blocks.COAL_ORE_SLABS)
			.addTag(SSWPTags.Blocks.COAL_ORE_STAIRS)
			.addTag(SSWPTags.Blocks.COAL_ORE_WALLS)
			.addTag(SSWPTags.Blocks.IRON_ORE_SLABS)
			.addTag(SSWPTags.Blocks.IRON_ORE_STAIRS)
			.addTag(SSWPTags.Blocks.IRON_ORE_WALLS)
			.addTag(SSWPTags.Blocks.COPPER_ORE_SLABS)
			.addTag(SSWPTags.Blocks.COPPER_ORE_STAIRS)
			.addTag(SSWPTags.Blocks.COPPER_ORE_WALLS)
			.addTag(SSWPTags.Blocks.GOLD_ORE_SLABS)
			.addTag(SSWPTags.Blocks.GOLD_ORE_STAIRS)
			.addTag(SSWPTags.Blocks.GOLD_ORE_WALLS)
			.addTag(SSWPTags.Blocks.REDSTONE_ORE_SLABS)
			.addTag(SSWPTags.Blocks.REDSTONE_ORE_STAIRS)
			.addTag(SSWPTags.Blocks.REDSTONE_ORE_WALLS)
			.addTag(SSWPTags.Blocks.EMERALD_ORE_SLABS)
			.addTag(SSWPTags.Blocks.EMERALD_ORE_STAIRS)
			.addTag(SSWPTags.Blocks.EMERALD_ORE_WALLS)
			.addTag(SSWPTags.Blocks.LAPIS_ORE_SLABS)
			.addTag(SSWPTags.Blocks.LAPIS_ORE_STAIRS)
			.addTag(SSWPTags.Blocks.LAPIS_ORE_WALLS)
			.addTag(SSWPTags.Blocks.DIAMOND_ORE_SLABS)
			.addTag(SSWPTags.Blocks.DIAMOND_ORE_STAIRS)
			.addTag(SSWPTags.Blocks.DIAMOND_ORE_WALLS)
			.addTag(SSWPTags.Blocks.QUARTZ_ORES)
			.addTag(SSWPTags.Blocks.QUARTZ_ORE_SLABS)
			.addTag(SSWPTags.Blocks.QUARTZ_ORE_STAIRS)
			.addTag(SSWPTags.Blocks.QUARTZ_ORE_WALLS)
			.addTag(SSWPTags.Blocks.CORAL_SLABS)
			.addTag(SSWPTags.Blocks.CORAL_STAIRS)
			.addTag(SSWPTags.Blocks.CORAL_WALLS)
			.addTag(SSWPTags.Blocks.DEAD_CORAL_SLABS)
			.addTag(SSWPTags.Blocks.DEAD_CORAL_STAIRS)
			.addTag(SSWPTags.Blocks.DEAD_CORAL_WALLS)
			.addTag(SSWPTags.Blocks.COPPER_LADDERS)
			.addTag(SSWPTags.Blocks.ALL_COPPER_SIGNS)
			.addTag(SSWPTags.Blocks.LANTERNS);
			
			this.getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
			.add(SSWPBlocks.DIRT_PATH_SLAB,
					SSWPBlocks.DIRT_PATH_STAIRS,
					SSWPBlocks.DIRT_PATH_WALL,
					SSWPBlocks.CLAY_SLAB,
					SSWPBlocks.CLAY_STAIRS,
					SSWPBlocks.CLAY_WALL,
					SSWPBlocks.SNOW_SLAB,
					SSWPBlocks.SNOW_STAIRS,
					SSWPBlocks.SNOW_WALL,
					SSWPBlocks.SOUL_SAND_SLAB,
					SSWPBlocks.SOUL_SAND_STAIRS,
					SSWPBlocks.SOUL_SAND_WALL,
					SSWPBlocks.SOUL_SOIL_SLAB,
					SSWPBlocks.SOUL_SOIL_STAIRS,
					SSWPBlocks.SOUL_SOIL_WALL)
			.addTag(SSWPTags.Blocks.DIRT_SLABS)
			.addTag(SSWPTags.Blocks.DIRT_STAIRS)
			.addTag(SSWPTags.Blocks.DIRT_WALLS);
			
			this.getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
			.add(SSWPBlocks.IRON_SLAB,
					SSWPBlocks.IRON_STAIRS,
					SSWPBlocks.IRON_WALL,
					SSWPBlocks.IRON_FENCE,
					SSWPBlocks.IRON_FENCE_GATE,
					SSWPBlocks.IRON_BUTTON,
					SSWPBlocks.GOLD_CHAIN,
					SSWPBlocks.LAPIS_SLAB,
					SSWPBlocks.LAPIS_STAIRS,
					SSWPBlocks.LAPIS_WALL,
					SSWPBlocks.RAW_IRON_SLAB,
					SSWPBlocks.RAW_IRON_STAIRS,
					SSWPBlocks.RAW_IRON_WALL,
					SSWPBlocks.RAW_COPPER_SLAB,
					SSWPBlocks.RAW_COPPER_STAIRS,
					SSWPBlocks.RAW_COPPER_WALL,
					SSWPBlocks.IRON_LADDER,
					SSWPBlocks.IRON_SIGN,
					SSWPBlocks.IRON_WALL_SIGN,
					SSWPBlocks.IRON_HANGING_SIGN,
					SSWPBlocks.IRON_WALL_HANGING_SIGN)
			.addTag(SSWPTags.Blocks.COPPER_BLOCKS)
			.addTag(SSWPTags.Blocks.COPPER_SLABS)
			.addTag(SSWPTags.Blocks.COPPER_STAIRS)
			.addTag(SSWPTags.Blocks.COPPER_WALLS)
			.addTag(SSWPTags.Blocks.COPPER_FENCES)
			.addTag(SSWPTags.Blocks.COPPER_FENCE_GATES)
			.addTag(SSWPTags.Blocks.COPPER_BARS)
			.addTag(SSWPTags.Blocks.COPPER_DOORS)
			.addTag(SSWPTags.Blocks.COPPER_TRAPDOORS)
			.addTag(SSWPTags.Blocks.COPPER_PRESSURE_PLATES)
			.addTag(SSWPTags.Blocks.COPPER_BUTTONS)
			.addTag(SSWPTags.Blocks.COPPER_CHAINS)
			.addTag(SSWPTags.Blocks.COPPER_BULBS)
			.addTag(SSWPTags.Blocks.IRON_ORE_SLABS)
			.addTag(SSWPTags.Blocks.IRON_ORE_STAIRS)
			.addTag(SSWPTags.Blocks.IRON_ORE_WALLS)
			.addTag(SSWPTags.Blocks.COPPER_ORE_SLABS)
			.addTag(SSWPTags.Blocks.COPPER_ORE_STAIRS)
			.addTag(SSWPTags.Blocks.COPPER_ORE_WALLS)
			.addTag(SSWPTags.Blocks.LAPIS_ORE_SLABS)
			.addTag(SSWPTags.Blocks.LAPIS_ORE_STAIRS)
			.addTag(SSWPTags.Blocks.LAPIS_ORE_WALLS)
			.addTag(SSWPTags.Blocks.COPPER_LADDERS)
			.addTag(SSWPTags.Blocks.ALL_COPPER_SIGNS)
			.addTag(SSWPTags.Blocks.COPPER_CAULDRONS)
			.addTag(SSWPTags.Blocks.COPPER_LANTERNS);
			
			this.getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
			.add(SSWPBlocks.GOLD_SLAB,
					SSWPBlocks.GOLD_STAIRS,
					SSWPBlocks.GOLD_WALL,
					SSWPBlocks.GOLD_FENCE,
					SSWPBlocks.GOLD_FENCE_GATE,
					SSWPBlocks.GOLD_BARS,
					SSWPBlocks.GOLD_DOOR,
					SSWPBlocks.GOLD_TRAPDOOR,
					SSWPBlocks.GOLD_BUTTON,
					SSWPBlocks.REDSTONE_SLAB,
					SSWPBlocks.REDSTONE_STAIRS,
					SSWPBlocks.REDSTONE_WALL,
					SSWPBlocks.EMERALD_SLAB,
					SSWPBlocks.EMERALD_STAIRS,
					SSWPBlocks.EMERALD_WALL,
					SSWPBlocks.DIAMOND_SLAB,
					SSWPBlocks.DIAMOND_STAIRS,
					SSWPBlocks.DIAMOND_WALL,
					SSWPBlocks.NETHERITE_CHAIN,
					SSWPBlocks.GOLD_ORE_SLAB,
					SSWPBlocks.GOLD_ORE_STAIRS,
					SSWPBlocks.GOLD_ORE_WALL,
					SSWPBlocks.DEEPSLATE_GOLD_ORE_SLAB,
					SSWPBlocks.DEEPSLATE_GOLD_ORE_STAIRS,
					SSWPBlocks.DEEPSLATE_GOLD_ORE_WALL,
					SSWPBlocks.RAW_GOLD_SLAB,
					SSWPBlocks.RAW_GOLD_STAIRS,
					SSWPBlocks.RAW_GOLD_WALL,
					SSWPBlocks.GOLD_LADDER,
					SSWPBlocks.GOLD_SIGN,
					SSWPBlocks.GOLD_WALL_SIGN,
					SSWPBlocks.GOLD_HANGING_SIGN,
					SSWPBlocks.GOLD_WALL_HANGING_SIGN,
					SSWPBlocks.GOLD_CAULDRON,
					SSWPBlocks.GOLD_WATER_CAULDRON,
					SSWPBlocks.GOLD_LAVA_CAULDRON,
					SSWPBlocks.GOLD_POWDER_SNOW_CAULDRON,
					SSWPBlocks.GOLD_LANTERN,
					SSWPBlocks.GOLD_SOUL_LANTERN)
			.addTag(SSWPTags.Blocks.REDSTONE_ORE_SLABS)
			.addTag(SSWPTags.Blocks.REDSTONE_ORE_STAIRS)
			.addTag(SSWPTags.Blocks.REDSTONE_ORE_WALLS)
			.addTag(SSWPTags.Blocks.EMERALD_ORE_SLABS)
			.addTag(SSWPTags.Blocks.EMERALD_ORE_STAIRS)
			.addTag(SSWPTags.Blocks.EMERALD_ORE_WALLS)
			.addTag(SSWPTags.Blocks.DIAMOND_ORE_SLABS)
			.addTag(SSWPTags.Blocks.DIAMOND_ORE_STAIRS)
			.addTag(SSWPTags.Blocks.DIAMOND_ORE_WALLS);
			
			this.getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
			.add(SSWPBlocks.NETHERITE_SLAB,
					SSWPBlocks.NETHERITE_STAIRS,
					SSWPBlocks.NETHERITE_WALL,
					SSWPBlocks.NETHERITE_FENCE,
					SSWPBlocks.NETHERITE_FENCE_GATE,
					SSWPBlocks.NETHERITE_BARS,
					SSWPBlocks.NETHERITE_DOOR,
					SSWPBlocks.NETHERITE_TRAPDOOR,
					SSWPBlocks.NETHERITE_PRESSURE_PLATE,
					SSWPBlocks.NETHERITE_BUTTON,
					SSWPBlocks.ANCIENT_DEBRIS_SLAB,
					SSWPBlocks.ANCIENT_DEBRIS_STAIRS,
					SSWPBlocks.ANCIENT_DEBRIS_WALL,
					SSWPBlocks.NETHERITE_LADDER,
					SSWPBlocks.NETHERITE_SIGN,
					SSWPBlocks.NETHERITE_WALL_SIGN,
					SSWPBlocks.NETHERITE_HANGING_SIGN,
					SSWPBlocks.NETHERITE_WALL_HANGING_SIGN,
					SSWPBlocks.NETHERITE_CAULDRON,
					SSWPBlocks.NETHERITE_WATER_CAULDRON,
					SSWPBlocks.NETHERITE_LAVA_CAULDRON,
					SSWPBlocks.NETHERITE_POWDER_SNOW_CAULDRON,
					SSWPBlocks.NETHERITE_LANTERN,
					SSWPBlocks.NETHERITE_SOUL_LANTERN,
					SSWPBlocks.NETHERITE_ANVIL)
			.addTag(SSWPTags.Blocks.OBSIDIAN)
			.addTag(SSWPTags.Blocks.OBSIDIAN_SLABS)
			.addTag(SSWPTags.Blocks.OBSIDIAN_STAIRS)
			.addTag(SSWPTags.Blocks.OBSIDIAN_WALLS);
			
			this.getOrCreateTagBuilder(BlockTags.INFINIBURN_OVERWORLD)
			.add(SSWPBlocks.NETHERRACK_SLAB,
					SSWPBlocks.NETHERRACK_STAIRS,
					SSWPBlocks.NETHERRACK_WALL,
					SSWPBlocks.MAGMA_SLAB,
					SSWPBlocks.MAGMA_STAIRS,
					SSWPBlocks.MAGMA_WALL);
			
			this.getOrCreateTagBuilder(BlockTags.INFINIBURN_END)
			.add(SSWPBlocks.BEDROCK_SLAB,
					SSWPBlocks.BEDROCK_STAIRS,
					SSWPBlocks.BEDROCK_WALL);
			
			this.getOrCreateTagBuilder(BlockTags.GUARDED_BY_PIGLINS)
			.add(SSWPBlocks.GILDED_BLACKSTONE_SLAB,
					SSWPBlocks.GILDED_BLACKSTONE_STAIRS,
					SSWPBlocks.GILDED_BLACKSTONE_WALL,
					SSWPBlocks.GOLD_SLAB,
					SSWPBlocks.GOLD_STAIRS,
					SSWPBlocks.GOLD_WALL,
					SSWPBlocks.GOLD_FENCE,
					SSWPBlocks.GOLD_FENCE_GATE,
					SSWPBlocks.GOLD_BARS,
					SSWPBlocks.GOLD_DOOR,
					SSWPBlocks.GOLD_TRAPDOOR,
					SSWPBlocks.GOLD_BUTTON,
					SSWPBlocks.GOLD_CHAIN,
					SSWPBlocks.RAW_GOLD_SLAB,
					SSWPBlocks.RAW_GOLD_STAIRS,
					SSWPBlocks.RAW_GOLD_WALL,
					SSWPBlocks.GOLD_LADDER,
					SSWPBlocks.GOLD_SIGN,
					SSWPBlocks.GOLD_WALL_SIGN,
					SSWPBlocks.GOLD_HANGING_SIGN,
					SSWPBlocks.GOLD_WALL_HANGING_SIGN,
					SSWPBlocks.GOLD_CAULDRON,
					SSWPBlocks.GOLD_WATER_CAULDRON,
					SSWPBlocks.GOLD_LAVA_CAULDRON,
					SSWPBlocks.GOLD_POWDER_SNOW_CAULDRON,
					SSWPBlocks.GOLD_LANTERN,
					SSWPBlocks.GOLD_SOUL_LANTERN)
			.addTag(SSWPTags.Blocks.GOLD_ORE_SLABS)
			.addTag(SSWPTags.Blocks.GOLD_ORE_STAIRS)
			.addTag(SSWPTags.Blocks.GOLD_ORE_WALLS);
			
			this.getOrCreateTagBuilder(BlockTags.CRYSTAL_SOUND_BLOCKS)
			.add(SSWPBlocks.AMETHYST_SLAB,
					SSWPBlocks.AMETHYST_STAIRS,
					SSWPBlocks.AMETHYST_WALL);
			
			this.getOrCreateTagBuilder(BlockTags.VIBRATION_RESONATORS)
			.add(SSWPBlocks.AMETHYST_SLAB,
					SSWPBlocks.AMETHYST_STAIRS,
					SSWPBlocks.AMETHYST_WALL);
			
			this.getOrCreateTagBuilder(BlockTags.DAMPENS_VIBRATIONS)
			.addTag(SSWPTags.Blocks.WOOL_SLABS)
			.addTag(SSWPTags.Blocks.WOOL_STAIRS)
			.addTag(SSWPTags.Blocks.WOOL_WALLS);
			
			this.getOrCreateTagBuilder(BlockTags.AZALEA_GROWS_ON)
			.add(SSWPBlocks.CLAY_SLAB,
					SSWPBlocks.CLAY_STAIRS,
					SSWPBlocks.CLAY_WALL)
			.addTag(SSWPTags.Blocks.TERRACOTTA_SLABS)
			.addTag(SSWPTags.Blocks.TERRACOTTA_STAIRS)
			.addTag(SSWPTags.Blocks.TERRACOTTA_WALLS);
			
			this.getOrCreateTagBuilder(BlockTags.DEAD_BUSH_MAY_PLACE_ON)
			.addTag(SSWPTags.Blocks.TERRACOTTA_SLABS)
			.addTag(SSWPTags.Blocks.TERRACOTTA_STAIRS)
			.addTag(SSWPTags.Blocks.TERRACOTTA_WALLS);
			
			this.getOrCreateTagBuilder(BlockTags.IMPERMEABLE)
			.addTag(SSWPTags.Blocks.GLASS_SLABS)
			.addTag(SSWPTags.Blocks.GLASS_STAIRS)
			.addTag(SSWPTags.Blocks.GLASS_WALLS);
			
			this.getOrCreateTagBuilder(BlockTags.DRAGON_IMMUNE)
			.add(SSWPBlocks.BEDROCK_SLAB,
					SSWPBlocks.BEDROCK_STAIRS,
					SSWPBlocks.BEDROCK_WALL)
			.addTag(SSWPTags.Blocks.OBSIDIAN)
			.addTag(SSWPTags.Blocks.OBSIDIAN_SLABS)
			.addTag(SSWPTags.Blocks.OBSIDIAN_STAIRS)
			.addTag(SSWPTags.Blocks.OBSIDIAN_WALLS);
			
			this.getOrCreateTagBuilder(BlockTags.WITHER_IMMUNE)
			.add(SSWPBlocks.BEDROCK_SLAB,
					SSWPBlocks.BEDROCK_STAIRS,
					SSWPBlocks.BEDROCK_WALL);
			
			this.getOrCreateTagBuilder(BlockTags.SOUL_FIRE_BASE_BLOCKS)
			.add(SSWPBlocks.SOUL_SAND_SLAB,
					SSWPBlocks.SOUL_SAND_STAIRS,
					SSWPBlocks.SOUL_SAND_WALL,
					SSWPBlocks.SOUL_SOIL_SLAB,
					SSWPBlocks.SOUL_SOIL_STAIRS,
					SSWPBlocks.SOUL_SOIL_WALL);
			
			this.getOrCreateTagBuilder(BlockTags.SOUL_SPEED_BLOCKS)
			.add(SSWPBlocks.SOUL_SAND_SLAB,
					SSWPBlocks.SOUL_SAND_STAIRS,
					SSWPBlocks.SOUL_SAND_WALL,
					SSWPBlocks.SOUL_SOIL_SLAB,
					SSWPBlocks.SOUL_SOIL_STAIRS,
					SSWPBlocks.SOUL_SOIL_WALL);
			
			this.getOrCreateTagBuilder(BlockTags.SMALL_DRIPLEAF_PLACEABLE)
			.add(SSWPBlocks.CLAY_SLAB,
					SSWPBlocks.CLAY_STAIRS,
					SSWPBlocks.CLAY_WALL,
					SSWPBlocks.MOSS_SLAB,
					SSWPBlocks.MOSS_STAIRS,
					SSWPBlocks.MOSS_WALL);
			
			this.getOrCreateTagBuilder(BlockTags.SNOW)
			.add(SSWPBlocks.SNOW_SLAB,
					SSWPBlocks.SNOW_STAIRS,
					SSWPBlocks.SNOW_WALL);
			
			this.getOrCreateTagBuilder(BlockTags.SNOW_LAYER_CANNOT_SURVIVE_ON)
			.add(SSWPBlocks.ICE_SLAB,
					SSWPBlocks.ICE_STAIRS,
					SSWPBlocks.ICE_WALL,
					SSWPBlocks.PACKED_ICE_SLAB,
					SSWPBlocks.PACKED_ICE_STAIRS,
					SSWPBlocks.PACKED_ICE_WALL);
			
			this.getOrCreateTagBuilder(BlockTags.SNOW_LAYER_CAN_SURVIVE_ON)
			.add(SSWPBlocks.MUD_SLAB,
					SSWPBlocks.MUD_STAIRS,
					SSWPBlocks.MUD_WALL,
					SSWPBlocks.SOUL_SAND_SLAB,
					SSWPBlocks.SOUL_SAND_STAIRS,
					SSWPBlocks.SOUL_SAND_WALL);
			
			this.getOrCreateTagBuilder(BlockTags.SNIFFER_EGG_HATCH_BOOST)
			.add(SSWPBlocks.MOSS_SLAB,
					SSWPBlocks.MOSS_STAIRS,
					SSWPBlocks.MOSS_WALL);
			
			this.getOrCreateTagBuilder(BlockTags.MUSHROOM_GROW_BLOCK)
			.add(SSWPBlocks.PODZOL_SLAB,
					SSWPBlocks.PODZOL_STAIRS,
					SSWPBlocks.PODZOL_WALL,
					SSWPBlocks.MYCELIUM_SLAB,
					SSWPBlocks.MYCELIUM_STAIRS,
					SSWPBlocks.MYCELIUM_WALL);
			
			this.getOrCreateTagBuilder(BlockTags.BLOCKS_WIND_CHARGE_EXPLOSIONS)
			.add(SSWPBlocks.BEDROCK_SLAB,
					SSWPBlocks.BEDROCK_STAIRS,
					SSWPBlocks.BEDROCK_WALL);
			
			this.getOrCreateTagBuilder(BlockTags.PIGLIN_REPELLENTS)
			.addTag(SSWPTags.Blocks.SOUL_LANTERNS);
			
			this.getOrCreateTagBuilder(BlockTags.COMBINATION_STEP_SOUND_BLOCKS)
			.add(SSWPBlocks.MANGROVE_ROOT_CARPET);
			
			this.getOrCreateTagBuilder(ConventionalBlockTags.UNCOLORED_SANDSTONE_BLOCKS)
			.addTag(SSWPTags.Blocks.BEIGE_SANDSTONE);
			
			this.getOrCreateTagBuilder(ConventionalBlockTags.UNCOLORED_SANDSTONE_SLABS)
			.addTag(SSWPTags.Blocks.BEIGE_SANDSTONE_SLABS);
			
			this.getOrCreateTagBuilder(ConventionalBlockTags.UNCOLORED_SANDSTONE_STAIRS)
			.addTag(SSWPTags.Blocks.BEIGE_SANDSTONE_STAIRS);
			
			this.getOrCreateTagBuilder(ConventionalBlockTags.RED_SANDSTONE_BLOCKS)
			.addTag(SSWPTags.Blocks.RED_SANDSTONE);
			
			this.getOrCreateTagBuilder(ConventionalBlockTags.RED_SANDSTONE_SLABS)
			.addTag(SSWPTags.Blocks.RED_SANDSTONE_SLABS);
			
			this.getOrCreateTagBuilder(ConventionalBlockTags.RED_SANDSTONE_STAIRS)
			.addTag(SSWPTags.Blocks.RED_SANDSTONE_STAIRS);
			
			this.getOrCreateTagBuilder(ConventionalBlockTags.NETHER_BRICK_FENCES)
			.addTag(SSWPTags.Blocks.NETHER_BRICK_FENCES);
			
			this.getOrCreateTagBuilder(ConventionalBlockTags.CHAINS)
			.add(SSWPBlocks.GOLD_CHAIN,
					SSWPBlocks.NETHERITE_CHAIN)
			.addTag(SSWPTags.Blocks.COPPER_CHAINS);
			
			this.getOrCreateTagBuilder(ConventionalBlockTags.GLASS_PANES)
			.add(SSWPBlocks.TINTED_GLASS_PANE);
			
			this.getOrCreateTagBuilder(ConventionalBlockTags.OBSIDIANS)
			.addTag(SSWPTags.Blocks.OBSIDIAN);
			
			this.getOrCreateTagBuilder(ConventionalBlockTags.WHITE_DYED)
			.add(SSWPBlocks.WHITE_WOOL_SLAB,
					SSWPBlocks.WHITE_WOOL_STAIRS,
					SSWPBlocks.WHITE_WOOL_WALL,
					SSWPBlocks.WHITE_TERRACOTTA_SLAB,
					SSWPBlocks.WHITE_TERRACOTTA_STAIRS,
					SSWPBlocks.WHITE_TERRACOTTA_WALL,
					SSWPBlocks.WHITE_CONCRETE_SLAB,
					SSWPBlocks.WHITE_CONCRETE_STAIRS,
					SSWPBlocks.WHITE_CONCRETE_WALL,
					SSWPBlocks.WHITE_STAINED_GLASS_SLAB,
					SSWPBlocks.WHITE_STAINED_GLASS_STAIRS,
					SSWPBlocks.WHITE_STAINED_GLASS_WALL);
			
			this.getOrCreateTagBuilder(ConventionalBlockTags.LIGHT_GRAY_DYED)
			.add(SSWPBlocks.LIGHT_GRAY_WOOL_SLAB,
					SSWPBlocks.LIGHT_GRAY_WOOL_STAIRS,
					SSWPBlocks.LIGHT_GRAY_WOOL_WALL,
					SSWPBlocks.LIGHT_GRAY_TERRACOTTA_SLAB,
					SSWPBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS,
					SSWPBlocks.LIGHT_GRAY_TERRACOTTA_WALL,
					SSWPBlocks.LIGHT_GRAY_CONCRETE_SLAB,
					SSWPBlocks.LIGHT_GRAY_CONCRETE_STAIRS,
					SSWPBlocks.LIGHT_GRAY_CONCRETE_WALL,
					SSWPBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB,
					SSWPBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS,
					SSWPBlocks.LIGHT_GRAY_STAINED_GLASS_WALL);
			
			this.getOrCreateTagBuilder(ConventionalBlockTags.GRAY_DYED)
			.add(SSWPBlocks.GRAY_WOOL_SLAB,
					SSWPBlocks.GRAY_WOOL_STAIRS,
					SSWPBlocks.GRAY_WOOL_WALL,
					SSWPBlocks.GRAY_TERRACOTTA_SLAB,
					SSWPBlocks.GRAY_TERRACOTTA_STAIRS,
					SSWPBlocks.GRAY_TERRACOTTA_WALL,
					SSWPBlocks.GRAY_CONCRETE_SLAB,
					SSWPBlocks.GRAY_CONCRETE_STAIRS,
					SSWPBlocks.GRAY_CONCRETE_WALL,
					SSWPBlocks.GRAY_STAINED_GLASS_SLAB,
					SSWPBlocks.GRAY_STAINED_GLASS_STAIRS,
					SSWPBlocks.GRAY_STAINED_GLASS_WALL);
			
			this.getOrCreateTagBuilder(ConventionalBlockTags.BLACK_DYED)
			.add(SSWPBlocks.BLACK_WOOL_SLAB,
					SSWPBlocks.BLACK_WOOL_STAIRS,
					SSWPBlocks.BLACK_WOOL_WALL,
					SSWPBlocks.BLACK_TERRACOTTA_SLAB,
					SSWPBlocks.BLACK_TERRACOTTA_STAIRS,
					SSWPBlocks.BLACK_TERRACOTTA_WALL,
					SSWPBlocks.BLACK_CONCRETE_SLAB,
					SSWPBlocks.BLACK_CONCRETE_STAIRS,
					SSWPBlocks.BLACK_CONCRETE_WALL,
					SSWPBlocks.BLACK_STAINED_GLASS_SLAB,
					SSWPBlocks.BLACK_STAINED_GLASS_STAIRS,
					SSWPBlocks.BLACK_STAINED_GLASS_WALL);
			
			this.getOrCreateTagBuilder(ConventionalBlockTags.BROWN_DYED)
			.add(SSWPBlocks.BROWN_WOOL_SLAB,
					SSWPBlocks.BROWN_WOOL_STAIRS,
					SSWPBlocks.BROWN_WOOL_WALL,
					SSWPBlocks.BROWN_TERRACOTTA_SLAB,
					SSWPBlocks.BROWN_TERRACOTTA_STAIRS,
					SSWPBlocks.BROWN_TERRACOTTA_WALL,
					SSWPBlocks.BROWN_CONCRETE_SLAB,
					SSWPBlocks.BROWN_CONCRETE_STAIRS,
					SSWPBlocks.BROWN_CONCRETE_WALL,
					SSWPBlocks.BROWN_STAINED_GLASS_SLAB,
					SSWPBlocks.BROWN_STAINED_GLASS_STAIRS,
					SSWPBlocks.BROWN_STAINED_GLASS_WALL);
			
			this.getOrCreateTagBuilder(ConventionalBlockTags.RED_DYED)
			.add(SSWPBlocks.RED_WOOL_SLAB,
					SSWPBlocks.RED_WOOL_STAIRS,
					SSWPBlocks.RED_WOOL_WALL,
					SSWPBlocks.RED_TERRACOTTA_SLAB,
					SSWPBlocks.RED_TERRACOTTA_STAIRS,
					SSWPBlocks.RED_TERRACOTTA_WALL,
					SSWPBlocks.RED_CONCRETE_SLAB,
					SSWPBlocks.RED_CONCRETE_STAIRS,
					SSWPBlocks.RED_CONCRETE_WALL,
					SSWPBlocks.RED_STAINED_GLASS_SLAB,
					SSWPBlocks.RED_STAINED_GLASS_STAIRS,
					SSWPBlocks.RED_STAINED_GLASS_WALL);
			
			this.getOrCreateTagBuilder(ConventionalBlockTags.ORANGE_DYED)
			.add(SSWPBlocks.ORANGE_WOOL_SLAB,
					SSWPBlocks.ORANGE_WOOL_STAIRS,
					SSWPBlocks.ORANGE_WOOL_WALL,
					SSWPBlocks.ORANGE_TERRACOTTA_SLAB,
					SSWPBlocks.ORANGE_TERRACOTTA_STAIRS,
					SSWPBlocks.ORANGE_TERRACOTTA_WALL,
					SSWPBlocks.ORANGE_CONCRETE_SLAB,
					SSWPBlocks.ORANGE_CONCRETE_STAIRS,
					SSWPBlocks.ORANGE_CONCRETE_WALL,
					SSWPBlocks.ORANGE_STAINED_GLASS_SLAB,
					SSWPBlocks.ORANGE_STAINED_GLASS_STAIRS,
					SSWPBlocks.ORANGE_STAINED_GLASS_WALL);
			
			this.getOrCreateTagBuilder(ConventionalBlockTags.YELLOW_DYED)
			.add(SSWPBlocks.YELLOW_WOOL_SLAB,
					SSWPBlocks.YELLOW_WOOL_STAIRS,
					SSWPBlocks.YELLOW_WOOL_WALL,
					SSWPBlocks.YELLOW_TERRACOTTA_SLAB,
					SSWPBlocks.YELLOW_TERRACOTTA_STAIRS,
					SSWPBlocks.YELLOW_TERRACOTTA_WALL,
					SSWPBlocks.YELLOW_CONCRETE_SLAB,
					SSWPBlocks.YELLOW_CONCRETE_STAIRS,
					SSWPBlocks.YELLOW_CONCRETE_WALL,
					SSWPBlocks.YELLOW_STAINED_GLASS_SLAB,
					SSWPBlocks.YELLOW_STAINED_GLASS_STAIRS,
					SSWPBlocks.YELLOW_STAINED_GLASS_WALL);
			
			this.getOrCreateTagBuilder(ConventionalBlockTags.LIME_DYED)
			.add(SSWPBlocks.LIME_WOOL_SLAB,
					SSWPBlocks.LIME_WOOL_STAIRS,
					SSWPBlocks.LIME_WOOL_WALL,
					SSWPBlocks.LIME_TERRACOTTA_SLAB,
					SSWPBlocks.LIME_TERRACOTTA_STAIRS,
					SSWPBlocks.LIME_TERRACOTTA_WALL,
					SSWPBlocks.LIME_CONCRETE_SLAB,
					SSWPBlocks.LIME_CONCRETE_STAIRS,
					SSWPBlocks.LIME_CONCRETE_WALL,
					SSWPBlocks.LIME_STAINED_GLASS_SLAB,
					SSWPBlocks.LIME_STAINED_GLASS_STAIRS,
					SSWPBlocks.LIME_STAINED_GLASS_WALL);
			
			this.getOrCreateTagBuilder(ConventionalBlockTags.GREEN_DYED)
			.add(SSWPBlocks.GREEN_WOOL_SLAB,
					SSWPBlocks.GREEN_WOOL_STAIRS,
					SSWPBlocks.GREEN_WOOL_WALL,
					SSWPBlocks.GREEN_TERRACOTTA_SLAB,
					SSWPBlocks.GREEN_TERRACOTTA_STAIRS,
					SSWPBlocks.GREEN_TERRACOTTA_WALL,
					SSWPBlocks.GREEN_CONCRETE_SLAB,
					SSWPBlocks.GREEN_CONCRETE_STAIRS,
					SSWPBlocks.GREEN_CONCRETE_WALL,
					SSWPBlocks.GREEN_STAINED_GLASS_SLAB,
					SSWPBlocks.GREEN_STAINED_GLASS_STAIRS,
					SSWPBlocks.GREEN_STAINED_GLASS_WALL);
			
			this.getOrCreateTagBuilder(ConventionalBlockTags.CYAN_DYED)
			.add(SSWPBlocks.CYAN_WOOL_SLAB,
					SSWPBlocks.CYAN_WOOL_STAIRS,
					SSWPBlocks.CYAN_WOOL_WALL,
					SSWPBlocks.CYAN_TERRACOTTA_SLAB,
					SSWPBlocks.CYAN_TERRACOTTA_STAIRS,
					SSWPBlocks.CYAN_TERRACOTTA_WALL,
					SSWPBlocks.CYAN_CONCRETE_SLAB,
					SSWPBlocks.CYAN_CONCRETE_STAIRS,
					SSWPBlocks.CYAN_CONCRETE_WALL,
					SSWPBlocks.CYAN_STAINED_GLASS_SLAB,
					SSWPBlocks.CYAN_STAINED_GLASS_STAIRS,
					SSWPBlocks.CYAN_STAINED_GLASS_WALL);
			
			this.getOrCreateTagBuilder(ConventionalBlockTags.LIGHT_BLUE_DYED)
			.add(SSWPBlocks.LIGHT_BLUE_WOOL_SLAB,
					SSWPBlocks.LIGHT_BLUE_WOOL_STAIRS,
					SSWPBlocks.LIGHT_BLUE_WOOL_WALL,
					SSWPBlocks.LIGHT_BLUE_TERRACOTTA_SLAB,
					SSWPBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS,
					SSWPBlocks.LIGHT_BLUE_TERRACOTTA_WALL,
					SSWPBlocks.LIGHT_BLUE_CONCRETE_SLAB,
					SSWPBlocks.LIGHT_BLUE_CONCRETE_STAIRS,
					SSWPBlocks.LIGHT_BLUE_CONCRETE_WALL,
					SSWPBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB,
					SSWPBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS,
					SSWPBlocks.LIGHT_BLUE_STAINED_GLASS_WALL);
			
			this.getOrCreateTagBuilder(ConventionalBlockTags.BLUE_DYED)
			.add(SSWPBlocks.BLUE_WOOL_SLAB,
					SSWPBlocks.BLUE_WOOL_STAIRS,
					SSWPBlocks.BLUE_WOOL_WALL,
					SSWPBlocks.BLUE_TERRACOTTA_SLAB,
					SSWPBlocks.BLUE_TERRACOTTA_STAIRS,
					SSWPBlocks.BLUE_TERRACOTTA_WALL,
					SSWPBlocks.BLUE_CONCRETE_SLAB,
					SSWPBlocks.BLUE_CONCRETE_STAIRS,
					SSWPBlocks.BLUE_CONCRETE_WALL,
					SSWPBlocks.BLUE_STAINED_GLASS_SLAB,
					SSWPBlocks.BLUE_STAINED_GLASS_STAIRS,
					SSWPBlocks.BLUE_STAINED_GLASS_WALL);
			
			this.getOrCreateTagBuilder(ConventionalBlockTags.PURPLE_DYED)
			.add(SSWPBlocks.PURPLE_WOOL_SLAB,
					SSWPBlocks.PURPLE_WOOL_STAIRS,
					SSWPBlocks.PURPLE_WOOL_WALL,
					SSWPBlocks.PURPLE_TERRACOTTA_SLAB,
					SSWPBlocks.PURPLE_TERRACOTTA_STAIRS,
					SSWPBlocks.PURPLE_TERRACOTTA_WALL,
					SSWPBlocks.PURPLE_CONCRETE_SLAB,
					SSWPBlocks.PURPLE_CONCRETE_STAIRS,
					SSWPBlocks.PURPLE_CONCRETE_WALL,
					SSWPBlocks.PURPLE_STAINED_GLASS_SLAB,
					SSWPBlocks.PURPLE_STAINED_GLASS_STAIRS,
					SSWPBlocks.PURPLE_STAINED_GLASS_WALL);
			
			this.getOrCreateTagBuilder(ConventionalBlockTags.MAGENTA_DYED)
			.add(SSWPBlocks.MAGENTA_WOOL_SLAB,
					SSWPBlocks.MAGENTA_WOOL_STAIRS,
					SSWPBlocks.MAGENTA_WOOL_WALL,
					SSWPBlocks.MAGENTA_TERRACOTTA_SLAB,
					SSWPBlocks.MAGENTA_TERRACOTTA_STAIRS,
					SSWPBlocks.MAGENTA_TERRACOTTA_WALL,
					SSWPBlocks.MAGENTA_CONCRETE_SLAB,
					SSWPBlocks.MAGENTA_CONCRETE_STAIRS,
					SSWPBlocks.MAGENTA_CONCRETE_WALL,
					SSWPBlocks.MAGENTA_STAINED_GLASS_SLAB,
					SSWPBlocks.MAGENTA_STAINED_GLASS_STAIRS,
					SSWPBlocks.MAGENTA_STAINED_GLASS_WALL);
			
			this.getOrCreateTagBuilder(ConventionalBlockTags.PINK_DYED)
			.add(SSWPBlocks.PINK_WOOL_SLAB,
					SSWPBlocks.PINK_WOOL_STAIRS,
					SSWPBlocks.PINK_WOOL_WALL,
					SSWPBlocks.PINK_TERRACOTTA_SLAB,
					SSWPBlocks.PINK_TERRACOTTA_STAIRS,
					SSWPBlocks.PINK_TERRACOTTA_WALL,
					SSWPBlocks.PINK_CONCRETE_SLAB,
					SSWPBlocks.PINK_CONCRETE_STAIRS,
					SSWPBlocks.PINK_CONCRETE_WALL,
					SSWPBlocks.PINK_STAINED_GLASS_SLAB,
					SSWPBlocks.PINK_STAINED_GLASS_STAIRS,
					SSWPBlocks.PINK_STAINED_GLASS_WALL);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.CHESTS_WOODEN_NOT_TRAPPED)
			.add(SSWPBlocks.OAK_CHEST,
					SSWPBlocks.SPRUCE_CHEST,
					SSWPBlocks.BIRCH_CHEST,
					SSWPBlocks.JUNGLE_CHEST,
					SSWPBlocks.ACACIA_CHEST,
					SSWPBlocks.DARK_OAK_CHEST,
					SSWPBlocks.MANGROVE_CHEST,
					SSWPBlocks.CHERRY_CHEST,
					SSWPBlocks.BAMBOO_CHEST,
					SSWPBlocks.CRIMSON_CHEST,
					SSWPBlocks.WARPED_CHEST);
			
			this.getOrCreateTagBuilder(AquiferTags.Blocks.CHESTS_WOODEN_TRAPPED)
			.add(SSWPBlocks.OAK_TRAPPED_CHEST,
					SSWPBlocks.SPRUCE_TRAPPED_CHEST,
					SSWPBlocks.BIRCH_TRAPPED_CHEST,
					SSWPBlocks.JUNGLE_TRAPPED_CHEST,
					SSWPBlocks.ACACIA_TRAPPED_CHEST,
					SSWPBlocks.DARK_OAK_TRAPPED_CHEST,
					SSWPBlocks.MANGROVE_TRAPPED_CHEST,
					SSWPBlocks.CHERRY_TRAPPED_CHEST,
					SSWPBlocks.BAMBOO_TRAPPED_CHEST,
					SSWPBlocks.CRIMSON_TRAPPED_CHEST,
					SSWPBlocks.WARPED_TRAPPED_CHEST);
		}
	}
	
	protected static final class ItemTagGen extends ItemTagProvider {
		protected ItemTagGen(FabricDataOutput output, CompletableFuture<WrapperLookup> registriesFuture, SSWPTagGen.BlockTagGen blockTagGen) {
			super(output,  registriesFuture, blockTagGen);
		}
		
		@Override
		public void configure(WrapperLookup wrapperLookup) {
			this.copy(SSWPTags.Blocks.OAK_SLABS, SSWPTags.Items.OAK_SLABS);
			this.copy(SSWPTags.Blocks.OAK_STAIRS, SSWPTags.Items.OAK_STAIRS);
			this.copy(SSWPTags.Blocks.OAK_WALLS, SSWPTags.Items.OAK_WALLS);
			this.copy(SSWPTags.Blocks.SPRUCE_SLABS, SSWPTags.Items.SPRUCE_SLABS);
			this.copy(SSWPTags.Blocks.SPRUCE_STAIRS, SSWPTags.Items.SPRUCE_STAIRS);
			this.copy(SSWPTags.Blocks.SPRUCE_WALLS, SSWPTags.Items.SPRUCE_WALLS);
			this.copy(SSWPTags.Blocks.BIRCH_SLABS, SSWPTags.Items.BIRCH_SLABS);
			this.copy(SSWPTags.Blocks.BIRCH_STAIRS, SSWPTags.Items.BIRCH_STAIRS);
			this.copy(SSWPTags.Blocks.BIRCH_WALLS, SSWPTags.Items.BIRCH_WALLS);
			this.copy(SSWPTags.Blocks.JUNGLE_SLABS, SSWPTags.Items.JUNGLE_SLABS);
			this.copy(SSWPTags.Blocks.JUNGLE_STAIRS, SSWPTags.Items.JUNGLE_STAIRS);
			this.copy(SSWPTags.Blocks.JUNGLE_WALLS, SSWPTags.Items.JUNGLE_WALLS);
			this.copy(SSWPTags.Blocks.ACACIA_SLABS, SSWPTags.Items.ACACIA_SLABS);
			this.copy(SSWPTags.Blocks.ACACIA_STAIRS, SSWPTags.Items.ACACIA_STAIRS);
			this.copy(SSWPTags.Blocks.ACACIA_WALLS, SSWPTags.Items.ACACIA_WALLS);
			this.copy(SSWPTags.Blocks.DARK_OAK_SLABS, SSWPTags.Items.DARK_OAK_SLABS);
			this.copy(SSWPTags.Blocks.DARK_OAK_STAIRS, SSWPTags.Items.DARK_OAK_STAIRS);
			this.copy(SSWPTags.Blocks.DARK_OAK_WALLS, SSWPTags.Items.DARK_OAK_WALLS);
			this.copy(SSWPTags.Blocks.MANGROVE_SLABS, SSWPTags.Items.MANGROVE_SLABS);
			this.copy(SSWPTags.Blocks.MANGROVE_STAIRS, SSWPTags.Items.MANGROVE_STAIRS);
			this.copy(SSWPTags.Blocks.MANGROVE_WALLS, SSWPTags.Items.MANGROVE_WALLS);
			this.copy(SSWPTags.Blocks.CHERRY_SLABS, SSWPTags.Items.CHERRY_SLABS);
			this.copy(SSWPTags.Blocks.CHERRY_STAIRS, SSWPTags.Items.CHERRY_STAIRS);
			this.copy(SSWPTags.Blocks.CHERRY_WALLS, SSWPTags.Items.CHERRY_WALLS);
			this.copy(SSWPTags.Blocks.BAMBOO_PLANKS, SSWPTags.Items.BAMBOO_PLANKS);
			this.copy(SSWPTags.Blocks.BAMBOO_SLABS, SSWPTags.Items.BAMBOO_SLABS);
			this.copy(SSWPTags.Blocks.BAMBOO_STAIRS, SSWPTags.Items.BAMBOO_STAIRS);
			this.copy(SSWPTags.Blocks.BAMBOO_WALLS, SSWPTags.Items.BAMBOO_WALLS);
			this.copy(SSWPTags.Blocks.CRIMSON_SLABS, SSWPTags.Items.CRIMSON_SLABS);
			this.copy(SSWPTags.Blocks.CRIMSON_STAIRS, SSWPTags.Items.CRIMSON_STAIRS);
			this.copy(SSWPTags.Blocks.CRIMSON_WALLS, SSWPTags.Items.CRIMSON_WALLS);
			this.copy(SSWPTags.Blocks.WARPED_SLABS, SSWPTags.Items.WARPED_SLABS);
			this.copy(SSWPTags.Blocks.WARPED_STAIRS, SSWPTags.Items.WARPED_STAIRS);
			this.copy(SSWPTags.Blocks.WARPED_WALLS, SSWPTags.Items.WARPED_WALLS);
			this.copy(SSWPTags.Blocks.STONE, SSWPTags.Items.STONE);
			this.copy(SSWPTags.Blocks.STONE_SLABS, SSWPTags.Items.STONE_SLABS);
			this.copy(SSWPTags.Blocks.STONE_STAIRS, SSWPTags.Items.STONE_STAIRS);
			this.copy(SSWPTags.Blocks.STONE_WALLS, SSWPTags.Items.STONE_WALLS);
			this.copy(SSWPTags.Blocks.STONE_BRICK_SLABS, SSWPTags.Items.STONE_BRICK_SLABS);
			this.copy(SSWPTags.Blocks.STONE_BRICK_STAIRS, SSWPTags.Items.STONE_BRICK_STAIRS);
			this.copy(SSWPTags.Blocks.STONE_BRICK_WALLS, SSWPTags.Items.STONE_BRICK_WALLS);
			this.copy(SSWPTags.Blocks.GRANITE, SSWPTags.Items.GRANITE);
			this.copy(SSWPTags.Blocks.GRANITE_SLABS, SSWPTags.Items.GRANITE_SLABS);
			this.copy(SSWPTags.Blocks.GRANITE_STAIRS, SSWPTags.Items.GRANITE_STAIRS);
			this.copy(SSWPTags.Blocks.GRANITE_WALLS, SSWPTags.Items.GRANITE_WALLS);
			this.copy(SSWPTags.Blocks.DIORITE, SSWPTags.Items.DIORITE);
			this.copy(SSWPTags.Blocks.DIORITE_SLABS, SSWPTags.Items.DIORITE_SLABS);
			this.copy(SSWPTags.Blocks.DIORITE_STAIRS, SSWPTags.Items.DIORITE_STAIRS);
			this.copy(SSWPTags.Blocks.DIORITE_WALLS, SSWPTags.Items.DIORITE_WALLS);
			this.copy(SSWPTags.Blocks.ANDESITE, SSWPTags.Items.ANDESITE);
			this.copy(SSWPTags.Blocks.ANDESITE_SLABS, SSWPTags.Items.ANDESITE_SLABS);
			this.copy(SSWPTags.Blocks.ANDESITE_STAIRS, SSWPTags.Items.ANDESITE_STAIRS);
			this.copy(SSWPTags.Blocks.ANDESITE_WALLS, SSWPTags.Items.ANDESITE_WALLS);
			this.copy(SSWPTags.Blocks.DEEPSLATE, SSWPTags.Items.DEEPSLATE);
			this.copy(SSWPTags.Blocks.DEEPSLATE_SLABS, SSWPTags.Items.DEEPSLATE_SLABS);
			this.copy(SSWPTags.Blocks.DEEPSLATE_STAIRS, SSWPTags.Items.DEEPSLATE_STAIRS);
			this.copy(SSWPTags.Blocks.DEEPSLATE_WALLS, SSWPTags.Items.DEEPSLATE_WALLS);
			this.copy(SSWPTags.Blocks.DEEPSLATE_BRICKS, SSWPTags.Items.DEEPSLATE_BRICKS);
			this.copy(SSWPTags.Blocks.DEEPSLATE_BRICK_SLABS, SSWPTags.Items.DEEPSLATE_BRICK_SLABS);
			this.copy(SSWPTags.Blocks.DEEPSLATE_BRICK_STAIRS, SSWPTags.Items.DEEPSLATE_BRICK_STAIRS);
			this.copy(SSWPTags.Blocks.DEEPSLATE_BRICK_WALLS, SSWPTags.Items.DEEPSLATE_BRICK_WALLS);
			this.copy(SSWPTags.Blocks.DEEPSLATE_TILES, SSWPTags.Items.DEEPSLATE_TILES);
			this.copy(SSWPTags.Blocks.DEEPSLATE_TILE_SLABS, SSWPTags.Items.DEEPSLATE_TILE_SLABS);
			this.copy(SSWPTags.Blocks.DEEPSLATE_TILE_STAIRS, SSWPTags.Items.DEEPSLATE_TILE_STAIRS);
			this.copy(SSWPTags.Blocks.DEEPSLATE_TILE_WALLS, SSWPTags.Items.DEEPSLATE_TILE_WALLS);
			this.copy(SSWPTags.Blocks.TUFF, SSWPTags.Items.TUFF);
			this.copy(SSWPTags.Blocks.TUFF_SLABS, SSWPTags.Items.TUFF_SLABS);
			this.copy(SSWPTags.Blocks.TUFF_STAIRS, SSWPTags.Items.TUFF_STAIRS);
			this.copy(SSWPTags.Blocks.TUFF_WALLS, SSWPTags.Items.TUFF_WALLS);
			this.copy(SSWPTags.Blocks.TUFF_BRICKS, SSWPTags.Items.TUFF_BRICKS);
			this.copy(SSWPTags.Blocks.TUFF_BRICK_SLABS, SSWPTags.Items.TUFF_BRICK_SLABS);
			this.copy(SSWPTags.Blocks.TUFF_BRICK_STAIRS, SSWPTags.Items.TUFF_BRICK_STAIRS);
			this.copy(SSWPTags.Blocks.TUFF_BRICK_WALLS, SSWPTags.Items.TUFF_BRICK_WALLS);
			this.copy(SSWPTags.Blocks.SANDSTONE, SSWPTags.Items.SANDSTONE);
			this.copy(SSWPTags.Blocks.SANDSTONE_SLABS, SSWPTags.Items.SANDSTONE_SLABS);
			this.copy(SSWPTags.Blocks.SANDSTONE_STAIRS, SSWPTags.Items.SANDSTONE_STAIRS);
			this.copy(SSWPTags.Blocks.SANDSTONE_WALLS, SSWPTags.Items.SANDSTONE_WALLS);
			this.copy(SSWPTags.Blocks.BEIGE_SANDSTONE, SSWPTags.Items.BEIGE_SANDSTONE);
			this.copy(SSWPTags.Blocks.BEIGE_SANDSTONE_SLABS, SSWPTags.Items.BEIGE_SANDSTONE_SLABS);
			this.copy(SSWPTags.Blocks.BEIGE_SANDSTONE_STAIRS, SSWPTags.Items.BEIGE_SANDSTONE_STAIRS);
			this.copy(SSWPTags.Blocks.BEIGE_SANDSTONE_WALLS, SSWPTags.Items.BEIGE_SANDSTONE_WALLS);
			this.copy(SSWPTags.Blocks.RED_SANDSTONE, SSWPTags.Items.RED_SANDSTONE);
			this.copy(SSWPTags.Blocks.RED_SANDSTONE_SLABS, SSWPTags.Items.RED_SANDSTONE_SLABS);
			this.copy(SSWPTags.Blocks.RED_SANDSTONE_STAIRS, SSWPTags.Items.RED_SANDSTONE_STAIRS);
			this.copy(SSWPTags.Blocks.RED_SANDSTONE_WALLS, SSWPTags.Items.RED_SANDSTONE_WALLS);
			this.copy(SSWPTags.Blocks.PRISMARINE, SSWPTags.Items.PRISMARINE);
			this.copy(SSWPTags.Blocks.PRISMARINE_SLABS, SSWPTags.Items.PRISMARINE_SLABS);
			this.copy(SSWPTags.Blocks.PRISMARINE_STAIRS, SSWPTags.Items.PRISMARINE_STAIRS);
			this.copy(SSWPTags.Blocks.PRISMARINE_WALLS, SSWPTags.Items.PRISMARINE_WALLS);
			this.copy(SSWPTags.Blocks.NETHER_BRICK_BLOCKS, SSWPTags.Items.NETHER_BRICK_BLOCKS);
			this.copy(SSWPTags.Blocks.NETHER_BRICK_SLABS, SSWPTags.Items.NETHER_BRICK_SLABS);
			this.copy(SSWPTags.Blocks.NETHER_BRICK_STAIRS, SSWPTags.Items.NETHER_BRICK_STAIRS);
			this.copy(SSWPTags.Blocks.NETHER_BRICK_WALLS, SSWPTags.Items.NETHER_BRICK_WALLS);
			this.copy(SSWPTags.Blocks.NETHER_BRICK_FENCES, SSWPTags.Items.NETHER_BRICK_FENCES);
			this.copy(SSWPTags.Blocks.NETHER_BRICK_FENCE_GATES, SSWPTags.Items.NETHER_BRICK_FENCE_GATES);
			this.copy(SSWPTags.Blocks.BASALT, SSWPTags.Items.BASALT);
			this.copy(SSWPTags.Blocks.BASALT_SLABS, SSWPTags.Items.BASALT_SLABS);
			this.copy(SSWPTags.Blocks.BASALT_STAIRS, SSWPTags.Items.BASALT_STAIRS);
			this.copy(SSWPTags.Blocks.BASALT_WALLS, SSWPTags.Items.BASALT_WALLS);
			this.copy(SSWPTags.Blocks.BLACKSTONE, SSWPTags.Items.BLACKSTONE);
			this.copy(SSWPTags.Blocks.BLACKSTONE_SLABS, SSWPTags.Items.BLACKSTONE_SLABS);
			this.copy(SSWPTags.Blocks.BLACKSTONE_STAIRS, SSWPTags.Items.BLACKSTONE_STAIRS);
			this.copy(SSWPTags.Blocks.BLACKSTONE_WALLS, SSWPTags.Items.BLACKSTONE_WALLS);
			this.copy(SSWPTags.Blocks.BLACKSTONE_BRICKS, SSWPTags.Items.BLACKSTONE_BRICKS);
			this.copy(SSWPTags.Blocks.BLACKSTONE_BRICK_SLABS, SSWPTags.Items.BLACKSTONE_BRICK_SLABS);
			this.copy(SSWPTags.Blocks.BLACKSTONE_BRICK_STAIRS, SSWPTags.Items.BLACKSTONE_BRICK_STAIRS);
			this.copy(SSWPTags.Blocks.BLACKSTONE_BRICK_WALLS, SSWPTags.Items.BLACKSTONE_BRICK_WALLS);
			this.copy(SSWPTags.Blocks.PURPUR_BLOCKS, SSWPTags.Items.PURPUR_BLOCKS);
			this.copy(SSWPTags.Blocks.PURPUR_SLABS, SSWPTags.Items.PURPUR_SLABS);
			this.copy(SSWPTags.Blocks.PURPUR_STAIRS, SSWPTags.Items.PURPUR_STAIRS);
			this.copy(SSWPTags.Blocks.PURPUR_WALLS, SSWPTags.Items.PURPUR_WALLS);
			this.copy(SSWPTags.Blocks.QUARTZ_BLOCKS, SSWPTags.Items.QUARTZ_BLOCKS);
			this.copy(SSWPTags.Blocks.QUARTZ_SLABS, SSWPTags.Items.QUARTZ_SLABS);
			this.copy(SSWPTags.Blocks.QUARTZ_STAIRS, SSWPTags.Items.QUARTZ_STAIRS);
			this.copy(SSWPTags.Blocks.QUARTZ_WALLS, SSWPTags.Items.QUARTZ_WALLS);
			this.copy(SSWPTags.Blocks.COPPER_BLOCKS, SSWPTags.Items.COPPER_BLOCKS);
			this.copy(SSWPTags.Blocks.COPPER_SLABS, SSWPTags.Items.COPPER_SLABS);
			this.copy(SSWPTags.Blocks.COPPER_STAIRS, SSWPTags.Items.COPPER_STAIRS);
			this.copy(SSWPTags.Blocks.COPPER_WALLS, SSWPTags.Items.COPPER_WALLS);
			this.copy(SSWPTags.Blocks.COPPER_FENCES, SSWPTags.Items.COPPER_FENCES);
			this.copy(SSWPTags.Blocks.COPPER_FENCE_GATES, SSWPTags.Items.COPPER_FENCE_GATES);
			this.copy(SSWPTags.Blocks.COPPER_BARS, SSWPTags.Items.COPPER_BARS);
			this.copy(SSWPTags.Blocks.COPPER_DOORS, SSWPTags.Items.COPPER_DOORS);
			this.copy(SSWPTags.Blocks.COPPER_TRAPDOORS, SSWPTags.Items.COPPER_TRAPDOORS);
			this.copy(SSWPTags.Blocks.COPPER_PRESSURE_PLATES, SSWPTags.Items.COPPER_PRESSURE_PLATES);
			this.copy(SSWPTags.Blocks.COPPER_BUTTONS, SSWPTags.Items.COPPER_BUTTONS);
			this.copy(SSWPTags.Blocks.COPPER_CHAINS, SSWPTags.Items.COPPER_CHAINS);
			this.copy(SSWPTags.Blocks.COPPER_BULBS, SSWPTags.Items.COPPER_BULBS);
			this.copy(SSWPTags.Blocks.UNWAXED_COPPER_BLOCKS, SSWPTags.Items.UNWAXED_COPPER_BLOCKS);
			this.copy(SSWPTags.Blocks.UNWAXED_COPPER_SLABS, SSWPTags.Items.UNWAXED_COPPER_SLABS);
			this.copy(SSWPTags.Blocks.UNWAXED_COPPER_STAIRS, SSWPTags.Items.UNWAXED_COPPER_STAIRS);
			this.copy(SSWPTags.Blocks.UNWAXED_COPPER_WALLS, SSWPTags.Items.UNWAXED_COPPER_WALLS);
			this.copy(SSWPTags.Blocks.UNWAXED_COPPER_FENCES, SSWPTags.Items.UNWAXED_COPPER_FENCES);
			this.copy(SSWPTags.Blocks.UNWAXED_COPPER_FENCE_GATES, SSWPTags.Items.UNWAXED_COPPER_FENCE_GATES);
			this.copy(SSWPTags.Blocks.UNWAXED_COPPER_BARS, SSWPTags.Items.UNWAXED_COPPER_BARS);
			this.copy(SSWPTags.Blocks.UNWAXED_COPPER_DOORS, SSWPTags.Items.UNWAXED_COPPER_DOORS);
			this.copy(SSWPTags.Blocks.UNWAXED_COPPER_TRAPDOORS, SSWPTags.Items.UNWAXED_COPPER_TRAPDOORS);
			this.copy(SSWPTags.Blocks.UNWAXED_COPPER_PRESSURE_PLATES, SSWPTags.Items.UNWAXED_COPPER_PRESSURE_PLATES);
			this.copy(SSWPTags.Blocks.UNWAXED_COPPER_BUTTONS, SSWPTags.Items.UNWAXED_COPPER_BUTTONS);
			this.copy(SSWPTags.Blocks.UNWAXED_COPPER_CHAINS, SSWPTags.Items.UNWAXED_COPPER_CHAINS);
			this.copy(SSWPTags.Blocks.UNWAXED_COPPER_BULBS, SSWPTags.Items.UNWAXED_COPPER_BULBS);
			this.copy(SSWPTags.Blocks.WAXED_COPPER_BLOCKS, SSWPTags.Items.WAXED_COPPER_BLOCKS);
			this.copy(SSWPTags.Blocks.WAXED_COPPER_SLABS, SSWPTags.Items.WAXED_COPPER_SLABS);
			this.copy(SSWPTags.Blocks.WAXED_COPPER_STAIRS, SSWPTags.Items.WAXED_COPPER_STAIRS);
			this.copy(SSWPTags.Blocks.WAXED_COPPER_WALLS, SSWPTags.Items.WAXED_COPPER_WALLS);
			this.copy(SSWPTags.Blocks.WAXED_COPPER_FENCES, SSWPTags.Items.WAXED_COPPER_FENCES);
			this.copy(SSWPTags.Blocks.WAXED_COPPER_FENCE_GATES, SSWPTags.Items.WAXED_COPPER_FENCE_GATES);
			this.copy(SSWPTags.Blocks.WAXED_COPPER_BARS, SSWPTags.Items.WAXED_COPPER_BARS);
			this.copy(SSWPTags.Blocks.WAXED_COPPER_DOORS, SSWPTags.Items.WAXED_COPPER_DOORS);
			this.copy(SSWPTags.Blocks.WAXED_COPPER_TRAPDOORS, SSWPTags.Items.WAXED_COPPER_TRAPDOORS);
			this.copy(SSWPTags.Blocks.WAXED_COPPER_PRESSURE_PLATES, SSWPTags.Items.WAXED_COPPER_PRESSURE_PLATES);
			this.copy(SSWPTags.Blocks.WAXED_COPPER_BUTTONS, SSWPTags.Items.WAXED_COPPER_BUTTONS);
			this.copy(SSWPTags.Blocks.WAXED_COPPER_CHAINS, SSWPTags.Items.WAXED_COPPER_CHAINS);
			this.copy(SSWPTags.Blocks.WAXED_COPPER_BULBS, SSWPTags.Items.WAXED_COPPER_BULBS);
			this.copy(SSWPTags.Blocks.WOOL_SLABS, SSWPTags.Items.WOOL_SLABS);
			this.copy(SSWPTags.Blocks.WOOL_STAIRS, SSWPTags.Items.WOOL_STAIRS);
			this.copy(SSWPTags.Blocks.WOOL_WALLS, SSWPTags.Items.WOOL_WALLS);
			this.copy(SSWPTags.Blocks.TERRACOTTA_SLABS, SSWPTags.Items.TERRACOTTA_SLABS);
			this.copy(SSWPTags.Blocks.TERRACOTTA_STAIRS, SSWPTags.Items.TERRACOTTA_STAIRS);
			this.copy(SSWPTags.Blocks.TERRACOTTA_WALLS, SSWPTags.Items.TERRACOTTA_WALLS);
			this.copy(SSWPTags.Blocks.CONCRETE_SLABS, SSWPTags.Items.CONCRETE_SLABS);
			this.copy(SSWPTags.Blocks.CONCRETE_STAIRS, SSWPTags.Items.CONCRETE_STAIRS);
			this.copy(SSWPTags.Blocks.CONCRETE_WALLS, SSWPTags.Items.CONCRETE_WALLS);
			this.copy(SSWPTags.Blocks.GLASS_SLABS, SSWPTags.Items.GLASS_SLABS);
			this.copy(SSWPTags.Blocks.GLASS_STAIRS, SSWPTags.Items.GLASS_STAIRS);
			this.copy(SSWPTags.Blocks.GLASS_WALLS, SSWPTags.Items.GLASS_WALLS);
			this.copy(SSWPTags.Blocks.DIRT_SLABS, SSWPTags.Items.DIRT_SLABS);
			this.copy(SSWPTags.Blocks.DIRT_STAIRS, SSWPTags.Items.DIRT_STAIRS);
			this.copy(SSWPTags.Blocks.DIRT_WALLS, SSWPTags.Items.DIRT_WALLS);
			this.copy(SSWPTags.Blocks.ICE_SLABS, SSWPTags.Items.ICE_SLABS);
			this.copy(SSWPTags.Blocks.ICE_STAIRS, SSWPTags.Items.ICE_STAIRS);
			this.copy(SSWPTags.Blocks.ICE_WALLS, SSWPTags.Items.ICE_WALLS);
			this.copy(SSWPTags.Blocks.OBSIDIAN, SSWPTags.Items.OBSIDIAN);
			this.copy(SSWPTags.Blocks.OBSIDIAN_SLABS, SSWPTags.Items.OBSIDIAN_SLABS);
			this.copy(SSWPTags.Blocks.OBSIDIAN_STAIRS, SSWPTags.Items.OBSIDIAN_STAIRS);
			this.copy(SSWPTags.Blocks.OBSIDIAN_WALLS, SSWPTags.Items.OBSIDIAN_WALLS);
			this.copy(SSWPTags.Blocks.NYLIUM_SLABS, SSWPTags.Items.NYLIUM_SLABS);
			this.copy(SSWPTags.Blocks.NYLIUM_STAIRS, SSWPTags.Items.NYLIUM_STAIRS);
			this.copy(SSWPTags.Blocks.NYLIUM_WALLS, SSWPTags.Items.NYLIUM_WALLS);
			this.copy(SSWPTags.Blocks.COAL_ORE_SLABS, SSWPTags.Items.COAL_ORE_SLABS);
			this.copy(SSWPTags.Blocks.COAL_ORE_STAIRS, SSWPTags.Items.COAL_ORE_STAIRS);
			this.copy(SSWPTags.Blocks.COAL_ORE_WALLS, SSWPTags.Items.COAL_ORE_WALLS);
			this.copy(SSWPTags.Blocks.IRON_ORE_SLABS, SSWPTags.Items.IRON_ORE_SLABS);
			this.copy(SSWPTags.Blocks.IRON_ORE_STAIRS, SSWPTags.Items.IRON_ORE_STAIRS);
			this.copy(SSWPTags.Blocks.IRON_ORE_WALLS, SSWPTags.Items.IRON_ORE_WALLS);
			this.copy(SSWPTags.Blocks.COPPER_ORE_SLABS, SSWPTags.Items.COPPER_ORE_SLABS);
			this.copy(SSWPTags.Blocks.COPPER_ORE_STAIRS, SSWPTags.Items.COPPER_ORE_STAIRS);
			this.copy(SSWPTags.Blocks.COPPER_ORE_WALLS, SSWPTags.Items.COPPER_ORE_WALLS);
			this.copy(SSWPTags.Blocks.GOLD_ORE_SLABS, SSWPTags.Items.GOLD_ORE_SLABS);
			this.copy(SSWPTags.Blocks.GOLD_ORE_STAIRS, SSWPTags.Items.GOLD_ORE_STAIRS);
			this.copy(SSWPTags.Blocks.GOLD_ORE_WALLS, SSWPTags.Items.GOLD_ORE_WALLS);
			this.copy(SSWPTags.Blocks.REDSTONE_ORE_SLABS, SSWPTags.Items.REDSTONE_ORE_SLABS);
			this.copy(SSWPTags.Blocks.REDSTONE_ORE_STAIRS, SSWPTags.Items.REDSTONE_ORE_STAIRS);
			this.copy(SSWPTags.Blocks.REDSTONE_ORE_WALLS, SSWPTags.Items.REDSTONE_ORE_WALLS);
			this.copy(SSWPTags.Blocks.EMERALD_ORE_SLABS, SSWPTags.Items.EMERALD_ORE_SLABS);
			this.copy(SSWPTags.Blocks.EMERALD_ORE_STAIRS, SSWPTags.Items.EMERALD_ORE_STAIRS);
			this.copy(SSWPTags.Blocks.EMERALD_ORE_WALLS, SSWPTags.Items.EMERALD_ORE_WALLS);
			this.copy(SSWPTags.Blocks.LAPIS_ORE_SLABS, SSWPTags.Items.LAPIS_ORE_SLABS);
			this.copy(SSWPTags.Blocks.LAPIS_ORE_STAIRS, SSWPTags.Items.LAPIS_ORE_STAIRS);
			this.copy(SSWPTags.Blocks.LAPIS_ORE_WALLS, SSWPTags.Items.LAPIS_ORE_WALLS);
			this.copy(SSWPTags.Blocks.DIAMOND_ORE_SLABS, SSWPTags.Items.DIAMOND_ORE_SLABS);
			this.copy(SSWPTags.Blocks.DIAMOND_ORE_STAIRS, SSWPTags.Items.DIAMOND_ORE_STAIRS);
			this.copy(SSWPTags.Blocks.DIAMOND_ORE_WALLS, SSWPTags.Items.DIAMOND_ORE_WALLS);
			this.copy(SSWPTags.Blocks.QUARTZ_ORES, SSWPTags.Items.QUARTZ_ORES);
			this.copy(SSWPTags.Blocks.QUARTZ_ORE_SLABS, SSWPTags.Items.QUARTZ_ORE_SLABS);
			this.copy(SSWPTags.Blocks.QUARTZ_ORE_STAIRS, SSWPTags.Items.QUARTZ_ORE_STAIRS);
			this.copy(SSWPTags.Blocks.QUARTZ_ORE_WALLS, SSWPTags.Items.QUARTZ_ORE_WALLS);
			this.copy(SSWPTags.Blocks.MUSHROOM_BLOCKS, SSWPTags.Items.MUSHROOM_BLOCKS);
			this.copy(SSWPTags.Blocks.MUSHROOM_SLABS, SSWPTags.Items.MUSHROOM_SLABS);
			this.copy(SSWPTags.Blocks.MUSHROOM_STAIRS, SSWPTags.Items.MUSHROOM_STAIRS);
			this.copy(SSWPTags.Blocks.MUSHROOM_WALLS, SSWPTags.Items.MUSHROOM_WALLS);
			this.copy(SSWPTags.Blocks.WART_BLOCKS, SSWPTags.Items.WART_BLOCKS);
			this.copy(SSWPTags.Blocks.WART_SLABS, SSWPTags.Items.WART_SLABS);
			this.copy(SSWPTags.Blocks.WART_STAIRS, SSWPTags.Items.WART_STAIRS);
			this.copy(SSWPTags.Blocks.WART_WALLS, SSWPTags.Items.WART_WALLS);
			this.copy(SSWPTags.Blocks.CORAL_SLABS, SSWPTags.Items.CORAL_SLABS);
			this.copy(SSWPTags.Blocks.CORAL_STAIRS, SSWPTags.Items.CORAL_STAIRS);
			this.copy(SSWPTags.Blocks.CORAL_WALLS, SSWPTags.Items.CORAL_WALLS);
			this.copy(SSWPTags.Blocks.DEAD_CORAL_SLABS, SSWPTags.Items.DEAD_CORAL_SLABS);
			this.copy(SSWPTags.Blocks.DEAD_CORAL_STAIRS, SSWPTags.Items.DEAD_CORAL_STAIRS);
			this.copy(SSWPTags.Blocks.DEAD_CORAL_WALLS, SSWPTags.Items.DEAD_CORAL_WALLS);
			this.copy(SSWPTags.Blocks.FROGLIGHTS, SSWPTags.Items.FROGLIGHTS);
			this.copy(SSWPTags.Blocks.FROGLIGHT_SLABS, SSWPTags.Items.FROGLIGHT_SLABS);
			this.copy(SSWPTags.Blocks.FROGLIGHT_STAIRS, SSWPTags.Items.FROGLIGHT_STAIRS);
			this.copy(SSWPTags.Blocks.FROGLIGHT_WALLS, SSWPTags.Items.FROGLIGHT_WALLS);
			this.copy(SSWPTags.Blocks.COPPER_LADDERS, SSWPTags.Items.COPPER_LADDERS);
			this.copy(SSWPTags.Blocks.UNWAXED_COPPER_LADDERS, SSWPTags.Items.UNWAXED_COPPER_LADDERS);
			this.copy(SSWPTags.Blocks.WAXED_COPPER_LADDERS, SSWPTags.Items.WAXED_COPPER_LADDERS);
			this.copy(SSWPTags.Blocks.LANTERNS, SSWPTags.Items.LANTERNS);
			this.copy(SSWPTags.Blocks.NORMAL_LANTERNS, SSWPTags.Items.NORMAL_LANTERNS);
			this.copy(SSWPTags.Blocks.SOUL_LANTERNS, SSWPTags.Items.SOUL_LANTERNS);
			this.copy(SSWPTags.Blocks.COPPER_LANTERNS, SSWPTags.Items.COPPER_LANTERNS);
			this.copy(SSWPTags.Blocks.UNWAXED_COPPER_LANTERNS, SSWPTags.Items.UNWAXED_COPPER_LANTERNS);
			this.copy(SSWPTags.Blocks.WAXED_COPPER_LANTERNS, SSWPTags.Items.WAXED_COPPER_LANTERNS);
			this.copy(SSWPTags.Blocks.COPPER_NORMAL_LANTERNS, SSWPTags.Items.COPPER_NORMAL_LANTERNS);
			this.copy(SSWPTags.Blocks.UNWAXED_COPPER_NORMAL_LANTERNS, SSWPTags.Items.UNWAXED_COPPER_NORMAL_LANTERNS);
			this.copy(SSWPTags.Blocks.WAXED_COPPER_NORMAL_LANTERNS, SSWPTags.Items.WAXED_COPPER_NORMAL_LANTERNS);
			this.copy(SSWPTags.Blocks.COPPER_SOUL_LANTERNS, SSWPTags.Items.COPPER_SOUL_LANTERNS);
			this.copy(SSWPTags.Blocks.UNWAXED_COPPER_SOUL_LANTERNS, SSWPTags.Items.UNWAXED_COPPER_SOUL_LANTERNS);
			this.copy(SSWPTags.Blocks.WAXED_COPPER_SOUL_LANTERNS, SSWPTags.Items.WAXED_COPPER_SOUL_LANTERNS);
			
			this.copy(AquiferTags.Blocks.WOODEN_WALLS, AquiferTags.Items.WOODEN_WALLS);
			this.copy(AquiferTags.Blocks.WOODEN_LADDERS, AquiferTags.Items.WOODEN_LADDERS);
			this.copy(AquiferTags.Blocks.LADDERS, AquiferTags.Items.LADDERS);
			this.copy(AquiferTags.Blocks.LEAF_SLABS, AquiferTags.Items.LEAF_SLABS);
			this.copy(AquiferTags.Blocks.LEAF_STAIRS, AquiferTags.Items.LEAF_STAIRS);
			this.copy(AquiferTags.Blocks.LEAF_WALLS, AquiferTags.Items.LEAF_WALLS);
			this.copy(AquiferTags.Blocks.LEAF_CARPETS, AquiferTags.Items.LEAF_CARPETS);
			this.copy(AquiferTags.Blocks.BOOKSHELVES, AquiferTags.Items.BOOKSHELVES);
			this.copy(AquiferTags.Blocks.CRAFTING_TABLES, AquiferTags.Items.CRAFTING_TABLES);
			this.copy(AquiferTags.Blocks.LOOMS, AquiferTags.Items.LOOMS);
			this.copy(AquiferTags.Blocks.CARTOGRAPHY_TABLES, AquiferTags.Items.CARTOGRAPHY_TABLES);
			this.copy(AquiferTags.Blocks.FLETCHING_TABLES, AquiferTags.Items.FLETCHING_TABLES);
			this.copy(AquiferTags.Blocks.SMITHING_TABLES, AquiferTags.Items.SMITHING_TABLES);
			this.copy(AquiferTags.Blocks.COMPOSTERS, AquiferTags.Items.COMPOSTERS);
			this.copy(AquiferTags.Blocks.LECTERNS, AquiferTags.Items.LECTERNS);
			this.copy(AquiferTags.Blocks.WOODEN_BARRELS, AquiferTags.Items.WOODEN_BARRELS);
			this.copy(AquiferTags.Blocks.WOODEN_CHESTS, AquiferTags.Items.WOODEN_CHESTS);
			this.copy(AquiferTags.Blocks.TRIPWIRE_HOOKS, AquiferTags.Items.TRIPWIRE_HOOKS);;
			this.copy(AquiferTags.Blocks.CRAFTED_BEEHIVES, AquiferTags.Items.CRAFTED_BEEHIVES);
			
			this.copy(BlockTags.PLANKS, ItemTags.PLANKS);
			this.copy(BlockTags.WOODEN_SLABS, ItemTags.WOODEN_SLABS);
			this.copy(BlockTags.WOODEN_STAIRS, ItemTags.WOODEN_STAIRS);
			this.copy(BlockTags.SLABS, ItemTags.SLABS);
			this.copy(BlockTags.STAIRS, ItemTags.STAIRS);
			this.copy(BlockTags.WALLS, ItemTags.WALLS);
			this.copy(BlockTags.FENCES, ItemTags.FENCES);
			this.copy(BlockTags.FENCE_GATES, ItemTags.FENCE_GATES);
			this.copy(BlockTags.DOORS, ItemTags.DOORS);
			this.copy(BlockTags.TRAPDOORS, ItemTags.TRAPDOORS);
			this.copy(BlockTags.PRESSURE_PLATES, AquiferTags.Items.PRESSURE_PLATES);
			this.copy(BlockTags.BUTTONS, ItemTags.BUTTONS);
			this.copy(BlockTags.ANVIL, ItemTags.ANVIL);
			
			this.copy(ConventionalBlockTags.UNCOLORED_SANDSTONE_BLOCKS, ConventionalItemTags.UNCOLORED_SANDSTONE_BLOCKS);
			this.copy(ConventionalBlockTags.UNCOLORED_SANDSTONE_SLABS, ConventionalItemTags.UNCOLORED_SANDSTONE_SLABS);
			this.copy(ConventionalBlockTags.UNCOLORED_SANDSTONE_STAIRS, ConventionalItemTags.UNCOLORED_SANDSTONE_STAIRS);
			this.copy(ConventionalBlockTags.RED_SANDSTONE_BLOCKS, ConventionalItemTags.RED_SANDSTONE_BLOCKS);
			this.copy(ConventionalBlockTags.RED_SANDSTONE_SLABS, ConventionalItemTags.RED_SANDSTONE_SLABS);
			this.copy(ConventionalBlockTags.RED_SANDSTONE_STAIRS, ConventionalItemTags.RED_SANDSTONE_STAIRS);
			this.copy(ConventionalBlockTags.NETHER_BRICK_FENCES, ConventionalItemTags.NETHER_BRICK_FENCES);
			this.copy(ConventionalBlockTags.CHAINS, ConventionalItemTags.CHAINS);
			this.copy(ConventionalBlockTags.GLASS_PANES, ConventionalItemTags.GLASS_PANES);
			this.copy(ConventionalBlockTags.OBSIDIANS, ConventionalItemTags.OBSIDIANS);
			this.copy(ConventionalBlockTags.WHITE_DYED, ConventionalItemTags.WHITE_DYED);
			this.copy(ConventionalBlockTags.LIGHT_GRAY_DYED, ConventionalItemTags.LIGHT_GRAY_DYED);
			this.copy(ConventionalBlockTags.GRAY_DYED, ConventionalItemTags.GRAY_DYED);
			this.copy(ConventionalBlockTags.BLACK_DYED, ConventionalItemTags.BLACK_DYED);
			this.copy(ConventionalBlockTags.BROWN_DYED, ConventionalItemTags.BROWN_DYED);
			this.copy(ConventionalBlockTags.RED_DYED, ConventionalItemTags.RED_DYED);
			this.copy(ConventionalBlockTags.ORANGE_DYED, ConventionalItemTags.ORANGE_DYED);
			this.copy(ConventionalBlockTags.YELLOW_DYED, ConventionalItemTags.YELLOW_DYED);
			this.copy(ConventionalBlockTags.LIME_DYED, ConventionalItemTags.LIME_DYED);
			this.copy(ConventionalBlockTags.GREEN_DYED, ConventionalItemTags.GREEN_DYED);
			this.copy(ConventionalBlockTags.CYAN_DYED, ConventionalItemTags.CYAN_DYED);
			this.copy(ConventionalBlockTags.LIGHT_BLUE_DYED, ConventionalItemTags.LIGHT_BLUE_DYED);
			this.copy(ConventionalBlockTags.BLUE_DYED, ConventionalItemTags.BLUE_DYED);
			this.copy(ConventionalBlockTags.PURPLE_DYED, ConventionalItemTags.PURPLE_DYED);
			this.copy(ConventionalBlockTags.MAGENTA_DYED, ConventionalItemTags.MAGENTA_DYED);
			this.copy(ConventionalBlockTags.PINK_DYED, ConventionalItemTags.PINK_DYED);
			this.copy(AquiferTags.Blocks.CHESTS_WOODEN_NOT_TRAPPED, AquiferTags.Items.CHESTS_WOODEN_NOT_TRAPPED);
			this.copy(AquiferTags.Blocks.CHESTS_WOODEN_TRAPPED, AquiferTags.Items.CHESTS_WOODEN_TRAPPED);

			this.getOrCreateTagBuilder(SSWPTags.Items.UNWAXED_COPPER_SIGNS)
			.add(SSWPItems.COPPER_SIGN,
					SSWPItems.EXPOSED_COPPER_SIGN,
					SSWPItems.WEATHERED_COPPER_SIGN,
					SSWPItems.OXIDIZED_COPPER_SIGN);
			
			this.getOrCreateTagBuilder(SSWPTags.Items.WAXED_COPPER_SIGNS)
			.add(SSWPItems.WAXED_COPPER_SIGN,
					SSWPItems.WAXED_EXPOSED_COPPER_SIGN,
					SSWPItems.WAXED_WEATHERED_COPPER_SIGN,
					SSWPItems.WAXED_OXIDIZED_COPPER_SIGN);
			
			this.getOrCreateTagBuilder(SSWPTags.Items.COPPER_SIGNS)
			.addTag(SSWPTags.Items.UNWAXED_COPPER_SIGNS)
			.addTag(SSWPTags.Items.WAXED_COPPER_SIGNS);
			
			this.getOrCreateTagBuilder(SSWPTags.Items.UNWAXED_COPPER_HANGING_SIGNS)
			.add(SSWPItems.COPPER_HANGING_SIGN,
					SSWPItems.EXPOSED_COPPER_HANGING_SIGN,
					SSWPItems.WEATHERED_COPPER_HANGING_SIGN,
					SSWPItems.OXIDIZED_COPPER_HANGING_SIGN);
			
			this.getOrCreateTagBuilder(SSWPTags.Items.WAXED_COPPER_HANGING_SIGNS)
			.add(SSWPItems.WAXED_COPPER_HANGING_SIGN,
					SSWPItems.WAXED_EXPOSED_COPPER_HANGING_SIGN,
					SSWPItems.WAXED_WEATHERED_COPPER_HANGING_SIGN,
					SSWPItems.WAXED_OXIDIZED_COPPER_HANGING_SIGN);
			
			this.getOrCreateTagBuilder(SSWPTags.Items.COPPER_HANGING_SIGNS)
			.addTag(SSWPTags.Items.UNWAXED_COPPER_HANGING_SIGNS)
			.addTag(SSWPTags.Items.WAXED_COPPER_HANGING_SIGNS);
			
			this.getOrCreateTagBuilder(SSWPTags.Items.UNWAXED_COPPER_CAULDRONS)
			.add(SSWPItems.COPPER_CAULDRON,
					SSWPItems.EXPOSED_COPPER_CAULDRON,
					SSWPItems.WEATHERED_COPPER_CAULDRON,
					SSWPItems.OXIDIZED_COPPER_CAULDRON);
			
			this.getOrCreateTagBuilder(SSWPTags.Items.WAXED_COPPER_CAULDRONS)
			.add(SSWPItems.WAXED_COPPER_CAULDRON,
					SSWPItems.WAXED_EXPOSED_COPPER_CAULDRON,
					SSWPItems.WAXED_WEATHERED_COPPER_CAULDRON,
					SSWPItems.WAXED_OXIDIZED_COPPER_CAULDRON);
			
			this.getOrCreateTagBuilder(SSWPTags.Items.COPPER_CAULDRONS)
			.addTag(SSWPTags.Items.UNWAXED_COPPER_CAULDRONS)
			.addTag(SSWPTags.Items.WAXED_COPPER_CAULDRONS);
			
			this.getOrCreateTagBuilder(SSWPTags.Items.NETHER_BRICKS)
			.add(Items.NETHER_BRICK,
					SSWPItems.RED_NETHER_BRICK);
			
			this.getOrCreateTagBuilder(AquiferTags.Items.FIRE_PROOF)
			.add(SSWPItems.NETHERITE_SLAB,
					SSWPItems.NETHERITE_STAIRS,
					SSWPItems.NETHERITE_WALL,
					SSWPItems.NETHERITE_FENCE,
					SSWPItems.NETHERITE_FENCE_GATE,
					SSWPItems.NETHERITE_BARS,
					SSWPItems.NETHERITE_DOOR,
					SSWPItems.NETHERITE_TRAPDOOR,
					SSWPItems.NETHERITE_PRESSURE_PLATE,
					SSWPItems.NETHERITE_BUTTON,
					SSWPItems.NETHERITE_CHAIN,
					SSWPItems.NETHERITE_NUGGET,
					SSWPItems.ANCIENT_DEBRIS_SLAB,
					SSWPItems.ANCIENT_DEBRIS_STAIRS,
					SSWPItems.ANCIENT_DEBRIS_WALL,
					SSWPItems.NETHERITE_LADDER,
					SSWPItems.NETHERITE_SIGN,
					SSWPItems.NETHERITE_HANGING_SIGN,
					SSWPItems.NETHERITE_CAULDRON,
					SSWPItems.NETHERITE_LANTERN,
					SSWPItems.NETHERITE_SOUL_LANTERN,
					SSWPItems.NETHERITE_ANVIL);
			
			this.getOrCreateTagBuilder(AquiferTags.Items.CAULDRONS)
			.add(SSWPItems.GOLD_CAULDRON,
					SSWPItems.NETHERITE_CAULDRON)
			.addTag(SSWPTags.Items.COPPER_CAULDRONS);
			
			this.getOrCreateTagBuilder(AquiferTags.Items.STICKS)
			.add(SSWPItems.OAK_STICK,
					SSWPItems.SPRUCE_STICK,
					SSWPItems.BIRCH_STICK,
					SSWPItems.JUNGLE_STICK,
					SSWPItems.ACACIA_STICK,
					SSWPItems.DARK_OAK_STICK,
					SSWPItems.MANGROVE_STICK,
					SSWPItems.CHERRY_STICK,
					SSWPItems.BAMBOO_STICK,
					SSWPItems.CRIMSON_STICK,
					SSWPItems.WARPED_STICK);
			
			this.getOrCreateTagBuilder(ItemTags.SIGNS)
			.add(SSWPItems.IRON_SIGN,
					SSWPItems.GOLD_SIGN,
					SSWPItems.NETHERITE_SIGN)
			.addTag(SSWPTags.Items.COPPER_SIGNS);
			
			this.getOrCreateTagBuilder(ItemTags.HANGING_SIGNS)
			.add(SSWPItems.IRON_HANGING_SIGN,
					SSWPItems.GOLD_HANGING_SIGN,
					SSWPItems.NETHERITE_HANGING_SIGN)
			.addTag(SSWPTags.Items.COPPER_HANGING_SIGNS);
			
			this.getOrCreateTagBuilder(ItemTags.NON_FLAMMABLE_WOOD)
			.add(SSWPItems.CRIMSON_LADDER,
					SSWPItems.WARPED_LADDER,
					SSWPItems.CRIMSON_STICK,
					SSWPItems.WARPED_STICK,
					SSWPItems.CRIMSON_BOOKSHELF,
					SSWPItems.WARPED_BOOKSHELF,
					SSWPItems.CRIMSON_CRAFTING_TABLE,
					SSWPItems.WARPED_CRAFTING_TABLE,
					SSWPItems.CRIMSON_LOOM,
					SSWPItems.WARPED_LOOM,
					SSWPItems.CRIMSON_CARTOGRAPHY_TABLE,
					SSWPItems.WARPED_CARTOGRAPHY_TABLE,
					SSWPItems.CRIMSON_FLETCHING_TABLE,
					SSWPItems.WARPED_FLETCHING_TABLE,
					SSWPItems.CRIMSON_SMITHING_TABLE,
					SSWPItems.WARPED_SMITHING_TABLE,
					SSWPItems.CRIMSON_COMPOSTER,
					SSWPItems.WARPED_COMPOSTER,
					SSWPItems.CRIMSON_LECTERN,
					SSWPItems.WARPED_LECTERN,
					SSWPItems.CRIMSON_BARREL,
					SSWPItems.WARPED_BARREL,
					SSWPItems.CRIMSON_TRIPWIRE_HOOK,
					SSWPItems.WARPED_TRIPWIRE_HOOK,
					SSWPItems.CRIMSON_BEEHIVE,
					SSWPItems.WARPED_BEEHIVE,
					SSWPItems.CRIMSON_CHISELED_BOOKSHELF,
					SSWPItems.WARPED_CHISELED_BOOKSHELF,
					SSWPItems.CRIMSON_CHEST,
					SSWPItems.WARPED_CHEST,
					SSWPItems.CRIMSON_TRAPPED_CHEST,
					SSWPItems.WARPED_TRAPPED_CHEST)
			.addTag(SSWPTags.Items.CRIMSON_SLABS)
			.addTag(SSWPTags.Items.CRIMSON_STAIRS)
			.addTag(SSWPTags.Items.CRIMSON_WALLS)
			.addTag(SSWPTags.Items.WARPED_SLABS)
			.addTag(SSWPTags.Items.WARPED_STAIRS)
			.addTag(SSWPTags.Items.WARPED_WALLS);
			
			this.getOrCreateTagBuilder(ItemTags.PIGLIN_LOVED)
			.add(SSWPItems.GILDED_BLACKSTONE_SLAB,
					SSWPItems.GILDED_BLACKSTONE_STAIRS,
					SSWPItems.GILDED_BLACKSTONE_WALL,
					SSWPItems.GOLD_SLAB,
					SSWPItems.GOLD_STAIRS,
					SSWPItems.GOLD_WALL,
					SSWPItems.GOLD_FENCE,
					SSWPItems.GOLD_FENCE_GATE,
					SSWPItems.GOLD_BARS,
					SSWPItems.GOLD_DOOR,
					SSWPItems.GOLD_TRAPDOOR,
					SSWPItems.GOLD_BUTTON,
					SSWPItems.GOLD_CHAIN,
					SSWPItems.RAW_GOLD_SLAB,
					SSWPItems.RAW_GOLD_STAIRS,
					SSWPItems.RAW_GOLD_WALL,
					SSWPItems.GOLD_LADDER,
					SSWPItems.GOLD_SIGN,
					SSWPItems.GOLD_HANGING_SIGN,
					SSWPItems.GOLD_CAULDRON,
					SSWPItems.GOLD_LANTERN)
			.addTag(SSWPTags.Items.GOLD_ORE_SLABS)
			.addTag(SSWPTags.Items.GOLD_ORE_STAIRS)
			.addTag(SSWPTags.Items.GOLD_ORE_WALLS);
			
			this.getOrCreateTagBuilder(ItemTags.DAMPENS_VIBRATIONS)
			.addTag(SSWPTags.Items.WOOL_SLABS)
			.addTag(SSWPTags.Items.WOOL_STAIRS)
			.addTag(SSWPTags.Items.WOOL_WALLS);
			
			this.getOrCreateTagBuilder(ItemTags.PIGLIN_REPELLENTS)
			.addTag(SSWPTags.Items.SOUL_LANTERNS);
			
			this.getOrCreateTagBuilder(ConventionalItemTags.NETHER_BRICKS)
			.add(SSWPItems.RED_NETHER_BRICK);
			
			this.getOrCreateTagBuilder(SSWPTags.Items.COPPER_NUGGETS)
			.add(SSWPItems.COPPER_NUGGET);
			
			this.getOrCreateTagBuilder(SSWPTags.Items.NETHERITE_NUGGETS)
			.add(SSWPItems.NETHERITE_NUGGET);
			
			this.getOrCreateTagBuilder(ConventionalItemTags.NUGGETS)
			.addTag(SSWPTags.Items.COPPER_NUGGETS)
			.addTag(SSWPTags.Items.NETHERITE_NUGGETS);
		}
	}
}