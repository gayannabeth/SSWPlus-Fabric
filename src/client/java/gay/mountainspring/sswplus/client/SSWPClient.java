package gay.mountainspring.sswplus.client;

import gay.mountainspring.aquifer.client.AquiferClient;
import gay.mountainspring.sswplus.block.SSWPBlocks;
import gay.mountainspring.sswplus.client.gui.screen.ingame.NetheriteAnvilScreen;
import gay.mountainspring.sswplus.config.SSWPConfig;
import gay.mountainspring.sswplus.item.SSWPItems;
import gay.mountainspring.sswplus.screen.SSWPScreenHandlerTypes;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.block.BlockState;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.color.world.BiomeColors;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.BlockItem;
import net.minecraft.world.biome.FoliageColors;
import net.minecraft.world.biome.GrassColors;

public class SSWPClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMap renderLayerMap = BlockRenderLayerMap.INSTANCE;
		
		renderLayerMap.putBlocks(RenderLayer.getCutout(),
				SSWPBlocks.GOLD_DOOR,
				SSWPBlocks.GOLD_TRAPDOOR,
				SSWPBlocks.NETHERITE_DOOR,
				SSWPBlocks.NETHERITE_TRAPDOOR,
				SSWPBlocks.GLASS_SLAB,
				SSWPBlocks.GLASS_STAIRS,
				SSWPBlocks.GLASS_WALL,
				SSWPBlocks.OAK_LADDER,
				SSWPBlocks.SPRUCE_LADDER,
				SSWPBlocks.BIRCH_LADDER,
				SSWPBlocks.JUNGLE_LADDER,
				SSWPBlocks.ACACIA_LADDER,
				SSWPBlocks.DARK_OAK_LADDER,
				SSWPBlocks.MANGROVE_LADDER,
				SSWPBlocks.CHERRY_LADDER,
				SSWPBlocks.BAMBOO_LADDER,
				SSWPBlocks.CRIMSON_LADDER,
				SSWPBlocks.WARPED_LADDER,
				SSWPBlocks.IRON_LADDER,
				SSWPBlocks.GOLD_LADDER,
				SSWPBlocks.NETHERITE_LADDER,
				SSWPBlocks.COPPER_LADDER,
				SSWPBlocks.EXPOSED_COPPER_LADDER,
				SSWPBlocks.WEATHERED_COPPER_LADDER,
				SSWPBlocks.OXIDIZED_COPPER_LADDER,
				SSWPBlocks.WAXED_COPPER_LADDER,
				SSWPBlocks.WAXED_EXPOSED_COPPER_LADDER,
				SSWPBlocks.WAXED_WEATHERED_COPPER_LADDER,
				SSWPBlocks.WAXED_OXIDIZED_COPPER_LADDER,
				SSWPBlocks.GOLD_LANTERN,
				SSWPBlocks.GOLD_SOUL_LANTERN,
				SSWPBlocks.NETHERITE_LANTERN,
				SSWPBlocks.NETHERITE_SOUL_LANTERN,
				SSWPBlocks.COPPER_LANTERN,
				SSWPBlocks.COPPER_SOUL_LANTERN,
				SSWPBlocks.EXPOSED_COPPER_LANTERN,
				SSWPBlocks.EXPOSED_COPPER_SOUL_LANTERN,
				SSWPBlocks.WEATHERED_COPPER_LANTERN,
				SSWPBlocks.WEATHERED_COPPER_SOUL_LANTERN,
				SSWPBlocks.OXIDIZED_COPPER_LANTERN,
				SSWPBlocks.OXIDIZED_COPPER_SOUL_LANTERN,
				SSWPBlocks.WAXED_COPPER_LANTERN,
				SSWPBlocks.WAXED_COPPER_SOUL_LANTERN,
				SSWPBlocks.WAXED_EXPOSED_COPPER_LANTERN,
				SSWPBlocks.WAXED_EXPOSED_COPPER_SOUL_LANTERN,
				SSWPBlocks.WAXED_WEATHERED_COPPER_LANTERN,
				SSWPBlocks.WAXED_WEATHERED_COPPER_SOUL_LANTERN,
				SSWPBlocks.WAXED_OXIDIZED_COPPER_LANTERN,
				SSWPBlocks.WAXED_OXIDIZED_COPPER_SOUL_LANTERN);
		renderLayerMap.putBlocks(RenderLayer.getCutoutMipped(),
				SSWPBlocks.GOLD_BARS,
				SSWPBlocks.GOLD_CHAIN,
				SSWPBlocks.NETHERITE_BARS,
				SSWPBlocks.NETHERITE_CHAIN,
				SSWPBlocks.COPPER_BARS,
				SSWPBlocks.COPPER_CHAIN,
				SSWPBlocks.COPPER_GRATE_SLAB,
				SSWPBlocks.COPPER_GRATE_STAIRS,
				SSWPBlocks.COPPER_GRATE_WALL,
				SSWPBlocks.EXPOSED_COPPER_BARS,
				SSWPBlocks.EXPOSED_COPPER_CHAIN,
				SSWPBlocks.EXPOSED_COPPER_GRATE_SLAB,
				SSWPBlocks.EXPOSED_COPPER_GRATE_STAIRS,
				SSWPBlocks.EXPOSED_COPPER_GRATE_WALL,
				SSWPBlocks.WEATHERED_COPPER_BARS,
				SSWPBlocks.WEATHERED_COPPER_CHAIN,
				SSWPBlocks.WEATHERED_COPPER_GRATE_SLAB,
				SSWPBlocks.WEATHERED_COPPER_GRATE_STAIRS,
				SSWPBlocks.WEATHERED_COPPER_GRATE_WALL,
				SSWPBlocks.OXIDIZED_COPPER_BARS,
				SSWPBlocks.OXIDIZED_COPPER_CHAIN,
				SSWPBlocks.OXIDIZED_COPPER_GRATE_SLAB,
				SSWPBlocks.OXIDIZED_COPPER_GRATE_STAIRS,
				SSWPBlocks.OXIDIZED_COPPER_GRATE_WALL,
				SSWPBlocks.WAXED_COPPER_BARS,
				SSWPBlocks.WAXED_COPPER_CHAIN,
				SSWPBlocks.WAXED_COPPER_GRATE_SLAB,
				SSWPBlocks.WAXED_COPPER_GRATE_STAIRS,
				SSWPBlocks.WAXED_COPPER_GRATE_WALL,
				SSWPBlocks.WAXED_EXPOSED_COPPER_BARS,
				SSWPBlocks.WAXED_EXPOSED_COPPER_CHAIN,
				SSWPBlocks.WAXED_EXPOSED_COPPER_GRATE_SLAB,
				SSWPBlocks.WAXED_EXPOSED_COPPER_GRATE_STAIRS,
				SSWPBlocks.WAXED_EXPOSED_COPPER_GRATE_WALL,
				SSWPBlocks.WAXED_WEATHERED_COPPER_BARS,
				SSWPBlocks.WAXED_WEATHERED_COPPER_CHAIN,
				SSWPBlocks.WAXED_WEATHERED_COPPER_GRATE_SLAB,
				SSWPBlocks.WAXED_WEATHERED_COPPER_GRATE_STAIRS,
				SSWPBlocks.WAXED_WEATHERED_COPPER_GRATE_WALL,
				SSWPBlocks.WAXED_OXIDIZED_COPPER_BARS,
				SSWPBlocks.WAXED_OXIDIZED_COPPER_CHAIN,
				SSWPBlocks.WAXED_OXIDIZED_COPPER_GRATE_SLAB,
				SSWPBlocks.WAXED_OXIDIZED_COPPER_GRATE_STAIRS,
				SSWPBlocks.WAXED_OXIDIZED_COPPER_GRATE_WALL,
				SSWPBlocks.GRASS_SLAB,
				SSWPBlocks.GRASS_STAIRS,
				SSWPBlocks.GRASS_WALL,
				SSWPBlocks.MANGROVE_ROOT_SLAB,
				SSWPBlocks.MANGROVE_ROOT_STAIRS,
				SSWPBlocks.MANGROVE_ROOT_WALL,
				SSWPBlocks.MANGROVE_ROOT_CARPET,
				SSWPBlocks.OAK_LEAF_SLAB,
				SSWPBlocks.OAK_LEAF_STAIRS,
				SSWPBlocks.OAK_LEAF_WALL,
				SSWPBlocks.OAK_LEAF_CARPET,
				SSWPBlocks.SPRUCE_LEAF_SLAB,
				SSWPBlocks.SPRUCE_LEAF_STAIRS,
				SSWPBlocks.SPRUCE_LEAF_WALL,
				SSWPBlocks.SPRUCE_LEAF_CARPET,
				SSWPBlocks.BIRCH_LEAF_SLAB,
				SSWPBlocks.BIRCH_LEAF_STAIRS,
				SSWPBlocks.BIRCH_LEAF_WALL,
				SSWPBlocks.BIRCH_LEAF_CARPET,
				SSWPBlocks.JUNGLE_LEAF_SLAB,
				SSWPBlocks.JUNGLE_LEAF_STAIRS,
				SSWPBlocks.JUNGLE_LEAF_WALL,
				SSWPBlocks.JUNGLE_LEAF_CARPET,
				SSWPBlocks.ACACIA_LEAF_SLAB,
				SSWPBlocks.ACACIA_LEAF_STAIRS,
				SSWPBlocks.ACACIA_LEAF_WALL,
				SSWPBlocks.ACACIA_LEAF_CARPET,
				SSWPBlocks.DARK_OAK_LEAF_SLAB,
				SSWPBlocks.DARK_OAK_LEAF_STAIRS,
				SSWPBlocks.DARK_OAK_LEAF_WALL,
				SSWPBlocks.DARK_OAK_LEAF_CARPET,
				SSWPBlocks.MANGROVE_LEAF_SLAB,
				SSWPBlocks.MANGROVE_LEAF_STAIRS,
				SSWPBlocks.MANGROVE_LEAF_WALL,
				SSWPBlocks.MANGROVE_LEAF_CARPET,
				SSWPBlocks.CHERRY_LEAF_SLAB,
				SSWPBlocks.CHERRY_LEAF_STAIRS,
				SSWPBlocks.CHERRY_LEAF_WALL,
				SSWPBlocks.CHERRY_LEAF_CARPET,
				SSWPBlocks.AZALEA_LEAF_SLAB,
				SSWPBlocks.AZALEA_LEAF_STAIRS,
				SSWPBlocks.AZALEA_LEAF_WALL,
				SSWPBlocks.AZALEA_LEAF_CARPET,
				SSWPBlocks.FLOWERING_AZALEA_LEAF_SLAB,
				SSWPBlocks.FLOWERING_AZALEA_LEAF_STAIRS,
				SSWPBlocks.FLOWERING_AZALEA_LEAF_WALL,
				SSWPBlocks.FLOWERING_AZALEA_LEAF_CARPET);
		
		renderLayerMap.putBlocks(RenderLayer.getTranslucent(),
				SSWPBlocks.TINTED_GLASS_SLAB,
				SSWPBlocks.TINTED_GLASS_STAIRS,
				SSWPBlocks.TINTED_GLASS_WALL,
				SSWPBlocks.TINTED_GLASS_PANE,
				SSWPBlocks.WHITE_STAINED_GLASS_SLAB,
				SSWPBlocks.WHITE_STAINED_GLASS_STAIRS,
				SSWPBlocks.WHITE_STAINED_GLASS_WALL,
				SSWPBlocks.LIGHT_GRAY_STAINED_GLASS_SLAB,
				SSWPBlocks.LIGHT_GRAY_STAINED_GLASS_STAIRS,
				SSWPBlocks.LIGHT_GRAY_STAINED_GLASS_WALL,
				SSWPBlocks.GRAY_STAINED_GLASS_SLAB,
				SSWPBlocks.GRAY_STAINED_GLASS_STAIRS,
				SSWPBlocks.GRAY_STAINED_GLASS_WALL,
				SSWPBlocks.BLACK_STAINED_GLASS_SLAB,
				SSWPBlocks.BLACK_STAINED_GLASS_STAIRS,
				SSWPBlocks.BLACK_STAINED_GLASS_WALL,
				SSWPBlocks.BROWN_STAINED_GLASS_SLAB,
				SSWPBlocks.BROWN_STAINED_GLASS_STAIRS,
				SSWPBlocks.BROWN_STAINED_GLASS_WALL,
				SSWPBlocks.RED_STAINED_GLASS_SLAB,
				SSWPBlocks.RED_STAINED_GLASS_STAIRS,
				SSWPBlocks.RED_STAINED_GLASS_WALL,
				SSWPBlocks.ORANGE_STAINED_GLASS_SLAB,
				SSWPBlocks.ORANGE_STAINED_GLASS_STAIRS,
				SSWPBlocks.ORANGE_STAINED_GLASS_WALL,
				SSWPBlocks.YELLOW_STAINED_GLASS_SLAB,
				SSWPBlocks.YELLOW_STAINED_GLASS_STAIRS,
				SSWPBlocks.YELLOW_STAINED_GLASS_WALL,
				SSWPBlocks.LIME_STAINED_GLASS_SLAB,
				SSWPBlocks.LIME_STAINED_GLASS_STAIRS,
				SSWPBlocks.LIME_STAINED_GLASS_WALL,
				SSWPBlocks.GREEN_STAINED_GLASS_SLAB,
				SSWPBlocks.GREEN_STAINED_GLASS_STAIRS,
				SSWPBlocks.GREEN_STAINED_GLASS_WALL,
				SSWPBlocks.CYAN_STAINED_GLASS_SLAB,
				SSWPBlocks.CYAN_STAINED_GLASS_STAIRS,
				SSWPBlocks.CYAN_STAINED_GLASS_WALL,
				SSWPBlocks.LIGHT_BLUE_STAINED_GLASS_SLAB,
				SSWPBlocks.LIGHT_BLUE_STAINED_GLASS_STAIRS,
				SSWPBlocks.LIGHT_BLUE_STAINED_GLASS_WALL,
				SSWPBlocks.BLUE_STAINED_GLASS_SLAB,
				SSWPBlocks.BLUE_STAINED_GLASS_STAIRS,
				SSWPBlocks.BLUE_STAINED_GLASS_WALL,
				SSWPBlocks.PURPLE_STAINED_GLASS_SLAB,
				SSWPBlocks.PURPLE_STAINED_GLASS_STAIRS,
				SSWPBlocks.PURPLE_STAINED_GLASS_WALL,
				SSWPBlocks.MAGENTA_STAINED_GLASS_SLAB,
				SSWPBlocks.MAGENTA_STAINED_GLASS_STAIRS,
				SSWPBlocks.MAGENTA_STAINED_GLASS_WALL,
				SSWPBlocks.PINK_STAINED_GLASS_SLAB,
				SSWPBlocks.PINK_STAINED_GLASS_STAIRS,
				SSWPBlocks.PINK_STAINED_GLASS_WALL,
				SSWPBlocks.ICE_SLAB,
				SSWPBlocks.ICE_STAIRS,
				SSWPBlocks.ICE_WALL);
		
		var blockColorRegistry = ColorProviderRegistry.BLOCK;
		var itemColorRegistry = ColorProviderRegistry.ITEM;
		
		blockColorRegistry.register((state, world, pos, tintIndex) -> world != null && pos != null ? BiomeColors.getGrassColor(world, pos) : GrassColors.getDefaultColor(),
				SSWPBlocks.GRASS_SLAB,
				SSWPBlocks.GRASS_STAIRS,
				SSWPBlocks.GRASS_WALL);
		
		blockColorRegistry.register((state, world, pos, tintIndex) -> world != null && pos != null ? BiomeColors.getFoliageColor(world, pos) : FoliageColors.getDefaultColor(),
				SSWPBlocks.OAK_LEAF_SLAB,
				SSWPBlocks.OAK_LEAF_STAIRS,
				SSWPBlocks.OAK_LEAF_WALL,
				SSWPBlocks.OAK_LEAF_CARPET,
				SSWPBlocks.JUNGLE_LEAF_SLAB,
				SSWPBlocks.JUNGLE_LEAF_STAIRS,
				SSWPBlocks.JUNGLE_LEAF_WALL,
				SSWPBlocks.JUNGLE_LEAF_CARPET,
				SSWPBlocks.ACACIA_LEAF_SLAB,
				SSWPBlocks.ACACIA_LEAF_STAIRS,
				SSWPBlocks.ACACIA_LEAF_WALL,
				SSWPBlocks.ACACIA_LEAF_CARPET,
				SSWPBlocks.DARK_OAK_LEAF_SLAB,
				SSWPBlocks.DARK_OAK_LEAF_STAIRS,
				SSWPBlocks.DARK_OAK_LEAF_WALL,
				SSWPBlocks.DARK_OAK_LEAF_CARPET,
				SSWPBlocks.MANGROVE_LEAF_SLAB,
				SSWPBlocks.MANGROVE_LEAF_STAIRS,
				SSWPBlocks.MANGROVE_LEAF_WALL,
				SSWPBlocks.MANGROVE_LEAF_CARPET);
		
		blockColorRegistry.register((state, world, pos, tintIndex) -> FoliageColors.getSpruceColor(),
				SSWPBlocks.SPRUCE_LEAF_SLAB,
				SSWPBlocks.SPRUCE_LEAF_STAIRS,
				SSWPBlocks.SPRUCE_LEAF_WALL,
				SSWPBlocks.SPRUCE_LEAF_CARPET);
		
		blockColorRegistry.register((state, world, pos, tintIndex) -> FoliageColors.getBirchColor(),
				SSWPBlocks.BIRCH_LEAF_SLAB,
				SSWPBlocks.BIRCH_LEAF_STAIRS,
				SSWPBlocks.BIRCH_LEAF_WALL,
				SSWPBlocks.BIRCH_LEAF_CARPET);
		
		blockColorRegistry.register((state, world, pos, tintIndex) -> world != null && pos != null ? BiomeColors.getWaterColor(world, pos) : -1,
				SSWPBlocks.GOLD_WATER_CAULDRON,
				SSWPBlocks.NETHERITE_WATER_CAULDRON,
				SSWPBlocks.COPPER_WATER_CAULDRON,
				SSWPBlocks.EXPOSED_COPPER_WATER_CAULDRON,
				SSWPBlocks.WEATHERED_COPPER_WATER_CAULDRON,
				SSWPBlocks.OXIDIZED_COPPER_WATER_CAULDRON,
				SSWPBlocks.WAXED_COPPER_WATER_CAULDRON,
				SSWPBlocks.WAXED_EXPOSED_COPPER_WATER_CAULDRON,
				SSWPBlocks.WAXED_WEATHERED_COPPER_WATER_CAULDRON,
				SSWPBlocks.WAXED_OXIDIZED_COPPER_WATER_CAULDRON);
		
		itemColorRegistry.register((stack, tintIndex) -> {
			BlockState state = ((BlockItem) stack.getItem()).getBlock().getDefaultState();
			return MinecraftClient.getInstance().getBlockColors().getColor(state, null, null, tintIndex);
		}, SSWPItems.GRASS_SLAB,
				SSWPItems.GRASS_STAIRS,
				SSWPItems.GRASS_WALL,
				SSWPItems.OAK_LEAF_SLAB,
				SSWPItems.OAK_LEAF_STAIRS,
				SSWPItems.OAK_LEAF_WALL,
				SSWPItems.OAK_LEAF_CARPET,
				SSWPItems.SPRUCE_LEAF_SLAB,
				SSWPItems.SPRUCE_LEAF_STAIRS,
				SSWPItems.SPRUCE_LEAF_WALL,
				SSWPItems.SPRUCE_LEAF_CARPET,
				SSWPItems.BIRCH_LEAF_SLAB,
				SSWPItems.BIRCH_LEAF_STAIRS,
				SSWPItems.BIRCH_LEAF_WALL,
				SSWPItems.BIRCH_LEAF_CARPET,
				SSWPItems.JUNGLE_LEAF_SLAB,
				SSWPItems.JUNGLE_LEAF_STAIRS,
				SSWPItems.JUNGLE_LEAF_WALL,
				SSWPItems.JUNGLE_LEAF_CARPET,
				SSWPItems.ACACIA_LEAF_SLAB,
				SSWPItems.ACACIA_LEAF_STAIRS,
				SSWPItems.ACACIA_LEAF_WALL,
				SSWPItems.ACACIA_LEAF_CARPET,
				SSWPItems.DARK_OAK_LEAF_SLAB,
				SSWPItems.DARK_OAK_LEAF_STAIRS,
				SSWPItems.DARK_OAK_LEAF_WALL,
				SSWPItems.DARK_OAK_LEAF_CARPET);
		
		itemColorRegistry.register((stack, tintIndex) -> FoliageColors.getMangroveColor(),
				SSWPItems.MANGROVE_LEAF_SLAB,
				SSWPItems.MANGROVE_LEAF_STAIRS,
				SSWPItems.MANGROVE_LEAF_WALL,
				SSWPItems.MANGROVE_LEAF_CARPET);
		
		AquiferClient.registerTypedChestItemRenderer(SSWPItems.OAK_CHEST);
		AquiferClient.registerTypedChestItemRenderer(SSWPItems.SPRUCE_CHEST);
		AquiferClient.registerTypedChestItemRenderer(SSWPItems.BIRCH_CHEST);
		AquiferClient.registerTypedChestItemRenderer(SSWPItems.JUNGLE_CHEST);
		AquiferClient.registerTypedChestItemRenderer(SSWPItems.ACACIA_CHEST);
		AquiferClient.registerTypedChestItemRenderer(SSWPItems.DARK_OAK_CHEST);
		AquiferClient.registerTypedChestItemRenderer(SSWPItems.MANGROVE_CHEST);
		AquiferClient.registerTypedChestItemRenderer(SSWPItems.CHERRY_CHEST);
		AquiferClient.registerTypedChestItemRenderer(SSWPItems.BAMBOO_CHEST);
		AquiferClient.registerTypedChestItemRenderer(SSWPItems.CRIMSON_CHEST);
		AquiferClient.registerTypedChestItemRenderer(SSWPItems.WARPED_CHEST);
		AquiferClient.registerTypedChestItemRenderer(SSWPItems.OAK_TRAPPED_CHEST);
		AquiferClient.registerTypedChestItemRenderer(SSWPItems.SPRUCE_TRAPPED_CHEST);
		AquiferClient.registerTypedChestItemRenderer(SSWPItems.BIRCH_TRAPPED_CHEST);
		AquiferClient.registerTypedChestItemRenderer(SSWPItems.JUNGLE_TRAPPED_CHEST);
		AquiferClient.registerTypedChestItemRenderer(SSWPItems.ACACIA_TRAPPED_CHEST);
		AquiferClient.registerTypedChestItemRenderer(SSWPItems.DARK_OAK_TRAPPED_CHEST);
		AquiferClient.registerTypedChestItemRenderer(SSWPItems.MANGROVE_TRAPPED_CHEST);
		AquiferClient.registerTypedChestItemRenderer(SSWPItems.CHERRY_TRAPPED_CHEST);
		AquiferClient.registerTypedChestItemRenderer(SSWPItems.BAMBOO_TRAPPED_CHEST);
		AquiferClient.registerTypedChestItemRenderer(SSWPItems.CRIMSON_TRAPPED_CHEST);
		AquiferClient.registerTypedChestItemRenderer(SSWPItems.WARPED_TRAPPED_CHEST);
		
		HandledScreens.register(SSWPScreenHandlerTypes.NETHERITE_ANVIL, NetheriteAnvilScreen::new);
		
		ClientLifecycleEvents.CLIENT_STOPPING.register(client -> {
			SSWPConfig.save();
		});
	}
}