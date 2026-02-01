package gay.mountainspring.sswplus.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import gay.mountainspring.sswplus.block.SSWPBlocks;
import gay.mountainspring.sswplus.tag.SSWPTags;
import net.minecraft.block.BlockState;
import net.minecraft.block.DispenserBlock;
import net.minecraft.block.dispenser.ItemDispenserBehavior;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.potion.Potions;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPointer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.event.GameEvent;

@Mixin(targets = "net.minecraft.block.dispenser.DispenserBehavior$10")
public abstract class PotionDispenserBehaviorMixin extends ItemDispenserBehavior {
	@Inject(at = @At("HEAD"), method = "dispenseSilently(Lnet/minecraft/util/math/BlockPointer;Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/ItemStack;", cancellable = true)
	private void dispenseSilentlyInjected(BlockPointer pointer, ItemStack stack, CallbackInfoReturnable<ItemStack> info) {
		PotionContentsComponent potion = stack.getOrDefault(DataComponentTypes.POTION_CONTENTS, PotionContentsComponent.DEFAULT);
		if (potion.matches(Potions.WATER)) {
			ServerWorld world = pointer.world();
			BlockPos pointerPos = pointer.pos();
			BlockPos targetPos = pointerPos.offset(pointer.state().get(DispenserBlock.FACING));
			BlockState targetState = world.getBlockState(targetPos);
			if (targetState.isIn(SSWPTags.Blocks.CONVERTS_TO_MUD_SLAB)) {
				if (!world.isClient) {
					for (int i = 0; i < 5; i++) {
						world.spawnParticles(
							ParticleTypes.SPLASH,
							pointerPos.getX() + world.random.nextDouble(),
							pointerPos.getY() + 1,
							pointerPos.getZ() + world.random.nextDouble(),
							1,
							0.0,
							0.0,
							0.0,
							1.0
						);
					}
				}
				
				world.playSound(null, pointerPos, SoundEvents.ITEM_BOTTLE_EMPTY, SoundCategory.BLOCKS, 1.0F, 1.0F);
				world.emitGameEvent(null, GameEvent.FLUID_PLACE, pointerPos);
				world.setBlockState(targetPos, SSWPBlocks.MUD_SLAB.getStateWithProperties(targetState));
				info.setReturnValue(this.decrementStackWithRemainder(pointer, stack, new ItemStack(Items.GLASS_BOTTLE)));
			} else if (targetState.isIn(SSWPTags.Blocks.CONVERTS_TO_MUD_STAIRS)) {
				if (!world.isClient) {
					for (int i = 0; i < 5; i++) {
						world.spawnParticles(
							ParticleTypes.SPLASH,
							pointerPos.getX() + world.random.nextDouble(),
							pointerPos.getY() + 1,
							pointerPos.getZ() + world.random.nextDouble(),
							1,
							0.0,
							0.0,
							0.0,
							1.0
						);
					}
				}
				
				world.playSound(null, pointerPos, SoundEvents.ITEM_BOTTLE_EMPTY, SoundCategory.BLOCKS, 1.0F, 1.0F);
				world.emitGameEvent(null, GameEvent.FLUID_PLACE, pointerPos);
				world.setBlockState(targetPos, SSWPBlocks.MUD_STAIRS.getStateWithProperties(targetState));
				info.setReturnValue(this.decrementStackWithRemainder(pointer, stack, new ItemStack(Items.GLASS_BOTTLE)));
			} else if (targetState.isIn(SSWPTags.Blocks.CONVERTS_TO_MUD_WALL)) {
				if (!world.isClient) {
					for (int i = 0; i < 5; i++) {
						world.spawnParticles(
							ParticleTypes.SPLASH,
							pointerPos.getX() + world.random.nextDouble(),
							pointerPos.getY() + 1,
							pointerPos.getZ() + world.random.nextDouble(),
							1,
							0.0,
							0.0,
							0.0,
							1.0
						);
					}
				}
				
				world.playSound(null, pointerPos, SoundEvents.ITEM_BOTTLE_EMPTY, SoundCategory.BLOCKS, 1.0F, 1.0F);
				world.emitGameEvent(null, GameEvent.FLUID_PLACE, pointerPos);
				world.setBlockState(targetPos, SSWPBlocks.MUD_WALL.getStateWithProperties(targetState));
				info.setReturnValue(this.decrementStackWithRemainder(pointer, stack, new ItemStack(Items.GLASS_BOTTLE)));
			}
		}
	}
}