package gay.mountainspring.sswplus.screen;

import gay.mountainspring.sswplus.SSWPlus;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.resource.featuretoggle.FeatureFlags;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;

public class SSWPScreenHandlerTypes {
	public SSWPScreenHandlerTypes() {}
	
	public static void init() {}
	
	public static final ScreenHandlerType<NetheriteAnvilScreenHandler> NETHERITE_ANVIL = Registry.register(Registries.SCREEN_HANDLER, Identifier.of(SSWPlus.MOD_ID, "netherite_anvil"), new ScreenHandlerType<>(NetheriteAnvilScreenHandler::new, FeatureFlags.VANILLA_FEATURES));
}