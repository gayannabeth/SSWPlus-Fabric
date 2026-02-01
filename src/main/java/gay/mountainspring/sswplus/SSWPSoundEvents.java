package gay.mountainspring.sswplus;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class SSWPSoundEvents {
	private SSWPSoundEvents() {}
	
	public static void init() {}
	
	public static final SoundEvent BLOCK_NETHER_BRICK_FENCE_GATE_CLOSE = register("block.nether_brick_fence_gate.close");
	public static final SoundEvent BLOCK_NETHER_BRICK_FENCE_GATE_OPEN = register("block.nether_brick_fence_gate.open");
	
	public static SoundEvent register(String name) {
		var id = Identifier.of(SSWPlus.MOD_ID, name);
		return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
	}
}