package gay.mountainspring.sswplus.block;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import org.apache.commons.lang3.function.TriConsumer;

import gay.mountainspring.aquifer.block.AquiferCauldronBlock;
import gay.mountainspring.aquifer.block.AquiferFenceGateBlock;
import gay.mountainspring.aquifer.block.AquiferLavaCauldronBlock;
import gay.mountainspring.aquifer.block.AquiferPowderSnowCauldronBlock;
import gay.mountainspring.aquifer.block.AquiferWaterCauldronBlock;
import gay.mountainspring.aquifer.block.ExperienceDroppingSlabBlock;
import gay.mountainspring.aquifer.block.ExperienceDroppingStairsBlock;
import gay.mountainspring.aquifer.block.ExperienceDroppingWallBlock;
import gay.mountainspring.aquifer.block.LeafCarpetBlock;
import gay.mountainspring.aquifer.block.LeafSlabBlock;
import gay.mountainspring.aquifer.block.LeafStairsBlock;
import gay.mountainspring.aquifer.block.LeafWallBlock;
import gay.mountainspring.aquifer.block.OrientableSlabBlock;
import gay.mountainspring.aquifer.block.OrientableStairsBlock;
import gay.mountainspring.aquifer.block.OxidizableButtonBlock;
import gay.mountainspring.aquifer.block.OxidizableCauldronBlock;
import gay.mountainspring.aquifer.block.OxidizableChainBlock;
import gay.mountainspring.aquifer.block.OxidizableFenceBlock;
import gay.mountainspring.aquifer.block.OxidizableFenceGateBlock;
import gay.mountainspring.aquifer.block.OxidizableGrateSlabBlock;
import gay.mountainspring.aquifer.block.OxidizableGrateStairsBlock;
import gay.mountainspring.aquifer.block.OxidizableGrateWallBlock;
import gay.mountainspring.aquifer.block.OxidizableHangingSignBlock;
import gay.mountainspring.aquifer.block.OxidizableLadderBlock;
import gay.mountainspring.aquifer.block.OxidizableLanternBlock;
import gay.mountainspring.aquifer.block.OxidizableLavaCauldronBlock;
import gay.mountainspring.aquifer.block.OxidizablePaneBlock;
import gay.mountainspring.aquifer.block.OxidizablePowderSnowCauldronBlock;
import gay.mountainspring.aquifer.block.OxidizablePressurePlateBlock;
import gay.mountainspring.aquifer.block.OxidizableSignBlock;
import gay.mountainspring.aquifer.block.OxidizableWallBlock;
import gay.mountainspring.aquifer.block.OxidizableWallHangingSignBlock;
import gay.mountainspring.aquifer.block.OxidizableWallSignBlock;
import gay.mountainspring.aquifer.block.OxidizableWaterCauldronBlock;
import gay.mountainspring.aquifer.block.SnowySlabBlock;
import gay.mountainspring.aquifer.block.SnowyStairsBlock;
import gay.mountainspring.aquifer.block.SnowyWallBlock;
import gay.mountainspring.aquifer.block.StainedGlassSlabBlock;
import gay.mountainspring.aquifer.block.StainedGlassStairsBlock;
import gay.mountainspring.aquifer.block.StainedGlassWallBlock;
import gay.mountainspring.aquifer.block.TranslucentSlabBlock;
import gay.mountainspring.aquifer.block.TranslucentStairsBlock;
import gay.mountainspring.aquifer.block.TranslucentWallBlock;
import gay.mountainspring.aquifer.block.TransparentSlabBlock;
import gay.mountainspring.aquifer.block.TransparentStairsBlock;
import gay.mountainspring.aquifer.block.TransparentWallBlock;
import gay.mountainspring.aquifer.block.TypedChestBlock;
import gay.mountainspring.aquifer.block.TypedTrappedChestBlock;
import gay.mountainspring.aquifer.block.WaxedPaneBlock;
import gay.mountainspring.aquifer.util.BlockUtil;
import gay.mountainspring.sswplus.SSWPlus;
import gay.mountainspring.sswplus.tag.SSWPTags;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.fabricmc.fabric.api.registry.TillableBlockRegistry;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BarrelBlock;
import net.minecraft.block.BeehiveBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSetType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.ButtonBlock;
import net.minecraft.block.CarpetBlock;
import net.minecraft.block.CartographyTableBlock;
import net.minecraft.block.ChainBlock;
import net.minecraft.block.ChiseledBookshelfBlock;
import net.minecraft.block.ComposterBlock;
import net.minecraft.block.CraftingTableBlock;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FletchingTableBlock;
import net.minecraft.block.HangingSignBlock;
import net.minecraft.block.InfestedBlock;
import net.minecraft.block.LadderBlock;
import net.minecraft.block.LanternBlock;
import net.minecraft.block.LecternBlock;
import net.minecraft.block.LoomBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.Oxidizable;
import net.minecraft.block.OxidizableSlabBlock;
import net.minecraft.block.OxidizableStairsBlock;
import net.minecraft.block.PaneBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.SignBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.SmithingTableBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.block.TripwireHookBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.WallHangingSignBlock;
import net.minecraft.block.WallSignBlock;
import net.minecraft.block.WoodType;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.block.enums.NoteBlockInstrument;
import net.minecraft.block.enums.SlabType;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.entity.EntityType;
import net.minecraft.item.HoeItem;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.DyeColor;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.intprovider.ClampedIntProvider;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.world.BlockView;
import net.minecraft.world.event.GameEvent;
import net.minecraft.world.poi.PointOfInterestTypes;

public class SSWPBlocks {
	private SSWPBlocks() {}
	
	public static void init() {
		flammableBlocks();
		strippableBlocks();
		oxidizableBlocks();
		flattenableBlocks();
		tillableBlocks();
		blockEntities();
		pointOfInterestTypes();
	}
	
