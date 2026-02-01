package gay.mountainspring.sswplus.config;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Paths;

import com.google.gson.Gson;
import com.google.gson.InstanceCreator;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import gay.mountainspring.sswplus.SSWPlus;
import me.shedaniel.clothconfig2.api.ConfigBuilder;
import me.shedaniel.clothconfig2.api.ConfigCategory;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;
import net.minecraft.text.Text;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.math.MathHelper;

public class SSWPConfig {
	private SSWPConfig() {}
	
	public static SSWPConfig getInstance() {return INSTANCE;}
	
	private static SSWPConfig INSTANCE = new SSWPConfig();
	
	private static final SSWPConfig.Serializer SERIALIZER = new SSWPConfig.Serializer();
	
	public float getNoRepairCostChance() {
		return this.netheriteAnvilNoRepairCostChance;
	}
	
	public float getNetheriteAnvilAdditionalDamage() {
		return this.netheriteAnvilAdditionalDamage;
	}
	
	private float netheriteAnvilNoRepairCostChance = 0.5f;
	private float netheriteAnvilAdditionalDamage = 2.0f;
	
	public static void init() {
		File file = Paths.get("config/sswplus.json").toFile();
		Gson gson = SSWPlus.GSON;
		
		try {
			if (!file.exists()) createNewConfigFile(file);
			FileReader fileReader = new FileReader(file);
			
			INSTANCE = gson.fromJson(fileReader, SSWPConfig.class);
			
			if (INSTANCE == null) INSTANCE = new SSWPConfig();
			
			INSTANCE.netheriteAnvilNoRepairCostChance = MathHelper.clamp(INSTANCE.netheriteAnvilNoRepairCostChance, 0.0f, 1.0f);
			INSTANCE.netheriteAnvilAdditionalDamage = MathHelper.clamp(INSTANCE.netheriteAnvilAdditionalDamage, 0.0f, 1000.0f);
			
			fileReader.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
		SSWPlus.LOGGER.info("Chance of not increasing item repair cost when using netherite anvil: " + INSTANCE.netheriteAnvilNoRepairCostChance);
		SSWPlus.LOGGER.info("Damage from falling netherite anvil: " + (INSTANCE.netheriteAnvilAdditionalDamage + 2.0f));
	}
	
	public static void save() {
		File file = Paths.get("config/sswplus.json").toFile();
		Gson gson = SSWPlus.GSON;
		
		try {
			if (!file.exists()) file.createNewFile();
			FileWriter fileWriter = new FileWriter(file, false);
			
			gson.toJson(INSTANCE, fileWriter);
			
			fileWriter.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	private static void createNewConfigFile(File file) throws IOException {
		file.createNewFile();
		FileWriter fileWriter = new FileWriter(file);
		Gson gson = SSWPlus.GSON;
		gson.toJson(new SSWPConfig(), fileWriter);
		fileWriter.close();
	}
	
	public static ConfigBuilder getConfigBuilder() {
		ConfigBuilder builder =  ConfigBuilder.create()
				.setTitle(Text.translatable(SSWPlus.MOD_ID + ".config"))
				.setSavingRunnable(SSWPConfig::save);
		
		ConfigCategory cat = builder.getOrCreateCategory(Text.of("dummy"));
		
		ConfigEntryBuilder entryBuilder = builder.entryBuilder();
		
		cat.addEntry(entryBuilder.startFloatField(Text.translatable(SSWPlus.MOD_ID + ".config.netherite_anvil.no_repair_cost_chance"), INSTANCE.netheriteAnvilNoRepairCostChance)
				.setDefaultValue(0.5f)
				.setTooltip(Text.translatable(SSWPlus.MOD_ID + ".config.netherite_anvil.no_repair_cost_chance.tooltip"))
				.setSaveConsumer(f -> INSTANCE.netheriteAnvilNoRepairCostChance = f)
				.build())
		.addEntry(entryBuilder.startFloatField(Text.translatable(SSWPlus.MOD_ID + ".config.netherite_anvil.extra_damage"), INSTANCE.netheriteAnvilAdditionalDamage)
				.setDefaultValue(2.0f)
				.setTooltip(Text.translatable(SSWPlus.MOD_ID + ".config.netherite_anvil.extra_damage.tooltip"))
				.setSaveConsumer(f -> INSTANCE.netheriteAnvilAdditionalDamage = f)
				.build());
		
		return builder;
	}
	
	public static SSWPConfig.Serializer getSerializer() {
		return SERIALIZER;
	}
	
	private static class Serializer implements JsonSerializer<SSWPConfig>, JsonDeserializer<SSWPConfig>, InstanceCreator<SSWPConfig> {
		@Override
		public SSWPConfig createInstance(Type type) {
			return new SSWPConfig();
		}
		
		@Override
		public SSWPConfig deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
			if (json.isJsonObject()) {
				JsonObject jsonObject = json.getAsJsonObject();
				float noRepairCostChance = JsonHelper.getFloat(jsonObject, "netherite_anvil_no_repair_cost_chance", 0.5f);
				float netheriteAnvilExtraFallDamage = JsonHelper.getFloat(jsonObject, "netherite_anvil_additional_damage", 2.0f);
				SSWPConfig config = new SSWPConfig();
				config.netheriteAnvilNoRepairCostChance = MathHelper.clamp(noRepairCostChance, 0.0f, 1.0f);
				config.netheriteAnvilAdditionalDamage = netheriteAnvilExtraFallDamage < 0.0f ? 0.0f : netheriteAnvilExtraFallDamage;
				return config;
			} else {
				throw new JsonParseException("Given json element is not a json object!");
			}
		}
		
		@Override
		public JsonElement serialize(SSWPConfig src, Type typeOfSrc, JsonSerializationContext context) {
			JsonObject jsonObject = new JsonObject();
			jsonObject.addProperty("netherite_anvil_no_repair_cost_chance", src.netheriteAnvilNoRepairCostChance);
			jsonObject.addProperty("netherite_anvil_additional_damage", src.netheriteAnvilAdditionalDamage);
			return jsonObject;
		}
	}
}