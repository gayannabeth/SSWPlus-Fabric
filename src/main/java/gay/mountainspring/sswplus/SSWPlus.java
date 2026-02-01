package gay.mountainspring.sswplus;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import gay.mountainspring.sswplus.block.SSWPBlockTypes;
import gay.mountainspring.sswplus.block.SSWPBlocks;
import gay.mountainspring.sswplus.config.SSWPConfig;
import gay.mountainspring.sswplus.item.SSWPItems;
import gay.mountainspring.sswplus.item.group.SSWPVanillaGroups;
import gay.mountainspring.sswplus.screen.SSWPScreenHandlerTypes;
import net.fabricmc.api.ModInitializer;

public class SSWPlus implements ModInitializer {
	public static final String MOD_ID = "sswplus";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	
	public static final Gson GSON = new GsonBuilder()
			.registerTypeAdapter(SSWPConfig.class, SSWPConfig.getSerializer())
			.create();
	
	@Override
	public void onInitialize() {
		SSWPBlockTypes.init();
		SSWPScreenHandlerTypes.init();
		SSWPBlocks.init();
		SSWPItems.init();
		SSWPVanillaGroups.init();
		SSWPConfig.init();
	}
}