	public static final Block OAK_LOG_SLAB = register("oak_log_slab", new OrientableSlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).mapColor(orientableSlabMapColor(MapColor.OAK_TAN, MapColor.SPRUCE_BROWN))));
	public static final Block OAK_LOG_STAIRS = register("oak_log_stairs", new OrientableStairsBlock(Blocks.OAK_LOG.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_LOG)));
	public static final Block OAK_LOG_WALL = register("oak_log_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.OAK_LOG).mapColor(boolPropertyMapColor(Properties.UP, MapColor.OAK_TAN, MapColor.SPRUCE_BROWN)).solid()));
	public static final Block OAK_WOOD_SLAB = register("oak_wood_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
	public static final Block OAK_WOOD_STAIRS = register("oak_wood_stairs", new StairsBlock(Blocks.OAK_WOOD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OAK_WOOD)));
	public static final Block OAK_WOOD_WALL = register("oak_wood_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.OAK_WOOD).solid()));
	public static final Block STRIPPED_OAK_LOG_SLAB = register("stripped_oak_log_slab", new OrientableSlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).mapColor(MapColor.OAK_TAN)));
	public static final Block STRIPPED_OAK_LOG_STAIRS = register("stripped_oak_log_stairs", new OrientableStairsBlock(Blocks.STRIPPED_OAK_LOG.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).mapColor(MapColor.OAK_TAN)));
	public static final Block STRIPPED_OAK_LOG_WALL = register("stripped_oak_log_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_LOG).mapColor(MapColor.OAK_TAN).solid()));
	public static final Block STRIPPED_OAK_WOOD_SLAB = register("stripped_oak_wood_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
	public static final Block STRIPPED_OAK_WOOD_STAIRS = register("stripped_oak_wood_stairs", new StairsBlock(Blocks.STRIPPED_OAK_WOOD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD)));
	public static final Block STRIPPED_OAK_WOOD_WALL = register("stripped_oak_wood_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_OAK_WOOD).solid()));
	
	public static final Block SPRUCE_LOG_SLAB = register("spruce_log_slab", new OrientableSlabBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_LOG).mapColor(orientableSlabMapColor(MapColor.SPRUCE_BROWN, MapColor.BROWN))));
	public static final Block SPRUCE_LOG_STAIRS = register("spruce_log_stairs", new OrientableStairsBlock(Blocks.SPRUCE_LOG.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SPRUCE_LOG)));
	public static final Block SPRUCE_LOG_WALL = register("spruce_log_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_LOG).mapColor(boolPropertyMapColor(Properties.UP, MapColor.SPRUCE_BROWN, MapColor.BROWN)).solid()));
	public static final Block SPRUCE_WOOD_SLAB = register("spruce_wood_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD)));
	public static final Block SPRUCE_WOOD_STAIRS = register("spruce_wood_stairs", new StairsBlock(Blocks.SPRUCE_WOOD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD)));
	public static final Block SPRUCE_WOOD_WALL = register("spruce_wood_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.SPRUCE_WOOD).solid()));
	public static final Block STRIPPED_SPRUCE_LOG_SLAB = register("stripped_spruce_log_slab", new OrientableSlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_LOG).mapColor(MapColor.SPRUCE_BROWN)));
	public static final Block STRIPPED_SPRUCE_LOG_STAIRS = register("stripped_spruce_log_stairs", new OrientableStairsBlock(Blocks.STRIPPED_SPRUCE_LOG.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_LOG).mapColor(MapColor.SPRUCE_BROWN)));
	public static final Block STRIPPED_SPRUCE_LOG_WALL = register("stripped_spruce_log_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_LOG).mapColor(MapColor.SPRUCE_BROWN).solid()));
	public static final Block STRIPPED_SPRUCE_WOOD_SLAB = register("stripped_spruce_wood_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD)));
	public static final Block STRIPPED_SPRUCE_WOOD_STAIRS = register("stripped_spruce_wood_stairs", new StairsBlock(Blocks.STRIPPED_SPRUCE_WOOD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD)));
	public static final Block STRIPPED_SPRUCE_WOOD_WALL = register("stripped_spruce_wood_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_SPRUCE_WOOD).solid()));
	
	public static final Block BIRCH_LOG_SLAB = register("birch_log_slab", new OrientableSlabBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_LOG).mapColor(orientableSlabMapColor(MapColor.PALE_YELLOW, MapColor.OFF_WHITE))));
	public static final Block BIRCH_LOG_STAIRS = register("birch_log_stairs", new OrientableStairsBlock(Blocks.BIRCH_LOG.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BIRCH_LOG)));
	public static final Block BIRCH_LOG_WALL = register("birch_log_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_LOG).mapColor(boolPropertyMapColor(Properties.UP, MapColor.PALE_YELLOW, MapColor.OFF_WHITE)).solid()));
	public static final Block BIRCH_WOOD_SLAB = register("birch_wood_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD)));
	public static final Block BIRCH_WOOD_STAIRS = register("birch_wood_stairs", new StairsBlock(Blocks.BIRCH_WOOD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD)));
	public static final Block BIRCH_WOOD_WALL = register("birch_wood_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BIRCH_WOOD).solid()));
	public static final Block STRIPPED_BIRCH_LOG_SLAB = register("stripped_birch_log_slab", new OrientableSlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_LOG).mapColor(MapColor.PALE_YELLOW)));
	public static final Block STRIPPED_BIRCH_LOG_STAIRS = register("stripped_birch_log_stairs", new OrientableStairsBlock(Blocks.STRIPPED_BIRCH_LOG.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_LOG).mapColor(MapColor.PALE_YELLOW)));
	public static final Block STRIPPED_BIRCH_LOG_WALL = register("stripped_birch_log_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_LOG).mapColor(MapColor.PALE_YELLOW).solid()));
	public static final Block STRIPPED_BIRCH_WOOD_SLAB = register("stripped_birch_wood_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD)));
	public static final Block STRIPPED_BIRCH_WOOD_STAIRS = register("stripped_birch_wood_stairs", new StairsBlock(Blocks.STRIPPED_BIRCH_WOOD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD)));
	public static final Block STRIPPED_BIRCH_WOOD_WALL = register("stripped_birch_wood_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_BIRCH_WOOD).solid()));
	
	public static final Block JUNGLE_LOG_SLAB = register("jungle_log_slab", new OrientableSlabBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_LOG).mapColor(orientableSlabMapColor(MapColor.DIRT_BROWN, MapColor.SPRUCE_BROWN))));
	public static final Block JUNGLE_LOG_STAIRS = register("jungle_log_stairs", new OrientableStairsBlock(Blocks.JUNGLE_LOG.getDefaultState(), AbstractBlock.Settings.copy(Blocks.JUNGLE_LOG)));
	public static final Block JUNGLE_LOG_WALL = register("jungle_log_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_LOG).mapColor(boolPropertyMapColor(Properties.UP, MapColor.DIRT_BROWN, MapColor.SPRUCE_BROWN)).solid()));
	public static final Block JUNGLE_WOOD_SLAB = register("jungle_wood_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD)));
	public static final Block JUNGLE_WOOD_STAIRS = register("jungle_wood_stairs", new StairsBlock(Blocks.JUNGLE_WOOD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD)));
	public static final Block JUNGLE_WOOD_WALL = register("jungle_wood_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.JUNGLE_WOOD).solid()));
	public static final Block STRIPPED_JUNGLE_LOG_SLAB = register("stripped_jungle_log_slab", new OrientableSlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_LOG).mapColor(MapColor.DIRT_BROWN)));
	public static final Block STRIPPED_JUNGLE_LOG_STAIRS = register("stripped_jungle_log_stairs", new OrientableStairsBlock(Blocks.STRIPPED_JUNGLE_LOG.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_LOG).mapColor(MapColor.DIRT_BROWN)));
	public static final Block STRIPPED_JUNGLE_LOG_WALL = register("stripped_jungle_log_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_LOG).mapColor(MapColor.DIRT_BROWN).solid()));
	public static final Block STRIPPED_JUNGLE_WOOD_SLAB = register("stripped_jungle_wood_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD)));
	public static final Block STRIPPED_JUNGLE_WOOD_STAIRS = register("stripped_jungle_wood_stairs", new StairsBlock(Blocks.STRIPPED_JUNGLE_WOOD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD)));
	public static final Block STRIPPED_JUNGLE_WOOD_WALL = register("stripped_jungle_wood_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_JUNGLE_WOOD).solid()));
	
	public static final Block ACACIA_LOG_SLAB = register("acacia_log_slab", new OrientableSlabBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_LOG).mapColor(orientableSlabMapColor(MapColor.ORANGE, MapColor.STONE_GRAY))));
	public static final Block ACACIA_LOG_STAIRS = register("acacia_log_stairs", new OrientableStairsBlock(Blocks.ACACIA_LOG.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ACACIA_LOG)));
	public static final Block ACACIA_LOG_WALL = register("acacia_log_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_LOG).mapColor(boolPropertyMapColor(Properties.UP, MapColor.ORANGE, MapColor.STONE_GRAY)).solid()));
	public static final Block ACACIA_WOOD_SLAB = register("acacia_wood_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD)));
	public static final Block ACACIA_WOOD_STAIRS = register("acacia_wood_stairs", new StairsBlock(Blocks.ACACIA_WOOD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD)));
	public static final Block ACACIA_WOOD_WALL = register("acacia_wood_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.ACACIA_WOOD).solid()));
	public static final Block STRIPPED_ACACIA_LOG_SLAB = register("stripped_acacia_log_slab", new OrientableSlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_LOG).mapColor(MapColor.ORANGE)));
	public static final Block STRIPPED_ACACIA_LOG_STAIRS = register("stripped_acacia_log_stairs", new OrientableStairsBlock(Blocks.STRIPPED_ACACIA_LOG.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_LOG).mapColor(MapColor.ORANGE)));
	public static final Block STRIPPED_ACACIA_LOG_WALL = register("stripped_acacia_log_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_LOG).mapColor(MapColor.ORANGE).solid()));
	public static final Block STRIPPED_ACACIA_WOOD_SLAB = register("stripped_acacia_wood_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_WOOD)));
	public static final Block STRIPPED_ACACIA_WOOD_STAIRS = register("stripped_acacia_wood_stairs", new StairsBlock(Blocks.STRIPPED_ACACIA_WOOD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_WOOD)));
	public static final Block STRIPPED_ACACIA_WOOD_WALL = register("stripped_acacia_wood_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_ACACIA_WOOD).solid()));
	
	public static final Block DARK_OAK_LOG_SLAB = register("dark_oak_log_slab", new OrientableSlabBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_LOG).mapColor(orientableSlabMapColor(MapColor.BROWN, MapColor.BROWN))));
	public static final Block DARK_OAK_LOG_STAIRS = register("dark_oak_log_stairs", new OrientableStairsBlock(Blocks.DARK_OAK_LOG.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DARK_OAK_LOG)));
	public static final Block DARK_OAK_LOG_WALL = register("dark_oak_log_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_LOG).mapColor(boolPropertyMapColor(Properties.UP, MapColor.BROWN, MapColor.BROWN)).solid()));
	public static final Block DARK_OAK_WOOD_SLAB = register("dark_oak_wood_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD)));
	public static final Block DARK_OAK_WOOD_STAIRS = register("dark_oak_wood_stairs", new StairsBlock(Blocks.DARK_OAK_WOOD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD)));
	public static final Block DARK_OAK_WOOD_WALL = register("dark_oak_wood_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.DARK_OAK_WOOD).solid()));
	public static final Block STRIPPED_DARK_OAK_LOG_SLAB = register("stripped_dark_oak_log_slab", new OrientableSlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_LOG).mapColor(MapColor.BROWN)));
	public static final Block STRIPPED_DARK_OAK_LOG_STAIRS = register("stripped_dark_oak_log_stairs", new OrientableStairsBlock(Blocks.STRIPPED_DARK_OAK_LOG.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_LOG).mapColor(MapColor.BROWN)));
	public static final Block STRIPPED_DARK_OAK_LOG_WALL = register("stripped_dark_oak_log_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_LOG).mapColor(MapColor.BROWN).solid()));
	public static final Block STRIPPED_DARK_OAK_WOOD_SLAB = register("stripped_dark_oak_wood_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD)));
	public static final Block STRIPPED_DARK_OAK_WOOD_STAIRS = register("stripped_dark_oak_wood_stairs", new StairsBlock(Blocks.STRIPPED_DARK_OAK_WOOD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD)));
	public static final Block STRIPPED_DARK_OAK_WOOD_WALL = register("stripped_dark_oak_wood_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_DARK_OAK_WOOD).solid()));
	
	public static final Block MANGROVE_LOG_SLAB = register("mangrove_log_slab", new OrientableSlabBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_LOG).mapColor(orientableSlabMapColor(MapColor.RED, MapColor.SPRUCE_BROWN))));
	public static final Block MANGROVE_LOG_STAIRS = register("mangrove_log_stairs", new OrientableStairsBlock(Blocks.MANGROVE_LOG.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MANGROVE_LOG)));
	public static final Block MANGROVE_LOG_WALL = register("mangrove_log_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_LOG).mapColor(boolPropertyMapColor(Properties.UP, MapColor.RED, MapColor.SPRUCE_BROWN)).solid()));
	public static final Block MANGROVE_WOOD_SLAB = register("mangrove_wood_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD)));
	public static final Block MANGROVE_WOOD_STAIRS = register("mangrove_wood_stairs", new StairsBlock(Blocks.MANGROVE_WOOD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD)));
	public static final Block MANGROVE_WOOD_WALL = register("mangrove_wood_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.MANGROVE_WOOD).solid()));
	public static final Block STRIPPED_MANGROVE_LOG_SLAB = register("stripped_mangrove_log_slab", new OrientableSlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_MANGROVE_LOG).mapColor(MapColor.RED)));
	public static final Block STRIPPED_MANGROVE_LOG_STAIRS = register("stripped_mangrove_log_stairs", new OrientableStairsBlock(Blocks.STRIPPED_MANGROVE_LOG.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STRIPPED_MANGROVE_LOG).mapColor(MapColor.RED)));
	public static final Block STRIPPED_MANGROVE_LOG_WALL = register("stripped_mangrove_log_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_MANGROVE_LOG).mapColor(MapColor.RED).solid()));
	public static final Block STRIPPED_MANGROVE_WOOD_SLAB = register("stripped_mangrove_wood_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_MANGROVE_WOOD).mapColor(MapColor.RED)));
	public static final Block STRIPPED_MANGROVE_WOOD_STAIRS = register("stripped_mangrove_wood_stairs", new StairsBlock(Blocks.STRIPPED_MANGROVE_WOOD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STRIPPED_MANGROVE_WOOD).mapColor(MapColor.RED)));
	public static final Block STRIPPED_MANGROVE_WOOD_WALL = register("stripped_mangrove_wood_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_MANGROVE_WOOD).mapColor(MapColor.RED).solid()));
	
	public static final Block CHERRY_LOG_SLAB = register("cherry_log_slab", new OrientableSlabBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_LOG).mapColor(orientableSlabMapColor(MapColor.TERRACOTTA_WHITE, MapColor.TERRACOTTA_GRAY))));
	public static final Block CHERRY_LOG_STAIRS = register("cherry_log_stairs", new OrientableStairsBlock(Blocks.CHERRY_LOG.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CHERRY_LOG)));
	public static final Block CHERRY_LOG_WALL = register("cherry_log_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_LOG).mapColor(boolPropertyMapColor(Properties.UP, MapColor.TERRACOTTA_WHITE, MapColor.TERRACOTTA_GRAY)).solid()));
	public static final Block CHERRY_WOOD_SLAB = register("cherry_wood_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD)));
	public static final Block CHERRY_WOOD_STAIRS = register("cherry_wood_stairs", new StairsBlock(Blocks.CHERRY_WOOD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD)));
	public static final Block CHERRY_WOOD_WALL = register("cherry_wood_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CHERRY_WOOD).solid()));
	public static final Block STRIPPED_CHERRY_LOG_SLAB = register("stripped_cherry_log_slab", new OrientableSlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_LOG).mapColor(orientableSlabMapColor(MapColor.TERRACOTTA_WHITE, MapColor.TERRACOTTA_PINK))));
	public static final Block STRIPPED_CHERRY_LOG_STAIRS = register("stripped_cherry_log_stairs", new OrientableStairsBlock(Blocks.STRIPPED_CHERRY_LOG.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_LOG)));
	public static final Block STRIPPED_CHERRY_LOG_WALL = register("stripped_cherry_log_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_LOG).mapColor(boolPropertyMapColor(Properties.UP, MapColor.TERRACOTTA_WHITE, MapColor.TERRACOTTA_PINK)).solid()));
	public static final Block STRIPPED_CHERRY_WOOD_SLAB = register("stripped_cherry_wood_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD)));
	public static final Block STRIPPED_CHERRY_WOOD_STAIRS = register("stripped_cherry_wood_stairs", new StairsBlock(Blocks.STRIPPED_CHERRY_WOOD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD)));
	public static final Block STRIPPED_CHERRY_WOOD_WALL = register("stripped_cherry_wood_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CHERRY_WOOD).solid()));
	
	public static final Block BAMBOO_BLOCK_SLAB = register("bamboo_block_slab", new OrientableSlabBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_BLOCK).mapColor(orientableSlabMapColor(MapColor.YELLOW, MapColor.DARK_GREEN))));
	public static final Block BAMBOO_BLOCK_STAIRS = register("bamboo_block_stairs", new OrientableStairsBlock(Blocks.BAMBOO_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BAMBOO_BLOCK)));
	public static final Block BAMBOO_BLOCK_WALL = register("bamboo_block_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BAMBOO_BLOCK).mapColor(boolPropertyMapColor(Properties.UP, MapColor.YELLOW, MapColor.DARK_GREEN)).solid()));
	public static final Block STRIPPED_BAMBOO_BLOCK_SLAB = register("stripped_bamboo_block_slab", new OrientableSlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_BAMBOO_BLOCK).mapColor(MapColor.YELLOW)));
	public static final Block STRIPPED_BAMBOO_BLOCK_STAIRS = register("stripped_bamboo_block_stairs", new OrientableStairsBlock(Blocks.STRIPPED_BAMBOO_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STRIPPED_BAMBOO_BLOCK).mapColor(MapColor.YELLOW)));
	public static final Block STRIPPED_BAMBOO_BLOCK_WALL = register("stripped_bamboo_block_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_BAMBOO_BLOCK).mapColor(MapColor.YELLOW).solid()));
	
	public static final Block CRIMSON_STEM_SLAB = register("crimson_log_slab", new OrientableSlabBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_STEM)));
	public static final Block CRIMSON_STEM_STAIRS = register("crimson_log_stairs", new OrientableStairsBlock(Blocks.CRIMSON_STEM.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CRIMSON_STEM)));
	public static final Block CRIMSON_STEM_WALL = register("crimson_log_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_STEM).solid()));
	public static final Block CRIMSON_HYPHAE_SLAB = register("crimson_wood_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE)));
	public static final Block CRIMSON_HYPHAE_STAIRS = register("crimson_wood_stairs", new StairsBlock(Blocks.CRIMSON_HYPHAE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE)));
	public static final Block CRIMSON_HYPHAE_WALL = register("crimson_wood_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_HYPHAE).solid()));
	public static final Block STRIPPED_CRIMSON_STEM_SLAB = register("stripped_crimson_log_slab", new OrientableSlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_STEM)));
	public static final Block STRIPPED_CRIMSON_STEM_STAIRS = register("stripped_crimson_log_stairs", new OrientableStairsBlock(Blocks.STRIPPED_CRIMSON_STEM.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_STEM)));
	public static final Block STRIPPED_CRIMSON_STEM_WALL = register("stripped_crimson_log_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_STEM).solid()));
	public static final Block STRIPPED_CRIMSON_HYPHAE_SLAB = register("stripped_crimson_wood_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE)));
	public static final Block STRIPPED_CRIMSON_HYPHAE_STAIRS = register("stripped_crimson_wood_stairs", new StairsBlock(Blocks.STRIPPED_CRIMSON_HYPHAE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE)));
	public static final Block STRIPPED_CRIMSON_HYPHAE_WALL = register("stripped_crimson_wood_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_CRIMSON_HYPHAE).solid()));
	
	public static final Block WARPED_STEM_SLAB = register("warped_log_slab", new OrientableSlabBlock(AbstractBlock.Settings.copy(Blocks.WARPED_STEM)));
	public static final Block WARPED_STEM_STAIRS = register("warped_log_stairs", new OrientableStairsBlock(Blocks.WARPED_STEM.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WARPED_STEM)));
	public static final Block WARPED_STEM_WALL = register("warped_log_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.WARPED_STEM).solid()));
	public static final Block WARPED_HYPHAE_SLAB = register("warped_wood_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE)));
	public static final Block WARPED_HYPHAE_STAIRS = register("warped_wood_stairs", new StairsBlock(Blocks.WARPED_HYPHAE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE)));
	public static final Block WARPED_HYPHAE_WALL = register("warped_wood_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.WARPED_HYPHAE).solid()));
	public static final Block STRIPPED_WARPED_STEM_SLAB = register("stripped_warped_log_slab", new OrientableSlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_STEM)));
	public static final Block STRIPPED_WARPED_STEM_STAIRS = register("stripped_warped_log_stairs", new OrientableStairsBlock(Blocks.STRIPPED_WARPED_STEM.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_STEM)));
	public static final Block STRIPPED_WARPED_STEM_WALL = register("stripped_warped_log_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_STEM).solid()));
	public static final Block STRIPPED_WARPED_HYPHAE_SLAB = register("stripped_warped_wood_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_HYPHAE)));
	public static final Block STRIPPED_WARPED_HYPHAE_STAIRS = register("stripped_warped_wood_stairs", new StairsBlock(Blocks.STRIPPED_WARPED_HYPHAE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_HYPHAE)));
	public static final Block STRIPPED_WARPED_HYPHAE_WALL = register("stripped_warped_wood_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.STRIPPED_WARPED_HYPHAE).solid()));
	
	public static final Block STONE_WALL = register("stone_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.STONE).solid()));
	
	public static final Block SMOOTH_STONE_STAIRS = register("smooth_stone_stairs", new StairsBlock(Blocks.SMOOTH_STONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE)));
	public static final Block SMOOTH_STONE_WALL = register("smooth_stone_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE).solid()));
	
	public static final Block CRACKED_STONE_BRICK_SLAB = register("cracked_stone_brick_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS)));
	public static final Block CRACKED_STONE_BRICK_STAIRS = register("cracked_stone_brick_stairs", new StairsBlock(Blocks.CRACKED_STONE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS)));
	public static final Block CRACKED_STONE_BRICK_WALL = register("cracked_stone_brick_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_STONE_BRICKS).solid()));
	public static final Block CHISELED_STONE_BRICK_SLAB = register("chiseled_stone_brick_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
	public static final Block CHISELED_STONE_BRICK_STAIRS = register("chiseled_stone_brick_stairs", new StairsBlock(Blocks.CHISELED_STONE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS)));
	public static final Block CHISELED_STONE_BRICK_WALL = register("chiseled_stone_brick_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_STONE_BRICKS).solid()));
	
	public static final Block POLISHED_GRANITE_WALL = register("polished_granite_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_GRANITE).solid()));
	
	public static final Block POLISHED_DIORITE_WALL = register("polished_diorite_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_DIORITE).solid()));
	
	public static final Block POLISHED_ANDESITE_WALL = register("polished_andesite_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_ANDESITE).solid()));
	
	public static final Block DEEPSLATE_SLAB = register("deepslate_slab", new OrientableSlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE)));
	public static final Block DEEPSLATE_STAIRS = register("deepslate_stairs", new OrientableStairsBlock(Blocks.DEEPSLATE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DEEPSLATE)));
	public static final Block DEEPSLATE_WALL = register("deepslate_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE).solid()));
	public static final Block CHISELED_DEEPSLATE_SLAB = register("chiseled_deepslate_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE)));
	public static final Block CHISELED_DEEPSLATE_STAIRS = register("chiseled_deepslate_stairs", new StairsBlock(Blocks.CHISELED_DEEPSLATE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE)));
	public static final Block CHISELED_DEEPSLATE_WALL = register("chiseled_deepslate_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_DEEPSLATE).solid()));
	public static final Block CRACKED_DEEPSLATE_BRICK_SLAB = register("cracked_deepslate_brick_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
	public static final Block CRACKED_DEEPSLATE_BRICK_STAIRS = register("cracked_deepslate_brick_stairs", new StairsBlock(Blocks.CRACKED_DEEPSLATE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS)));
	public static final Block CRACKED_DEEPSLATE_BRICK_WALL = register("cracked_deepslate_brick_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_BRICKS).solid()));
	public static final Block CRACKED_DEEPSLATE_TILE_SLAB = register("cracked_deepslate_tile_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_TILES)));
	public static final Block CRACKED_DEEPSLATE_TILE_STAIRS = register("cracked_deepslate_tile_stairs", new StairsBlock(Blocks.CRACKED_DEEPSLATE_TILES.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_TILES)));
	public static final Block CRACKED_DEEPSLATE_TILE_WALL = register("cracked_deepslate_tile_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_DEEPSLATE_TILES).solid()));
	
	public static final Block CHISELED_TUFF_SLAB = register("chiseled_tuff_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF)));
	public static final Block CHISELED_TUFF_STAIRS = register("chiseled_tuff_stairs", new StairsBlock(Blocks.CHISELED_TUFF.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF)));
	public static final Block CHISELED_TUFF_WALL = register("chiseled_tuff_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF).solid()));
	public static final Block CHISELED_TUFF_BRICK_SLAB = register("chiseled_tuff_brick_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF_BRICKS)));
	public static final Block CHISELED_TUFF_BRICK_STAIRS = register("chiseled_tuff_brick_stairs", new StairsBlock(Blocks.CHISELED_TUFF_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF_BRICKS)));
	public static final Block CHISELED_TUFF_BRICK_WALL = register("chiseled_tuff_brick_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_TUFF_BRICKS).solid()));
	
	public static final Block PACKED_MUD_SLAB = register("packed_mud_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.PACKED_MUD)));
	public static final Block PACKED_MUD_STAIRS = register("packed_mud_stairs", new StairsBlock(Blocks.PACKED_MUD.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PACKED_MUD)));
	public static final Block PACKED_MUD_WALL = register("packed_mud_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.PACKED_MUD).solid()));
	
	public static final Block CHISELED_SANDSTONE_SLAB = register("chiseled_sandstone_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_SANDSTONE)));
	public static final Block CHISELED_SANDSTONE_STAIRS = register("chiseled_sandstone_stairs", new StairsBlock(Blocks.CHISELED_SANDSTONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CHISELED_SANDSTONE)));
	public static final Block CHISELED_SANDSTONE_WALL = register("chiseled_sandstone_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_SANDSTONE).solid()));
	public static final Block SMOOTH_SANDSTONE_WALL = register("smooth_sandstone_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_SANDSTONE).solid()));
	public static final Block CUT_SANDSTONE_STAIRS = register("cut_sandstone_stairs", new StairsBlock(Blocks.CUT_SANDSTONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE)));
	public static final Block CUT_SANDSTONE_WALL = register("cut_sandstone_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CUT_SANDSTONE).solid()));
	
	public static final Block CHISELED_RED_SANDSTONE_SLAB = register("chiseled_red_sandstone_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_RED_SANDSTONE)));
	public static final Block CHISELED_RED_SANDSTONE_STAIRS = register("chiseled_red_sandstone_stairs", new StairsBlock(Blocks.CHISELED_RED_SANDSTONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CHISELED_RED_SANDSTONE)));
	public static final Block CHISELED_RED_SANDSTONE_WALL = register("chiseled_red_sandstone_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_RED_SANDSTONE).solid()));
	public static final Block SMOOTH_RED_SANDSTONE_WALL = register("smooth_red_sandstone_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_RED_SANDSTONE).solid()));
	public static final Block CUT_RED_SANDSTONE_STAIRS = register("cut_red_sandstone_stairs", new StairsBlock(Blocks.CUT_RED_SANDSTONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE)));
	public static final Block CUT_RED_SANDSTONE_WALL = register("cut_red_sandstone_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CUT_RED_SANDSTONE).solid()));
	
	public static final Block SEA_LANTERN_SLAB = register("sea_lantern_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.SEA_LANTERN)));
	public static final Block SEA_LANTERN_STAIRS = register("sea_lantern_stairs", new StairsBlock(Blocks.SEA_LANTERN.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SEA_LANTERN)));
	public static final Block SEA_LANTERN_WALL = register("sea_lantern_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.SEA_LANTERN).solid()));
	
	public static final Block PRISMARINE_BRICK_WALL = register("prismarine_block_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.PRISMARINE_BRICKS).solid()));
	public static final Block DARK_PRISMARINE_WALL = register("dark_prismarine_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.DARK_PRISMARINE).solid()));
	
	public static final Block NETHERRACK_SLAB = register("netherrack_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.NETHERRACK)));
	public static final Block NETHERRACK_STAIRS = register("netherrack_stairs", new StairsBlock(Blocks.NETHERRACK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.NETHERRACK)));
	public static final Block NETHERRACK_WALL = register("netherrack_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.NETHERRACK).solid()));
	
	public static final Block NETHER_BRICK_FENCE_GATE = register("nether_brick_fence_gate", new AquiferFenceGateBlock(SSWPWoodTypes.NETHER_BRICK, AbstractBlock.Settings.copy(Blocks.NETHER_BRICKS).solid()));
	public static final Block CRACKED_NETHER_BRICK_SLAB = register("cracked_nether_brick_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_NETHER_BRICKS)));
	public static final Block CRACKED_NETHER_BRICK_STAIRS = register("cracked_nether_brick_stairs", new StairsBlock(Blocks.CRACKED_NETHER_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CRACKED_NETHER_BRICKS)));
	public static final Block CRACKED_NETHER_BRICK_WALL = register("cracked_nether_brick_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_NETHER_BRICKS).solid()));
	public static final Block CRACKED_NETHER_BRICK_FENCE = register("cracked_nether_brick_fence", new FenceBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_NETHER_BRICKS).solid()));
	public static final Block CRACKED_NETHER_BRICK_FENCE_GATE = register("cracked_nether_brick_fence_gate", new AquiferFenceGateBlock(SSWPWoodTypes.NETHER_BRICK, AbstractBlock.Settings.copy(Blocks.CRACKED_NETHER_BRICKS).solid()));
	public static final Block CHISELED_NETHER_BRICK_SLAB = register("chiseled_nether_brick_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_NETHER_BRICKS)));
	public static final Block CHISELED_NETHER_BRICK_STAIRS = register("chiseled_nether_brick_stairs", new StairsBlock(Blocks.CHISELED_NETHER_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CHISELED_NETHER_BRICKS)));
	public static final Block CHISELED_NETHER_BRICK_WALL = register("chiseled_nether_brick_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_NETHER_BRICKS).solid()));
	public static final Block RED_NETHER_BRICK_FENCE = register("red_nether_brick_fence", new FenceBlock(AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS).solid()));
	public static final Block RED_NETHER_BRICK_FENCE_GATE = register("red_nether_brick_fence_gate", new AquiferFenceGateBlock(SSWPWoodTypes.NETHER_BRICK, AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS).solid()));
	
	public static final Block BASALT_SLAB = register("basalt_slab", new OrientableSlabBlock(AbstractBlock.Settings.copy(Blocks.BASALT)));
	public static final Block BASALT_STAIRS = register("basalt_stairs", new OrientableStairsBlock(Blocks.BASALT.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BASALT)));
	public static final Block BASALT_WALL = register("basalt_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BASALT).solid()));
	public static final Block SMOOTH_BASALT_SLAB = register("smooth_basalt_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)));
	public static final Block SMOOTH_BASALT_STAIRS = register("smooth_basalt_stairs", new StairsBlock(Blocks.SMOOTH_BASALT.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT)));
	public static final Block SMOOTH_BASALT_WALL = register("smooth_basalt_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_BASALT).solid()));
	public static final Block POLISHED_BASALT_SLAB = register("polished_basalt_slab", new OrientableSlabBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BASALT)));
	public static final Block POLISHED_BASALT_STAIRS = register("polished_basalt_stairs", new OrientableStairsBlock(Blocks.POLISHED_BASALT.getDefaultState(), AbstractBlock.Settings.copy(Blocks.POLISHED_BASALT)));
	public static final Block POLISHED_BASALT_WALL = register("polished_basalt_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.POLISHED_BASALT).solid()));
	
	public static final Block GILDED_BLACKSTONE_SLAB = register("gilded_blackstone_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));
	public static final Block GILDED_BLACKSTONE_STAIRS = register("gilded_blackstone_stairs", new StairsBlock(Blocks.GILDED_BLACKSTONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE)));
	public static final Block GILDED_BLACKSTONE_WALL = register("gilded_blackstone_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.GILDED_BLACKSTONE).solid()));
	public static final Block CHISELED_POLISHED_BLACKSTONE_SLAB = register("chiseled_polished_blackstone_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_POLISHED_BLACKSTONE)));
	public static final Block CHISELED_POLISHED_BLACKSTONE_STAIRS = register("chiseled_polished_blackstone_stairs", new StairsBlock(Blocks.CHISELED_POLISHED_BLACKSTONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CHISELED_POLISHED_BLACKSTONE)));
	public static final Block CHISELED_POLISHED_BLACKSTONE_WALL = register("chiseled_polished_blackstone_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_POLISHED_BLACKSTONE).solid()));
	public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_SLAB = register("cracked_polished_blackstone_brick_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)));
	public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_STAIRS = register("cracked_polished_blackstone_brick_stairs", new StairsBlock(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS)));
	public static final Block CRACKED_POLISHED_BLACKSTONE_BRICK_WALL = register("cracked_polished_blackstone_brick_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS).solid()));
	
	public static final Block END_STONE_SLAB = register("end_stone_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.END_STONE)));
	public static final Block END_STONE_STAIRS = register("end_stone_stairs", new StairsBlock(Blocks.END_STONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.END_STONE)));
	public static final Block END_STONE_WALL = register("end_stone_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.END_STONE).solid()));
	
	public static final Block PURPUR_WALL = register("purpur_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK).solid()));
	public static final Block PURPUR_PILLAR_SLAB = register("purpur_pillar_slab", new OrientableSlabBlock(AbstractBlock.Settings.copy(Blocks.PURPUR_PILLAR)));
	public static final Block PURPUR_PILLAR_STAIRS = register("purpur_pillar_stairs", new OrientableStairsBlock(Blocks.PURPUR_PILLAR.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PURPUR_PILLAR)));
	public static final Block PURPUR_PILLAR_WALL = register("purpur_pillar_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.PURPUR_PILLAR)));
	
	public static final Block COAL_SLAB = register("coal_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.COAL_BLOCK)));
	public static final Block COAL_STAIRS = register("coal_stairs", new StairsBlock(Blocks.COAL_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.COAL_BLOCK)));
	public static final Block COAL_WALL = register("coal_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.COAL_BLOCK).solid()));
	
	public static final Block IRON_SLAB = register("iron_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
	public static final Block IRON_STAIRS = register("iron_stairs", new StairsBlock(Blocks.IRON_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.IRON_BLOCK)));
	public static final Block IRON_WALL = register("iron_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).solid()));
	public static final Block IRON_FENCE = register("iron_fence", new FenceBlock(AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).solid()));
	public static final Block IRON_FENCE_GATE = register("iron_fence_gate", new AquiferFenceGateBlock(SSWPWoodTypes.IRON, AbstractBlock.Settings.copy(Blocks.IRON_BLOCK).solid()));
	public static final Block IRON_BUTTON = register("iron_button", new ButtonBlock(BlockSetType.IRON, 20, AbstractBlock.Settings.create().noCollision().strength(0.5f).pistonBehavior(PistonBehavior.DESTROY)));
	
	public static final Block GOLD_SLAB = register("gold_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));
	public static final Block GOLD_STAIRS = register("gold_stairs", new StairsBlock(Blocks.GOLD_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK)));
	public static final Block GOLD_WALL = register("gold_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK).solid()));
	public static final Block GOLD_FENCE = register("gold_fence", new FenceBlock(AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK).solid()));
	public static final Block GOLD_FENCE_GATE = register("gold_fence_gate", new AquiferFenceGateBlock(SSWPWoodTypes.GOLD, AbstractBlock.Settings.copy(Blocks.GOLD_BLOCK).solid()));
	public static final Block GOLD_BARS = register("gold_bars", new PaneBlock(AbstractBlock.Settings.create().requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.METAL).nonOpaque()));
	public static final Block GOLD_DOOR = register("gold_door", new DoorBlock(BlockSetType.GOLD, AbstractBlock.Settings.create().mapColor(MapColor.GOLD).requiresTool().strength(3.0f).nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));
	public static final Block GOLD_TRAPDOOR = register("gold_trapdoor", new TrapdoorBlock(BlockSetType.GOLD, AbstractBlock.Settings.create().mapColor(MapColor.GOLD).requiresTool().strength(3.0f).nonOpaque().allowsSpawning(Blocks::never)));
	public static final Block GOLD_BUTTON = register("gold_button", new ButtonBlock(BlockSetType.GOLD, 20, AbstractBlock.Settings.create().noCollision().strength(0.5f).pistonBehavior(PistonBehavior.DESTROY)));
	public static final Block GOLD_CHAIN = register("gold_chain", new ChainBlock(AbstractBlock.Settings.create().solid().requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.CHAIN).nonOpaque()));
	
	public static final Block REDSTONE_SLAB = register("redstone_slab", new RedstoneSlabBlock(AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK)));
	public static final Block REDSTONE_STAIRS = register("redstone_stairs", new RedstoneStairsBlock(Blocks.REDSTONE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK)));
	public static final Block REDSTONE_WALL = register("redstone_wall", new RedstoneWallBlock(AbstractBlock.Settings.copy(Blocks.REDSTONE_BLOCK).solid()));
	
	public static final Block EMERALD_SLAB = register("emerald_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK)));
	public static final Block EMERALD_STAIRS = register("emerald_stairs", new StairsBlock(Blocks.EMERALD_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK)));
	public static final Block EMERALD_WALL = register("emerald_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.EMERALD_BLOCK).solid()));
	
	public static final Block LAPIS_SLAB = register("lapis_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK)));
	public static final Block LAPIS_STAIRS = register("lapis_stairs", new StairsBlock(Blocks.LAPIS_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK)));
	public static final Block LAPIS_WALL = register("lapis_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.LAPIS_BLOCK).solid()));
	
	public static final Block DIAMOND_SLAB = register("diamond_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)));
	public static final Block DIAMOND_STAIRS = register("diamond_stairs", new StairsBlock(Blocks.DIAMOND_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK)));
	public static final Block DIAMOND_WALL = register("diamond_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.DIAMOND_BLOCK).solid()));
	
	public static final Block NETHERITE_SLAB = register("netherite_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK)));
	public static final Block NETHERITE_STAIRS = register("netherite_stairs", new StairsBlock(Blocks.NETHERITE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK)));
	public static final Block NETHERITE_WALL = register("netherite_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK).solid()));
	public static final Block NETHERITE_FENCE = register("netherite_fence", new FenceBlock(AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK).solid()));
	public static final Block NETHERITE_FENCE_GATE = register("netherite_fence_gate", new AquiferFenceGateBlock(SSWPWoodTypes.NETHERITE, AbstractBlock.Settings.copy(Blocks.NETHERITE_BLOCK).solid()));
	public static final Block NETHERITE_BARS = register("netherite_bars", new PaneBlock(AbstractBlock.Settings.create().requiresTool().strength(50.0f, 1200.0f).sounds(BlockSoundGroup.NETHERITE).nonOpaque()));
	public static final Block NETHERITE_DOOR = register("netherite_door", new DoorBlock(SSWPBlockSetTypes.NETHERITE, AbstractBlock.Settings.create().mapColor(MapColor.BLACK).requiresTool().strength(50.0f, 1200.0f).nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));
	public static final Block NETHERITE_TRAPDOOR = register("netherite_trapdoor", new TrapdoorBlock(SSWPBlockSetTypes.NETHERITE, AbstractBlock.Settings.create().mapColor(MapColor.BLACK).requiresTool().strength(50.0f, 1200.0f).nonOpaque().allowsSpawning(Blocks::never)));
	public static final Block NETHERITE_PRESSURE_PLATE = register("netherite_pressure_plate", new PressurePlateBlock(SSWPBlockSetTypes.NETHERITE, AbstractBlock.Settings.create().mapColor(MapColor.BLACK).solid().requiresTool().noCollision().strength(5.0f, 12.0f).pistonBehavior(PistonBehavior.DESTROY)));
	public static final Block NETHERITE_BUTTON = register("netherite_button", new ButtonBlock(SSWPBlockSetTypes.NETHERITE, 10, AbstractBlock.Settings.create().noCollision().strength(5.0f, 12.0f).pistonBehavior(PistonBehavior.DESTROY)));
	public static final Block NETHERITE_CHAIN = register("netherite_chain", new ChainBlock(AbstractBlock.Settings.create().solid().requiresTool().strength(50.0f, 1200.0f).sounds(BlockSoundGroup.CHAIN).nonOpaque()));
	
	public static final Block QUARTZ_WALL = register("quartz_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_BLOCK)));
	public static final Block CHISELED_QUARTZ_SLAB = register("chiseled_quartz_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_QUARTZ_BLOCK)));
	public static final Block CHISELED_QUARTZ_STAIRS = register("chiseled_quartz_stairs", new StairsBlock(Blocks.CHISELED_QUARTZ_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CHISELED_QUARTZ_BLOCK)));
	public static final Block CHISELED_QUARTZ_WALL = register("chiseled_quartz_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CHISELED_QUARTZ_BLOCK).solid()));
	public static final Block QUARTZ_BRICK_SLAB = register("quartz_brick_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS)));
	public static final Block QUARTZ_BRICK_STAIRS = register("quartz_brick_stairs", new StairsBlock(Blocks.QUARTZ_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS)));
	public static final Block QUARTZ_BRICK_WALL = register("quartz_brick_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_BRICKS).solid()));
	public static final Block QUARTZ_PILLAR_SLAB = register("quartz_pillar_slab", new OrientableSlabBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_PILLAR)));
	public static final Block QUARTZ_PILLAR_STAIRS = register("quartz_pillar_stairs", new OrientableStairsBlock(Blocks.QUARTZ_PILLAR.getDefaultState(), AbstractBlock.Settings.copy(Blocks.QUARTZ_PILLAR)));
	public static final Block QUARTZ_PILLAR_WALL = register("quartz_pillar_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.QUARTZ_PILLAR).solid()));
	public static final Block SMOOTH_QUARTZ_WALL = register("smooth_quartz_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_QUARTZ).solid()));
	
	public static final Block AMETHYST_SLAB = register("amethyst_slab", new AmethystSlabBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK)));
	public static final Block AMETHYST_STAIRS = register("amethyst_stairs", new AmethystStairsBlock(Blocks.AMETHYST_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK)));
	public static final Block AMETHYST_WALL = register("amethyst_wall", new AmethystWallBlock(AbstractBlock.Settings.copy(Blocks.AMETHYST_BLOCK).solid()));
	
	public static final Block COPPER_SLAB = register("copper_slab", new OxidizableSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
	public static final Block COPPER_STAIRS = register("copper_stairs", new OxidizableStairsBlock(Oxidizable.OxidationLevel.UNAFFECTED, Blocks.COPPER_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK)));
	public static final Block COPPER_WALL = register("copper_wall", new OxidizableWallBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK).solid()));
	public static final Block COPPER_FENCE = register("copper_fence", new OxidizableFenceBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK).solid()));
	public static final Block COPPER_FENCE_GATE = register("copper_fence_gate", new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.UNAFFECTED, SSWPWoodTypes.COPPER, AbstractBlock.Settings.copy(Blocks.COPPER_BLOCK).solid()));
	public static final Block COPPER_BARS = register("copper_bars", new OxidizablePaneBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.create().requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.COPPER_GRATE).nonOpaque()));
	public static final Block COPPER_PRESSURE_PLATE = register("copper_pressure_plate", new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.UNAFFECTED, BlockSetType.COPPER, AbstractBlock.Settings.create().mapColor(Blocks.COPPER_BLOCK.getDefaultMapColor()).solid().requiresTool().noCollision().strength(0.5f).pistonBehavior(PistonBehavior.DESTROY)));
	public static final Block COPPER_BUTTON = register("copper_button", new OxidizableButtonBlock(Oxidizable.OxidationLevel.UNAFFECTED, BlockSetType.COPPER, AbstractBlock.Settings.create().noCollision().strength(0.5f).pistonBehavior(PistonBehavior.DESTROY)));
	public static final Block COPPER_CHAIN = register("copper_chain", new OxidizableChainBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.create().solid().requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.CHAIN).nonOpaque()));
	public static final Block CHISELED_COPPER_SLAB = register("chiseled_copper_slab", new OxidizableSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.CHISELED_COPPER)));
	public static final Block CHISELED_COPPER_STAIRS = register("chiseled_copper_stairs", new OxidizableStairsBlock(Oxidizable.OxidationLevel.UNAFFECTED, Blocks.CHISELED_COPPER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CHISELED_COPPER)));
	public static final Block CHISELED_COPPER_WALL = register("chiseled_copper_wall", new OxidizableWallBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.CHISELED_COPPER)));
	public static final Block COPPER_GRATE_SLAB = register("copper_grate_slab", new OxidizableGrateSlabBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.COPPER_GRATE)));
	public static final Block COPPER_GRATE_STAIRS = register("copper_grate_stairs", new OxidizableGrateStairsBlock(Oxidizable.OxidationLevel.UNAFFECTED, Blocks.COPPER_GRATE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.COPPER_GRATE)));
	public static final Block COPPER_GRATE_WALL = register("copper_grate_wall", new OxidizableGrateWallBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.COPPER_GRATE)));
	public static final Block CUT_COPPER_WALL = register("cut_copper_wall", new OxidizableWallBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.copy(Blocks.CUT_COPPER)));
	public static final Block EXPOSED_COPPER_SLAB = register("exposed_copper_slab", new OxidizableSlabBlock(Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER)));
	public static final Block EXPOSED_COPPER_STAIRS = register("exposed_copper_stairs", new OxidizableStairsBlock(Oxidizable.OxidationLevel.EXPOSED, Blocks.EXPOSED_COPPER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER)));
	public static final Block EXPOSED_COPPER_WALL = register("exposed_copper_wall", new OxidizableWallBlock(Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER).solid()));
	public static final Block EXPOSED_COPPER_FENCE = register("exposed_copper_fence", new OxidizableFenceBlock(Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER).solid()));
	public static final Block EXPOSED_COPPER_FENCE_GATE = register("exposed_copper_fence_gate", new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.EXPOSED, SSWPWoodTypes.EXPOSED_COPPER, AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER).solid()));
	public static final Block EXPOSED_COPPER_BARS = register("exposed_copper_bars", new OxidizablePaneBlock(Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.create().requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.COPPER_GRATE).nonOpaque()));
	public static final Block EXPOSED_COPPER_PRESSURE_PLATE = register("exposed_copper_pressure_plate", new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.EXPOSED, BlockSetType.COPPER, AbstractBlock.Settings.create().mapColor(Blocks.EXPOSED_COPPER.getDefaultMapColor()).solid().requiresTool().noCollision().strength(0.5f).pistonBehavior(PistonBehavior.DESTROY)));
	public static final Block EXPOSED_COPPER_BUTTON = register("exposed_copper_button", new OxidizableButtonBlock(Oxidizable.OxidationLevel.EXPOSED, BlockSetType.COPPER, AbstractBlock.Settings.create().noCollision().strength(0.5f).pistonBehavior(PistonBehavior.DESTROY)));
	public static final Block EXPOSED_COPPER_CHAIN = register("exposed_copper_chain", new OxidizableChainBlock(Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.create().solid().requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.CHAIN).nonOpaque()));
	public static final Block EXPOSED_CHISELED_COPPER_SLAB = register("exposed_chiseled_copper_slab", new OxidizableSlabBlock(Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(Blocks.EXPOSED_CHISELED_COPPER)));
	public static final Block EXPOSED_CHISELED_COPPER_STAIRS = register("exposed_chiseled_copper_stairs", new OxidizableStairsBlock(Oxidizable.OxidationLevel.EXPOSED, Blocks.EXPOSED_CHISELED_COPPER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.EXPOSED_CHISELED_COPPER)));
	public static final Block EXPOSED_CHISELED_COPPER_WALL = register("exposed_chiseled_copper_wall", new OxidizableWallBlock(Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(Blocks.EXPOSED_CHISELED_COPPER)));
	public static final Block EXPOSED_COPPER_GRATE_SLAB = register("exposed_copper_grate_slab", new OxidizableGrateSlabBlock(Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER_GRATE)));
	public static final Block EXPOSED_COPPER_GRATE_STAIRS = register("exposed_copper_grate_stairs", new OxidizableGrateStairsBlock(Oxidizable.OxidationLevel.EXPOSED, Blocks.EXPOSED_COPPER_GRATE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER_GRATE)));
	public static final Block EXPOSED_COPPER_GRATE_WALL = register("exposed_copper_grate_wall", new OxidizableGrateWallBlock(Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(Blocks.EXPOSED_COPPER_GRATE)));
	public static final Block EXPOSED_CUT_COPPER_WALL = register("exposed_cut_copper_wall", new OxidizableWallBlock(Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(Blocks.EXPOSED_CUT_COPPER)));
	public static final Block WEATHERED_COPPER_SLAB = register("weathered_copper_slab", new OxidizableSlabBlock(Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER)));
	public static final Block WEATHERED_COPPER_STAIRS = register("weathered_copper_stairs", new OxidizableStairsBlock(Oxidizable.OxidationLevel.WEATHERED, Blocks.WEATHERED_COPPER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER)));
	public static final Block WEATHERED_COPPER_WALL = register("weathered_copper_wall", new OxidizableWallBlock(Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER).solid()));
	public static final Block WEATHERED_COPPER_FENCE = register("weathered_copper_fence", new OxidizableFenceBlock(Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER).solid()));
	public static final Block WEATHERED_COPPER_FENCE_GATE = register("weathered_copper_fence_gate", new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.WEATHERED, SSWPWoodTypes.WEATHERED_COPPER, AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER).solid()));
	public static final Block WEATHERED_COPPER_BARS = register("weathered_copper_bars", new OxidizablePaneBlock(Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.create().requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.COPPER_GRATE).nonOpaque()));
	public static final Block WEATHERED_COPPER_PRESSURE_PLATE = register("weathered_copper_pressure_plate", new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.WEATHERED, BlockSetType.COPPER, AbstractBlock.Settings.create().mapColor(Blocks.WEATHERED_COPPER.getDefaultMapColor()).solid().requiresTool().noCollision().strength(0.5f).pistonBehavior(PistonBehavior.DESTROY)));
	public static final Block WEATHERED_COPPER_BUTTON = register("weathered_copper_button", new OxidizableButtonBlock(Oxidizable.OxidationLevel.WEATHERED, BlockSetType.COPPER, AbstractBlock.Settings.create().noCollision().strength(0.5f).pistonBehavior(PistonBehavior.DESTROY)));
	public static final Block WEATHERED_COPPER_CHAIN = register("weathered_copper_chain", new OxidizableChainBlock(Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.create().solid().requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.CHAIN).nonOpaque()));
	public static final Block WEATHERED_CHISELED_COPPER_SLAB = register("weathered_chiseled_copper_slab", new OxidizableSlabBlock(Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(Blocks.WEATHERED_CHISELED_COPPER)));
	public static final Block WEATHERED_CHISELED_COPPER_STAIRS = register("weathered_chiseled_copper_stairs", new OxidizableStairsBlock(Oxidizable.OxidationLevel.WEATHERED, Blocks.WEATHERED_CHISELED_COPPER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WEATHERED_CHISELED_COPPER)));
	public static final Block WEATHERED_CHISELED_COPPER_WALL = register("weathered_chiseled_copper_wall", new OxidizableWallBlock(Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(Blocks.WEATHERED_CHISELED_COPPER)));
	public static final Block WEATHERED_COPPER_GRATE_SLAB = register("weathered_copper_grate_slab", new OxidizableGrateSlabBlock(Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER_GRATE)));
	public static final Block WEATHERED_COPPER_GRATE_STAIRS = register("weathered_copper_grate_stairs", new OxidizableGrateStairsBlock(Oxidizable.OxidationLevel.WEATHERED, Blocks.WEATHERED_COPPER_GRATE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER_GRATE)));
	public static final Block WEATHERED_COPPER_GRATE_WALL = register("weathered_copper_grate_wall", new OxidizableGrateWallBlock(Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(Blocks.WEATHERED_COPPER_GRATE)));
	public static final Block WEATHERED_CUT_COPPER_WALL = register("weathered_cut_copper_wall", new OxidizableWallBlock(Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(Blocks.WEATHERED_CUT_COPPER)));
	public static final Block OXIDIZED_COPPER_SLAB = register("oxidized_copper_slab", new OxidizableSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER)));
	public static final Block OXIDIZED_COPPER_STAIRS = register("oxidized_copper_stairs", new OxidizableStairsBlock(Oxidizable.OxidationLevel.OXIDIZED, Blocks.OXIDIZED_COPPER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER)));
	public static final Block OXIDIZED_COPPER_WALL = register("oxidized_copper_wall", new OxidizableWallBlock(Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER).solid()));
	public static final Block OXIDIZED_COPPER_FENCE = register("oxidized_copper_fence", new OxidizableFenceBlock(Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER).solid()));
	public static final Block OXIDIZED_COPPER_FENCE_GATE = register("oxidized_copper_fence_gate", new OxidizableFenceGateBlock(Oxidizable.OxidationLevel.OXIDIZED, SSWPWoodTypes.OXIDIZED_COPPER, AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER).solid()));
	public static final Block OXIDIZED_COPPER_BARS = register("oxidized_copper_bars", new OxidizablePaneBlock(Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.create().requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.COPPER_GRATE).nonOpaque()));
	public static final Block OXIDIZED_COPPER_PRESSURE_PLATE = register("oxidized_copper_pressure_plate", new OxidizablePressurePlateBlock(Oxidizable.OxidationLevel.OXIDIZED, BlockSetType.COPPER, AbstractBlock.Settings.create().mapColor(Blocks.OXIDIZED_COPPER.getDefaultMapColor()).solid().requiresTool().noCollision().strength(0.5f).pistonBehavior(PistonBehavior.DESTROY)));
	public static final Block OXIDIZED_COPPER_BUTTON = register("oxidized_copper_button", new OxidizableButtonBlock(Oxidizable.OxidationLevel.OXIDIZED, BlockSetType.COPPER, AbstractBlock.Settings.create().noCollision().strength(0.5f).pistonBehavior(PistonBehavior.DESTROY)));
	public static final Block OXIDIZED_COPPER_CHAIN = register("oxidized_copper_chain", new OxidizableChainBlock(Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.create().solid().requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.CHAIN).nonOpaque()));
	public static final Block OXIDIZED_CHISELED_COPPER_SLAB = register("oxidized_chiseled_copper_slab", new OxidizableSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(Blocks.OXIDIZED_CHISELED_COPPER)));
	public static final Block OXIDIZED_CHISELED_COPPER_STAIRS = register("oxidized_chiseled_copper_stairs", new OxidizableStairsBlock(Oxidizable.OxidationLevel.OXIDIZED, Blocks.OXIDIZED_CHISELED_COPPER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OXIDIZED_CHISELED_COPPER)));
	public static final Block OXIDIZED_CHISELED_COPPER_WALL = register("oxidized_chiseled_copper_wall", new OxidizableWallBlock(Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(Blocks.OXIDIZED_CHISELED_COPPER)));
	public static final Block OXIDIZED_COPPER_GRATE_SLAB = register("oxidized_copper_grate_slab", new OxidizableGrateSlabBlock(Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER_GRATE)));
	public static final Block OXIDIZED_COPPER_GRATE_STAIRS = register("oxidized_copper_grate_stairs", new OxidizableGrateStairsBlock(Oxidizable.OxidationLevel.OXIDIZED, Blocks.OXIDIZED_COPPER_GRATE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER_GRATE)));
	public static final Block OXIDIZED_COPPER_GRATE_WALL = register("oxidized_copper_grate_wall", new OxidizableGrateWallBlock(Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(Blocks.OXIDIZED_COPPER_GRATE)));
	public static final Block OXIDIZED_CUT_COPPER_WALL = register("oxidized_cut_copper_wall", new OxidizableWallBlock(Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(Blocks.OXIDIZED_CUT_COPPER)));
	public static final Block WAXED_COPPER_SLAB = register("waxed_copper_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_BLOCK)));
	public static final Block WAXED_COPPER_STAIRS = register("waxed_copper_stairs", new StairsBlock(Blocks.WAXED_COPPER_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_BLOCK)));
	public static final Block WAXED_COPPER_WALL = register("waxed_copper_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_BLOCK).solid()));
	public static final Block WAXED_COPPER_FENCE = register("waxed_copper_fence", new FenceBlock(AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_BLOCK).solid()));
	public static final Block WAXED_COPPER_FENCE_GATE = register("waxed_copper_fence_gate", new AquiferFenceGateBlock(SSWPWoodTypes.COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_BLOCK).solid()));
	public static final Block WAXED_COPPER_BARS = register("waxed_copper_bars", new WaxedPaneBlock(AbstractBlock.Settings.copy(COPPER_BARS)));
	public static final Block WAXED_COPPER_PRESSURE_PLATE = register("waxed_copper_pressure_plate", new PressurePlateBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(COPPER_PRESSURE_PLATE)));
	public static final Block WAXED_COPPER_BUTTON = register("waxed_copper_button", new ButtonBlock(BlockSetType.COPPER, 20, AbstractBlock.Settings.copy(COPPER_BUTTON)));
	public static final Block WAXED_COPPER_CHAIN = register("waxed_copper_chain", new ChainBlock(AbstractBlock.Settings.copy(COPPER_CHAIN)));
	public static final Block WAXED_CHISELED_COPPER_SLAB = register("waxed_chiseled_copper_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_CHISELED_COPPER)));
	public static final Block WAXED_CHISELED_COPPER_STAIRS = register("waxed_chiseled_copper_stairs", new StairsBlock(Blocks.WAXED_CHISELED_COPPER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WAXED_CHISELED_COPPER)));
	public static final Block WAXED_CHISELED_COPPER_WALL = register("waxed_chiseled_copper_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.WAXED_CHISELED_COPPER).solid()));
	public static final Block WAXED_COPPER_GRATE_SLAB = register("waxed_copper_grate_slab", new TransparentSlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_GRATE)));
	public static final Block WAXED_COPPER_GRATE_STAIRS = register("waxed_copper_grate_stairs", new TransparentStairsBlock(Blocks.WAXED_COPPER_GRATE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_GRATE)));
	public static final Block WAXED_COPPER_GRATE_WALL = register("waxed_copper_grate_wall", new TransparentWallBlock(AbstractBlock.Settings.copy(Blocks.WAXED_COPPER_GRATE).solid()));
	public static final Block WAXED_CUT_COPPER_WALL = register("waxed_cut_copper_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.WAXED_CUT_COPPER)));
	public static final Block WAXED_EXPOSED_COPPER_SLAB = register("waxed_exposed_copper_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER)));
	public static final Block WAXED_EXPOSED_COPPER_STAIRS = register("waxed_exposed_copper_stairs", new StairsBlock(Blocks.WAXED_EXPOSED_COPPER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER)));
	public static final Block WAXED_EXPOSED_COPPER_WALL = register("waxed_exposed_copper_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER).solid()));
	public static final Block WAXED_EXPOSED_COPPER_FENCE = register("waxed_exposed_copper_fence", new FenceBlock(AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER).solid()));
	public static final Block WAXED_EXPOSED_COPPER_FENCE_GATE = register("waxed_exposed_copper_fence_gate", new AquiferFenceGateBlock(SSWPWoodTypes.EXPOSED_COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER).solid()));
	public static final Block WAXED_EXPOSED_COPPER_BARS = register("waxed_exposed_copper_bars", new WaxedPaneBlock(AbstractBlock.Settings.copy(EXPOSED_COPPER_BARS)));
	public static final Block WAXED_EXPOSED_COPPER_PRESSURE_PLATE = register("waxed_exposed_copper_pressure_plate", new PressurePlateBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(EXPOSED_COPPER_PRESSURE_PLATE)));
	public static final Block WAXED_EXPOSED_COPPER_BUTTON = register("waxed_exposed_copper_button", new ButtonBlock(BlockSetType.COPPER, 25, AbstractBlock.Settings.copy(EXPOSED_COPPER_BUTTON)));
	public static final Block WAXED_EXPOSED_COPPER_CHAIN = register("waxed_exposed_copper_chain", new ChainBlock(AbstractBlock.Settings.copy(EXPOSED_COPPER_CHAIN)));
	public static final Block WAXED_EXPOSED_CHISELED_COPPER_SLAB = register("waxed_exposed_chiseled_copper_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CHISELED_COPPER)));
	public static final Block WAXED_EXPOSED_CHISELED_COPPER_STAIRS = register("waxed_exposed_chiseled_copper_stairs", new StairsBlock(Blocks.WAXED_EXPOSED_CHISELED_COPPER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CHISELED_COPPER)));
	public static final Block WAXED_EXPOSED_CHISELED_COPPER_WALL = register("waxed_exposed_chiseled_copper_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CHISELED_COPPER).solid()));
	public static final Block WAXED_EXPOSED_COPPER_GRATE_SLAB = register("waxed_exposed_copper_grate_slab", new TransparentSlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER_GRATE)));
	public static final Block WAXED_EXPOSED_COPPER_GRATE_STAIRS = register("waxed_exposed_copper_grate_stairs", new TransparentStairsBlock(Blocks.WAXED_EXPOSED_COPPER_GRATE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER_GRATE)));
	public static final Block WAXED_EXPOSED_COPPER_GRATE_WALL = register("waxed_exposed_copper_grate_wall", new TransparentWallBlock(AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_COPPER_GRATE).solid()));
	public static final Block WAXED_EXPOSED_CUT_COPPER_WALL = register("waxed_exposed_cut_copper_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.WAXED_EXPOSED_CUT_COPPER)));
	public static final Block WAXED_WEATHERED_COPPER_SLAB = register("waxed_weathered_copper_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER)));
	public static final Block WAXED_WEATHERED_COPPER_STAIRS = register("waxed_weathered_copper_stairs", new StairsBlock(Blocks.WAXED_WEATHERED_COPPER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER)));
	public static final Block WAXED_WEATHERED_COPPER_WALL = register("waxed_weathered_copper_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER).solid()));
	public static final Block WAXED_WEATHERED_COPPER_FENCE = register("waxed_weathered_copper_fence", new FenceBlock(AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER).solid()));
	public static final Block WAXED_WEATHERED_COPPER_FENCE_GATE = register("waxed_weathered_copper_fence_gate", new AquiferFenceGateBlock(SSWPWoodTypes.WEATHERED_COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER).solid()));
	public static final Block WAXED_WEATHERED_COPPER_BARS = register("waxed_weathered_copper_bars", new WaxedPaneBlock(AbstractBlock.Settings.copy(WEATHERED_COPPER_BARS)));
	public static final Block WAXED_WEATHERED_COPPER_PRESSURE_PLATE = register("waxed_weathered_copper_pressure_plate", new PressurePlateBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(WEATHERED_COPPER_PRESSURE_PLATE)));
	public static final Block WAXED_WEATHERED_COPPER_BUTTON = register("waxed_weathered_copper_button", new ButtonBlock(BlockSetType.COPPER, 30, AbstractBlock.Settings.copy(WEATHERED_COPPER_BUTTON)));
	public static final Block WAXED_WEATHERED_COPPER_CHAIN = register("waxed_weathered_copper_chain", new ChainBlock(AbstractBlock.Settings.copy(WEATHERED_COPPER_CHAIN)));
	public static final Block WAXED_WEATHERED_CHISELED_COPPER_SLAB = register("waxed_weathered_chiseled_copper_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CHISELED_COPPER)));
	public static final Block WAXED_WEATHERED_CHISELED_COPPER_STAIRS = register("waxed_weathered_chiseled_copper_stairs", new StairsBlock(Blocks.WAXED_WEATHERED_CHISELED_COPPER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CHISELED_COPPER)));
	public static final Block WAXED_WEATHERED_CHISELED_COPPER_WALL = register("waxed_weathered_chiseled_copper_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CHISELED_COPPER).solid()));
	public static final Block WAXED_WEATHERED_COPPER_GRATE_SLAB = register("waxed_weathered_copper_grate_slab", new TransparentSlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER_GRATE)));
	public static final Block WAXED_WEATHERED_COPPER_GRATE_STAIRS = register("waxed_weathered_copper_grate_stairs", new TransparentStairsBlock(Blocks.WAXED_WEATHERED_COPPER_GRATE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER_GRATE)));
	public static final Block WAXED_WEATHERED_COPPER_GRATE_WALL = register("waxed_weathered_copper_grate_wall", new TransparentWallBlock(AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_COPPER_GRATE).solid()));
	public static final Block WAXED_WEATHERED_CUT_COPPER_WALL = register("waxed_weathered_cut_copper_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.WAXED_WEATHERED_CUT_COPPER)));
	public static final Block WAXED_OXIDIZED_COPPER_SLAB = register("waxed_oxidized_copper_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER)));
	public static final Block WAXED_OXIDIZED_COPPER_STAIRS = register("waxed_oxidized_copper_stairs", new StairsBlock(Blocks.WAXED_OXIDIZED_COPPER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER)));
	public static final Block WAXED_OXIDIZED_COPPER_WALL = register("waxed_oxidized_copper_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER).solid()));
	public static final Block WAXED_OXIDIZED_COPPER_FENCE = register("waxed_oxidized_copper_fence", new FenceBlock(AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER).solid()));
	public static final Block WAXED_OXIDIZED_COPPER_FENCE_GATE = register("waxed_oxidized_copper_fence_gate", new AquiferFenceGateBlock(SSWPWoodTypes.OXIDIZED_COPPER, AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER).solid()));
	public static final Block WAXED_OXIDIZED_COPPER_BARS = register("waxed_oxidized_copper_bars", new WaxedPaneBlock(AbstractBlock.Settings.copy(OXIDIZED_COPPER_BARS)));
	public static final Block WAXED_OXIDIZED_COPPER_PRESSURE_PLATE = register("waxed_oxidized_copper_pressure_plate", new PressurePlateBlock(BlockSetType.COPPER, AbstractBlock.Settings.copy(OXIDIZED_COPPER_PRESSURE_PLATE)));
	public static final Block WAXED_OXIDIZED_COPPER_BUTTON = register("waxed_oxidized_copper_button", new ButtonBlock(BlockSetType.COPPER, 35, AbstractBlock.Settings.copy(OXIDIZED_COPPER_BUTTON)));
	public static final Block WAXED_OXIDIZED_COPPER_CHAIN = register("waxed_oxidized_copper_chain", new ChainBlock(AbstractBlock.Settings.copy(OXIDIZED_COPPER_CHAIN)));
	public static final Block WAXED_OXIDIZED_CHISELED_COPPER_SLAB = register("waxed_oxidized_chiseled_copper_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CHISELED_COPPER)));
	public static final Block WAXED_OXIDIZED_CHISELED_COPPER_STAIRS = register("waxed_oxidized_chiseled_copper_stairs", new StairsBlock(Blocks.WAXED_OXIDIZED_CHISELED_COPPER.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CHISELED_COPPER)));
	public static final Block WAXED_OXIDIZED_CHISELED_COPPER_WALL = register("waxed_oxidized_chiseled_copper_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CHISELED_COPPER).solid()));
	public static final Block WAXED_OXIDIZED_COPPER_GRATE_SLAB = register("waxed_oxidized_copper_grate_slab", new TransparentSlabBlock(AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER_GRATE)));
	public static final Block WAXED_OXIDIZED_COPPER_GRATE_STAIRS = register("waxed_oxidized_copper_grate_stairs", new TransparentStairsBlock(Blocks.WAXED_OXIDIZED_COPPER_GRATE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER_GRATE)));
	public static final Block WAXED_OXIDIZED_COPPER_GRATE_WALL = register("waxed_oxidized_copper_grate_wall", new TransparentWallBlock(AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_COPPER_GRATE).solid()));
	public static final Block WAXED_OXIDIZED_CUT_COPPER_WALL = register("waxed_oxidized_cut_copper_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.WAXED_OXIDIZED_CUT_COPPER)));
	
	public static final Block WHITE_WOOL_SLAB = register("white_wool_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
	public static final Block WHITE_WOOL_STAIRS = register("white_wool_stairs", new StairsBlock(Blocks.WHITE_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WHITE_WOOL)));
	public static final Block WHITE_WOOL_WALL = register("white_wool_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.WHITE_WOOL).solid()));
	public static final Block LIGHT_GRAY_WOOL_SLAB = register("light_gray_wool_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL)));
	public static final Block LIGHT_GRAY_WOOL_STAIRS = register("light_gray_wool_stairs", new StairsBlock(Blocks.LIGHT_GRAY_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL)));
	public static final Block LIGHT_GRAY_WOOL_WALL = register("light_gray_wool_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_WOOL).solid()));
	public static final Block GRAY_WOOL_SLAB = register("gray_wool_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.GRAY_WOOL)));
	public static final Block GRAY_WOOL_STAIRS = register("gray_wool_stairs", new StairsBlock(Blocks.GRAY_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GRAY_WOOL)));
	public static final Block GRAY_WOOL_WALL = register("gray_wool_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.GRAY_WOOL).solid()));
	public static final Block BLACK_WOOL_SLAB = register("black_wool_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL)));
	public static final Block BLACK_WOOL_STAIRS = register("black_wool_stairs", new StairsBlock(Blocks.BLACK_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLACK_WOOL)));
	public static final Block BLACK_WOOL_WALL = register("black_wool_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BLACK_WOOL).solid()));
	public static final Block BROWN_WOOL_SLAB = register("brown_wool_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_WOOL)));
	public static final Block BROWN_WOOL_STAIRS = register("brown_wool_stairs", new StairsBlock(Blocks.BROWN_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BROWN_WOOL)));
	public static final Block BROWN_WOOL_WALL = register("brown_wool_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BROWN_WOOL).solid()));
	public static final Block RED_WOOL_SLAB = register("red_wool_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_WOOL)));
	public static final Block RED_WOOL_STAIRS = register("red_wool_stairs", new StairsBlock(Blocks.RED_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RED_WOOL)));
	public static final Block RED_WOOL_WALL = register("red_wool_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.RED_WOOL).solid()));
	public static final Block ORANGE_WOOL_SLAB = register("orange_wool_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL)));
	public static final Block ORANGE_WOOL_STAIRS = register("orange_wool_stairs", new StairsBlock(Blocks.ORANGE_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL)));
	public static final Block ORANGE_WOOL_WALL = register("orange_wool_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_WOOL).solid()));
	public static final Block YELLOW_WOOL_SLAB = register("yellow_wool_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL)));
	public static final Block YELLOW_WOOL_STAIRS = register("yellow_wool_stairs", new StairsBlock(Blocks.YELLOW_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL)));
	public static final Block YELLOW_WOOL_WALL = register("yellow_wool_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_WOOL).solid()));
	public static final Block LIME_WOOL_SLAB = register("lime_wool_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIME_WOOL)));
	public static final Block LIME_WOOL_STAIRS = register("lime_wool_stairs", new StairsBlock(Blocks.LIME_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIME_WOOL)));
	public static final Block LIME_WOOL_WALL = register("lime_wool_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.LIME_WOOL).solid()));
	public static final Block GREEN_WOOL_SLAB = register("green_wool_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.GREEN_WOOL)));
	public static final Block GREEN_WOOL_STAIRS = register("green_wool_stairs", new StairsBlock(Blocks.GREEN_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GREEN_WOOL)));
	public static final Block GREEN_WOOL_WALL = register("green_wool_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.GREEN_WOOL).solid()));
	public static final Block CYAN_WOOL_SLAB = register("cyan_wool_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CYAN_WOOL)));
	public static final Block CYAN_WOOL_STAIRS = register("cyan_wool_stairs", new StairsBlock(Blocks.CYAN_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CYAN_WOOL)));
	public static final Block CYAN_WOOL_WALL = register("cyan_wool_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CYAN_WOOL).solid()));
	public static final Block LIGHT_BLUE_WOOL_SLAB = register("light_blue_wool_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL)));
	public static final Block LIGHT_BLUE_WOOL_STAIRS = register("light_blue_wool_stairs", new StairsBlock(Blocks.LIGHT_BLUE_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL)));
	public static final Block LIGHT_BLUE_WOOL_WALL = register("light_blue_wool_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_WOOL).solid()));
	public static final Block BLUE_WOOL_SLAB = register("blue_wool_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_WOOL)));
	public static final Block BLUE_WOOL_STAIRS = register("blue_wool_stairs", new StairsBlock(Blocks.BLUE_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLUE_WOOL)));
	public static final Block BLUE_WOOL_WALL = register("blue_wool_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BLUE_WOOL).solid()));
	public static final Block PURPLE_WOOL_SLAB = register("purple_wool_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL)));
	public static final Block PURPLE_WOOL_STAIRS = register("purple_wool_stairs", new StairsBlock(Blocks.PURPLE_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL)));
	public static final Block PURPLE_WOOL_WALL = register("purple_wool_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_WOOL).solid()));
	public static final Block MAGENTA_WOOL_SLAB = register("magenta_wool_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL)));
	public static final Block MAGENTA_WOOL_STAIRS = register("magenta_wool_stairs", new StairsBlock(Blocks.MAGENTA_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL)));
	public static final Block MAGENTA_WOOL_WALL = register("magenta_wool_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_WOOL).solid()));
	public static final Block PINK_WOOL_SLAB = register("pink_wool_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.PINK_WOOL)));
	public static final Block PINK_WOOL_STAIRS = register("pink_wool_stairs", new StairsBlock(Blocks.PINK_WOOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PINK_WOOL)));
	public static final Block PINK_WOOL_WALL = register("pink_wool_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.PINK_WOOL).solid()));
	
	public static final Block TERRACOTTA_SLAB = register("terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.TERRACOTTA)));
	public static final Block TERRACOTTA_STAIRS = register("terracotta_stairs", new StairsBlock(Blocks.TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.TERRACOTTA)));
	public static final Block TERRACOTTA_WALL = register("terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.TERRACOTTA).solid()));
	public static final Block WHITE_TERRACOTTA_SLAB = register("white_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA)));
	public static final Block WHITE_TERRACOTTA_STAIRS = register("white_terracotta_stairs", new StairsBlock(Blocks.WHITE_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA)));
	public static final Block WHITE_TERRACOTTA_WALL = register("white_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.WHITE_TERRACOTTA).solid()));
	public static final Block LIGHT_GRAY_TERRACOTTA_SLAB = register("light_gray_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
	public static final Block LIGHT_GRAY_TERRACOTTA_STAIRS = register("light_gray_terracotta_stairs", new StairsBlock(Blocks.LIGHT_GRAY_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA)));
	public static final Block LIGHT_GRAY_TERRACOTTA_WALL = register("light_gray_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_TERRACOTTA).solid()));
	public static final Block GRAY_TERRACOTTA_SLAB = register("gray_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA)));
	public static final Block GRAY_TERRACOTTA_STAIRS = register("gray_terracotta_stairs", new StairsBlock(Blocks.GRAY_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA)));
	public static final Block GRAY_TERRACOTTA_WALL = register("gray_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.GRAY_TERRACOTTA).solid()));
	public static final Block BLACK_TERRACOTTA_SLAB = register("black_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA)));
	public static final Block BLACK_TERRACOTTA_STAIRS = register("black_terracotta_stairs", new StairsBlock(Blocks.BLACK_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA)));
	public static final Block BLACK_TERRACOTTA_WALL = register("black_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BLACK_TERRACOTTA).solid()));
	public static final Block BROWN_TERRACOTTA_SLAB = register("brown_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA)));
	public static final Block BROWN_TERRACOTTA_STAIRS = register("brown_terracotta_stairs", new StairsBlock(Blocks.BROWN_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA)));
	public static final Block BROWN_TERRACOTTA_WALL = register("brown_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BROWN_TERRACOTTA).solid()));
	public static final Block RED_TERRACOTTA_SLAB = register("red_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA)));
	public static final Block RED_TERRACOTTA_STAIRS = register("red_terracotta_stairs", new StairsBlock(Blocks.RED_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA)));
	public static final Block RED_TERRACOTTA_WALL = register("red_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.RED_TERRACOTTA).solid()));
	public static final Block ORANGE_TERRACOTTA_SLAB = register("orange_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA)));
	public static final Block ORANGE_TERRACOTTA_STAIRS = register("orange_terracotta_stairs", new StairsBlock(Blocks.ORANGE_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA)));
	public static final Block ORANGE_TERRACOTTA_WALL = register("orange_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_TERRACOTTA).solid()));
	public static final Block YELLOW_TERRACOTTA_SLAB = register("yellow_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA)));
	public static final Block YELLOW_TERRACOTTA_STAIRS = register("yellow_terracotta_stairs", new StairsBlock(Blocks.YELLOW_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA)));
	public static final Block YELLOW_TERRACOTTA_WALL = register("yellow_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_TERRACOTTA).solid()));
	public static final Block LIME_TERRACOTTA_SLAB = register("lime_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA)));
	public static final Block LIME_TERRACOTTA_STAIRS = register("lime_terracotta_stairs", new StairsBlock(Blocks.LIME_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA)));
	public static final Block LIME_TERRACOTTA_WALL = register("lime_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.LIME_TERRACOTTA).solid()));
	public static final Block GREEN_TERRACOTTA_SLAB = register("green_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA)));
	public static final Block GREEN_TERRACOTTA_STAIRS = register("green_terracotta_stairs", new StairsBlock(Blocks.GREEN_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA)));
	public static final Block GREEN_TERRACOTTA_WALL = register("green_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.GREEN_TERRACOTTA).solid()));
	public static final Block CYAN_TERRACOTTA_SLAB = register("cyan_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA)));
	public static final Block CYAN_TERRACOTTA_STAIRS = register("cyan_terracotta_stairs", new StairsBlock(Blocks.CYAN_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA)));
	public static final Block CYAN_TERRACOTTA_WALL = register("cyan_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CYAN_TERRACOTTA).solid()));
	public static final Block LIGHT_BLUE_TERRACOTTA_SLAB = register("light_blue_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
	public static final Block LIGHT_BLUE_TERRACOTTA_STAIRS = register("light_blue_terracotta_stairs", new StairsBlock(Blocks.LIGHT_BLUE_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA)));
	public static final Block LIGHT_BLUE_TERRACOTTA_WALL = register("light_blue_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_TERRACOTTA).solid()));
	public static final Block BLUE_TERRACOTTA_SLAB = register("blue_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA)));
	public static final Block BLUE_TERRACOTTA_STAIRS = register("blue_terracotta_stairs", new StairsBlock(Blocks.BLUE_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA)));
	public static final Block BLUE_TERRACOTTA_WALL = register("blue_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BLUE_TERRACOTTA).solid()));
	public static final Block PURPLE_TERRACOTTA_SLAB = register("purple_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA)));
	public static final Block PURPLE_TERRACOTTA_STAIRS = register("purple_terracotta_stairs", new StairsBlock(Blocks.PURPLE_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA)));
	public static final Block PURPLE_TERRACOTTA_WALL = register("purple_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_TERRACOTTA).solid()));
	public static final Block MAGENTA_TERRACOTTA_SLAB = register("magenta_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA)));
	public static final Block MAGENTA_TERRACOTTA_STAIRS = register("magenta_terracotta_stairs", new StairsBlock(Blocks.MAGENTA_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA)));
	public static final Block MAGENTA_TERRACOTTA_WALL = register("magenta_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_TERRACOTTA).solid()));
	public static final Block PINK_TERRACOTTA_SLAB = register("pink_terracotta_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA)));
	public static final Block PINK_TERRACOTTA_STAIRS = register("pink_terracotta_stairs", new StairsBlock(Blocks.PINK_TERRACOTTA.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA)));
	public static final Block PINK_TERRACOTTA_WALL = register("pink_terracotta_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.PINK_TERRACOTTA).solid()));
	
	public static final Block WHITE_CONCRETE_SLAB = register("white_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
	public static final Block WHITE_CONCRETE_STAIRS = register("white_concrete_stairs", new StairsBlock(Blocks.WHITE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)));
	public static final Block WHITE_CONCRETE_WALL = register("white_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE).solid()));
	public static final Block LIGHT_GRAY_CONCRETE_SLAB = register("light_gray_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));
	public static final Block LIGHT_GRAY_CONCRETE_STAIRS = register("light_gray_concrete_stairs", new StairsBlock(Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)));
	public static final Block LIGHT_GRAY_CONCRETE_WALL = register("light_gray_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE).solid()));
	public static final Block GRAY_CONCRETE_SLAB = register("gray_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));
	public static final Block GRAY_CONCRETE_STAIRS = register("gray_concrete_stairs", new StairsBlock(Blocks.GRAY_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)));
	public static final Block GRAY_CONCRETE_WALL = register("gray_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE).solid()));
	public static final Block BLACK_CONCRETE_SLAB = register("black_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));
	public static final Block BLACK_CONCRETE_STAIRS = register("black_concrete_stairs", new StairsBlock(Blocks.BLACK_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)));
	public static final Block BLACK_CONCRETE_WALL = register("black_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE).solid()));
	public static final Block BROWN_CONCRETE_SLAB = register("brown_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));
	public static final Block BROWN_CONCRETE_STAIRS = register("brown_concrete_stairs", new StairsBlock(Blocks.BROWN_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)));
	public static final Block BROWN_CONCRETE_WALL = register("brown_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE).solid()));
	public static final Block RED_CONCRETE_SLAB = register("red_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));
	public static final Block RED_CONCRETE_STAIRS = register("red_concrete_stairs", new StairsBlock(Blocks.RED_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)));
	public static final Block RED_CONCRETE_WALL = register("red_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.RED_CONCRETE).solid()));
	public static final Block ORANGE_CONCRETE_SLAB = register("orange_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));
	public static final Block ORANGE_CONCRETE_STAIRS = register("orange_concrete_stairs", new StairsBlock(Blocks.ORANGE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)));
	public static final Block ORANGE_CONCRETE_WALL = register("orange_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE).solid()));
	public static final Block YELLOW_CONCRETE_SLAB = register("yellow_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));
	public static final Block YELLOW_CONCRETE_STAIRS = register("yellow_concrete_stairs", new StairsBlock(Blocks.YELLOW_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)));
	public static final Block YELLOW_CONCRETE_WALL = register("yellow_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE).solid()));
	public static final Block LIME_CONCRETE_SLAB = register("lime_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));
	public static final Block LIME_CONCRETE_STAIRS = register("lime_concrete_stairs", new StairsBlock(Blocks.LIME_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)));
	public static final Block LIME_CONCRETE_WALL = register("lime_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE).solid()));
	public static final Block GREEN_CONCRETE_SLAB = register("green_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));
	public static final Block GREEN_CONCRETE_STAIRS = register("green_concrete_stairs", new StairsBlock(Blocks.GREEN_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)));
	public static final Block GREEN_CONCRETE_WALL = register("green_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE).solid()));
	public static final Block CYAN_CONCRETE_SLAB = register("cyan_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));
	public static final Block CYAN_CONCRETE_STAIRS = register("cyan_concrete_stairs", new StairsBlock(Blocks.CYAN_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)));
	public static final Block CYAN_CONCRETE_WALL = register("cyan_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE).solid()));
	public static final Block LIGHT_BLUE_CONCRETE_SLAB = register("light_blue_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));
	public static final Block LIGHT_BLUE_CONCRETE_STAIRS = register("light_blue_concrete_stairs", new StairsBlock(Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)));
	public static final Block LIGHT_BLUE_CONCRETE_WALL = register("light_blue_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE).solid()));
	public static final Block BLUE_CONCRETE_SLAB = register("blue_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));
	public static final Block BLUE_CONCRETE_STAIRS = register("blue_concrete_stairs", new StairsBlock(Blocks.BLUE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)));
	public static final Block BLUE_CONCRETE_WALL = register("blue_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE).solid()));
	public static final Block PURPLE_CONCRETE_SLAB = register("purple_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));
	public static final Block PURPLE_CONCRETE_STAIRS = register("purple_concrete_stairs", new StairsBlock(Blocks.PURPLE_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)));
	public static final Block PURPLE_CONCRETE_WALL = register("purple_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE).solid()));
	public static final Block MAGENTA_CONCRETE_SLAB = register("magenta_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));
	public static final Block MAGENTA_CONCRETE_STAIRS = register("magenta_concrete_stairs", new StairsBlock(Blocks.MAGENTA_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)));
	public static final Block MAGENTA_CONCRETE_WALL = register("magenta_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE).solid()));
	public static final Block PINK_CONCRETE_SLAB = register("pink_concrete_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));
	public static final Block PINK_CONCRETE_STAIRS = register("pink_concrete_stairs", new StairsBlock(Blocks.PINK_CONCRETE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)));
	public static final Block PINK_CONCRETE_WALL = register("pink_concrete_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE).solid()));
	
	public static final Block GLASS_SLAB = register("glass_slab", new TransparentSlabBlock(AbstractBlock.Settings.copy(Blocks.GLASS)));
	public static final Block GLASS_STAIRS = register("glass_stairs", new TransparentStairsBlock(Blocks.GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GLASS)));
	public static final Block GLASS_WALL = register("glass_wall", new TransparentWallBlock(AbstractBlock.Settings.copy(Blocks.GLASS)));
	public static final Block TINTED_GLASS_SLAB = register("tinted_glass_slab", new TintedGlassSlabBlock(AbstractBlock.Settings.copy(Blocks.TINTED_GLASS)));
	public static final Block TINTED_GLASS_STAIRS = register("tinted_glass_stairs", new TintedGlassStairsBlock(Blocks.TINTED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.TINTED_GLASS)));
	public static final Block TINTED_GLASS_WALL = register("tinted_glass_wall", new TintedGlassWallBlock(AbstractBlock.Settings.copy(Blocks.TINTED_GLASS).solid()));
	public static final Block TINTED_GLASS_PANE = register("tinted_glass_pane", new TintedGlassPaneBlock(AbstractBlock.Settings.copy(Blocks.TINTED_GLASS)));
	public static final Block WHITE_STAINED_GLASS_SLAB = register("white_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.WHITE, AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS)));
	public static final Block WHITE_STAINED_GLASS_STAIRS = register("white_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.WHITE, Blocks.WHITE_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS)));
	public static final Block WHITE_STAINED_GLASS_WALL = register("white_stained_glass_wall", new StainedGlassWallBlock(DyeColor.WHITE, AbstractBlock.Settings.copy(Blocks.WHITE_STAINED_GLASS).solid()));
	public static final Block LIGHT_GRAY_STAINED_GLASS_SLAB = register("light_gray_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.LIGHT_GRAY, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)));
	public static final Block LIGHT_GRAY_STAINED_GLASS_STAIRS = register("light_gray_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.LIGHT_GRAY, Blocks.LIGHT_GRAY_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS)));
	public static final Block LIGHT_GRAY_STAINED_GLASS_WALL = register("light_gray_stained_glass_wall", new StainedGlassWallBlock(DyeColor.LIGHT_GRAY, AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_STAINED_GLASS).solid()));
	public static final Block GRAY_STAINED_GLASS_SLAB = register("gray_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.GRAY, AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS)));
	public static final Block GRAY_STAINED_GLASS_STAIRS = register("gray_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.GRAY, Blocks.GRAY_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS)));
	public static final Block GRAY_STAINED_GLASS_WALL = register("gray_stained_glass_wall", new StainedGlassWallBlock(DyeColor.GRAY, AbstractBlock.Settings.copy(Blocks.GRAY_STAINED_GLASS).solid()));
	public static final Block BLACK_STAINED_GLASS_SLAB = register("black_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS)));
	public static final Block BLACK_STAINED_GLASS_STAIRS = register("black_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.BLACK, Blocks.BLACK_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS)));
	public static final Block BLACK_STAINED_GLASS_WALL = register("black_stained_glass_wall", new StainedGlassWallBlock(DyeColor.BLACK, AbstractBlock.Settings.copy(Blocks.BLACK_STAINED_GLASS).solid()));
	public static final Block BROWN_STAINED_GLASS_SLAB = register("brown_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.BROWN, AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS)));
	public static final Block BROWN_STAINED_GLASS_STAIRS = register("brown_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.BROWN, Blocks.BROWN_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS)));
	public static final Block BROWN_STAINED_GLASS_WALL = register("brown_stained_glass_wall", new StainedGlassWallBlock(DyeColor.BROWN, AbstractBlock.Settings.copy(Blocks.BROWN_STAINED_GLASS).solid()));
	public static final Block RED_STAINED_GLASS_SLAB = register("red_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.RED, AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS)));
	public static final Block RED_STAINED_GLASS_STAIRS = register("red_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.RED, Blocks.RED_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS)));
	public static final Block RED_STAINED_GLASS_WALL = register("red_stained_glass_wall", new StainedGlassWallBlock(DyeColor.RED, AbstractBlock.Settings.copy(Blocks.RED_STAINED_GLASS).solid()));
	public static final Block ORANGE_STAINED_GLASS_SLAB = register("orange_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.ORANGE, AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS)));
	public static final Block ORANGE_STAINED_GLASS_STAIRS = register("orange_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.ORANGE, Blocks.ORANGE_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS)));
	public static final Block ORANGE_STAINED_GLASS_WALL = register("orange_stained_glass_wall", new StainedGlassWallBlock(DyeColor.ORANGE, AbstractBlock.Settings.copy(Blocks.ORANGE_STAINED_GLASS).solid()));
	public static final Block YELLOW_STAINED_GLASS_SLAB = register("yellow_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.YELLOW, AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS)));
	public static final Block YELLOW_STAINED_GLASS_STAIRS = register("yellow_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.YELLOW, Blocks.YELLOW_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS)));
	public static final Block YELLOW_STAINED_GLASS_WALL = register("yellow_stained_glass_wall", new StainedGlassWallBlock(DyeColor.YELLOW, AbstractBlock.Settings.copy(Blocks.YELLOW_STAINED_GLASS).solid()));
	public static final Block LIME_STAINED_GLASS_SLAB = register("lime_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.LIME, AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS)));
	public static final Block LIME_STAINED_GLASS_STAIRS = register("lime_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.LIME, Blocks.LIME_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS)));
	public static final Block LIME_STAINED_GLASS_WALL = register("lime_stained_glass_wall", new StainedGlassWallBlock(DyeColor.LIME, AbstractBlock.Settings.copy(Blocks.LIME_STAINED_GLASS).solid()));
	public static final Block GREEN_STAINED_GLASS_SLAB = register("green_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.GREEN, AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS)));
	public static final Block GREEN_STAINED_GLASS_STAIRS = register("green_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.GREEN, Blocks.GREEN_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS)));
	public static final Block GREEN_STAINED_GLASS_WALL = register("green_stained_glass_wall", new StainedGlassWallBlock(DyeColor.GREEN, AbstractBlock.Settings.copy(Blocks.GREEN_STAINED_GLASS).solid()));
	public static final Block CYAN_STAINED_GLASS_SLAB = register("cyan_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.CYAN, AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS)));
	public static final Block CYAN_STAINED_GLASS_STAIRS = register("cyan_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.CYAN, Blocks.CYAN_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS)));
	public static final Block CYAN_STAINED_GLASS_WALL = register("cyan_stained_glass_wall", new StainedGlassWallBlock(DyeColor.CYAN, AbstractBlock.Settings.copy(Blocks.CYAN_STAINED_GLASS).solid()));
	public static final Block LIGHT_BLUE_STAINED_GLASS_SLAB = register("light_blue_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.LIGHT_BLUE, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)));
	public static final Block LIGHT_BLUE_STAINED_GLASS_STAIRS = register("light_blue_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.LIGHT_BLUE, Blocks.LIGHT_BLUE_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS)));
	public static final Block LIGHT_BLUE_STAINED_GLASS_WALL = register("light_blue_stained_glass_wall", new StainedGlassWallBlock(DyeColor.LIGHT_BLUE, AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_STAINED_GLASS).solid()));
	public static final Block BLUE_STAINED_GLASS_SLAB = register("blue_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.BLUE, AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS)));
	public static final Block BLUE_STAINED_GLASS_STAIRS = register("blue_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.BLUE, Blocks.BLUE_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS)));
	public static final Block BLUE_STAINED_GLASS_WALL = register("blue_stained_glass_wall", new StainedGlassWallBlock(DyeColor.BLUE, AbstractBlock.Settings.copy(Blocks.BLUE_STAINED_GLASS).solid()));
	public static final Block PURPLE_STAINED_GLASS_SLAB = register("purple_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.PURPLE, AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS)));
	public static final Block PURPLE_STAINED_GLASS_STAIRS = register("purple_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.PURPLE, Blocks.PURPLE_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS)));
	public static final Block PURPLE_STAINED_GLASS_WALL = register("purple_stained_glass_wall", new StainedGlassWallBlock(DyeColor.PURPLE, AbstractBlock.Settings.copy(Blocks.PURPLE_STAINED_GLASS).solid()));
	public static final Block MAGENTA_STAINED_GLASS_SLAB = register("magenta_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.MAGENTA, AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS)));
	public static final Block MAGENTA_STAINED_GLASS_STAIRS = register("magenta_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.MAGENTA, Blocks.MAGENTA_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS)));
	public static final Block MAGENTA_STAINED_GLASS_WALL = register("magenta_stained_glass_wall", new StainedGlassWallBlock(DyeColor.MAGENTA, AbstractBlock.Settings.copy(Blocks.MAGENTA_STAINED_GLASS).solid()));
	public static final Block PINK_STAINED_GLASS_SLAB = register("pink_stained_glass_slab", new StainedGlassSlabBlock(DyeColor.PINK, AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS)));
	public static final Block PINK_STAINED_GLASS_STAIRS = register("pink_stained_glass_stairs", new StainedGlassStairsBlock(DyeColor.PINK, Blocks.PINK_STAINED_GLASS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS)));
	public static final Block PINK_STAINED_GLASS_WALL = register("pink_stained_glass_wall", new StainedGlassWallBlock(DyeColor.PINK, AbstractBlock.Settings.copy(Blocks.PINK_STAINED_GLASS).solid()));
	
	public static final Block GRASS_SLAB = register("grass_slab", new GrassSlabBlock(AbstractBlock.Settings.copy(Blocks.GRASS_BLOCK).mapColor(boolPropertyMapColor(Properties.SNOWY, MapColor.WHITE, MapColor.PALE_GREEN))));
	public static final Block GRASS_STAIRS = register("grass_stairs", new GrassStairsBlock(Blocks.GRASS_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GRASS_BLOCK).mapColor(boolPropertyMapColor(Properties.SNOWY, MapColor.WHITE, MapColor.PALE_GREEN))));
	public static final Block GRASS_WALL = register("grass_wall", new GrassWallBlock(AbstractBlock.Settings.copy(Blocks.GRASS_BLOCK).mapColor(boolPropertyMapColor(Properties.SNOWY, MapColor.WHITE, MapColor.PALE_GREEN)).solid()));
	public static final Block PODZOL_SLAB = register("podzol_slab", new SnowySlabBlock(AbstractBlock.Settings.copy(Blocks.PODZOL).mapColor(boolPropertyMapColor(Properties.SNOWY, MapColor.WHITE, MapColor.SPRUCE_BROWN))));
	public static final Block PODZOL_STAIRS = register("podzol_stairs", new SnowyStairsBlock(Blocks.PODZOL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PODZOL).mapColor(boolPropertyMapColor(Properties.SNOWY, MapColor.WHITE, MapColor.SPRUCE_BROWN))));
	public static final Block PODZOL_WALL = register("podzol_wall", new SnowyWallBlock(AbstractBlock.Settings.copy(Blocks.PODZOL).mapColor(boolPropertyMapColor(Properties.SNOWY, MapColor.WHITE, MapColor.SPRUCE_BROWN)).solid()));
	public static final Block MYCELIUM_SLAB = register("mycelium_slab", new MyceliumSlabBlock(AbstractBlock.Settings.copy(Blocks.MYCELIUM).mapColor(boolPropertyMapColor(Properties.SNOWY, MapColor.WHITE, MapColor.PURPLE))));
	public static final Block MYCELIUM_STAIRS = register("mycelium_stairs", new MyceliumStairsBlock(Blocks.MYCELIUM.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MYCELIUM).mapColor(boolPropertyMapColor(Properties.SNOWY, MapColor.WHITE, MapColor.PURPLE))));
	public static final Block MYCELIUM_WALL = register("mycelium_wall", new MyceliumWallBlock(AbstractBlock.Settings.copy(Blocks.MYCELIUM).mapColor(boolPropertyMapColor(Properties.SNOWY, MapColor.WHITE, MapColor.PURPLE)).solid()));
	@SuppressWarnings("deprecation")
	public static final Block DIRT_PATH_SLAB = register("dirt_path_slab", new DirtPathSlabBlock(AbstractBlock.Settings.copyShallow(Blocks.DIRT_PATH).blockVision(SSWPBlocks::isDoubleSlab).suffocates(SSWPBlocks::isDoubleSlab)));
	@SuppressWarnings("deprecation")
	public static final Block DIRT_PATH_STAIRS = register("dirt_path_stairs", new DirtPathStairsBlock(Blocks.DIRT_PATH.getDefaultState(), AbstractBlock.Settings.copyShallow(Blocks.DIRT_PATH)));
	@SuppressWarnings("deprecation")
	public static final Block DIRT_PATH_WALL = register("dirt_path_wall", new DirtPathWallBlock(AbstractBlock.Settings.copyShallow(Blocks.DIRT_PATH).solid()));
	public static final Block DIRT_SLAB = register("dirt_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.DIRT)));
	public static final Block DIRT_STAIRS = register("dirt_stairs", new StairsBlock(Blocks.DIRT.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DIRT)));
	public static final Block DIRT_WALL = register("dirt_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.DIRT).solid()));
	public static final Block COARSE_DIRT_SLAB = register("coarse_dirt_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.COARSE_DIRT)));
	public static final Block COARSE_DIRT_STAIRS = register("coarse_dirt_stairs", new StairsBlock(Blocks.COARSE_DIRT.getDefaultState(), AbstractBlock.Settings.copy(Blocks.COARSE_DIRT)));
	public static final Block COARSE_DIRT_WALL = register("coarse_dirt_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.COARSE_DIRT).solid()));
	public static final Block ROOTED_DIRT_SLAB = register("rooted_dirt_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.ROOTED_DIRT)));
	public static final Block ROOTED_DIRT_STAIRS = register("rooted_dirt_stairs", new StairsBlock(Blocks.ROOTED_DIRT.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ROOTED_DIRT)));
	public static final Block ROOTED_DIRT_WALL = register("rooted_dirt_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.ROOTED_DIRT).solid()));
	
	@SuppressWarnings("deprecation")
	public static final Block MUD_SLAB = register("mud_slab", new MudSlabBlock(AbstractBlock.Settings.copyShallow(Blocks.MUD).blockVision(SSWPBlocks::isDoubleSlab).suffocates(SSWPBlocks::isDoubleSlab).solidBlock(SSWPBlocks::isDoubleSlab).allowsSpawning(SSWPBlocks::isNotBottomSlab)));
	@SuppressWarnings("deprecation")
	public static final Block MUD_STAIRS = register("mud_stairs", new MudStairsBlock(Blocks.MUD.getDefaultState(), AbstractBlock.Settings.copyShallow(Blocks.MUD)));
	@SuppressWarnings("deprecation")
	public static final Block MUD_WALL = register("mud_wall", new MudWallBlock(AbstractBlock.Settings.copyShallow(Blocks.MUD).solid()));
	
	public static final Block CLAY_SLAB = register("clay_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CLAY)));
	public static final Block CLAY_STAIRS = register("clay_stairs", new StairsBlock(Blocks.CLAY.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CLAY)));
	public static final Block CLAY_WALL = register("clay_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CLAY).solid()));
	
	public static final Block ICE_SLAB = register("ice_slab", new IceSlabBlock(AbstractBlock.Settings.copy(Blocks.ICE)));
	public static final Block ICE_STAIRS = register("ice_stairs", new IceStairsBlock(Blocks.ICE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ICE)));
	public static final Block ICE_WALL = register("ice_wall", new IceWallBlock(AbstractBlock.Settings.copy(Blocks.ICE)));
	public static final Block PACKED_ICE_SLAB = register("packed_ice_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.PACKED_ICE)));
	public static final Block PACKED_ICE_STAIRS = register("packed_ice_stairs", new StairsBlock(Blocks.PACKED_ICE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PACKED_ICE)));
	public static final Block PACKED_ICE_WALL = register("packed_ice_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.PACKED_ICE).solid()));
	public static final Block BLUE_ICE_SLAB = register("blue_ice_slab", new TranslucentSlabBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ICE)));
	public static final Block BLUE_ICE_STAIRS = register("blue_ice_stairs", new TranslucentStairsBlock(Blocks.BLUE_ICE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BLUE_ICE)));
	public static final Block BLUE_ICE_WALL = register("blue_ice_wall", new TranslucentWallBlock(AbstractBlock.Settings.copy(Blocks.BLUE_ICE).solid()));
	public static final Block SNOW_SLAB = register("snow_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.SNOW_BLOCK)));
	public static final Block SNOW_STAIRS = register("snow_stairs", new StairsBlock(Blocks.SNOW_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SNOW_BLOCK)));
	public static final Block SNOW_WALL = register("snow_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.SNOW_BLOCK).solid()));
	
	public static final Block MOSS_SLAB = register("moss_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.MOSS_BLOCK)));
	public static final Block MOSS_STAIRS = register("moss_stairs", new StairsBlock(Blocks.MOSS_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MOSS_BLOCK)));
	public static final Block MOSS_WALL = register("moss_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.MOSS_BLOCK).solid()));
	
	public static final Block CALCITE_SLAB = register("calcite_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.CALCITE)));
	public static final Block CALCITE_STAIRS = register("calcite_stairs", new StairsBlock(Blocks.CALCITE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CALCITE)));
	public static final Block CALCITE_WALL = register("calcite_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.CALCITE)));
	public static final Block DRIPSTONE_SLAB = register("dripstone_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
	public static final Block DRIPSTONE_STAIRS = register("dripstone_stairs", new StairsBlock(Blocks.DRIPSTONE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
	public static final Block DRIPSTONE_WALL = register("dripstone_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.DRIPSTONE_BLOCK)));
	
	public static final Block MAGMA_SLAB = register("magma_slab", new MagmaSlabBlock(AbstractBlock.Settings.copy(Blocks.MAGMA_BLOCK)));
	public static final Block MAGMA_STAIRS = register("magma_stairs", new MagmaStairsBlock(Blocks.MAGMA_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MAGMA_BLOCK)));
	public static final Block MAGMA_WALL = register("magma_wall", new MagmaWallBlock(AbstractBlock.Settings.copy(Blocks.MAGMA_BLOCK).solid()));
	
	public static final Block OBSIDIAN_SLAB = register("obsidian_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.OBSIDIAN)));
	public static final Block OBSIDIAN_STAIRS = register("obsidian_stairs", new StairsBlock(Blocks.OBSIDIAN.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OBSIDIAN)));
	public static final Block OBSIDIAN_WALL = register("obsidian_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.OBSIDIAN)));
	public static final Block CRYING_OBSIDIAN_SLAB = register("crying_obsidian_slab", new CryingObsidianSlabBlock(AbstractBlock.Settings.copy(Blocks.CRYING_OBSIDIAN)));
	public static final Block CRYING_OBSIDIAN_STAIRS = register("crying_obsidian_stairs", new CryingObsidianStairsBlock(Blocks.CRYING_OBSIDIAN.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CRYING_OBSIDIAN)));
	public static final Block CRYING_OBSIDIAN_WALL = register("crying_obsidian_wall", new CryingObsidianWallBlock(AbstractBlock.Settings.copy(Blocks.CRYING_OBSIDIAN).solid()));
	
	public static final Block CRIMSON_NYLIUM_SLAB = register("crimson_nylium_slab", new NyliumSlabBlock(Blocks.CRIMSON_NYLIUM.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CRIMSON_NYLIUM)));
	public static final Block CRIMSON_NYLIUM_STAIRS = register("crimson_nylium_stairs", new NyliumStairsBlock(Blocks.CRIMSON_NYLIUM.getDefaultState(), AbstractBlock.Settings.copy(Blocks.CRIMSON_NYLIUM)));
	public static final Block CRIMSON_NYLIUM_WALL = register("crimson_nylium_wall", new NyliumWallBlock(AbstractBlock.Settings.copy(Blocks.CRIMSON_NYLIUM)));
	public static final Block WARPED_NYLIUM_SLAB = register("warped_nylium_slab", new NyliumSlabBlock(Blocks.WARPED_NYLIUM.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WARPED_NYLIUM)));
	public static final Block WARPED_NYLIUM_STAIRS = register("warped_nylium_stairs", new NyliumStairsBlock(Blocks.WARPED_NYLIUM.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WARPED_NYLIUM)));
	public static final Block WARPED_NYLIUM_WALL = register("warped_nylium_wall", new NyliumWallBlock(AbstractBlock.Settings.copy(Blocks.WARPED_NYLIUM)));
	
	@SuppressWarnings("deprecation")
	public static final Block SOUL_SAND_SLAB = register("soul_sand_slab", new SoulSandSlabBlock(AbstractBlock.Settings.copyShallow(Blocks.SOUL_SAND).blockVision(SSWPBlocks::isDoubleSlab).suffocates(SSWPBlocks::isDoubleSlab).solidBlock(SSWPBlocks::isDoubleSlab).allowsSpawning(SSWPBlocks::isNotBottomSlab)));
	@SuppressWarnings("deprecation")
	public static final Block SOUL_SAND_STAIRS = register("soul_sand_stairs", new SoulSandStairsBlock(Blocks.SOUL_SAND.getDefaultState(), AbstractBlock.Settings.copyShallow(Blocks.SOUL_SAND)));
	@SuppressWarnings("deprecation")
	public static final Block SOUL_SAND_WALL = register("soul_sand_wall", new SoulSandWallBlock(AbstractBlock.Settings.copyShallow(Blocks.SOUL_SAND).solid()));
	public static final Block SOUL_SOIL_SLAB = register("soul_soil_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.SOUL_SOIL)));
	public static final Block SOUL_SOIL_STAIRS = register("soul_soil_stairs", new StairsBlock(Blocks.SOUL_SOIL.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SOUL_SOIL)));
	public static final Block SOUL_SOIL_WALL = register("soul_soil_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.SOUL_SOIL).solid()));
	
	public static final Block BONE_SLAB = register("bone_slab", new OrientableSlabBlock(AbstractBlock.Settings.copy(Blocks.BONE_BLOCK)));
	public static final Block BONE_STAIRS = register("bone_stairs", new OrientableStairsBlock(Blocks.BONE_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BONE_BLOCK)));
	public static final Block BONE_WALL = register("bone_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BONE_BLOCK).solid()));
	
	public static final Block COAL_ORE_SLAB = register("coal_ore_slab", new ExperienceDroppingSlabBlock(UniformIntProvider.create(0, 2), UniformIntProvider.create(0, 1), AbstractBlock.Settings.copy(Blocks.COAL_ORE)));
	public static final Block COAL_ORE_STAIRS = register("coal_ore_stairs", new ExperienceDroppingStairsBlock(UniformIntProvider.create(0, 2), Blocks.COAL_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.COAL_ORE)));
	public static final Block COAL_ORE_WALL = register("coal_ore_wall", new ExperienceDroppingWallBlock(UniformIntProvider.create(0, 2), AbstractBlock.Settings.copy(Blocks.COAL_ORE).solid()));
	public static final Block DEEPSLATE_COAL_ORE_SLAB = register("deepslate_coal_ore_slab", new ExperienceDroppingSlabBlock(UniformIntProvider.create(0, 2), UniformIntProvider.create(0, 1), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COAL_ORE)));
	public static final Block DEEPSLATE_COAL_ORE_STAIRS = register("deepslate_coal_ore_stairs", new ExperienceDroppingStairsBlock(UniformIntProvider.create(0, 2), Blocks.DEEPSLATE_COAL_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COAL_ORE)));
	public static final Block DEEPSLATE_COAL_ORE_WALL = register("deepslate_coal_ore_wall", new ExperienceDroppingWallBlock(UniformIntProvider.create(0, 2), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COAL_ORE).solid()));
	
	public static final Block IRON_ORE_SLAB = register("iron_ore_slab", new ExperienceDroppingSlabBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
	public static final Block IRON_ORE_STAIRS = register("iron_ore_stairs", new ExperienceDroppingStairsBlock(Blocks.IRON_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.IRON_ORE)));
	public static final Block IRON_ORE_WALL = register("iron_ore_wall", new ExperienceDroppingWallBlock(AbstractBlock.Settings.copy(Blocks.IRON_ORE).solid()));
	public static final Block DEEPSLATE_IRON_ORE_SLAB = register("deepslate_iron_ore_slab", new ExperienceDroppingSlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_IRON_ORE)));
	public static final Block DEEPSLATE_IRON_ORE_STAIRS = register("deepslate_iron_ore_stairs", new ExperienceDroppingStairsBlock(Blocks.DEEPSLATE_IRON_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_IRON_ORE)));
	public static final Block DEEPSLATE_IRON_ORE_WALL = register("deepslate_iron_ore_wall", new ExperienceDroppingWallBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_IRON_ORE).solid()));
	
	public static final Block COPPER_ORE_SLAB = register("copper_ore_slab", new ExperienceDroppingSlabBlock(AbstractBlock.Settings.copy(Blocks.COPPER_ORE)));
	public static final Block COPPER_ORE_STAIRS = register("copper_ore_stairs", new ExperienceDroppingStairsBlock(Blocks.COPPER_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.COPPER_ORE)));
	public static final Block COPPER_ORE_WALL = register("copper_ore_wall", new ExperienceDroppingWallBlock(AbstractBlock.Settings.copy(Blocks.COPPER_ORE).solid()));
	public static final Block DEEPSLATE_COPPER_ORE_SLAB = register("deepslate_copper_ore_slab", new ExperienceDroppingSlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COPPER_ORE)));
	public static final Block DEEPSLATE_COPPER_ORE_STAIRS = register("deepslate_copper_ore_stairs", new ExperienceDroppingStairsBlock(Blocks.DEEPSLATE_COPPER_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COPPER_ORE)));
	public static final Block DEEPSLATE_COPPER_ORE_WALL = register("deepslate_copper_ore_wall", new ExperienceDroppingWallBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_COPPER_ORE).solid()));
	
	public static final Block GOLD_ORE_SLAB = register("gold_ore_slab", new ExperienceDroppingSlabBlock(AbstractBlock.Settings.copy(Blocks.GOLD_ORE)));
	public static final Block GOLD_ORE_STAIRS = register("gold_ore_stairs", new ExperienceDroppingStairsBlock(Blocks.GOLD_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GOLD_ORE)));
	public static final Block GOLD_ORE_WALL = register("gold_ore_wall", new ExperienceDroppingWallBlock(AbstractBlock.Settings.copy(Blocks.GOLD_ORE).solid()));
	public static final Block DEEPSLATE_GOLD_ORE_SLAB = register("deepslate_gold_ore_slab", new ExperienceDroppingSlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE)));
	public static final Block DEEPSLATE_GOLD_ORE_STAIRS = register("deepslate_gold_ore_stairs", new ExperienceDroppingStairsBlock(Blocks.DEEPSLATE_GOLD_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE)));
	public static final Block DEEPSLATE_GOLD_ORE_WALL = register("deepslate_gold_ore_wall", new ExperienceDroppingWallBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE).solid()));
	
	public static final Block REDSTONE_ORE_SLAB = register("redstone_ore_slab", new RedstoneOreSlabBlock(AbstractBlock.Settings.copy(Blocks.REDSTONE_ORE)));
	public static final Block REDSTONE_ORE_STAIRS = register("redstone_ore_stairs", new RedstoneOreStairsBlock(Blocks.REDSTONE_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.REDSTONE_ORE)));
	public static final Block REDSTONE_ORE_WALL = register("redstone_ore_wall", new RedstoneOreWallBlock(AbstractBlock.Settings.copy(Blocks.REDSTONE_ORE).solid()));
	public static final Block DEEPSLATE_REDSTONE_ORE_SLAB = register("deepslate_redstone_ore_slab", new RedstoneOreSlabBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_REDSTONE_ORE)));
	public static final Block DEEPSLATE_REDSTONE_ORE_STAIRS = register("deepslate_redstone_ore_stairs", new RedstoneOreStairsBlock(Blocks.DEEPSLATE_REDSTONE_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_REDSTONE_ORE)));
	public static final Block DEEPSLATE_REDSTONE_ORE_WALL = register("deepslate_redstone_ore_wall", new RedstoneOreWallBlock(AbstractBlock.Settings.copy(Blocks.DEEPSLATE_REDSTONE_ORE).solid()));
	
	public static final Block EMERALD_ORE_SLAB = register("emerald_ore_slab", new ExperienceDroppingSlabBlock(UniformIntProvider.create(3, 7), UniformIntProvider.create(2, 3), AbstractBlock.Settings.copy(Blocks.EMERALD_ORE)));
	public static final Block EMERALD_ORE_STAIRS = register("emerald_ore_stairs", new ExperienceDroppingStairsBlock(UniformIntProvider.create(3, 7), Blocks.EMERALD_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.EMERALD_ORE)));
	public static final Block EMERALD_ORE_WALL = register("emerald_ore_wall", new ExperienceDroppingWallBlock(UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(Blocks.EMERALD_ORE).solid()));
	public static final Block DEEPSLATE_EMERALD_ORE_SLAB = register("deepslate_emerald_ore_slab", new ExperienceDroppingSlabBlock(UniformIntProvider.create(3, 7), UniformIntProvider.create(2, 3), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_EMERALD_ORE)));
	public static final Block DEEPSLATE_EMERALD_ORE_STAIRS = register("deepslate_emerald_ore_stairs", new ExperienceDroppingStairsBlock(UniformIntProvider.create(3, 7), Blocks.DEEPSLATE_EMERALD_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_EMERALD_ORE)));
	public static final Block DEEPSLATE_EMERALD_ORE_WALL = register("deepslate_emerald_ore_wall", new ExperienceDroppingWallBlock(UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_EMERALD_ORE).solid()));
	
	public static final Block LAPIS_ORE_SLAB = register("lapis_ore_slab", new ExperienceDroppingSlabBlock(UniformIntProvider.create(2, 5), UniformIntProvider.create(1, 2), AbstractBlock.Settings.copy(Blocks.LAPIS_ORE)));
	public static final Block LAPIS_ORE_STAIRS = register("lapis_ore_stairs", new ExperienceDroppingStairsBlock(UniformIntProvider.create(2, 5), Blocks.LAPIS_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.LAPIS_ORE)));
	public static final Block LAPIS_ORE_WALL = register("lapis_ore_wall", new ExperienceDroppingWallBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.copy(Blocks.LAPIS_ORE).solid()));
	public static final Block DEEPSLATE_LAPIS_ORE_SLAB = register("deepslate_lapis_ore_slab", new ExperienceDroppingSlabBlock(UniformIntProvider.create(2, 5), UniformIntProvider.create(1, 2), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_LAPIS_ORE)));
	public static final Block DEEPSLATE_LAPIS_ORE_STAIRS = register("deepslate_lapis_ore_stairs", new ExperienceDroppingStairsBlock(UniformIntProvider.create(2, 5), Blocks.DEEPSLATE_LAPIS_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_LAPIS_ORE)));
	public static final Block DEEPSLATE_LAPIS_ORE_WALL = register("deepslate_lapis_ore_wall", new ExperienceDroppingWallBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_LAPIS_ORE).solid()));
	
	public static final Block DIAMOND_ORE_SLAB = register("diamond_ore_slab", new ExperienceDroppingSlabBlock(UniformIntProvider.create(3, 7), UniformIntProvider.create(2, 3), AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)));
	public static final Block DIAMOND_ORE_STAIRS = register("diamond_ore_stairs", new ExperienceDroppingStairsBlock(UniformIntProvider.create(3, 7), Blocks.DIAMOND_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE)));
	public static final Block DIAMOND_ORE_WALL = register("diamond_ore_wall", new ExperienceDroppingWallBlock(UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(Blocks.DIAMOND_ORE).solid()));
	public static final Block DEEPSLATE_DIAMOND_ORE_SLAB = register("deepslate_diamond_ore_slab", new ExperienceDroppingSlabBlock(UniformIntProvider.create(3, 7), UniformIntProvider.create(2, 3), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE)));
	public static final Block DEEPSLATE_DIAMOND_ORE_STAIRS = register("deepslate_diamond_ore_stairs", new ExperienceDroppingStairsBlock(UniformIntProvider.create(3, 7), Blocks.DEEPSLATE_DIAMOND_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE)));
	public static final Block DEEPSLATE_DIAMOND_ORE_WALL = register("deepslate_diamond_ore_wall", new ExperienceDroppingWallBlock(UniformIntProvider.create(3, 7), AbstractBlock.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE).solid()));
	
	public static final Block NETHER_QUARTZ_ORE_SLAB = register("nether_quartz_ore_slab", new ExperienceDroppingSlabBlock(UniformIntProvider.create(2, 5), UniformIntProvider.create(1, 2), AbstractBlock.Settings.copy(Blocks.NETHER_QUARTZ_ORE)));
	public static final Block NETHER_QUARTZ_ORE_STAIRS = register("nether_quartz_ore_stairs", new ExperienceDroppingStairsBlock(UniformIntProvider.create(2, 5), Blocks.NETHER_QUARTZ_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.NETHER_QUARTZ_ORE)));
	public static final Block NETHER_QUARTZ_ORE_WALL = register("nether_quartz_ore_wall", new ExperienceDroppingWallBlock(UniformIntProvider.create(2, 5), AbstractBlock.Settings.copy(Blocks.NETHER_QUARTZ_ORE).solid()));
	
	public static final Block NETHER_GOLD_ORE_SLAB = register("nether_gold_ore_slab", new ExperienceDroppingSlabBlock(UniformIntProvider.create(0, 1), ClampedIntProvider.create(UniformIntProvider.create(-2, 1), 0, 1), AbstractBlock.Settings.copy(Blocks.NETHER_GOLD_ORE)));
	public static final Block NETHER_GOLD_ORE_STAIRS = register("nether_gold_ore_stairs", new ExperienceDroppingStairsBlock(UniformIntProvider.create(0, 1), Blocks.NETHER_GOLD_ORE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.NETHER_GOLD_ORE)));
	public static final Block NETHER_GOLD_ORE_WALL = register("nether_gold_ore_wall", new ExperienceDroppingWallBlock(UniformIntProvider.create(0, 1), AbstractBlock.Settings.copy(Blocks.NETHER_GOLD_ORE).solid()));
	
	public static final Block ANCIENT_DEBRIS_SLAB = register("ancient_debris_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.ANCIENT_DEBRIS)));
	public static final Block ANCIENT_DEBRIS_STAIRS = register("ancient_debris_stairs", new StairsBlock(Blocks.ANCIENT_DEBRIS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.ANCIENT_DEBRIS)));
	public static final Block ANCIENT_DEBRIS_WALL = register("ancient_debris_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.ANCIENT_DEBRIS).solid()));
	
	public static final Block RAW_IRON_SLAB = register("raw_iron_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK)));
	public static final Block RAW_IRON_STAIRS = register("raw_iron_stairs", new StairsBlock(Blocks.RAW_IRON_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK)));
	public static final Block RAW_IRON_WALL = register("raw_iron_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.RAW_IRON_BLOCK).solid()));
	
	public static final Block RAW_COPPER_SLAB = register("raw_copper_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.RAW_COPPER_BLOCK)));
	public static final Block RAW_COPPER_STAIRS = register("raw_copper_stairs", new StairsBlock(Blocks.RAW_COPPER_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RAW_COPPER_BLOCK)));
	public static final Block RAW_COPPER_WALL = register("raw_copper_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.RAW_COPPER_BLOCK).solid()));
	
	public static final Block RAW_GOLD_SLAB = register("raw_gold_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.RAW_GOLD_BLOCK)));
	public static final Block RAW_GOLD_STAIRS = register("raw_gold_stairs", new StairsBlock(Blocks.RAW_GOLD_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RAW_GOLD_BLOCK)));
	public static final Block RAW_GOLD_WALL = register("raw_gold_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.RAW_GOLD_BLOCK).solid()));
	
	public static final Block GLOWSTONE_SLAB = register("glowstone_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.GLOWSTONE)));
	public static final Block GLOWSTONE_STAIRS = register("glowstone_stairs", new StairsBlock(Blocks.GLOWSTONE.getDefaultState(), AbstractBlock.Settings.copy(Blocks.GLOWSTONE)));
	public static final Block GLOWSTONE_WALL = register("glowstone_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.GLOWSTONE).solid()));
	
	@SuppressWarnings("deprecation")
	public static final Block MANGROVE_ROOT_SLAB = register("mangrove_root_slab", new MangroveRootsSlabBlock(AbstractBlock.Settings.copyShallow(Blocks.MANGROVE_ROOTS).suffocates(Blocks::never).blockVision(Blocks::never)));
	@SuppressWarnings("deprecation")
	public static final Block MANGROVE_ROOT_STAIRS = register("mangrove_root_stairs", new MangroveRootsStairsBlock(Blocks.MANGROVE_ROOTS.getDefaultState(), AbstractBlock.Settings.copyShallow(Blocks.MANGROVE_ROOTS)));
	@SuppressWarnings("deprecation")
	public static final Block MANGROVE_ROOT_WALL = register("mangrove_root_wall", new MangroveRootsWallBlock(AbstractBlock.Settings.copyShallow(Blocks.MANGROVE_ROOTS).solid()));
	@SuppressWarnings("deprecation")
	public static final Block MANGROVE_ROOT_CARPET = register("mangrove_root_carpet", new CarpetBlock(AbstractBlock.Settings.copyShallow(Blocks.MANGROVE_ROOTS)));
	public static final Block MUDDY_MANGROVE_ROOT_SLAB = register("muddy_mangrove_root_slab", new OrientableSlabBlock(AbstractBlock.Settings.copy(Blocks.MUDDY_MANGROVE_ROOTS)));
	public static final Block MUDDY_MANGROVE_ROOT_STAIRS = register("muddy_mangrove_root_stairs", new OrientableStairsBlock(Blocks.MUDDY_MANGROVE_ROOTS.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MUDDY_MANGROVE_ROOTS)));
	public static final Block MUDDY_MANGROVE_ROOT_WALL = register("muddy_mangrove_root_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.MUDDY_MANGROVE_ROOTS).solid()));
	
	public static final Block MUSHROOM_STEM_SLAB = register("mushroom_stem_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.MUSHROOM_STEM)));
	public static final Block MUSHROOM_STEM_STAIRS = register("mushroom_stem_stairs", new StairsBlock(Blocks.MUSHROOM_STEM.getDefaultState(), AbstractBlock.Settings.copy(Blocks.MUSHROOM_STEM)));
	public static final Block MUSHROOM_STEM_WALL = register("mushroom_stem_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.MUSHROOM_STEM).solid()));
	
	public static final Block OAK_LEAF_SLAB = register("oak_leaf_slab", createLeavesSlabBlock(Blocks.OAK_LEAVES));
	public static final Block OAK_LEAF_STAIRS = register("oak_leaf_stairs", createLeavesStairsBlock(Blocks.OAK_LEAVES));
	public static final Block OAK_LEAF_WALL = register("oak_leaf_wall", createLeavesWallBlock(Blocks.OAK_LEAVES));
	@SuppressWarnings("deprecation")
	public static final Block OAK_LEAF_CARPET = register("oak_leaf_carpet", new LeafCarpetBlock(AbstractBlock.Settings.copyShallow(Blocks.OAK_LEAVES)));
	public static final Block SPRUCE_LEAF_SLAB = register("spruce_leaf_slab", createLeavesSlabBlock(Blocks.SPRUCE_LEAVES));
	public static final Block SPRUCE_LEAF_STAIRS = register("spruce_leaf_stairs", createLeavesStairsBlock(Blocks.SPRUCE_LEAVES));
	public static final Block SPRUCE_LEAF_WALL = register("spruce_leaf_wall", createLeavesWallBlock(Blocks.SPRUCE_LEAVES));
	@SuppressWarnings("deprecation")
	public static final Block SPRUCE_LEAF_CARPET = register("spruce_leaf_carpet", new LeafCarpetBlock(AbstractBlock.Settings.copyShallow(Blocks.SPRUCE_LEAVES)));
	public static final Block BIRCH_LEAF_SLAB = register("birch_leaf_slab", createLeavesSlabBlock(Blocks.BIRCH_LEAVES));
	public static final Block BIRCH_LEAF_STAIRS = register("birch_leaf_stairs", createLeavesStairsBlock(Blocks.BIRCH_LEAVES));
	public static final Block BIRCH_LEAF_WALL = register("birch_leaf_wall", createLeavesWallBlock(Blocks.BIRCH_LEAVES));
	@SuppressWarnings("deprecation")
	public static final Block BIRCH_LEAF_CARPET = register("birch_leaf_carpet", new LeafCarpetBlock(AbstractBlock.Settings.copyShallow(Blocks.BIRCH_LEAVES)));
	public static final Block JUNGLE_LEAF_SLAB = register("jungle_leaf_slab", createLeavesSlabBlock(Blocks.JUNGLE_LEAVES));
	public static final Block JUNGLE_LEAF_STAIRS = register("jungle_leaf_stairs", createLeavesStairsBlock(Blocks.JUNGLE_LEAVES));
	public static final Block JUNGLE_LEAF_WALL = register("jungle_leaf_wall", createLeavesWallBlock(Blocks.JUNGLE_LEAVES));
	@SuppressWarnings("deprecation")
	public static final Block JUNGLE_LEAF_CARPET = register("jungle_leaf_carpet", new LeafCarpetBlock(AbstractBlock.Settings.copyShallow(Blocks.JUNGLE_LEAVES)));
	public static final Block ACACIA_LEAF_SLAB = register("acacia_leaf_slab", createLeavesSlabBlock(Blocks.ACACIA_LEAVES));
	public static final Block ACACIA_LEAF_STAIRS = register("acacia_leaf_stairs", createLeavesStairsBlock(Blocks.ACACIA_LEAVES));
	public static final Block ACACIA_LEAF_WALL = register("acacia_leaf_wall", createLeavesWallBlock(Blocks.ACACIA_LEAVES));
	@SuppressWarnings("deprecation")
	public static final Block ACACIA_LEAF_CARPET = register("acacia_leaf_carpet", new LeafCarpetBlock(AbstractBlock.Settings.copyShallow(Blocks.ACACIA_LEAVES)));
	public static final Block DARK_OAK_LEAF_SLAB = register("dark_oak_leaf_slab", createLeavesSlabBlock(Blocks.DARK_OAK_LEAVES));
	public static final Block DARK_OAK_LEAF_STAIRS = register("dark_oak_leaf_stairs", createLeavesStairsBlock(Blocks.DARK_OAK_LEAVES));
	public static final Block DARK_OAK_LEAF_WALL = register("dark_oak_leaf_wall", createLeavesWallBlock(Blocks.DARK_OAK_LEAVES));
	@SuppressWarnings("deprecation")
	public static final Block DARK_OAK_LEAF_CARPET = register("dark_oak_leaf_carpet", new LeafCarpetBlock(AbstractBlock.Settings.copyShallow(Blocks.DARK_OAK_LEAVES)));
	public static final Block MANGROVE_LEAF_SLAB = register("mangrove_leaf_slab", createLeavesSlabBlock(Blocks.MANGROVE_LEAVES));
	public static final Block MANGROVE_LEAF_STAIRS = register("mangrove_leaf_stairs", createLeavesStairsBlock(Blocks.MANGROVE_LEAVES));
	public static final Block MANGROVE_LEAF_WALL = register("mangrove_leaf_wall", createLeavesWallBlock(Blocks.MANGROVE_LEAVES));
	@SuppressWarnings("deprecation")
	public static final Block MANGROVE_LEAF_CARPET = register("mangrove_leaf_carpet", new LeafCarpetBlock(AbstractBlock.Settings.copyShallow(Blocks.MANGROVE_LEAVES)));
	@SuppressWarnings("deprecation")
	public static final Block CHERRY_LEAF_SLAB = register("cherry_leaf_slab", new CherryLeafSlabBlock(AbstractBlock.Settings.copyShallow(Blocks.CHERRY_LEAVES).allowsSpawning(SSWPBlocks::canSpawnOnLeavesAndIsNotBottomSlab).blockVision(Blocks::never).solidBlock(Blocks::never).suffocates(Blocks::never)));
	@SuppressWarnings("deprecation")
	public static final Block CHERRY_LEAF_STAIRS = register("cherry_leaf_stairs", new CherryLeafStairsBlock(Blocks.CHERRY_LEAVES.getDefaultState(), AbstractBlock.Settings.copyShallow(Blocks.CHERRY_LEAVES).allowsSpawning(SSWPBlocks::canSpawnOnLeavesAndIsTopHalf)));
	@SuppressWarnings("deprecation")
	public static final Block CHERRY_LEAF_WALL = register("cherry_leaf_wall", new CherryLeafWallBlock(AbstractBlock.Settings.copyShallow(Blocks.CHERRY_LEAVES).solid()));
	@SuppressWarnings("deprecation")
	public static final Block CHERRY_LEAF_CARPET = register("cherry_leaf_carpet", new CherryLeafCarpetBlock(AbstractBlock.Settings.copyShallow(Blocks.CHERRY_LEAVES)));
	public static final Block AZALEA_LEAF_SLAB = register("azalea_leaf_slab", createLeavesSlabBlock(Blocks.AZALEA_LEAVES));
	public static final Block AZALEA_LEAF_STAIRS = register("azalea_leaf_stairs", createLeavesStairsBlock(Blocks.AZALEA_LEAVES));
	public static final Block AZALEA_LEAF_WALL = register("azalea_leaf_wall", createLeavesWallBlock(Blocks.AZALEA_LEAVES));
	@SuppressWarnings("deprecation")
	public static final Block AZALEA_LEAF_CARPET = register("azalea_leaf_carpet", new LeafCarpetBlock(AbstractBlock.Settings.copyShallow(Blocks.AZALEA_LEAVES)));
	public static final Block FLOWERING_AZALEA_LEAF_SLAB = register("flowering_azalea_leaf_slab", createLeavesSlabBlock(Blocks.FLOWERING_AZALEA_LEAVES));
	public static final Block FLOWERING_AZALEA_LEAF_STAIRS = register("flowering_azalea_leaf_stairs", createLeavesStairsBlock(Blocks.FLOWERING_AZALEA_LEAVES));
	public static final Block FLOWERING_AZALEA_LEAF_WALL = register("flowering_azalea_leaf_wall", createLeavesWallBlock(Blocks.FLOWERING_AZALEA_LEAVES));
	@SuppressWarnings("deprecation")
	public static final Block FLOWERING_AZALEA_LEAF_CARPET = register("flowering_azalea_leaf_carpet", new LeafCarpetBlock(AbstractBlock.Settings.copyShallow(Blocks.FLOWERING_AZALEA_LEAVES)));
	
	public static final Block BROWN_MUSHROOM_SLAB = register("brown_mushroom_block", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BROWN_MUSHROOM_BLOCK)));
	public static final Block BROWN_MUSHROOM_STAIRS = register("brown_mushroom_stairs", new StairsBlock(Blocks.BROWN_MUSHROOM_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BROWN_MUSHROOM_BLOCK)));
	public static final Block BROWN_MUSHROOM_WALL = register("brown_mushroom_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BROWN_MUSHROOM_BLOCK).solid()));
	public static final Block RED_MUSHROOM_SLAB = register("red_mushroom_block", new SlabBlock(AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
	public static final Block RED_MUSHROOM_STAIRS = register("red_mushroom_stairs", new StairsBlock(Blocks.RED_MUSHROOM_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK)));
	public static final Block RED_MUSHROOM_WALL = register("red_mushroom_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.RED_MUSHROOM_BLOCK).solid()));
	
	public static final Block NETHER_WART_SLAB = register("nether_wart_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.NETHER_WART_BLOCK)));
	public static final Block NETHER_WART_STAIRS = register("nether_wart_stairs", new StairsBlock(Blocks.NETHER_WART_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.NETHER_WART_BLOCK)));
	public static final Block NETHER_WART_WALL = register("nether_wart_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.NETHER_WART_BLOCK).solid()));
	public static final Block WARPED_WART_SLAB = register("warped_wart_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.WARPED_WART_BLOCK)));
	public static final Block WARPED_WART_STAIRS = register("warped_wart_stairs", new StairsBlock(Blocks.WARPED_WART_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.WARPED_WART_BLOCK)));
	public static final Block WARPED_WART_WALL = register("warped_wart_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.WARPED_WART_BLOCK).solid()));
	
	public static final Block SHROOMLIGHT_SLAB = register("shroomlight_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.SHROOMLIGHT)));
	public static final Block SHROOMLIGHT_STAIRS = register("shroomlight_stairs", new StairsBlock(Blocks.SHROOMLIGHT.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SHROOMLIGHT)));
	public static final Block SHROOMLIGHT_WALL = register("shroomlight_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.SHROOMLIGHT).solid()));
	
	public static final Block DRIED_KELP_SLAB = register("dried_kelp_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.DRIED_KELP_BLOCK)));
	public static final Block DRIED_KELP_STAIRS = register("dried_kelp_stairs", new StairsBlock(Blocks.DRIED_KELP_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DRIED_KELP_BLOCK)));
	public static final Block DRIED_KELP_WALL = register("dried_kelp_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.DRIED_KELP_BLOCK)));
	
	public static final Block DEAD_TUBE_CORAL_SLAB = register("dead_tube_coral_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.DEAD_TUBE_CORAL_BLOCK)));
	public static final Block DEAD_TUBE_CORAL_STAIRS = register("dead_tube_coral_stairs", new StairsBlock(Blocks.DEAD_TUBE_CORAL_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DEAD_TUBE_CORAL_BLOCK)));
	public static final Block DEAD_TUBE_CORAL_WALL = register("dead_tube_coral_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.DEAD_TUBE_CORAL_BLOCK).solid()));
	public static final Block DEAD_BRAIN_CORAL_SLAB = register("dead_brain_coral_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.DEAD_BRAIN_CORAL_BLOCK)));
	public static final Block DEAD_BRAIN_CORAL_STAIRS = register("dead_brain_coral_stairs", new StairsBlock(Blocks.DEAD_BRAIN_CORAL_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DEAD_BRAIN_CORAL_BLOCK)));
	public static final Block DEAD_BRAIN_CORAL_WALL = register("dead_brain_coral_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.DEAD_BRAIN_CORAL_BLOCK).solid()));
	public static final Block DEAD_BUBBLE_CORAL_SLAB = register("dead_bubble_coral_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.DEAD_BUBBLE_CORAL_BLOCK)));
	public static final Block DEAD_BUBBLE_CORAL_STAIRS = register("dead_bubble_coral_stairs", new StairsBlock(Blocks.DEAD_BUBBLE_CORAL_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DEAD_BUBBLE_CORAL_BLOCK)));
	public static final Block DEAD_BUBBLE_CORAL_WALL = register("dead_bubble_coral_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.DEAD_BUBBLE_CORAL_BLOCK).solid()));
	public static final Block DEAD_FIRE_CORAL_SLAB = register("dead_fire_coral_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.DEAD_FIRE_CORAL_BLOCK)));
	public static final Block DEAD_FIRE_CORAL_STAIRS = register("dead_fire_coral_stairs", new StairsBlock(Blocks.DEAD_FIRE_CORAL_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DEAD_FIRE_CORAL_BLOCK)));
	public static final Block DEAD_FIRE_CORAL_WALL = register("dead_fire_coral_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.DEAD_FIRE_CORAL_BLOCK).solid()));
	public static final Block DEAD_HORN_CORAL_SLAB = register("dead_horn_coral_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.DEAD_HORN_CORAL_BLOCK)));
	public static final Block DEAD_HORN_CORAL_STAIRS = register("dead_horn_coral_stairs", new StairsBlock(Blocks.DEAD_HORN_CORAL_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.DEAD_HORN_CORAL_BLOCK)));
	public static final Block DEAD_HORN_CORAL_WALL = register("dead_horn_coral_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.DEAD_HORN_CORAL_BLOCK).solid()));
	
	public static final Block TUBE_CORAL_SLAB = register("tube_coral_slab", new CoralSlabBlock(DEAD_TUBE_CORAL_SLAB, AbstractBlock.Settings.copy(Blocks.TUBE_CORAL_BLOCK)));
	public static final Block TUBE_CORAL_STAIRS = register("tube_coral_stairs", new CoralStairsBlock(DEAD_TUBE_CORAL_STAIRS, Blocks.TUBE_CORAL_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.TUBE_CORAL_BLOCK)));
	public static final Block TUBE_CORAL_WALL = register("tube_coral_wall", new CoralWallBlock(DEAD_TUBE_CORAL_WALL, AbstractBlock.Settings.copy(Blocks.TUBE_CORAL_BLOCK).solid()));
	public static final Block BRAIN_CORAL_SLAB = register("brain_coral_slab", new CoralSlabBlock(DEAD_BRAIN_CORAL_SLAB, AbstractBlock.Settings.copy(Blocks.BRAIN_CORAL_BLOCK)));
	public static final Block BRAIN_CORAL_STAIRS = register("brain_coral_stairs", new CoralStairsBlock(DEAD_BRAIN_CORAL_STAIRS, Blocks.BRAIN_CORAL_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BRAIN_CORAL_BLOCK)));
	public static final Block BRAIN_CORAL_WALL = register("brain_coral_wall", new CoralWallBlock(DEAD_BRAIN_CORAL_WALL, AbstractBlock.Settings.copy(Blocks.BRAIN_CORAL_BLOCK).solid()));
	public static final Block BUBBLE_CORAL_SLAB = register("bubble_coral_slab", new CoralSlabBlock(DEAD_BUBBLE_CORAL_SLAB, AbstractBlock.Settings.copy(Blocks.BUBBLE_CORAL_BLOCK)));
	public static final Block BUBBLE_CORAL_STAIRS = register("bubble_coral_stairs", new CoralStairsBlock(DEAD_BUBBLE_CORAL_STAIRS, Blocks.BUBBLE_CORAL_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BUBBLE_CORAL_BLOCK)));
	public static final Block BUBBLE_CORAL_WALL = register("bubble_coral_wall", new CoralWallBlock(DEAD_BUBBLE_CORAL_WALL, AbstractBlock.Settings.copy(Blocks.BUBBLE_CORAL_BLOCK).solid()));
	public static final Block FIRE_CORAL_SLAB = register("fire_coral_slab", new CoralSlabBlock(DEAD_FIRE_CORAL_SLAB, AbstractBlock.Settings.copy(Blocks.FIRE_CORAL_BLOCK)));
	public static final Block FIRE_CORAL_STAIRS = register("fire_coral_stairs", new CoralStairsBlock(DEAD_FIRE_CORAL_STAIRS, Blocks.FIRE_CORAL_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.FIRE_CORAL_BLOCK)));
	public static final Block FIRE_CORAL_WALL = register("fire_coral_wall", new CoralWallBlock(DEAD_FIRE_CORAL_WALL, AbstractBlock.Settings.copy(Blocks.FIRE_CORAL_BLOCK).solid()));
	public static final Block HORN_CORAL_SLAB = register("horn_coral_slab", new CoralSlabBlock(DEAD_HORN_CORAL_SLAB, AbstractBlock.Settings.copy(Blocks.HORN_CORAL_BLOCK)));
	public static final Block HORN_CORAL_STAIRS = register("horn_coral_stairs", new CoralStairsBlock(DEAD_HORN_CORAL_STAIRS, Blocks.HORN_CORAL_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.HORN_CORAL_BLOCK)));
	public static final Block HORN_CORAL_WALL = register("horn_coral_wall", new CoralWallBlock(DEAD_HORN_CORAL_WALL, AbstractBlock.Settings.copy(Blocks.HORN_CORAL_BLOCK).solid()));
	
	public static final Block HAY_SLAB = register("hay_slab", new OrientableSlabBlock(AbstractBlock.Settings.copy(Blocks.HAY_BLOCK)));
	public static final Block HAY_STAIRS = register("hay_stairs", new OrientableStairsBlock(Blocks.HAY_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.HAY_BLOCK)));
	public static final Block HAY_WALL = register("hay_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.HAY_BLOCK).solid()));
	
	public static final Block HONEYCOMB_SLAB = register("honeycomb_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.HONEYCOMB_BLOCK)));
	public static final Block HONEYCOMB_STAIRS = register("honeycomb_stairs", new StairsBlock(Blocks.HONEYCOMB_BLOCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.HONEYCOMB_BLOCK)));
	public static final Block HONEYCOMB_WALL = register("honeycomb_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.HONEYCOMB_BLOCK).solid()));
	
	public static final Block OCHRE_FROGLIGHT_SLAB = register("ochre_froglight_slab", new OrientableSlabBlock(AbstractBlock.Settings.copy(Blocks.OCHRE_FROGLIGHT)));
	public static final Block OCHRE_FROGLIGHT_STAIRS = register("ochre_froglight_stairs", new OrientableStairsBlock(Blocks.OCHRE_FROGLIGHT.getDefaultState(), AbstractBlock.Settings.copy(Blocks.OCHRE_FROGLIGHT)));
	public static final Block OCHRE_FROGLIGHT_WALL = register("ochre_froglight_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.OCHRE_FROGLIGHT).solid()));
	public static final Block VERDANT_FROGLIGHT_SLAB = register("verdant_froglight_slab", new OrientableSlabBlock(AbstractBlock.Settings.copy(Blocks.VERDANT_FROGLIGHT)));
	public static final Block VERDANT_FROGLIGHT_STAIRS = register("verdant_froglight_stairs", new OrientableStairsBlock(Blocks.VERDANT_FROGLIGHT.getDefaultState(), AbstractBlock.Settings.copy(Blocks.VERDANT_FROGLIGHT)));
	public static final Block VERDANT_FROGLIGHT_WALL = register("verdant_froglight_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.VERDANT_FROGLIGHT).solid()));
	public static final Block PEARLESCENT_FROGLIGHT_SLAB = register("pearlescent_froglight_slab", new OrientableSlabBlock(AbstractBlock.Settings.copy(Blocks.PEARLESCENT_FROGLIGHT)));
	public static final Block PEARLESCENT_FROGLIGHT_STAIRS = register("pearlescent_froglight_stairs", new OrientableStairsBlock(Blocks.PEARLESCENT_FROGLIGHT.getDefaultState(), AbstractBlock.Settings.copy(Blocks.PEARLESCENT_FROGLIGHT)));
	public static final Block PEARLESCENT_FROGLIGHT_WALL = register("pearlescent_froglight_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.PEARLESCENT_FROGLIGHT).solid()));
	
	public static final Block SCULK_SLAB = register("sculk_slab", new ExperienceDroppingSlabBlock(UniformIntProvider.create(0, 1), AbstractBlock.Settings.copy(Blocks.SCULK)));
	public static final Block SCULK_STAIRS = register("sculk_stairs", new ExperienceDroppingStairsBlock(ConstantIntProvider.create(1), Blocks.SCULK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.SCULK)));
	public static final Block SCULK_WALL = register("sculk_wall", new ExperienceDroppingWallBlock(ConstantIntProvider.create(1), AbstractBlock.Settings.copy(Blocks.SCULK).solid()));
	
	public static final Block BEDROCK_SLAB = register("bedrock_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.BEDROCK)));
	public static final Block BEDROCK_STAIRS = register("bedrock_stairs", new StairsBlock(Blocks.BEDROCK.getDefaultState(), AbstractBlock.Settings.copy(Blocks.BEDROCK)));
	public static final Block BEDROCK_WALL = register("bedrock_wall", new WallBlock(AbstractBlock.Settings.copy(Blocks.BEDROCK).solid()));
	
	@SuppressWarnings("deprecation")
	public static final Block REDSTONE_LAMP_SLAB = register("redstone_lamp_slab", new RedstoneLampSlabBlock(AbstractBlock.Settings.copyShallow(Blocks.REDSTONE_LAMP).allowsSpawning(SSWPBlocks::isNotBottomSlab)));
	@SuppressWarnings("deprecation")
	public static final Block REDSTONE_LAMP_STAIRS = register("redstone_lamp_stairs", new RedstoneLampStairsBlock(Blocks.REDSTONE_LAMP.getDefaultState(), AbstractBlock.Settings.copyShallow(Blocks.REDSTONE_LAMP).allowsSpawning(SSWPBlocks::isTopHalf)));
	@SuppressWarnings("deprecation")
	public static final Block REDSTONE_LAMP_WALL = register("redstone_lamp_wall", new RedstoneLampWallBlock(AbstractBlock.Settings.copyShallow(Blocks.REDSTONE_LAMP).solid()));
	
	public static final Block INFESTED_MOSSY_COBBLESTONE = register("infested_mossy_cobblestone", new InfestedBlock(Blocks.MOSSY_COBBLESTONE, AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE_GRAY)));
	public static final Block INFESTED_SMOOTH_STONE = register("infested_smooth_stone", new InfestedBlock(Blocks.SMOOTH_STONE, AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE_GRAY)));
	public static final Block INFESTED_GRANITE = register("infested_granite", new InfestedBlock(Blocks.GRANITE, AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_BROWN)));
	public static final Block INFESTED_POLISHED_GRANITE = register("infested_polished_granite", new InfestedBlock(Blocks.POLISHED_GRANITE, AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_BROWN)));
	public static final Block INFESTED_DIORITE = register("infested_diorite", new InfestedBlock(Blocks.DIORITE, AbstractBlock.Settings.create().mapColor(MapColor.WHITE_GRAY)));
	public static final Block INFESTED_POLISHED_DIORITE = register("infested_polished_diorite", new InfestedBlock(Blocks.POLISHED_DIORITE, AbstractBlock.Settings.create().mapColor(MapColor.WHITE_GRAY)));
	public static final Block INFESTED_ANDESITE = register("infested_andesite", new InfestedBlock(Blocks.ANDESITE, AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE_GRAY)));
	public static final Block INFESTED_POLISHED_ANDESITE = register("infested_polished_andesite", new InfestedBlock(Blocks.POLISHED_ANDESITE, AbstractBlock.Settings.create().mapColor(MapColor.LIGHT_BLUE_GRAY)));
	public static final Block INFESTED_COBBLED_DEEPSLATE = register("infested_cobbled_deepslate", new InfestedBlock(Blocks.COBBLED_DEEPSLATE, AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).sounds(BlockSoundGroup.DEEPSLATE)));
	public static final Block INFESTED_CHISELED_DEEPSLATE = register("infested_chiseled_deepslate", new InfestedBlock(Blocks.CHISELED_DEEPSLATE, AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
	public static final Block INFESTED_POLISHED_DEEPSLATE = register("infested_polished_deepslate", new InfestedBlock(Blocks.POLISHED_DEEPSLATE, AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).sounds(BlockSoundGroup.POLISHED_DEEPSLATE)));
	public static final Block INFESTED_DEEPSLATE_BRICKS = register("infested_deepslate_bricks", new InfestedBlock(Blocks.DEEPSLATE_BRICKS, AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
	public static final Block INFESTED_CRACKED_DEEPSLATE_BRICKS = register("infested_cracked_deepslate_bricks", new InfestedBlock(Blocks.CRACKED_DEEPSLATE_BRICKS, AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
	public static final Block INFESTED_DEEPSLATE_TILES = register("infested_deepslate_tiles", new InfestedBlock(Blocks.DEEPSLATE_TILES, AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).sounds(BlockSoundGroup.DEEPSLATE_TILES)));
	public static final Block INFESTED_CRACKED_DEEPSLATE_TILES = register("infested_cracked_deepslate_tiles", new InfestedBlock(Blocks.CRACKED_DEEPSLATE_TILES, AbstractBlock.Settings.create().mapColor(MapColor.DEEPSLATE_GRAY).sounds(BlockSoundGroup.DEEPSLATE_TILES)));
	public static final Block INFESTED_TUFF = register("infested_tuff", new InfestedBlock(Blocks.TUFF, AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).sounds(BlockSoundGroup.TUFF)));
	public static final Block INFESTED_CHISELED_TUFF = register("infested_chiseled_tuff", new InfestedBlock(Blocks.CHISELED_TUFF, AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).sounds(BlockSoundGroup.TUFF)));
	public static final Block INFESTED_POLISHED_TUFF = register("infested_polished_tuff", new InfestedBlock(Blocks.POLISHED_TUFF, AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).sounds(BlockSoundGroup.POLISHED_TUFF)));
	public static final Block INFESTED_TUFF_BRICKS = register("infested_tuff_bricks", new InfestedBlock(Blocks.TUFF_BRICKS, AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).sounds(BlockSoundGroup.TUFF_BRICKS)));
	public static final Block INFESTED_CHISELED_TUFF_BRICKS = register("infested_chiseled_tuff_bricks", new InfestedBlock(Blocks.CHISELED_TUFF_BRICKS, AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).sounds(BlockSoundGroup.TUFF_BRICKS)));
	public static final Block INFESTED_CALCITE = register("infested_calcite", new InfestedBlock(Blocks.CALCITE, AbstractBlock.Settings.create().mapColor(MapColor.WHITE_GRAY)));
	public static final Block INFESTED_DRIPSTONE_BLOCK = register("infested_dripstone_block", new InfestedBlock(Blocks.DRIPSTONE_BLOCK, AbstractBlock.Settings.create().mapColor(MapColor.TERRACOTTA_RED)));
	
	public static final Block OAK_LADDER = register("oak_ladder", createLadder());
	public static final Block SPRUCE_LADDER = register("spruce_ladder", createLadder());
	public static final Block BIRCH_LADDER = register("birch_ladder", createLadder());
	public static final Block JUNGLE_LADDER = register("jungle_ladder", createLadder());
	public static final Block ACACIA_LADDER = register("acacia_ladder", createLadder());
	public static final Block DARK_OAK_LADDER = register("dark_oak_ladder", createLadder());
	public static final Block MANGROVE_LADDER = register("mangrove_ladder", createLadder());
	public static final Block CHERRY_LADDER = register("cherry_ladder", createLadder(SSWPBlockSoundGroups.CHERRY_LADDER));
	public static final Block BAMBOO_LADDER = register("bamboo_ladder", createLadder(SSWPBlockSoundGroups.BAMBOO_LADDER));
	public static final Block CRIMSON_LADDER = register("crimson_ladder", createNetherWoodLadder());
	public static final Block WARPED_LADDER = register("warped_ladder", createNetherWoodLadder());
	
	@SuppressWarnings("deprecation")
	public static final Block IRON_LADDER = register("iron_ladder", new LadderBlock(AbstractBlock.Settings.create().requiresTool().notSolid().strength(4.0f, 4.8f).sounds(BlockSoundGroup.COPPER_GRATE).nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));
	
	@SuppressWarnings("deprecation")
	public static final Block GOLD_LADDER = register("gold_ladder", new LadderBlock(AbstractBlock.Settings.create().requiresTool().notSolid().strength(2.4f, 4.8f).sounds(BlockSoundGroup.COPPER_GRATE).nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));
	
	@SuppressWarnings("deprecation")
	public static final Block NETHERITE_LADDER = register("netherite_ladder", new LadderBlock(AbstractBlock.Settings.create().requiresTool().notSolid().strength(40.0f, 960.0f).sounds(BlockSoundGroup.NETHERITE).nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));
	
	@SuppressWarnings("deprecation")
	public static final Block COPPER_LADDER = register("copper_ladder", new OxidizableLadderBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.create().requiresTool().notSolid().strength(2.4f, 4.8f).sounds(BlockSoundGroup.COPPER_GRATE).nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));
	public static final Block EXPOSED_COPPER_LADDER = register("exposed_copper_ladder", new OxidizableLadderBlock(Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(COPPER_LADDER)));
	public static final Block WEATHERED_COPPER_LADDER = register("weathered_copper_ladder", new OxidizableLadderBlock(Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(COPPER_LADDER)));
	public static final Block OXIDIZED_COPPER_LADDER = register("oxidized_copper_ladder", new OxidizableLadderBlock(Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(COPPER_LADDER)));
	public static final Block WAXED_COPPER_LADDER = register("waxed_copper_ladder", new LadderBlock(AbstractBlock.Settings.copy(COPPER_LADDER)));
	public static final Block WAXED_EXPOSED_COPPER_LADDER = register("waxed_exposed_copper_ladder", new LadderBlock(AbstractBlock.Settings.copy(EXPOSED_COPPER_LADDER)));
	public static final Block WAXED_WEATHERED_COPPER_LADDER = register("waxed_weathered_copper_ladder", new LadderBlock(AbstractBlock.Settings.copy(WEATHERED_COPPER_LADDER)));
	public static final Block WAXED_OXIDIZED_COPPER_LADDER = register("waxed_oxidized_copper_ladder", new LadderBlock(AbstractBlock.Settings.copy(OXIDIZED_COPPER_LADDER)));
	
	public static final Block IRON_SIGN = register("iron_sign", new SignBlock(SSWPWoodTypes.IRON, AbstractBlock.Settings.create().requiresTool().mapColor(MapColor.IRON_GRAY).solid().instrument(NoteBlockInstrument.IRON_XYLOPHONE).noCollision().strength(1.0f, 1.2f)));
	public static final Block IRON_WALL_SIGN = register("iron_wall_sign", new WallSignBlock(SSWPWoodTypes.IRON, AbstractBlock.Settings.create().requiresTool().mapColor(MapColor.IRON_GRAY).solid().instrument(NoteBlockInstrument.IRON_XYLOPHONE).noCollision().strength(1.0f, 1.2f).dropsLike(IRON_SIGN)));
	public static final Block IRON_HANGING_SIGN = register("iron_hanging_sign", new HangingSignBlock(SSWPWoodTypes.IRON, AbstractBlock.Settings.create().requiresTool().mapColor(MapColor.IRON_GRAY).solid().instrument(NoteBlockInstrument.IRON_XYLOPHONE).noCollision().strength(1.0f, 1.2f)));
	public static final Block IRON_WALL_HANGING_SIGN = register("iron_wall_hanging_sign", new WallHangingSignBlock(SSWPWoodTypes.IRON, AbstractBlock.Settings.create().requiresTool().mapColor(MapColor.IRON_GRAY).solid().instrument(NoteBlockInstrument.IRON_XYLOPHONE).noCollision().strength(1.0f, 1.2f).dropsLike(IRON_HANGING_SIGN)));
	
	public static final Block GOLD_SIGN = register("gold_sign", new SignBlock(SSWPWoodTypes.GOLD, AbstractBlock.Settings.create().requiresTool().mapColor(MapColor.GOLD).solid().instrument(NoteBlockInstrument.BELL).noCollision().strength(0.6f, 1.2f)));
	public static final Block GOLD_WALL_SIGN = register("gold_wall_sign", new WallSignBlock(SSWPWoodTypes.GOLD, AbstractBlock.Settings.create().requiresTool().mapColor(MapColor.GOLD).solid().instrument(NoteBlockInstrument.BELL).noCollision().strength(0.6f, 1.2f).dropsLike(GOLD_SIGN)));
	public static final Block GOLD_HANGING_SIGN = register("gold_hanging_sign", new HangingSignBlock(SSWPWoodTypes.GOLD, AbstractBlock.Settings.create().requiresTool().mapColor(MapColor.GOLD).solid().instrument(NoteBlockInstrument.BELL).noCollision().strength(0.6f, 1.2f)));
	public static final Block GOLD_WALL_HANGING_SIGN = register("gold_wall_hanging_sign", new WallHangingSignBlock(SSWPWoodTypes.GOLD, AbstractBlock.Settings.create().requiresTool().mapColor(MapColor.GOLD).solid().instrument(NoteBlockInstrument.BELL).noCollision().strength(0.6f, 1.2f).dropsLike(GOLD_HANGING_SIGN)));
	
	public static final Block NETHERITE_SIGN = register("netherite_sign", new SignBlock(SSWPWoodTypes.NETHERITE, AbstractBlock.Settings.create().requiresTool().mapColor(MapColor.BLACK).solid().noCollision().strength(10.0f, 240.0f)));
	public static final Block NETHERITE_WALL_SIGN = register("netherite_wall_sign", new WallSignBlock(SSWPWoodTypes.NETHERITE, AbstractBlock.Settings.create().requiresTool().mapColor(MapColor.BLACK).solid().noCollision().strength(10.0f, 240.0f).dropsLike(NETHERITE_SIGN)));
	public static final Block NETHERITE_HANGING_SIGN = register("netherite_hanging_sign", new HangingSignBlock(SSWPWoodTypes.NETHERITE, AbstractBlock.Settings.create().requiresTool().mapColor(MapColor.BLACK).solid().noCollision().strength(10.0f, 240.0f)));
	public static final Block NETHERITE_WALL_HANGING_SIGN = register("netherite_wall_hanging_sign", new WallHangingSignBlock(SSWPWoodTypes.NETHERITE, AbstractBlock.Settings.create().requiresTool().mapColor(MapColor.BLACK).solid().noCollision().strength(10.0f, 240.0f).dropsLike(NETHERITE_HANGING_SIGN)));
	
	public static final Block COPPER_SIGN = register("copper_sign", new OxidizableSignBlock(Oxidizable.OxidationLevel.UNAFFECTED, SSWPWoodTypes.COPPER, AbstractBlock.Settings.create().requiresTool().mapColor(MapColor.ORANGE).solid().noCollision().strength(0.6f, 1.2f)));
	public static final Block COPPER_WALL_SIGN = register("copper_wall_sign", new OxidizableWallSignBlock(Oxidizable.OxidationLevel.UNAFFECTED, SSWPWoodTypes.COPPER, AbstractBlock.Settings.create().requiresTool().mapColor(MapColor.ORANGE).solid().noCollision().strength(0.6f, 1.2f).dropsLike(COPPER_SIGN)));
	public static final Block COPPER_HANGING_SIGN = register("copper_hanging_sign", new OxidizableHangingSignBlock(Oxidizable.OxidationLevel.UNAFFECTED, SSWPWoodTypes.COPPER, AbstractBlock.Settings.create().requiresTool().mapColor(MapColor.ORANGE).solid().noCollision().strength(0.6f, 1.2f)));
	public static final Block COPPER_WALL_HANGING_SIGN = register("copper_wall_hanging_sign", new OxidizableWallHangingSignBlock(Oxidizable.OxidationLevel.UNAFFECTED, SSWPWoodTypes.COPPER, AbstractBlock.Settings.create().requiresTool().mapColor(MapColor.ORANGE).solid().noCollision().strength(0.6f, 1.2f).dropsLike(COPPER_HANGING_SIGN)));
	@SuppressWarnings("deprecation")
	public static final Block EXPOSED_COPPER_SIGN = register("exposed_copper_sign", new OxidizableSignBlock(Oxidizable.OxidationLevel.EXPOSED, SSWPWoodTypes.EXPOSED_COPPER, AbstractBlock.Settings.copyShallow(COPPER_SIGN).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));
	@SuppressWarnings("deprecation")
	public static final Block EXPOSED_COPPER_WALL_SIGN = register("exposed_copper_wall_sign", new OxidizableWallSignBlock(Oxidizable.OxidationLevel.EXPOSED, SSWPWoodTypes.EXPOSED_COPPER, AbstractBlock.Settings.copyShallow(COPPER_WALL_SIGN).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).dropsLike(EXPOSED_COPPER_SIGN)));
	@SuppressWarnings("deprecation")
	public static final Block EXPOSED_COPPER_HANGING_SIGN = register("exposed_copper_hanging_sign", new OxidizableHangingSignBlock(Oxidizable.OxidationLevel.EXPOSED, SSWPWoodTypes.EXPOSED_COPPER, AbstractBlock.Settings.copyShallow(COPPER_HANGING_SIGN).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));
	@SuppressWarnings("deprecation")
	public static final Block EXPOSED_COPPER_WALL_HANGING_SIGN = register("exposed_copper_wall_hanging_sign", new OxidizableWallHangingSignBlock(Oxidizable.OxidationLevel.EXPOSED, SSWPWoodTypes.EXPOSED_COPPER, AbstractBlock.Settings.copyShallow(COPPER_WALL_HANGING_SIGN).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY).dropsLike(EXPOSED_COPPER_HANGING_SIGN)));
	@SuppressWarnings("deprecation")
	public static final Block WEATHERED_COPPER_SIGN = register("weathered_copper_sign", new OxidizableSignBlock(Oxidizable.OxidationLevel.WEATHERED, SSWPWoodTypes.WEATHERED_COPPER, AbstractBlock.Settings.copyShallow(COPPER_SIGN).mapColor(MapColor.DARK_AQUA)));
	@SuppressWarnings("deprecation")
	public static final Block WEATHERED_COPPER_WALL_SIGN = register("weathered_copper_wall_sign", new OxidizableWallSignBlock(Oxidizable.OxidationLevel.WEATHERED, SSWPWoodTypes.WEATHERED_COPPER, AbstractBlock.Settings.copyShallow(COPPER_WALL_SIGN).mapColor(MapColor.DARK_AQUA).dropsLike(WEATHERED_COPPER_SIGN)));
	@SuppressWarnings("deprecation")
	public static final Block WEATHERED_COPPER_HANGING_SIGN = register("weathered_copper_hanging_sign", new OxidizableHangingSignBlock(Oxidizable.OxidationLevel.WEATHERED, SSWPWoodTypes.WEATHERED_COPPER, AbstractBlock.Settings.copyShallow(COPPER_HANGING_SIGN).mapColor(MapColor.DARK_AQUA)));
	@SuppressWarnings("deprecation")
	public static final Block WEATHERED_COPPER_WALL_HANGING_SIGN = register("weathered_copper_wall_hanging_sign", new OxidizableWallHangingSignBlock(Oxidizable.OxidationLevel.WEATHERED, SSWPWoodTypes.WEATHERED_COPPER, AbstractBlock.Settings.copyShallow(COPPER_WALL_HANGING_SIGN).mapColor(MapColor.DARK_AQUA).dropsLike(WEATHERED_COPPER_HANGING_SIGN)));
	@SuppressWarnings("deprecation")
	public static final Block OXIDIZED_COPPER_SIGN = register("oxidized_copper_sign", new OxidizableSignBlock(Oxidizable.OxidationLevel.OXIDIZED, SSWPWoodTypes.OXIDIZED_COPPER, AbstractBlock.Settings.copyShallow(COPPER_SIGN).mapColor(MapColor.TEAL)));
	@SuppressWarnings("deprecation")
	public static final Block OXIDIZED_COPPER_WALL_SIGN = register("oxidized_copper_wall_sign", new OxidizableWallSignBlock(Oxidizable.OxidationLevel.OXIDIZED, SSWPWoodTypes.OXIDIZED_COPPER, AbstractBlock.Settings.copyShallow(COPPER_WALL_SIGN).mapColor(MapColor.TEAL).dropsLike(OXIDIZED_COPPER_SIGN)));
	@SuppressWarnings("deprecation")
	public static final Block OXIDIZED_COPPER_HANGING_SIGN = register("oxidized_copper_hanging_sign", new OxidizableHangingSignBlock(Oxidizable.OxidationLevel.OXIDIZED, SSWPWoodTypes.OXIDIZED_COPPER, AbstractBlock.Settings.copyShallow(COPPER_HANGING_SIGN).mapColor(MapColor.TEAL)));
	@SuppressWarnings("deprecation")
	public static final Block OXIDIZED_COPPER_WALL_HANGING_SIGN = register("oxidized_copper_wall_hanging_sign", new OxidizableWallHangingSignBlock(Oxidizable.OxidationLevel.OXIDIZED, SSWPWoodTypes.OXIDIZED_COPPER, AbstractBlock.Settings.copyShallow(COPPER_WALL_HANGING_SIGN).mapColor(MapColor.TEAL).dropsLike(OXIDIZED_COPPER_HANGING_SIGN)));
	@SuppressWarnings("deprecation")
	public static final Block WAXED_COPPER_SIGN = register("waxed_copper_sign", new SignBlock(SSWPWoodTypes.COPPER, AbstractBlock.Settings.copyShallow(COPPER_SIGN)));
	@SuppressWarnings("deprecation")
	public static final Block WAXED_COPPER_WALL_SIGN = register("waxed_copper_wall_sign", new WallSignBlock(SSWPWoodTypes.COPPER, AbstractBlock.Settings.copyShallow(COPPER_WALL_SIGN).dropsLike(WAXED_COPPER_SIGN)));
	@SuppressWarnings("deprecation")
	public static final Block WAXED_COPPER_HANGING_SIGN = register("waxed_copper_hanging_sign", new HangingSignBlock(SSWPWoodTypes.COPPER, AbstractBlock.Settings.copyShallow(COPPER_HANGING_SIGN)));
	@SuppressWarnings("deprecation")
	public static final Block WAXED_COPPER_WALL_HANGING_SIGN = register("waxed_copper_wall_hanging_sign", new WallHangingSignBlock(SSWPWoodTypes.COPPER, AbstractBlock.Settings.copyShallow(COPPER_WALL_HANGING_SIGN).dropsLike(WAXED_COPPER_HANGING_SIGN)));
	@SuppressWarnings("deprecation")
	public static final Block WAXED_EXPOSED_COPPER_SIGN = register("waxed_exposed_copper_sign", new SignBlock(SSWPWoodTypes.EXPOSED_COPPER, AbstractBlock.Settings.copyShallow(EXPOSED_COPPER_SIGN)));
	@SuppressWarnings("deprecation")
	public static final Block WAXED_EXPOSED_COPPER_WALL_SIGN = register("waxed_exposed_copper_wall_sign", new WallSignBlock(SSWPWoodTypes.EXPOSED_COPPER, AbstractBlock.Settings.copyShallow(EXPOSED_COPPER_WALL_SIGN).dropsLike(WAXED_EXPOSED_COPPER_SIGN)));
	@SuppressWarnings("deprecation")
	public static final Block WAXED_EXPOSED_COPPER_HANGING_SIGN = register("waxed_exposed_copper_hanging_sign", new HangingSignBlock(SSWPWoodTypes.EXPOSED_COPPER, AbstractBlock.Settings.copyShallow(EXPOSED_COPPER_HANGING_SIGN)));
	@SuppressWarnings("deprecation")
	public static final Block WAXED_EXPOSED_COPPER_WALL_HANGING_SIGN = register("waxed_exposed_copper_wall_hanging_sign", new WallHangingSignBlock(SSWPWoodTypes.EXPOSED_COPPER, AbstractBlock.Settings.copyShallow(EXPOSED_COPPER_WALL_HANGING_SIGN).dropsLike(WAXED_EXPOSED_COPPER_HANGING_SIGN)));
	@SuppressWarnings("deprecation")
	public static final Block WAXED_WEATHERED_COPPER_SIGN = register("waxed_weathered_copper_sign", new SignBlock(SSWPWoodTypes.WEATHERED_COPPER, AbstractBlock.Settings.copyShallow(WEATHERED_COPPER_SIGN)));
	@SuppressWarnings("deprecation")
	public static final Block WAXED_WEATHERED_COPPER_WALL_SIGN = register("waxed_weathered_copper_wall_sign", new WallSignBlock(SSWPWoodTypes.WEATHERED_COPPER, AbstractBlock.Settings.copyShallow(WEATHERED_COPPER_WALL_SIGN).dropsLike(WAXED_WEATHERED_COPPER_SIGN)));
	@SuppressWarnings("deprecation")
	public static final Block WAXED_WEATHERED_COPPER_HANGING_SIGN = register("waxed_weathered_copper_hanging_sign", new HangingSignBlock(SSWPWoodTypes.WEATHERED_COPPER, AbstractBlock.Settings.copyShallow(WEATHERED_COPPER_HANGING_SIGN)));
	@SuppressWarnings("deprecation")
	public static final Block WAXED_WEATHERED_COPPER_WALL_HANGING_SIGN = register("waxed_weathered_copper_wall_hanging_sign", new WallHangingSignBlock(SSWPWoodTypes.WEATHERED_COPPER, AbstractBlock.Settings.copyShallow(WEATHERED_COPPER_WALL_HANGING_SIGN).dropsLike(WAXED_WEATHERED_COPPER_HANGING_SIGN)));
	@SuppressWarnings("deprecation")
	public static final Block WAXED_OXIDIZED_COPPER_SIGN = register("waxed_oxidized_copper_sign", new SignBlock(SSWPWoodTypes.OXIDIZED_COPPER, AbstractBlock.Settings.copyShallow(OXIDIZED_COPPER_SIGN)));
	@SuppressWarnings("deprecation")
	public static final Block WAXED_OXIDIZED_COPPER_WALL_SIGN = register("waxed_oxidized_copper_wall_sign", new WallSignBlock(SSWPWoodTypes.OXIDIZED_COPPER, AbstractBlock.Settings.copyShallow(OXIDIZED_COPPER_WALL_SIGN).dropsLike(WAXED_OXIDIZED_COPPER_SIGN)));
	@SuppressWarnings("deprecation")
	public static final Block WAXED_OXIDIZED_COPPER_HANGING_SIGN = register("waxed_oxidized_copper_hanging_sign", new HangingSignBlock(SSWPWoodTypes.OXIDIZED_COPPER, AbstractBlock.Settings.copyShallow(OXIDIZED_COPPER_HANGING_SIGN)));
	@SuppressWarnings("deprecation")
	public static final Block WAXED_OXIDIZED_COPPER_WALL_HANGING_SIGN = register("waxed_oxidized_copper_wall_hanging_sign", new WallHangingSignBlock(SSWPWoodTypes.OXIDIZED_COPPER, AbstractBlock.Settings.copyShallow(OXIDIZED_COPPER_WALL_HANGING_SIGN).dropsLike(WAXED_OXIDIZED_COPPER_HANGING_SIGN)));
	
	public static final Block OAK_BOOKSHELF = register("oak_bookshelf", createBookshelf(Blocks.OAK_PLANKS.getDefaultMapColor()));
	public static final Block SPRUCE_BOOKSHELF = register("spruce_bookshelf", createBookshelf(Blocks.SPRUCE_PLANKS.getDefaultMapColor()));
	public static final Block BIRCH_BOOKSHELF = register("birch_bookshelf", createBookshelf(Blocks.BIRCH_PLANKS.getDefaultMapColor()));
	public static final Block JUNGLE_BOOKSHELF = register("jungle_bookshelf", createBookshelf(Blocks.JUNGLE_PLANKS.getDefaultMapColor()));
	public static final Block ACACIA_BOOKSHELF = register("acacia_bookshelf", createBookshelf(Blocks.ACACIA_PLANKS.getDefaultMapColor()));
	public static final Block DARK_OAK_BOOKSHELF = register("dark_oak_bookshelf", createBookshelf(Blocks.DARK_OAK_PLANKS.getDefaultMapColor()));
	public static final Block MANGROVE_BOOKSHELF = register("mangrove_bookshelf", createBookshelf(Blocks.MANGROVE_PLANKS.getDefaultMapColor()));
	public static final Block CHERRY_BOOKSHELF = register("cherry_bookshelf", createBookshelf(Blocks.CHERRY_PLANKS.getDefaultMapColor(), BlockSoundGroup.CHERRY_WOOD));
	public static final Block BAMBOO_BOOKSHELF = register("bamboo_bookshelf", createBookshelf(Blocks.BAMBOO_PLANKS.getDefaultMapColor(), BlockSoundGroup.BAMBOO_WOOD));
	public static final Block CRIMSON_BOOKSHELF = register("crimson_bookshelf", createNetherWoodBookshelf(Blocks.CRIMSON_PLANKS.getDefaultMapColor()));
	public static final Block WARPED_BOOKSHELF = register("warped_bookshelf", createNetherWoodBookshelf(Blocks.WARPED_PLANKS.getDefaultMapColor()));
	
	public static final Block OAK_CRAFTING_TABLE = register("oak_crafting_table", createCraftingTable(Blocks.OAK_PLANKS.getDefaultMapColor()));
	public static final Block SPRUCE_CRAFTING_TABLE = register("spruce_crafting_table", createCraftingTable(Blocks.SPRUCE_PLANKS.getDefaultMapColor()));
	public static final Block BIRCH_CRAFTING_TABLE = register("birch_crafting_table", createCraftingTable(Blocks.BIRCH_PLANKS.getDefaultMapColor()));
	public static final Block JUNGLE_CRAFTING_TABLE = register("jungle_crafting_table", createCraftingTable(Blocks.JUNGLE_PLANKS.getDefaultMapColor()));
	public static final Block ACACIA_CRAFTING_TABLE = register("acacia_crafting_table", createCraftingTable(Blocks.ACACIA_PLANKS.getDefaultMapColor()));
	public static final Block DARK_OAK_CRAFTING_TABLE = register("dark_oak_crafting_table", createCraftingTable(Blocks.DARK_OAK_PLANKS.getDefaultMapColor()));
	public static final Block MANGROVE_CRAFTING_TABLE = register("mangrove_crafting_table", createCraftingTable(Blocks.MANGROVE_PLANKS.getDefaultMapColor()));
	public static final Block CHERRY_CRAFTING_TABLE = register("cherry_crafting_table", createCraftingTable(Blocks.CHERRY_PLANKS.getDefaultMapColor(), BlockSoundGroup.CHERRY_WOOD));
	public static final Block BAMBOO_CRAFTING_TABLE = register("bamboo_crafting_table", createCraftingTable(Blocks.BAMBOO_PLANKS.getDefaultMapColor(), BlockSoundGroup.BAMBOO_WOOD));
	public static final Block CRIMSON_CRAFTING_TABLE = register("crimson_crafting_table", createNetherWoodCraftingTable(Blocks.CRIMSON_PLANKS.getDefaultMapColor()));
	public static final Block WARPED_CRAFTING_TABLE = register("warped_crafting_table", createNetherWoodCraftingTable(Blocks.WARPED_PLANKS.getDefaultMapColor()));
	
	public static final Block OAK_LOOM = register("oak_loom", createLoom(Blocks.OAK_PLANKS.getDefaultMapColor()));
	public static final Block SPRUCE_LOOM = register("spruce_loom", createLoom(Blocks.SPRUCE_PLANKS.getDefaultMapColor()));
	public static final Block BIRCH_LOOM = register("birch_loom", createLoom(Blocks.BIRCH_PLANKS.getDefaultMapColor()));
	public static final Block JUNGLE_LOOM = register("jungle_loom", createLoom(Blocks.JUNGLE_PLANKS.getDefaultMapColor()));
	public static final Block ACACIA_LOOM = register("acacia_loom", createLoom(Blocks.ACACIA_PLANKS.getDefaultMapColor()));
	public static final Block DARK_OAK_LOOM = register("dark_oak_loom", createLoom(Blocks.DARK_OAK_PLANKS.getDefaultMapColor()));
	public static final Block MANGROVE_LOOM = register("mangrove_loom", createLoom(Blocks.MANGROVE_PLANKS.getDefaultMapColor()));
	public static final Block CHERRY_LOOM = register("cherry_loom", createLoom(Blocks.CHERRY_PLANKS.getDefaultMapColor(), BlockSoundGroup.CHERRY_WOOD));
	public static final Block BAMBOO_LOOM = register("bamboo_loom", createLoom(Blocks.BAMBOO_PLANKS.getDefaultMapColor(), BlockSoundGroup.BAMBOO_WOOD));
	public static final Block CRIMSON_LOOM = register("crimson_loom", createNetherWoodLoom(Blocks.CRIMSON_PLANKS.getDefaultMapColor()));
	public static final Block WARPED_LOOM = register("warped_loom", createNetherWoodLoom(Blocks.WARPED_PLANKS.getDefaultMapColor()));
	
	public static final Block OAK_CARTOGRAPHY_TABLE = register("oak_cartography_table", createCartographyTable(Blocks.OAK_PLANKS.getDefaultMapColor()));
	public static final Block SPRUCE_CARTOGRAPHY_TABLE = register("spruce_cartography_table", createCartographyTable(Blocks.SPRUCE_PLANKS.getDefaultMapColor()));
	public static final Block BIRCH_CARTOGRAPHY_TABLE = register("birch_cartography_table", createCartographyTable(Blocks.BIRCH_PLANKS.getDefaultMapColor()));
	public static final Block JUNGLE_CARTOGRAPHY_TABLE = register("jungle_cartography_table", createCartographyTable(Blocks.JUNGLE_PLANKS.getDefaultMapColor()));
	public static final Block ACACIA_CARTOGRAPHY_TABLE = register("acacia_cartography_table", createCartographyTable(Blocks.ACACIA_PLANKS.getDefaultMapColor()));
	public static final Block DARK_OAK_CARTOGRAPHY_TABLE = register("dark_oak_cartography_table", createCartographyTable(Blocks.DARK_OAK_PLANKS.getDefaultMapColor()));
	public static final Block MANGROVE_CARTOGRAPHY_TABLE = register("mangrove_cartography_table", createCartographyTable(Blocks.MANGROVE_PLANKS.getDefaultMapColor()));
	public static final Block CHERRY_CARTOGRAPHY_TABLE = register("cherry_cartography_table", createCartographyTable(Blocks.CHERRY_PLANKS.getDefaultMapColor(), BlockSoundGroup.CHERRY_WOOD));
	public static final Block BAMBOO_CARTOGRAPHY_TABLE = register("bamboo_cartography_table", createCartographyTable(Blocks.BAMBOO_PLANKS.getDefaultMapColor(), BlockSoundGroup.BAMBOO_WOOD));
	public static final Block CRIMSON_CARTOGRAPHY_TABLE = register("crimson_cartography_table", createNetherWoodCartographyTable(Blocks.CRIMSON_PLANKS.getDefaultMapColor()));
	public static final Block WARPED_CARTOGRAPHY_TABLE = register("warped_cartography_table", createNetherWoodCartographyTable(Blocks.WARPED_PLANKS.getDefaultMapColor()));
	
	public static final Block OAK_FLETCHING_TABLE = register("oak_fletching_table", createFletchingTable(Blocks.OAK_PLANKS.getDefaultMapColor()));
	public static final Block SPRUCE_FLETCHING_TABLE = register("spruce_fletching_table", createFletchingTable(Blocks.SPRUCE_PLANKS.getDefaultMapColor()));
	public static final Block BIRCH_FLETCHING_TABLE = register("birch_fletching_table", createFletchingTable(Blocks.BIRCH_PLANKS.getDefaultMapColor()));
	public static final Block JUNGLE_FLETCHING_TABLE = register("jungle_fletching_table", createFletchingTable(Blocks.JUNGLE_PLANKS.getDefaultMapColor()));
	public static final Block ACACIA_FLETCHING_TABLE = register("acacia_fletching_table", createFletchingTable(Blocks.ACACIA_PLANKS.getDefaultMapColor()));
	public static final Block DARK_OAK_FLETCHING_TABLE = register("dark_oak_fletching_table", createFletchingTable(Blocks.DARK_OAK_PLANKS.getDefaultMapColor()));
	public static final Block MANGROVE_FLETCHING_TABLE = register("mangrove_fletching_table", createFletchingTable(Blocks.MANGROVE_PLANKS.getDefaultMapColor()));
	public static final Block CHERRY_FLETCHING_TABLE = register("cherry_fletching_table", createFletchingTable(Blocks.CHERRY_PLANKS.getDefaultMapColor(), BlockSoundGroup.CHERRY_WOOD));
	public static final Block BAMBOO_FLETCHING_TABLE = register("bamboo_fletching_table", createFletchingTable(Blocks.BAMBOO_PLANKS.getDefaultMapColor(), BlockSoundGroup.BAMBOO_WOOD));
	public static final Block CRIMSON_FLETCHING_TABLE = register("crimson_fletching_table", createNetherWoodFletchingTable(Blocks.CRIMSON_PLANKS.getDefaultMapColor()));
	public static final Block WARPED_FLETCHING_TABLE = register("warped_fletching_table", createNetherWoodFletchingTable(Blocks.WARPED_PLANKS.getDefaultMapColor()));
	
	public static final Block OAK_SMITHING_TABLE = register("oak_smithing_table", createSmithingTable(Blocks.OAK_PLANKS.getDefaultMapColor()));
	public static final Block SPRUCE_SMITHING_TABLE = register("spruce_smithing_table", createSmithingTable(Blocks.SPRUCE_PLANKS.getDefaultMapColor()));
	public static final Block BIRCH_SMITHING_TABLE = register("birch_smithing_table", createSmithingTable(Blocks.BIRCH_PLANKS.getDefaultMapColor()));
	public static final Block JUNGLE_SMITHING_TABLE = register("jungle_smithing_table", createSmithingTable(Blocks.JUNGLE_PLANKS.getDefaultMapColor()));
	public static final Block ACACIA_SMITHING_TABLE = register("acacia_smithing_table", createSmithingTable(Blocks.ACACIA_PLANKS.getDefaultMapColor()));
	public static final Block DARK_OAK_SMITHING_TABLE = register("dark_oak_smithing_table", createSmithingTable(Blocks.DARK_OAK_PLANKS.getDefaultMapColor()));
	public static final Block MANGROVE_SMITHING_TABLE = register("mangrove_smithing_table", createSmithingTable(Blocks.MANGROVE_PLANKS.getDefaultMapColor()));
	public static final Block CHERRY_SMITHING_TABLE = register("cherry_smithing_table", createSmithingTable(Blocks.CHERRY_PLANKS.getDefaultMapColor(), BlockSoundGroup.CHERRY_WOOD));
	public static final Block BAMBOO_SMITHING_TABLE = register("bamboo_smithing_table", createSmithingTable(Blocks.BAMBOO_PLANKS.getDefaultMapColor(), BlockSoundGroup.BAMBOO_WOOD));
	public static final Block CRIMSON_SMITHING_TABLE = register("crimson_smithing_table", createNetherWoodSmithingTable(Blocks.CRIMSON_PLANKS.getDefaultMapColor()));
	public static final Block WARPED_SMITHING_TABLE = register("warped_smithing_table", createNetherWoodSmithingTable(Blocks.WARPED_PLANKS.getDefaultMapColor()));
	
	public static final Block OAK_COMPOSTER = register("oak_composter", createComposter(Blocks.OAK_PLANKS.getDefaultMapColor()));
	public static final Block SPRUCE_COMPOSTER = register("spruce_composter", createComposter(Blocks.SPRUCE_PLANKS.getDefaultMapColor()));
	public static final Block BIRCH_COMPOSTER = register("birch_composter", createComposter(Blocks.BIRCH_PLANKS.getDefaultMapColor()));
	public static final Block JUNGLE_COMPOSTER = register("jungle_composter", createComposter(Blocks.JUNGLE_PLANKS.getDefaultMapColor()));
	public static final Block ACACIA_COMPOSTER = register("acacia_composter", createComposter(Blocks.ACACIA_PLANKS.getDefaultMapColor()));
	public static final Block DARK_OAK_COMPOSTER = register("dark_oak_composter", createComposter(Blocks.DARK_OAK_PLANKS.getDefaultMapColor()));
	public static final Block MANGROVE_COMPOSTER = register("mangrove_composter", createComposter(Blocks.MANGROVE_PLANKS.getDefaultMapColor()));
	public static final Block CHERRY_COMPOSTER = register("cherry_composter", createComposter(Blocks.CHERRY_PLANKS.getDefaultMapColor(), BlockSoundGroup.CHERRY_WOOD));
	public static final Block BAMBOO_COMPOSTER = register("bamboo_composter", createComposter(Blocks.BAMBOO_PLANKS.getDefaultMapColor(), BlockSoundGroup.BAMBOO_WOOD));
	public static final Block CRIMSON_COMPOSTER = register("crimson_composter", createNetherWoodComposter(Blocks.CRIMSON_PLANKS.getDefaultMapColor()));
	public static final Block WARPED_COMPOSTER = register("warped_composter", createNetherWoodComposter(Blocks.WARPED_PLANKS.getDefaultMapColor()));
	
	public static final Block OAK_LECTERN = register("oak_lectern", createLectern(Blocks.OAK_PLANKS.getDefaultMapColor()));
	public static final Block SPRUCE_LECTERN = register("spruce_lectern", createLectern(Blocks.SPRUCE_PLANKS.getDefaultMapColor()));
	public static final Block BIRCH_LECTERN = register("birch_lectern", createLectern(Blocks.BIRCH_PLANKS.getDefaultMapColor()));
	public static final Block JUNGLE_LECTERN = register("jungle_lectern", createLectern(Blocks.JUNGLE_PLANKS.getDefaultMapColor()));
	public static final Block ACACIA_LECTERN = register("acacia_lectern", createLectern(Blocks.ACACIA_PLANKS.getDefaultMapColor()));
	public static final Block DARK_OAK_LECTERN = register("dark_oak_lectern", createLectern(Blocks.DARK_OAK_PLANKS.getDefaultMapColor()));
	public static final Block MANGROVE_LECTERN = register("mangrove_lectern", createLectern(Blocks.MANGROVE_PLANKS.getDefaultMapColor()));
	public static final Block CHERRY_LECTERN = register("cherry_lectern", createLectern(Blocks.CHERRY_PLANKS.getDefaultMapColor(), BlockSoundGroup.CHERRY_WOOD));
	public static final Block BAMBOO_LECTERN = register("bamboo_lectern", createLectern(Blocks.BAMBOO_PLANKS.getDefaultMapColor(), BlockSoundGroup.BAMBOO_WOOD));
	public static final Block CRIMSON_LECTERN = register("crimson_lectern", createNetherWoodLectern(Blocks.CRIMSON_PLANKS.getDefaultMapColor()));
	public static final Block WARPED_LECTERN = register("warped_lectern", createNetherWoodLectern(Blocks.WARPED_PLANKS.getDefaultMapColor()));
	
	public static final Block OAK_BARREL = register("oak_barrel", createBarrel(Blocks.OAK_PLANKS.getDefaultMapColor()));
	public static final Block SPRUCE_BARREL = register("spruce_barrel", createBarrel(Blocks.SPRUCE_PLANKS.getDefaultMapColor()));
	public static final Block BIRCH_BARREL = register("birch_barrel", createBarrel(Blocks.BIRCH_PLANKS.getDefaultMapColor()));
	public static final Block JUNGLE_BARREL = register("jungle_barrel", createBarrel(Blocks.JUNGLE_PLANKS.getDefaultMapColor()));
	public static final Block ACACIA_BARREL = register("acacia_barrel", createBarrel(Blocks.ACACIA_PLANKS.getDefaultMapColor()));
	public static final Block DARK_OAK_BARREL = register("dark_oak_barrel", createBarrel(Blocks.DARK_OAK_PLANKS.getDefaultMapColor()));
	public static final Block MANGROVE_BARREL = register("mangrove_barrel", createBarrel(Blocks.MANGROVE_PLANKS.getDefaultMapColor()));
	public static final Block CHERRY_BARREL = register("cherry_barrel", createBarrel(Blocks.CHERRY_PLANKS.getDefaultMapColor(), BlockSoundGroup.CHERRY_WOOD));
	public static final Block BAMBOO_BARREL = register("bamboo_barrel", createBarrel(Blocks.BAMBOO_PLANKS.getDefaultMapColor(), BlockSoundGroup.BAMBOO_WOOD));
	public static final Block CRIMSON_BARREL = register("crimson_barrel", createNetherWoodBarrel(Blocks.CRIMSON_PLANKS.getDefaultMapColor()));
	public static final Block WARPED_BARREL = register("warped_barrel", createNetherWoodBarrel(Blocks.WARPED_PLANKS.getDefaultMapColor()));
	
	public static final Block OAK_TRIPWIRE_HOOK = register("oak_tripwire_hook", createTripwireHook());
	public static final Block SPRUCE_TRIPWIRE_HOOK = register("spruce_tripwire_hook", createTripwireHook());
	public static final Block BIRCH_TRIPWIRE_HOOK = register("birch_tripwire_hook", createTripwireHook());
	public static final Block JUNGLE_TRIPWIRE_HOOK = register("jungle_tripwire_hook", createTripwireHook());
	public static final Block ACACIA_TRIPWIRE_HOOK = register("acacia_tripwire_hook", createTripwireHook());
	public static final Block DARK_OAK_TRIPWIRE_HOOK = register("dark_oak_tripwire_hook", createTripwireHook());
	public static final Block MANGROVE_TRIPWIRE_HOOK = register("mangrove_tripwire_hook", createTripwireHook());
	public static final Block CHERRY_TRIPWIRE_HOOK = register("cherry_tripwire_hook", createTripwireHook(BlockSoundGroup.CHERRY_WOOD));
	public static final Block BAMBOO_TRIPWIRE_HOOK = register("bamboo_tripwire_hook", createTripwireHook(BlockSoundGroup.BAMBOO_WOOD));
	public static final Block CRIMSON_TRIPWIRE_HOOK = register("crimson_tripwire_hook", createTripwireHook(BlockSoundGroup.NETHER_WOOD));
	public static final Block WARPED_TRIPWIRE_HOOK = register("warped_tripwire_hook", createTripwireHook(BlockSoundGroup.NETHER_WOOD));
	
	public static final Block OAK_BEEHIVE = register("oak_beehive", createBeehive(Blocks.OAK_PLANKS.getDefaultMapColor()));
	public static final Block SPRUCE_BEEHIVE = register("spruce_beehive", createBeehive(Blocks.SPRUCE_PLANKS.getDefaultMapColor()));
	public static final Block BIRCH_BEEHIVE = register("birch_beehive", createBeehive(Blocks.BIRCH_PLANKS.getDefaultMapColor()));
	public static final Block JUNGLE_BEEHIVE = register("jungle_beehive", createBeehive(Blocks.JUNGLE_PLANKS.getDefaultMapColor()));
	public static final Block ACACIA_BEEHIVE = register("acacia_beehive", createBeehive(Blocks.ACACIA_PLANKS.getDefaultMapColor()));
	public static final Block DARK_OAK_BEEHIVE = register("dark_oak_beehive", createBeehive(Blocks.DARK_OAK_PLANKS.getDefaultMapColor()));
	public static final Block MANGROVE_BEEHIVE = register("mangrove_beehive", createBeehive(Blocks.MANGROVE_PLANKS.getDefaultMapColor()));
	public static final Block CHERRY_BEEHIVE = register("cherry_beehive", createBeehive(Blocks.CHERRY_PLANKS.getDefaultMapColor(), BlockSoundGroup.CHERRY_WOOD));
	public static final Block BAMBOO_BEEHIVE = register("bamboo_beehive", createBeehive(Blocks.BAMBOO_PLANKS.getDefaultMapColor(), BlockSoundGroup.BAMBOO_WOOD));
	public static final Block CRIMSON_BEEHIVE = register("crimson_beehive", createNetherWoodBeehive(Blocks.CRIMSON_PLANKS.getDefaultMapColor()));
	public static final Block WARPED_BEEHIVE = register("warped_beehive", createNetherWoodBeehive(Blocks.WARPED_PLANKS.getDefaultMapColor()));
	
	public static final Block OAK_CHISELED_BOOKSHELF = register("oak_chiseled_bookshelf", createChiseledBookshelf(Blocks.OAK_PLANKS.getDefaultMapColor()));
	public static final Block SPRUCE_CHISELED_BOOKSHELF = register("spruce_chiseled_bookshelf", createChiseledBookshelf(Blocks.SPRUCE_PLANKS.getDefaultMapColor()));
	public static final Block BIRCH_CHISELED_BOOKSHELF = register("birch_chiseled_bookshelf", createChiseledBookshelf(Blocks.BIRCH_PLANKS.getDefaultMapColor()));
	public static final Block JUNGLE_CHISELED_BOOKSHELF = register("jungle_chiseled_bookshelf", createChiseledBookshelf(Blocks.JUNGLE_PLANKS.getDefaultMapColor()));
	public static final Block ACACIA_CHISELED_BOOKSHELF = register("acacia_chiseled_bookshelf", createChiseledBookshelf(Blocks.ACACIA_PLANKS.getDefaultMapColor()));
	public static final Block DARK_OAK_CHISELED_BOOKSHELF = register("dark_oak_chiseled_bookshelf", createChiseledBookshelf(Blocks.DARK_OAK_PLANKS.getDefaultMapColor()));
	public static final Block MANGROVE_CHISELED_BOOKSHELF = register("mangrove_chiseled_bookshelf", createChiseledBookshelf(Blocks.MANGROVE_PLANKS.getDefaultMapColor()));
	public static final Block CHERRY_CHISELED_BOOKSHELF = register("cherry_chiseled_bookshelf", createChiseledBookshelf(Blocks.CHERRY_PLANKS.getDefaultMapColor()));
	public static final Block BAMBOO_CHISELED_BOOKSHELF = register("bamboo_chiseled_bookshelf", createChiseledBookshelf(Blocks.BAMBOO_PLANKS.getDefaultMapColor()));
	public static final Block CRIMSON_CHISELED_BOOKSHELF = register("crimson_chiseled_bookshelf", createNetherWoodChiseledBookshelf(Blocks.CRIMSON_PLANKS.getDefaultMapColor()));
	public static final Block WARPED_CHISELED_BOOKSHELF = register("warped_chiseled_bookshelf", createNetherWoodChiseledBookshelf(Blocks.WARPED_PLANKS.getDefaultMapColor()));
	
	public static final Block OAK_CHEST = register("oak_chest", createChestBlock(WoodType.OAK, Blocks.OAK_PLANKS.getDefaultMapColor()));
	public static final Block SPRUCE_CHEST = register("spruce_chest", createChestBlock(WoodType.SPRUCE, Blocks.SPRUCE_PLANKS.getDefaultMapColor()));
	public static final Block BIRCH_CHEST = register("birch_chest", createChestBlock(WoodType.BIRCH, Blocks.BIRCH_PLANKS.getDefaultMapColor()));
	public static final Block JUNGLE_CHEST = register("jungle_chest", createChestBlock(WoodType.JUNGLE, Blocks.JUNGLE_PLANKS.getDefaultMapColor()));
	public static final Block ACACIA_CHEST = register("acacia_chest", createChestBlock(WoodType.ACACIA, Blocks.ACACIA_PLANKS.getDefaultMapColor()));
	public static final Block DARK_OAK_CHEST = register("dark_oak_chest", createChestBlock(WoodType.DARK_OAK, Blocks.DARK_OAK_PLANKS.getDefaultMapColor()));
	public static final Block MANGROVE_CHEST = register("mangrove_chest", createChestBlock(WoodType.MANGROVE, Blocks.MANGROVE_PLANKS.getDefaultMapColor()));
	public static final Block CHERRY_CHEST = register("cherry_chest", createChestBlock(WoodType.CHERRY, Blocks.CHERRY_PLANKS.getDefaultMapColor(), BlockSoundGroup.CHERRY_WOOD));
	public static final Block BAMBOO_CHEST = register("bamboo_chest", createChestBlock(WoodType.BAMBOO, Blocks.BAMBOO_PLANKS.getDefaultMapColor(), BlockSoundGroup.BAMBOO_WOOD));
	public static final Block CRIMSON_CHEST = register("crimson_chest", createNetherWoodChestBlock(WoodType.CRIMSON, Blocks.CRIMSON_PLANKS.getDefaultMapColor()));
	public static final Block WARPED_CHEST = register("warped_chest", createNetherWoodChestBlock(WoodType.WARPED, Blocks.WARPED_PLANKS.getDefaultMapColor()));
	
	public static final Block OAK_TRAPPED_CHEST = register("oak_trapped_chest", createTrappedChestBlock(WoodType.OAK, Blocks.OAK_PLANKS.getDefaultMapColor()));
	public static final Block SPRUCE_TRAPPED_CHEST = register("spruce_trapped_chest", createTrappedChestBlock(WoodType.SPRUCE, Blocks.SPRUCE_PLANKS.getDefaultMapColor()));
	public static final Block BIRCH_TRAPPED_CHEST = register("birch_trapped_chest", createTrappedChestBlock(WoodType.BIRCH, Blocks.BIRCH_PLANKS.getDefaultMapColor()));
	public static final Block JUNGLE_TRAPPED_CHEST = register("jungle_trapped_chest", createTrappedChestBlock(WoodType.JUNGLE, Blocks.JUNGLE_PLANKS.getDefaultMapColor()));
	public static final Block ACACIA_TRAPPED_CHEST = register("acacia_trapped_chest", createTrappedChestBlock(WoodType.ACACIA, Blocks.ACACIA_PLANKS.getDefaultMapColor()));
	public static final Block DARK_OAK_TRAPPED_CHEST = register("dark_oak_trapped_chest", createTrappedChestBlock(WoodType.DARK_OAK, Blocks.DARK_OAK_PLANKS.getDefaultMapColor()));
	public static final Block MANGROVE_TRAPPED_CHEST = register("mangrove_trapped_chest", createTrappedChestBlock(WoodType.MANGROVE, Blocks.MANGROVE_PLANKS.getDefaultMapColor()));
	public static final Block CHERRY_TRAPPED_CHEST = register("cherry_trapped_chest", createTrappedChestBlock(WoodType.CHERRY, Blocks.CHERRY_PLANKS.getDefaultMapColor(), BlockSoundGroup.CHERRY_WOOD));
	public static final Block BAMBOO_TRAPPED_CHEST = register("bamboo_trapped_chest", createTrappedChestBlock(WoodType.BAMBOO, Blocks.BAMBOO_PLANKS.getDefaultMapColor(), BlockSoundGroup.BAMBOO_WOOD));
	public static final Block CRIMSON_TRAPPED_CHEST = register("crimson_trapped_chest", createNetherWoodTrappedChestBlock(WoodType.CRIMSON, Blocks.CRIMSON_PLANKS.getDefaultMapColor()));
	public static final Block WARPED_TRAPPED_CHEST = register("warped_trapped_chest", createNetherWoodTrappedChestBlock(WoodType.WARPED, Blocks.WARPED_PLANKS.getDefaultMapColor()));
	
	public static final Block GOLD_CAULDRON = register("gold_cauldron", new AquiferCauldronBlock(SSWPCauldronGroups.GOLD, AbstractBlock.Settings.create().mapColor(MapColor.GOLD).requiresTool().strength(1.2f).nonOpaque()));
	public static final Block GOLD_WATER_CAULDRON = register("gold_water_cauldron", new AquiferWaterCauldronBlock(SSWPCauldronGroups.GOLD, AbstractBlock.Settings.copy(GOLD_CAULDRON)));
	public static final Block GOLD_LAVA_CAULDRON = register("gold_lava_cauldron", new AquiferLavaCauldronBlock(SSWPCauldronGroups.GOLD, AbstractBlock.Settings.copy(GOLD_CAULDRON).luminance(state -> 15)));
	public static final Block GOLD_POWDER_SNOW_CAULDRON = register("gold_powder_snow_cauldron", new AquiferPowderSnowCauldronBlock(SSWPCauldronGroups.GOLD, AbstractBlock.Settings.copy(GOLD_CAULDRON)));
	
	public static final Block NETHERITE_CAULDRON = register("netherite_cauldron", new AquiferCauldronBlock(SSWPCauldronGroups.NETHERITE, AbstractBlock.Settings.create().mapColor(MapColor.BLACK).sounds(BlockSoundGroup.NETHERITE).requiresTool().strength(20.0f, 480.0f).nonOpaque()));
	public static final Block NETHERITE_WATER_CAULDRON = register("netherite_water_cauldron", new AquiferWaterCauldronBlock(SSWPCauldronGroups.NETHERITE, AbstractBlock.Settings.copy(NETHERITE_CAULDRON)));
	public static final Block NETHERITE_LAVA_CAULDRON = register("netherite_lava_cauldron", new AquiferLavaCauldronBlock(SSWPCauldronGroups.NETHERITE, AbstractBlock.Settings.copy(NETHERITE_CAULDRON).luminance(state -> 15)));
	public static final Block NETHERITE_POWDER_SNOW_CAULDRON = register("netherite_powder_snow_cauldron", new AquiferPowderSnowCauldronBlock(SSWPCauldronGroups.NETHERITE, AbstractBlock.Settings.copy(NETHERITE_CAULDRON)));
	
	public static final Block COPPER_CAULDRON = register("copper_cauldron", new OxidizableCauldronBlock(Oxidizable.OxidationLevel.UNAFFECTED, SSWPCauldronGroups.COPPER, AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).sounds(BlockSoundGroup.COPPER).requiresTool().strength(1.2f).nonOpaque()));
	public static final Block COPPER_WATER_CAULDRON = register("copper_water_cauldron", new OxidizableWaterCauldronBlock(Oxidizable.OxidationLevel.UNAFFECTED, SSWPCauldronGroups.COPPER, AbstractBlock.Settings.copy(COPPER_CAULDRON)));
	public static final Block COPPER_LAVA_CAULDRON = register("copper_lava_cauldron", new OxidizableLavaCauldronBlock(Oxidizable.OxidationLevel.UNAFFECTED, SSWPCauldronGroups.COPPER, AbstractBlock.Settings.copy(COPPER_CAULDRON).luminance(state -> 15)));
	public static final Block COPPER_POWDER_SNOW_CAULDRON = register("copper_powder_snow_cauldron", new OxidizablePowderSnowCauldronBlock(Oxidizable.OxidationLevel.UNAFFECTED, SSWPCauldronGroups.COPPER, AbstractBlock.Settings.copy(COPPER_CAULDRON)));
	public static final Block EXPOSED_COPPER_CAULDRON = register("exposed_copper_cauldron", new OxidizableCauldronBlock(Oxidizable.OxidationLevel.EXPOSED, SSWPCauldronGroups.EXPOSED_COPPER, AbstractBlock.Settings.copy(COPPER_CAULDRON).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));
	public static final Block EXPOSED_COPPER_WATER_CAULDRON = register("exposed_copper_water_cauldron", new OxidizableWaterCauldronBlock(Oxidizable.OxidationLevel.EXPOSED, SSWPCauldronGroups.EXPOSED_COPPER, AbstractBlock.Settings.copy(EXPOSED_COPPER_CAULDRON)));
	public static final Block EXPOSED_COPPER_LAVA_CAULDRON = register("exposed_copper_lava_cauldron", new OxidizableLavaCauldronBlock(Oxidizable.OxidationLevel.EXPOSED, SSWPCauldronGroups.EXPOSED_COPPER, AbstractBlock.Settings.copy(EXPOSED_COPPER_CAULDRON).luminance(state -> 15)));
	public static final Block EXPOSED_COPPER_POWDER_SNOW_CAULDRON = register("exposed_copper_powder_snow_cauldron", new OxidizablePowderSnowCauldronBlock(Oxidizable.OxidationLevel.EXPOSED, SSWPCauldronGroups.EXPOSED_COPPER, AbstractBlock.Settings.copy(EXPOSED_COPPER_CAULDRON)));
	public static final Block WEATHERED_COPPER_CAULDRON = register("weathered_copper_cauldron", new OxidizableCauldronBlock(Oxidizable.OxidationLevel.WEATHERED, SSWPCauldronGroups.WEATHERED_COPPER, AbstractBlock.Settings.copy(COPPER_CAULDRON).mapColor(MapColor.DARK_AQUA)));
	public static final Block WEATHERED_COPPER_WATER_CAULDRON = register("weathered_copper_water_cauldron", new OxidizableWaterCauldronBlock(Oxidizable.OxidationLevel.WEATHERED, SSWPCauldronGroups.WEATHERED_COPPER, AbstractBlock.Settings.copy(WEATHERED_COPPER_CAULDRON)));
	public static final Block WEATHERED_COPPER_LAVA_CAULDRON = register("weathered_copper_lava_cauldron", new OxidizableLavaCauldronBlock(Oxidizable.OxidationLevel.WEATHERED, SSWPCauldronGroups.WEATHERED_COPPER, AbstractBlock.Settings.copy(WEATHERED_COPPER_CAULDRON).luminance(state -> 15)));
	public static final Block WEATHERED_COPPER_POWDER_SNOW_CAULDRON = register("weathered_copper_powder_snow_cauldron", new OxidizablePowderSnowCauldronBlock(Oxidizable.OxidationLevel.WEATHERED, SSWPCauldronGroups.WEATHERED_COPPER, AbstractBlock.Settings.copy(WEATHERED_COPPER_CAULDRON)));
	public static final Block OXIDIZED_COPPER_CAULDRON = register("oxidized_copper_cauldron", new OxidizableCauldronBlock(Oxidizable.OxidationLevel.OXIDIZED, SSWPCauldronGroups.OXIDIZED_COPPER, AbstractBlock.Settings.copy(COPPER_CAULDRON).mapColor(MapColor.TEAL)));
	public static final Block OXIDIZED_COPPER_WATER_CAULDRON = register("oxidized_copper_water_cauldron", new OxidizableWaterCauldronBlock(Oxidizable.OxidationLevel.OXIDIZED, SSWPCauldronGroups.OXIDIZED_COPPER, AbstractBlock.Settings.copy(OXIDIZED_COPPER_CAULDRON)));
	public static final Block OXIDIZED_COPPER_LAVA_CAULDRON = register("oxidized_copper_lava_cauldron", new OxidizableLavaCauldronBlock(Oxidizable.OxidationLevel.OXIDIZED, SSWPCauldronGroups.OXIDIZED_COPPER, AbstractBlock.Settings.copy(OXIDIZED_COPPER_CAULDRON).luminance(state -> 15)));
	public static final Block OXIDIZED_COPPER_POWDER_SNOW_CAULDRON = register("oxidized_copper_powder_snow_cauldron", new OxidizablePowderSnowCauldronBlock(Oxidizable.OxidationLevel.OXIDIZED, SSWPCauldronGroups.OXIDIZED_COPPER, AbstractBlock.Settings.copy(OXIDIZED_COPPER_CAULDRON)));
	public static final Block WAXED_COPPER_CAULDRON = register("waxed_copper_cauldron", new AquiferCauldronBlock(SSWPCauldronGroups.WAXED_COPPER, AbstractBlock.Settings.copy(COPPER_CAULDRON)));
	public static final Block WAXED_COPPER_WATER_CAULDRON = register("waxed_copper_water_cauldron", new AquiferWaterCauldronBlock(SSWPCauldronGroups.WAXED_COPPER, AbstractBlock.Settings.copy(COPPER_WATER_CAULDRON)));
	public static final Block WAXED_COPPER_LAVA_CAULDRON = register("waxed_copper_lava_cauldron", new AquiferLavaCauldronBlock(SSWPCauldronGroups.WAXED_COPPER, AbstractBlock.Settings.copy(COPPER_LAVA_CAULDRON)));
	public static final Block WAXED_COPPER_POWDER_SNOW_CAULDRON = register("waxed_copper_powder_snow_cauldron", new AquiferPowderSnowCauldronBlock(SSWPCauldronGroups.WAXED_COPPER, AbstractBlock.Settings.copy(COPPER_POWDER_SNOW_CAULDRON)));
	public static final Block WAXED_EXPOSED_COPPER_CAULDRON = register("waxed_exposed_copper_cauldron", new AquiferCauldronBlock(SSWPCauldronGroups.WAXED_EXPOSED_COPPER, AbstractBlock.Settings.copy(EXPOSED_COPPER_CAULDRON)));
	public static final Block WAXED_EXPOSED_COPPER_WATER_CAULDRON = register("waxed_exposed_copper_water_cauldron", new AquiferWaterCauldronBlock(SSWPCauldronGroups.WAXED_EXPOSED_COPPER, AbstractBlock.Settings.copy(EXPOSED_COPPER_WATER_CAULDRON)));
	public static final Block WAXED_EXPOSED_COPPER_LAVA_CAULDRON = register("waxed_exposed_copper_lava_cauldron", new AquiferLavaCauldronBlock(SSWPCauldronGroups.WAXED_EXPOSED_COPPER, AbstractBlock.Settings.copy(EXPOSED_COPPER_LAVA_CAULDRON)));
	public static final Block WAXED_EXPOSED_COPPER_POWDER_SNOW_CAULDRON = register("waxed_exposed_copper_powder_snow_cauldron", new AquiferPowderSnowCauldronBlock(SSWPCauldronGroups.WAXED_EXPOSED_COPPER, AbstractBlock.Settings.copy(EXPOSED_COPPER_POWDER_SNOW_CAULDRON)));
	public static final Block WAXED_WEATHERED_COPPER_CAULDRON = register("waxed_weathered_copper_cauldron", new AquiferCauldronBlock(SSWPCauldronGroups.WAXED_WEATHERED_COPPER, AbstractBlock.Settings.copy(WEATHERED_COPPER_CAULDRON)));
	public static final Block WAXED_WEATHERED_COPPER_WATER_CAULDRON = register("waxed_weathered_copper_water_cauldron", new AquiferWaterCauldronBlock(SSWPCauldronGroups.WAXED_WEATHERED_COPPER, AbstractBlock.Settings.copy(WEATHERED_COPPER_WATER_CAULDRON)));
	public static final Block WAXED_WEATHERED_COPPER_LAVA_CAULDRON = register("waxed_weathered_copper_lava_cauldron", new AquiferLavaCauldronBlock(SSWPCauldronGroups.WAXED_WEATHERED_COPPER, AbstractBlock.Settings.copy(WEATHERED_COPPER_LAVA_CAULDRON)));
	public static final Block WAXED_WEATHERED_COPPER_POWDER_SNOW_CAULDRON = register("waxed_weathered_copper_powder_snow_cauldron", new AquiferPowderSnowCauldronBlock(SSWPCauldronGroups.WAXED_WEATHERED_COPPER, AbstractBlock.Settings.copy(WEATHERED_COPPER_POWDER_SNOW_CAULDRON)));
	public static final Block WAXED_OXIDIZED_COPPER_CAULDRON = register("waxed_oxidized_copper_cauldron", new AquiferCauldronBlock(SSWPCauldronGroups.WAXED_OXIDIZED_COPPER, AbstractBlock.Settings.copy(OXIDIZED_COPPER_CAULDRON)));
	public static final Block WAXED_OXIDIZED_COPPER_WATER_CAULDRON = register("waxed_oxidized_copper_water_cauldron", new AquiferWaterCauldronBlock(SSWPCauldronGroups.WAXED_OXIDIZED_COPPER, AbstractBlock.Settings.copy(OXIDIZED_COPPER_WATER_CAULDRON)));
	public static final Block WAXED_OXIDIZED_COPPER_LAVA_CAULDRON = register("waxed_oxidized_copper_lava_cauldron", new AquiferLavaCauldronBlock(SSWPCauldronGroups.WAXED_OXIDIZED_COPPER, AbstractBlock.Settings.copy(OXIDIZED_COPPER_LAVA_CAULDRON)));
	public static final Block WAXED_OXIDIZED_COPPER_POWDER_SNOW_CAULDRON = register("waxed_oxidized_copper_powder_snow_cauldron", new AquiferPowderSnowCauldronBlock(SSWPCauldronGroups.WAXED_OXIDIZED_COPPER, AbstractBlock.Settings.copy(OXIDIZED_COPPER_POWDER_SNOW_CAULDRON)));
	
	public static final Block GOLD_LANTERN = register("gold_lantern", new LanternBlock(AbstractBlock.Settings.create().mapColor(MapColor.GOLD).solid().requiresTool().strength(2.1f).sounds(BlockSoundGroup.LANTERN).luminance(state -> 15).nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));
	public static final Block GOLD_SOUL_LANTERN = register("gold_soul_lantern", new LanternBlock(AbstractBlock.Settings.create().mapColor(MapColor.GOLD).solid().requiresTool().strength(2.1f).sounds(BlockSoundGroup.LANTERN).luminance(state -> 10).nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));
	
	public static final Block NETHERITE_LANTERN = register("netherite_lantern", new LanternBlock(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).solid().requiresTool().strength(35.0f, 840.0f).sounds(BlockSoundGroup.LANTERN).luminance(state -> 15).nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));
	public static final Block NETHERITE_SOUL_LANTERN = register("netherite_soul_lantern", new LanternBlock(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).solid().requiresTool().strength(35.0f, 840.0f).sounds(BlockSoundGroup.LANTERN).luminance(state -> 10).nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));
	
	public static final Block COPPER_LANTERN = register("copper_lantern", new OxidizableLanternBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).solid().requiresTool().strength(2.1f).sounds(BlockSoundGroup.COPPER).luminance(state -> 15).nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));
	public static final Block COPPER_SOUL_LANTERN = register("copper_soul_lantern", new OxidizableLanternBlock(Oxidizable.OxidationLevel.UNAFFECTED, AbstractBlock.Settings.create().mapColor(MapColor.ORANGE).solid().requiresTool().strength(2.1f).sounds(BlockSoundGroup.COPPER).luminance(state -> 10).nonOpaque().pistonBehavior(PistonBehavior.DESTROY)));
	public static final Block EXPOSED_COPPER_LANTERN = register("exposed_copper_lantern", new OxidizableLanternBlock(Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(COPPER_LANTERN).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));
	public static final Block EXPOSED_COPPER_SOUL_LANTERN = register("exposed_copper_soul_lantern", new OxidizableLanternBlock(Oxidizable.OxidationLevel.EXPOSED, AbstractBlock.Settings.copy(COPPER_SOUL_LANTERN).mapColor(MapColor.TERRACOTTA_LIGHT_GRAY)));
	public static final Block WEATHERED_COPPER_LANTERN = register("weathered_copper_lantern", new OxidizableLanternBlock(Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(COPPER_LANTERN).mapColor(MapColor.DARK_AQUA)));
	public static final Block WEATHERED_COPPER_SOUL_LANTERN = register("weathered_copper_soul_lantern", new OxidizableLanternBlock(Oxidizable.OxidationLevel.WEATHERED, AbstractBlock.Settings.copy(COPPER_SOUL_LANTERN).mapColor(MapColor.DARK_AQUA)));
	public static final Block OXIDIZED_COPPER_LANTERN = register("oxidized_copper_lantern", new OxidizableLanternBlock(Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(COPPER_LANTERN).mapColor(MapColor.TEAL)));
	public static final Block OXIDIZED_COPPER_SOUL_LANTERN = register("oxidized_copper_soul_lantern", new OxidizableLanternBlock(Oxidizable.OxidationLevel.OXIDIZED, AbstractBlock.Settings.copy(COPPER_SOUL_LANTERN).mapColor(MapColor.TEAL)));
	public static final Block WAXED_COPPER_LANTERN = register("waxed_copper_lantern", new LanternBlock(AbstractBlock.Settings.copy(COPPER_LANTERN)));
	public static final Block WAXED_COPPER_SOUL_LANTERN = register("waxed_copper_soul_lantern", new LanternBlock(AbstractBlock.Settings.copy(COPPER_SOUL_LANTERN)));
	public static final Block WAXED_EXPOSED_COPPER_LANTERN = register("waxed_exposed_copper_lantern", new LanternBlock(AbstractBlock.Settings.copy(EXPOSED_COPPER_LANTERN)));
	public static final Block WAXED_EXPOSED_COPPER_SOUL_LANTERN = register("waxed_exposed_copper_soul_lantern", new LanternBlock(AbstractBlock.Settings.copy(EXPOSED_COPPER_SOUL_LANTERN)));
	public static final Block WAXED_WEATHERED_COPPER_LANTERN = register("waxed_weathered_copper_lantern", new LanternBlock(AbstractBlock.Settings.copy(WEATHERED_COPPER_LANTERN)));
	public static final Block WAXED_WEATHERED_COPPER_SOUL_LANTERN = register("waxed_weathered_copper_soul_lantern", new LanternBlock(AbstractBlock.Settings.copy(WEATHERED_COPPER_SOUL_LANTERN)));
	public static final Block WAXED_OXIDIZED_COPPER_LANTERN = register("waxed_oxidized_copper_lantern", new LanternBlock(AbstractBlock.Settings.copy(OXIDIZED_COPPER_LANTERN)));
	public static final Block WAXED_OXIDIZED_COPPER_SOUL_LANTERN = register("waxed_oxidized_copper_soul_lantern", new LanternBlock(AbstractBlock.Settings.copy(OXIDIZED_COPPER_SOUL_LANTERN)));
	
	public static final Block NETHERITE_ANVIL = register("netherite_anvil", new NetheriteAnvilBlock(AbstractBlock.Settings.create().mapColor(MapColor.BLACK).requiresTool().strength(50.0f, 1200.0f).sounds(SSWPBlockSoundGroups.NETHERITE_ANVIL).pistonBehavior(PistonBehavior.BLOCK)));
	
	public static Block register(String name, Block block) {
		return Registry.register(Registries.BLOCK, Identifier.of(SSWPlus.MOD_ID, name), block);
	}
	
	@SuppressWarnings("deprecation")
	public static Block createLeavesSlabBlock(Block template) {
		return new LeafSlabBlock(AbstractBlock.Settings.copyShallow(template).suffocates(Blocks::never).blockVision(Blocks::never).solidBlock(Blocks::never).allowsSpawning(SSWPBlocks::canSpawnOnLeavesAndIsNotBottomSlab));
	}
	
	@SuppressWarnings("deprecation")
	public static Block createLeavesStairsBlock(Block template) {
		return new LeafStairsBlock(template.getDefaultState(), AbstractBlock.Settings.copyShallow(template).allowsSpawning(SSWPBlocks::canSpawnOnLeavesAndIsTopHalf));
	}
	
	@SuppressWarnings("deprecation")
	public static Block createLeavesWallBlock(Block template) {
		return new LeafWallBlock(AbstractBlock.Settings.copyShallow(template).solid());
	}
	
	public static Block createLadder() {
		return createLadder(BlockSoundGroup.LADDER);
	}
	
	@SuppressWarnings("deprecation")
	public static Block createLadder(BlockSoundGroup sounds) {
		return new LadderBlock(AbstractBlock.Settings.create().notSolid().strength(0.4f).sounds(sounds).nonOpaque().pistonBehavior(PistonBehavior.DESTROY).burnable());
	}
	
	@SuppressWarnings("deprecation")
	public static Block createNetherWoodLadder() {
		return new LadderBlock(AbstractBlock.Settings.create().notSolid().strength(0.4f).sounds(SSWPBlockSoundGroups.NETHER_WOOD_LADDER).nonOpaque().pistonBehavior(PistonBehavior.DESTROY));
	}
	
	public static Block createBookshelf(MapColor mapColor) {
		return createBookshelf(mapColor, BlockSoundGroup.WOOD);
	}
	
	public static Block createBookshelf(MapColor mapColor, BlockSoundGroup sounds) {
		return new Block(AbstractBlock.Settings.create().mapColor(mapColor).instrument(NoteBlockInstrument.BASS).strength(1.5F).sounds(sounds).burnable());
	}
	
	public static Block createNetherWoodBookshelf(MapColor mapColor) {
		return new Block(AbstractBlock.Settings.create().mapColor(mapColor).instrument(NoteBlockInstrument.BASS).strength(1.5f).sounds(BlockSoundGroup.NETHER_WOOD));
	}
	
	public static Block createCraftingTable(MapColor mapColor) {
		return createCraftingTable(mapColor, BlockSoundGroup.WOOD);
	}
	
	public static Block createCraftingTable(MapColor mapColor, BlockSoundGroup sounds) {
		return new CraftingTableBlock(AbstractBlock.Settings.create().mapColor(mapColor).instrument(NoteBlockInstrument.BASS).strength(2.5f).sounds(sounds).burnable());
	}
	
	public static Block createNetherWoodCraftingTable(MapColor mapColor) {
		return new CraftingTableBlock(AbstractBlock.Settings.create().mapColor(mapColor).instrument(NoteBlockInstrument.BASS).strength(2.5f).sounds(BlockSoundGroup.NETHER_WOOD));
	}
	
	public static Block createLoom(MapColor mapColor) {
		return createLoom(mapColor, BlockSoundGroup.WOOD);
	}
	
	public static Block createLoom(MapColor mapColor, BlockSoundGroup sounds) {
		return new LoomBlock(AbstractBlock.Settings.create().mapColor(mapColor).instrument(NoteBlockInstrument.BASS).strength(2.5f).sounds(sounds).burnable());
	}
	
	public static Block createNetherWoodLoom(MapColor mapColor) {
		return new LoomBlock(AbstractBlock.Settings.create().mapColor(mapColor).instrument(NoteBlockInstrument.BASS).strength(2.5f).sounds(BlockSoundGroup.NETHER_WOOD));
	}
	
	public static Block createCartographyTable(MapColor mapColor) {
		return createCartographyTable(mapColor, BlockSoundGroup.WOOD);
	}
	
	public static Block createCartographyTable(MapColor mapColor, BlockSoundGroup sounds) {
		return new CartographyTableBlock(AbstractBlock.Settings.create().mapColor(mapColor).instrument(NoteBlockInstrument.BASS).strength(2.5f).sounds(sounds).burnable());
	}
	
	public static Block createNetherWoodCartographyTable(MapColor mapColor) {
		return new CartographyTableBlock(AbstractBlock.Settings.create().mapColor(mapColor).instrument(NoteBlockInstrument.BASS).strength(2.5f).sounds(BlockSoundGroup.NETHER_WOOD));
	}
	
	public static Block createFletchingTable(MapColor mapColor) {
		return createFletchingTable(mapColor, BlockSoundGroup.WOOD);
	}
	
	public static Block createFletchingTable(MapColor mapColor, BlockSoundGroup sounds) {
		return new FletchingTableBlock(AbstractBlock.Settings.create().mapColor(mapColor).instrument(NoteBlockInstrument.BASS).strength(2.5f).sounds(sounds).burnable());
	}
	
	public static Block createNetherWoodFletchingTable(MapColor mapColor) {
		return new FletchingTableBlock(AbstractBlock.Settings.create().mapColor(mapColor).instrument(NoteBlockInstrument.BASS).strength(2.5f).sounds(BlockSoundGroup.NETHER_WOOD));
	}
	
	public static Block createSmithingTable(MapColor mapColor) {
		return createSmithingTable(mapColor, BlockSoundGroup.WOOD);
	}
	
	public static Block createSmithingTable(MapColor mapColor, BlockSoundGroup sounds) {
		return new SmithingTableBlock(AbstractBlock.Settings.create().mapColor(mapColor).instrument(NoteBlockInstrument.BASS).strength(2.5f).sounds(sounds).burnable());
	}
	
	public static Block createNetherWoodSmithingTable(MapColor mapColor) {
		return new SmithingTableBlock(AbstractBlock.Settings.create().mapColor(mapColor).instrument(NoteBlockInstrument.BASS).strength(2.5f).sounds(BlockSoundGroup.NETHER_WOOD));
	}
	
	public static Block createBeehive(MapColor mapColor) {
		return createBeehive(mapColor, BlockSoundGroup.WOOD);
	}
	
	public static Block createBeehive(MapColor mapColor, BlockSoundGroup sounds) {
		return new BeehiveBlock(AbstractBlock.Settings.create().mapColor(mapColor).instrument(NoteBlockInstrument.BASS).strength(0.6f).sounds(sounds).burnable());
	}
	
	public static Block createNetherWoodBeehive(MapColor mapColor) {
		return new BeehiveBlock(AbstractBlock.Settings.create().mapColor(mapColor).instrument(NoteBlockInstrument.BASS).strength(0.6f).sounds(BlockSoundGroup.NETHER_WOOD));
	}
	
	public static Block createLectern(MapColor mapColor) {
		return createLectern(mapColor, BlockSoundGroup.WOOD);
	}
	
	public static Block createLectern(MapColor mapColor, BlockSoundGroup sounds) {
		return new LecternBlock(AbstractBlock.Settings.create().mapColor(mapColor).instrument(NoteBlockInstrument.BASS).strength(2.5f).sounds(sounds).burnable());
	}
	
	public static Block createNetherWoodLectern(MapColor mapColor) {
		return new LecternBlock(AbstractBlock.Settings.create().mapColor(mapColor).instrument(NoteBlockInstrument.BASS).strength(2.5f).sounds(BlockSoundGroup.NETHER_WOOD));
	}
	
	public static Block createComposter(MapColor mapColor) {
		return createComposter(mapColor, BlockSoundGroup.WOOD);
	}
	
	public static Block createComposter(MapColor mapColor, BlockSoundGroup sounds) {
		return new ComposterBlock(AbstractBlock.Settings.create().mapColor(mapColor).instrument(NoteBlockInstrument.BASS).strength(0.6f).sounds(sounds).burnable());
	}
	
	public static Block createNetherWoodComposter(MapColor mapColor) {
		return new ComposterBlock(AbstractBlock.Settings.create().mapColor(mapColor).instrument(NoteBlockInstrument.BASS).strength(0.6f).sounds(BlockSoundGroup.NETHER_WOOD));
	}
	
	public static Block createBarrel(MapColor mapColor) {
		return createBarrel(mapColor, BlockSoundGroup.WOOD);
	}
	
	public static Block createBarrel(MapColor mapColor, BlockSoundGroup sounds) {
		return new BarrelBlock(AbstractBlock.Settings.create().mapColor(mapColor).instrument(NoteBlockInstrument.BASS).strength(2.5f).sounds(sounds).burnable());
	}
	
	public static Block createNetherWoodBarrel(MapColor mapColor) {
		return new BarrelBlock(AbstractBlock.Settings.create().mapColor(mapColor).instrument(NoteBlockInstrument.BASS).strength(2.5f).sounds(BlockSoundGroup.NETHER_WOOD));
	}
	
	public static Block createTripwireHook() {
		return createTripwireHook(BlockSoundGroup.WOOD);
	}
	
	public static Block createTripwireHook(BlockSoundGroup sounds) {
		return new TripwireHookBlock(AbstractBlock.Settings.create().noCollision().sounds(sounds).pistonBehavior(PistonBehavior.DESTROY));
	}
	
	public static Block createChiseledBookshelf(MapColor mapColor) {
		return createChiseledBookshelf(mapColor, BlockSoundGroup.CHISELED_BOOKSHELF);
	}
	
	public static Block createChiseledBookshelf(MapColor mapColor, BlockSoundGroup sounds) {
		return new ChiseledBookshelfBlock(AbstractBlock.Settings.create().mapColor(mapColor).instrument(NoteBlockInstrument.BASS).strength(1.5f).sounds(sounds).burnable());
	}
	
	public static Block createNetherWoodChiseledBookshelf(MapColor mapColor) {
		return new ChiseledBookshelfBlock(AbstractBlock.Settings.create().mapColor(mapColor).instrument(NoteBlockInstrument.BASS).strength(1.5f).sounds(BlockSoundGroup.CHISELED_BOOKSHELF));
	}
	
	public static Block createChestBlock(WoodType type, MapColor mapColor) {
		return createChestBlock(type, mapColor, BlockSoundGroup.WOOD);
	}
	
	public static Block createChestBlock(WoodType type, MapColor mapColor, BlockSoundGroup sounds) {
		return new TypedChestBlock(type, AbstractBlock.Settings.create().mapColor(mapColor).instrument(NoteBlockInstrument.BASS).strength(2.5F).sounds(sounds).burnable());
	}
	
	public static Block createNetherWoodChestBlock(WoodType type, MapColor mapColor) {
		return new TypedChestBlock(type, AbstractBlock.Settings.create().mapColor(mapColor).instrument(NoteBlockInstrument.BASS).strength(2.5F).sounds(BlockSoundGroup.NETHER_WOOD));
	}
	
	public static Block createTrappedChestBlock(WoodType type, MapColor mapColor) {
		return createTrappedChestBlock(type, mapColor, BlockSoundGroup.WOOD);
	}
	
	public static Block createTrappedChestBlock(WoodType type, MapColor mapColor, BlockSoundGroup sounds) {
		return new TypedTrappedChestBlock(type, AbstractBlock.Settings.create().mapColor(mapColor).instrument(NoteBlockInstrument.BASS).strength(2.5F).sounds(sounds).burnable());
	}
	
	public static Block createNetherWoodTrappedChestBlock(WoodType type, MapColor mapColor) {
		return new TypedTrappedChestBlock(type, AbstractBlock.Settings.create().mapColor(mapColor).instrument(NoteBlockInstrument.BASS).strength(2.5F).sounds(BlockSoundGroup.NETHER_WOOD));
	}
	
	public static Function<BlockState, MapColor> orientableSlabMapColor(MapColor inside, MapColor outside) {
		return state -> state.get(Properties.SLAB_TYPE) == SlabType.BOTTOM || state.get(Properties.AXIS) == Direction.Axis.Y ? inside : outside;
	}
	
	public static Function<BlockState, MapColor> boolPropertyMapColor(BooleanProperty property, MapColor trueColor, MapColor falseColor) {
		return state -> state.get(property) ? trueColor : falseColor;
	}
	
	public static Boolean isDoubleSlab(BlockState state, BlockView world, BlockPos pos) {
		return state.get(Properties.SLAB_TYPE) == SlabType.DOUBLE;
	}
	
	public static Boolean isNotBottomSlab(BlockState state, BlockView world, BlockPos pos, EntityType<?> entityType) {
		return state.get(Properties.SLAB_TYPE) != SlabType.BOTTOM;
	}
	
	public static Boolean isTopHalf(BlockState state, BlockView world, BlockPos pos, EntityType<?> entityType) {
		return state.get(Properties.BLOCK_HALF) == BlockHalf.TOP;
	}
	
	public static Boolean canSpawnOnLeavesAndIsNotBottomSlab(BlockState state, BlockView world, BlockPos pos, EntityType<?> entityType) {
		return isNotBottomSlab(state, world, pos, entityType) && Blocks.canSpawnOnLeaves(state, world, pos, entityType);
	}
	
	public static Boolean canSpawnOnLeavesAndIsTopHalf(BlockState state, BlockView world, BlockPos pos, EntityType<?> entityType) {
		return isTopHalf(state, world, pos, entityType) && Blocks.canSpawnOnLeaves(state, world, pos, entityType);
	}
	
	private static void flammableBlocks() {
		FlammableBlockRegistry reg = FlammableBlockRegistry.getDefaultInstance();
		
		reg.add(OAK_LOG_SLAB, 5, 5);
		reg.add(OAK_LOG_STAIRS, 5, 5);
		reg.add(OAK_LOG_WALL, 5, 5);
		reg.add(OAK_WOOD_SLAB, 5, 5);
		reg.add(OAK_WOOD_STAIRS, 5, 5);
		reg.add(OAK_WOOD_WALL, 5, 5);
		reg.add(STRIPPED_OAK_LOG_SLAB, 5, 5);
		reg.add(STRIPPED_OAK_LOG_STAIRS, 5, 5);
		reg.add(STRIPPED_OAK_LOG_WALL, 5, 5);
		reg.add(STRIPPED_OAK_WOOD_SLAB, 5, 5);
		reg.add(STRIPPED_OAK_WOOD_STAIRS, 5, 5);
		reg.add(STRIPPED_OAK_WOOD_WALL, 5, 5);
		
		reg.add(SPRUCE_LOG_SLAB, 5, 5);
		reg.add(SPRUCE_LOG_STAIRS, 5, 5);
		reg.add(SPRUCE_LOG_WALL, 5, 5);
		reg.add(SPRUCE_WOOD_SLAB, 5, 5);
		reg.add(SPRUCE_WOOD_STAIRS, 5, 5);
		reg.add(SPRUCE_WOOD_WALL, 5, 5);
		reg.add(STRIPPED_SPRUCE_LOG_SLAB, 5, 5);
		reg.add(STRIPPED_SPRUCE_LOG_STAIRS, 5, 5);
		reg.add(STRIPPED_SPRUCE_LOG_WALL, 5, 5);
		reg.add(STRIPPED_SPRUCE_WOOD_SLAB, 5, 5);
		reg.add(STRIPPED_SPRUCE_WOOD_STAIRS, 5, 5);
		reg.add(STRIPPED_SPRUCE_WOOD_WALL, 5, 5);
		
		reg.add(BIRCH_LOG_SLAB, 5, 5);
		reg.add(BIRCH_LOG_STAIRS, 5, 5);
		reg.add(BIRCH_LOG_WALL, 5, 5);
		reg.add(BIRCH_WOOD_SLAB, 5, 5);
		reg.add(BIRCH_WOOD_STAIRS, 5, 5);
		reg.add(BIRCH_WOOD_WALL, 5, 5);
		reg.add(STRIPPED_BIRCH_LOG_SLAB, 5, 5);
		reg.add(STRIPPED_BIRCH_LOG_STAIRS, 5, 5);
		reg.add(STRIPPED_BIRCH_LOG_WALL, 5, 5);
		reg.add(STRIPPED_BIRCH_WOOD_SLAB, 5, 5);
		reg.add(STRIPPED_BIRCH_WOOD_STAIRS, 5, 5);
		reg.add(STRIPPED_BIRCH_WOOD_WALL, 5, 5);
		
		reg.add(JUNGLE_LOG_SLAB, 5, 5);
		reg.add(JUNGLE_LOG_STAIRS, 5, 5);
		reg.add(JUNGLE_LOG_WALL, 5, 5);
		reg.add(JUNGLE_WOOD_SLAB, 5, 5);
		reg.add(JUNGLE_WOOD_STAIRS, 5, 5);
		reg.add(JUNGLE_WOOD_WALL, 5, 5);
		reg.add(STRIPPED_JUNGLE_LOG_SLAB, 5, 5);
		reg.add(STRIPPED_JUNGLE_LOG_STAIRS, 5, 5);
		reg.add(STRIPPED_JUNGLE_LOG_WALL, 5, 5);
		reg.add(STRIPPED_JUNGLE_WOOD_SLAB, 5, 5);
		reg.add(STRIPPED_JUNGLE_WOOD_STAIRS, 5, 5);
		reg.add(STRIPPED_JUNGLE_WOOD_WALL, 5, 5);
		
		reg.add(ACACIA_LOG_SLAB, 5, 5);
		reg.add(ACACIA_LOG_STAIRS, 5, 5);
		reg.add(ACACIA_LOG_WALL, 5, 5);
		reg.add(ACACIA_WOOD_SLAB, 5, 5);
		reg.add(ACACIA_WOOD_STAIRS, 5, 5);
		reg.add(ACACIA_WOOD_WALL, 5, 5);
		reg.add(STRIPPED_ACACIA_LOG_SLAB, 5, 5);
		reg.add(STRIPPED_ACACIA_LOG_STAIRS, 5, 5);
		reg.add(STRIPPED_ACACIA_LOG_WALL, 5, 5);
		reg.add(STRIPPED_ACACIA_WOOD_SLAB, 5, 5);
		reg.add(STRIPPED_ACACIA_WOOD_STAIRS, 5, 5);
		reg.add(STRIPPED_ACACIA_WOOD_WALL, 5, 5);
		
		reg.add(DARK_OAK_LOG_SLAB, 5, 5);
		reg.add(DARK_OAK_LOG_STAIRS, 5, 5);
		reg.add(DARK_OAK_LOG_WALL, 5, 5);
		reg.add(DARK_OAK_WOOD_SLAB, 5, 5);
		reg.add(DARK_OAK_WOOD_STAIRS, 5, 5);
		reg.add(DARK_OAK_WOOD_WALL, 5, 5);
		reg.add(STRIPPED_DARK_OAK_LOG_SLAB, 5, 5);
		reg.add(STRIPPED_DARK_OAK_LOG_STAIRS, 5, 5);
		reg.add(STRIPPED_DARK_OAK_LOG_WALL, 5, 5);
		reg.add(STRIPPED_DARK_OAK_WOOD_SLAB, 5, 5);
		reg.add(STRIPPED_DARK_OAK_WOOD_STAIRS, 5, 5);
		reg.add(STRIPPED_DARK_OAK_WOOD_WALL, 5, 5);
		
		reg.add(MANGROVE_LOG_SLAB, 5, 5);
		reg.add(MANGROVE_LOG_STAIRS, 5, 5);
		reg.add(MANGROVE_LOG_WALL, 5, 5);
		reg.add(MANGROVE_WOOD_SLAB, 5, 5);
		reg.add(MANGROVE_WOOD_STAIRS, 5, 5);
		reg.add(MANGROVE_WOOD_WALL, 5, 5);
		reg.add(STRIPPED_MANGROVE_LOG_SLAB, 5, 5);
		reg.add(STRIPPED_MANGROVE_LOG_STAIRS, 5, 5);
		reg.add(STRIPPED_MANGROVE_LOG_WALL, 5, 5);
		reg.add(STRIPPED_MANGROVE_WOOD_SLAB, 5, 5);
		reg.add(STRIPPED_MANGROVE_WOOD_STAIRS, 5, 5);
		reg.add(STRIPPED_MANGROVE_WOOD_WALL, 5, 5);
		
		reg.add(CHERRY_LOG_SLAB, 5, 5);
		reg.add(CHERRY_LOG_STAIRS, 5, 5);
		reg.add(CHERRY_LOG_WALL, 5, 5);
		reg.add(CHERRY_WOOD_SLAB, 5, 5);
		reg.add(CHERRY_WOOD_STAIRS, 5, 5);
		reg.add(CHERRY_WOOD_WALL, 5, 5);
		reg.add(STRIPPED_CHERRY_LOG_SLAB, 5, 5);
		reg.add(STRIPPED_CHERRY_LOG_STAIRS, 5, 5);
		reg.add(STRIPPED_CHERRY_LOG_WALL, 5, 5);
		reg.add(STRIPPED_CHERRY_WOOD_SLAB, 5, 5);
		reg.add(STRIPPED_CHERRY_WOOD_STAIRS, 5, 5);
		reg.add(STRIPPED_CHERRY_WOOD_WALL, 5, 5);
		
		reg.add(BAMBOO_BLOCK_SLAB, 5, 5);
		reg.add(BAMBOO_BLOCK_STAIRS, 5, 5);
		reg.add(BAMBOO_BLOCK_WALL, 5, 5);
		reg.add(STRIPPED_BAMBOO_BLOCK_SLAB, 5, 5);
		reg.add(STRIPPED_BAMBOO_BLOCK_STAIRS, 5, 5);
		reg.add(STRIPPED_BAMBOO_BLOCK_WALL, 5, 5);
		
		reg.add(COAL_SLAB, 5, 5);
		reg.add(COAL_STAIRS, 5, 5);
		reg.add(COAL_WALL, 5, 5);
		
		reg.add(SSWPTags.Blocks.WOOL_SLABS, 30, 60);
		reg.add(SSWPTags.Blocks.WOOL_STAIRS, 30, 60);
		reg.add(SSWPTags.Blocks.WOOL_WALLS, 30, 60);
		
		reg.add(MANGROVE_ROOT_SLAB, 5, 20);
		reg.add(MANGROVE_ROOT_STAIRS, 5, 20);
		reg.add(MANGROVE_ROOT_WALL, 5, 20);
		
		reg.add(OAK_LEAF_SLAB, 30, 60);
		reg.add(OAK_LEAF_STAIRS, 30, 60);
		reg.add(OAK_LEAF_WALL, 30, 60);
		reg.add(SPRUCE_LEAF_SLAB, 30, 60);
		reg.add(SPRUCE_LEAF_STAIRS, 30, 60);
		reg.add(SPRUCE_LEAF_WALL, 30, 60);
		reg.add(BIRCH_LEAF_SLAB, 30, 60);
		reg.add(BIRCH_LEAF_STAIRS, 30, 60);
		reg.add(BIRCH_LEAF_WALL, 30, 60);
		reg.add(JUNGLE_LEAF_SLAB, 30, 60);
		reg.add(JUNGLE_LEAF_STAIRS, 30, 60);
		reg.add(JUNGLE_LEAF_WALL, 30, 60);
		reg.add(ACACIA_LEAF_SLAB, 30, 60);
		reg.add(ACACIA_LEAF_STAIRS, 30, 60);
		reg.add(ACACIA_LEAF_WALL, 30, 60);
		reg.add(DARK_OAK_LEAF_SLAB, 30, 60);
		reg.add(DARK_OAK_LEAF_STAIRS, 30, 60);
		reg.add(DARK_OAK_LEAF_WALL, 30, 60);
		reg.add(MANGROVE_LEAF_SLAB, 30, 60);
		reg.add(MANGROVE_LEAF_STAIRS, 30, 60);
		reg.add(MANGROVE_LEAF_WALL, 30, 60);
		reg.add(CHERRY_LEAF_SLAB, 30, 60);
		reg.add(CHERRY_LEAF_STAIRS, 30, 60);
		reg.add(CHERRY_LEAF_WALL, 30, 60);
		reg.add(AZALEA_LEAF_SLAB, 30, 60);
		reg.add(AZALEA_LEAF_STAIRS, 30, 60);
		reg.add(AZALEA_LEAF_WALL, 30, 60);
		reg.add(FLOWERING_AZALEA_LEAF_SLAB, 30, 60);
		reg.add(FLOWERING_AZALEA_LEAF_STAIRS, 30, 60);
		reg.add(FLOWERING_AZALEA_LEAF_WALL, 30, 60);
		
		reg.add(DRIED_KELP_SLAB, 30, 60);
		reg.add(DRIED_KELP_STAIRS, 30, 60);
		reg.add(DRIED_KELP_WALL, 30, 60);
		
		reg.add(HAY_SLAB, 60, 20);
		reg.add(HAY_STAIRS, 60, 20);
		reg.add(HAY_WALL, 60, 20);
	}
	
	private static void strippableBlocks() {
		BiConsumer<Block, Block> stripping = BlockUtil::addStrippingBlockPair;
		
		stripping.accept(OAK_LOG_SLAB, STRIPPED_OAK_LOG_SLAB);
		stripping.accept(OAK_LOG_STAIRS, STRIPPED_OAK_LOG_STAIRS);
		stripping.accept(OAK_LOG_WALL, STRIPPED_OAK_LOG_WALL);
		stripping.accept(OAK_WOOD_SLAB, STRIPPED_OAK_WOOD_SLAB);
		stripping.accept(OAK_WOOD_STAIRS, STRIPPED_OAK_WOOD_STAIRS);
		stripping.accept(OAK_WOOD_WALL, STRIPPED_OAK_WOOD_WALL);
		
		stripping.accept(SPRUCE_LOG_SLAB, STRIPPED_SPRUCE_LOG_SLAB);
		stripping.accept(SPRUCE_LOG_STAIRS, STRIPPED_SPRUCE_LOG_STAIRS);
		stripping.accept(SPRUCE_LOG_WALL, STRIPPED_SPRUCE_LOG_WALL);
		stripping.accept(SPRUCE_WOOD_SLAB, STRIPPED_SPRUCE_WOOD_SLAB);
		stripping.accept(SPRUCE_WOOD_STAIRS, STRIPPED_SPRUCE_WOOD_STAIRS);
		stripping.accept(SPRUCE_WOOD_WALL, STRIPPED_SPRUCE_WOOD_WALL);
		
		stripping.accept(BIRCH_LOG_SLAB, STRIPPED_BIRCH_LOG_SLAB);
		stripping.accept(BIRCH_LOG_STAIRS, STRIPPED_BIRCH_LOG_STAIRS);
		stripping.accept(BIRCH_LOG_WALL, STRIPPED_BIRCH_LOG_WALL);
		stripping.accept(BIRCH_WOOD_SLAB, STRIPPED_BIRCH_WOOD_SLAB);
		stripping.accept(BIRCH_WOOD_STAIRS, STRIPPED_BIRCH_WOOD_STAIRS);
		stripping.accept(BIRCH_WOOD_WALL, STRIPPED_BIRCH_WOOD_WALL);
		
		stripping.accept(JUNGLE_LOG_SLAB, STRIPPED_JUNGLE_LOG_SLAB);
		stripping.accept(JUNGLE_LOG_STAIRS, STRIPPED_JUNGLE_LOG_STAIRS);
		stripping.accept(JUNGLE_LOG_WALL, STRIPPED_JUNGLE_LOG_WALL);
		stripping.accept(JUNGLE_WOOD_SLAB, STRIPPED_JUNGLE_WOOD_SLAB);
		stripping.accept(JUNGLE_WOOD_STAIRS, STRIPPED_JUNGLE_WOOD_STAIRS);
		stripping.accept(JUNGLE_WOOD_WALL, STRIPPED_JUNGLE_WOOD_WALL);
		
		stripping.accept(ACACIA_LOG_SLAB, STRIPPED_ACACIA_LOG_SLAB);
		stripping.accept(ACACIA_LOG_STAIRS, STRIPPED_ACACIA_LOG_STAIRS);
		stripping.accept(ACACIA_LOG_WALL, STRIPPED_ACACIA_LOG_WALL);
		stripping.accept(ACACIA_WOOD_SLAB, STRIPPED_ACACIA_WOOD_SLAB);
		stripping.accept(ACACIA_WOOD_STAIRS, STRIPPED_ACACIA_WOOD_STAIRS);
		stripping.accept(ACACIA_WOOD_WALL, STRIPPED_ACACIA_WOOD_WALL);
		
		stripping.accept(DARK_OAK_LOG_SLAB, STRIPPED_DARK_OAK_LOG_SLAB);
		stripping.accept(DARK_OAK_LOG_STAIRS, STRIPPED_DARK_OAK_LOG_STAIRS);
		stripping.accept(DARK_OAK_LOG_WALL, STRIPPED_DARK_OAK_LOG_WALL);
		stripping.accept(DARK_OAK_WOOD_SLAB, STRIPPED_DARK_OAK_WOOD_SLAB);
		stripping.accept(DARK_OAK_WOOD_STAIRS, STRIPPED_DARK_OAK_WOOD_STAIRS);
		stripping.accept(DARK_OAK_WOOD_WALL, STRIPPED_DARK_OAK_WOOD_WALL);
		
		stripping.accept(MANGROVE_LOG_SLAB, STRIPPED_MANGROVE_LOG_SLAB);
		stripping.accept(MANGROVE_LOG_STAIRS, STRIPPED_MANGROVE_LOG_STAIRS);
		stripping.accept(MANGROVE_LOG_WALL, STRIPPED_MANGROVE_LOG_WALL);
		stripping.accept(MANGROVE_WOOD_SLAB, STRIPPED_MANGROVE_WOOD_SLAB);
		stripping.accept(MANGROVE_WOOD_STAIRS, STRIPPED_MANGROVE_WOOD_STAIRS);
		stripping.accept(MANGROVE_WOOD_WALL, STRIPPED_MANGROVE_WOOD_WALL);
		
		stripping.accept(CHERRY_LOG_SLAB, STRIPPED_CHERRY_LOG_SLAB);
		stripping.accept(CHERRY_LOG_STAIRS, STRIPPED_CHERRY_LOG_STAIRS);
		stripping.accept(CHERRY_LOG_WALL, STRIPPED_CHERRY_LOG_WALL);
		stripping.accept(CHERRY_WOOD_SLAB, STRIPPED_CHERRY_WOOD_SLAB);
		stripping.accept(CHERRY_WOOD_STAIRS, STRIPPED_CHERRY_WOOD_STAIRS);
		stripping.accept(CHERRY_WOOD_WALL, STRIPPED_CHERRY_WOOD_WALL);
		
		stripping.accept(BAMBOO_BLOCK_SLAB, STRIPPED_BAMBOO_BLOCK_SLAB);
		stripping.accept(BAMBOO_BLOCK_STAIRS, STRIPPED_BAMBOO_BLOCK_STAIRS);
		stripping.accept(BAMBOO_BLOCK_WALL, STRIPPED_BAMBOO_BLOCK_WALL);
		
		stripping.accept(CRIMSON_STEM_SLAB, STRIPPED_CRIMSON_STEM_SLAB);
		stripping.accept(CRIMSON_STEM_STAIRS, STRIPPED_CRIMSON_STEM_STAIRS);
		stripping.accept(CRIMSON_STEM_WALL, STRIPPED_CRIMSON_STEM_WALL);
		stripping.accept(CRIMSON_HYPHAE_SLAB, STRIPPED_CRIMSON_HYPHAE_SLAB);
		stripping.accept(CRIMSON_HYPHAE_STAIRS, STRIPPED_CRIMSON_HYPHAE_STAIRS);
		stripping.accept(CRIMSON_HYPHAE_WALL, STRIPPED_CRIMSON_HYPHAE_WALL);
	}
	
	private static void oxidizableBlocks() {
		BiConsumer<Block, Block> degrade = OxidizableBlocksRegistry::registerOxidizableBlockPair;
		
		degrade.accept(COPPER_SLAB, EXPOSED_COPPER_SLAB);
		degrade.accept(EXPOSED_COPPER_SLAB, WEATHERED_COPPER_SLAB);
		degrade.accept(WEATHERED_COPPER_SLAB, OXIDIZED_COPPER_SLAB);
		degrade.accept(COPPER_STAIRS, EXPOSED_COPPER_STAIRS);
		degrade.accept(EXPOSED_COPPER_STAIRS, WEATHERED_COPPER_STAIRS);
		degrade.accept(WEATHERED_COPPER_STAIRS, OXIDIZED_COPPER_STAIRS);
		degrade.accept(COPPER_WALL, EXPOSED_COPPER_WALL);
		degrade.accept(EXPOSED_COPPER_WALL, WEATHERED_COPPER_WALL);
		degrade.accept(WEATHERED_COPPER_WALL, OXIDIZED_COPPER_WALL);
		degrade.accept(COPPER_FENCE, EXPOSED_COPPER_FENCE);
		degrade.accept(EXPOSED_COPPER_FENCE, WEATHERED_COPPER_FENCE);
		degrade.accept(WEATHERED_COPPER_FENCE, OXIDIZED_COPPER_FENCE);
		degrade.accept(COPPER_FENCE_GATE, EXPOSED_COPPER_FENCE_GATE);
		degrade.accept(EXPOSED_COPPER_FENCE_GATE, WEATHERED_COPPER_FENCE_GATE);
		degrade.accept(WEATHERED_COPPER_FENCE_GATE, OXIDIZED_COPPER_FENCE_GATE);
		degrade.accept(COPPER_BARS, EXPOSED_COPPER_BARS);
		degrade.accept(EXPOSED_COPPER_BARS, WEATHERED_COPPER_BARS);
		degrade.accept(WEATHERED_COPPER_BARS, OXIDIZED_COPPER_BARS);
		degrade.accept(COPPER_PRESSURE_PLATE, EXPOSED_COPPER_PRESSURE_PLATE);
		degrade.accept(EXPOSED_COPPER_PRESSURE_PLATE, WEATHERED_COPPER_PRESSURE_PLATE);
		degrade.accept(WEATHERED_COPPER_PRESSURE_PLATE, OXIDIZED_COPPER_PRESSURE_PLATE);
		degrade.accept(COPPER_BUTTON, EXPOSED_COPPER_BUTTON);
		degrade.accept(EXPOSED_COPPER_BUTTON, WEATHERED_COPPER_BUTTON);
		degrade.accept(WEATHERED_COPPER_BUTTON, OXIDIZED_COPPER_BUTTON);
		degrade.accept(COPPER_CHAIN, EXPOSED_COPPER_CHAIN);
		degrade.accept(EXPOSED_COPPER_CHAIN, WEATHERED_COPPER_CHAIN);
		degrade.accept(WEATHERED_COPPER_CHAIN, OXIDIZED_COPPER_CHAIN);
		degrade.accept(CHISELED_COPPER_SLAB, EXPOSED_CHISELED_COPPER_SLAB);
		degrade.accept(EXPOSED_CHISELED_COPPER_SLAB, WEATHERED_CHISELED_COPPER_SLAB);
		degrade.accept(WEATHERED_CHISELED_COPPER_SLAB, OXIDIZED_CHISELED_COPPER_SLAB);
		degrade.accept(CHISELED_COPPER_STAIRS, EXPOSED_CHISELED_COPPER_STAIRS);
		degrade.accept(EXPOSED_CHISELED_COPPER_STAIRS, WEATHERED_CHISELED_COPPER_STAIRS);
		degrade.accept(WEATHERED_CHISELED_COPPER_STAIRS, OXIDIZED_CHISELED_COPPER_STAIRS);
		degrade.accept(CHISELED_COPPER_WALL, EXPOSED_CHISELED_COPPER_WALL);
		degrade.accept(EXPOSED_CHISELED_COPPER_WALL, WEATHERED_CHISELED_COPPER_WALL);
		degrade.accept(WEATHERED_CHISELED_COPPER_WALL, OXIDIZED_CHISELED_COPPER_WALL);
		degrade.accept(COPPER_GRATE_SLAB, EXPOSED_COPPER_GRATE_SLAB);
		degrade.accept(EXPOSED_COPPER_GRATE_SLAB, WEATHERED_COPPER_GRATE_SLAB);
		degrade.accept(WEATHERED_COPPER_GRATE_SLAB, OXIDIZED_COPPER_GRATE_SLAB);
		degrade.accept(COPPER_GRATE_STAIRS, EXPOSED_COPPER_GRATE_STAIRS);
		degrade.accept(EXPOSED_COPPER_GRATE_STAIRS, WEATHERED_COPPER_GRATE_STAIRS);
		degrade.accept(WEATHERED_COPPER_GRATE_STAIRS, OXIDIZED_COPPER_GRATE_STAIRS);
		degrade.accept(COPPER_GRATE_WALL, EXPOSED_COPPER_GRATE_WALL);
		degrade.accept(EXPOSED_COPPER_GRATE_WALL, WEATHERED_COPPER_GRATE_WALL);
		degrade.accept(WEATHERED_COPPER_GRATE_WALL, OXIDIZED_COPPER_GRATE_WALL);
		degrade.accept(CUT_COPPER_WALL, EXPOSED_CUT_COPPER_WALL);
		degrade.accept(EXPOSED_CUT_COPPER_WALL, WEATHERED_CUT_COPPER_WALL);
		degrade.accept(WEATHERED_CUT_COPPER_WALL, OXIDIZED_CUT_COPPER_WALL);
		degrade.accept(COPPER_LADDER, EXPOSED_COPPER_LADDER);
		degrade.accept(EXPOSED_COPPER_LADDER, WEATHERED_COPPER_LADDER);
		degrade.accept(WEATHERED_COPPER_LADDER, OXIDIZED_COPPER_LADDER);
		degrade.accept(COPPER_SIGN, EXPOSED_COPPER_SIGN);
		degrade.accept(EXPOSED_COPPER_SIGN, WEATHERED_COPPER_SIGN);
		degrade.accept(WEATHERED_COPPER_SIGN, OXIDIZED_COPPER_SIGN);
		degrade.accept(COPPER_WALL_SIGN, EXPOSED_COPPER_WALL_SIGN);
		degrade.accept(EXPOSED_COPPER_WALL_SIGN, WEATHERED_COPPER_WALL_SIGN);
		degrade.accept(WEATHERED_COPPER_WALL_SIGN, OXIDIZED_COPPER_WALL_SIGN);
		degrade.accept(COPPER_HANGING_SIGN, EXPOSED_COPPER_HANGING_SIGN);
		degrade.accept(EXPOSED_COPPER_HANGING_SIGN, WEATHERED_COPPER_HANGING_SIGN);
		degrade.accept(WEATHERED_COPPER_HANGING_SIGN, OXIDIZED_COPPER_HANGING_SIGN);
		degrade.accept(COPPER_WALL_HANGING_SIGN, EXPOSED_COPPER_WALL_HANGING_SIGN);
		degrade.accept(EXPOSED_COPPER_WALL_HANGING_SIGN, WEATHERED_COPPER_WALL_HANGING_SIGN);
		degrade.accept(WEATHERED_COPPER_WALL_HANGING_SIGN, OXIDIZED_COPPER_WALL_HANGING_SIGN);
		degrade.accept(COPPER_CAULDRON, EXPOSED_COPPER_CAULDRON);
		degrade.accept(EXPOSED_COPPER_CAULDRON, WEATHERED_COPPER_CAULDRON);
		degrade.accept(WEATHERED_COPPER_CAULDRON, OXIDIZED_COPPER_CAULDRON);
		degrade.accept(COPPER_WATER_CAULDRON, EXPOSED_COPPER_WATER_CAULDRON);
		degrade.accept(EXPOSED_COPPER_WATER_CAULDRON, WEATHERED_COPPER_WATER_CAULDRON);
		degrade.accept(WEATHERED_COPPER_WATER_CAULDRON, OXIDIZED_COPPER_WATER_CAULDRON);
		degrade.accept(COPPER_LAVA_CAULDRON, EXPOSED_COPPER_LAVA_CAULDRON);
		degrade.accept(EXPOSED_COPPER_LAVA_CAULDRON, WEATHERED_COPPER_LAVA_CAULDRON);
		degrade.accept(WEATHERED_COPPER_LAVA_CAULDRON, OXIDIZED_COPPER_LAVA_CAULDRON);
		degrade.accept(COPPER_POWDER_SNOW_CAULDRON, EXPOSED_COPPER_POWDER_SNOW_CAULDRON);
		degrade.accept(EXPOSED_COPPER_POWDER_SNOW_CAULDRON, WEATHERED_COPPER_POWDER_SNOW_CAULDRON);
		degrade.accept(WEATHERED_COPPER_POWDER_SNOW_CAULDRON, OXIDIZED_COPPER_POWDER_SNOW_CAULDRON);
		degrade.accept(COPPER_LANTERN, EXPOSED_COPPER_LANTERN);
		degrade.accept(EXPOSED_COPPER_LANTERN, WEATHERED_COPPER_LANTERN);
		degrade.accept(WEATHERED_COPPER_LANTERN, OXIDIZED_COPPER_LANTERN);
		degrade.accept(COPPER_SOUL_LANTERN, EXPOSED_COPPER_SOUL_LANTERN);
		degrade.accept(EXPOSED_COPPER_SOUL_LANTERN, WEATHERED_COPPER_SOUL_LANTERN);
		degrade.accept(WEATHERED_COPPER_SOUL_LANTERN, OXIDIZED_COPPER_SOUL_LANTERN);
		
		BiConsumer<Block, Block> wax = OxidizableBlocksRegistry::registerWaxableBlockPair;
		
		wax.accept(COPPER_SLAB, WAXED_COPPER_SLAB);
		wax.accept(EXPOSED_COPPER_SLAB, WAXED_EXPOSED_COPPER_SLAB);
		wax.accept(WEATHERED_COPPER_SLAB, WAXED_WEATHERED_COPPER_SLAB);
		wax.accept(OXIDIZED_COPPER_SLAB, WAXED_OXIDIZED_COPPER_SLAB);
		wax.accept(COPPER_STAIRS, WAXED_COPPER_STAIRS);
		wax.accept(EXPOSED_COPPER_STAIRS, WAXED_EXPOSED_COPPER_STAIRS);
		wax.accept(WEATHERED_COPPER_STAIRS, WAXED_WEATHERED_COPPER_STAIRS);
		wax.accept(OXIDIZED_COPPER_STAIRS, WAXED_OXIDIZED_COPPER_STAIRS);
		wax.accept(COPPER_WALL, WAXED_COPPER_WALL);
		wax.accept(EXPOSED_COPPER_WALL, WAXED_EXPOSED_COPPER_WALL);
		wax.accept(WEATHERED_COPPER_WALL, WAXED_WEATHERED_COPPER_WALL);
		wax.accept(OXIDIZED_COPPER_WALL, WAXED_OXIDIZED_COPPER_WALL);
		wax.accept(COPPER_FENCE, WAXED_COPPER_FENCE);
		wax.accept(EXPOSED_COPPER_FENCE, WAXED_EXPOSED_COPPER_FENCE);
		wax.accept(WEATHERED_COPPER_FENCE, WAXED_WEATHERED_COPPER_FENCE);
		wax.accept(OXIDIZED_COPPER_FENCE, WAXED_OXIDIZED_COPPER_FENCE);
		wax.accept(COPPER_FENCE_GATE, WAXED_COPPER_FENCE_GATE);
		wax.accept(EXPOSED_COPPER_FENCE_GATE, WAXED_EXPOSED_COPPER_FENCE_GATE);
		wax.accept(WEATHERED_COPPER_FENCE_GATE, WAXED_WEATHERED_COPPER_FENCE_GATE);
		wax.accept(OXIDIZED_COPPER_FENCE_GATE, WAXED_OXIDIZED_COPPER_FENCE_GATE);
		wax.accept(COPPER_BARS, WAXED_COPPER_BARS);
		wax.accept(EXPOSED_COPPER_BARS, WAXED_EXPOSED_COPPER_BARS);
		wax.accept(WEATHERED_COPPER_BARS, WAXED_WEATHERED_COPPER_BARS);
		wax.accept(OXIDIZED_COPPER_BARS, WAXED_OXIDIZED_COPPER_BARS);
		wax.accept(COPPER_PRESSURE_PLATE, WAXED_COPPER_PRESSURE_PLATE);
		wax.accept(EXPOSED_COPPER_PRESSURE_PLATE, WAXED_EXPOSED_COPPER_PRESSURE_PLATE);
		wax.accept(WEATHERED_COPPER_PRESSURE_PLATE, WAXED_WEATHERED_COPPER_PRESSURE_PLATE);
		wax.accept(OXIDIZED_COPPER_PRESSURE_PLATE, WAXED_OXIDIZED_COPPER_PRESSURE_PLATE);
		wax.accept(COPPER_BUTTON, WAXED_COPPER_BUTTON);
		wax.accept(EXPOSED_COPPER_BUTTON, WAXED_EXPOSED_COPPER_BUTTON);
		wax.accept(WEATHERED_COPPER_BUTTON, WAXED_WEATHERED_COPPER_BUTTON);
		wax.accept(OXIDIZED_COPPER_BUTTON, WAXED_OXIDIZED_COPPER_BUTTON);
		wax.accept(COPPER_CHAIN, WAXED_COPPER_CHAIN);
		wax.accept(EXPOSED_COPPER_CHAIN, WAXED_EXPOSED_COPPER_CHAIN);
		wax.accept(WEATHERED_COPPER_CHAIN, WAXED_WEATHERED_COPPER_CHAIN);
		wax.accept(OXIDIZED_COPPER_CHAIN, WAXED_OXIDIZED_COPPER_CHAIN);
		wax.accept(CHISELED_COPPER_SLAB, WAXED_CHISELED_COPPER_SLAB);
		wax.accept(EXPOSED_CHISELED_COPPER_SLAB, WAXED_EXPOSED_CHISELED_COPPER_SLAB);
		wax.accept(WEATHERED_CHISELED_COPPER_SLAB, WAXED_WEATHERED_CHISELED_COPPER_SLAB);
		wax.accept(OXIDIZED_CHISELED_COPPER_SLAB, WAXED_OXIDIZED_CHISELED_COPPER_SLAB);
		wax.accept(CHISELED_COPPER_STAIRS, WAXED_CHISELED_COPPER_STAIRS);
		wax.accept(EXPOSED_CHISELED_COPPER_STAIRS, WAXED_EXPOSED_CHISELED_COPPER_STAIRS);
		wax.accept(WEATHERED_CHISELED_COPPER_STAIRS, WAXED_WEATHERED_CHISELED_COPPER_STAIRS);
		wax.accept(OXIDIZED_CHISELED_COPPER_STAIRS, WAXED_OXIDIZED_CHISELED_COPPER_STAIRS);
		wax.accept(CHISELED_COPPER_WALL, WAXED_CHISELED_COPPER_WALL);
		wax.accept(EXPOSED_CHISELED_COPPER_WALL, WAXED_EXPOSED_CHISELED_COPPER_WALL);
		wax.accept(WEATHERED_CHISELED_COPPER_WALL, WAXED_WEATHERED_CHISELED_COPPER_WALL);
		wax.accept(OXIDIZED_CHISELED_COPPER_WALL, WAXED_OXIDIZED_CHISELED_COPPER_WALL);
		wax.accept(COPPER_GRATE_SLAB, WAXED_COPPER_GRATE_SLAB);
		wax.accept(EXPOSED_COPPER_GRATE_SLAB, WAXED_EXPOSED_COPPER_GRATE_SLAB);
		wax.accept(WEATHERED_COPPER_GRATE_SLAB, WAXED_WEATHERED_COPPER_GRATE_SLAB);
		wax.accept(OXIDIZED_COPPER_GRATE_SLAB, WAXED_OXIDIZED_COPPER_GRATE_SLAB);
		wax.accept(COPPER_GRATE_STAIRS, WAXED_COPPER_GRATE_STAIRS);
		wax.accept(EXPOSED_COPPER_GRATE_STAIRS, WAXED_EXPOSED_COPPER_GRATE_STAIRS);
		wax.accept(WEATHERED_COPPER_GRATE_STAIRS, WAXED_WEATHERED_COPPER_GRATE_STAIRS);
		wax.accept(OXIDIZED_COPPER_GRATE_STAIRS, WAXED_OXIDIZED_COPPER_GRATE_STAIRS);
		wax.accept(COPPER_GRATE_WALL, WAXED_COPPER_GRATE_WALL);
		wax.accept(EXPOSED_COPPER_GRATE_WALL, WAXED_EXPOSED_COPPER_GRATE_WALL);
		wax.accept(WEATHERED_COPPER_GRATE_WALL, WAXED_WEATHERED_COPPER_GRATE_WALL);
		wax.accept(OXIDIZED_COPPER_GRATE_WALL, WAXED_OXIDIZED_COPPER_GRATE_WALL);
		wax.accept(CUT_COPPER_WALL, WAXED_CUT_COPPER_WALL);
		wax.accept(EXPOSED_CUT_COPPER_WALL, WAXED_EXPOSED_CUT_COPPER_WALL);
		wax.accept(WEATHERED_CUT_COPPER_WALL, WAXED_WEATHERED_CUT_COPPER_WALL);
		wax.accept(OXIDIZED_CUT_COPPER_WALL, WAXED_OXIDIZED_CUT_COPPER_WALL);
		wax.accept(COPPER_LADDER, WAXED_COPPER_LADDER);
		wax.accept(EXPOSED_COPPER_LADDER, WAXED_EXPOSED_COPPER_LADDER);
		wax.accept(WEATHERED_COPPER_LADDER, WAXED_WEATHERED_COPPER_LADDER);
		wax.accept(OXIDIZED_COPPER_LADDER, WAXED_OXIDIZED_COPPER_LADDER);
		wax.accept(COPPER_SIGN, WAXED_COPPER_SIGN);
		wax.accept(EXPOSED_COPPER_SIGN, WAXED_EXPOSED_COPPER_SIGN);
		wax.accept(WEATHERED_COPPER_SIGN, WAXED_WEATHERED_COPPER_SIGN);
		wax.accept(OXIDIZED_COPPER_SIGN, WAXED_OXIDIZED_COPPER_SIGN);
		wax.accept(COPPER_WALL_SIGN, WAXED_COPPER_WALL_SIGN);
		wax.accept(EXPOSED_COPPER_WALL_SIGN, WAXED_EXPOSED_COPPER_WALL_SIGN);
		wax.accept(WEATHERED_COPPER_WALL_SIGN, WAXED_WEATHERED_COPPER_WALL_SIGN);
		wax.accept(OXIDIZED_COPPER_WALL_SIGN, WAXED_OXIDIZED_COPPER_WALL_SIGN);
		wax.accept(COPPER_HANGING_SIGN, WAXED_COPPER_HANGING_SIGN);
		wax.accept(EXPOSED_COPPER_HANGING_SIGN, WAXED_EXPOSED_COPPER_HANGING_SIGN);
		wax.accept(WEATHERED_COPPER_HANGING_SIGN, WAXED_WEATHERED_COPPER_HANGING_SIGN);
		wax.accept(OXIDIZED_COPPER_HANGING_SIGN, WAXED_OXIDIZED_COPPER_HANGING_SIGN);
		wax.accept(COPPER_WALL_HANGING_SIGN, WAXED_COPPER_WALL_HANGING_SIGN);
		wax.accept(EXPOSED_COPPER_WALL_HANGING_SIGN, WAXED_EXPOSED_COPPER_WALL_HANGING_SIGN);
		wax.accept(WEATHERED_COPPER_WALL_HANGING_SIGN, WAXED_WEATHERED_COPPER_WALL_HANGING_SIGN);
		wax.accept(OXIDIZED_COPPER_WALL_HANGING_SIGN, WAXED_OXIDIZED_COPPER_WALL_HANGING_SIGN);
		wax.accept(COPPER_CAULDRON, WAXED_COPPER_CAULDRON);
		wax.accept(EXPOSED_COPPER_CAULDRON, WAXED_EXPOSED_COPPER_CAULDRON);
		wax.accept(WEATHERED_COPPER_CAULDRON, WAXED_WEATHERED_COPPER_CAULDRON);
		wax.accept(OXIDIZED_COPPER_CAULDRON, WAXED_OXIDIZED_COPPER_CAULDRON);
		wax.accept(COPPER_WATER_CAULDRON, WAXED_COPPER_WATER_CAULDRON);
		wax.accept(EXPOSED_COPPER_WATER_CAULDRON, WAXED_EXPOSED_COPPER_WATER_CAULDRON);
		wax.accept(WEATHERED_COPPER_WATER_CAULDRON, WAXED_WEATHERED_COPPER_WATER_CAULDRON);
		wax.accept(OXIDIZED_COPPER_WATER_CAULDRON, WAXED_OXIDIZED_COPPER_WATER_CAULDRON);
		wax.accept(COPPER_LAVA_CAULDRON, WAXED_COPPER_LAVA_CAULDRON);
		wax.accept(EXPOSED_COPPER_LAVA_CAULDRON, WAXED_EXPOSED_COPPER_LAVA_CAULDRON);
		wax.accept(WEATHERED_COPPER_LAVA_CAULDRON, WAXED_WEATHERED_COPPER_LAVA_CAULDRON);
		wax.accept(OXIDIZED_COPPER_LAVA_CAULDRON, WAXED_OXIDIZED_COPPER_LAVA_CAULDRON);
		wax.accept(COPPER_POWDER_SNOW_CAULDRON, WAXED_COPPER_POWDER_SNOW_CAULDRON);
		wax.accept(EXPOSED_COPPER_POWDER_SNOW_CAULDRON, WAXED_EXPOSED_COPPER_POWDER_SNOW_CAULDRON);
		wax.accept(WEATHERED_COPPER_POWDER_SNOW_CAULDRON, WAXED_WEATHERED_COPPER_POWDER_SNOW_CAULDRON);
		wax.accept(OXIDIZED_COPPER_POWDER_SNOW_CAULDRON, WAXED_OXIDIZED_COPPER_POWDER_SNOW_CAULDRON);
		wax.accept(COPPER_LANTERN, WAXED_COPPER_LANTERN);
		wax.accept(EXPOSED_COPPER_LANTERN, WAXED_EXPOSED_COPPER_LANTERN);
		wax.accept(WEATHERED_COPPER_LANTERN, WAXED_WEATHERED_COPPER_LANTERN);
		wax.accept(OXIDIZED_COPPER_LANTERN, WAXED_OXIDIZED_COPPER_LANTERN);
	}
	
	private static void flattenableBlocks() {
		BiConsumer<Block, Block> flattening = BlockUtil::addFlatteningBlockPair;
		
		flattening.accept(GRASS_SLAB, DIRT_PATH_SLAB);
		flattening.accept(GRASS_STAIRS, DIRT_PATH_STAIRS);
		flattening.accept(GRASS_WALL, DIRT_PATH_WALL);
		flattening.accept(PODZOL_SLAB, DIRT_PATH_SLAB);
		flattening.accept(PODZOL_STAIRS, DIRT_PATH_STAIRS);
		flattening.accept(PODZOL_WALL, DIRT_PATH_WALL);
		flattening.accept(MYCELIUM_SLAB, DIRT_PATH_SLAB);
		flattening.accept(MYCELIUM_STAIRS, DIRT_PATH_STAIRS);
		flattening.accept(MYCELIUM_WALL, DIRT_PATH_WALL);
		flattening.accept(DIRT_SLAB, DIRT_PATH_SLAB);
		flattening.accept(DIRT_STAIRS, DIRT_PATH_STAIRS);
		flattening.accept(DIRT_WALL, DIRT_PATH_WALL);
		flattening.accept(COARSE_DIRT_SLAB, DIRT_PATH_SLAB);
		flattening.accept(COARSE_DIRT_STAIRS, DIRT_PATH_STAIRS);
		flattening.accept(COARSE_DIRT_WALL, DIRT_PATH_WALL);
		flattening.accept(ROOTED_DIRT_SLAB, DIRT_PATH_SLAB);
		flattening.accept(ROOTED_DIRT_STAIRS, DIRT_PATH_STAIRS);
		flattening.accept(ROOTED_DIRT_WALL, DIRT_PATH_WALL);
	}
	
	private static void tillableBlocks() {
		TriConsumer<Block, Predicate<ItemUsageContext>, Consumer<ItemUsageContext>> registry = TillableBlockRegistry::register;
		
		registry.accept(COARSE_DIRT_SLAB, HoeItem::canTillFarmland, createTillAndPreserveStateAction(DIRT_SLAB));
		registry.accept(COARSE_DIRT_STAIRS, HoeItem::canTillFarmland, createTillAndPreserveStateAction(DIRT_STAIRS));
		registry.accept(COARSE_DIRT_WALL, HoeItem::canTillFarmland, createTillAndPreserveStateAction(DIRT_WALL));
		registry.accept(ROOTED_DIRT_SLAB, context -> context.getWorld().getBlockState(context.getBlockPos()).get(Properties.SLAB_TYPE) == SlabType.DOUBLE, createTillAndPreserveStateAndDropActionForSlab(DIRT_SLAB, Items.HANGING_ROOTS));
		registry.accept(ROOTED_DIRT_STAIRS, context -> true, createTillAndPreserveStateAndDropAction(DIRT_STAIRS, Items.HANGING_ROOTS));
		registry.accept(ROOTED_DIRT_WALL, context -> true, createTillAndPreserveStateAndDropAction(DIRT_WALL, Items.HANGING_ROOTS));
		
	}
	
	private static void blockEntities() {
		BlockEntityType.SIGN.addSupportedBlock(IRON_SIGN);
		BlockEntityType.SIGN.addSupportedBlock(IRON_WALL_SIGN);
		BlockEntityType.HANGING_SIGN.addSupportedBlock(IRON_HANGING_SIGN);
		BlockEntityType.HANGING_SIGN.addSupportedBlock(IRON_WALL_HANGING_SIGN);
		BlockEntityType.SIGN.addSupportedBlock(GOLD_SIGN);
		BlockEntityType.SIGN.addSupportedBlock(GOLD_WALL_SIGN);
		BlockEntityType.HANGING_SIGN.addSupportedBlock(GOLD_HANGING_SIGN);
		BlockEntityType.HANGING_SIGN.addSupportedBlock(GOLD_WALL_HANGING_SIGN);
		BlockEntityType.SIGN.addSupportedBlock(NETHERITE_SIGN);
		BlockEntityType.SIGN.addSupportedBlock(NETHERITE_WALL_SIGN);
		BlockEntityType.HANGING_SIGN.addSupportedBlock(NETHERITE_HANGING_SIGN);
		BlockEntityType.HANGING_SIGN.addSupportedBlock(NETHERITE_WALL_HANGING_SIGN);
		BlockEntityType.SIGN.addSupportedBlock(COPPER_SIGN);
		BlockEntityType.SIGN.addSupportedBlock(COPPER_WALL_SIGN);
		BlockEntityType.HANGING_SIGN.addSupportedBlock(COPPER_HANGING_SIGN);
		BlockEntityType.HANGING_SIGN.addSupportedBlock(COPPER_WALL_HANGING_SIGN);
		BlockEntityType.SIGN.addSupportedBlock(EXPOSED_COPPER_SIGN);
		BlockEntityType.SIGN.addSupportedBlock(EXPOSED_COPPER_WALL_SIGN);
		BlockEntityType.HANGING_SIGN.addSupportedBlock(EXPOSED_COPPER_HANGING_SIGN);
		BlockEntityType.HANGING_SIGN.addSupportedBlock(EXPOSED_COPPER_WALL_HANGING_SIGN);
		BlockEntityType.SIGN.addSupportedBlock(WEATHERED_COPPER_SIGN);
		BlockEntityType.SIGN.addSupportedBlock(WEATHERED_COPPER_WALL_SIGN);
		BlockEntityType.HANGING_SIGN.addSupportedBlock(WEATHERED_COPPER_HANGING_SIGN);
		BlockEntityType.HANGING_SIGN.addSupportedBlock(WEATHERED_COPPER_WALL_HANGING_SIGN);
		BlockEntityType.SIGN.addSupportedBlock(OXIDIZED_COPPER_SIGN);
		BlockEntityType.SIGN.addSupportedBlock(OXIDIZED_COPPER_WALL_SIGN);
		BlockEntityType.HANGING_SIGN.addSupportedBlock(OXIDIZED_COPPER_HANGING_SIGN);
		BlockEntityType.HANGING_SIGN.addSupportedBlock(OXIDIZED_COPPER_WALL_HANGING_SIGN);
		BlockEntityType.SIGN.addSupportedBlock(WAXED_COPPER_SIGN);
		BlockEntityType.SIGN.addSupportedBlock(WAXED_COPPER_WALL_SIGN);
		BlockEntityType.HANGING_SIGN.addSupportedBlock(WAXED_COPPER_HANGING_SIGN);
		BlockEntityType.HANGING_SIGN.addSupportedBlock(WAXED_COPPER_WALL_HANGING_SIGN);
		BlockEntityType.SIGN.addSupportedBlock(WAXED_EXPOSED_COPPER_SIGN);
		BlockEntityType.SIGN.addSupportedBlock(WAXED_EXPOSED_COPPER_WALL_SIGN);
		BlockEntityType.HANGING_SIGN.addSupportedBlock(WAXED_EXPOSED_COPPER_HANGING_SIGN);
		BlockEntityType.HANGING_SIGN.addSupportedBlock(WAXED_EXPOSED_COPPER_WALL_HANGING_SIGN);
		BlockEntityType.SIGN.addSupportedBlock(WAXED_WEATHERED_COPPER_SIGN);
		BlockEntityType.SIGN.addSupportedBlock(WAXED_WEATHERED_COPPER_WALL_SIGN);
		BlockEntityType.HANGING_SIGN.addSupportedBlock(WAXED_WEATHERED_COPPER_HANGING_SIGN);
		BlockEntityType.HANGING_SIGN.addSupportedBlock(WAXED_WEATHERED_COPPER_WALL_HANGING_SIGN);
		BlockEntityType.SIGN.addSupportedBlock(WAXED_OXIDIZED_COPPER_SIGN);
		BlockEntityType.SIGN.addSupportedBlock(WAXED_OXIDIZED_COPPER_WALL_SIGN);
		BlockEntityType.HANGING_SIGN.addSupportedBlock(WAXED_OXIDIZED_COPPER_HANGING_SIGN);
		BlockEntityType.HANGING_SIGN.addSupportedBlock(WAXED_OXIDIZED_COPPER_WALL_HANGING_SIGN);
		BlockEntityType.LECTERN.addSupportedBlock(OAK_LECTERN);
		BlockEntityType.LECTERN.addSupportedBlock(SPRUCE_LECTERN);
		BlockEntityType.LECTERN.addSupportedBlock(BIRCH_LECTERN);
		BlockEntityType.LECTERN.addSupportedBlock(JUNGLE_LECTERN);
		BlockEntityType.LECTERN.addSupportedBlock(ACACIA_LECTERN);
		BlockEntityType.LECTERN.addSupportedBlock(DARK_OAK_LECTERN);
		BlockEntityType.LECTERN.addSupportedBlock(MANGROVE_LECTERN);
		BlockEntityType.LECTERN.addSupportedBlock(CHERRY_LECTERN);
		BlockEntityType.LECTERN.addSupportedBlock(BAMBOO_LECTERN);
		BlockEntityType.LECTERN.addSupportedBlock(CRIMSON_LECTERN);
		BlockEntityType.LECTERN.addSupportedBlock(WARPED_LECTERN);
		BlockEntityType.BARREL.addSupportedBlock(OAK_BARREL);
		BlockEntityType.BARREL.addSupportedBlock(SPRUCE_BARREL);
		BlockEntityType.BARREL.addSupportedBlock(BIRCH_BARREL);
		BlockEntityType.BARREL.addSupportedBlock(JUNGLE_BARREL);
		BlockEntityType.BARREL.addSupportedBlock(ACACIA_BARREL);
		BlockEntityType.BARREL.addSupportedBlock(DARK_OAK_BARREL);
		BlockEntityType.BARREL.addSupportedBlock(MANGROVE_BARREL);
		BlockEntityType.BARREL.addSupportedBlock(CHERRY_BARREL);
		BlockEntityType.BARREL.addSupportedBlock(BAMBOO_BARREL);
		BlockEntityType.BARREL.addSupportedBlock(CRIMSON_BARREL);
		BlockEntityType.BARREL.addSupportedBlock(WARPED_BARREL);
		BlockEntityType.BEEHIVE.addSupportedBlock(OAK_BEEHIVE);
		BlockEntityType.BEEHIVE.addSupportedBlock(SPRUCE_BEEHIVE);
		BlockEntityType.BEEHIVE.addSupportedBlock(BIRCH_BEEHIVE);
		BlockEntityType.BEEHIVE.addSupportedBlock(JUNGLE_BEEHIVE);
		BlockEntityType.BEEHIVE.addSupportedBlock(ACACIA_BEEHIVE);
		BlockEntityType.BEEHIVE.addSupportedBlock(DARK_OAK_BEEHIVE);
		BlockEntityType.BEEHIVE.addSupportedBlock(MANGROVE_BEEHIVE);
		BlockEntityType.BEEHIVE.addSupportedBlock(CHERRY_BEEHIVE);
		BlockEntityType.BEEHIVE.addSupportedBlock(BAMBOO_BEEHIVE);
		BlockEntityType.BEEHIVE.addSupportedBlock(CRIMSON_BEEHIVE);
		BlockEntityType.BEEHIVE.addSupportedBlock(WARPED_BEEHIVE);
		BlockEntityType.CHISELED_BOOKSHELF.addSupportedBlock(OAK_CHISELED_BOOKSHELF);
		BlockEntityType.CHISELED_BOOKSHELF.addSupportedBlock(SPRUCE_CHISELED_BOOKSHELF);
		BlockEntityType.CHISELED_BOOKSHELF.addSupportedBlock(BIRCH_CHISELED_BOOKSHELF);
		BlockEntityType.CHISELED_BOOKSHELF.addSupportedBlock(JUNGLE_CHISELED_BOOKSHELF);
		BlockEntityType.CHISELED_BOOKSHELF.addSupportedBlock(ACACIA_CHISELED_BOOKSHELF);
		BlockEntityType.CHISELED_BOOKSHELF.addSupportedBlock(DARK_OAK_CHISELED_BOOKSHELF);
		BlockEntityType.CHISELED_BOOKSHELF.addSupportedBlock(MANGROVE_CHISELED_BOOKSHELF);
		BlockEntityType.CHISELED_BOOKSHELF.addSupportedBlock(CHERRY_CHISELED_BOOKSHELF);
		BlockEntityType.CHISELED_BOOKSHELF.addSupportedBlock(BAMBOO_CHISELED_BOOKSHELF);
		BlockEntityType.CHISELED_BOOKSHELF.addSupportedBlock(CRIMSON_CHISELED_BOOKSHELF);
		BlockEntityType.CHISELED_BOOKSHELF.addSupportedBlock(WARPED_CHISELED_BOOKSHELF);
	}
	
	public static void pointOfInterestTypes() {
		BlockUtil.addBlocksToPOI(PointOfInterestTypes.SHEPHERD,
				OAK_LOOM,
				SPRUCE_LOOM,
				BIRCH_LOOM,
				JUNGLE_LOOM,
				ACACIA_LOOM,
				DARK_OAK_LOOM,
				MANGROVE_LOOM,
				CHERRY_LOOM,
				BAMBOO_LOOM,
				CRIMSON_LOOM,
				WARPED_LOOM);
		
		BlockUtil.addBlocksToPOI(PointOfInterestTypes.CARTOGRAPHER,
				OAK_CARTOGRAPHY_TABLE,
				SPRUCE_CARTOGRAPHY_TABLE,
				BIRCH_CARTOGRAPHY_TABLE,
				JUNGLE_CARTOGRAPHY_TABLE,
				ACACIA_CARTOGRAPHY_TABLE,
				DARK_OAK_CARTOGRAPHY_TABLE,
				MANGROVE_CARTOGRAPHY_TABLE,
				CHERRY_CARTOGRAPHY_TABLE,
				BAMBOO_CARTOGRAPHY_TABLE,
				CRIMSON_CARTOGRAPHY_TABLE,
				WARPED_CARTOGRAPHY_TABLE);
		
		BlockUtil.addBlocksToPOI(PointOfInterestTypes.FLETCHER,
				OAK_FLETCHING_TABLE,
				SPRUCE_FLETCHING_TABLE,
				BIRCH_FLETCHING_TABLE,
				JUNGLE_FLETCHING_TABLE,
				ACACIA_FLETCHING_TABLE,
				DARK_OAK_FLETCHING_TABLE,
				MANGROVE_FLETCHING_TABLE,
				CHERRY_FLETCHING_TABLE,
				BAMBOO_FLETCHING_TABLE,
				CRIMSON_FLETCHING_TABLE,
				WARPED_FLETCHING_TABLE);
		
		BlockUtil.addBlocksToPOI(PointOfInterestTypes.TOOLSMITH,
				OAK_SMITHING_TABLE,
				SPRUCE_SMITHING_TABLE,
				BIRCH_SMITHING_TABLE,
				JUNGLE_SMITHING_TABLE,
				ACACIA_SMITHING_TABLE,
				DARK_OAK_SMITHING_TABLE,
				MANGROVE_SMITHING_TABLE,
				CHERRY_SMITHING_TABLE,
				BAMBOO_SMITHING_TABLE,
				CRIMSON_SMITHING_TABLE,
				WARPED_SMITHING_TABLE);
		
		BlockUtil.addBlocksToPOI(PointOfInterestTypes.FARMER,
				OAK_COMPOSTER,
				SPRUCE_COMPOSTER,
				BIRCH_COMPOSTER,
				JUNGLE_COMPOSTER,
				ACACIA_COMPOSTER,
				DARK_OAK_COMPOSTER,
				MANGROVE_COMPOSTER,
				CHERRY_COMPOSTER,
				BAMBOO_COMPOSTER,
				CRIMSON_COMPOSTER,
				WARPED_COMPOSTER);
		
		BlockUtil.addBlocksToPOI(PointOfInterestTypes.LIBRARIAN,
				OAK_LECTERN,
				SPRUCE_LECTERN,
				BIRCH_LECTERN,
				JUNGLE_LECTERN,
				ACACIA_LECTERN,
				DARK_OAK_LECTERN,
				MANGROVE_LECTERN,
				CHERRY_LECTERN,
				BAMBOO_LECTERN,
				CRIMSON_LECTERN,
				WARPED_LECTERN);
		
		BlockUtil.addBlocksToPOI(PointOfInterestTypes.FISHERMAN,
				OAK_BARREL,
				SPRUCE_BARREL,
				BIRCH_BARREL,
				JUNGLE_BARREL,
				ACACIA_BARREL,
				DARK_OAK_BARREL,
				MANGROVE_BARREL,
				CHERRY_BARREL,
				BAMBOO_BARREL,
				CRIMSON_BARREL,
				WARPED_BARREL);
		
		BlockUtil.addBlocksToPOI(PointOfInterestTypes.BEEHIVE,
				OAK_BEEHIVE,
				SPRUCE_BEEHIVE,
				BIRCH_BEEHIVE,
				JUNGLE_BEEHIVE,
				ACACIA_BEEHIVE,
				DARK_OAK_BEEHIVE,
				MANGROVE_BEEHIVE,
				CHERRY_BEEHIVE,
				BAMBOO_BEEHIVE,
				CRIMSON_BEEHIVE,
				WARPED_BEEHIVE);
		
		BlockUtil.addBlocksToPOI(PointOfInterestTypes.LEATHERWORKER,
				GOLD_CAULDRON,
				NETHERITE_CAULDRON,
				COPPER_CAULDRON,
				EXPOSED_COPPER_CAULDRON,
				WEATHERED_COPPER_CAULDRON,
				OXIDIZED_COPPER_CAULDRON,
				WAXED_COPPER_CAULDRON,
				WAXED_EXPOSED_COPPER_CAULDRON,
				WAXED_WEATHERED_COPPER_CAULDRON,
				WAXED_OXIDIZED_COPPER_CAULDRON);
	}
	
	public static Consumer<ItemUsageContext> createTillAndPreserveStateAction(Block result) {
		return context -> {
			BlockState resultingState = result.getStateWithProperties(context.getWorld().getBlockState(context.getBlockPos()));
			context.getWorld().setBlockState(context.getBlockPos(), resultingState, Block.NOTIFY_ALL_AND_REDRAW);
			context.getWorld().emitGameEvent(GameEvent.BLOCK_CHANGE, context.getBlockPos(), GameEvent.Emitter.of(context.getPlayer(), resultingState));
		};
	}
	
	public static Consumer<ItemUsageContext> createTillAndPreserveStateAndDropAction(Block result, ItemConvertible droppedItem) {
		return context -> {
			BlockState resultingState = result.getStateWithProperties(context.getWorld().getBlockState(context.getBlockPos()));
			context.getWorld().setBlockState(context.getBlockPos(), resultingState, Block.NOTIFY_ALL_AND_REDRAW);
			context.getWorld().emitGameEvent(GameEvent.BLOCK_CHANGE, context.getBlockPos(), GameEvent.Emitter.of(context.getPlayer(), resultingState));
			Block.dropStack(context.getWorld(), context.getBlockPos(), context.getSide(), new ItemStack(droppedItem));
		};
	}
	
	public static Consumer<ItemUsageContext> createTillAndPreserveStateAndDropActionForSlab(Block result, ItemConvertible droppedItem) {
		return context -> {
			BlockState startingState = context.getWorld().getBlockState(context.getBlockPos());
			BlockState resultingState = result.getStateWithProperties(startingState);
			context.getWorld().setBlockState(context.getBlockPos(), resultingState, Block.NOTIFY_ALL_AND_REDRAW);
			context.getWorld().emitGameEvent(GameEvent.BLOCK_CHANGE, context.getBlockPos(), GameEvent.Emitter.of(context.getPlayer(), resultingState));
			if (startingState.get(Properties.SLAB_TYPE) == SlabType.DOUBLE || context.getWorld().getRandom().nextBoolean()) Block.dropStack(context.getWorld(), context.getBlockPos(), context.getSide(), new ItemStack(droppedItem));
		};
	}
}