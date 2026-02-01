package gay.mountainspring.sswplus.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import gay.mountainspring.sswplus.block.SSWPBlocks;
import gay.mountainspring.sswplus.tag.SSWPTags;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.PotionContentsComponent;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.Items;
import net.minecraft.item.PotionItem;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.potion.Potions;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;

@Mixin(PotionItem.class)
public abstract class PotionItemMixin {
	@Inject(at = @At("HEAD"), method = "useOnBlock(Lnet/minecraft/item/ItemUsageContext;)Lnet/minecraft/util/ActionResult;", cancellable = true)
	private void useOnBlockInjected(ItemUsageContext context, CallbackInfoReturnable<ActionResult> info) {
		World world = context.getWorld();
		BlockPos pos = context.getBlockPos();
		PlayerEntity player = context.getPlayer();
		ItemStack stack = context.getStack();
		PotionContentsComponent potion = stack.getOrDefault(DataComponentTypes.POTION_CONTENTS, PotionContentsComponent.DEFAULT);
		BlockState state = world.getBlockState(pos);
		if (context.getSide() != Direction.DOWN && potion.matches(Potions.WATER)) {
			Block result = null;
			if (state.isIn(SSWPTags.Blocks.CONVERTS_TO_MUD_SLAB)) result = SSWPBlocks.MUD_SLAB;
			else if (state.isIn(SSWPTags.Blocks.CONVERTS_TO_MUD_STAIRS)) result = SSWPBlocks.MUD_STAIRS;
			else if (state.isIn(SSWPTags.Blocks.CONVERTS_TO_MUD_WALL)) result = SSWPBlocks.MUD_WALL;
			
			if (result != null) {
				world.playSound(null, pos, SoundEvents.ENTITY_GENERIC_SPLASH, SoundCategory.BLOCKS, 1.0F, 1.0F);
				player.setStackInHand(context.getHand(), ItemUsage.exchangeStack(stack, player, new ItemStack(Items.GLASS_BOTTLE)));
				player.incrementStat(Stats.USED.getOrCreateStat(stack.getItem()));
				if (!world.isClient) {
					ServerWorld serverWorld = (ServerWorld)world;
					
					for (int i = 0; i < 5; i++) {
						serverWorld.spawnParticles(
							ParticleTypes.SPLASH,
							pos.getX() + world.random.nextDouble(),
							pos.getY() + 1,
							pos.getZ() + world.random.nextDouble(),
							1,
							0.0,
							0.0,
							0.0,
							1.0
						);
					}
				}
				
				world.playSound(null, pos, SoundEvents.ITEM_BOTTLE_EMPTY, SoundCategory.BLOCKS, 1.0F, 1.0F);
				world.emitGameEvent(null, GameEvent.FLUID_PLACE, pos);
				world.setBlockState(pos, result.getStateWithProperties(state));
				info.setReturnValue(ActionResult.success(world.isClient));
			}
		}
	}
}