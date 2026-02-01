package gay.mountainspring.sswplus.block;

import java.util.Map;

import gay.mountainspring.aquifer.block.cauldron.CauldronContentsType;
import gay.mountainspring.aquifer.block.cauldron.CauldronGroup;
import gay.mountainspring.aquifer.registry.AquiferRegistries;
import gay.mountainspring.sswplus.SSWPlus;
import net.minecraft.block.Block;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class SSWPCauldronGroups {
	private SSWPCauldronGroups() {}
	
	public static final CauldronGroup GOLD = register("gold");
	public static final CauldronGroup NETHERITE = register("netherite");
	public static final CauldronGroup COPPER = register("copper");
	public static final CauldronGroup EXPOSED_COPPER = register("exposed_copper");
	public static final CauldronGroup WEATHERED_COPPER = register("weathered_copper");
	public static final CauldronGroup OXIDIZED_COPPER = register("oxidized_copper");
	public static final CauldronGroup WAXED_COPPER = register("waxed_copper");
	public static final CauldronGroup WAXED_EXPOSED_COPPER = register("waxed_exposed_copper");
	public static final CauldronGroup WAXED_WEATHERED_COPPER = register("waxed_weathered_copper");
	public static final CauldronGroup WAXED_OXIDIZED_COPPER = register("waxed_oxidized_copper");
	
	public static CauldronGroup register(String name) {
		Identifier id = Identifier.of(SSWPlus.MOD_ID, name);
		return Registry.register(AquiferRegistries.CAULDRON_GROUP, id, new CauldronGroup(id));
	}
	
	public static CauldronGroup register(String name, Map<CauldronContentsType, Block> map) {
		Identifier id = Identifier.of(SSWPlus.MOD_ID, name);
		return Registry.register(AquiferRegistries.CAULDRON_GROUP, id, new CauldronGroup(id, map));
	}
}