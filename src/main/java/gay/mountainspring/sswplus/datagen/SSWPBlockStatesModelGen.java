package gay.mountainspring.sswplus.datagen;

import java.util.function.Consumer;

import gay.mountainspring.aquifer.datagen.AquiferBlockStates;
import gay.mountainspring.aquifer.datagen.AquiferModels;
import gay.mountainspring.sswplus.SSWPlus;
import gay.mountainspring.sswplus.block.RedstoneLampSlabBlock;
import gay.mountainspring.sswplus.block.RedstoneLampStairsBlock;
import gay.mountainspring.sswplus.block.RedstoneLampWallBlock;
import gay.mountainspring.sswplus.block.RedstoneOreSlabBlock;
import gay.mountainspring.sswplus.block.RedstoneOreStairsBlock;
import gay.mountainspring.sswplus.block.SSWPBlocks;
import gay.mountainspring.sswplus.item.SSWPItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.block.enums.StairShape;
import net.minecraft.block.enums.WallShape;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.BlockStateVariant;
import net.minecraft.data.client.BlockStateVariantMap;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.ModelIds;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.MultipartBlockStateSupplier;
import net.minecraft.data.client.TextureKey;
import net.minecraft.data.client.TextureMap;
import net.minecraft.data.client.VariantSettings;
import net.minecraft.data.client.VariantsBlockStateSupplier;
import net.minecraft.data.client.When;
import net.minecraft.item.Item;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;

public final class SSWPBlockStatesModelGen extends FabricModelProvider {
	protected SSWPBlockStatesModelGen(FabricDataOutput output) {
		super(output);
	}
	
