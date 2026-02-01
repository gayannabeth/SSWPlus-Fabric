package gay.mountainspring.sswplus.datagen;

import java.util.concurrent.CompletableFuture;

import gay.mountainspring.aquifer.datagen.AquiferBlockLootTableProvider;
import gay.mountainspring.sswplus.block.SSWPBlocks;
import gay.mountainspring.sswplus.item.SSWPItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.operator.BoundedIntUnaryOperator;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryWrapper.WrapperLookup;

public final class SSWPBlockLootGen extends AquiferBlockLootTableProvider {
	protected SSWPBlockLootGen(FabricDataOutput dataOutput, CompletableFuture<WrapperLookup> registryLookup) {
		super(dataOutput, registryLookup);
	}
	
	@Override
	public void generate() {
		this.addDrop(SSWPBlocks.OAK_LOG_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.OAK_LOG_STAIRS);
		this.addDrop(SSWPBlocks.OAK_LOG_WALL);
		this.addDrop(SSWPBlocks.OAK_WOOD_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.OAK_WOOD_STAIRS);
		this.addDrop(SSWPBlocks.OAK_WOOD_WALL);
		this.addDrop(SSWPBlocks.STRIPPED_OAK_LOG_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.STRIPPED_OAK_LOG_STAIRS);
		this.addDrop(SSWPBlocks.STRIPPED_OAK_LOG_WALL);
		this.addDrop(SSWPBlocks.STRIPPED_OAK_WOOD_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.STRIPPED_OAK_WOOD_STAIRS);
		this.addDrop(SSWPBlocks.STRIPPED_OAK_WOOD_WALL);
		
		this.addDrop(SSWPBlocks.SPRUCE_LOG_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.SPRUCE_LOG_STAIRS);
		this.addDrop(SSWPBlocks.SPRUCE_LOG_WALL);
		this.addDrop(SSWPBlocks.SPRUCE_WOOD_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.SPRUCE_WOOD_STAIRS);
		this.addDrop(SSWPBlocks.SPRUCE_WOOD_WALL);
		this.addDrop(SSWPBlocks.STRIPPED_SPRUCE_LOG_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.STRIPPED_SPRUCE_LOG_STAIRS);
		this.addDrop(SSWPBlocks.STRIPPED_SPRUCE_LOG_WALL);
		this.addDrop(SSWPBlocks.STRIPPED_SPRUCE_WOOD_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.STRIPPED_SPRUCE_WOOD_STAIRS);
		this.addDrop(SSWPBlocks.STRIPPED_SPRUCE_WOOD_WALL);
		
		this.addDrop(SSWPBlocks.BIRCH_LOG_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.BIRCH_LOG_STAIRS);
		this.addDrop(SSWPBlocks.BIRCH_LOG_WALL);
		this.addDrop(SSWPBlocks.BIRCH_WOOD_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.BIRCH_WOOD_STAIRS);
		this.addDrop(SSWPBlocks.BIRCH_WOOD_WALL);
		this.addDrop(SSWPBlocks.STRIPPED_BIRCH_LOG_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.STRIPPED_BIRCH_LOG_STAIRS);
		this.addDrop(SSWPBlocks.STRIPPED_BIRCH_LOG_WALL);
		this.addDrop(SSWPBlocks.STRIPPED_BIRCH_WOOD_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.STRIPPED_BIRCH_WOOD_STAIRS);
		this.addDrop(SSWPBlocks.STRIPPED_BIRCH_WOOD_WALL);
		
		this.addDrop(SSWPBlocks.JUNGLE_LOG_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.JUNGLE_LOG_STAIRS);
		this.addDrop(SSWPBlocks.JUNGLE_LOG_WALL);
		this.addDrop(SSWPBlocks.JUNGLE_WOOD_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.JUNGLE_WOOD_STAIRS);
		this.addDrop(SSWPBlocks.JUNGLE_WOOD_WALL);
		this.addDrop(SSWPBlocks.STRIPPED_JUNGLE_LOG_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.STRIPPED_JUNGLE_LOG_STAIRS);
		this.addDrop(SSWPBlocks.STRIPPED_JUNGLE_LOG_WALL);
		this.addDrop(SSWPBlocks.STRIPPED_JUNGLE_WOOD_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.STRIPPED_JUNGLE_WOOD_STAIRS);
		this.addDrop(SSWPBlocks.STRIPPED_JUNGLE_WOOD_WALL);
		
		this.addDrop(SSWPBlocks.ACACIA_LOG_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.ACACIA_LOG_STAIRS);
		this.addDrop(SSWPBlocks.ACACIA_LOG_WALL);
		this.addDrop(SSWPBlocks.ACACIA_WOOD_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.ACACIA_WOOD_STAIRS);
		this.addDrop(SSWPBlocks.ACACIA_WOOD_WALL);
		this.addDrop(SSWPBlocks.STRIPPED_ACACIA_LOG_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.STRIPPED_ACACIA_LOG_STAIRS);
		this.addDrop(SSWPBlocks.STRIPPED_ACACIA_LOG_WALL);
		this.addDrop(SSWPBlocks.STRIPPED_ACACIA_WOOD_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.STRIPPED_ACACIA_WOOD_STAIRS);
		this.addDrop(SSWPBlocks.STRIPPED_ACACIA_WOOD_WALL);
		
		this.addDrop(SSWPBlocks.DARK_OAK_LOG_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.DARK_OAK_LOG_STAIRS);
		this.addDrop(SSWPBlocks.DARK_OAK_LOG_WALL);
		this.addDrop(SSWPBlocks.DARK_OAK_WOOD_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.DARK_OAK_WOOD_STAIRS);
		this.addDrop(SSWPBlocks.DARK_OAK_WOOD_WALL);
		this.addDrop(SSWPBlocks.STRIPPED_DARK_OAK_LOG_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.STRIPPED_DARK_OAK_LOG_STAIRS);
		this.addDrop(SSWPBlocks.STRIPPED_DARK_OAK_LOG_WALL);
		this.addDrop(SSWPBlocks.STRIPPED_DARK_OAK_WOOD_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.STRIPPED_DARK_OAK_WOOD_STAIRS);
		this.addDrop(SSWPBlocks.STRIPPED_DARK_OAK_WOOD_WALL);
		
		this.addDrop(SSWPBlocks.MANGROVE_LOG_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.MANGROVE_LOG_STAIRS);
		this.addDrop(SSWPBlocks.MANGROVE_LOG_WALL);
		this.addDrop(SSWPBlocks.MANGROVE_WOOD_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.MANGROVE_WOOD_STAIRS);
		this.addDrop(SSWPBlocks.MANGROVE_WOOD_WALL);
		this.addDrop(SSWPBlocks.STRIPPED_MANGROVE_LOG_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.STRIPPED_MANGROVE_LOG_STAIRS);
		this.addDrop(SSWPBlocks.STRIPPED_MANGROVE_LOG_WALL);
		this.addDrop(SSWPBlocks.STRIPPED_MANGROVE_WOOD_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.STRIPPED_MANGROVE_WOOD_STAIRS);
		this.addDrop(SSWPBlocks.STRIPPED_MANGROVE_WOOD_WALL);
		
		this.addDrop(SSWPBlocks.CHERRY_LOG_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.CHERRY_LOG_STAIRS);
		this.addDrop(SSWPBlocks.CHERRY_LOG_WALL);
		this.addDrop(SSWPBlocks.CHERRY_WOOD_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.CHERRY_WOOD_STAIRS);
		this.addDrop(SSWPBlocks.CHERRY_WOOD_WALL);
		this.addDrop(SSWPBlocks.STRIPPED_CHERRY_LOG_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.STRIPPED_CHERRY_LOG_STAIRS);
		this.addDrop(SSWPBlocks.STRIPPED_CHERRY_LOG_WALL);
		this.addDrop(SSWPBlocks.STRIPPED_CHERRY_WOOD_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.STRIPPED_CHERRY_WOOD_STAIRS);
		this.addDrop(SSWPBlocks.STRIPPED_CHERRY_WOOD_WALL);
		
		this.addDrop(SSWPBlocks.BAMBOO_BLOCK_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.BAMBOO_BLOCK_STAIRS);
		this.addDrop(SSWPBlocks.BAMBOO_BLOCK_WALL);
		this.addDrop(SSWPBlocks.STRIPPED_BAMBOO_BLOCK_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.STRIPPED_BAMBOO_BLOCK_STAIRS);
		this.addDrop(SSWPBlocks.STRIPPED_BAMBOO_BLOCK_WALL);
		
		this.addDrop(SSWPBlocks.CRIMSON_STEM_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.CRIMSON_STEM_STAIRS);
		this.addDrop(SSWPBlocks.CRIMSON_STEM_WALL);
		this.addDrop(SSWPBlocks.CRIMSON_HYPHAE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.CRIMSON_HYPHAE_STAIRS);
		this.addDrop(SSWPBlocks.CRIMSON_HYPHAE_WALL);
		this.addDrop(SSWPBlocks.STRIPPED_CRIMSON_STEM_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.STRIPPED_CRIMSON_STEM_STAIRS);
		this.addDrop(SSWPBlocks.STRIPPED_CRIMSON_STEM_WALL);
		this.addDrop(SSWPBlocks.STRIPPED_CRIMSON_HYPHAE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.STRIPPED_CRIMSON_HYPHAE_STAIRS);
		this.addDrop(SSWPBlocks.STRIPPED_CRIMSON_HYPHAE_WALL);
		
		this.addDrop(SSWPBlocks.WARPED_STEM_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.WARPED_STEM_STAIRS);
		this.addDrop(SSWPBlocks.WARPED_STEM_WALL);
		this.addDrop(SSWPBlocks.WARPED_HYPHAE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.WARPED_HYPHAE_STAIRS);
		this.addDrop(SSWPBlocks.WARPED_HYPHAE_WALL);
		this.addDrop(SSWPBlocks.STRIPPED_WARPED_STEM_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.STRIPPED_WARPED_STEM_STAIRS);
		this.addDrop(SSWPBlocks.STRIPPED_WARPED_STEM_WALL);
		this.addDrop(SSWPBlocks.STRIPPED_WARPED_HYPHAE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.STRIPPED_WARPED_HYPHAE_STAIRS);
		this.addDrop(SSWPBlocks.STRIPPED_WARPED_HYPHAE_WALL);
		
		this.addDrop(SSWPBlocks.STONE_WALL);
		
		this.addDrop(SSWPBlocks.SMOOTH_STONE_STAIRS);
		this.addDrop(SSWPBlocks.SMOOTH_STONE_WALL);
		
		this.addDrop(SSWPBlocks.CRACKED_STONE_BRICK_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.CRACKED_STONE_BRICK_STAIRS);
		this.addDrop(SSWPBlocks.CRACKED_STONE_BRICK_WALL);
		this.addDrop(SSWPBlocks.CHISELED_STONE_BRICK_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.CHISELED_STONE_BRICK_STAIRS);
		this.addDrop(SSWPBlocks.CHISELED_STONE_BRICK_WALL);
		
		this.addDrop(SSWPBlocks.POLISHED_GRANITE_WALL);
		
		this.addDrop(SSWPBlocks.POLISHED_DIORITE_WALL);
		
		this.addDrop(SSWPBlocks.POLISHED_ANDESITE_WALL);
		
		this.addDrop(SSWPBlocks.DEEPSLATE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.DEEPSLATE_STAIRS);
		this.addDrop(SSWPBlocks.DEEPSLATE_WALL);
		this.addDrop(SSWPBlocks.CHISELED_DEEPSLATE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.CHISELED_DEEPSLATE_STAIRS);
		this.addDrop(SSWPBlocks.CHISELED_DEEPSLATE_WALL);
		this.addDrop(SSWPBlocks.CRACKED_DEEPSLATE_BRICK_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.CRACKED_DEEPSLATE_BRICK_STAIRS);
		this.addDrop(SSWPBlocks.CRACKED_DEEPSLATE_BRICK_WALL);
		this.addDrop(SSWPBlocks.CRACKED_DEEPSLATE_TILE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.CRACKED_DEEPSLATE_TILE_STAIRS);
		this.addDrop(SSWPBlocks.CRACKED_DEEPSLATE_TILE_WALL);
		
		this.addDrop(SSWPBlocks.CHISELED_TUFF_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.CHISELED_TUFF_STAIRS);
		this.addDrop(SSWPBlocks.CHISELED_TUFF_WALL);
		this.addDrop(SSWPBlocks.CHISELED_TUFF_BRICK_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.CHISELED_TUFF_BRICK_STAIRS);
		this.addDrop(SSWPBlocks.CHISELED_TUFF_BRICK_WALL);
		
		this.addDrop(SSWPBlocks.PACKED_MUD_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.PACKED_MUD_STAIRS);
		this.addDrop(SSWPBlocks.PACKED_MUD_WALL);
		
		this.addDrop(SSWPBlocks.CHISELED_SANDSTONE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.CHISELED_SANDSTONE_STAIRS);
		this.addDrop(SSWPBlocks.CHISELED_SANDSTONE_WALL);
		this.addDrop(SSWPBlocks.SMOOTH_SANDSTONE_WALL);
		this.addDrop(SSWPBlocks.CUT_SANDSTONE_STAIRS);
		this.addDrop(SSWPBlocks.CUT_SANDSTONE_WALL);
		
		this.addDrop(SSWPBlocks.CHISELED_RED_SANDSTONE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.CHISELED_RED_SANDSTONE_STAIRS);
		this.addDrop(SSWPBlocks.CHISELED_RED_SANDSTONE_WALL);
		this.addDrop(SSWPBlocks.SMOOTH_RED_SANDSTONE_WALL);
		this.addDrop(SSWPBlocks.CUT_RED_SANDSTONE_STAIRS);
		this.addDrop(SSWPBlocks.CUT_RED_SANDSTONE_WALL);
		
		this.addDrop(SSWPBlocks.SEA_LANTERN_SLAB, block -> this.slabDrops(
				block,
				Items.PRISMARINE_CRYSTALS,
				UniformLootNumberProvider.create(2.0f, 3.0f),
				UniformLootNumberProvider.create(1.0f, 2.0f),
				ApplyBonusLootFunction::uniformBonusCount,
				BoundedIntUnaryOperator.create(1, 5),
				BoundedIntUnaryOperator.create(1, 3)));
		this.addDrop(SSWPBlocks.SEA_LANTERN_STAIRS, block -> this.drops(
				block,
				Items.PRISMARINE_CRYSTALS,
				UniformLootNumberProvider.create(2.0f, 3.0f),
				ApplyBonusLootFunction::uniformBonusCount,
				BoundedIntUnaryOperator.create(1, 5)));
		this.addDrop(SSWPBlocks.SEA_LANTERN_WALL, block -> this.drops(
				block,
				Items.PRISMARINE_CRYSTALS,
				UniformLootNumberProvider.create(2.0f, 3.0f),
				ApplyBonusLootFunction::uniformBonusCount,
				BoundedIntUnaryOperator.create(1, 5)));
		
		this.addDrop(SSWPBlocks.PRISMARINE_BRICK_WALL);
		this.addDrop(SSWPBlocks.DARK_PRISMARINE_WALL);
		
		this.addDrop(SSWPBlocks.NETHERRACK_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.NETHERRACK_STAIRS);
		this.addDrop(SSWPBlocks.NETHERRACK_WALL);
		
		this.addDrop(SSWPBlocks.NETHER_BRICK_FENCE_GATE);
		this.addDrop(SSWPBlocks.CRACKED_NETHER_BRICK_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.CRACKED_NETHER_BRICK_STAIRS);
		this.addDrop(SSWPBlocks.CRACKED_NETHER_BRICK_WALL);
		this.addDrop(SSWPBlocks.CRACKED_NETHER_BRICK_FENCE);
		this.addDrop(SSWPBlocks.CRACKED_NETHER_BRICK_FENCE_GATE);
		this.addDrop(SSWPBlocks.CHISELED_NETHER_BRICK_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.CHISELED_NETHER_BRICK_STAIRS);
		this.addDrop(SSWPBlocks.CHISELED_NETHER_BRICK_WALL);
		this.addDrop(SSWPBlocks.RED_NETHER_BRICK_FENCE);
		this.addDrop(SSWPBlocks.RED_NETHER_BRICK_FENCE_GATE);
		
		this.addDrop(SSWPBlocks.BASALT_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.BASALT_STAIRS);
		this.addDrop(SSWPBlocks.BASALT_WALL);
		this.addDrop(SSWPBlocks.SMOOTH_BASALT_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.SMOOTH_BASALT_STAIRS);
		this.addDrop(SSWPBlocks.SMOOTH_BASALT_WALL);
		this.addDrop(SSWPBlocks.POLISHED_BASALT_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.POLISHED_BASALT_STAIRS);
		this.addDrop(SSWPBlocks.POLISHED_BASALT_WALL);
		
		this.addDrop(SSWPBlocks.GILDED_BLACKSTONE_SLAB, block -> this.tableBonusSlabDrops(
				block,
				Items.GOLD_NUGGET,
				UniformLootNumberProvider.create(2.0f, 5.0f),
				UniformLootNumberProvider.create(1.0f, 3.0f),
				0.1f, 0.14285715f, 0.25f, 1.0f));
		this.addDrop(SSWPBlocks.GILDED_BLACKSTONE_STAIRS, block -> this.tableBonusDrops(
				block,
				Items.GOLD_NUGGET,
				UniformLootNumberProvider.create(2.0f, 5.0f),
				0.1f, 0.14285715f, 0.25f, 1.0f));
		this.addDrop(SSWPBlocks.GILDED_BLACKSTONE_WALL, block -> this.tableBonusDrops(
				block,
				Items.GOLD_NUGGET,
				UniformLootNumberProvider.create(2.0f, 5.0f),
				0.1f, 0.14285715f, 0.25f, 1.0f));
		this.addDrop(SSWPBlocks.CHISELED_POLISHED_BLACKSTONE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.CHISELED_POLISHED_BLACKSTONE_STAIRS);
		this.addDrop(SSWPBlocks.CHISELED_POLISHED_BLACKSTONE_WALL);
		this.addDrop(SSWPBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS);
		this.addDrop(SSWPBlocks.CRACKED_POLISHED_BLACKSTONE_BRICK_WALL);
		
		this.addDrop(SSWPBlocks.END_STONE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.END_STONE_STAIRS);
		this.addDrop(SSWPBlocks.END_STONE_WALL);
		
		this.addDrop(SSWPBlocks.PURPUR_WALL);
		this.addDrop(SSWPBlocks.PURPUR_PILLAR_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.PURPUR_PILLAR_STAIRS);
		this.addDrop(SSWPBlocks.PURPUR_PILLAR_WALL);
		
		this.addDrop(SSWPBlocks.COAL_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.COAL_STAIRS);
		this.addDrop(SSWPBlocks.COAL_WALL);
		
		this.addDrop(SSWPBlocks.IRON_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.IRON_STAIRS);
		this.addDrop(SSWPBlocks.IRON_WALL);
		this.addDrop(SSWPBlocks.IRON_FENCE);
		this.addDrop(SSWPBlocks.IRON_FENCE_GATE);
		this.addDrop(SSWPBlocks.IRON_BUTTON);
		
		this.addDrop(SSWPBlocks.GOLD_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.GOLD_STAIRS);
		this.addDrop(SSWPBlocks.GOLD_WALL);
		this.addDrop(SSWPBlocks.GOLD_FENCE);
		this.addDrop(SSWPBlocks.GOLD_FENCE_GATE);
		this.addDrop(SSWPBlocks.GOLD_BARS);
		this.addDrop(SSWPBlocks.GOLD_DOOR, this::doorDrops);
		this.addDrop(SSWPBlocks.GOLD_TRAPDOOR);
		this.addDrop(SSWPBlocks.GOLD_BUTTON);
		this.addDrop(SSWPBlocks.GOLD_CHAIN);
		
		this.addDrop(SSWPBlocks.REDSTONE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.REDSTONE_STAIRS);
		this.addDrop(SSWPBlocks.REDSTONE_WALL);
		
		this.addDrop(SSWPBlocks.EMERALD_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.EMERALD_STAIRS);
		this.addDrop(SSWPBlocks.EMERALD_WALL);
		
		this.addDrop(SSWPBlocks.LAPIS_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.LAPIS_STAIRS);
		this.addDrop(SSWPBlocks.LAPIS_WALL);
		
		this.addDrop(SSWPBlocks.DIAMOND_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.DIAMOND_STAIRS);
		this.addDrop(SSWPBlocks.DIAMOND_WALL);
		
		this.addDrop(SSWPBlocks.NETHERITE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.NETHERITE_STAIRS);
		this.addDrop(SSWPBlocks.NETHERITE_WALL);
		this.addDrop(SSWPBlocks.NETHERITE_FENCE);
		this.addDrop(SSWPBlocks.NETHERITE_FENCE_GATE);
		this.addDrop(SSWPBlocks.NETHERITE_BARS);
		this.addDrop(SSWPBlocks.NETHERITE_DOOR, this::doorDrops);
		this.addDrop(SSWPBlocks.NETHERITE_TRAPDOOR);
		this.addDrop(SSWPBlocks.NETHERITE_PRESSURE_PLATE);
		this.addDrop(SSWPBlocks.NETHERITE_BUTTON);
		this.addDrop(SSWPBlocks.NETHERITE_CHAIN);
		
		this.addDrop(SSWPBlocks.QUARTZ_WALL);
		this.addDrop(SSWPBlocks.CHISELED_QUARTZ_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.CHISELED_QUARTZ_STAIRS);
		this.addDrop(SSWPBlocks.CHISELED_QUARTZ_WALL);
		this.addDrop(SSWPBlocks.QUARTZ_BRICK_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.QUARTZ_BRICK_STAIRS);
		this.addDrop(SSWPBlocks.QUARTZ_BRICK_WALL);
		this.addDrop(SSWPBlocks.QUARTZ_PILLAR_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.QUARTZ_PILLAR_STAIRS);
		this.addDrop(SSWPBlocks.QUARTZ_WALL);
		this.addDrop(SSWPBlocks.SMOOTH_QUARTZ_WALL);
		
		this.addDrop(SSWPBlocks.AMETHYST_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.AMETHYST_STAIRS);
		this.addDrop(SSWPBlocks.AMETHYST_WALL);
		
		this.addDrop(SSWPBlocks.COPPER_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.COPPER_STAIRS);
		this.addDrop(SSWPBlocks.COPPER_WALL);
		this.addDrop(SSWPBlocks.COPPER_FENCE);
		this.addDrop(SSWPBlocks.COPPER_FENCE_GATE);
		this.addDrop(SSWPBlocks.COPPER_BARS);
		this.addDrop(SSWPBlocks.COPPER_PRESSURE_PLATE);
		this.addDrop(SSWPBlocks.COPPER_BUTTON);
		this.addDrop(SSWPBlocks.CHISELED_COPPER_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.CHISELED_COPPER_STAIRS);
		this.addDrop(SSWPBlocks.CHISELED_COPPER_WALL);
		this.addDrop(SSWPBlocks.COPPER_GRATE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.COPPER_GRATE_STAIRS);
		this.addDrop(SSWPBlocks.COPPER_GRATE_WALL);
		this.addDrop(SSWPBlocks.CUT_COPPER_WALL);
		this.addDrop(SSWPBlocks.EXPOSED_COPPER_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.EXPOSED_COPPER_STAIRS);
		this.addDrop(SSWPBlocks.EXPOSED_COPPER_WALL);
		this.addDrop(SSWPBlocks.EXPOSED_COPPER_FENCE);
		this.addDrop(SSWPBlocks.EXPOSED_COPPER_FENCE_GATE);
		this.addDrop(SSWPBlocks.EXPOSED_COPPER_BARS);
		this.addDrop(SSWPBlocks.EXPOSED_COPPER_PRESSURE_PLATE);
		this.addDrop(SSWPBlocks.EXPOSED_COPPER_BUTTON);
		this.addDrop(SSWPBlocks.EXPOSED_CHISELED_COPPER_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.EXPOSED_CHISELED_COPPER_STAIRS);
		this.addDrop(SSWPBlocks.EXPOSED_CHISELED_COPPER_WALL);
		this.addDrop(SSWPBlocks.EXPOSED_COPPER_GRATE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.EXPOSED_COPPER_GRATE_STAIRS);
		this.addDrop(SSWPBlocks.EXPOSED_COPPER_GRATE_WALL);
		this.addDrop(SSWPBlocks.EXPOSED_CUT_COPPER_WALL);
		this.addDrop(SSWPBlocks.WEATHERED_COPPER_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.WEATHERED_COPPER_STAIRS);
		this.addDrop(SSWPBlocks.WEATHERED_COPPER_WALL);
		this.addDrop(SSWPBlocks.WEATHERED_COPPER_FENCE);
		this.addDrop(SSWPBlocks.WEATHERED_COPPER_FENCE_GATE);
		this.addDrop(SSWPBlocks.WEATHERED_COPPER_BARS);
		this.addDrop(SSWPBlocks.WEATHERED_COPPER_PRESSURE_PLATE);
		this.addDrop(SSWPBlocks.WEATHERED_COPPER_BUTTON);
		this.addDrop(SSWPBlocks.WEATHERED_CHISELED_COPPER_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.WEATHERED_CHISELED_COPPER_STAIRS);
		this.addDrop(SSWPBlocks.WEATHERED_CHISELED_COPPER_WALL);
		this.addDrop(SSWPBlocks.WEATHERED_COPPER_GRATE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.WEATHERED_COPPER_GRATE_STAIRS);
		this.addDrop(SSWPBlocks.WEATHERED_COPPER_GRATE_WALL);
		this.addDrop(SSWPBlocks.WEATHERED_CUT_COPPER_WALL);
		this.addDrop(SSWPBlocks.OXIDIZED_COPPER_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.OXIDIZED_COPPER_STAIRS);
		this.addDrop(SSWPBlocks.OXIDIZED_COPPER_WALL);
		this.addDrop(SSWPBlocks.OXIDIZED_COPPER_FENCE);
		this.addDrop(SSWPBlocks.OXIDIZED_COPPER_FENCE_GATE);
		this.addDrop(SSWPBlocks.OXIDIZED_COPPER_BARS);
		this.addDrop(SSWPBlocks.OXIDIZED_COPPER_PRESSURE_PLATE);
		this.addDrop(SSWPBlocks.OXIDIZED_COPPER_BUTTON);
		this.addDrop(SSWPBlocks.OXIDIZED_CHISELED_COPPER_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.OXIDIZED_CHISELED_COPPER_STAIRS);
		this.addDrop(SSWPBlocks.OXIDIZED_CHISELED_COPPER_WALL);
		this.addDrop(SSWPBlocks.OXIDIZED_COPPER_GRATE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.OXIDIZED_COPPER_GRATE_STAIRS);
		this.addDrop(SSWPBlocks.OXIDIZED_COPPER_GRATE_WALL);
		this.addDrop(SSWPBlocks.OXIDIZED_CUT_COPPER_WALL);
		this.addDrop(SSWPBlocks.WAXED_COPPER_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.WAXED_COPPER_STAIRS);
		this.addDrop(SSWPBlocks.WAXED_COPPER_WALL);
		this.addDrop(SSWPBlocks.WAXED_COPPER_FENCE);
		this.addDrop(SSWPBlocks.WAXED_COPPER_FENCE_GATE);
		this.addDrop(SSWPBlocks.WAXED_COPPER_BARS);
		this.addDrop(SSWPBlocks.WAXED_COPPER_PRESSURE_PLATE);
		this.addDrop(SSWPBlocks.WAXED_COPPER_BUTTON);
		this.addDrop(SSWPBlocks.WAXED_CHISELED_COPPER_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.WAXED_CHISELED_COPPER_STAIRS);
		this.addDrop(SSWPBlocks.WAXED_CHISELED_COPPER_WALL);
		this.addDrop(SSWPBlocks.WAXED_COPPER_GRATE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.WAXED_COPPER_GRATE_STAIRS);
		this.addDrop(SSWPBlocks.WAXED_COPPER_GRATE_WALL);
		this.addDrop(SSWPBlocks.WAXED_CUT_COPPER_WALL);
		this.addDrop(SSWPBlocks.WAXED_EXPOSED_COPPER_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.WAXED_EXPOSED_COPPER_STAIRS);
		this.addDrop(SSWPBlocks.WAXED_EXPOSED_COPPER_WALL);
		this.addDrop(SSWPBlocks.WAXED_EXPOSED_COPPER_FENCE);
		this.addDrop(SSWPBlocks.WAXED_EXPOSED_COPPER_FENCE_GATE);
		this.addDrop(SSWPBlocks.WAXED_EXPOSED_COPPER_BARS);
		this.addDrop(SSWPBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE);
		this.addDrop(SSWPBlocks.WAXED_EXPOSED_COPPER_BUTTON);
		this.addDrop(SSWPBlocks.WAXED_EXPOSED_CHISELED_COPPER_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.WAXED_EXPOSED_CHISELED_COPPER_STAIRS);
		this.addDrop(SSWPBlocks.WAXED_EXPOSED_CHISELED_COPPER_WALL);
		this.addDrop(SSWPBlocks.WAXED_EXPOSED_COPPER_GRATE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.WAXED_EXPOSED_COPPER_GRATE_STAIRS);
		this.addDrop(SSWPBlocks.WAXED_EXPOSED_COPPER_GRATE_WALL);
		this.addDrop(SSWPBlocks.WAXED_EXPOSED_CUT_COPPER_WALL);
		this.addDrop(SSWPBlocks.WAXED_WEATHERED_COPPER_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.WAXED_WEATHERED_COPPER_STAIRS);
		this.addDrop(SSWPBlocks.WAXED_WEATHERED_COPPER_WALL);
		this.addDrop(SSWPBlocks.WAXED_WEATHERED_COPPER_FENCE);
		this.addDrop(SSWPBlocks.WAXED_WEATHERED_COPPER_FENCE_GATE);
		this.addDrop(SSWPBlocks.WAXED_WEATHERED_COPPER_BARS);
		this.addDrop(SSWPBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE);
		this.addDrop(SSWPBlocks.WAXED_WEATHERED_COPPER_BUTTON);
		this.addDrop(SSWPBlocks.WAXED_WEATHERED_CHISELED_COPPER_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.WAXED_WEATHERED_CHISELED_COPPER_STAIRS);
		this.addDrop(SSWPBlocks.WAXED_WEATHERED_CHISELED_COPPER_WALL);
		this.addDrop(SSWPBlocks.WAXED_WEATHERED_COPPER_GRATE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.WAXED_WEATHERED_COPPER_GRATE_STAIRS);
		this.addDrop(SSWPBlocks.WAXED_WEATHERED_COPPER_GRATE_WALL);
		this.addDrop(SSWPBlocks.WAXED_WEATHERED_CUT_COPPER_WALL);
		this.addDrop(SSWPBlocks.WAXED_OXIDIZED_COPPER_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.WAXED_OXIDIZED_COPPER_STAIRS);
		this.addDrop(SSWPBlocks.WAXED_OXIDIZED_COPPER_WALL);
		this.addDrop(SSWPBlocks.WAXED_OXIDIZED_COPPER_FENCE);
		this.addDrop(SSWPBlocks.WAXED_OXIDIZED_COPPER_FENCE_GATE);
		this.addDrop(SSWPBlocks.WAXED_OXIDIZED_COPPER_BARS);
		this.addDrop(SSWPBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE);
		this.addDrop(SSWPBlocks.WAXED_OXIDIZED_COPPER_BUTTON);
		this.addDrop(SSWPBlocks.WAXED_OXIDIZED_CHISELED_COPPER_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.WAXED_OXIDIZED_CHISELED_COPPER_STAIRS);
		this.addDrop(SSWPBlocks.WAXED_OXIDIZED_CHISELED_COPPER_WALL);
		this.addDrop(SSWPBlocks.WAXED_OXIDIZED_COPPER_GRATE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.WAXED_OXIDIZED_COPPER_GRATE_STAIRS);
		this.addDrop(SSWPBlocks.WAXED_OXIDIZED_COPPER_GRATE_WALL);
		this.addDrop(SSWPBlocks.WAXED_OXIDIZED_CUT_COPPER_WALL);
		
		this.addDrop(SSWPBlocks.WHITE_WOOL_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.WHITE_WOOL_STAIRS);
		this.addDrop(SSWPBlocks.WHITE_WOOL_WALL);
		this.addDrop(SSWPBlocks.LIGHT_GRAY_WOOL_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.LIGHT_GRAY_WOOL_STAIRS);
		this.addDrop(SSWPBlocks.LIGHT_GRAY_WOOL_WALL);
		this.addDrop(SSWPBlocks.GRAY_WOOL_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.GRAY_WOOL_STAIRS);
		this.addDrop(SSWPBlocks.GRAY_WOOL_WALL);
		this.addDrop(SSWPBlocks.BLACK_WOOL_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.BLACK_WOOL_STAIRS);
		this.addDrop(SSWPBlocks.BLACK_WOOL_WALL);
		this.addDrop(SSWPBlocks.BROWN_WOOL_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.BROWN_WOOL_STAIRS);
		this.addDrop(SSWPBlocks.BROWN_WOOL_WALL);
		this.addDrop(SSWPBlocks.RED_WOOL_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.RED_WOOL_STAIRS);
		this.addDrop(SSWPBlocks.RED_WOOL_WALL);
		this.addDrop(SSWPBlocks.ORANGE_WOOL_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.ORANGE_WOOL_STAIRS);
		this.addDrop(SSWPBlocks.ORANGE_WOOL_WALL);
		this.addDrop(SSWPBlocks.YELLOW_WOOL_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.YELLOW_WOOL_STAIRS);
		this.addDrop(SSWPBlocks.YELLOW_WOOL_WALL);
		this.addDrop(SSWPBlocks.LIME_WOOL_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.LIME_WOOL_STAIRS);
		this.addDrop(SSWPBlocks.LIME_WOOL_WALL);
		this.addDrop(SSWPBlocks.GREEN_WOOL_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.GREEN_WOOL_STAIRS);
		this.addDrop(SSWPBlocks.GREEN_WOOL_WALL);
		this.addDrop(SSWPBlocks.CYAN_WOOL_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.CYAN_WOOL_STAIRS);
		this.addDrop(SSWPBlocks.CYAN_WOOL_WALL);
		this.addDrop(SSWPBlocks.LIGHT_BLUE_WOOL_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.LIGHT_BLUE_WOOL_STAIRS);
		this.addDrop(SSWPBlocks.LIGHT_BLUE_WOOL_WALL);
		this.addDrop(SSWPBlocks.BLUE_WOOL_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.BLUE_WOOL_STAIRS);
		this.addDrop(SSWPBlocks.BLUE_WOOL_WALL);
		this.addDrop(SSWPBlocks.PURPLE_WOOL_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.PURPLE_WOOL_STAIRS);
		this.addDrop(SSWPBlocks.PURPLE_WOOL_WALL);
		this.addDrop(SSWPBlocks.MAGENTA_WOOL_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.MAGENTA_WOOL_STAIRS);
		this.addDrop(SSWPBlocks.MAGENTA_WOOL_WALL);
		this.addDrop(SSWPBlocks.PINK_WOOL_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.PINK_WOOL_STAIRS);
		this.addDrop(SSWPBlocks.PINK_WOOL_WALL);
		
		this.addDrop(SSWPBlocks.TERRACOTTA_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.TERRACOTTA_STAIRS);
		this.addDrop(SSWPBlocks.TERRACOTTA_WALL);
		this.addDrop(SSWPBlocks.WHITE_TERRACOTTA_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.WHITE_TERRACOTTA_STAIRS);
		this.addDrop(SSWPBlocks.WHITE_TERRACOTTA_WALL);
		this.addDrop(SSWPBlocks.LIGHT_GRAY_TERRACOTTA_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.LIGHT_GRAY_TERRACOTTA_STAIRS);
		this.addDrop(SSWPBlocks.LIGHT_GRAY_TERRACOTTA_WALL);
		this.addDrop(SSWPBlocks.GRAY_TERRACOTTA_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.GRAY_TERRACOTTA_STAIRS);
		this.addDrop(SSWPBlocks.GRAY_TERRACOTTA_WALL);
		this.addDrop(SSWPBlocks.BLACK_TERRACOTTA_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.BLACK_TERRACOTTA_STAIRS);
		this.addDrop(SSWPBlocks.BLACK_TERRACOTTA_WALL);
		this.addDrop(SSWPBlocks.BROWN_TERRACOTTA_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.BROWN_TERRACOTTA_STAIRS);
		this.addDrop(SSWPBlocks.BROWN_TERRACOTTA_WALL);
		this.addDrop(SSWPBlocks.RED_TERRACOTTA_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.RED_TERRACOTTA_STAIRS);
		this.addDrop(SSWPBlocks.RED_TERRACOTTA_WALL);
		this.addDrop(SSWPBlocks.ORANGE_TERRACOTTA_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.ORANGE_TERRACOTTA_STAIRS);
		this.addDrop(SSWPBlocks.ORANGE_TERRACOTTA_WALL);
		this.addDrop(SSWPBlocks.YELLOW_TERRACOTTA_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.YELLOW_TERRACOTTA_STAIRS);
		this.addDrop(SSWPBlocks.YELLOW_TERRACOTTA_WALL);
		this.addDrop(SSWPBlocks.LIME_TERRACOTTA_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.LIME_TERRACOTTA_STAIRS);
		this.addDrop(SSWPBlocks.LIME_TERRACOTTA_WALL);
		this.addDrop(SSWPBlocks.GREEN_TERRACOTTA_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.GREEN_TERRACOTTA_STAIRS);
		this.addDrop(SSWPBlocks.GREEN_TERRACOTTA_WALL);
		this.addDrop(SSWPBlocks.CYAN_TERRACOTTA_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.CYAN_TERRACOTTA_STAIRS);
		this.addDrop(SSWPBlocks.CYAN_TERRACOTTA_WALL);
		this.addDrop(SSWPBlocks.LIGHT_BLUE_TERRACOTTA_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.LIGHT_BLUE_TERRACOTTA_STAIRS);
		this.addDrop(SSWPBlocks.LIGHT_BLUE_TERRACOTTA_WALL);
		this.addDrop(SSWPBlocks.BLUE_TERRACOTTA_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.BLUE_TERRACOTTA_STAIRS);
		this.addDrop(SSWPBlocks.BLUE_TERRACOTTA_WALL);
		this.addDrop(SSWPBlocks.PURPLE_TERRACOTTA_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.PURPLE_TERRACOTTA_STAIRS);
		this.addDrop(SSWPBlocks.PURPLE_TERRACOTTA_WALL);
		this.addDrop(SSWPBlocks.MAGENTA_TERRACOTTA_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.MAGENTA_TERRACOTTA_STAIRS);
		this.addDrop(SSWPBlocks.MAGENTA_TERRACOTTA_WALL);
		this.addDrop(SSWPBlocks.PINK_TERRACOTTA_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.PINK_TERRACOTTA_STAIRS);
		this.addDrop(SSWPBlocks.PINK_TERRACOTTA_WALL);
		
		this.addDrop(SSWPBlocks.WHITE_CONCRETE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.WHITE_CONCRETE_STAIRS);
		this.addDrop(SSWPBlocks.WHITE_CONCRETE_WALL);
		this.addDrop(SSWPBlocks.LIGHT_GRAY_CONCRETE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.LIGHT_GRAY_CONCRETE_STAIRS);
		this.addDrop(SSWPBlocks.LIGHT_GRAY_CONCRETE_WALL);
		this.addDrop(SSWPBlocks.GRAY_CONCRETE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.GRAY_CONCRETE_STAIRS);
		this.addDrop(SSWPBlocks.GRAY_CONCRETE_WALL);
		this.addDrop(SSWPBlocks.BLACK_CONCRETE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.BLACK_CONCRETE_STAIRS);
		this.addDrop(SSWPBlocks.BLACK_CONCRETE_WALL);
		this.addDrop(SSWPBlocks.BROWN_CONCRETE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.BROWN_CONCRETE_STAIRS);
		this.addDrop(SSWPBlocks.BROWN_CONCRETE_WALL);
		this.addDrop(SSWPBlocks.RED_CONCRETE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.RED_CONCRETE_STAIRS);
		this.addDrop(SSWPBlocks.RED_CONCRETE_WALL);
		this.addDrop(SSWPBlocks.ORANGE_CONCRETE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.ORANGE_CONCRETE_STAIRS);
		this.addDrop(SSWPBlocks.ORANGE_CONCRETE_WALL);
		this.addDrop(SSWPBlocks.YELLOW_CONCRETE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.YELLOW_CONCRETE_STAIRS);
		this.addDrop(SSWPBlocks.YELLOW_CONCRETE_WALL);
		this.addDrop(SSWPBlocks.LIME_CONCRETE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.LIME_CONCRETE_STAIRS);
		this.addDrop(SSWPBlocks.LIME_CONCRETE_WALL);
		this.addDrop(SSWPBlocks.GREEN_CONCRETE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.GREEN_CONCRETE_STAIRS);
		this.addDrop(SSWPBlocks.GREEN_CONCRETE_WALL);
		this.addDrop(SSWPBlocks.CYAN_CONCRETE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.CYAN_CONCRETE_STAIRS);
		this.addDrop(SSWPBlocks.CYAN_CONCRETE_WALL);
		this.addDrop(SSWPBlocks.LIGHT_BLUE_CONCRETE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.LIGHT_BLUE_CONCRETE_STAIRS);
		this.addDrop(SSWPBlocks.LIGHT_BLUE_CONCRETE_WALL);
		this.addDrop(SSWPBlocks.BLUE_CONCRETE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.BLUE_CONCRETE_STAIRS);
		this.addDrop(SSWPBlocks.BLUE_CONCRETE_WALL);
		this.addDrop(SSWPBlocks.PURPLE_CONCRETE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.PURPLE_CONCRETE_STAIRS);
		this.addDrop(SSWPBlocks.PURPLE_CONCRETE_WALL);
		this.addDrop(SSWPBlocks.MAGENTA_CONCRETE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.MAGENTA_CONCRETE_STAIRS);
		this.addDrop(SSWPBlocks.MAGENTA_CONCRETE_WALL);
		this.addDrop(SSWPBlocks.PINK_CONCRETE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.PINK_CONCRETE_STAIRS);
		this.addDrop(SSWPBlocks.PINK_CONCRETE_WALL);
		
		this.addDrop(SSWPBlocks.GLASS_SLAB, this::slabDropsWithSilkTouch);
		this.addDrop(SSWPBlocks.GLASS_STAIRS, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.GLASS_WALL, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.TINTED_GLASS_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.TINTED_GLASS_STAIRS);
		this.addDrop(SSWPBlocks.TINTED_GLASS_WALL);
		this.addDrop(SSWPBlocks.TINTED_GLASS_PANE);
		this.addDrop(SSWPBlocks.WHITE_STAINED_GLASS_SLAB, this::slabDropsWithSilkTouch);
		this.addDrop(SSWPBlocks.WHITE_STAINED_GLASS_STAIRS, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.WHITE_STAINED_GLASS_WALL, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB, this::slabDropsWithSilkTouch);
		this.addDrop(SSWPBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.LIGHT_GRAY_STAINED_GLASS_WALL, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.GRAY_STAINED_GLASS_SLAB, this::slabDropsWithSilkTouch);
		this.addDrop(SSWPBlocks.GRAY_STAINED_GLASS_STAIRS, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.GRAY_STAINED_GLASS_WALL, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.BLACK_STAINED_GLASS_SLAB, this::slabDropsWithSilkTouch);
		this.addDrop(SSWPBlocks.BLACK_STAINED_GLASS_STAIRS, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.BLACK_STAINED_GLASS_WALL, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.BROWN_STAINED_GLASS_SLAB, this::slabDropsWithSilkTouch);
		this.addDrop(SSWPBlocks.BROWN_STAINED_GLASS_STAIRS, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.BROWN_STAINED_GLASS_WALL, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.RED_STAINED_GLASS_SLAB, this::slabDropsWithSilkTouch);
		this.addDrop(SSWPBlocks.RED_STAINED_GLASS_STAIRS, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.RED_STAINED_GLASS_WALL, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.ORANGE_STAINED_GLASS_SLAB, this::slabDropsWithSilkTouch);
		this.addDrop(SSWPBlocks.ORANGE_STAINED_GLASS_STAIRS, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.ORANGE_STAINED_GLASS_WALL, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.YELLOW_STAINED_GLASS_SLAB, this::slabDropsWithSilkTouch);
		this.addDrop(SSWPBlocks.YELLOW_STAINED_GLASS_STAIRS, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.YELLOW_STAINED_GLASS_WALL, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.LIME_STAINED_GLASS_SLAB, this::slabDropsWithSilkTouch);
		this.addDrop(SSWPBlocks.LIME_STAINED_GLASS_STAIRS, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.LIME_STAINED_GLASS_WALL, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.GREEN_STAINED_GLASS_SLAB, this::slabDropsWithSilkTouch);
		this.addDrop(SSWPBlocks.GREEN_STAINED_GLASS_STAIRS, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.GREEN_STAINED_GLASS_WALL, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.CYAN_STAINED_GLASS_SLAB, this::slabDropsWithSilkTouch);
		this.addDrop(SSWPBlocks.CYAN_STAINED_GLASS_STAIRS, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.CYAN_STAINED_GLASS_WALL, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB, this::slabDropsWithSilkTouch);
		this.addDrop(SSWPBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.LIGHT_BLUE_STAINED_GLASS_WALL, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.BLUE_STAINED_GLASS_SLAB, this::slabDropsWithSilkTouch);
		this.addDrop(SSWPBlocks.BLUE_STAINED_GLASS_STAIRS, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.BLUE_STAINED_GLASS_WALL, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.PURPLE_STAINED_GLASS_SLAB, this::slabDropsWithSilkTouch);
		this.addDrop(SSWPBlocks.PURPLE_STAINED_GLASS_STAIRS, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.PURPLE_STAINED_GLASS_WALL, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.MAGENTA_STAINED_GLASS_SLAB, this::slabDropsWithSilkTouch);
		this.addDrop(SSWPBlocks.MAGENTA_STAINED_GLASS_STAIRS, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.MAGENTA_STAINED_GLASS_WALL, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.PINK_STAINED_GLASS_SLAB, this::slabDropsWithSilkTouch);
		this.addDrop(SSWPBlocks.PINK_STAINED_GLASS_STAIRS, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.PINK_STAINED_GLASS_WALL, this::dropsWithSilkTouch);
		
		this.addDrop(SSWPBlocks.GRASS_SLAB, block -> this.slabDrops(block, SSWPBlocks.DIRT_SLAB));
		this.addDrop(SSWPBlocks.GRASS_STAIRS, block -> this.drops(block, SSWPBlocks.DIRT_STAIRS));
		this.addDrop(SSWPBlocks.GRASS_WALL, block -> this.drops(block, SSWPBlocks.DIRT_WALL));
		this.addDrop(SSWPBlocks.PODZOL_SLAB, block -> this.slabDrops(block, SSWPBlocks.DIRT_SLAB));
		this.addDrop(SSWPBlocks.PODZOL_STAIRS, block -> this.drops(block, SSWPBlocks.DIRT_STAIRS));
		this.addDrop(SSWPBlocks.PODZOL_WALL, block -> this.drops(block, SSWPBlocks.DIRT_WALL));
		this.addDrop(SSWPBlocks.MYCELIUM_SLAB, block -> this.slabDrops(block, SSWPBlocks.DIRT_SLAB));
		this.addDrop(SSWPBlocks.MYCELIUM_STAIRS, block -> this.drops(block, SSWPBlocks.DIRT_STAIRS));
		this.addDrop(SSWPBlocks.MYCELIUM_WALL, block -> this.drops(block, SSWPBlocks.DIRT_WALL));
		this.addDrop(SSWPBlocks.DIRT_PATH_SLAB, block -> this.slabDropsNoSilk(block, SSWPBlocks.DIRT_SLAB));
		this.addDrop(SSWPBlocks.DIRT_PATH_STAIRS, SSWPBlocks.DIRT_STAIRS);
		this.addDrop(SSWPBlocks.DIRT_PATH_WALL, SSWPBlocks.DIRT_WALL);
		this.addDrop(SSWPBlocks.DIRT_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.DIRT_STAIRS);
		this.addDrop(SSWPBlocks.DIRT_WALL);
		this.addDrop(SSWPBlocks.COARSE_DIRT_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.COARSE_DIRT_STAIRS);
		this.addDrop(SSWPBlocks.COARSE_DIRT_WALL);
		this.addDrop(SSWPBlocks.ROOTED_DIRT_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.ROOTED_DIRT_STAIRS);
		this.addDrop(SSWPBlocks.ROOTED_DIRT_WALL);
		
		this.addDrop(SSWPBlocks.MUD_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.MUD_STAIRS);
		this.addDrop(SSWPBlocks.MUD_WALL);
		
		this.addDrop(SSWPBlocks.CLAY_SLAB, block -> this.slabDrops(
				block,
				Items.CLAY_BALL,
				ConstantLootNumberProvider.create(4.0f),
				ConstantLootNumberProvider.create(2.0f)));
		this.addDrop(SSWPBlocks.CLAY_STAIRS, block -> this.drops(
				block,
				Items.CLAY_BALL,
				ConstantLootNumberProvider.create(4.0f)));
		this.addDrop(SSWPBlocks.CLAY_WALL, block -> this.drops(
				block,
				Items.CLAY_BALL,
				ConstantLootNumberProvider.create(4.0f)));
		
		this.addDrop(SSWPBlocks.ICE_SLAB, this::slabDropsWithSilkTouch);
		this.addDrop(SSWPBlocks.ICE_STAIRS, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.ICE_WALL, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.PACKED_ICE_SLAB, this::slabDropsWithSilkTouch);
		this.addDrop(SSWPBlocks.PACKED_ICE_STAIRS, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.PACKED_ICE_WALL, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.BLUE_ICE_SLAB, this::slabDropsWithSilkTouch);
		this.addDrop(SSWPBlocks.BLUE_ICE_STAIRS, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.BLUE_ICE_WALL, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.SNOW_SLAB, block -> this.slabDrops(
				block,
				Items.SNOWBALL,
				ConstantLootNumberProvider.create(4.0f),
				ConstantLootNumberProvider.create(2.0f)));
		this.addDrop(SSWPBlocks.SNOW_STAIRS, block -> this.drops(
				block,
				Items.SNOWBALL,
				ConstantLootNumberProvider.create(4.0f)));
		this.addDrop(SSWPBlocks.SNOW_WALL, block -> this.drops(
				block,
				Items.SNOWBALL,
				ConstantLootNumberProvider.create(4.0f)));
		
		this.addDrop(SSWPBlocks.MOSS_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.MOSS_STAIRS);
		this.addDrop(SSWPBlocks.MOSS_WALL);
		
		this.addDrop(SSWPBlocks.CALCITE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.CALCITE_STAIRS);
		this.addDrop(SSWPBlocks.CALCITE_WALL);
		this.addDrop(SSWPBlocks.DRIPSTONE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.DRIPSTONE_STAIRS);
		this.addDrop(SSWPBlocks.DRIPSTONE_WALL);
		
		this.addDrop(SSWPBlocks.MAGMA_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.MAGMA_STAIRS);
		this.addDrop(SSWPBlocks.MAGMA_WALL);
		
		this.addDrop(SSWPBlocks.OBSIDIAN_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.OBSIDIAN_STAIRS);
		this.addDrop(SSWPBlocks.OBSIDIAN_WALL);
		this.addDrop(SSWPBlocks.CRYING_OBSIDIAN_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.CRYING_OBSIDIAN_STAIRS);
		this.addDrop(SSWPBlocks.CRYING_OBSIDIAN_WALL);
		
		this.addDrop(SSWPBlocks.CRIMSON_NYLIUM_SLAB, block -> this.slabDrops(block, SSWPItems.NETHERRACK_SLAB));
		this.addDrop(SSWPBlocks.CRIMSON_NYLIUM_STAIRS, block -> this.drops(block, SSWPItems.NETHERRACK_STAIRS));
		this.addDrop(SSWPBlocks.CRIMSON_NYLIUM_WALL, block -> this.drops(block, SSWPItems.NETHERRACK_WALL));
		this.addDrop(SSWPBlocks.WARPED_NYLIUM_SLAB, block -> this.slabDrops(block, SSWPItems.NETHERRACK_SLAB));
		this.addDrop(SSWPBlocks.WARPED_NYLIUM_STAIRS, block -> this.drops(block, SSWPItems.NETHERRACK_STAIRS));
		this.addDrop(SSWPBlocks.WARPED_NYLIUM_WALL, block -> this.drops(block, SSWPItems.NETHERRACK_WALL));
		
		this.addDrop(SSWPBlocks.SOUL_SAND_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.SOUL_SAND_STAIRS);
		this.addDrop(SSWPBlocks.SOUL_SAND_WALL);
		this.addDrop(SSWPBlocks.SOUL_SOIL_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.SOUL_SOIL_STAIRS);
		this.addDrop(SSWPBlocks.SOUL_SOIL_WALL);
		
		this.addDrop(SSWPBlocks.BONE_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.BONE_STAIRS);
		this.addDrop(SSWPBlocks.BONE_WALL);
		
		this.addDrop(SSWPBlocks.COAL_ORE_SLAB, block -> this.oreSlabDrops(block, Items.COAL));
		this.addDrop(SSWPBlocks.COAL_ORE_STAIRS, block -> this.oreDrops(block, Items.COAL));
		this.addDrop(SSWPBlocks.COAL_ORE_WALL, block -> this.oreDrops(block, Items.COAL));
		this.addDrop(SSWPBlocks.DEEPSLATE_COAL_ORE_SLAB, block -> this.oreSlabDrops(block, Items.COAL));
		this.addDrop(SSWPBlocks.DEEPSLATE_COAL_ORE_STAIRS, block -> this.oreDrops(block, Items.COAL));
		this.addDrop(SSWPBlocks.DEEPSLATE_COAL_ORE_WALL, block -> this.oreDrops(block, Items.COAL));
		
		this.addDrop(SSWPBlocks.IRON_ORE_SLAB, block -> this.oreSlabDrops(block, Items.RAW_IRON));
		this.addDrop(SSWPBlocks.IRON_ORE_STAIRS, block -> this.oreDrops(block, Items.RAW_IRON));
		this.addDrop(SSWPBlocks.IRON_ORE_WALL, block -> this.oreDrops(block, Items.RAW_IRON));
		this.addDrop(SSWPBlocks.DEEPSLATE_IRON_ORE_SLAB, block -> this.oreSlabDrops(block, Items.RAW_IRON));
		this.addDrop(SSWPBlocks.DEEPSLATE_IRON_ORE_STAIRS, block -> this.oreDrops(block, Items.RAW_IRON));
		this.addDrop(SSWPBlocks.DEEPSLATE_IRON_ORE_WALL, block -> this.oreDrops(block, Items.RAW_IRON));
		
		this.addDrop(SSWPBlocks.COPPER_ORE_SLAB, this::copperOreSlabDrops);
		this.addDrop(SSWPBlocks.COPPER_ORE_STAIRS, this::copperOreDrops);
		this.addDrop(SSWPBlocks.COPPER_ORE_WALL, this::copperOreDrops);
		this.addDrop(SSWPBlocks.DEEPSLATE_COPPER_ORE_SLAB, this::copperOreSlabDrops);
		this.addDrop(SSWPBlocks.DEEPSLATE_COPPER_ORE_STAIRS, this::copperOreDrops);
		this.addDrop(SSWPBlocks.DEEPSLATE_COPPER_ORE_WALL, this::copperOreDrops);
		
		this.addDrop(SSWPBlocks.GOLD_ORE_SLAB, block -> this.oreSlabDrops(block, Items.RAW_GOLD));
		this.addDrop(SSWPBlocks.GOLD_ORE_STAIRS, block -> this.oreDrops(block, Items.RAW_GOLD));
		this.addDrop(SSWPBlocks.GOLD_ORE_WALL, block -> this.oreDrops(block, Items.RAW_GOLD));
		this.addDrop(SSWPBlocks.DEEPSLATE_GOLD_ORE_SLAB, block -> this.oreSlabDrops(block, Items.RAW_GOLD));
		this.addDrop(SSWPBlocks.DEEPSLATE_GOLD_ORE_STAIRS, block -> this.oreDrops(block, Items.RAW_GOLD));
		this.addDrop(SSWPBlocks.DEEPSLATE_GOLD_ORE_WALL, block -> this.oreDrops(block, Items.RAW_GOLD));
		
		this.addDrop(SSWPBlocks.REDSTONE_ORE_SLAB, this::redstoneOreSlabDrops);
		this.addDrop(SSWPBlocks.REDSTONE_ORE_STAIRS, this::redstoneOreDrops);
		this.addDrop(SSWPBlocks.REDSTONE_ORE_WALL, this::redstoneOreDrops);
		this.addDrop(SSWPBlocks.DEEPSLATE_REDSTONE_ORE_SLAB, this::redstoneOreSlabDrops);
		this.addDrop(SSWPBlocks.DEEPSLATE_REDSTONE_ORE_STAIRS, this::redstoneOreDrops);
		this.addDrop(SSWPBlocks.DEEPSLATE_REDSTONE_ORE_WALL, this::redstoneOreDrops);
		
		this.addDrop(SSWPBlocks.EMERALD_ORE_SLAB, block -> this.oreSlabDrops(block, Items.EMERALD));
		this.addDrop(SSWPBlocks.EMERALD_ORE_STAIRS, block -> this.oreDrops(block, Items.EMERALD));
		this.addDrop(SSWPBlocks.EMERALD_ORE_WALL, block -> this.oreDrops(block, Items.EMERALD));
		this.addDrop(SSWPBlocks.DEEPSLATE_EMERALD_ORE_SLAB, block -> this.oreSlabDrops(block, Items.EMERALD));
		this.addDrop(SSWPBlocks.DEEPSLATE_EMERALD_ORE_STAIRS, block -> this.oreDrops(block, Items.EMERALD));
		this.addDrop(SSWPBlocks.DEEPSLATE_EMERALD_ORE_WALL, block -> this.oreDrops(block, Items.EMERALD));
		
		this.addDrop(SSWPBlocks.LAPIS_ORE_SLAB, this::lapisOreSlabDrops);
		this.addDrop(SSWPBlocks.LAPIS_ORE_STAIRS, this::lapisOreDrops);
		this.addDrop(SSWPBlocks.LAPIS_ORE_WALL, this::lapisOreDrops);
		this.addDrop(SSWPBlocks.DEEPSLATE_LAPIS_ORE_SLAB, this::lapisOreSlabDrops);
		this.addDrop(SSWPBlocks.DEEPSLATE_LAPIS_ORE_STAIRS, this::lapisOreDrops);
		this.addDrop(SSWPBlocks.DEEPSLATE_LAPIS_ORE_WALL, this::lapisOreDrops);
		
		this.addDrop(SSWPBlocks.DIAMOND_ORE_SLAB, block -> this.oreSlabDrops(block, Items.DIAMOND));
		this.addDrop(SSWPBlocks.DIAMOND_ORE_STAIRS, block -> this.oreDrops(block, Items.DIAMOND));
		this.addDrop(SSWPBlocks.DIAMOND_ORE_WALL, block -> this.oreDrops(block, Items.DIAMOND));
		this.addDrop(SSWPBlocks.DEEPSLATE_DIAMOND_ORE_SLAB, block -> this.oreSlabDrops(block, Items.DIAMOND));
		this.addDrop(SSWPBlocks.DEEPSLATE_DIAMOND_ORE_STAIRS, block -> this.oreDrops(block, Items.DIAMOND));
		this.addDrop(SSWPBlocks.DEEPSLATE_DIAMOND_ORE_WALL, block -> this.oreDrops(block, Items.DIAMOND));
		
		this.addDrop(SSWPBlocks.NETHER_QUARTZ_ORE_SLAB, block -> this.oreSlabDrops(block, Items.QUARTZ));
		this.addDrop(SSWPBlocks.NETHER_QUARTZ_ORE_STAIRS, block -> this.oreDrops(block, Items.QUARTZ));
		this.addDrop(SSWPBlocks.NETHER_QUARTZ_ORE_WALL, block -> this.oreDrops(block, Items.QUARTZ));
		
		this.addDrop(SSWPBlocks.NETHER_GOLD_ORE_SLAB, this::netherGoldOreSlabDrops);
		this.addDrop(SSWPBlocks.NETHER_GOLD_ORE_STAIRS, this::netherGoldOreDrops);
		this.addDrop(SSWPBlocks.NETHER_GOLD_ORE_WALL, this::netherGoldOreDrops);
		
		this.addDrop(SSWPBlocks.ANCIENT_DEBRIS_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.ANCIENT_DEBRIS_STAIRS);
		this.addDrop(SSWPBlocks.ANCIENT_DEBRIS_WALL);
		
		this.addDrop(SSWPBlocks.RAW_IRON_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.RAW_IRON_STAIRS);
		this.addDrop(SSWPBlocks.RAW_IRON_WALL);
		
		this.addDrop(SSWPBlocks.RAW_COPPER_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.RAW_COPPER_STAIRS);
		this.addDrop(SSWPBlocks.RAW_COPPER_WALL);
		
		this.addDrop(SSWPBlocks.RAW_GOLD_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.RAW_GOLD_STAIRS);
		this.addDrop(SSWPBlocks.RAW_GOLD_WALL);
		
		this.addDrop(SSWPBlocks.GLOWSTONE_SLAB, block -> this.slabDrops(
				block,
				Items.GLOWSTONE_DUST,
				UniformLootNumberProvider.create(2.0f, 4.0f),
				UniformLootNumberProvider.create(1.0f, 2.0f),
				ApplyBonusLootFunction::uniformBonusCount,
				BoundedIntUnaryOperator.create(1, 4),
				BoundedIntUnaryOperator.create(1, 2)));
		this.addDrop(SSWPBlocks.GLOWSTONE_STAIRS, block -> this.drops(
				block,
				Items.GLOWSTONE_DUST,
				UniformLootNumberProvider.create(2.0f, 4.0f),
				ApplyBonusLootFunction::uniformBonusCount,
				BoundedIntUnaryOperator.create(1, 4)));
		this.addDrop(SSWPBlocks.GLOWSTONE_WALL, block -> this.drops(
				block,
				Items.GLOWSTONE_DUST,
				UniformLootNumberProvider.create(2.0f, 4.0f),
				ApplyBonusLootFunction::uniformBonusCount,
				BoundedIntUnaryOperator.create(1, 4)));
		
		this.addDrop(SSWPBlocks.MANGROVE_ROOT_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.MANGROVE_ROOT_STAIRS);
		this.addDrop(SSWPBlocks.MANGROVE_ROOT_WALL);
		this.addDrop(SSWPBlocks.MANGROVE_ROOT_CARPET);
		this.addDrop(SSWPBlocks.MUDDY_MANGROVE_ROOT_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.MUDDY_MANGROVE_ROOT_STAIRS);
		this.addDrop(SSWPBlocks.MUDDY_MANGROVE_ROOT_WALL);
		
		this.addDrop(SSWPBlocks.MUSHROOM_STEM_SLAB, this::slabDropsWithSilkTouch);
		this.addDrop(SSWPBlocks.MUSHROOM_STEM_STAIRS, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.MUSHROOM_STEM_WALL, this::dropsWithSilkTouch);
		
		this.addDrop(SSWPBlocks.OAK_LEAF_SLAB, this::slabDropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.OAK_LEAF_STAIRS, this::dropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.OAK_LEAF_WALL, this::dropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.OAK_LEAF_CARPET, this::dropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.SPRUCE_LEAF_SLAB, this::slabDropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.SPRUCE_LEAF_STAIRS, this::dropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.SPRUCE_LEAF_WALL, this::dropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.SPRUCE_LEAF_CARPET, this::dropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.BIRCH_LEAF_SLAB, this::slabDropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.BIRCH_LEAF_STAIRS, this::dropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.BIRCH_LEAF_WALL, this::dropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.BIRCH_LEAF_CARPET, this::dropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.JUNGLE_LEAF_SLAB, this::slabDropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.JUNGLE_LEAF_STAIRS, this::dropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.JUNGLE_LEAF_WALL, this::dropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.JUNGLE_LEAF_CARPET, this::dropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.ACACIA_LEAF_SLAB, this::slabDropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.ACACIA_LEAF_STAIRS, this::dropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.ACACIA_LEAF_WALL, this::dropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.ACACIA_LEAF_CARPET, this::dropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.DARK_OAK_LEAF_SLAB, this::slabDropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.DARK_OAK_LEAF_STAIRS, this::dropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.DARK_OAK_LEAF_WALL, this::dropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.DARK_OAK_LEAF_CARPET, this::dropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.MANGROVE_LEAF_SLAB, this::slabDropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.MANGROVE_LEAF_STAIRS, this::dropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.MANGROVE_LEAF_WALL, this::dropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.MANGROVE_LEAF_CARPET, this::dropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.CHERRY_LEAF_SLAB, this::slabDropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.CHERRY_LEAF_STAIRS, this::dropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.CHERRY_LEAF_WALL, this::dropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.CHERRY_LEAF_CARPET, this::dropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.AZALEA_LEAF_SLAB, this::slabDropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.AZALEA_LEAF_STAIRS, this::dropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.AZALEA_LEAF_WALL, this::dropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.AZALEA_LEAF_CARPET, this::dropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.FLOWERING_AZALEA_LEAF_SLAB, this::slabDropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.FLOWERING_AZALEA_LEAF_STAIRS, this::dropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.FLOWERING_AZALEA_LEAF_WALL, this::dropsWithSilkTouchOrShears);
		this.addDrop(SSWPBlocks.FLOWERING_AZALEA_LEAF_CARPET, this::dropsWithSilkTouchOrShears);
		
		this.addDrop(SSWPBlocks.BROWN_MUSHROOM_SLAB, this::slabDropsWithSilkTouch);
		this.addDrop(SSWPBlocks.BROWN_MUSHROOM_STAIRS, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.BROWN_MUSHROOM_WALL, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.RED_MUSHROOM_SLAB, this::slabDropsWithSilkTouch);
		this.addDrop(SSWPBlocks.RED_MUSHROOM_STAIRS, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.RED_MUSHROOM_WALL, this::dropsWithSilkTouch);
		
		this.addDrop(SSWPBlocks.NETHER_WART_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.NETHER_WART_STAIRS);
		this.addDrop(SSWPBlocks.NETHER_WART_WALL);
		this.addDrop(SSWPBlocks.WARPED_WART_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.WARPED_WART_STAIRS);
		this.addDrop(SSWPBlocks.WARPED_WART_WALL);
		
		this.addDrop(SSWPBlocks.SHROOMLIGHT_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.SHROOMLIGHT_STAIRS);
		this.addDrop(SSWPBlocks.SHROOMLIGHT_WALL);
		
		this.addDrop(SSWPBlocks.DRIED_KELP_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.DRIED_KELP_STAIRS);
		this.addDrop(SSWPBlocks.DRIED_KELP_WALL);
		
		this.addDrop(SSWPBlocks.TUBE_CORAL_SLAB, block -> this.slabDrops(block, SSWPBlocks.DEAD_TUBE_CORAL_SLAB));
		this.addDrop(SSWPBlocks.TUBE_CORAL_STAIRS, block -> this.drops(block, SSWPBlocks.DEAD_TUBE_CORAL_STAIRS));
		this.addDrop(SSWPBlocks.TUBE_CORAL_WALL, block -> this.drops(block, SSWPBlocks.DEAD_TUBE_CORAL_WALL));
		this.addDrop(SSWPBlocks.BRAIN_CORAL_SLAB, block -> this.slabDrops(block, SSWPBlocks.DEAD_BRAIN_CORAL_SLAB));
		this.addDrop(SSWPBlocks.BRAIN_CORAL_STAIRS, block -> this.drops(block, SSWPBlocks.DEAD_BRAIN_CORAL_STAIRS));
		this.addDrop(SSWPBlocks.BRAIN_CORAL_WALL, block -> this.drops(block, SSWPBlocks.DEAD_BRAIN_CORAL_WALL));
		this.addDrop(SSWPBlocks.BUBBLE_CORAL_SLAB, block -> this.slabDrops(block, SSWPBlocks.DEAD_BUBBLE_CORAL_SLAB));
		this.addDrop(SSWPBlocks.BUBBLE_CORAL_STAIRS, block -> this.drops(block, SSWPBlocks.DEAD_BUBBLE_CORAL_STAIRS));
		this.addDrop(SSWPBlocks.BUBBLE_CORAL_WALL, block -> this.drops(block, SSWPBlocks.DEAD_BUBBLE_CORAL_WALL));
		this.addDrop(SSWPBlocks.FIRE_CORAL_SLAB, block -> this.slabDrops(block, SSWPBlocks.DEAD_FIRE_CORAL_SLAB));
		this.addDrop(SSWPBlocks.FIRE_CORAL_STAIRS, block -> this.drops(block, SSWPBlocks.DEAD_FIRE_CORAL_STAIRS));
		this.addDrop(SSWPBlocks.FIRE_CORAL_WALL, block -> this.drops(block, SSWPBlocks.DEAD_FIRE_CORAL_WALL));
		this.addDrop(SSWPBlocks.HORN_CORAL_SLAB, block -> this.slabDrops(block, SSWPBlocks.DEAD_HORN_CORAL_SLAB));
		this.addDrop(SSWPBlocks.HORN_CORAL_STAIRS, block -> this.drops(block, SSWPBlocks.DEAD_HORN_CORAL_STAIRS));
		this.addDrop(SSWPBlocks.HORN_CORAL_WALL, block -> this.drops(block, SSWPBlocks.DEAD_HORN_CORAL_WALL));
		
		this.addDrop(SSWPBlocks.DEAD_TUBE_CORAL_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.DEAD_TUBE_CORAL_STAIRS);
		this.addDrop(SSWPBlocks.DEAD_TUBE_CORAL_WALL);
		this.addDrop(SSWPBlocks.DEAD_BRAIN_CORAL_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.DEAD_BRAIN_CORAL_STAIRS);
		this.addDrop(SSWPBlocks.DEAD_BRAIN_CORAL_WALL);
		this.addDrop(SSWPBlocks.DEAD_BUBBLE_CORAL_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.DEAD_BUBBLE_CORAL_STAIRS);
		this.addDrop(SSWPBlocks.DEAD_BUBBLE_CORAL_WALL);
		this.addDrop(SSWPBlocks.DEAD_FIRE_CORAL_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.DEAD_FIRE_CORAL_STAIRS);
		this.addDrop(SSWPBlocks.DEAD_FIRE_CORAL_WALL);
		this.addDrop(SSWPBlocks.DEAD_HORN_CORAL_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.DEAD_HORN_CORAL_STAIRS);
		this.addDrop(SSWPBlocks.DEAD_HORN_CORAL_WALL);
		
		this.addDrop(SSWPBlocks.HAY_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.HAY_STAIRS);
		this.addDrop(SSWPBlocks.HAY_WALL);
		
		this.addDrop(SSWPBlocks.HONEYCOMB_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.HONEYCOMB_STAIRS);
		this.addDrop(SSWPBlocks.HONEYCOMB_WALL);
		
		this.addDrop(SSWPBlocks.OCHRE_FROGLIGHT_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.OCHRE_FROGLIGHT_STAIRS);
		this.addDrop(SSWPBlocks.OCHRE_FROGLIGHT_WALL);
		this.addDrop(SSWPBlocks.VERDANT_FROGLIGHT_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.VERDANT_FROGLIGHT_STAIRS);
		this.addDrop(SSWPBlocks.VERDANT_FROGLIGHT_WALL);
		this.addDrop(SSWPBlocks.PEARLESCENT_FROGLIGHT_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.PEARLESCENT_FROGLIGHT_STAIRS);
		this.addDrop(SSWPBlocks.PEARLESCENT_FROGLIGHT_WALL);
		
		this.addDrop(SSWPBlocks.SCULK_SLAB, this::slabDropsWithSilkTouch);
		this.addDrop(SSWPBlocks.SCULK_STAIRS, this::dropsWithSilkTouch);
		this.addDrop(SSWPBlocks.SCULK_WALL, this::dropsWithSilkTouch);
		
		this.addDrop(SSWPBlocks.REDSTONE_LAMP_SLAB, this::slabDrops);
		this.addDrop(SSWPBlocks.REDSTONE_LAMP_STAIRS);
		this.addDrop(SSWPBlocks.REDSTONE_LAMP_WALL);
		
		this.addDropWithSilkTouch(SSWPBlocks.INFESTED_MOSSY_COBBLESTONE, Blocks.MOSSY_COBBLESTONE);
		this.addDropWithSilkTouch(SSWPBlocks.INFESTED_SMOOTH_STONE, Blocks.SMOOTH_STONE);
		this.addDropWithSilkTouch(SSWPBlocks.INFESTED_GRANITE, Blocks.GRANITE);
		this.addDropWithSilkTouch(SSWPBlocks.INFESTED_POLISHED_GRANITE, Blocks.POLISHED_GRANITE);
		this.addDropWithSilkTouch(SSWPBlocks.INFESTED_DIORITE, Blocks.DIORITE);
		this.addDropWithSilkTouch(SSWPBlocks.INFESTED_POLISHED_DIORITE, Blocks.POLISHED_DIORITE);
		this.addDropWithSilkTouch(SSWPBlocks.INFESTED_ANDESITE, Blocks.ANDESITE);
		this.addDropWithSilkTouch(SSWPBlocks.INFESTED_POLISHED_ANDESITE, Blocks.POLISHED_ANDESITE);
		this.addDropWithSilkTouch(SSWPBlocks.INFESTED_COBBLED_DEEPSLATE, Blocks.COBBLED_DEEPSLATE);
		this.addDropWithSilkTouch(SSWPBlocks.INFESTED_CHISELED_DEEPSLATE, Blocks.CHISELED_DEEPSLATE);
		this.addDropWithSilkTouch(SSWPBlocks.INFESTED_POLISHED_DEEPSLATE, Blocks.POLISHED_DEEPSLATE);
		this.addDropWithSilkTouch(SSWPBlocks.INFESTED_DEEPSLATE_BRICKS, Blocks.DEEPSLATE_BRICKS);
		this.addDropWithSilkTouch(SSWPBlocks.INFESTED_CRACKED_DEEPSLATE_BRICKS, Blocks.CRACKED_DEEPSLATE_BRICKS);
		this.addDropWithSilkTouch(SSWPBlocks.INFESTED_DEEPSLATE_TILES, Blocks.DEEPSLATE_TILES);
		this.addDropWithSilkTouch(SSWPBlocks.INFESTED_CRACKED_DEEPSLATE_TILES, Blocks.CRACKED_DEEPSLATE_TILES);
		this.addDropWithSilkTouch(SSWPBlocks.INFESTED_TUFF, Blocks.TUFF);
		this.addDropWithSilkTouch(SSWPBlocks.INFESTED_CHISELED_TUFF, Blocks.CHISELED_TUFF);
		this.addDropWithSilkTouch(SSWPBlocks.INFESTED_POLISHED_TUFF, Blocks.POLISHED_TUFF);
		this.addDropWithSilkTouch(SSWPBlocks.INFESTED_TUFF_BRICKS, Blocks.TUFF_BRICKS);
		this.addDropWithSilkTouch(SSWPBlocks.INFESTED_CHISELED_TUFF_BRICKS, Blocks.CHISELED_TUFF_BRICKS);
		this.addDropWithSilkTouch(SSWPBlocks.INFESTED_CALCITE, Blocks.CALCITE);
		this.addDropWithSilkTouch(SSWPBlocks.INFESTED_DRIPSTONE_BLOCK, Blocks.DRIPSTONE_BLOCK);
		
		this.addDrop(SSWPBlocks.OAK_LADDER);
		this.addDrop(SSWPBlocks.SPRUCE_LADDER);
		this.addDrop(SSWPBlocks.BIRCH_LADDER);
		this.addDrop(SSWPBlocks.JUNGLE_LADDER);
		this.addDrop(SSWPBlocks.ACACIA_LADDER);
		this.addDrop(SSWPBlocks.DARK_OAK_LADDER);
		this.addDrop(SSWPBlocks.MANGROVE_LADDER);
		this.addDrop(SSWPBlocks.CHERRY_LADDER);
		this.addDrop(SSWPBlocks.BAMBOO_LADDER);
		this.addDrop(SSWPBlocks.CRIMSON_LADDER);
		this.addDrop(SSWPBlocks.WARPED_LADDER);
		
		this.addDrop(SSWPBlocks.IRON_LADDER);
		
		this.addDrop(SSWPBlocks.GOLD_LADDER);
		
		this.addDrop(SSWPBlocks.NETHERITE_LADDER);
		
		this.addDrop(SSWPBlocks.COPPER_LADDER);
		this.addDrop(SSWPBlocks.EXPOSED_COPPER_LADDER);
		this.addDrop(SSWPBlocks.WEATHERED_COPPER_LADDER);
		this.addDrop(SSWPBlocks.OXIDIZED_COPPER_LADDER);
		this.addDrop(SSWPBlocks.WAXED_COPPER_LADDER);
		this.addDrop(SSWPBlocks.WAXED_EXPOSED_COPPER_LADDER);
		this.addDrop(SSWPBlocks.WAXED_WEATHERED_COPPER_LADDER);
		this.addDrop(SSWPBlocks.WAXED_OXIDIZED_COPPER_LADDER);
		
		this.addDrop(SSWPBlocks.IRON_SIGN);
		this.addDrop(SSWPBlocks.IRON_HANGING_SIGN);
		
		this.addDrop(SSWPBlocks.GOLD_SIGN);
		this.addDrop(SSWPBlocks.GOLD_HANGING_SIGN);
		
		this.addDrop(SSWPBlocks.NETHERITE_SIGN);
		this.addDrop(SSWPBlocks.NETHERITE_HANGING_SIGN);
		
		this.addDrop(SSWPBlocks.COPPER_SIGN);
		this.addDrop(SSWPBlocks.COPPER_HANGING_SIGN);
		this.addDrop(SSWPBlocks.EXPOSED_COPPER_SIGN);
		this.addDrop(SSWPBlocks.EXPOSED_COPPER_HANGING_SIGN);
		this.addDrop(SSWPBlocks.WEATHERED_COPPER_SIGN);
		this.addDrop(SSWPBlocks.WEATHERED_COPPER_HANGING_SIGN);
		this.addDrop(SSWPBlocks.OXIDIZED_COPPER_SIGN);
		this.addDrop(SSWPBlocks.OXIDIZED_COPPER_HANGING_SIGN);
		this.addDrop(SSWPBlocks.WAXED_COPPER_SIGN);
		this.addDrop(SSWPBlocks.WAXED_COPPER_HANGING_SIGN);
		this.addDrop(SSWPBlocks.WAXED_EXPOSED_COPPER_SIGN);
		this.addDrop(SSWPBlocks.WAXED_EXPOSED_COPPER_HANGING_SIGN);
		this.addDrop(SSWPBlocks.WAXED_WEATHERED_COPPER_SIGN);
		this.addDrop(SSWPBlocks.WAXED_WEATHERED_COPPER_HANGING_SIGN);
		this.addDrop(SSWPBlocks.WAXED_OXIDIZED_COPPER_SIGN);
		this.addDrop(SSWPBlocks.WAXED_OXIDIZED_COPPER_HANGING_SIGN);
		
		this.addDrop(SSWPBlocks.OAK_BOOKSHELF, this::bookshelfDrops);
		this.addDrop(SSWPBlocks.SPRUCE_BOOKSHELF, this::bookshelfDrops);
		this.addDrop(SSWPBlocks.BIRCH_BOOKSHELF, this::bookshelfDrops);
		this.addDrop(SSWPBlocks.JUNGLE_BOOKSHELF, this::bookshelfDrops);
		this.addDrop(SSWPBlocks.ACACIA_BOOKSHELF, this::bookshelfDrops);
		this.addDrop(SSWPBlocks.DARK_OAK_BOOKSHELF, this::bookshelfDrops);
		this.addDrop(SSWPBlocks.MANGROVE_BOOKSHELF, this::bookshelfDrops);
		this.addDrop(SSWPBlocks.CHERRY_BOOKSHELF, this::bookshelfDrops);
		this.addDrop(SSWPBlocks.BAMBOO_BOOKSHELF, this::bookshelfDrops);
		this.addDrop(SSWPBlocks.CRIMSON_BOOKSHELF, this::bookshelfDrops);
		this.addDrop(SSWPBlocks.WARPED_BOOKSHELF, this::bookshelfDrops);
		
		this.addDrop(SSWPBlocks.OAK_CRAFTING_TABLE);
		this.addDrop(SSWPBlocks.SPRUCE_CRAFTING_TABLE);
		this.addDrop(SSWPBlocks.BIRCH_CRAFTING_TABLE);
		this.addDrop(SSWPBlocks.JUNGLE_CRAFTING_TABLE);
		this.addDrop(SSWPBlocks.ACACIA_CRAFTING_TABLE);
		this.addDrop(SSWPBlocks.DARK_OAK_CRAFTING_TABLE);
		this.addDrop(SSWPBlocks.MANGROVE_CRAFTING_TABLE);
		this.addDrop(SSWPBlocks.CHERRY_CRAFTING_TABLE);
		this.addDrop(SSWPBlocks.BAMBOO_CRAFTING_TABLE);
		this.addDrop(SSWPBlocks.CRIMSON_CRAFTING_TABLE);
		this.addDrop(SSWPBlocks.WARPED_CRAFTING_TABLE);
		
		this.addDrop(SSWPBlocks.OAK_LOOM);
		this.addDrop(SSWPBlocks.SPRUCE_LOOM);
		this.addDrop(SSWPBlocks.BIRCH_LOOM);
		this.addDrop(SSWPBlocks.JUNGLE_LOOM);
		this.addDrop(SSWPBlocks.ACACIA_LOOM);
		this.addDrop(SSWPBlocks.DARK_OAK_LOOM);
		this.addDrop(SSWPBlocks.MANGROVE_LOOM);
		this.addDrop(SSWPBlocks.CHERRY_LOOM);
		this.addDrop(SSWPBlocks.BAMBOO_LOOM);
		this.addDrop(SSWPBlocks.CRIMSON_LOOM);
		this.addDrop(SSWPBlocks.WARPED_LOOM);
		
		this.addDrop(SSWPBlocks.OAK_FLETCHING_TABLE);
		this.addDrop(SSWPBlocks.SPRUCE_FLETCHING_TABLE);
		this.addDrop(SSWPBlocks.BIRCH_FLETCHING_TABLE);
		this.addDrop(SSWPBlocks.JUNGLE_FLETCHING_TABLE);
		this.addDrop(SSWPBlocks.ACACIA_FLETCHING_TABLE);
		this.addDrop(SSWPBlocks.DARK_OAK_FLETCHING_TABLE);
		this.addDrop(SSWPBlocks.MANGROVE_FLETCHING_TABLE);
		this.addDrop(SSWPBlocks.CHERRY_FLETCHING_TABLE);
		this.addDrop(SSWPBlocks.BAMBOO_FLETCHING_TABLE);
		this.addDrop(SSWPBlocks.CRIMSON_FLETCHING_TABLE);
		this.addDrop(SSWPBlocks.WARPED_FLETCHING_TABLE);
		
		this.addDrop(SSWPBlocks.OAK_SMITHING_TABLE);
		this.addDrop(SSWPBlocks.SPRUCE_SMITHING_TABLE);
		this.addDrop(SSWPBlocks.BIRCH_SMITHING_TABLE);
		this.addDrop(SSWPBlocks.JUNGLE_SMITHING_TABLE);
		this.addDrop(SSWPBlocks.ACACIA_SMITHING_TABLE);
		this.addDrop(SSWPBlocks.DARK_OAK_SMITHING_TABLE);
		this.addDrop(SSWPBlocks.MANGROVE_SMITHING_TABLE);
		this.addDrop(SSWPBlocks.CHERRY_SMITHING_TABLE);
		this.addDrop(SSWPBlocks.BAMBOO_SMITHING_TABLE);
		this.addDrop(SSWPBlocks.CRIMSON_SMITHING_TABLE);
		this.addDrop(SSWPBlocks.WARPED_SMITHING_TABLE);
		
		this.addDrop(SSWPBlocks.OAK_COMPOSTER);
		this.addDrop(SSWPBlocks.SPRUCE_COMPOSTER);
		this.addDrop(SSWPBlocks.BIRCH_COMPOSTER);
		this.addDrop(SSWPBlocks.JUNGLE_COMPOSTER);
		this.addDrop(SSWPBlocks.ACACIA_COMPOSTER);
		this.addDrop(SSWPBlocks.DARK_OAK_COMPOSTER);
		this.addDrop(SSWPBlocks.MANGROVE_COMPOSTER);
		this.addDrop(SSWPBlocks.CHERRY_COMPOSTER);
		this.addDrop(SSWPBlocks.BAMBOO_COMPOSTER);
		this.addDrop(SSWPBlocks.CRIMSON_COMPOSTER);
		this.addDrop(SSWPBlocks.WARPED_COMPOSTER);
		
		this.addDrop(SSWPBlocks.OAK_LECTERN);
		this.addDrop(SSWPBlocks.SPRUCE_LECTERN);
		this.addDrop(SSWPBlocks.BIRCH_LECTERN);
		this.addDrop(SSWPBlocks.JUNGLE_LECTERN);
		this.addDrop(SSWPBlocks.ACACIA_LECTERN);
		this.addDrop(SSWPBlocks.DARK_OAK_LECTERN);
		this.addDrop(SSWPBlocks.MANGROVE_LECTERN);
		this.addDrop(SSWPBlocks.CHERRY_LECTERN);
		this.addDrop(SSWPBlocks.BAMBOO_LECTERN);
		this.addDrop(SSWPBlocks.CRIMSON_LECTERN);
		this.addDrop(SSWPBlocks.WARPED_LECTERN);
		
		this.addDrop(SSWPBlocks.OAK_BARREL, this::nameableContainerDrops);
		this.addDrop(SSWPBlocks.SPRUCE_BARREL, this::nameableContainerDrops);
		this.addDrop(SSWPBlocks.BIRCH_BARREL, this::nameableContainerDrops);
		this.addDrop(SSWPBlocks.JUNGLE_BARREL, this::nameableContainerDrops);
		this.addDrop(SSWPBlocks.ACACIA_BARREL, this::nameableContainerDrops);
		this.addDrop(SSWPBlocks.DARK_OAK_BARREL, this::nameableContainerDrops);
		this.addDrop(SSWPBlocks.MANGROVE_BARREL, this::nameableContainerDrops);
		this.addDrop(SSWPBlocks.CHERRY_BARREL, this::nameableContainerDrops);
		this.addDrop(SSWPBlocks.BAMBOO_BARREL, this::nameableContainerDrops);
		this.addDrop(SSWPBlocks.CRIMSON_BARREL, this::nameableContainerDrops);
		this.addDrop(SSWPBlocks.WARPED_BARREL, this::nameableContainerDrops);
		
		this.addDrop(SSWPBlocks.OAK_TRIPWIRE_HOOK);
		this.addDrop(SSWPBlocks.SPRUCE_TRIPWIRE_HOOK);
		this.addDrop(SSWPBlocks.BIRCH_TRIPWIRE_HOOK);
		this.addDrop(SSWPBlocks.JUNGLE_TRIPWIRE_HOOK);
		this.addDrop(SSWPBlocks.ACACIA_TRIPWIRE_HOOK);
		this.addDrop(SSWPBlocks.DARK_OAK_TRIPWIRE_HOOK);
		this.addDrop(SSWPBlocks.MANGROVE_TRIPWIRE_HOOK);
		this.addDrop(SSWPBlocks.CHERRY_TRIPWIRE_HOOK);
		this.addDrop(SSWPBlocks.BAMBOO_TRIPWIRE_HOOK);
		this.addDrop(SSWPBlocks.CRIMSON_TRIPWIRE_HOOK);
		this.addDrop(SSWPBlocks.WARPED_TRIPWIRE_HOOK);
		
		this.addDrop(SSWPBlocks.OAK_BEEHIVE, this::beehiveDrops);
		this.addDrop(SSWPBlocks.SPRUCE_BEEHIVE, this::beehiveDrops);
		this.addDrop(SSWPBlocks.BIRCH_BEEHIVE, this::beehiveDrops);
		this.addDrop(SSWPBlocks.JUNGLE_BEEHIVE, this::beehiveDrops);
		this.addDrop(SSWPBlocks.ACACIA_BEEHIVE, this::beehiveDrops);
		this.addDrop(SSWPBlocks.DARK_OAK_BEEHIVE, this::beehiveDrops);
		this.addDrop(SSWPBlocks.MANGROVE_BEEHIVE, this::beehiveDrops);
		this.addDrop(SSWPBlocks.CHERRY_BEEHIVE, this::beehiveDrops);
		this.addDrop(SSWPBlocks.BAMBOO_BEEHIVE, this::beehiveDrops);
		this.addDrop(SSWPBlocks.CRIMSON_BEEHIVE, this::beehiveDrops);
		this.addDrop(SSWPBlocks.WARPED_BEEHIVE, this::beehiveDrops);
		
		this.addDropWithSilkTouch(SSWPBlocks.OAK_CHISELED_BOOKSHELF);
		this.addDropWithSilkTouch(SSWPBlocks.SPRUCE_CHISELED_BOOKSHELF);
		this.addDropWithSilkTouch(SSWPBlocks.BIRCH_CHISELED_BOOKSHELF);
		this.addDropWithSilkTouch(SSWPBlocks.JUNGLE_CHISELED_BOOKSHELF);
		this.addDropWithSilkTouch(SSWPBlocks.ACACIA_CHISELED_BOOKSHELF);
		this.addDropWithSilkTouch(SSWPBlocks.DARK_OAK_CHISELED_BOOKSHELF);
		this.addDropWithSilkTouch(SSWPBlocks.MANGROVE_CHISELED_BOOKSHELF);
		this.addDropWithSilkTouch(SSWPBlocks.CHERRY_CHISELED_BOOKSHELF);
		this.addDropWithSilkTouch(SSWPBlocks.BAMBOO_CHISELED_BOOKSHELF);
		this.addDropWithSilkTouch(SSWPBlocks.CRIMSON_CHISELED_BOOKSHELF);
		this.addDropWithSilkTouch(SSWPBlocks.WARPED_CHISELED_BOOKSHELF);
		
		this.addDrop(SSWPBlocks.OAK_CHEST, this::nameableContainerDrops);
		this.addDrop(SSWPBlocks.SPRUCE_CHEST, this::nameableContainerDrops);
		this.addDrop(SSWPBlocks.BIRCH_CHEST, this::nameableContainerDrops);
		this.addDrop(SSWPBlocks.JUNGLE_CHEST, this::nameableContainerDrops);
		this.addDrop(SSWPBlocks.ACACIA_CHEST, this::nameableContainerDrops);
		this.addDrop(SSWPBlocks.DARK_OAK_CHEST, this::nameableContainerDrops);
		this.addDrop(SSWPBlocks.MANGROVE_CHEST, this::nameableContainerDrops);
		this.addDrop(SSWPBlocks.CHERRY_CHEST, this::nameableContainerDrops);
		this.addDrop(SSWPBlocks.BAMBOO_CHEST, this::nameableContainerDrops);
		this.addDrop(SSWPBlocks.CRIMSON_CHEST, this::nameableContainerDrops);
		this.addDrop(SSWPBlocks.WARPED_CHEST, this::nameableContainerDrops);
		
		this.addDrop(SSWPBlocks.OAK_TRAPPED_CHEST, this::nameableContainerDrops);
		this.addDrop(SSWPBlocks.SPRUCE_TRAPPED_CHEST, this::nameableContainerDrops);
		this.addDrop(SSWPBlocks.BIRCH_TRAPPED_CHEST, this::nameableContainerDrops);
		this.addDrop(SSWPBlocks.JUNGLE_TRAPPED_CHEST, this::nameableContainerDrops);
		this.addDrop(SSWPBlocks.ACACIA_TRAPPED_CHEST, this::nameableContainerDrops);
		this.addDrop(SSWPBlocks.DARK_OAK_TRAPPED_CHEST, this::nameableContainerDrops);
		this.addDrop(SSWPBlocks.MANGROVE_TRAPPED_CHEST, this::nameableContainerDrops);
		this.addDrop(SSWPBlocks.CHERRY_TRAPPED_CHEST, this::nameableContainerDrops);
		this.addDrop(SSWPBlocks.BAMBOO_TRAPPED_CHEST, this::nameableContainerDrops);
		this.addDrop(SSWPBlocks.CRIMSON_TRAPPED_CHEST, this::nameableContainerDrops);
		this.addDrop(SSWPBlocks.WARPED_TRAPPED_CHEST, this::nameableContainerDrops);
		
		this.addDrop(SSWPBlocks.GOLD_CAULDRON);
		this.addDrop(SSWPBlocks.GOLD_WATER_CAULDRON, SSWPBlocks.GOLD_CAULDRON);
		this.addDrop(SSWPBlocks.GOLD_LAVA_CAULDRON, SSWPBlocks.GOLD_CAULDRON);
		this.addDrop(SSWPBlocks.GOLD_POWDER_SNOW_CAULDRON, SSWPBlocks.GOLD_CAULDRON);
		
		this.addDrop(SSWPBlocks.NETHERITE_CAULDRON);
		this.addDrop(SSWPBlocks.NETHERITE_WATER_CAULDRON, SSWPBlocks.NETHERITE_CAULDRON);
		this.addDrop(SSWPBlocks.NETHERITE_LAVA_CAULDRON, SSWPBlocks.NETHERITE_CAULDRON);
		this.addDrop(SSWPBlocks.NETHERITE_POWDER_SNOW_CAULDRON, SSWPBlocks.NETHERITE_CAULDRON);
		
		this.addDrop(SSWPBlocks.COPPER_CAULDRON);
		this.addDrop(SSWPBlocks.COPPER_WATER_CAULDRON, SSWPBlocks.COPPER_CAULDRON);
		this.addDrop(SSWPBlocks.COPPER_LAVA_CAULDRON, SSWPBlocks.COPPER_CAULDRON);
		this.addDrop(SSWPBlocks.COPPER_POWDER_SNOW_CAULDRON, SSWPBlocks.COPPER_CAULDRON);
		this.addDrop(SSWPBlocks.EXPOSED_COPPER_CAULDRON);
		this.addDrop(SSWPBlocks.EXPOSED_COPPER_WATER_CAULDRON, SSWPBlocks.EXPOSED_COPPER_CAULDRON);
		this.addDrop(SSWPBlocks.EXPOSED_COPPER_LAVA_CAULDRON, SSWPBlocks.EXPOSED_COPPER_CAULDRON);
		this.addDrop(SSWPBlocks.EXPOSED_COPPER_POWDER_SNOW_CAULDRON, SSWPBlocks.EXPOSED_COPPER_CAULDRON);
		this.addDrop(SSWPBlocks.WEATHERED_COPPER_CAULDRON);
		this.addDrop(SSWPBlocks.WEATHERED_COPPER_WATER_CAULDRON, SSWPBlocks.WEATHERED_COPPER_CAULDRON);
		this.addDrop(SSWPBlocks.WEATHERED_COPPER_LAVA_CAULDRON, SSWPBlocks.WEATHERED_COPPER_CAULDRON);
		this.addDrop(SSWPBlocks.WEATHERED_COPPER_POWDER_SNOW_CAULDRON, SSWPBlocks.WEATHERED_COPPER_CAULDRON);
		this.addDrop(SSWPBlocks.OXIDIZED_COPPER_CAULDRON);
		this.addDrop(SSWPBlocks.OXIDIZED_COPPER_WATER_CAULDRON, SSWPBlocks.OXIDIZED_COPPER_CAULDRON);
		this.addDrop(SSWPBlocks.OXIDIZED_COPPER_LAVA_CAULDRON, SSWPBlocks.OXIDIZED_COPPER_CAULDRON);
		this.addDrop(SSWPBlocks.OXIDIZED_COPPER_POWDER_SNOW_CAULDRON, SSWPBlocks.OXIDIZED_COPPER_CAULDRON);
		this.addDrop(SSWPBlocks.WAXED_COPPER_CAULDRON);
		this.addDrop(SSWPBlocks.WAXED_COPPER_WATER_CAULDRON, SSWPBlocks.WAXED_COPPER_CAULDRON);
		this.addDrop(SSWPBlocks.WAXED_COPPER_LAVA_CAULDRON, SSWPBlocks.WAXED_COPPER_CAULDRON);
		this.addDrop(SSWPBlocks.WAXED_COPPER_POWDER_SNOW_CAULDRON, SSWPBlocks.WAXED_COPPER_CAULDRON);
		this.addDrop(SSWPBlocks.WAXED_EXPOSED_COPPER_CAULDRON);
		this.addDrop(SSWPBlocks.WAXED_EXPOSED_COPPER_WATER_CAULDRON, SSWPBlocks.WAXED_EXPOSED_COPPER_CAULDRON);
		this.addDrop(SSWPBlocks.WAXED_EXPOSED_COPPER_LAVA_CAULDRON, SSWPBlocks.WAXED_EXPOSED_COPPER_CAULDRON);
		this.addDrop(SSWPBlocks.WAXED_EXPOSED_COPPER_POWDER_SNOW_CAULDRON, SSWPBlocks.WAXED_EXPOSED_COPPER_CAULDRON);
		this.addDrop(SSWPBlocks.WAXED_WEATHERED_COPPER_CAULDRON);
		this.addDrop(SSWPBlocks.WAXED_WEATHERED_COPPER_WATER_CAULDRON, SSWPBlocks.WAXED_WEATHERED_COPPER_CAULDRON);
		this.addDrop(SSWPBlocks.WAXED_WEATHERED_COPPER_LAVA_CAULDRON, SSWPBlocks.WAXED_WEATHERED_COPPER_CAULDRON);
		this.addDrop(SSWPBlocks.WAXED_WEATHERED_COPPER_POWDER_SNOW_CAULDRON, SSWPBlocks.WAXED_WEATHERED_COPPER_CAULDRON);
		this.addDrop(SSWPBlocks.WAXED_OXIDIZED_COPPER_CAULDRON);
		this.addDrop(SSWPBlocks.WAXED_OXIDIZED_COPPER_WATER_CAULDRON, SSWPBlocks.WAXED_OXIDIZED_COPPER_CAULDRON);
		this.addDrop(SSWPBlocks.WAXED_OXIDIZED_COPPER_LAVA_CAULDRON, SSWPBlocks.WAXED_OXIDIZED_COPPER_CAULDRON);
		this.addDrop(SSWPBlocks.WAXED_OXIDIZED_COPPER_POWDER_SNOW_CAULDRON, SSWPBlocks.WAXED_OXIDIZED_COPPER_CAULDRON);
		
		this.addDrop(SSWPBlocks.GOLD_LANTERN);
		this.addDrop(SSWPBlocks.GOLD_SOUL_LANTERN);
		
		this.addDrop(SSWPBlocks.NETHERITE_LANTERN);
		this.addDrop(SSWPBlocks.NETHERITE_SOUL_LANTERN);
		
		this.addDrop(SSWPBlocks.COPPER_LANTERN);
		this.addDrop(SSWPBlocks.COPPER_SOUL_LANTERN);
		this.addDrop(SSWPBlocks.EXPOSED_COPPER_LANTERN);
		this.addDrop(SSWPBlocks.EXPOSED_COPPER_SOUL_LANTERN);
		this.addDrop(SSWPBlocks.WEATHERED_COPPER_LANTERN);
		this.addDrop(SSWPBlocks.WEATHERED_COPPER_SOUL_LANTERN);
		this.addDrop(SSWPBlocks.OXIDIZED_COPPER_LANTERN);
		this.addDrop(SSWPBlocks.OXIDIZED_COPPER_SOUL_LANTERN);
		this.addDrop(SSWPBlocks.WAXED_COPPER_LANTERN);
		this.addDrop(SSWPBlocks.WAXED_COPPER_SOUL_LANTERN);
		this.addDrop(SSWPBlocks.WAXED_EXPOSED_COPPER_LANTERN);
		this.addDrop(SSWPBlocks.WAXED_EXPOSED_COPPER_SOUL_LANTERN);
		this.addDrop(SSWPBlocks.WAXED_WEATHERED_COPPER_LANTERN);
		this.addDrop(SSWPBlocks.WAXED_WEATHERED_COPPER_SOUL_LANTERN);
		this.addDrop(SSWPBlocks.WAXED_OXIDIZED_COPPER_LANTERN);
		this.addDrop(SSWPBlocks.WAXED_OXIDIZED_COPPER_SOUL_LANTERN);
		
		this.addDrop(SSWPBlocks.NETHERITE_ANVIL);
	}
}