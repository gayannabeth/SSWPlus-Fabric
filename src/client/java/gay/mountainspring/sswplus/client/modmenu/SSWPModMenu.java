package gay.mountainspring.sswplus.client.modmenu;

import com.terraformersmc.modmenu.api.ConfigScreenFactory;
import com.terraformersmc.modmenu.api.ModMenuApi;

import gay.mountainspring.sswplus.config.SSWPConfig;

public class SSWPModMenu implements ModMenuApi {
	@Override
	public ConfigScreenFactory<?> getModConfigScreenFactory() {
		return parent -> SSWPConfig.getConfigBuilder().setParentScreen(parent).build();
	}
}