	@Override
	public void generateBlockStateModels(BlockStateModelGenerator gen) {
		this.log(Blocks.OAK_LOG, SSWPBlocks.OAK_LOG_SLAB, SSWPBlocks.OAK_LOG_STAIRS, SSWPBlocks.OAK_LOG_WALL).accept(gen);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.OAK_WOOD_SLAB, TextureMap.all(Blocks.OAK_LOG), ModelIds.getBlockModelId(Blocks.OAK_WOOD));
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.OAK_WOOD_STAIRS, Blocks.OAK_LOG);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.OAK_WOOD_WALL, Blocks.OAK_LOG);
		this.log(Blocks.STRIPPED_OAK_LOG, SSWPBlocks.STRIPPED_OAK_LOG_SLAB, SSWPBlocks.STRIPPED_OAK_LOG_STAIRS, SSWPBlocks.STRIPPED_OAK_LOG_WALL).accept(gen);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.STRIPPED_OAK_WOOD_SLAB, TextureMap.all(Blocks.STRIPPED_OAK_LOG), ModelIds.getBlockModelId(Blocks.STRIPPED_OAK_WOOD));
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.STRIPPED_OAK_WOOD_STAIRS, Blocks.STRIPPED_OAK_LOG);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.STRIPPED_OAK_WOOD_WALL, Blocks.STRIPPED_OAK_LOG);
		
		this.log(Blocks.SPRUCE_LOG, SSWPBlocks.SPRUCE_LOG_SLAB, SSWPBlocks.SPRUCE_LOG_STAIRS, SSWPBlocks.SPRUCE_LOG_WALL).accept(gen);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.SPRUCE_WOOD_SLAB, TextureMap.all(Blocks.SPRUCE_LOG), ModelIds.getBlockModelId(Blocks.SPRUCE_WOOD));
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.SPRUCE_WOOD_STAIRS, Blocks.SPRUCE_LOG);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.SPRUCE_WOOD_WALL, Blocks.SPRUCE_LOG);
		this.log(Blocks.STRIPPED_SPRUCE_LOG, SSWPBlocks.STRIPPED_SPRUCE_LOG_SLAB, SSWPBlocks.STRIPPED_SPRUCE_LOG_STAIRS, SSWPBlocks.STRIPPED_SPRUCE_LOG_WALL).accept(gen);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.STRIPPED_SPRUCE_WOOD_SLAB, TextureMap.all(Blocks.STRIPPED_SPRUCE_LOG), ModelIds.getBlockModelId(Blocks.STRIPPED_SPRUCE_WOOD));
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.STRIPPED_SPRUCE_WOOD_STAIRS, Blocks.STRIPPED_SPRUCE_LOG);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.STRIPPED_SPRUCE_WOOD_WALL, Blocks.STRIPPED_SPRUCE_LOG);
		
		this.log(Blocks.BIRCH_LOG, SSWPBlocks.BIRCH_LOG_SLAB, SSWPBlocks.BIRCH_LOG_STAIRS, SSWPBlocks.BIRCH_LOG_WALL).accept(gen);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.BIRCH_WOOD_SLAB, TextureMap.all(Blocks.BIRCH_LOG), ModelIds.getBlockModelId(Blocks.BIRCH_WOOD));
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.BIRCH_WOOD_STAIRS, Blocks.BIRCH_LOG);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.BIRCH_WOOD_WALL, Blocks.BIRCH_LOG);
		this.log(Blocks.STRIPPED_BIRCH_LOG, SSWPBlocks.STRIPPED_BIRCH_LOG_SLAB, SSWPBlocks.STRIPPED_BIRCH_LOG_STAIRS, SSWPBlocks.STRIPPED_BIRCH_LOG_WALL).accept(gen);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.STRIPPED_BIRCH_WOOD_SLAB, TextureMap.all(Blocks.STRIPPED_BIRCH_LOG), ModelIds.getBlockModelId(Blocks.STRIPPED_BIRCH_WOOD));
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.STRIPPED_BIRCH_WOOD_STAIRS, Blocks.STRIPPED_BIRCH_LOG);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.STRIPPED_BIRCH_WOOD_WALL, Blocks.STRIPPED_BIRCH_LOG);
		
		this.log(Blocks.JUNGLE_LOG, SSWPBlocks.JUNGLE_LOG_SLAB, SSWPBlocks.JUNGLE_LOG_STAIRS, SSWPBlocks.JUNGLE_LOG_WALL).accept(gen);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.JUNGLE_WOOD_SLAB, TextureMap.all(Blocks.JUNGLE_LOG), ModelIds.getBlockModelId(Blocks.JUNGLE_WOOD));
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.JUNGLE_WOOD_STAIRS, Blocks.JUNGLE_LOG);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.JUNGLE_WOOD_WALL, Blocks.JUNGLE_LOG);
		this.log(Blocks.STRIPPED_JUNGLE_LOG, SSWPBlocks.STRIPPED_JUNGLE_LOG_SLAB, SSWPBlocks.STRIPPED_JUNGLE_LOG_STAIRS, SSWPBlocks.STRIPPED_JUNGLE_LOG_WALL).accept(gen);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.STRIPPED_JUNGLE_WOOD_SLAB, TextureMap.all(Blocks.STRIPPED_JUNGLE_LOG), ModelIds.getBlockModelId(Blocks.STRIPPED_JUNGLE_WOOD));
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.STRIPPED_JUNGLE_WOOD_STAIRS, Blocks.STRIPPED_JUNGLE_LOG);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.STRIPPED_JUNGLE_WOOD_WALL, Blocks.STRIPPED_JUNGLE_LOG);
		
		this.log(Blocks.ACACIA_LOG, SSWPBlocks.ACACIA_LOG_SLAB, SSWPBlocks.ACACIA_LOG_STAIRS, SSWPBlocks.ACACIA_LOG_WALL).accept(gen);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.ACACIA_WOOD_SLAB, TextureMap.all(Blocks.ACACIA_LOG), ModelIds.getBlockModelId(Blocks.ACACIA_WOOD));
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.ACACIA_WOOD_STAIRS, Blocks.ACACIA_LOG);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.ACACIA_WOOD_WALL, Blocks.ACACIA_LOG);
		this.log(Blocks.STRIPPED_ACACIA_LOG, SSWPBlocks.STRIPPED_ACACIA_LOG_SLAB, SSWPBlocks.STRIPPED_ACACIA_LOG_STAIRS, SSWPBlocks.STRIPPED_ACACIA_LOG_WALL).accept(gen);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.STRIPPED_ACACIA_WOOD_SLAB, TextureMap.all(Blocks.STRIPPED_ACACIA_LOG), ModelIds.getBlockModelId(Blocks.STRIPPED_ACACIA_WOOD));
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.STRIPPED_ACACIA_WOOD_STAIRS, Blocks.STRIPPED_ACACIA_LOG);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.STRIPPED_ACACIA_WOOD_WALL, Blocks.STRIPPED_ACACIA_LOG);
		
		this.log(Blocks.DARK_OAK_LOG, SSWPBlocks.DARK_OAK_LOG_SLAB, SSWPBlocks.DARK_OAK_LOG_STAIRS, SSWPBlocks.DARK_OAK_LOG_WALL).accept(gen);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.DARK_OAK_WOOD_SLAB, TextureMap.all(Blocks.DARK_OAK_LOG), ModelIds.getBlockModelId(Blocks.DARK_OAK_WOOD));
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.DARK_OAK_WOOD_STAIRS, Blocks.DARK_OAK_LOG);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.DARK_OAK_WOOD_WALL, Blocks.DARK_OAK_LOG);
		this.log(Blocks.STRIPPED_DARK_OAK_LOG, SSWPBlocks.STRIPPED_DARK_OAK_LOG_SLAB, SSWPBlocks.STRIPPED_DARK_OAK_LOG_STAIRS, SSWPBlocks.STRIPPED_DARK_OAK_LOG_WALL).accept(gen);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.STRIPPED_DARK_OAK_WOOD_SLAB, TextureMap.all(Blocks.STRIPPED_DARK_OAK_LOG), ModelIds.getBlockModelId(Blocks.STRIPPED_DARK_OAK_WOOD));
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS, Blocks.STRIPPED_DARK_OAK_LOG);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.STRIPPED_DARK_OAK_WOOD_WALL, Blocks.STRIPPED_DARK_OAK_LOG);
		
		this.log(Blocks.MANGROVE_LOG, SSWPBlocks.MANGROVE_LOG_SLAB, SSWPBlocks.MANGROVE_LOG_STAIRS, SSWPBlocks.MANGROVE_LOG_WALL).accept(gen);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.MANGROVE_WOOD_SLAB, TextureMap.all(Blocks.MANGROVE_LOG), ModelIds.getBlockModelId(Blocks.MANGROVE_WOOD));
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.MANGROVE_WOOD_STAIRS, Blocks.MANGROVE_LOG);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.MANGROVE_WOOD_WALL, Blocks.MANGROVE_LOG);
		this.log(Blocks.STRIPPED_MANGROVE_LOG, SSWPBlocks.STRIPPED_MANGROVE_LOG_SLAB, SSWPBlocks.STRIPPED_MANGROVE_LOG_STAIRS, SSWPBlocks.STRIPPED_MANGROVE_LOG_WALL).accept(gen);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.STRIPPED_MANGROVE_WOOD_SLAB, TextureMap.all(Blocks.STRIPPED_MANGROVE_LOG), ModelIds.getBlockModelId(Blocks.STRIPPED_MANGROVE_WOOD));
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.STRIPPED_MANGROVE_WOOD_STAIRS, Blocks.STRIPPED_MANGROVE_LOG);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.STRIPPED_MANGROVE_WOOD_WALL, Blocks.STRIPPED_MANGROVE_LOG);
		
		this.xyzLog(Blocks.CHERRY_LOG, SSWPBlocks.CHERRY_LOG_SLAB, SSWPBlocks.CHERRY_LOG_STAIRS, SSWPBlocks.CHERRY_LOG_WALL).accept(gen);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.CHERRY_WOOD_SLAB, TextureMap.all(Blocks.CHERRY_LOG), ModelIds.getBlockModelId(Blocks.CHERRY_WOOD));
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.CHERRY_WOOD_STAIRS, Blocks.CHERRY_LOG);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.CHERRY_WOOD_WALL, Blocks.CHERRY_LOG);
		this.xyzLog(Blocks.STRIPPED_CHERRY_LOG, SSWPBlocks.STRIPPED_CHERRY_LOG_SLAB, SSWPBlocks.STRIPPED_CHERRY_LOG_STAIRS, SSWPBlocks.STRIPPED_CHERRY_LOG_WALL).accept(gen);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.STRIPPED_CHERRY_WOOD_SLAB, TextureMap.all(Blocks.STRIPPED_CHERRY_LOG), ModelIds.getBlockModelId(Blocks.STRIPPED_CHERRY_WOOD));
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.STRIPPED_CHERRY_WOOD_STAIRS, Blocks.STRIPPED_CHERRY_LOG);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.STRIPPED_CHERRY_WOOD_WALL, Blocks.STRIPPED_CHERRY_LOG);
		
		this.bamboo(Blocks.BAMBOO_BLOCK, SSWPBlocks.BAMBOO_BLOCK_SLAB, SSWPBlocks.BAMBOO_BLOCK_STAIRS, SSWPBlocks.BAMBOO_BLOCK_WALL).accept(gen);
		this.bamboo(Blocks.STRIPPED_BAMBOO_BLOCK, SSWPBlocks.STRIPPED_BAMBOO_BLOCK_SLAB, SSWPBlocks.STRIPPED_BAMBOO_BLOCK_STAIRS, SSWPBlocks.STRIPPED_BAMBOO_BLOCK_WALL).accept(gen);
		
		this.netherLog(Blocks.CRIMSON_STEM, SSWPBlocks.CRIMSON_STEM_SLAB, SSWPBlocks.CRIMSON_STEM_STAIRS, SSWPBlocks.CRIMSON_STEM_WALL).accept(gen);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.CRIMSON_HYPHAE_SLAB, TextureMap.all(Blocks.CRIMSON_STEM), ModelIds.getBlockModelId(Blocks.CRIMSON_HYPHAE));
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.CRIMSON_HYPHAE_STAIRS, Blocks.CRIMSON_STEM);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.CRIMSON_HYPHAE_WALL, Blocks.CRIMSON_STEM);
		this.netherLog(Blocks.STRIPPED_CRIMSON_STEM, SSWPBlocks.STRIPPED_CRIMSON_STEM_SLAB, SSWPBlocks.STRIPPED_CRIMSON_STEM_STAIRS, SSWPBlocks.STRIPPED_CRIMSON_STEM_WALL).accept(gen);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB, TextureMap.all(Blocks.STRIPPED_CRIMSON_STEM), ModelIds.getBlockModelId(Blocks.STRIPPED_CRIMSON_HYPHAE));
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS, Blocks.STRIPPED_CRIMSON_STEM);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.STRIPPED_CRIMSON_HYPHAE_WALL, Blocks.STRIPPED_CRIMSON_STEM);
		
		this.netherLog(Blocks.WARPED_STEM, SSWPBlocks.WARPED_STEM_SLAB, SSWPBlocks.WARPED_STEM_STAIRS, SSWPBlocks.WARPED_STEM_WALL).accept(gen);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.WARPED_HYPHAE_SLAB, TextureMap.all(Blocks.WARPED_STEM), ModelIds.getBlockModelId(Blocks.WARPED_HYPHAE));
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.WARPED_HYPHAE_STAIRS, Blocks.WARPED_STEM);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.WARPED_HYPHAE_WALL, Blocks.WARPED_STEM);
		this.netherLog(Blocks.STRIPPED_WARPED_STEM, SSWPBlocks.STRIPPED_WARPED_STEM_SLAB, SSWPBlocks.STRIPPED_WARPED_STEM_STAIRS, SSWPBlocks.STRIPPED_WARPED_STEM_WALL).accept(gen);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.STRIPPED_WARPED_HYPHAE_SLAB, TextureMap.all(Blocks.STRIPPED_WARPED_STEM), ModelIds.getBlockModelId(Blocks.STRIPPED_WARPED_HYPHAE));
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.STRIPPED_WARPED_HYPHAE_STAIRS, Blocks.STRIPPED_WARPED_STEM);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.STRIPPED_WARPED_HYPHAE_WALL, Blocks.STRIPPED_WARPED_STEM);
		
		AquiferBlockStates.registerWall(gen, SSWPBlocks.STONE_WALL, Blocks.STONE);
		
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.SMOOTH_STONE_STAIRS, Blocks.SMOOTH_STONE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.SMOOTH_STONE_WALL, Blocks.SMOOTH_STONE);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.CRACKED_STONE_BRICK_SLAB, Blocks.CRACKED_STONE_BRICKS);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.CRACKED_STONE_BRICK_STAIRS, Blocks.CRACKED_STONE_BRICKS);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.CRACKED_STONE_BRICK_WALL, Blocks.CRACKED_STONE_BRICKS);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.CHISELED_STONE_BRICK_SLAB, Blocks.CHISELED_STONE_BRICKS);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.CHISELED_STONE_BRICK_STAIRS, Blocks.CHISELED_STONE_BRICKS);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.CHISELED_STONE_BRICK_WALL, Blocks.CHISELED_STONE_BRICKS);
		
		AquiferBlockStates.registerWall(gen, SSWPBlocks.POLISHED_GRANITE_WALL, Blocks.POLISHED_GRANITE);
		
		AquiferBlockStates.registerWall(gen, SSWPBlocks.POLISHED_DIORITE_WALL, Blocks.POLISHED_DIORITE);
		
		AquiferBlockStates.registerWall(gen, SSWPBlocks.POLISHED_ANDESITE_WALL, Blocks.POLISHED_ANDESITE);
		
		AquiferBlockStates.registerOrientableSlab(gen, SSWPBlocks.DEEPSLATE_SLAB, Blocks.DEEPSLATE);
		AquiferBlockStates.registerOrientableStairs(gen, SSWPBlocks.DEEPSLATE_STAIRS, Blocks.DEEPSLATE);
		AquiferBlockStates.registerWallColumn(gen, SSWPBlocks.DEEPSLATE_WALL, TextureMap.sideAndEndForTop(Blocks.DEEPSLATE));
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.CHISELED_DEEPSLATE_SLAB, Blocks.CHISELED_DEEPSLATE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.CHISELED_DEEPSLATE_STAIRS, Blocks.CHISELED_DEEPSLATE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.CHISELED_DEEPSLATE_WALL, Blocks.CHISELED_DEEPSLATE);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.CRACKED_DEEPSLATE_BRICK_SLAB, Blocks.CRACKED_DEEPSLATE_BRICKS);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS, Blocks.CRACKED_DEEPSLATE_BRICKS);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.CRACKED_DEEPSLATE_BRICK_WALL, Blocks.CRACKED_DEEPSLATE_BRICKS);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.CRACKED_DEEPSLATE_TILE_SLAB, Blocks.CRACKED_DEEPSLATE_TILES);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.CRACKED_DEEPSLATE_TILE_STAIRS, Blocks.CRACKED_DEEPSLATE_TILES);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.CRACKED_DEEPSLATE_TILE_WALL, Blocks.CRACKED_DEEPSLATE_TILES);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.CHISELED_TUFF_SLAB, TextureMap.sideAndEndForTop(Blocks.CHISELED_TUFF), ModelIds.getBlockModelId(Blocks.CHISELED_TUFF));
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.CHISELED_TUFF_STAIRS, TextureMap.sideAndEndForTop(Blocks.CHISELED_TUFF));
		AquiferBlockStates.registerWallColumn(gen, SSWPBlocks.CHISELED_TUFF_WALL, TextureMap.sideAndEndForTop(Blocks.CHISELED_TUFF));
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.CHISELED_TUFF_BRICK_SLAB, TextureMap.sideAndEndForTop(Blocks.CHISELED_TUFF_BRICKS), ModelIds.getBlockModelId(Blocks.CHISELED_TUFF_BRICKS));
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.CHISELED_TUFF_BRICK_STAIRS, TextureMap.sideAndEndForTop(Blocks.CHISELED_TUFF_BRICKS));
		AquiferBlockStates.registerWallColumn(gen, SSWPBlocks.CHISELED_TUFF_BRICK_WALL, TextureMap.sideAndEndForTop(Blocks.CHISELED_TUFF_BRICKS));
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.PACKED_MUD_SLAB, Blocks.PACKED_MUD);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.PACKED_MUD_STAIRS, Blocks.PACKED_MUD);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.PACKED_MUD_WALL, Blocks.PACKED_MUD);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.CHISELED_SANDSTONE_SLAB, this.sandstoneVariantTextures(Blocks.CHISELED_SANDSTONE, Blocks.SANDSTONE), ModelIds.getBlockModelId(Blocks.CHISELED_SANDSTONE));
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.CHISELED_SANDSTONE_STAIRS, this.sandstoneVariantTextures(Blocks.CHISELED_SANDSTONE, Blocks.SANDSTONE));
		AquiferBlockStates.registerWallColumn(gen, SSWPBlocks.CHISELED_SANDSTONE_WALL, this.sandstoneVariantTextures(Blocks.CHISELED_SANDSTONE, Blocks.SANDSTONE));
		AquiferBlockStates.registerWall(gen, SSWPBlocks.SMOOTH_SANDSTONE_WALL, TextureMap.all(TextureMap.getSubId(Blocks.SANDSTONE, "_top")));
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.CUT_SANDSTONE_STAIRS, this.sandstoneVariantTextures(Blocks.CUT_SANDSTONE, Blocks.SANDSTONE));
		AquiferBlockStates.registerWallColumn(gen, SSWPBlocks.CUT_SANDSTONE_WALL, this.sandstoneVariantTextures(Blocks.CUT_SANDSTONE, Blocks.SANDSTONE));
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.CHISELED_RED_SANDSTONE_SLAB, this.sandstoneVariantTextures(Blocks.CHISELED_RED_SANDSTONE, Blocks.RED_SANDSTONE), ModelIds.getBlockModelId(Blocks.CHISELED_RED_SANDSTONE));
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.CHISELED_RED_SANDSTONE_STAIRS, this.sandstoneVariantTextures(Blocks.CHISELED_RED_SANDSTONE, Blocks.RED_SANDSTONE));
		AquiferBlockStates.registerWallColumn(gen, SSWPBlocks.CHISELED_RED_SANDSTONE_WALL, this.sandstoneVariantTextures(Blocks.CHISELED_RED_SANDSTONE, Blocks.RED_SANDSTONE));
		AquiferBlockStates.registerWall(gen, SSWPBlocks.SMOOTH_RED_SANDSTONE_WALL, TextureMap.all(TextureMap.getSubId(Blocks.RED_SANDSTONE, "_top")));
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.CUT_RED_SANDSTONE_STAIRS, this.sandstoneVariantTextures(Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE));
		AquiferBlockStates.registerWallColumn(gen, SSWPBlocks.CUT_RED_SANDSTONE_WALL, this.sandstoneVariantTextures(Blocks.CUT_RED_SANDSTONE, Blocks.RED_SANDSTONE));
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.SEA_LANTERN_SLAB, Blocks.SEA_LANTERN);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.SEA_LANTERN_STAIRS, Blocks.SEA_LANTERN);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.SEA_LANTERN_WALL, Blocks.SEA_LANTERN);
		
		AquiferBlockStates.registerWall(gen, SSWPBlocks.PRISMARINE_BRICK_WALL, Blocks.PRISMARINE_BRICKS);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.DARK_PRISMARINE_WALL, Blocks.DARK_PRISMARINE);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.NETHERRACK_SLAB, Blocks.NETHERRACK);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.NETHERRACK_STAIRS, Blocks.NETHERRACK);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.NETHERRACK_WALL, Blocks.NETHERRACK);
		
		AquiferBlockStates.registerFenceGate(gen, SSWPBlocks.NETHER_BRICK_FENCE_GATE, Blocks.NETHER_BRICKS);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.CRACKED_NETHER_BRICK_SLAB, Blocks.CRACKED_NETHER_BRICKS);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.CRACKED_NETHER_BRICK_STAIRS, Blocks.CRACKED_NETHER_BRICKS);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.CRACKED_NETHER_BRICK_WALL, Blocks.CRACKED_NETHER_BRICKS);
		AquiferBlockStates.registerFence(gen, SSWPBlocks.CRACKED_NETHER_BRICK_FENCE, Blocks.CRACKED_NETHER_BRICKS);
		AquiferBlockStates.registerFenceGate(gen, SSWPBlocks.CRACKED_NETHER_BRICK_FENCE_GATE, Blocks.CRACKED_NETHER_BRICKS);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.CHISELED_NETHER_BRICK_SLAB, Blocks.CHISELED_NETHER_BRICKS);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.CHISELED_NETHER_BRICK_STAIRS, Blocks.CHISELED_NETHER_BRICKS);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.CHISELED_NETHER_BRICK_WALL, Blocks.CHISELED_NETHER_BRICKS);
		AquiferBlockStates.registerFence(gen, SSWPBlocks.RED_NETHER_BRICK_FENCE, Blocks.RED_NETHER_BRICKS);
		AquiferBlockStates.registerFenceGate(gen, SSWPBlocks.RED_NETHER_BRICK_FENCE_GATE, Blocks.RED_NETHER_BRICKS);
		
		AquiferBlockStates.registerOrientableSlab(gen, SSWPBlocks.BASALT_SLAB, Blocks.BASALT, TextureMap::sideEnd);
		AquiferBlockStates.registerOrientableStairs(gen, SSWPBlocks.BASALT_STAIRS, Blocks.BASALT, TextureMap::sideEnd);
		AquiferBlockStates.registerWallBottomTop(gen, SSWPBlocks.BASALT_WALL, TextureMap.sideEnd(Blocks.BASALT));
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.SMOOTH_BASALT_SLAB, Blocks.SMOOTH_BASALT);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.SMOOTH_BASALT_STAIRS, Blocks.SMOOTH_BASALT);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.SMOOTH_BASALT_WALL, Blocks.SMOOTH_BASALT);
		AquiferBlockStates.registerOrientableSlab(gen, SSWPBlocks.POLISHED_BASALT_SLAB, Blocks.POLISHED_BASALT, TextureMap::sideEnd);
		AquiferBlockStates.registerOrientableStairs(gen, SSWPBlocks.POLISHED_BASALT_STAIRS, Blocks.POLISHED_BASALT, TextureMap::sideEnd);
		AquiferBlockStates.registerWallBottomTop(gen, SSWPBlocks.POLISHED_BASALT_WALL, TextureMap.sideEnd(Blocks.POLISHED_BASALT));
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.GILDED_BLACKSTONE_SLAB, Blocks.GILDED_BLACKSTONE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.GILDED_BLACKSTONE_STAIRS, Blocks.GILDED_BLACKSTONE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.GILDED_BLACKSTONE_WALL, Blocks.GILDED_BLACKSTONE);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.CHISELED_POLISHED_BLACKSTONE_SLAB, Blocks.CHISELED_POLISHED_BLACKSTONE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.CHISELED_POLISHED_BLACKSTONE_STAIRS, Blocks.CHISELED_POLISHED_BLACKSTONE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.CHISELED_POLISHED_BLACKSTONE_WALL, Blocks.CHISELED_POLISHED_BLACKSTONE);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.END_STONE_SLAB, Blocks.END_STONE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.END_STONE_STAIRS, Blocks.END_STONE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.END_STONE_WALL, Blocks.END_STONE);
		
		AquiferBlockStates.registerWall(gen, SSWPBlocks.PURPUR_WALL, Blocks.PURPUR_BLOCK);
		AquiferBlockStates.registerOrientableSlab(gen, SSWPBlocks.PURPUR_PILLAR_SLAB, Blocks.PURPUR_PILLAR);
		AquiferBlockStates.registerOrientableStairs(gen, SSWPBlocks.PURPUR_PILLAR_STAIRS, Blocks.PURPUR_PILLAR);
		AquiferBlockStates.registerWallColumn(gen, SSWPBlocks.PURPUR_PILLAR_WALL, TextureMap.sideAndEndForTop(Blocks.PURPUR_PILLAR));
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.COAL_SLAB, Blocks.COAL_BLOCK);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.COAL_STAIRS, Blocks.COAL_BLOCK);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.COAL_WALL, Blocks.COAL_BLOCK);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.IRON_SLAB, Blocks.IRON_BLOCK);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.IRON_STAIRS, Blocks.IRON_BLOCK);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.IRON_WALL, Blocks.IRON_BLOCK);
		AquiferBlockStates.registerFence(gen, SSWPBlocks.IRON_FENCE, Blocks.IRON_BLOCK);
		AquiferBlockStates.registerFenceGate(gen, SSWPBlocks.IRON_FENCE_GATE, Blocks.IRON_BLOCK);
		AquiferBlockStates.registerButton(gen, SSWPBlocks.IRON_BUTTON, Blocks.IRON_BLOCK);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.GOLD_SLAB, Blocks.GOLD_BLOCK);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.GOLD_STAIRS, Blocks.GOLD_BLOCK);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.GOLD_WALL, Blocks.GOLD_BLOCK);
		AquiferBlockStates.registerFence(gen, SSWPBlocks.GOLD_FENCE, Blocks.GOLD_BLOCK);
		AquiferBlockStates.registerFenceGate(gen, SSWPBlocks.GOLD_FENCE_GATE, Blocks.GOLD_BLOCK);
		AquiferBlockStates.registerBars(gen, SSWPBlocks.GOLD_BARS);
		gen.registerDoor(SSWPBlocks.GOLD_DOOR);
		gen.registerTrapdoor(SSWPBlocks.GOLD_TRAPDOOR);
		AquiferBlockStates.registerButton(gen, SSWPBlocks.GOLD_BUTTON, Blocks.GOLD_BLOCK);
		gen.blockStateCollector.accept(BlockStateModelGenerator.createAxisRotatedBlockState(SSWPBlocks.GOLD_CHAIN, AquiferModels.TEMPLATE_CHAIN.upload(SSWPBlocks.GOLD_CHAIN, TextureMap.all(SSWPBlocks.GOLD_CHAIN), gen.modelCollector)));
		gen.registerItemModel(SSWPBlocks.GOLD_CHAIN.asItem());
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.REDSTONE_SLAB, Blocks.REDSTONE_BLOCK);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.REDSTONE_STAIRS, Blocks.REDSTONE_BLOCK);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.REDSTONE_WALL, Blocks.REDSTONE_BLOCK);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.EMERALD_SLAB, Blocks.EMERALD_BLOCK);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.EMERALD_STAIRS, Blocks.EMERALD_BLOCK);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.EMERALD_WALL, Blocks.EMERALD_BLOCK);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.LAPIS_SLAB, Blocks.LAPIS_BLOCK);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.LAPIS_STAIRS, Blocks.LAPIS_BLOCK);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.LAPIS_WALL, Blocks.LAPIS_BLOCK);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.DIAMOND_SLAB, Blocks.DIAMOND_BLOCK);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.DIAMOND_STAIRS, Blocks.DIAMOND_BLOCK);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.DIAMOND_WALL, Blocks.DIAMOND_BLOCK);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.NETHERITE_SLAB, Blocks.NETHERITE_BLOCK);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.NETHERITE_STAIRS, Blocks.NETHERITE_BLOCK);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.NETHERITE_WALL, Blocks.NETHERITE_BLOCK);
		AquiferBlockStates.registerFence(gen, SSWPBlocks.NETHERITE_FENCE, Blocks.NETHERITE_BLOCK);
		AquiferBlockStates.registerFenceGate(gen, SSWPBlocks.NETHERITE_FENCE_GATE, Blocks.NETHERITE_BLOCK);
		AquiferBlockStates.registerBars(gen, SSWPBlocks.NETHERITE_BARS);
		gen.registerDoor(SSWPBlocks.NETHERITE_DOOR);
		gen.registerTrapdoor(SSWPBlocks.NETHERITE_TRAPDOOR);
		AquiferBlockStates.registerPressurePlate(gen, SSWPBlocks.NETHERITE_PRESSURE_PLATE, Blocks.NETHERITE_BLOCK);
		AquiferBlockStates.registerButton(gen, SSWPBlocks.NETHERITE_BUTTON, Blocks.NETHERITE_BLOCK);
		gen.blockStateCollector.accept(BlockStateModelGenerator.createAxisRotatedBlockState(SSWPBlocks.NETHERITE_CHAIN, AquiferModels.TEMPLATE_CHAIN.upload(SSWPBlocks.NETHERITE_CHAIN, TextureMap.all(SSWPBlocks.NETHERITE_CHAIN), gen.modelCollector)));
		gen.registerItemModel(SSWPBlocks.NETHERITE_CHAIN.asItem());
		
		AquiferBlockStates.registerWallColumn(gen, SSWPBlocks.QUARTZ_WALL, TextureMap.sideEnd(Blocks.QUARTZ_BLOCK));
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.CHISELED_QUARTZ_SLAB, TextureMap.sideAndEndForTop(Blocks.CHISELED_QUARTZ_BLOCK), ModelIds.getBlockModelId(Blocks.CHISELED_QUARTZ_BLOCK));
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.CHISELED_QUARTZ_STAIRS, TextureMap.sideAndEndForTop(Blocks.CHISELED_QUARTZ_BLOCK));
		AquiferBlockStates.registerWallColumn(gen, SSWPBlocks.CHISELED_QUARTZ_WALL, TextureMap.sideAndEndForTop(Blocks.CHISELED_QUARTZ_BLOCK));
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.QUARTZ_BRICK_SLAB, Blocks.QUARTZ_BRICKS);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.QUARTZ_BRICK_STAIRS, Blocks.QUARTZ_BRICKS);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.QUARTZ_BRICK_WALL, Blocks.QUARTZ_BRICKS);
		AquiferBlockStates.registerOrientableSlab(gen, SSWPBlocks.QUARTZ_PILLAR_SLAB, Blocks.QUARTZ_PILLAR);
		AquiferBlockStates.registerOrientableStairs(gen, SSWPBlocks.QUARTZ_PILLAR_STAIRS, Blocks.QUARTZ_PILLAR);
		AquiferBlockStates.registerWallColumn(gen, SSWPBlocks.QUARTZ_PILLAR_WALL, TextureMap.sideAndEndForTop(Blocks.QUARTZ_PILLAR));
		AquiferBlockStates.registerWall(gen, SSWPBlocks.SMOOTH_QUARTZ_WALL, TextureMap.all(TextureMap.getSubId(Blocks.QUARTZ_BLOCK, "_bottom")));
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.AMETHYST_SLAB, Blocks.AMETHYST_BLOCK);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.AMETHYST_STAIRS, Blocks.AMETHYST_BLOCK);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.AMETHYST_WALL, Blocks.AMETHYST_BLOCK);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.COPPER_SLAB, Blocks.COPPER_BLOCK);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.COPPER_STAIRS, Blocks.COPPER_BLOCK);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.COPPER_WALL, Blocks.COPPER_BLOCK);
		AquiferBlockStates.registerFence(gen, SSWPBlocks.COPPER_FENCE, Blocks.COPPER_BLOCK);
		AquiferBlockStates.registerFenceGate(gen, SSWPBlocks.COPPER_FENCE_GATE, Blocks.COPPER_BLOCK);
		AquiferBlockStates.registerBars(gen, SSWPBlocks.COPPER_BARS);
		AquiferBlockStates.registerPressurePlate(gen, SSWPBlocks.COPPER_PRESSURE_PLATE, Blocks.COPPER_BLOCK);
		AquiferBlockStates.registerButton(gen, SSWPBlocks.COPPER_BUTTON, Blocks.COPPER_BLOCK);
		gen.blockStateCollector.accept(BlockStateModelGenerator.createAxisRotatedBlockState(SSWPBlocks.COPPER_CHAIN, AquiferModels.TEMPLATE_CHAIN.upload(SSWPBlocks.COPPER_CHAIN, TextureMap.all(SSWPBlocks.COPPER_CHAIN), gen.modelCollector)));
		gen.registerItemModel(SSWPBlocks.COPPER_CHAIN.asItem());
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.CHISELED_COPPER_SLAB, Blocks.CHISELED_COPPER);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.CHISELED_COPPER_STAIRS, Blocks.CHISELED_COPPER);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.CHISELED_COPPER_WALL, Blocks.CHISELED_COPPER);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.COPPER_GRATE_SLAB, Blocks.COPPER_GRATE);
		AquiferBlockStates.registerTransparentStairs(gen, SSWPBlocks.COPPER_GRATE_STAIRS, Blocks.COPPER_GRATE);
		AquiferBlockStates.registerTransparentWall(gen, SSWPBlocks.COPPER_GRATE_WALL, Blocks.COPPER_GRATE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.CUT_COPPER_WALL, Blocks.CUT_COPPER);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.EXPOSED_COPPER_SLAB, Blocks.EXPOSED_COPPER);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.EXPOSED_COPPER_STAIRS, Blocks.EXPOSED_COPPER);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.EXPOSED_COPPER_WALL, Blocks.EXPOSED_COPPER);
		AquiferBlockStates.registerFence(gen, SSWPBlocks.EXPOSED_COPPER_FENCE, Blocks.EXPOSED_COPPER);
		AquiferBlockStates.registerFenceGate(gen, SSWPBlocks.EXPOSED_COPPER_FENCE_GATE, Blocks.EXPOSED_COPPER);
		AquiferBlockStates.registerBars(gen, SSWPBlocks.EXPOSED_COPPER_BARS);
		AquiferBlockStates.registerPressurePlate(gen, SSWPBlocks.EXPOSED_COPPER_PRESSURE_PLATE, Blocks.EXPOSED_COPPER);
		AquiferBlockStates.registerButton(gen, SSWPBlocks.EXPOSED_COPPER_BUTTON, Blocks.EXPOSED_COPPER);
		gen.blockStateCollector.accept(BlockStateModelGenerator.createAxisRotatedBlockState(SSWPBlocks.EXPOSED_COPPER_CHAIN, AquiferModels.TEMPLATE_CHAIN.upload(SSWPBlocks.EXPOSED_COPPER_CHAIN, TextureMap.all(SSWPBlocks.EXPOSED_COPPER_CHAIN), gen.modelCollector)));
		gen.registerItemModel(SSWPBlocks.EXPOSED_COPPER_CHAIN.asItem());
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.EXPOSED_CHISELED_COPPER_SLAB, Blocks.EXPOSED_CHISELED_COPPER);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.EXPOSED_CHISELED_COPPER_STAIRS, Blocks.EXPOSED_CHISELED_COPPER);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.EXPOSED_CHISELED_COPPER_WALL, Blocks.EXPOSED_CHISELED_COPPER);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.EXPOSED_COPPER_GRATE_SLAB, Blocks.EXPOSED_COPPER_GRATE);
		AquiferBlockStates.registerTransparentStairs(gen, SSWPBlocks.EXPOSED_COPPER_GRATE_STAIRS, Blocks.EXPOSED_COPPER_GRATE);
		AquiferBlockStates.registerTransparentWall(gen, SSWPBlocks.EXPOSED_COPPER_GRATE_WALL, Blocks.EXPOSED_COPPER_GRATE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.EXPOSED_CUT_COPPER_WALL, Blocks.EXPOSED_CUT_COPPER);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.WEATHERED_COPPER_SLAB, Blocks.WEATHERED_COPPER);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.WEATHERED_COPPER_STAIRS, Blocks.WEATHERED_COPPER);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.WEATHERED_COPPER_WALL, Blocks.WEATHERED_COPPER);
		AquiferBlockStates.registerFence(gen, SSWPBlocks.WEATHERED_COPPER_FENCE, Blocks.WEATHERED_COPPER);
		AquiferBlockStates.registerFenceGate(gen, SSWPBlocks.WEATHERED_COPPER_FENCE_GATE, Blocks.WEATHERED_COPPER);
		AquiferBlockStates.registerBars(gen, SSWPBlocks.WEATHERED_COPPER_BARS);
		AquiferBlockStates.registerPressurePlate(gen, SSWPBlocks.WEATHERED_COPPER_PRESSURE_PLATE, Blocks.WEATHERED_COPPER);
		AquiferBlockStates.registerButton(gen, SSWPBlocks.WEATHERED_COPPER_BUTTON, Blocks.WEATHERED_COPPER);
		gen.blockStateCollector.accept(BlockStateModelGenerator.createAxisRotatedBlockState(SSWPBlocks.WEATHERED_COPPER_CHAIN, AquiferModels.TEMPLATE_CHAIN.upload(SSWPBlocks.WEATHERED_COPPER_CHAIN, TextureMap.all(SSWPBlocks.WEATHERED_COPPER_CHAIN), gen.modelCollector)));
		gen.registerItemModel(SSWPBlocks.WEATHERED_COPPER_CHAIN.asItem());
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.WEATHERED_CHISELED_COPPER_SLAB, Blocks.WEATHERED_CHISELED_COPPER);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.WEATHERED_CHISELED_COPPER_STAIRS, Blocks.WEATHERED_CHISELED_COPPER);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.WEATHERED_CHISELED_COPPER_WALL, Blocks.WEATHERED_CHISELED_COPPER);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.WEATHERED_COPPER_GRATE_SLAB, Blocks.WEATHERED_COPPER_GRATE);
		AquiferBlockStates.registerTransparentStairs(gen, SSWPBlocks.WEATHERED_COPPER_GRATE_STAIRS, Blocks.WEATHERED_COPPER_GRATE);
		AquiferBlockStates.registerTransparentWall(gen, SSWPBlocks.WEATHERED_COPPER_GRATE_WALL, Blocks.WEATHERED_COPPER_GRATE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.WEATHERED_CUT_COPPER_WALL, Blocks.WEATHERED_CUT_COPPER);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.OXIDIZED_COPPER_SLAB, Blocks.OXIDIZED_COPPER);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.OXIDIZED_COPPER_STAIRS, Blocks.OXIDIZED_COPPER);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.OXIDIZED_COPPER_WALL, Blocks.OXIDIZED_COPPER);
		AquiferBlockStates.registerFence(gen, SSWPBlocks.OXIDIZED_COPPER_FENCE, Blocks.OXIDIZED_COPPER);
		AquiferBlockStates.registerFenceGate(gen, SSWPBlocks.OXIDIZED_COPPER_FENCE_GATE, Blocks.OXIDIZED_COPPER);
		AquiferBlockStates.registerBars(gen, SSWPBlocks.OXIDIZED_COPPER_BARS);
		AquiferBlockStates.registerPressurePlate(gen, SSWPBlocks.OXIDIZED_COPPER_PRESSURE_PLATE, Blocks.OXIDIZED_COPPER);
		AquiferBlockStates.registerButton(gen, SSWPBlocks.OXIDIZED_COPPER_BUTTON, Blocks.OXIDIZED_COPPER);
		gen.blockStateCollector.accept(BlockStateModelGenerator.createAxisRotatedBlockState(SSWPBlocks.OXIDIZED_COPPER_CHAIN, AquiferModels.TEMPLATE_CHAIN.upload(SSWPBlocks.OXIDIZED_COPPER_CHAIN, TextureMap.all(SSWPBlocks.OXIDIZED_COPPER_CHAIN), gen.modelCollector)));
		gen.registerItemModel(SSWPBlocks.OXIDIZED_COPPER_CHAIN.asItem());
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.OXIDIZED_CHISELED_COPPER_SLAB, Blocks.OXIDIZED_CHISELED_COPPER);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.OXIDIZED_CHISELED_COPPER_STAIRS, Blocks.OXIDIZED_CHISELED_COPPER);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.OXIDIZED_CHISELED_COPPER_WALL, Blocks.OXIDIZED_CHISELED_COPPER);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.OXIDIZED_COPPER_GRATE_SLAB, Blocks.OXIDIZED_COPPER_GRATE);
		AquiferBlockStates.registerTransparentStairs(gen, SSWPBlocks.OXIDIZED_COPPER_GRATE_STAIRS, Blocks.OXIDIZED_COPPER_GRATE);
		AquiferBlockStates.registerTransparentWall(gen, SSWPBlocks.OXIDIZED_COPPER_GRATE_WALL, Blocks.OXIDIZED_COPPER_GRATE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.OXIDIZED_CUT_COPPER_WALL, Blocks.OXIDIZED_CUT_COPPER);
		AquiferBlockStates.registerParentedSlab(gen, SSWPBlocks.COPPER_SLAB, SSWPBlocks.WAXED_COPPER_SLAB, Blocks.COPPER_BLOCK);
		AquiferBlockStates.registerParentedStairs(gen, SSWPBlocks.COPPER_STAIRS, SSWPBlocks.WAXED_COPPER_STAIRS);
		AquiferBlockStates.registerParentedWall(gen, SSWPBlocks.COPPER_WALL, SSWPBlocks.WAXED_COPPER_WALL);
		AquiferBlockStates.registerParentedFence(gen, SSWPBlocks.COPPER_FENCE, SSWPBlocks.WAXED_COPPER_FENCE);
		AquiferBlockStates.registerParentedFenceGate(gen, SSWPBlocks.COPPER_FENCE_GATE, SSWPBlocks.WAXED_COPPER_FENCE_GATE);
		AquiferBlockStates.registerParentedBars(gen, SSWPBlocks.COPPER_BARS, SSWPBlocks.WAXED_COPPER_BARS);
		AquiferBlockStates.registerParentedPressurePlate(gen, SSWPBlocks.COPPER_PRESSURE_PLATE, SSWPBlocks.WAXED_COPPER_PRESSURE_PLATE);
		AquiferBlockStates.registerParentedButton(gen, SSWPBlocks.COPPER_BUTTON, SSWPBlocks.WAXED_COPPER_BUTTON);
		gen.blockStateCollector.accept(BlockStateModelGenerator.createAxisRotatedBlockState(SSWPBlocks.WAXED_COPPER_CHAIN, ModelIds.getBlockModelId(SSWPBlocks.COPPER_CHAIN)));
		gen.registerParentedItemModel(SSWPBlocks.WAXED_COPPER_CHAIN, ModelIds.getItemModelId(SSWPItems.COPPER_CHAIN));
		AquiferBlockStates.registerParentedSlab(gen, SSWPBlocks.CHISELED_COPPER_SLAB, SSWPBlocks.WAXED_CHISELED_COPPER_SLAB, Blocks.CHISELED_COPPER);
		AquiferBlockStates.registerParentedStairs(gen, SSWPBlocks.CHISELED_COPPER_STAIRS, SSWPBlocks.WAXED_CHISELED_COPPER_STAIRS);
		AquiferBlockStates.registerParentedWall(gen, SSWPBlocks.CHISELED_COPPER_WALL, SSWPBlocks.WAXED_CHISELED_COPPER_WALL);
		AquiferBlockStates.registerParentedSlab(gen, SSWPBlocks.COPPER_GRATE_SLAB, SSWPBlocks.WAXED_COPPER_GRATE_SLAB, Blocks.COPPER_GRATE);
		AquiferBlockStates.registerParentedStairs(gen, SSWPBlocks.COPPER_GRATE_STAIRS, SSWPBlocks.WAXED_COPPER_GRATE_STAIRS);
		AquiferBlockStates.registerParentedTransparentWall(gen, SSWPBlocks.COPPER_GRATE_WALL, SSWPBlocks.WAXED_COPPER_GRATE_WALL);
		AquiferBlockStates.registerParentedWall(gen, SSWPBlocks.CUT_COPPER_WALL, SSWPBlocks.WAXED_CUT_COPPER_WALL);
		AquiferBlockStates.registerParentedSlab(gen, SSWPBlocks.EXPOSED_COPPER_SLAB, SSWPBlocks.WAXED_EXPOSED_COPPER_SLAB, Blocks.EXPOSED_COPPER);
		AquiferBlockStates.registerParentedStairs(gen, SSWPBlocks.EXPOSED_COPPER_STAIRS, SSWPBlocks.WAXED_EXPOSED_COPPER_STAIRS);
		AquiferBlockStates.registerParentedWall(gen, SSWPBlocks.EXPOSED_COPPER_WALL, SSWPBlocks.WAXED_EXPOSED_COPPER_WALL);
		AquiferBlockStates.registerParentedFence(gen, SSWPBlocks.EXPOSED_COPPER_FENCE, SSWPBlocks.WAXED_EXPOSED_COPPER_FENCE);
		AquiferBlockStates.registerParentedFenceGate(gen, SSWPBlocks.EXPOSED_COPPER_FENCE_GATE, SSWPBlocks.WAXED_EXPOSED_COPPER_FENCE_GATE);
		AquiferBlockStates.registerParentedBars(gen, SSWPBlocks.EXPOSED_COPPER_BARS, SSWPBlocks.WAXED_EXPOSED_COPPER_BARS);
		AquiferBlockStates.registerParentedPressurePlate(gen, SSWPBlocks.EXPOSED_COPPER_PRESSURE_PLATE, SSWPBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE);
		AquiferBlockStates.registerParentedButton(gen, SSWPBlocks.EXPOSED_COPPER_BUTTON, SSWPBlocks.WAXED_EXPOSED_COPPER_BUTTON);
		gen.blockStateCollector.accept(BlockStateModelGenerator.createAxisRotatedBlockState(SSWPBlocks.WAXED_EXPOSED_COPPER_CHAIN, ModelIds.getBlockModelId(SSWPBlocks.EXPOSED_COPPER_CHAIN)));
		gen.registerParentedItemModel(SSWPBlocks.WAXED_EXPOSED_COPPER_CHAIN, ModelIds.getItemModelId(SSWPItems.EXPOSED_COPPER_CHAIN));
		AquiferBlockStates.registerParentedSlab(gen, SSWPBlocks.EXPOSED_CHISELED_COPPER_SLAB, SSWPBlocks.WAXED_EXPOSED_CHISELED_COPPER_SLAB, Blocks.EXPOSED_CHISELED_COPPER);
		AquiferBlockStates.registerParentedStairs(gen, SSWPBlocks.EXPOSED_CHISELED_COPPER_STAIRS, SSWPBlocks.WAXED_EXPOSED_CHISELED_COPPER_STAIRS);
		AquiferBlockStates.registerParentedWall(gen, SSWPBlocks.EXPOSED_CHISELED_COPPER_WALL, SSWPBlocks.WAXED_EXPOSED_CHISELED_COPPER_WALL);
		AquiferBlockStates.registerParentedSlab(gen, SSWPBlocks.EXPOSED_COPPER_GRATE_SLAB, SSWPBlocks.WAXED_EXPOSED_COPPER_GRATE_SLAB, Blocks.EXPOSED_COPPER_GRATE);
		AquiferBlockStates.registerParentedStairs(gen, SSWPBlocks.EXPOSED_COPPER_GRATE_STAIRS, SSWPBlocks.WAXED_EXPOSED_COPPER_GRATE_STAIRS);
		AquiferBlockStates.registerParentedTransparentWall(gen, SSWPBlocks.EXPOSED_COPPER_GRATE_WALL, SSWPBlocks.WAXED_EXPOSED_COPPER_GRATE_WALL);
		AquiferBlockStates.registerParentedWall(gen, SSWPBlocks.EXPOSED_CUT_COPPER_WALL, SSWPBlocks.WAXED_EXPOSED_CUT_COPPER_WALL);
		AquiferBlockStates.registerParentedSlab(gen, SSWPBlocks.WEATHERED_COPPER_SLAB, SSWPBlocks.WAXED_WEATHERED_COPPER_SLAB, Blocks.WEATHERED_COPPER);
		AquiferBlockStates.registerParentedStairs(gen, SSWPBlocks.WEATHERED_COPPER_STAIRS, SSWPBlocks.WAXED_WEATHERED_COPPER_STAIRS);
		AquiferBlockStates.registerParentedWall(gen, SSWPBlocks.WEATHERED_COPPER_WALL, SSWPBlocks.WAXED_WEATHERED_COPPER_WALL);
		AquiferBlockStates.registerParentedFence(gen, SSWPBlocks.WEATHERED_COPPER_FENCE, SSWPBlocks.WAXED_WEATHERED_COPPER_FENCE);
		AquiferBlockStates.registerParentedFenceGate(gen, SSWPBlocks.WEATHERED_COPPER_FENCE_GATE, SSWPBlocks.WAXED_WEATHERED_COPPER_FENCE_GATE);
		AquiferBlockStates.registerParentedBars(gen, SSWPBlocks.WEATHERED_COPPER_BARS, SSWPBlocks.WAXED_WEATHERED_COPPER_BARS);
		AquiferBlockStates.registerParentedPressurePlate(gen, SSWPBlocks.WEATHERED_COPPER_PRESSURE_PLATE, SSWPBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE);
		AquiferBlockStates.registerParentedButton(gen, SSWPBlocks.WEATHERED_COPPER_BUTTON, SSWPBlocks.WAXED_WEATHERED_COPPER_BUTTON);
		gen.blockStateCollector.accept(BlockStateModelGenerator.createAxisRotatedBlockState(SSWPBlocks.WAXED_WEATHERED_COPPER_CHAIN, ModelIds.getBlockModelId(SSWPBlocks.WEATHERED_COPPER_CHAIN)));
		gen.registerParentedItemModel(SSWPBlocks.WAXED_WEATHERED_COPPER_CHAIN, ModelIds.getItemModelId(SSWPItems.WEATHERED_COPPER_CHAIN));
		AquiferBlockStates.registerParentedSlab(gen, SSWPBlocks.WEATHERED_CHISELED_COPPER_SLAB, SSWPBlocks.WAXED_WEATHERED_CHISELED_COPPER_SLAB, Blocks.WEATHERED_CHISELED_COPPER);
		AquiferBlockStates.registerParentedStairs(gen, SSWPBlocks.WEATHERED_CHISELED_COPPER_STAIRS, SSWPBlocks.WAXED_WEATHERED_CHISELED_COPPER_STAIRS);
		AquiferBlockStates.registerParentedWall(gen, SSWPBlocks.WEATHERED_CHISELED_COPPER_WALL, SSWPBlocks.WAXED_WEATHERED_CHISELED_COPPER_WALL);
		AquiferBlockStates.registerParentedSlab(gen, SSWPBlocks.WEATHERED_COPPER_GRATE_SLAB, SSWPBlocks.WAXED_WEATHERED_COPPER_GRATE_SLAB, Blocks.WEATHERED_COPPER_GRATE);
		AquiferBlockStates.registerParentedStairs(gen, SSWPBlocks.WEATHERED_COPPER_GRATE_STAIRS, SSWPBlocks.WAXED_WEATHERED_COPPER_GRATE_STAIRS);
		AquiferBlockStates.registerParentedTransparentWall(gen, SSWPBlocks.WEATHERED_COPPER_GRATE_WALL, SSWPBlocks.WAXED_WEATHERED_COPPER_GRATE_WALL);
		AquiferBlockStates.registerParentedWall(gen, SSWPBlocks.WEATHERED_CUT_COPPER_WALL, SSWPBlocks.WAXED_WEATHERED_CUT_COPPER_WALL);
		AquiferBlockStates.registerParentedSlab(gen, SSWPBlocks.OXIDIZED_COPPER_SLAB, SSWPBlocks.WAXED_OXIDIZED_COPPER_SLAB, Blocks.OXIDIZED_COPPER);
		AquiferBlockStates.registerParentedStairs(gen, SSWPBlocks.OXIDIZED_COPPER_STAIRS, SSWPBlocks.WAXED_OXIDIZED_COPPER_STAIRS);
		AquiferBlockStates.registerParentedWall(gen, SSWPBlocks.OXIDIZED_COPPER_WALL, SSWPBlocks.WAXED_OXIDIZED_COPPER_WALL);
		AquiferBlockStates.registerParentedFence(gen, SSWPBlocks.OXIDIZED_COPPER_FENCE, SSWPBlocks.WAXED_OXIDIZED_COPPER_FENCE);
		AquiferBlockStates.registerParentedFenceGate(gen, SSWPBlocks.OXIDIZED_COPPER_FENCE_GATE, SSWPBlocks.WAXED_OXIDIZED_COPPER_FENCE_GATE);
		AquiferBlockStates.registerParentedBars(gen, SSWPBlocks.OXIDIZED_COPPER_BARS, SSWPBlocks.WAXED_OXIDIZED_COPPER_BARS);
		AquiferBlockStates.registerParentedPressurePlate(gen, SSWPBlocks.OXIDIZED_COPPER_PRESSURE_PLATE, SSWPBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE);
		AquiferBlockStates.registerParentedButton(gen, SSWPBlocks.OXIDIZED_COPPER_BUTTON, SSWPBlocks.WAXED_OXIDIZED_COPPER_BUTTON);
		gen.blockStateCollector.accept(BlockStateModelGenerator.createAxisRotatedBlockState(SSWPBlocks.WAXED_OXIDIZED_COPPER_CHAIN, ModelIds.getBlockModelId(SSWPBlocks.OXIDIZED_COPPER_CHAIN)));
		gen.registerParentedItemModel(SSWPBlocks.WAXED_OXIDIZED_COPPER_CHAIN, ModelIds.getItemModelId(SSWPItems.OXIDIZED_COPPER_CHAIN));
		AquiferBlockStates.registerParentedSlab(gen, SSWPBlocks.OXIDIZED_CHISELED_COPPER_SLAB, SSWPBlocks.WAXED_OXIDIZED_CHISELED_COPPER_SLAB, Blocks.OXIDIZED_CHISELED_COPPER);
		AquiferBlockStates.registerParentedStairs(gen, SSWPBlocks.OXIDIZED_CHISELED_COPPER_STAIRS, SSWPBlocks.WAXED_OXIDIZED_CHISELED_COPPER_STAIRS);
		AquiferBlockStates.registerParentedWall(gen, SSWPBlocks.OXIDIZED_CHISELED_COPPER_WALL, SSWPBlocks.WAXED_OXIDIZED_CHISELED_COPPER_WALL);
		AquiferBlockStates.registerParentedSlab(gen, SSWPBlocks.OXIDIZED_COPPER_GRATE_SLAB, SSWPBlocks.WAXED_OXIDIZED_COPPER_GRATE_SLAB, Blocks.OXIDIZED_COPPER_GRATE);
		AquiferBlockStates.registerParentedStairs(gen, SSWPBlocks.OXIDIZED_COPPER_GRATE_STAIRS, SSWPBlocks.WAXED_OXIDIZED_COPPER_GRATE_STAIRS);
		AquiferBlockStates.registerParentedTransparentWall(gen, SSWPBlocks.OXIDIZED_COPPER_GRATE_WALL, SSWPBlocks.WAXED_OXIDIZED_COPPER_GRATE_WALL);
		AquiferBlockStates.registerParentedWall(gen, SSWPBlocks.OXIDIZED_CUT_COPPER_WALL, SSWPBlocks.WAXED_OXIDIZED_CUT_COPPER_WALL);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.WHITE_WOOL_SLAB, Blocks.WHITE_WOOL);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.WHITE_WOOL_STAIRS, Blocks.WHITE_WOOL);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.WHITE_WOOL_WALL, Blocks.WHITE_WOOL);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.LIGHT_GRAY_WOOL_SLAB, Blocks.LIGHT_GRAY_WOOL);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.LIGHT_GRAY_WOOL_STAIRS, Blocks.LIGHT_GRAY_WOOL);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.LIGHT_GRAY_WOOL_WALL, Blocks.LIGHT_GRAY_WOOL);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.GRAY_WOOL_SLAB, Blocks.GRAY_WOOL);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.GRAY_WOOL_STAIRS, Blocks.GRAY_WOOL);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.GRAY_WOOL_WALL, Blocks.GRAY_WOOL);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.BLACK_WOOL_SLAB, Blocks.BLACK_WOOL);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.BLACK_WOOL_STAIRS, Blocks.BLACK_WOOL);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.BLACK_WOOL_WALL, Blocks.BLACK_WOOL);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.BROWN_WOOL_SLAB, Blocks.BROWN_WOOL);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.BROWN_WOOL_STAIRS, Blocks.BROWN_WOOL);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.BROWN_WOOL_WALL, Blocks.BROWN_WOOL);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.RED_WOOL_SLAB, Blocks.RED_WOOL);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.RED_WOOL_STAIRS, Blocks.RED_WOOL);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.RED_WOOL_WALL, Blocks.RED_WOOL);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.ORANGE_WOOL_SLAB, Blocks.ORANGE_WOOL);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.ORANGE_WOOL_STAIRS, Blocks.ORANGE_WOOL);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.ORANGE_WOOL_WALL, Blocks.ORANGE_WOOL);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.YELLOW_WOOL_SLAB, Blocks.YELLOW_WOOL);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.YELLOW_WOOL_STAIRS, Blocks.YELLOW_WOOL);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.YELLOW_WOOL_WALL, Blocks.YELLOW_WOOL);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.LIME_WOOL_SLAB, Blocks.LIME_WOOL);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.LIME_WOOL_STAIRS, Blocks.LIME_WOOL);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.LIME_WOOL_WALL, Blocks.LIME_WOOL);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.GREEN_WOOL_SLAB, Blocks.GREEN_WOOL);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.GREEN_WOOL_STAIRS, Blocks.GREEN_WOOL);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.GREEN_WOOL_WALL, Blocks.GREEN_WOOL);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.CYAN_WOOL_SLAB, Blocks.CYAN_WOOL);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.CYAN_WOOL_STAIRS, Blocks.CYAN_WOOL);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.CYAN_WOOL_WALL, Blocks.CYAN_WOOL);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.LIGHT_BLUE_WOOL_SLAB, Blocks.LIGHT_BLUE_WOOL);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.LIGHT_BLUE_WOOL_STAIRS, Blocks.LIGHT_BLUE_WOOL);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.LIGHT_BLUE_WOOL_WALL, Blocks.LIGHT_BLUE_WOOL);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.BLUE_WOOL_SLAB, Blocks.BLUE_WOOL);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.BLUE_WOOL_STAIRS, Blocks.BLUE_WOOL);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.BLUE_WOOL_WALL, Blocks.BLUE_WOOL);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.PURPLE_WOOL_SLAB, Blocks.PURPLE_WOOL);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.PURPLE_WOOL_STAIRS, Blocks.PURPLE_WOOL);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.PURPLE_WOOL_WALL, Blocks.PURPLE_WOOL);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.MAGENTA_WOOL_SLAB, Blocks.MAGENTA_WOOL);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.MAGENTA_WOOL_STAIRS, Blocks.MAGENTA_WOOL);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.MAGENTA_WOOL_WALL, Blocks.MAGENTA_WOOL);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.PINK_WOOL_SLAB, Blocks.PINK_WOOL);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.PINK_WOOL_STAIRS, Blocks.PINK_WOOL);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.PINK_WOOL_WALL, Blocks.PINK_WOOL);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.TERRACOTTA_SLAB, Blocks.TERRACOTTA);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.TERRACOTTA_STAIRS, Blocks.TERRACOTTA);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.TERRACOTTA_WALL, Blocks.TERRACOTTA);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.WHITE_TERRACOTTA_SLAB, Blocks.WHITE_TERRACOTTA);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.WHITE_TERRACOTTA_STAIRS, Blocks.WHITE_TERRACOTTA);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.WHITE_TERRACOTTA_WALL, Blocks.WHITE_TERRACOTTA);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, Blocks.LIGHT_GRAY_TERRACOTTA);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS, Blocks.LIGHT_GRAY_TERRACOTTA);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.LIGHT_GRAY_TERRACOTTA_WALL, Blocks.LIGHT_GRAY_TERRACOTTA);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.GRAY_TERRACOTTA_SLAB, Blocks.GRAY_TERRACOTTA);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.GRAY_TERRACOTTA_STAIRS, Blocks.GRAY_TERRACOTTA);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.GRAY_TERRACOTTA_WALL, Blocks.GRAY_TERRACOTTA);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.BLACK_TERRACOTTA_SLAB, Blocks.BLACK_TERRACOTTA);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.BLACK_TERRACOTTA_STAIRS, Blocks.BLACK_TERRACOTTA);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.BLACK_TERRACOTTA_WALL, Blocks.BLACK_TERRACOTTA);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.BROWN_TERRACOTTA_SLAB, Blocks.BROWN_TERRACOTTA);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.BROWN_TERRACOTTA_STAIRS, Blocks.BROWN_TERRACOTTA);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.BROWN_TERRACOTTA_WALL, Blocks.BROWN_TERRACOTTA);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.RED_TERRACOTTA_SLAB, Blocks.RED_TERRACOTTA);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.RED_TERRACOTTA_STAIRS, Blocks.RED_TERRACOTTA);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.RED_TERRACOTTA_WALL, Blocks.RED_TERRACOTTA);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.ORANGE_TERRACOTTA_SLAB, Blocks.ORANGE_TERRACOTTA);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.ORANGE_TERRACOTTA_STAIRS, Blocks.ORANGE_TERRACOTTA);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.ORANGE_TERRACOTTA_WALL, Blocks.ORANGE_TERRACOTTA);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.YELLOW_TERRACOTTA_SLAB, Blocks.YELLOW_TERRACOTTA);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.YELLOW_TERRACOTTA_STAIRS, Blocks.YELLOW_TERRACOTTA);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.YELLOW_TERRACOTTA_WALL, Blocks.YELLOW_TERRACOTTA);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.LIME_TERRACOTTA_SLAB, Blocks.LIME_TERRACOTTA);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.LIME_TERRACOTTA_STAIRS, Blocks.LIME_TERRACOTTA);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.LIME_TERRACOTTA_WALL, Blocks.LIME_TERRACOTTA);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.GREEN_TERRACOTTA_SLAB, Blocks.GREEN_TERRACOTTA);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.GREEN_TERRACOTTA_STAIRS, Blocks.GREEN_TERRACOTTA);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.GREEN_TERRACOTTA_WALL, Blocks.GREEN_TERRACOTTA);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.CYAN_TERRACOTTA_SLAB, Blocks.CYAN_TERRACOTTA);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.CYAN_TERRACOTTA_STAIRS, Blocks.CYAN_TERRACOTTA);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.CYAN_TERRACOTTA_WALL, Blocks.CYAN_TERRACOTTA);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, Blocks.LIGHT_BLUE_TERRACOTTA);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS, Blocks.LIGHT_BLUE_TERRACOTTA);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.LIGHT_BLUE_TERRACOTTA_WALL, Blocks.LIGHT_BLUE_TERRACOTTA);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.BLUE_TERRACOTTA_SLAB, Blocks.BLUE_TERRACOTTA);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.BLUE_TERRACOTTA_STAIRS, Blocks.BLUE_TERRACOTTA);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.BLUE_TERRACOTTA_WALL, Blocks.BLUE_TERRACOTTA);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.PURPLE_TERRACOTTA_SLAB, Blocks.PURPLE_TERRACOTTA);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.PURPLE_TERRACOTTA_STAIRS, Blocks.PURPLE_TERRACOTTA);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.PURPLE_TERRACOTTA_WALL, Blocks.PURPLE_TERRACOTTA);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.MAGENTA_TERRACOTTA_SLAB, Blocks.MAGENTA_TERRACOTTA);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.MAGENTA_TERRACOTTA_STAIRS, Blocks.MAGENTA_TERRACOTTA);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.MAGENTA_TERRACOTTA_WALL, Blocks.MAGENTA_TERRACOTTA);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.PINK_TERRACOTTA_SLAB, Blocks.PINK_TERRACOTTA);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.PINK_TERRACOTTA_STAIRS, Blocks.PINK_TERRACOTTA);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.PINK_TERRACOTTA_WALL, Blocks.PINK_TERRACOTTA);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.WHITE_CONCRETE_SLAB, Blocks.WHITE_CONCRETE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.WHITE_CONCRETE_STAIRS, Blocks.WHITE_CONCRETE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.WHITE_CONCRETE_WALL, Blocks.WHITE_CONCRETE);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.LIGHT_GRAY_CONCRETE_SLAB, Blocks.LIGHT_GRAY_CONCRETE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.LIGHT_GRAY_CONCRETE_STAIRS, Blocks.LIGHT_GRAY_CONCRETE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.LIGHT_GRAY_CONCRETE_WALL, Blocks.LIGHT_GRAY_CONCRETE);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.GRAY_CONCRETE_SLAB, Blocks.GRAY_CONCRETE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.GRAY_CONCRETE_STAIRS, Blocks.GRAY_CONCRETE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.GRAY_CONCRETE_WALL, Blocks.GRAY_CONCRETE);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.BLACK_CONCRETE_SLAB, Blocks.BLACK_CONCRETE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.BLACK_CONCRETE_STAIRS, Blocks.BLACK_CONCRETE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.BLACK_CONCRETE_WALL, Blocks.BLACK_CONCRETE);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.BROWN_CONCRETE_SLAB, Blocks.BROWN_CONCRETE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.BROWN_CONCRETE_STAIRS, Blocks.BROWN_CONCRETE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.BROWN_CONCRETE_WALL, Blocks.BROWN_CONCRETE);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.RED_CONCRETE_SLAB, Blocks.RED_CONCRETE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.RED_CONCRETE_STAIRS, Blocks.RED_CONCRETE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.RED_CONCRETE_WALL, Blocks.RED_CONCRETE);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.ORANGE_CONCRETE_SLAB, Blocks.ORANGE_CONCRETE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.ORANGE_CONCRETE_STAIRS, Blocks.ORANGE_CONCRETE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.ORANGE_CONCRETE_WALL, Blocks.ORANGE_CONCRETE);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.YELLOW_CONCRETE_SLAB, Blocks.YELLOW_CONCRETE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.YELLOW_CONCRETE_STAIRS, Blocks.YELLOW_CONCRETE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.YELLOW_CONCRETE_WALL, Blocks.YELLOW_CONCRETE);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.LIME_CONCRETE_SLAB, Blocks.LIME_CONCRETE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.LIME_CONCRETE_STAIRS, Blocks.LIME_CONCRETE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.LIME_CONCRETE_WALL, Blocks.LIME_CONCRETE);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.GREEN_CONCRETE_SLAB, Blocks.GREEN_CONCRETE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.GREEN_CONCRETE_STAIRS, Blocks.GREEN_CONCRETE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.GREEN_CONCRETE_WALL, Blocks.GREEN_CONCRETE);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.CYAN_CONCRETE_SLAB, Blocks.CYAN_CONCRETE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.CYAN_CONCRETE_STAIRS, Blocks.CYAN_CONCRETE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.CYAN_CONCRETE_WALL, Blocks.CYAN_CONCRETE);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.LIGHT_BLUE_CONCRETE_SLAB, Blocks.LIGHT_BLUE_CONCRETE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.LIGHT_BLUE_CONCRETE_STAIRS, Blocks.LIGHT_BLUE_CONCRETE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.LIGHT_BLUE_CONCRETE_WALL, Blocks.LIGHT_BLUE_CONCRETE);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.BLUE_CONCRETE_SLAB, Blocks.BLUE_CONCRETE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.BLUE_CONCRETE_STAIRS, Blocks.BLUE_CONCRETE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.BLUE_CONCRETE_WALL, Blocks.BLUE_CONCRETE);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.PURPLE_CONCRETE_SLAB, Blocks.PURPLE_CONCRETE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.PURPLE_CONCRETE_STAIRS, Blocks.PURPLE_CONCRETE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.PURPLE_CONCRETE_WALL, Blocks.PURPLE_CONCRETE);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.MAGENTA_CONCRETE_SLAB, Blocks.MAGENTA_CONCRETE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.MAGENTA_CONCRETE_STAIRS, Blocks.MAGENTA_CONCRETE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.MAGENTA_CONCRETE_WALL, Blocks.MAGENTA_CONCRETE);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.PINK_CONCRETE_SLAB, Blocks.PINK_CONCRETE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.PINK_CONCRETE_STAIRS, Blocks.PINK_CONCRETE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.PINK_CONCRETE_WALL, Blocks.PINK_CONCRETE);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.GLASS_SLAB, Blocks.GLASS);
		AquiferBlockStates.registerTransparentStairs(gen, SSWPBlocks.GLASS_STAIRS, Blocks.GLASS);
		AquiferBlockStates.registerTransparentWall(gen, SSWPBlocks.GLASS_WALL, Blocks.GLASS);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.TINTED_GLASS_SLAB, Blocks.TINTED_GLASS);
		AquiferBlockStates.registerTransparentStairs(gen, SSWPBlocks.TINTED_GLASS_STAIRS, Blocks.TINTED_GLASS);
		AquiferBlockStates.registerTransparentWall(gen, SSWPBlocks.TINTED_GLASS_WALL, Blocks.TINTED_GLASS);
		registerGlassPane(gen, Blocks.TINTED_GLASS, SSWPBlocks.TINTED_GLASS_PANE);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.WHITE_STAINED_GLASS_SLAB, Blocks.WHITE_STAINED_GLASS);
		AquiferBlockStates.registerTransparentStairs(gen, SSWPBlocks.WHITE_STAINED_GLASS_STAIRS, Blocks.WHITE_STAINED_GLASS);
		AquiferBlockStates.registerTransparentWall(gen, SSWPBlocks.WHITE_STAINED_GLASS_WALL, Blocks.WHITE_STAINED_GLASS);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB, Blocks.LIGHT_GRAY_STAINED_GLASS);
		AquiferBlockStates.registerTransparentStairs(gen, SSWPBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS, Blocks.LIGHT_GRAY_STAINED_GLASS);
		AquiferBlockStates.registerTransparentWall(gen, SSWPBlocks.LIGHT_GRAY_STAINED_GLASS_WALL, Blocks.LIGHT_GRAY_STAINED_GLASS);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.GRAY_STAINED_GLASS_SLAB, Blocks.GRAY_STAINED_GLASS);
		AquiferBlockStates.registerTransparentStairs(gen, SSWPBlocks.GRAY_STAINED_GLASS_STAIRS, Blocks.GRAY_STAINED_GLASS);
		AquiferBlockStates.registerTransparentWall(gen, SSWPBlocks.GRAY_STAINED_GLASS_WALL, Blocks.GRAY_STAINED_GLASS);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.BLACK_STAINED_GLASS_SLAB, Blocks.BLACK_STAINED_GLASS);
		AquiferBlockStates.registerTransparentStairs(gen, SSWPBlocks.BLACK_STAINED_GLASS_STAIRS, Blocks.BLACK_STAINED_GLASS);
		AquiferBlockStates.registerTransparentWall(gen, SSWPBlocks.BLACK_STAINED_GLASS_WALL, Blocks.BLACK_STAINED_GLASS);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.BROWN_STAINED_GLASS_SLAB, Blocks.BROWN_STAINED_GLASS);
		AquiferBlockStates.registerTransparentStairs(gen, SSWPBlocks.BROWN_STAINED_GLASS_STAIRS, Blocks.BROWN_STAINED_GLASS);
		AquiferBlockStates.registerTransparentWall(gen, SSWPBlocks.BROWN_STAINED_GLASS_WALL, Blocks.BROWN_STAINED_GLASS);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.RED_STAINED_GLASS_SLAB, Blocks.RED_STAINED_GLASS);
		AquiferBlockStates.registerTransparentStairs(gen, SSWPBlocks.RED_STAINED_GLASS_STAIRS, Blocks.RED_STAINED_GLASS);
		AquiferBlockStates.registerTransparentWall(gen, SSWPBlocks.RED_STAINED_GLASS_WALL, Blocks.RED_STAINED_GLASS);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.ORANGE_STAINED_GLASS_SLAB, Blocks.ORANGE_STAINED_GLASS);
		AquiferBlockStates.registerTransparentStairs(gen, SSWPBlocks.ORANGE_STAINED_GLASS_STAIRS, Blocks.ORANGE_STAINED_GLASS);
		AquiferBlockStates.registerTransparentWall(gen, SSWPBlocks.ORANGE_STAINED_GLASS_WALL, Blocks.ORANGE_STAINED_GLASS);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.YELLOW_STAINED_GLASS_SLAB, Blocks.YELLOW_STAINED_GLASS);
		AquiferBlockStates.registerTransparentStairs(gen, SSWPBlocks.YELLOW_STAINED_GLASS_STAIRS, Blocks.YELLOW_STAINED_GLASS);
		AquiferBlockStates.registerTransparentWall(gen, SSWPBlocks.YELLOW_STAINED_GLASS_WALL, Blocks.YELLOW_STAINED_GLASS);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.LIME_STAINED_GLASS_SLAB, Blocks.LIME_STAINED_GLASS);
		AquiferBlockStates.registerTransparentStairs(gen, SSWPBlocks.LIME_STAINED_GLASS_STAIRS, Blocks.LIME_STAINED_GLASS);
		AquiferBlockStates.registerTransparentWall(gen, SSWPBlocks.LIME_STAINED_GLASS_WALL, Blocks.LIME_STAINED_GLASS);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.GREEN_STAINED_GLASS_SLAB, Blocks.GREEN_STAINED_GLASS);
		AquiferBlockStates.registerTransparentStairs(gen, SSWPBlocks.GREEN_STAINED_GLASS_STAIRS, Blocks.GREEN_STAINED_GLASS);
		AquiferBlockStates.registerTransparentWall(gen, SSWPBlocks.GREEN_STAINED_GLASS_WALL, Blocks.GREEN_STAINED_GLASS);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.CYAN_STAINED_GLASS_SLAB, Blocks.CYAN_STAINED_GLASS);
		AquiferBlockStates.registerTransparentStairs(gen, SSWPBlocks.CYAN_STAINED_GLASS_STAIRS, Blocks.CYAN_STAINED_GLASS);
		AquiferBlockStates.registerTransparentWall(gen, SSWPBlocks.CYAN_STAINED_GLASS_WALL, Blocks.CYAN_STAINED_GLASS);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB, Blocks.LIGHT_BLUE_STAINED_GLASS);
		AquiferBlockStates.registerTransparentStairs(gen, SSWPBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS, Blocks.LIGHT_BLUE_STAINED_GLASS);
		AquiferBlockStates.registerTransparentWall(gen, SSWPBlocks.LIGHT_BLUE_STAINED_GLASS_WALL, Blocks.LIGHT_BLUE_STAINED_GLASS);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.BLUE_STAINED_GLASS_SLAB, Blocks.BLUE_STAINED_GLASS);
		AquiferBlockStates.registerTransparentStairs(gen, SSWPBlocks.BLUE_STAINED_GLASS_STAIRS, Blocks.BLUE_STAINED_GLASS);
		AquiferBlockStates.registerTransparentWall(gen, SSWPBlocks.BLUE_STAINED_GLASS_WALL, Blocks.BLUE_STAINED_GLASS);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.PURPLE_STAINED_GLASS_SLAB, Blocks.PURPLE_STAINED_GLASS);
		AquiferBlockStates.registerTransparentStairs(gen, SSWPBlocks.PURPLE_STAINED_GLASS_STAIRS, Blocks.PURPLE_STAINED_GLASS);
		AquiferBlockStates.registerTransparentWall(gen, SSWPBlocks.PURPLE_STAINED_GLASS_WALL, Blocks.PURPLE_STAINED_GLASS);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.MAGENTA_STAINED_GLASS_SLAB, Blocks.MAGENTA_STAINED_GLASS);
		AquiferBlockStates.registerTransparentStairs(gen, SSWPBlocks.MAGENTA_STAINED_GLASS_STAIRS, Blocks.MAGENTA_STAINED_GLASS);
		AquiferBlockStates.registerTransparentWall(gen, SSWPBlocks.MAGENTA_STAINED_GLASS_WALL, Blocks.MAGENTA_STAINED_GLASS);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.PINK_STAINED_GLASS_SLAB, Blocks.PINK_STAINED_GLASS);
		AquiferBlockStates.registerTransparentStairs(gen, SSWPBlocks.PINK_STAINED_GLASS_STAIRS, Blocks.PINK_STAINED_GLASS);
		AquiferBlockStates.registerTransparentWall(gen, SSWPBlocks.PINK_STAINED_GLASS_WALL, Blocks.PINK_STAINED_GLASS);
		
		registerGrassSlab(gen);
		registerGrassStairs(gen);
		registerGrassWall(gen);
		AquiferBlockStates.registerSnowyTerrainSlab(gen, SSWPBlocks.PODZOL_SLAB, Blocks.PODZOL, Blocks.DIRT, SSWPBlocks.GRASS_SLAB);
		AquiferBlockStates.registerSnowyTerrainStairs(gen, SSWPBlocks.PODZOL_STAIRS, Blocks.PODZOL, Blocks.DIRT, SSWPBlocks.GRASS_STAIRS);
		AquiferBlockStates.registerSnowyTerrainWall(gen, SSWPBlocks.PODZOL_WALL, Blocks.PODZOL, Blocks.DIRT, SSWPBlocks.GRASS_WALL);
		AquiferBlockStates.registerSnowyTerrainSlab(gen, SSWPBlocks.MYCELIUM_SLAB, Blocks.MYCELIUM, Blocks.DIRT, SSWPBlocks.GRASS_SLAB);
		AquiferBlockStates.registerSnowyTerrainStairs(gen, SSWPBlocks.MYCELIUM_STAIRS, Blocks.MYCELIUM, Blocks.DIRT, SSWPBlocks.GRASS_STAIRS);
		AquiferBlockStates.registerSnowyTerrainWall(gen, SSWPBlocks.MYCELIUM_WALL, Blocks.MYCELIUM, Blocks.DIRT, SSWPBlocks.GRASS_WALL);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.DIRT_PATH_SLAB, ModelIds.getBlockModelId(SSWPBlocks.DIRT_PATH_SLAB), ModelIds.getBlockSubModelId(SSWPBlocks.DIRT_PATH_SLAB, "_top"), ModelIds.getBlockSubModelId(SSWPBlocks.DIRT_PATH_SLAB, "_double"));
		AquiferBlockStates.registerFlippedStairs(gen, SSWPBlocks.DIRT_PATH_STAIRS, ModelIds.getBlockSubModelId(SSWPBlocks.DIRT_PATH_STAIRS, "_inner"), ModelIds.getBlockSubModelId(SSWPBlocks.DIRT_PATH_STAIRS, "_inner_flipped"), ModelIds.getBlockModelId(SSWPBlocks.DIRT_PATH_STAIRS), ModelIds.getBlockSubModelId(SSWPBlocks.DIRT_PATH_STAIRS, "_flipped"), ModelIds.getBlockSubModelId(SSWPBlocks.DIRT_PATH_STAIRS, "_outer"), ModelIds.getBlockSubModelId(SSWPBlocks.DIRT_PATH_STAIRS, "_outer_flipped"));
		AquiferBlockStates.registerWall(gen, SSWPBlocks.DIRT_PATH_WALL, ModelIds.getBlockSubModelId(SSWPBlocks.DIRT_PATH_WALL, "_post"), ModelIds.getBlockSubModelId(SSWPBlocks.DIRT_PATH_WALL, "_side"), ModelIds.getBlockSubModelId(SSWPBlocks.DIRT_PATH_WALL, "_side_tall"), ModelIds.getBlockSubModelId(SSWPBlocks.DIRT_PATH_WALL, "_inventory"));
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.DIRT_SLAB, Blocks.DIRT);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.DIRT_STAIRS, Blocks.DIRT);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.DIRT_WALL, Blocks.DIRT);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.COARSE_DIRT_SLAB, Blocks.COARSE_DIRT);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.COARSE_DIRT_STAIRS, Blocks.COARSE_DIRT);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.COARSE_DIRT_WALL, Blocks.COARSE_DIRT);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.ROOTED_DIRT_SLAB, Blocks.ROOTED_DIRT);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.ROOTED_DIRT_STAIRS, Blocks.ROOTED_DIRT);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.ROOTED_DIRT_WALL, Blocks.ROOTED_DIRT);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.MUD_SLAB, Blocks.MUD);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.MUD_STAIRS, Blocks.MUD);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.MUD_WALL, Blocks.MUD);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.CLAY_SLAB, Blocks.CLAY);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.CLAY_STAIRS, Blocks.CLAY);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.CLAY_WALL, Blocks.CLAY);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.ICE_SLAB, Blocks.ICE);
		AquiferBlockStates.registerTransparentStairs(gen, SSWPBlocks.ICE_STAIRS, Blocks.ICE);
		AquiferBlockStates.registerTransparentWall(gen, SSWPBlocks.ICE_WALL, Blocks.ICE);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.PACKED_ICE_SLAB, Blocks.PACKED_ICE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.PACKED_ICE_STAIRS, Blocks.PACKED_ICE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.PACKED_ICE_WALL, Blocks.PACKED_ICE);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.BLUE_ICE_SLAB, Blocks.BLUE_ICE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.BLUE_ICE_STAIRS, Blocks.BLUE_ICE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.BLUE_ICE_WALL, Blocks.BLUE_ICE);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.SNOW_SLAB, Blocks.SNOW);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.SNOW_STAIRS, Blocks.SNOW);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.SNOW_WALL, Blocks.SNOW);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.MOSS_SLAB, Blocks.MOSS_BLOCK);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.MOSS_STAIRS, Blocks.MOSS_BLOCK);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.MOSS_WALL, Blocks.MOSS_BLOCK);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.CALCITE_SLAB, Blocks.CALCITE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.CALCITE_STAIRS, Blocks.CALCITE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.CALCITE_WALL, Blocks.CALCITE);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.DRIPSTONE_SLAB, Blocks.DRIPSTONE_BLOCK);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.DRIPSTONE_STAIRS, Blocks.DRIPSTONE_BLOCK);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.DRIPSTONE_WALL, Blocks.DRIPSTONE_BLOCK);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.MAGMA_SLAB, TextureMap.all(Identifier.ofVanilla("block/magma")), ModelIds.getBlockModelId(Blocks.MAGMA_BLOCK));
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.MAGMA_STAIRS, TextureMap.all(Identifier.ofVanilla("block/magma")));
		AquiferBlockStates.registerWall(gen, SSWPBlocks.MAGMA_WALL, TextureMap.all(Identifier.ofVanilla("block/magma")));
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.OBSIDIAN_SLAB, Blocks.OBSIDIAN);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.OBSIDIAN_STAIRS, Blocks.OBSIDIAN);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.OBSIDIAN_WALL, Blocks.OBSIDIAN);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.CRYING_OBSIDIAN_SLAB, Blocks.CRYING_OBSIDIAN);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.CRYING_OBSIDIAN_STAIRS, Blocks.CRYING_OBSIDIAN);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.CRYING_OBSIDIAN_WALL, Blocks.CRYING_OBSIDIAN);
		
		registerNyliumSlab(gen, SSWPBlocks.CRIMSON_NYLIUM_SLAB, Blocks.CRIMSON_NYLIUM);
		registerNyliumStairs(gen, SSWPBlocks.CRIMSON_NYLIUM_STAIRS, Blocks.CRIMSON_NYLIUM);
		registerNyliumWall(gen, SSWPBlocks.CRIMSON_NYLIUM_WALL, Blocks.CRIMSON_NYLIUM);
		registerNyliumSlab(gen, SSWPBlocks.WARPED_NYLIUM_SLAB, Blocks.WARPED_NYLIUM);
		registerNyliumStairs(gen, SSWPBlocks.WARPED_NYLIUM_STAIRS, Blocks.WARPED_NYLIUM);
		registerNyliumWall(gen, SSWPBlocks.WARPED_NYLIUM_WALL, Blocks.WARPED_NYLIUM);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.SOUL_SAND_SLAB, Blocks.SOUL_SAND);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.SOUL_SAND_STAIRS, Blocks.SOUL_SAND);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.SOUL_SAND_WALL, Blocks.SOUL_SAND);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.SOUL_SOIL_SLAB, Blocks.SOUL_SOIL);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.SOUL_SOIL_STAIRS, Blocks.SOUL_SOIL);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.SOUL_SOIL_WALL, Blocks.SOUL_SOIL);
		
		AquiferBlockStates.registerOrientableSlab(gen, SSWPBlocks.BONE_SLAB, TextureMap.sideEnd(Blocks.BONE_BLOCK).put(TextureKey.INSIDE, Identifier.of(SSWPlus.MOD_ID, TextureMap.getSubId(Blocks.BONE_BLOCK, "_inside").getPath())), ModelIds.getBlockModelId(Blocks.BONE_BLOCK), true);
		AquiferBlockStates.registerOrientableStairs(gen, SSWPBlocks.BONE_STAIRS, TextureMap.sideEnd(Blocks.BONE_BLOCK).put(TextureKey.INSIDE, Identifier.of(SSWPlus.MOD_ID, TextureMap.getSubId(Blocks.BONE_BLOCK, "_inside").getPath())), true);
		AquiferBlockStates.registerWallColumn(gen, SSWPBlocks.BONE_WALL, TextureMap.sideEnd(Blocks.BONE_BLOCK));
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.COAL_ORE_SLAB, Blocks.COAL_ORE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.COAL_ORE_STAIRS, Blocks.COAL_ORE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.COAL_ORE_WALL, Blocks.COAL_ORE);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.DEEPSLATE_COAL_ORE_SLAB, Blocks.DEEPSLATE_COAL_ORE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.DEEPSLATE_COAL_ORE_STAIRS, Blocks.DEEPSLATE_COAL_ORE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.DEEPSLATE_COAL_ORE_WALL, Blocks.DEEPSLATE_COAL_ORE);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.IRON_ORE_SLAB, Blocks.IRON_ORE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.IRON_ORE_STAIRS, Blocks.IRON_ORE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.IRON_ORE_WALL, Blocks.IRON_ORE);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.DEEPSLATE_IRON_ORE_SLAB, Blocks.DEEPSLATE_IRON_ORE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.DEEPSLATE_IRON_ORE_STAIRS, Blocks.DEEPSLATE_IRON_ORE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.DEEPSLATE_IRON_ORE_WALL, Blocks.DEEPSLATE_IRON_ORE);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.COPPER_ORE_SLAB, Blocks.COPPER_ORE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.COPPER_ORE_STAIRS, Blocks.COPPER_ORE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.COPPER_ORE_WALL, Blocks.COPPER_ORE);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.DEEPSLATE_COPPER_ORE_SLAB, Blocks.DEEPSLATE_COPPER_ORE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.DEEPSLATE_COPPER_ORE_STAIRS, Blocks.DEEPSLATE_COPPER_ORE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.DEEPSLATE_COPPER_ORE_WALL, Blocks.DEEPSLATE_COPPER_ORE);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.GOLD_ORE_SLAB, Blocks.GOLD_ORE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.GOLD_ORE_STAIRS, Blocks.GOLD_ORE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.GOLD_ORE_WALL, Blocks.GOLD_ORE);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.DEEPSLATE_GOLD_ORE_SLAB, Blocks.DEEPSLATE_GOLD_ORE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.DEEPSLATE_GOLD_ORE_STAIRS, Blocks.DEEPSLATE_GOLD_ORE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.DEEPSLATE_GOLD_ORE_WALL, Blocks.DEEPSLATE_GOLD_ORE);
		
		AquiferBlockStates.registerBoolPropertySlab(gen, SSWPBlocks.REDSTONE_ORE_SLAB, RedstoneOreSlabBlock.LIT, Blocks.REDSTONE_ORE);
		AquiferBlockStates.registerBoolPropertyStairs(gen, SSWPBlocks.REDSTONE_ORE_STAIRS, RedstoneOreStairsBlock.LIT, Blocks.REDSTONE_ORE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.REDSTONE_ORE_WALL, Blocks.REDSTONE_ORE);
		AquiferBlockStates.registerBoolPropertySlab(gen, SSWPBlocks.DEEPSLATE_REDSTONE_ORE_SLAB, RedstoneOreSlabBlock.LIT, Blocks.DEEPSLATE_REDSTONE_ORE);
		AquiferBlockStates.registerBoolPropertyStairs(gen, SSWPBlocks.DEEPSLATE_REDSTONE_ORE_STAIRS, RedstoneOreStairsBlock.LIT, Blocks.DEEPSLATE_REDSTONE_ORE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.DEEPSLATE_REDSTONE_ORE_WALL, Blocks.DEEPSLATE_REDSTONE_ORE);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.EMERALD_ORE_SLAB, Blocks.EMERALD_ORE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.EMERALD_ORE_STAIRS, Blocks.EMERALD_ORE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.EMERALD_ORE_WALL, Blocks.EMERALD_ORE);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.DEEPSLATE_EMERALD_ORE_SLAB, Blocks.DEEPSLATE_EMERALD_ORE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.DEEPSLATE_EMERALD_ORE_STAIRS, Blocks.DEEPSLATE_EMERALD_ORE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.DEEPSLATE_EMERALD_ORE_WALL, Blocks.DEEPSLATE_EMERALD_ORE);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.LAPIS_ORE_SLAB, Blocks.LAPIS_ORE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.LAPIS_ORE_STAIRS, Blocks.LAPIS_ORE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.LAPIS_ORE_WALL, Blocks.LAPIS_ORE);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.DEEPSLATE_LAPIS_ORE_SLAB, Blocks.DEEPSLATE_LAPIS_ORE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.DEEPSLATE_LAPIS_ORE_STAIRS, Blocks.DEEPSLATE_LAPIS_ORE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.DEEPSLATE_LAPIS_ORE_WALL, Blocks.DEEPSLATE_LAPIS_ORE);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.DIAMOND_ORE_SLAB, Blocks.DIAMOND_ORE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.DIAMOND_ORE_STAIRS, Blocks.DIAMOND_ORE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.DIAMOND_ORE_WALL, Blocks.DIAMOND_ORE);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.DEEPSLATE_DIAMOND_ORE_SLAB, Blocks.DEEPSLATE_DIAMOND_ORE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.DEEPSLATE_DIAMOND_ORE_STAIRS, Blocks.DEEPSLATE_DIAMOND_ORE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.DEEPSLATE_DIAMOND_ORE_WALL, Blocks.DEEPSLATE_DIAMOND_ORE);

		AquiferBlockStates.registerSlab(gen, SSWPBlocks.NETHER_QUARTZ_ORE_SLAB, Blocks.NETHER_QUARTZ_ORE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.NETHER_QUARTZ_ORE_STAIRS, Blocks.NETHER_QUARTZ_ORE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.NETHER_QUARTZ_ORE_WALL, Blocks.NETHER_QUARTZ_ORE);

		AquiferBlockStates.registerSlab(gen, SSWPBlocks.NETHER_GOLD_ORE_SLAB, Blocks.NETHER_GOLD_ORE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.NETHER_GOLD_ORE_STAIRS, Blocks.NETHER_GOLD_ORE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.NETHER_GOLD_ORE_WALL, Blocks.NETHER_GOLD_ORE);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.ANCIENT_DEBRIS_SLAB, TextureMap.sideEnd(Blocks.ANCIENT_DEBRIS), ModelIds.getBlockModelId(Blocks.ANCIENT_DEBRIS));
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.ANCIENT_DEBRIS_STAIRS, TextureMap.sideEnd(Blocks.ANCIENT_DEBRIS));
		AquiferBlockStates.registerWallColumn(gen, SSWPBlocks.ANCIENT_DEBRIS_WALL, TextureMap.sideEnd(Blocks.ANCIENT_DEBRIS));
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.RAW_IRON_SLAB, Blocks.RAW_IRON_BLOCK);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.RAW_IRON_STAIRS, Blocks.RAW_IRON_BLOCK);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.RAW_IRON_WALL, Blocks.RAW_IRON_BLOCK);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.RAW_COPPER_SLAB, Blocks.RAW_COPPER_BLOCK);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.RAW_COPPER_STAIRS, Blocks.RAW_COPPER_BLOCK);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.RAW_COPPER_WALL, Blocks.RAW_COPPER_BLOCK);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.RAW_GOLD_SLAB, Blocks.RAW_GOLD_BLOCK);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.RAW_GOLD_STAIRS, Blocks.RAW_GOLD_BLOCK);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.RAW_GOLD_WALL, Blocks.RAW_GOLD_BLOCK);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.GLOWSTONE_SLAB, Blocks.GLOWSTONE);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.GLOWSTONE_STAIRS, Blocks.GLOWSTONE);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.GLOWSTONE_WALL, Blocks.GLOWSTONE);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.MANGROVE_ROOT_SLAB, TextureMap.sideEnd(Blocks.MANGROVE_ROOTS), ModelIds.getBlockModelId(Blocks.MANGROVE_ROOTS));
		AquiferBlockStates.registerTransparentStairs(gen, SSWPBlocks.MANGROVE_ROOT_STAIRS, TextureMap.sideEnd(Blocks.MANGROVE_ROOTS));
		AquiferBlockStates.registerTransparentWall(gen, SSWPBlocks.MANGROVE_ROOT_WALL, TextureMap.sideEnd(Blocks.MANGROVE_ROOTS));
		AquiferBlockStates.registerSingleton(gen, SSWPBlocks.MANGROVE_ROOT_CARPET, AquiferModels.TEMPLATE_CARPET.upload(SSWPBlocks.MANGROVE_ROOT_CARPET, TextureMap.sideEnd(Blocks.MANGROVE_ROOTS), gen.modelCollector));
		AquiferBlockStates.registerOrientableSlab(gen, SSWPBlocks.MUDDY_MANGROVE_ROOT_SLAB, Blocks.MUDDY_MANGROVE_ROOTS, TextureMap::sideEnd);
		AquiferBlockStates.registerOrientableStairs(gen, SSWPBlocks.MUDDY_MANGROVE_ROOT_STAIRS, TextureMap.sideEnd(Blocks.MUDDY_MANGROVE_ROOTS));
		AquiferBlockStates.registerWallColumn(gen, SSWPBlocks.MUDDY_MANGROVE_ROOT_WALL, TextureMap.sideEnd(Blocks.MUDDY_MANGROVE_ROOTS));
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.MUSHROOM_STEM_SLAB, Blocks.MUSHROOM_STEM);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.MUSHROOM_STEM_STAIRS, Blocks.MUSHROOM_STEM);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.MUSHROOM_STEM_WALL, Blocks.MUSHROOM_STEM);
		
		AquiferBlockStates.registerLeavesSlab(gen, SSWPBlocks.OAK_LEAF_SLAB, Blocks.OAK_LEAVES);
		AquiferBlockStates.registerLeavesStairs(gen, SSWPBlocks.OAK_LEAF_STAIRS, Blocks.OAK_LEAVES);
		AquiferBlockStates.registerLeavesWall(gen, SSWPBlocks.OAK_LEAF_WALL, Blocks.OAK_LEAVES);
		AquiferBlockStates.registerLeavesCarpet(gen, SSWPBlocks.OAK_LEAF_CARPET, Blocks.OAK_LEAVES);
		AquiferBlockStates.registerLeavesSlab(gen, SSWPBlocks.SPRUCE_LEAF_SLAB, Blocks.SPRUCE_LEAVES);
		AquiferBlockStates.registerLeavesStairs(gen, SSWPBlocks.SPRUCE_LEAF_STAIRS, Blocks.SPRUCE_LEAVES);
		AquiferBlockStates.registerLeavesWall(gen, SSWPBlocks.SPRUCE_LEAF_WALL, Blocks.SPRUCE_LEAVES);
		AquiferBlockStates.registerLeavesCarpet(gen, SSWPBlocks.SPRUCE_LEAF_CARPET, Blocks.SPRUCE_LEAVES);
		AquiferBlockStates.registerLeavesSlab(gen, SSWPBlocks.BIRCH_LEAF_SLAB, Blocks.BIRCH_LEAVES);
		AquiferBlockStates.registerLeavesStairs(gen, SSWPBlocks.BIRCH_LEAF_STAIRS, Blocks.BIRCH_LEAVES);
		AquiferBlockStates.registerLeavesWall(gen, SSWPBlocks.BIRCH_LEAF_WALL, Blocks.BIRCH_LEAVES);
		AquiferBlockStates.registerLeavesCarpet(gen, SSWPBlocks.BIRCH_LEAF_CARPET, Blocks.BIRCH_LEAVES);
		AquiferBlockStates.registerLeavesSlab(gen, SSWPBlocks.JUNGLE_LEAF_SLAB, Blocks.JUNGLE_LEAVES);
		AquiferBlockStates.registerLeavesStairs(gen, SSWPBlocks.JUNGLE_LEAF_STAIRS, Blocks.JUNGLE_LEAVES);
		AquiferBlockStates.registerLeavesWall(gen, SSWPBlocks.JUNGLE_LEAF_WALL, Blocks.JUNGLE_LEAVES);
		AquiferBlockStates.registerLeavesCarpet(gen, SSWPBlocks.JUNGLE_LEAF_CARPET, Blocks.JUNGLE_LEAVES);
		AquiferBlockStates.registerLeavesSlab(gen, SSWPBlocks.ACACIA_LEAF_SLAB, Blocks.ACACIA_LEAVES);
		AquiferBlockStates.registerLeavesStairs(gen, SSWPBlocks.ACACIA_LEAF_STAIRS, Blocks.ACACIA_LEAVES);
		AquiferBlockStates.registerLeavesWall(gen, SSWPBlocks.ACACIA_LEAF_WALL, Blocks.ACACIA_LEAVES);
		AquiferBlockStates.registerLeavesCarpet(gen, SSWPBlocks.ACACIA_LEAF_CARPET, Blocks.ACACIA_LEAVES);
		AquiferBlockStates.registerLeavesSlab(gen, SSWPBlocks.DARK_OAK_LEAF_SLAB, Blocks.DARK_OAK_LEAVES);
		AquiferBlockStates.registerLeavesStairs(gen, SSWPBlocks.DARK_OAK_LEAF_STAIRS, Blocks.DARK_OAK_LEAVES);
		AquiferBlockStates.registerLeavesWall(gen, SSWPBlocks.DARK_OAK_LEAF_WALL, Blocks.DARK_OAK_LEAVES);
		AquiferBlockStates.registerLeavesCarpet(gen, SSWPBlocks.DARK_OAK_LEAF_CARPET, Blocks.DARK_OAK_LEAVES);
		AquiferBlockStates.registerLeavesSlab(gen, SSWPBlocks.MANGROVE_LEAF_SLAB, Blocks.MANGROVE_LEAVES);
		AquiferBlockStates.registerLeavesStairs(gen, SSWPBlocks.MANGROVE_LEAF_STAIRS, Blocks.MANGROVE_LEAVES);
		AquiferBlockStates.registerLeavesWall(gen, SSWPBlocks.MANGROVE_LEAF_WALL, Blocks.MANGROVE_LEAVES);
		AquiferBlockStates.registerLeavesCarpet(gen, SSWPBlocks.MANGROVE_LEAF_CARPET, Blocks.MANGROVE_LEAVES);
		AquiferBlockStates.registerLeavesSlab(gen, SSWPBlocks.CHERRY_LEAF_SLAB, Blocks.CHERRY_LEAVES);
		AquiferBlockStates.registerLeavesStairs(gen, SSWPBlocks.CHERRY_LEAF_STAIRS, Blocks.CHERRY_LEAVES);
		AquiferBlockStates.registerLeavesWall(gen, SSWPBlocks.CHERRY_LEAF_WALL, Blocks.CHERRY_LEAVES);
		AquiferBlockStates.registerLeavesCarpet(gen, SSWPBlocks.CHERRY_LEAF_CARPET, Blocks.CHERRY_LEAVES);
		AquiferBlockStates.registerLeavesSlab(gen, SSWPBlocks.AZALEA_LEAF_SLAB, Blocks.AZALEA_LEAVES);
		AquiferBlockStates.registerLeavesStairs(gen, SSWPBlocks.AZALEA_LEAF_STAIRS, Blocks.AZALEA_LEAVES);
		AquiferBlockStates.registerLeavesWall(gen, SSWPBlocks.AZALEA_LEAF_WALL, Blocks.AZALEA_LEAVES);
		AquiferBlockStates.registerLeavesCarpet(gen, SSWPBlocks.AZALEA_LEAF_CARPET, Blocks.AZALEA_LEAVES);
		AquiferBlockStates.registerLeavesSlab(gen, SSWPBlocks.FLOWERING_AZALEA_LEAF_SLAB, Blocks.FLOWERING_AZALEA_LEAVES);
		AquiferBlockStates.registerLeavesStairs(gen, SSWPBlocks.FLOWERING_AZALEA_LEAF_STAIRS, Blocks.FLOWERING_AZALEA_LEAVES);
		AquiferBlockStates.registerLeavesWall(gen, SSWPBlocks.FLOWERING_AZALEA_LEAF_WALL, Blocks.FLOWERING_AZALEA_LEAVES);
		AquiferBlockStates.registerLeavesCarpet(gen, SSWPBlocks.FLOWERING_AZALEA_LEAF_CARPET, Blocks.FLOWERING_AZALEA_LEAVES);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.BROWN_MUSHROOM_SLAB, TextureMap.all(Blocks.BROWN_MUSHROOM_BLOCK), ModelIds.getBlockSubModelId(Blocks.BROWN_MUSHROOM_BLOCK, "_inventory"));
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.BROWN_MUSHROOM_STAIRS, Blocks.BROWN_MUSHROOM_BLOCK);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.BROWN_MUSHROOM_WALL, Blocks.BROWN_MUSHROOM_BLOCK);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.RED_MUSHROOM_SLAB, TextureMap.all(Blocks.RED_MUSHROOM_BLOCK), ModelIds.getBlockSubModelId(Blocks.RED_MUSHROOM_BLOCK, "_inventory"));
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.RED_MUSHROOM_STAIRS, Blocks.RED_MUSHROOM_BLOCK);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.RED_MUSHROOM_WALL, Blocks.RED_MUSHROOM_BLOCK);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.NETHER_WART_SLAB, Blocks.NETHER_WART_BLOCK);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.NETHER_WART_STAIRS, Blocks.NETHER_WART_BLOCK);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.NETHER_WART_WALL, Blocks.NETHER_WART_BLOCK);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.WARPED_WART_SLAB, Blocks.WARPED_WART_BLOCK);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.WARPED_WART_STAIRS, Blocks.WARPED_WART_BLOCK);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.WARPED_WART_WALL, Blocks.WARPED_WART_BLOCK);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.SHROOMLIGHT_SLAB, Blocks.SHROOMLIGHT);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.SHROOMLIGHT_STAIRS, Blocks.SHROOMLIGHT);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.SHROOMLIGHT_WALL, Blocks.SHROOMLIGHT);
		
		registerDriedKelpSlab(gen);
		registerDriedKelpStairs(gen);
		registerDriedKelpWall(gen);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.TUBE_CORAL_SLAB, Blocks.TUBE_CORAL_BLOCK);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.TUBE_CORAL_STAIRS, Blocks.TUBE_CORAL_BLOCK);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.TUBE_CORAL_WALL, Blocks.TUBE_CORAL_BLOCK);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.BRAIN_CORAL_SLAB, Blocks.BRAIN_CORAL_BLOCK);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.BRAIN_CORAL_STAIRS, Blocks.BRAIN_CORAL_BLOCK);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.BRAIN_CORAL_WALL, Blocks.BRAIN_CORAL_BLOCK);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.BUBBLE_CORAL_SLAB, Blocks.BUBBLE_CORAL_BLOCK);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.BUBBLE_CORAL_STAIRS, Blocks.BUBBLE_CORAL_BLOCK);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.BUBBLE_CORAL_WALL, Blocks.BUBBLE_CORAL_BLOCK);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.FIRE_CORAL_SLAB, Blocks.FIRE_CORAL_BLOCK);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.FIRE_CORAL_STAIRS, Blocks.FIRE_CORAL_BLOCK);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.FIRE_CORAL_WALL, Blocks.FIRE_CORAL_BLOCK);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.HORN_CORAL_SLAB, Blocks.HORN_CORAL_BLOCK);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.HORN_CORAL_STAIRS, Blocks.HORN_CORAL_BLOCK);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.HORN_CORAL_WALL, Blocks.HORN_CORAL_BLOCK);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.DEAD_TUBE_CORAL_SLAB, Blocks.DEAD_TUBE_CORAL_BLOCK);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.DEAD_TUBE_CORAL_STAIRS, Blocks.DEAD_TUBE_CORAL_BLOCK);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.DEAD_TUBE_CORAL_WALL, Blocks.DEAD_TUBE_CORAL_BLOCK);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.DEAD_BRAIN_CORAL_SLAB, Blocks.DEAD_BRAIN_CORAL_BLOCK);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.DEAD_BRAIN_CORAL_STAIRS, Blocks.DEAD_BRAIN_CORAL_BLOCK);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.DEAD_BRAIN_CORAL_WALL, Blocks.DEAD_BRAIN_CORAL_BLOCK);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.DEAD_BUBBLE_CORAL_SLAB, Blocks.DEAD_BUBBLE_CORAL_BLOCK);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.DEAD_BUBBLE_CORAL_STAIRS, Blocks.DEAD_BUBBLE_CORAL_BLOCK);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.DEAD_BUBBLE_CORAL_WALL, Blocks.DEAD_BUBBLE_CORAL_BLOCK);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.DEAD_FIRE_CORAL_SLAB, Blocks.DEAD_FIRE_CORAL_BLOCK);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.DEAD_FIRE_CORAL_STAIRS, Blocks.DEAD_FIRE_CORAL_BLOCK);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.DEAD_FIRE_CORAL_WALL, Blocks.DEAD_FIRE_CORAL_BLOCK);
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.DEAD_HORN_CORAL_SLAB, Blocks.DEAD_HORN_CORAL_BLOCK);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.DEAD_HORN_CORAL_STAIRS, Blocks.DEAD_HORN_CORAL_BLOCK);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.DEAD_HORN_CORAL_WALL, Blocks.DEAD_HORN_CORAL_BLOCK);
		
		AquiferBlockStates.registerOrientableSlab(gen, SSWPBlocks.HAY_SLAB, Blocks.HAY_BLOCK, TextureMap::sideEnd);
		AquiferBlockStates.registerOrientableStairs(gen, SSWPBlocks.HAY_STAIRS, Blocks.HAY_BLOCK, TextureMap::sideEnd);
		AquiferBlockStates.registerWallColumn(gen, SSWPBlocks.HAY_WALL, TextureMap.sideEnd(Blocks.HAY_BLOCK));
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.HONEYCOMB_SLAB, Blocks.HONEYCOMB_BLOCK);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.HONEYCOMB_STAIRS, Blocks.HONEYCOMB_BLOCK);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.HONEYCOMB_WALL, Blocks.HONEYCOMB_BLOCK);
		
		AquiferBlockStates.registerOrientableSlab(gen, SSWPBlocks.OCHRE_FROGLIGHT_SLAB, Blocks.OCHRE_FROGLIGHT, TextureMap::sideEnd);
		AquiferBlockStates.registerOrientableStairs(gen, SSWPBlocks.OCHRE_FROGLIGHT_STAIRS, Blocks.OCHRE_FROGLIGHT, TextureMap::sideEnd);
		AquiferBlockStates.registerWallColumn(gen, SSWPBlocks.OCHRE_FROGLIGHT_WALL, TextureMap.sideEnd(Blocks.OCHRE_FROGLIGHT));
		AquiferBlockStates.registerOrientableSlab(gen, SSWPBlocks.VERDANT_FROGLIGHT_SLAB, Blocks.VERDANT_FROGLIGHT, TextureMap::sideEnd);
		AquiferBlockStates.registerOrientableStairs(gen, SSWPBlocks.VERDANT_FROGLIGHT_STAIRS, Blocks.VERDANT_FROGLIGHT, TextureMap::sideEnd);
		AquiferBlockStates.registerWallColumn(gen, SSWPBlocks.VERDANT_FROGLIGHT_WALL, TextureMap.sideEnd(Blocks.VERDANT_FROGLIGHT));
		AquiferBlockStates.registerOrientableSlab(gen, SSWPBlocks.PEARLESCENT_FROGLIGHT_SLAB, Blocks.PEARLESCENT_FROGLIGHT, TextureMap::sideEnd);
		AquiferBlockStates.registerOrientableStairs(gen, SSWPBlocks.PEARLESCENT_FROGLIGHT_STAIRS, Blocks.PEARLESCENT_FROGLIGHT, TextureMap::sideEnd);
		AquiferBlockStates.registerWallColumn(gen, SSWPBlocks.PEARLESCENT_FROGLIGHT_WALL, TextureMap.sideEnd(Blocks.PEARLESCENT_FROGLIGHT));
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.SCULK_SLAB, Blocks.SCULK);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.SCULK_STAIRS, Blocks.SCULK);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.SCULK_WALL, Blocks.SCULK);
		
		AquiferBlockStates.registerSlab(gen, SSWPBlocks.BEDROCK_SLAB, Blocks.BEDROCK);
		AquiferBlockStates.registerStairs(gen, SSWPBlocks.BEDROCK_STAIRS, Blocks.BEDROCK);
		AquiferBlockStates.registerWall(gen, SSWPBlocks.BEDROCK_WALL, Blocks.BEDROCK);
		
		AquiferBlockStates.registerBoolPropertySlab(gen, SSWPBlocks.REDSTONE_LAMP_SLAB, RedstoneLampSlabBlock.LIT, Blocks.REDSTONE_LAMP, "_on");
		AquiferBlockStates.registerBoolPropertyStairs(gen, SSWPBlocks.REDSTONE_LAMP_STAIRS, RedstoneLampStairsBlock.LIT, Blocks.REDSTONE_LAMP, "_on");
		AquiferBlockStates.registerBoolPropertyWall(gen, SSWPBlocks.REDSTONE_LAMP_WALL, RedstoneLampWallBlock.LIT, Blocks.REDSTONE_LAMP, "_on");
		
		gen.registerParented(Blocks.MOSSY_COBBLESTONE, SSWPBlocks.INFESTED_MOSSY_COBBLESTONE);
		gen.registerParented(Blocks.SMOOTH_STONE, SSWPBlocks.INFESTED_SMOOTH_STONE);
		gen.registerParented(Blocks.GRANITE, SSWPBlocks.INFESTED_GRANITE);
		gen.registerParented(Blocks.POLISHED_GRANITE, SSWPBlocks.INFESTED_POLISHED_GRANITE);
		gen.registerParented(Blocks.DIORITE, SSWPBlocks.INFESTED_DIORITE);
		gen.registerParented(Blocks.POLISHED_DIORITE, SSWPBlocks.INFESTED_POLISHED_DIORITE);
		gen.registerParented(Blocks.ANDESITE, SSWPBlocks.INFESTED_ANDESITE);
		gen.registerParented(Blocks.POLISHED_ANDESITE, SSWPBlocks.INFESTED_POLISHED_ANDESITE);
		gen.registerParented(Blocks.COBBLED_DEEPSLATE, SSWPBlocks.INFESTED_COBBLED_DEEPSLATE);
		gen.registerParented(Blocks.CHISELED_DEEPSLATE, SSWPBlocks.INFESTED_CHISELED_DEEPSLATE);
		gen.registerParented(Blocks.POLISHED_DEEPSLATE, SSWPBlocks.INFESTED_POLISHED_DEEPSLATE);
		gen.registerParented(Blocks.DEEPSLATE_BRICKS, SSWPBlocks.INFESTED_DEEPSLATE_BRICKS);
		gen.registerParented(Blocks.CRACKED_DEEPSLATE_BRICKS, SSWPBlocks.INFESTED_CRACKED_DEEPSLATE_BRICKS);
		gen.registerParented(Blocks.DEEPSLATE_TILES, SSWPBlocks.INFESTED_DEEPSLATE_TILES);
		gen.registerParented(Blocks.CRACKED_DEEPSLATE_TILES, SSWPBlocks.INFESTED_CRACKED_DEEPSLATE_TILES);
		gen.registerParented(Blocks.TUFF, SSWPBlocks.INFESTED_TUFF);
		gen.registerParented(Blocks.CHISELED_TUFF, SSWPBlocks.INFESTED_CHISELED_TUFF);
		gen.registerParented(Blocks.POLISHED_TUFF, SSWPBlocks.INFESTED_POLISHED_TUFF);
		gen.registerParented(Blocks.TUFF_BRICKS, SSWPBlocks.INFESTED_TUFF_BRICKS);
		gen.registerParented(Blocks.CHISELED_TUFF_BRICKS, SSWPBlocks.INFESTED_CHISELED_TUFF_BRICKS);
		gen.registerParented(Blocks.CALCITE, SSWPBlocks.INFESTED_CALCITE);
		gen.registerParented(Blocks.DRIPSTONE_BLOCK, SSWPBlocks.INFESTED_DRIPSTONE_BLOCK);
		
		AquiferBlockStates.registerOakLadder(gen, SSWPBlocks.OAK_LADDER);
		AquiferBlockStates.registerLadder(gen, SSWPBlocks.SPRUCE_LADDER);
		AquiferBlockStates.registerLadder(gen, SSWPBlocks.BIRCH_LADDER);
		AquiferBlockStates.registerLadder(gen, SSWPBlocks.JUNGLE_LADDER);
		AquiferBlockStates.registerLadder(gen, SSWPBlocks.ACACIA_LADDER);
		AquiferBlockStates.registerLadder(gen, SSWPBlocks.DARK_OAK_LADDER);
		AquiferBlockStates.registerLadder(gen, SSWPBlocks.MANGROVE_LADDER);
		AquiferBlockStates.registerLadder(gen, SSWPBlocks.CHERRY_LADDER);
		AquiferBlockStates.registerLadder(gen, SSWPBlocks.BAMBOO_LADDER);
		AquiferBlockStates.registerLadder(gen, SSWPBlocks.CRIMSON_LADDER);
		AquiferBlockStates.registerLadder(gen, SSWPBlocks.WARPED_LADDER);
		
		AquiferBlockStates.registerLadder(gen, SSWPBlocks.IRON_LADDER);
		
		AquiferBlockStates.registerLadder(gen, SSWPBlocks.GOLD_LADDER);
		
		AquiferBlockStates.registerLadder(gen, SSWPBlocks.NETHERITE_LADDER);
		
		AquiferBlockStates.registerLadder(gen, SSWPBlocks.COPPER_LADDER);
		AquiferBlockStates.registerLadder(gen, SSWPBlocks.EXPOSED_COPPER_LADDER);
		AquiferBlockStates.registerLadder(gen, SSWPBlocks.WEATHERED_COPPER_LADDER);
		AquiferBlockStates.registerLadder(gen, SSWPBlocks.OXIDIZED_COPPER_LADDER);
		AquiferBlockStates.registerParentedLadder(gen, SSWPBlocks.COPPER_LADDER, SSWPBlocks.WAXED_COPPER_LADDER);
		AquiferBlockStates.registerParentedLadder(gen, SSWPBlocks.EXPOSED_COPPER_LADDER, SSWPBlocks.WAXED_EXPOSED_COPPER_LADDER);
		AquiferBlockStates.registerParentedLadder(gen, SSWPBlocks.WEATHERED_COPPER_LADDER, SSWPBlocks.WAXED_WEATHERED_COPPER_LADDER);
		AquiferBlockStates.registerParentedLadder(gen, SSWPBlocks.OXIDIZED_COPPER_LADDER, SSWPBlocks.WAXED_OXIDIZED_COPPER_LADDER);
		
		AquiferBlockStates.registerSigns(gen, SSWPBlocks.IRON_SIGN, SSWPBlocks.IRON_WALL_SIGN, Blocks.IRON_BLOCK);
		AquiferBlockStates.registerSigns(gen, SSWPBlocks.IRON_HANGING_SIGN, SSWPBlocks.IRON_WALL_HANGING_SIGN, Blocks.IRON_BLOCK);
		
		AquiferBlockStates.registerSigns(gen, SSWPBlocks.GOLD_SIGN, SSWPBlocks.GOLD_WALL_SIGN, Blocks.GOLD_BLOCK);
		AquiferBlockStates.registerSigns(gen, SSWPBlocks.GOLD_HANGING_SIGN, SSWPBlocks.GOLD_WALL_HANGING_SIGN, Blocks.GOLD_BLOCK);
		
		AquiferBlockStates.registerSigns(gen, SSWPBlocks.NETHERITE_SIGN, SSWPBlocks.NETHERITE_WALL_SIGN, Blocks.NETHERITE_BLOCK);
		AquiferBlockStates.registerSigns(gen, SSWPBlocks.NETHERITE_HANGING_SIGN, SSWPBlocks.NETHERITE_WALL_HANGING_SIGN, Blocks.NETHERITE_BLOCK);
		
		AquiferBlockStates.registerSigns(gen, SSWPBlocks.COPPER_SIGN, SSWPBlocks.COPPER_WALL_SIGN, Blocks.COPPER_BLOCK);
		AquiferBlockStates.registerSigns(gen, SSWPBlocks.COPPER_HANGING_SIGN, SSWPBlocks.COPPER_WALL_HANGING_SIGN, Blocks.COPPER_BLOCK);
		AquiferBlockStates.registerSigns(gen, SSWPBlocks.EXPOSED_COPPER_SIGN, SSWPBlocks.EXPOSED_COPPER_WALL_SIGN, Blocks.EXPOSED_COPPER);
		AquiferBlockStates.registerSigns(gen, SSWPBlocks.EXPOSED_COPPER_HANGING_SIGN, SSWPBlocks.EXPOSED_COPPER_WALL_HANGING_SIGN, Blocks.EXPOSED_COPPER);
		AquiferBlockStates.registerSigns(gen, SSWPBlocks.WEATHERED_COPPER_SIGN, SSWPBlocks.WEATHERED_COPPER_WALL_SIGN, Blocks.WEATHERED_COPPER);
		AquiferBlockStates.registerSigns(gen, SSWPBlocks.WEATHERED_COPPER_HANGING_SIGN, SSWPBlocks.WEATHERED_COPPER_WALL_HANGING_SIGN, Blocks.WEATHERED_COPPER);
		AquiferBlockStates.registerSigns(gen, SSWPBlocks.OXIDIZED_COPPER_SIGN, SSWPBlocks.OXIDIZED_COPPER_WALL_SIGN, Blocks.OXIDIZED_COPPER);
		AquiferBlockStates.registerSigns(gen, SSWPBlocks.OXIDIZED_COPPER_HANGING_SIGN, SSWPBlocks.OXIDIZED_COPPER_WALL_HANGING_SIGN, Blocks.OXIDIZED_COPPER);
		AquiferBlockStates.registerParentedSign(gen, SSWPBlocks.COPPER_SIGN, SSWPBlocks.WAXED_COPPER_SIGN, SSWPBlocks.WAXED_COPPER_WALL_SIGN);
		AquiferBlockStates.registerParentedSign(gen, SSWPBlocks.COPPER_HANGING_SIGN, SSWPBlocks.WAXED_COPPER_HANGING_SIGN, SSWPBlocks.WAXED_COPPER_WALL_HANGING_SIGN);
		AquiferBlockStates.registerParentedSign(gen, SSWPBlocks.EXPOSED_COPPER_SIGN, SSWPBlocks.WAXED_EXPOSED_COPPER_SIGN, SSWPBlocks.WAXED_EXPOSED_COPPER_WALL_SIGN);
		AquiferBlockStates.registerParentedSign(gen, SSWPBlocks.EXPOSED_COPPER_HANGING_SIGN, SSWPBlocks.WAXED_EXPOSED_COPPER_HANGING_SIGN, SSWPBlocks.WAXED_EXPOSED_COPPER_WALL_HANGING_SIGN);
		AquiferBlockStates.registerParentedSign(gen, SSWPBlocks.WEATHERED_COPPER_SIGN, SSWPBlocks.WAXED_WEATHERED_COPPER_SIGN, SSWPBlocks.WAXED_WEATHERED_COPPER_WALL_SIGN);
		AquiferBlockStates.registerParentedSign(gen, SSWPBlocks.WEATHERED_COPPER_HANGING_SIGN, SSWPBlocks.WAXED_WEATHERED_COPPER_HANGING_SIGN, SSWPBlocks.WAXED_WEATHERED_COPPER_WALL_HANGING_SIGN);
		AquiferBlockStates.registerParentedSign(gen, SSWPBlocks.OXIDIZED_COPPER_SIGN, SSWPBlocks.WAXED_OXIDIZED_COPPER_SIGN, SSWPBlocks.WAXED_OXIDIZED_COPPER_WALL_SIGN);
		AquiferBlockStates.registerParentedSign(gen, SSWPBlocks.OXIDIZED_COPPER_HANGING_SIGN, SSWPBlocks.WAXED_OXIDIZED_COPPER_HANGING_SIGN, SSWPBlocks.WAXED_OXIDIZED_COPPER_WALL_HANGING_SIGN);
		
		AquiferBlockStates.registerOakBookshelf(gen, SSWPBlocks.OAK_BOOKSHELF);
		AquiferBlockStates.registerBookshelf(gen, SSWPBlocks.SPRUCE_BOOKSHELF, Blocks.SPRUCE_PLANKS);
		AquiferBlockStates.registerBookshelf(gen, SSWPBlocks.BIRCH_BOOKSHELF, Blocks.BIRCH_PLANKS);
		AquiferBlockStates.registerBookshelf(gen, SSWPBlocks.JUNGLE_BOOKSHELF, Blocks.JUNGLE_PLANKS);
		AquiferBlockStates.registerBookshelf(gen, SSWPBlocks.ACACIA_BOOKSHELF, Blocks.ACACIA_PLANKS);
		AquiferBlockStates.registerBookshelf(gen, SSWPBlocks.DARK_OAK_BOOKSHELF, Blocks.DARK_OAK_PLANKS);
		AquiferBlockStates.registerBookshelf(gen, SSWPBlocks.MANGROVE_BOOKSHELF, Blocks.MANGROVE_PLANKS);
		AquiferBlockStates.registerBookshelf(gen, SSWPBlocks.CHERRY_BOOKSHELF, Blocks.CHERRY_PLANKS);
		AquiferBlockStates.registerBookshelf(gen, SSWPBlocks.BAMBOO_BOOKSHELF, Blocks.BAMBOO_PLANKS);
		AquiferBlockStates.registerBookshelf(gen, SSWPBlocks.CRIMSON_BOOKSHELF, Blocks.CRIMSON_PLANKS);
		AquiferBlockStates.registerBookshelf(gen, SSWPBlocks.WARPED_BOOKSHELF, Blocks.WARPED_PLANKS);
		
		AquiferBlockStates.registerOakCraftingTable(gen, SSWPBlocks.OAK_CRAFTING_TABLE);
		AquiferBlockStates.registerCraftingTable(gen, SSWPBlocks.SPRUCE_CRAFTING_TABLE, Blocks.SPRUCE_PLANKS);
		AquiferBlockStates.registerCraftingTable(gen, SSWPBlocks.BIRCH_CRAFTING_TABLE, Blocks.BIRCH_PLANKS);
		AquiferBlockStates.registerCraftingTable(gen, SSWPBlocks.JUNGLE_CRAFTING_TABLE, Blocks.JUNGLE_PLANKS);
		AquiferBlockStates.registerCraftingTable(gen, SSWPBlocks.ACACIA_CRAFTING_TABLE, Blocks.ACACIA_PLANKS);
		AquiferBlockStates.registerCraftingTable(gen, SSWPBlocks.DARK_OAK_CRAFTING_TABLE, Blocks.DARK_OAK_PLANKS);
		AquiferBlockStates.registerCraftingTable(gen, SSWPBlocks.MANGROVE_CRAFTING_TABLE, Blocks.MANGROVE_PLANKS);
		AquiferBlockStates.registerCraftingTable(gen, SSWPBlocks.CHERRY_CRAFTING_TABLE, Blocks.CHERRY_PLANKS);
		AquiferBlockStates.registerCraftingTable(gen, SSWPBlocks.BAMBOO_CRAFTING_TABLE, Blocks.BAMBOO_PLANKS);
		AquiferBlockStates.registerCraftingTable(gen, SSWPBlocks.CRIMSON_CRAFTING_TABLE, Blocks.CRIMSON_PLANKS);
		AquiferBlockStates.registerCraftingTable(gen, SSWPBlocks.WARPED_CRAFTING_TABLE, Blocks.WARPED_PLANKS);
		
		AquiferBlockStates.registerOakLoom(gen, SSWPBlocks.OAK_LOOM);
		AquiferBlockStates.registerLoom(gen, SSWPBlocks.SPRUCE_LOOM);
		AquiferBlockStates.registerLoom(gen, SSWPBlocks.BIRCH_LOOM);
		AquiferBlockStates.registerLoom(gen, SSWPBlocks.JUNGLE_LOOM);
		AquiferBlockStates.registerLoom(gen, SSWPBlocks.ACACIA_LOOM);
		AquiferBlockStates.registerLoom(gen, SSWPBlocks.DARK_OAK_LOOM);
		AquiferBlockStates.registerLoom(gen, SSWPBlocks.MANGROVE_LOOM);
		AquiferBlockStates.registerLoom(gen, SSWPBlocks.CHERRY_LOOM);
		AquiferBlockStates.registerLoom(gen, SSWPBlocks.BAMBOO_LOOM);
		AquiferBlockStates.registerLoom(gen, SSWPBlocks.CRIMSON_LOOM);
		AquiferBlockStates.registerLoom(gen, SSWPBlocks.WARPED_LOOM);
		
		AquiferBlockStates.registerCartographyTable(gen, SSWPBlocks.OAK_CARTOGRAPHY_TABLE, Blocks.OAK_PLANKS);
		AquiferBlockStates.registerCartographyTable(gen, SSWPBlocks.SPRUCE_CARTOGRAPHY_TABLE, Blocks.SPRUCE_PLANKS);
		AquiferBlockStates.registerCartographyTable(gen, SSWPBlocks.BIRCH_CARTOGRAPHY_TABLE, Blocks.BIRCH_PLANKS);
		AquiferBlockStates.registerCartographyTable(gen, SSWPBlocks.JUNGLE_CARTOGRAPHY_TABLE, Blocks.JUNGLE_PLANKS);
		AquiferBlockStates.registerCartographyTable(gen, SSWPBlocks.ACACIA_CARTOGRAPHY_TABLE, Blocks.ACACIA_PLANKS);
		AquiferBlockStates.registerDarkOakCartographyTable(gen, SSWPBlocks.DARK_OAK_CARTOGRAPHY_TABLE);
		AquiferBlockStates.registerCartographyTable(gen, SSWPBlocks.MANGROVE_CARTOGRAPHY_TABLE, Blocks.MANGROVE_PLANKS);
		AquiferBlockStates.registerCartographyTable(gen, SSWPBlocks.CHERRY_CARTOGRAPHY_TABLE, Blocks.CHERRY_PLANKS);
		AquiferBlockStates.registerCartographyTable(gen, SSWPBlocks.BAMBOO_CARTOGRAPHY_TABLE, Blocks.BAMBOO_PLANKS);
		AquiferBlockStates.registerCartographyTable(gen, SSWPBlocks.CRIMSON_CARTOGRAPHY_TABLE, Blocks.CRIMSON_PLANKS);
		AquiferBlockStates.registerCartographyTable(gen, SSWPBlocks.WARPED_CARTOGRAPHY_TABLE, Blocks.WARPED_PLANKS);
		
		AquiferBlockStates.registerFletchingTable(gen, SSWPBlocks.OAK_FLETCHING_TABLE, Blocks.OAK_PLANKS);
		AquiferBlockStates.registerFletchingTable(gen, SSWPBlocks.SPRUCE_FLETCHING_TABLE, Blocks.SPRUCE_PLANKS);
		AquiferBlockStates.registerBirchFletchingTable(gen, SSWPBlocks.BIRCH_FLETCHING_TABLE);
		AquiferBlockStates.registerFletchingTable(gen, SSWPBlocks.JUNGLE_FLETCHING_TABLE, Blocks.JUNGLE_PLANKS);
		AquiferBlockStates.registerFletchingTable(gen, SSWPBlocks.ACACIA_FLETCHING_TABLE, Blocks.ACACIA_PLANKS);
		AquiferBlockStates.registerFletchingTable(gen, SSWPBlocks.DARK_OAK_FLETCHING_TABLE, Blocks.DARK_OAK_PLANKS);
		AquiferBlockStates.registerFletchingTable(gen, SSWPBlocks.MANGROVE_FLETCHING_TABLE, Blocks.MANGROVE_PLANKS);
		AquiferBlockStates.registerFletchingTable(gen, SSWPBlocks.CHERRY_FLETCHING_TABLE, Blocks.CHERRY_PLANKS);
		AquiferBlockStates.registerFletchingTable(gen, SSWPBlocks.BAMBOO_FLETCHING_TABLE, Blocks.BAMBOO_PLANKS);
		AquiferBlockStates.registerFletchingTable(gen, SSWPBlocks.CRIMSON_FLETCHING_TABLE, Blocks.CRIMSON_PLANKS);
		AquiferBlockStates.registerFletchingTable(gen, SSWPBlocks.WARPED_FLETCHING_TABLE, Blocks.WARPED_PLANKS);
		
		AquiferBlockStates.registerSmithingTable(gen, SSWPBlocks.OAK_SMITHING_TABLE);
		AquiferBlockStates.registerSmithingTable(gen, SSWPBlocks.SPRUCE_SMITHING_TABLE);
		AquiferBlockStates.registerSmithingTable(gen, SSWPBlocks.BIRCH_SMITHING_TABLE);
		AquiferBlockStates.registerSmithingTable(gen, SSWPBlocks.JUNGLE_SMITHING_TABLE);
		AquiferBlockStates.registerSmithingTable(gen, SSWPBlocks.ACACIA_SMITHING_TABLE);
		AquiferBlockStates.registerSmithingTable(gen, SSWPBlocks.DARK_OAK_SMITHING_TABLE);
		AquiferBlockStates.registerSmithingTable(gen, SSWPBlocks.MANGROVE_SMITHING_TABLE);
		AquiferBlockStates.registerSmithingTable(gen, SSWPBlocks.CHERRY_SMITHING_TABLE);
		AquiferBlockStates.registerSmithingTable(gen, SSWPBlocks.BAMBOO_SMITHING_TABLE);
		AquiferBlockStates.registerSmithingTable(gen, SSWPBlocks.CRIMSON_SMITHING_TABLE);
		AquiferBlockStates.registerSmithingTable(gen, SSWPBlocks.WARPED_SMITHING_TABLE);
		
		AquiferBlockStates.registerComposter(gen, SSWPBlocks.OAK_COMPOSTER);
		AquiferBlockStates.registerComposter(gen, SSWPBlocks.SPRUCE_COMPOSTER);
		AquiferBlockStates.registerComposter(gen, SSWPBlocks.BIRCH_COMPOSTER);
		AquiferBlockStates.registerComposter(gen, SSWPBlocks.JUNGLE_COMPOSTER);
		AquiferBlockStates.registerComposter(gen, SSWPBlocks.ACACIA_COMPOSTER);
		AquiferBlockStates.registerComposter(gen, SSWPBlocks.DARK_OAK_COMPOSTER);
		AquiferBlockStates.registerComposter(gen, SSWPBlocks.MANGROVE_COMPOSTER);
		AquiferBlockStates.registerComposter(gen, SSWPBlocks.CHERRY_COMPOSTER);
		AquiferBlockStates.registerComposter(gen, SSWPBlocks.BAMBOO_COMPOSTER);
		AquiferBlockStates.registerComposter(gen, SSWPBlocks.CRIMSON_COMPOSTER);
		AquiferBlockStates.registerComposter(gen, SSWPBlocks.WARPED_COMPOSTER);
		
		AquiferBlockStates.registerOakLectern(gen, SSWPBlocks.OAK_LECTERN);
		AquiferBlockStates.registerLectern(gen, SSWPBlocks.SPRUCE_LECTERN, Blocks.SPRUCE_PLANKS);
		AquiferBlockStates.registerLectern(gen, SSWPBlocks.BIRCH_LECTERN, Blocks.BIRCH_PLANKS);
		AquiferBlockStates.registerLectern(gen, SSWPBlocks.JUNGLE_LECTERN, Blocks.JUNGLE_PLANKS);
		AquiferBlockStates.registerLectern(gen, SSWPBlocks.ACACIA_LECTERN, Blocks.ACACIA_PLANKS);
		AquiferBlockStates.registerLectern(gen, SSWPBlocks.DARK_OAK_LECTERN, Blocks.DARK_OAK_PLANKS);
		AquiferBlockStates.registerLectern(gen, SSWPBlocks.MANGROVE_LECTERN, Blocks.MANGROVE_PLANKS);
		AquiferBlockStates.registerLectern(gen, SSWPBlocks.CHERRY_LECTERN, Blocks.CHERRY_PLANKS);
		AquiferBlockStates.registerLectern(gen, SSWPBlocks.BAMBOO_LECTERN, Blocks.BAMBOO_PLANKS);
		AquiferBlockStates.registerLectern(gen, SSWPBlocks.CRIMSON_LECTERN, Blocks.CRIMSON_PLANKS);
		AquiferBlockStates.registerLectern(gen, SSWPBlocks.WARPED_LECTERN, Blocks.WARPED_PLANKS);
		
		AquiferBlockStates.registerBarrel(gen, SSWPBlocks.OAK_BARREL);
		AquiferBlockStates.registerSpruceBarrel(gen, SSWPBlocks.SPRUCE_BARREL);
		AquiferBlockStates.registerBarrel(gen, SSWPBlocks.BIRCH_BARREL);
		AquiferBlockStates.registerBarrel(gen, SSWPBlocks.JUNGLE_BARREL);
		AquiferBlockStates.registerBarrel(gen, SSWPBlocks.ACACIA_BARREL);
		AquiferBlockStates.registerBarrel(gen, SSWPBlocks.DARK_OAK_BARREL);
		AquiferBlockStates.registerBarrel(gen, SSWPBlocks.MANGROVE_BARREL);
		AquiferBlockStates.registerBarrel(gen, SSWPBlocks.CHERRY_BARREL);
		AquiferBlockStates.registerBarrel(gen, SSWPBlocks.BAMBOO_BARREL);
		AquiferBlockStates.registerBarrel(gen, SSWPBlocks.CRIMSON_BARREL);
		AquiferBlockStates.registerBarrel(gen, SSWPBlocks.WARPED_BARREL);
		
		AquiferBlockStates.registerOakTripwireHook(gen, SSWPBlocks.OAK_TRIPWIRE_HOOK);
		AquiferBlockStates.registerTripwireHook(gen, SSWPBlocks.SPRUCE_TRIPWIRE_HOOK, Blocks.SPRUCE_PLANKS);
		AquiferBlockStates.registerTripwireHook(gen, SSWPBlocks.BIRCH_TRIPWIRE_HOOK, Blocks.BIRCH_PLANKS);
		AquiferBlockStates.registerTripwireHook(gen, SSWPBlocks.JUNGLE_TRIPWIRE_HOOK, Blocks.JUNGLE_PLANKS);
		AquiferBlockStates.registerTripwireHook(gen, SSWPBlocks.ACACIA_TRIPWIRE_HOOK, Blocks.ACACIA_PLANKS);
		AquiferBlockStates.registerTripwireHook(gen, SSWPBlocks.DARK_OAK_TRIPWIRE_HOOK, Blocks.DARK_OAK_PLANKS);
		AquiferBlockStates.registerTripwireHook(gen, SSWPBlocks.MANGROVE_TRIPWIRE_HOOK, Blocks.MANGROVE_PLANKS);
		AquiferBlockStates.registerTripwireHook(gen, SSWPBlocks.CHERRY_TRIPWIRE_HOOK, Blocks.CHERRY_PLANKS);
		AquiferBlockStates.registerTripwireHook(gen, SSWPBlocks.BAMBOO_TRIPWIRE_HOOK, Blocks.BAMBOO_PLANKS);
		AquiferBlockStates.registerTripwireHook(gen, SSWPBlocks.CRIMSON_TRIPWIRE_HOOK, Blocks.CRIMSON_PLANKS);
		AquiferBlockStates.registerTripwireHook(gen, SSWPBlocks.WARPED_TRIPWIRE_HOOK, Blocks.WARPED_PLANKS);
		
		AquiferBlockStates.registerOakBeehive(gen, SSWPBlocks.OAK_BEEHIVE);
		AquiferBlockStates.registerBeehive(gen, SSWPBlocks.SPRUCE_BEEHIVE);
		AquiferBlockStates.registerBeehive(gen, SSWPBlocks.BIRCH_BEEHIVE);
		AquiferBlockStates.registerBeehive(gen, SSWPBlocks.JUNGLE_BEEHIVE);
		AquiferBlockStates.registerBeehive(gen, SSWPBlocks.ACACIA_BEEHIVE);
		AquiferBlockStates.registerBeehive(gen, SSWPBlocks.DARK_OAK_BEEHIVE);
		AquiferBlockStates.registerBeehive(gen, SSWPBlocks.MANGROVE_BEEHIVE);
		AquiferBlockStates.registerBeehive(gen, SSWPBlocks.CHERRY_BEEHIVE);
		AquiferBlockStates.registerBeehive(gen, SSWPBlocks.BAMBOO_BEEHIVE);
		AquiferBlockStates.registerBeehive(gen, SSWPBlocks.CRIMSON_BEEHIVE);
		AquiferBlockStates.registerBeehive(gen, SSWPBlocks.WARPED_BEEHIVE);
		
		AquiferBlockStates.registerOakChiseledBookshelf(gen, SSWPBlocks.OAK_CHISELED_BOOKSHELF);
		AquiferBlockStates.registerChiseledBookshelf(gen, SSWPBlocks.SPRUCE_CHISELED_BOOKSHELF);
		AquiferBlockStates.registerChiseledBookshelf(gen, SSWPBlocks.BIRCH_CHISELED_BOOKSHELF);
		AquiferBlockStates.registerChiseledBookshelf(gen, SSWPBlocks.JUNGLE_CHISELED_BOOKSHELF);
		AquiferBlockStates.registerChiseledBookshelf(gen, SSWPBlocks.ACACIA_CHISELED_BOOKSHELF);
		AquiferBlockStates.registerChiseledBookshelf(gen, SSWPBlocks.DARK_OAK_CHISELED_BOOKSHELF);
		AquiferBlockStates.registerChiseledBookshelf(gen, SSWPBlocks.MANGROVE_CHISELED_BOOKSHELF);
		AquiferBlockStates.registerChiseledBookshelf(gen, SSWPBlocks.CHERRY_CHISELED_BOOKSHELF);
		AquiferBlockStates.registerChiseledBookshelf(gen, SSWPBlocks.BAMBOO_CHISELED_BOOKSHELF);
		AquiferBlockStates.registerChiseledBookshelf(gen, SSWPBlocks.CRIMSON_CHISELED_BOOKSHELF);
		AquiferBlockStates.registerChiseledBookshelf(gen, SSWPBlocks.WARPED_CHISELED_BOOKSHELF);
		
		gen.registerSingleton(SSWPBlocks.OAK_CHEST, TextureMap.particle(Blocks.OAK_PLANKS), Models.PARTICLE);
		gen.excludeFromSimpleItemModelGeneration(SSWPBlocks.OAK_CHEST);
		gen.registerSingleton(SSWPBlocks.SPRUCE_CHEST, TextureMap.particle(Blocks.SPRUCE_PLANKS), Models.PARTICLE);
		gen.excludeFromSimpleItemModelGeneration(SSWPBlocks.SPRUCE_CHEST);
		gen.registerSingleton(SSWPBlocks.BIRCH_CHEST, TextureMap.particle(Blocks.BIRCH_PLANKS), Models.PARTICLE);
		gen.excludeFromSimpleItemModelGeneration(SSWPBlocks.BIRCH_CHEST);
		gen.registerSingleton(SSWPBlocks.JUNGLE_CHEST, TextureMap.particle(Blocks.JUNGLE_PLANKS), Models.PARTICLE);
		gen.excludeFromSimpleItemModelGeneration(SSWPBlocks.JUNGLE_CHEST);
		gen.registerSingleton(SSWPBlocks.ACACIA_CHEST, TextureMap.particle(Blocks.ACACIA_PLANKS), Models.PARTICLE);
		gen.excludeFromSimpleItemModelGeneration(SSWPBlocks.ACACIA_CHEST);
		gen.registerSingleton(SSWPBlocks.DARK_OAK_CHEST, TextureMap.particle(Blocks.DARK_OAK_PLANKS), Models.PARTICLE);
		gen.excludeFromSimpleItemModelGeneration(SSWPBlocks.DARK_OAK_CHEST);
		gen.registerSingleton(SSWPBlocks.MANGROVE_CHEST, TextureMap.particle(Blocks.MANGROVE_PLANKS), Models.PARTICLE);
		gen.excludeFromSimpleItemModelGeneration(SSWPBlocks.MANGROVE_CHEST);
		gen.registerSingleton(SSWPBlocks.CHERRY_CHEST, TextureMap.particle(Blocks.CHERRY_PLANKS), Models.PARTICLE);
		gen.excludeFromSimpleItemModelGeneration(SSWPBlocks.CHERRY_CHEST);
		gen.registerSingleton(SSWPBlocks.BAMBOO_CHEST, TextureMap.particle(Blocks.BAMBOO_PLANKS), Models.PARTICLE);
		gen.excludeFromSimpleItemModelGeneration(SSWPBlocks.BAMBOO_CHEST);
		gen.registerSingleton(SSWPBlocks.CRIMSON_CHEST, TextureMap.particle(Blocks.CRIMSON_PLANKS), Models.PARTICLE);
		gen.excludeFromSimpleItemModelGeneration(SSWPBlocks.CRIMSON_CHEST);
		gen.registerSingleton(SSWPBlocks.WARPED_CHEST, TextureMap.particle(Blocks.WARPED_PLANKS), Models.PARTICLE);
		gen.excludeFromSimpleItemModelGeneration(SSWPBlocks.WARPED_CHEST);
		
		gen.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(SSWPBlocks.OAK_TRAPPED_CHEST, ModelIds.getBlockModelId(SSWPBlocks.OAK_CHEST)));
		gen.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(SSWPBlocks.SPRUCE_TRAPPED_CHEST, ModelIds.getBlockModelId(SSWPBlocks.SPRUCE_CHEST)));
		gen.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(SSWPBlocks.BIRCH_TRAPPED_CHEST, ModelIds.getBlockModelId(SSWPBlocks.BIRCH_CHEST)));
		gen.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(SSWPBlocks.JUNGLE_TRAPPED_CHEST, ModelIds.getBlockModelId(SSWPBlocks.JUNGLE_CHEST)));
		gen.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(SSWPBlocks.ACACIA_TRAPPED_CHEST, ModelIds.getBlockModelId(SSWPBlocks.ACACIA_CHEST)));
		gen.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(SSWPBlocks.DARK_OAK_TRAPPED_CHEST, ModelIds.getBlockModelId(SSWPBlocks.DARK_OAK_CHEST)));
		gen.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(SSWPBlocks.MANGROVE_TRAPPED_CHEST, ModelIds.getBlockModelId(SSWPBlocks.MANGROVE_CHEST)));
		gen.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(SSWPBlocks.CHERRY_TRAPPED_CHEST, ModelIds.getBlockModelId(SSWPBlocks.CHERRY_CHEST)));
		gen.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(SSWPBlocks.BAMBOO_TRAPPED_CHEST, ModelIds.getBlockModelId(SSWPBlocks.BAMBOO_CHEST)));
		gen.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(SSWPBlocks.CRIMSON_TRAPPED_CHEST, ModelIds.getBlockModelId(SSWPBlocks.CRIMSON_CHEST)));
		gen.blockStateCollector.accept(BlockStateModelGenerator.createSingletonBlockState(SSWPBlocks.WARPED_TRAPPED_CHEST, ModelIds.getBlockModelId(SSWPBlocks.WARPED_CHEST)));
		
		gen.registerParentedItemModel(SSWPBlocks.OAK_TRAPPED_CHEST, ModelIds.getItemModelId(SSWPItems.OAK_CHEST));
		gen.registerParentedItemModel(SSWPBlocks.SPRUCE_TRAPPED_CHEST, ModelIds.getItemModelId(SSWPItems.SPRUCE_CHEST));
		gen.registerParentedItemModel(SSWPBlocks.BIRCH_TRAPPED_CHEST, ModelIds.getItemModelId(SSWPItems.BIRCH_CHEST));
		gen.registerParentedItemModel(SSWPBlocks.JUNGLE_TRAPPED_CHEST, ModelIds.getItemModelId(SSWPItems.JUNGLE_CHEST));
		gen.registerParentedItemModel(SSWPBlocks.ACACIA_TRAPPED_CHEST, ModelIds.getItemModelId(SSWPItems.ACACIA_CHEST));
		gen.registerParentedItemModel(SSWPBlocks.DARK_OAK_TRAPPED_CHEST, ModelIds.getItemModelId(SSWPItems.DARK_OAK_CHEST));
		gen.registerParentedItemModel(SSWPBlocks.MANGROVE_TRAPPED_CHEST, ModelIds.getItemModelId(SSWPItems.MANGROVE_CHEST));
		gen.registerParentedItemModel(SSWPBlocks.CHERRY_TRAPPED_CHEST, ModelIds.getItemModelId(SSWPItems.CHERRY_CHEST));
		gen.registerParentedItemModel(SSWPBlocks.BAMBOO_TRAPPED_CHEST, ModelIds.getItemModelId(SSWPItems.BAMBOO_CHEST));
		gen.registerParentedItemModel(SSWPBlocks.CRIMSON_TRAPPED_CHEST, ModelIds.getItemModelId(SSWPItems.CRIMSON_CHEST));
		gen.registerParentedItemModel(SSWPBlocks.WARPED_TRAPPED_CHEST, ModelIds.getItemModelId(SSWPItems.WARPED_CHEST));
		
		AquiferBlockStates.registerCauldrons(gen, SSWPBlocks.GOLD_CAULDRON, SSWPBlocks.GOLD_WATER_CAULDRON, SSWPBlocks.GOLD_LAVA_CAULDRON, SSWPBlocks.GOLD_POWDER_SNOW_CAULDRON);
		
		AquiferBlockStates.registerCauldrons(gen, SSWPBlocks.NETHERITE_CAULDRON, SSWPBlocks.NETHERITE_WATER_CAULDRON, SSWPBlocks.NETHERITE_LAVA_CAULDRON, SSWPBlocks.NETHERITE_POWDER_SNOW_CAULDRON);
		
		AquiferBlockStates.registerCauldrons(gen, SSWPBlocks.COPPER_CAULDRON, SSWPBlocks.COPPER_WATER_CAULDRON, SSWPBlocks.COPPER_LAVA_CAULDRON, SSWPBlocks.COPPER_POWDER_SNOW_CAULDRON);
		AquiferBlockStates.registerCauldrons(gen, SSWPBlocks.EXPOSED_COPPER_CAULDRON, SSWPBlocks.EXPOSED_COPPER_WATER_CAULDRON, SSWPBlocks.EXPOSED_COPPER_LAVA_CAULDRON, SSWPBlocks.EXPOSED_COPPER_POWDER_SNOW_CAULDRON);
		AquiferBlockStates.registerCauldrons(gen, SSWPBlocks.WEATHERED_COPPER_CAULDRON, SSWPBlocks.WEATHERED_COPPER_WATER_CAULDRON, SSWPBlocks.WEATHERED_COPPER_LAVA_CAULDRON, SSWPBlocks.WEATHERED_COPPER_POWDER_SNOW_CAULDRON);
		AquiferBlockStates.registerCauldrons(gen, SSWPBlocks.OXIDIZED_COPPER_CAULDRON, SSWPBlocks.OXIDIZED_COPPER_WATER_CAULDRON, SSWPBlocks.OXIDIZED_COPPER_LAVA_CAULDRON, SSWPBlocks.OXIDIZED_COPPER_POWDER_SNOW_CAULDRON);
		AquiferBlockStates.registerParentedCauldrons(gen, SSWPBlocks.COPPER_CAULDRON, SSWPBlocks.COPPER_WATER_CAULDRON, SSWPBlocks.COPPER_LAVA_CAULDRON, SSWPBlocks.COPPER_POWDER_SNOW_CAULDRON, SSWPBlocks.WAXED_COPPER_CAULDRON, SSWPBlocks.WAXED_COPPER_WATER_CAULDRON, SSWPBlocks.WAXED_COPPER_LAVA_CAULDRON, SSWPBlocks.WAXED_COPPER_POWDER_SNOW_CAULDRON);
		AquiferBlockStates.registerParentedCauldrons(gen, SSWPBlocks.EXPOSED_COPPER_CAULDRON, SSWPBlocks.EXPOSED_COPPER_WATER_CAULDRON, SSWPBlocks.EXPOSED_COPPER_LAVA_CAULDRON, SSWPBlocks.EXPOSED_COPPER_POWDER_SNOW_CAULDRON, SSWPBlocks.WAXED_EXPOSED_COPPER_CAULDRON, SSWPBlocks.WAXED_EXPOSED_COPPER_WATER_CAULDRON, SSWPBlocks.WAXED_EXPOSED_COPPER_LAVA_CAULDRON, SSWPBlocks.WAXED_EXPOSED_COPPER_POWDER_SNOW_CAULDRON);
		AquiferBlockStates.registerParentedCauldrons(gen, SSWPBlocks.WEATHERED_COPPER_CAULDRON, SSWPBlocks.WEATHERED_COPPER_WATER_CAULDRON, SSWPBlocks.WEATHERED_COPPER_LAVA_CAULDRON, SSWPBlocks.WEATHERED_COPPER_POWDER_SNOW_CAULDRON, SSWPBlocks.WAXED_WEATHERED_COPPER_CAULDRON, SSWPBlocks.WAXED_WEATHERED_COPPER_WATER_CAULDRON, SSWPBlocks.WAXED_WEATHERED_COPPER_LAVA_CAULDRON, SSWPBlocks.WAXED_WEATHERED_COPPER_POWDER_SNOW_CAULDRON);
		AquiferBlockStates.registerParentedCauldrons(gen, SSWPBlocks.OXIDIZED_COPPER_CAULDRON, SSWPBlocks.OXIDIZED_COPPER_WATER_CAULDRON, SSWPBlocks.OXIDIZED_COPPER_LAVA_CAULDRON, SSWPBlocks.OXIDIZED_COPPER_POWDER_SNOW_CAULDRON, SSWPBlocks.WAXED_OXIDIZED_COPPER_CAULDRON, SSWPBlocks.WAXED_OXIDIZED_COPPER_WATER_CAULDRON, SSWPBlocks.WAXED_OXIDIZED_COPPER_LAVA_CAULDRON, SSWPBlocks.WAXED_OXIDIZED_COPPER_POWDER_SNOW_CAULDRON);
		
		gen.registerLantern(SSWPBlocks.GOLD_LANTERN);
		gen.registerLantern(SSWPBlocks.GOLD_SOUL_LANTERN);
		
		gen.registerLantern(SSWPBlocks.NETHERITE_LANTERN);
		gen.registerLantern(SSWPBlocks.NETHERITE_SOUL_LANTERN);
		
		gen.registerLantern(SSWPBlocks.COPPER_LANTERN);
		gen.registerLantern(SSWPBlocks.COPPER_SOUL_LANTERN);
		gen.registerLantern(SSWPBlocks.EXPOSED_COPPER_LANTERN);
		gen.registerLantern(SSWPBlocks.EXPOSED_COPPER_SOUL_LANTERN);
		gen.registerLantern(SSWPBlocks.WEATHERED_COPPER_LANTERN);
		gen.registerLantern(SSWPBlocks.WEATHERED_COPPER_SOUL_LANTERN);
		gen.registerLantern(SSWPBlocks.OXIDIZED_COPPER_LANTERN);
		gen.registerLantern(SSWPBlocks.OXIDIZED_COPPER_SOUL_LANTERN);
		AquiferBlockStates.registerParentedLantern(gen, SSWPBlocks.COPPER_LANTERN, SSWPBlocks.WAXED_COPPER_LANTERN);
		AquiferBlockStates.registerParentedLantern(gen, SSWPBlocks.COPPER_SOUL_LANTERN, SSWPBlocks.WAXED_COPPER_SOUL_LANTERN);
		AquiferBlockStates.registerParentedLantern(gen, SSWPBlocks.EXPOSED_COPPER_LANTERN, SSWPBlocks.WAXED_EXPOSED_COPPER_LANTERN);
		AquiferBlockStates.registerParentedLantern(gen, SSWPBlocks.EXPOSED_COPPER_SOUL_LANTERN, SSWPBlocks.WAXED_EXPOSED_COPPER_SOUL_LANTERN);
		AquiferBlockStates.registerParentedLantern(gen, SSWPBlocks.WEATHERED_COPPER_LANTERN, SSWPBlocks.WAXED_WEATHERED_COPPER_LANTERN);
		AquiferBlockStates.registerParentedLantern(gen, SSWPBlocks.WEATHERED_COPPER_SOUL_LANTERN, SSWPBlocks.WAXED_WEATHERED_COPPER_SOUL_LANTERN);
		AquiferBlockStates.registerParentedLantern(gen, SSWPBlocks.OXIDIZED_COPPER_LANTERN, SSWPBlocks.WAXED_OXIDIZED_COPPER_LANTERN);
		AquiferBlockStates.registerParentedLantern(gen, SSWPBlocks.OXIDIZED_COPPER_SOUL_LANTERN, SSWPBlocks.WAXED_OXIDIZED_COPPER_SOUL_LANTERN);
		
		AquiferBlockStates.registerAnvil(gen, SSWPBlocks.NETHERITE_ANVIL);
	}
	
	@Override
	public void generateItemModels(ItemModelGenerator gen) {
		gen.register(SSWPItems.RED_NETHER_BRICK, Models.GENERATED);
		
		gen.register(SSWPItems.COPPER_NUGGET, Models.GENERATED);
		
		gen.register(SSWPItems.NETHERITE_NUGGET, Models.GENERATED);
		
		gen.register(SSWPItems.OAK_STICK, Models.HANDHELD_ROD);
		gen.register(SSWPItems.SPRUCE_STICK, Models.HANDHELD_ROD);
		gen.register(SSWPItems.BIRCH_STICK, Models.HANDHELD_ROD);
		gen.register(SSWPItems.JUNGLE_STICK, Models.HANDHELD_ROD);
		gen.register(SSWPItems.ACACIA_STICK, Models.HANDHELD_ROD);
		gen.register(SSWPItems.DARK_OAK_STICK, Models.HANDHELD_ROD);
		gen.register(SSWPItems.MANGROVE_STICK, Models.HANDHELD_ROD);
		gen.register(SSWPItems.CHERRY_STICK, Models.HANDHELD_ROD);
		gen.register(SSWPItems.BAMBOO_STICK, Models.HANDHELD_ROD);
		gen.register(SSWPItems.CRIMSON_STICK, Models.HANDHELD_ROD);
		gen.register(SSWPItems.WARPED_STICK, Models.HANDHELD_ROD);
	}
	
	private final Consumer<BlockStateModelGenerator> log(Block base, Block slab, Block stairs, Block wall) {
		return gen -> {
			TextureMap textures = TextureMap.wallSideEnd(base).put(TextureKey.INSIDE, Identifier.of(SSWPlus.MOD_ID, TextureMap.getSubId(base, "_inside").getPath()));
			
			AquiferBlockStates.registerOrientableSlab(gen, slab, textures, ModelIds.getBlockModelId(base), ModelIds.getBlockSubModelId(base, "_horizontal"), true);
			AquiferBlockStates.registerOrientableStairs(gen, stairs, textures, true);
			AquiferBlockStates.registerWallCentralColumn(gen, wall, textures);
		};
	}
	
	private final Consumer<BlockStateModelGenerator> xyzLog(Block base, Block slab, Block stairs, Block wall) {
		return gen -> {
			TextureMap textures = TextureMap.wallSideEnd(base).put(TextureKey.INSIDE, Identifier.of(SSWPlus.MOD_ID, TextureMap.getSubId(base, "_inside").getPath()));
			
			AquiferBlockStates.registerOrientableSlab(gen, slab, textures, ModelIds.getBlockSubModelId(base, "_x"), ModelIds.getBlockSubModelId(base, "_y"), ModelIds.getBlockSubModelId(base, "_z"), true);
			AquiferBlockStates.registerOrientableStairs(gen, stairs, textures, true);
			AquiferBlockStates.registerWallCentralColumn(gen, wall, textures);
		};
	}
	
	private final Consumer<BlockStateModelGenerator> bamboo(Block base, Block slab, Block stairs, Block wall) {
		return gen -> {
			TextureMap texture = TextureMap.sideAndEndForTop(base);
			
			AquiferBlockStates.registerOrientableSlab(gen, slab, texture, ModelIds.getBlockSubModelId(base, "_x"), ModelIds.getBlockSubModelId(base, "_y"), ModelIds.getBlockSubModelId(base, "_z"), false);
			AquiferBlockStates.registerOrientableStairs(gen, stairs, texture);
			AquiferBlockStates.registerWallColumn(gen, wall, texture);
		};
	}
	
	private final Consumer<BlockStateModelGenerator> netherLog(Block base, Block slab, Block stairs, Block wall) {
		return gen -> {
			TextureMap textures = TextureMap.wallSideEnd(base).put(TextureKey.INSIDE, Identifier.of(SSWPlus.MOD_ID, TextureMap.getSubId(base, "_inside").getPath()));
			
			AquiferBlockStates.registerOrientableSlab(gen, slab, textures, ModelIds.getBlockModelId(base), true);
			AquiferBlockStates.registerOrientableStairs(gen, stairs, textures, true);
			AquiferBlockStates.registerWallCentralColumn(gen, wall, textures);
		};
	}
	
	private final TextureMap sandstoneVariantTextures(Block block, Block top) {
		return new TextureMap().put(TextureKey.SIDE, TextureMap.getId(block)).put(TextureKey.END, TextureMap.getSubId(top, "_top"));
	}
	
	public static void registerGrassSlab(BlockStateModelGenerator gen) {
		TextureMap snowyTextures = new TextureMap().put(TextureKey.TOP, TextureMap.getSubId(Blocks.GRASS_BLOCK, "_top")).put(TextureKey.SIDE, TextureMap.getSubId(Blocks.GRASS_BLOCK, "_snow")).put(TextureKey.BOTTOM, TextureMap.getId(Blocks.DIRT));
		AquiferBlockStates.registerBoolPropertySlab(gen, SSWPBlocks.GRASS_SLAB, Properties.SNOWY,
				ModelIds.getBlockModelId(SSWPBlocks.GRASS_SLAB),
				AquiferModels.TERRAIN_SLAB.upload(SSWPBlocks.GRASS_SLAB, "_snowy", snowyTextures, gen.modelCollector),
				ModelIds.getBlockSubModelId(SSWPBlocks.GRASS_SLAB, "_top"),
				AquiferModels.TERRAIN_SLAB_TOP.upload(SSWPBlocks.GRASS_SLAB, "_snowy", snowyTextures, gen.modelCollector),
				ModelIds.getBlockSubModelId(SSWPBlocks.GRASS_SLAB, "_double"),
				AquiferModels.TERRAIN_SLAB_DOUBLE.upload(SSWPBlocks.GRASS_SLAB, "_snowy", snowyTextures, gen.modelCollector));
	}
	
	public static void registerGrassStairs(BlockStateModelGenerator gen) {
		TextureMap snowyTextures = new TextureMap().put(TextureKey.TOP, TextureMap.getSubId(Blocks.GRASS_BLOCK, "_top")).put(TextureKey.SIDE, TextureMap.getSubId(Blocks.GRASS_BLOCK, "_snow")).put(TextureKey.BOTTOM, TextureMap.getId(Blocks.DIRT));
		AquiferBlockStates.registerBoolPropertyFlippedStairs(gen, SSWPBlocks.GRASS_STAIRS, Properties.SNOWY,
				ModelIds.getBlockSubModelId(SSWPBlocks.GRASS_STAIRS, "_inner"),
				AquiferModels.TERRAIN_INNER_STAIRS.upload(SSWPBlocks.GRASS_STAIRS, "_snowy", snowyTextures, gen.modelCollector),
				ModelIds.getBlockSubModelId(SSWPBlocks.GRASS_STAIRS, "_inner_flipped"),
				AquiferModels.TERRAIN_INNER_STAIRS_FLIPPED.upload(SSWPBlocks.GRASS_STAIRS, "_snowy", snowyTextures, gen.modelCollector),
				ModelIds.getBlockModelId(SSWPBlocks.GRASS_STAIRS),
				AquiferModels.TERRAIN_STAIRS.upload(SSWPBlocks.GRASS_STAIRS, "_snowy", snowyTextures, gen.modelCollector),
				ModelIds.getBlockSubModelId(SSWPBlocks.GRASS_STAIRS, "_flipped"),
				AquiferModels.TERRAIN_STAIRS_FLIPPED.upload(SSWPBlocks.GRASS_STAIRS, "_snowy", snowyTextures, gen.modelCollector),
				ModelIds.getBlockSubModelId(SSWPBlocks.GRASS_STAIRS, "_outer"),
				AquiferModels.TERRAIN_OUTER_STAIRS.upload(SSWPBlocks.GRASS_STAIRS, "_snowy", snowyTextures, gen.modelCollector),
				ModelIds.getBlockSubModelId(SSWPBlocks.GRASS_STAIRS, "_outer_flipped"),
				AquiferModels.TERRAIN_OUTER_STAIRS_FLIPPED.upload(SSWPBlocks.GRASS_STAIRS, "_snowy", snowyTextures, gen.modelCollector));
	}
	
	public static void registerGrassWall(BlockStateModelGenerator gen) {
		TextureMap snowyTextures = new TextureMap().put(TextureKey.TOP, TextureMap.getSubId(Blocks.GRASS_BLOCK, "_top")).put(TextureKey.SIDE, TextureMap.getSubId(Blocks.GRASS_BLOCK, "_snow")).put(TextureKey.BOTTOM, TextureMap.getId(Blocks.DIRT));
		AquiferBlockStates.registerBoolPropertyWall(gen, SSWPBlocks.GRASS_WALL, Properties.SNOWY,
				ModelIds.getBlockSubModelId(SSWPBlocks.GRASS_WALL, "_post"),
				AquiferModels.TEMPLATE_TERRAIN_WALL_POST.upload(SSWPBlocks.GRASS_WALL, "_snowy", snowyTextures, gen.modelCollector),
				ModelIds.getBlockSubModelId(SSWPBlocks.GRASS_WALL, "_side"),
				AquiferModels.TEMPLATE_TERRAIN_WALL_SIDE.upload(SSWPBlocks.GRASS_WALL, "_snowy", snowyTextures, gen.modelCollector),
				ModelIds.getBlockSubModelId(SSWPBlocks.GRASS_WALL, "_side_tall"),
				AquiferModels.TEMPLATE_TERRAIN_WALL_SIDE_TALL.upload(SSWPBlocks.GRASS_WALL, "_snowy", snowyTextures, gen.modelCollector),
				ModelIds.getBlockSubModelId(SSWPBlocks.GRASS_WALL, "_inventory"));
	}
	
	public static void registerNyliumSlab(BlockStateModelGenerator gen, Block slab, Block nylium) {
		TextureMap textures = new TextureMap().put(TextureKey.BOTTOM, TextureMap.getId(Blocks.NETHERRACK)).put(TextureKey.SIDE, TextureMap.getSubId(nylium, "_side")).put(TextureKey.TOP, TextureMap.getId(nylium));
		AquiferBlockStates.registerSlab(gen, slab,
				AquiferModels.TERRAIN_SLAB.upload(slab, textures, gen.modelCollector),
				AquiferModels.TERRAIN_SLAB_TOP.upload(slab, textures, gen.modelCollector),
				AquiferModels.TERRAIN_SLAB_DOUBLE.upload(slab, textures, gen.modelCollector));
	}
	
	public static void registerNyliumStairs(BlockStateModelGenerator gen, Block stairs, Block nylium) {
		TextureMap textures = new TextureMap().put(TextureKey.BOTTOM, TextureMap.getId(Blocks.NETHERRACK)).put(TextureKey.SIDE, TextureMap.getSubId(nylium, "_side")).put(TextureKey.TOP, TextureMap.getId(nylium));
		AquiferBlockStates.registerFlippedStairs(gen, stairs,
				AquiferModels.TERRAIN_INNER_STAIRS.upload(stairs, textures, gen.modelCollector),
				AquiferModels.TERRAIN_INNER_STAIRS_FLIPPED.upload(stairs, textures, gen.modelCollector),
				AquiferModels.TERRAIN_STAIRS.upload(stairs, textures, gen.modelCollector),
				AquiferModels.TERRAIN_STAIRS_FLIPPED.upload(stairs, textures, gen.modelCollector),
				AquiferModels.TERRAIN_OUTER_STAIRS.upload(stairs, textures, gen.modelCollector),
				AquiferModels.TERRAIN_OUTER_STAIRS_FLIPPED.upload(stairs, textures, gen.modelCollector));
	}
	
	public static void registerNyliumWall(BlockStateModelGenerator gen, Block wall, Block nylium) {
		TextureMap textures = new TextureMap().put(TextureKey.BOTTOM, TextureMap.getId(Blocks.NETHERRACK)).put(TextureKey.SIDE, TextureMap.getSubId(nylium, "_side")).put(TextureKey.TOP, TextureMap.getId(nylium));
		AquiferBlockStates.registerWall(gen, wall,
				AquiferModels.TEMPLATE_TERRAIN_WALL_POST.upload(wall, textures, gen.modelCollector),
				AquiferModels.TEMPLATE_TERRAIN_WALL_SIDE.upload(wall, textures, gen.modelCollector),
				AquiferModels.TEMPLATE_TERRAIN_WALL_SIDE_TALL.upload(wall, textures, gen.modelCollector),
				AquiferModels.TERRAIN_WALL_INVENTORY.upload(wall, textures, gen.modelCollector));
	}
	
	public static void registerDriedKelpSlab(BlockStateModelGenerator gen) {
		Block block = SSWPBlocks.DRIED_KELP_SLAB;
		gen.blockStateCollector.accept(BlockStateModelGenerator.createSlabBlockState(block, ModelIds.getBlockModelId(block), ModelIds.getBlockSubModelId(block, "_top"), ModelIds.getBlockModelId(Blocks.DRIED_KELP_BLOCK)));
		gen.registerParentedItemModel(block, ModelIds.getBlockModelId(block));
	}
	
	public static void registerDriedKelpStairs(BlockStateModelGenerator gen) {
		Block block = SSWPBlocks.DRIED_KELP_STAIRS;
		gen.blockStateCollector.accept(VariantsBlockStateSupplier.create(block)
				.coordinate(BlockStateVariantMap.create(Properties.HORIZONTAL_FACING, Properties.BLOCK_HALF, Properties.STAIR_SHAPE)
						.register(Direction.EAST, BlockHalf.BOTTOM, StairShape.INNER_LEFT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_inner_northeast")))
						.register(Direction.EAST, BlockHalf.BOTTOM, StairShape.INNER_RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_inner_southeast")))
						.register(Direction.EAST, BlockHalf.BOTTOM, StairShape.OUTER_LEFT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_outer_northeast")))
						.register(Direction.EAST, BlockHalf.BOTTOM, StairShape.OUTER_RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_outer_southeast")))
						.register(Direction.EAST, BlockHalf.BOTTOM, StairShape.STRAIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_east")))
						.register(Direction.EAST, BlockHalf.TOP, StairShape.INNER_LEFT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_inner_top_northeast")))
						.register(Direction.EAST, BlockHalf.TOP, StairShape.INNER_RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_inner_top_southeast")))
						.register(Direction.EAST, BlockHalf.TOP, StairShape.OUTER_LEFT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_outer_top_northeast")))
						.register(Direction.EAST, BlockHalf.TOP, StairShape.OUTER_RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_outer_top_southeast")))
						.register(Direction.EAST, BlockHalf.TOP, StairShape.STRAIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_top_east")))
						.register(Direction.NORTH, BlockHalf.BOTTOM, StairShape.INNER_LEFT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_inner_northwest")))
						.register(Direction.NORTH, BlockHalf.BOTTOM, StairShape.INNER_RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_inner_northeast")))
						.register(Direction.NORTH, BlockHalf.BOTTOM, StairShape.OUTER_LEFT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_outer_northwest")))
						.register(Direction.NORTH, BlockHalf.BOTTOM, StairShape.OUTER_RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_outer_northeast")))
						.register(Direction.NORTH, BlockHalf.BOTTOM, StairShape.STRAIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_north")))
						.register(Direction.NORTH, BlockHalf.TOP, StairShape.INNER_LEFT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_inner_top_northwest")))
						.register(Direction.NORTH, BlockHalf.TOP, StairShape.INNER_RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_inner_top_northeast")))
						.register(Direction.NORTH, BlockHalf.TOP, StairShape.OUTER_LEFT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_outer_top_northwest")))
						.register(Direction.NORTH, BlockHalf.TOP, StairShape.OUTER_RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_outer_top_northeast")))
						.register(Direction.NORTH, BlockHalf.TOP, StairShape.STRAIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_top_north")))
						.register(Direction.SOUTH, BlockHalf.BOTTOM, StairShape.INNER_LEFT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_inner_southeast")))
						.register(Direction.SOUTH, BlockHalf.BOTTOM, StairShape.INNER_RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_inner_southwest")))
						.register(Direction.SOUTH, BlockHalf.BOTTOM, StairShape.OUTER_LEFT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_outer_southeast")))
						.register(Direction.SOUTH, BlockHalf.BOTTOM, StairShape.OUTER_RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_outer_southwest")))
						.register(Direction.SOUTH, BlockHalf.BOTTOM, StairShape.STRAIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_south")))
						.register(Direction.SOUTH, BlockHalf.TOP, StairShape.INNER_LEFT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_inner_top_southeast")))
						.register(Direction.SOUTH, BlockHalf.TOP, StairShape.INNER_RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_inner_top_southwest")))
						.register(Direction.SOUTH, BlockHalf.TOP, StairShape.OUTER_LEFT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_outer_top_southeast")))
						.register(Direction.SOUTH, BlockHalf.TOP, StairShape.OUTER_RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_outer_top_southwest")))
						.register(Direction.SOUTH, BlockHalf.TOP, StairShape.STRAIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_top_south")))
						.register(Direction.WEST, BlockHalf.BOTTOM, StairShape.INNER_LEFT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_inner_southwest")))
						.register(Direction.WEST, BlockHalf.BOTTOM, StairShape.INNER_RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_inner_northwest")))
						.register(Direction.WEST, BlockHalf.BOTTOM, StairShape.OUTER_LEFT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_outer_southwest")))
						.register(Direction.WEST, BlockHalf.BOTTOM, StairShape.OUTER_RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_outer_northwest")))
						.register(Direction.WEST, BlockHalf.BOTTOM, StairShape.STRAIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_west")))
						.register(Direction.WEST, BlockHalf.TOP, StairShape.INNER_LEFT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_inner_top_southwest")))
						.register(Direction.WEST, BlockHalf.TOP, StairShape.INNER_RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_inner_top_northwest")))
						.register(Direction.WEST, BlockHalf.TOP, StairShape.OUTER_LEFT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_outer_top_southwest")))
						.register(Direction.WEST, BlockHalf.TOP, StairShape.OUTER_RIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_outer_top_northwest")))
						.register(Direction.WEST, BlockHalf.TOP, StairShape.STRAIGHT, BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_top_west")))));
		gen.registerParentedItemModel(block, ModelIds.getBlockSubModelId(block, "_east"));
	}
	
	public static void registerDriedKelpWall(BlockStateModelGenerator gen) {
		Block block = SSWPBlocks.DRIED_KELP_WALL;
		gen.blockStateCollector.accept(MultipartBlockStateSupplier.create(block)
				.with(When.create().set(Properties.UP, true), BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_post")))
				.with(When.create().set(Properties.EAST_WALL_SHAPE, WallShape.LOW), BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_side_east")))
				.with(When.create().set(Properties.EAST_WALL_SHAPE, WallShape.TALL), BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_side_tall_east")))
				.with(When.create().set(Properties.NORTH_WALL_SHAPE, WallShape.LOW), BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_side_north")))
				.with(When.create().set(Properties.NORTH_WALL_SHAPE, WallShape.TALL), BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_side_tall_north")))
				.with(When.create().set(Properties.SOUTH_WALL_SHAPE, WallShape.LOW), BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_side_south")))
				.with(When.create().set(Properties.SOUTH_WALL_SHAPE, WallShape.TALL), BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_side_tall_south")))
				.with(When.create().set(Properties.WEST_WALL_SHAPE, WallShape.LOW), BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_side_west")))
				.with(When.create().set(Properties.WEST_WALL_SHAPE, WallShape.TALL), BlockStateVariant.create().put(VariantSettings.MODEL, ModelIds.getBlockSubModelId(block, "_side_tall_west"))));
		gen.registerParentedItemModel(block, ModelIds.getBlockSubModelId(block, "_inventory"));
	}
	
	public final void registerGlassPane(BlockStateModelGenerator gen, Block glass, Block glassPane) {
		TextureMap textureMap = TextureMap.paneAndTopForEdge(glass, glassPane);
		Identifier identifier = Models.TEMPLATE_GLASS_PANE_POST.upload(glassPane, textureMap, gen.modelCollector);
		Identifier identifier2 = Models.TEMPLATE_GLASS_PANE_SIDE.upload(glassPane, textureMap, gen.modelCollector);
		Identifier identifier3 = Models.TEMPLATE_GLASS_PANE_SIDE_ALT.upload(glassPane, textureMap, gen.modelCollector);
		Identifier identifier4 = Models.TEMPLATE_GLASS_PANE_NOSIDE.upload(glassPane, textureMap, gen.modelCollector);
		Identifier identifier5 = Models.TEMPLATE_GLASS_PANE_NOSIDE_ALT.upload(glassPane, textureMap, gen.modelCollector);
		Item item = glassPane.asItem();
		Models.GENERATED.upload(ModelIds.getItemModelId(item), TextureMap.layer0(glass), gen.modelCollector);
		gen.blockStateCollector
			.accept(
				MultipartBlockStateSupplier.create(glassPane)
					.with(BlockStateVariant.create().put(VariantSettings.MODEL, identifier))
					.with(When.create().set(Properties.NORTH, true), BlockStateVariant.create().put(VariantSettings.MODEL, identifier2))
					.with(
						When.create().set(Properties.EAST, true),
						BlockStateVariant.create().put(VariantSettings.MODEL, identifier2).put(VariantSettings.Y, VariantSettings.Rotation.R90)
					)
					.with(When.create().set(Properties.SOUTH, true), BlockStateVariant.create().put(VariantSettings.MODEL, identifier3))
					.with(
						When.create().set(Properties.WEST, true),
						BlockStateVariant.create().put(VariantSettings.MODEL, identifier3).put(VariantSettings.Y, VariantSettings.Rotation.R90)
					)
					.with(When.create().set(Properties.NORTH, false), BlockStateVariant.create().put(VariantSettings.MODEL, identifier4))
					.with(When.create().set(Properties.EAST, false), BlockStateVariant.create().put(VariantSettings.MODEL, identifier5))
					.with(
						When.create().set(Properties.SOUTH, false),
						BlockStateVariant.create().put(VariantSettings.MODEL, identifier5).put(VariantSettings.Y, VariantSettings.Rotation.R90)
					)
					.with(
						When.create().set(Properties.WEST, false),
						BlockStateVariant.create().put(VariantSettings.MODEL, identifier4).put(VariantSettings.Y, VariantSettings.Rotation.R270)
					)
			);
	}
}