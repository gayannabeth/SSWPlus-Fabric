package gay.mountainspring.sswplus.datagen;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class SSWPDataGen implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator gen) {
		FabricDataGenerator.Pack pack = gen.createPack();
		
		pack.addProvider(SSWPBlockLootGen::new);
		pack.addProvider(SSWPBlockStatesModelGen::new);
		pack.addProvider(SSWPLangGen.USEnglish::new);
		pack.addProvider(SSWPLangGen.CAEnglish::new);
		pack.addProvider(SSWPRecipeGen::new);
		SSWPTagGen.BlockTagGen blockTagGen = pack.addProvider(SSWPTagGen.BlockTagGen::new);
		pack.addProvider((output, lookup) -> new SSWPTagGen.ItemTagGen(output, lookup, blockTagGen));
	}
}