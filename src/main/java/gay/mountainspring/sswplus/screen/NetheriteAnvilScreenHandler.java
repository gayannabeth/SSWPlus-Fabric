package gay.mountainspring.sswplus.screen;

import gay.mountainspring.sswplus.block.SSWPBlocks;
import gay.mountainspring.sswplus.config.SSWPConfig;
import it.unimi.dsi.fastutil.objects.Object2IntMap.Entry;
import net.minecraft.block.BlockState;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.ItemEnchantmentsComponent;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.screen.AnvilScreenHandler;
import net.minecraft.screen.ScreenHandlerContext;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.text.Text;
import net.minecraft.util.StringHelper;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.random.LocalRandom;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.WorldEvents;

public class NetheriteAnvilScreenHandler extends AnvilScreenHandler {
	public NetheriteAnvilScreenHandler(int syncId, PlayerInventory inventory) {
		this(syncId, inventory, ScreenHandlerContext.EMPTY);
	}
	
	public NetheriteAnvilScreenHandler(int syncId, PlayerInventory inventory, ScreenHandlerContext context) {
		super(syncId, inventory, context);
	}
	
	@Override
	protected boolean canUse(BlockState state) {
		return state.isOf(SSWPBlocks.NETHERITE_ANVIL);
	}
	
	@Override
	protected void onTakeOutput(PlayerEntity player, ItemStack stack) {
		if (!player.getAbilities().creativeMode) {
			player.addExperienceLevels(-this.levelCost.get());
		}
		
		this.input.setStack(0, ItemStack.EMPTY);
		if (this.repairItemUsage > 0) {
			ItemStack itemStack = this.input.getStack(1);
			if (!itemStack.isEmpty() && itemStack.getCount() > this.repairItemUsage) {
				itemStack.decrement(this.repairItemUsage);
				this.input.setStack(1, itemStack);
			} else {
				this.input.setStack(1, ItemStack.EMPTY);
			}
		} else {
			this.input.setStack(1, ItemStack.EMPTY);
		}
		
		this.levelCost.set(0);
		this.context.run((world, pos) -> {
			world.syncWorldEvent(WorldEvents.ANVIL_USED, pos, 0);
		});
	}
	
	@Override
	public void updateResult() {
		ItemStack itemStack = this.input.getStack(0);
		this.levelCost.set(1);
		int i = 0;
		long l = 0L;
		int j = 0;
		if (!itemStack.isEmpty() && EnchantmentHelper.canHaveEnchantments(itemStack)) {
			ItemStack itemStack2 = itemStack.copy();
			ItemStack itemStack3 = this.input.getStack(1);
			ItemEnchantmentsComponent.Builder builder = new ItemEnchantmentsComponent.Builder(EnchantmentHelper.getEnchantments(itemStack2));
			l += (long)itemStack.getOrDefault(DataComponentTypes.REPAIR_COST, 0).intValue() + itemStack3.getOrDefault(DataComponentTypes.REPAIR_COST, 0).intValue();
			this.repairItemUsage = 0;
			if (!itemStack3.isEmpty()) {
				boolean bl = itemStack3.contains(DataComponentTypes.STORED_ENCHANTMENTS);
				if (itemStack2.isDamageable() && itemStack2.getItem().canRepair(itemStack, itemStack3)) {
					int k = Math.min(itemStack2.getDamage(), itemStack2.getMaxDamage() / 4);
					if (k <= 0) {
						this.output.setStack(0, ItemStack.EMPTY);
						this.levelCost.set(0);
						return;
					}
					
					int m;
					for (m = 0; k > 0 && m < itemStack3.getCount(); m++) {
						int n = itemStack2.getDamage() - k;
						itemStack2.setDamage(n);
						i++;
						k = Math.min(itemStack2.getDamage(), itemStack2.getMaxDamage() / 4);
					}
					
					this.repairItemUsage = m;
				} else {
					if (!bl && (!itemStack2.isOf(itemStack3.getItem()) || !itemStack2.isDamageable())) {
						this.output.setStack(0, ItemStack.EMPTY);
						this.levelCost.set(0);
						return;
					}
					
					if (itemStack2.isDamageable() && !bl) {
						int kx = itemStack.getMaxDamage() - itemStack.getDamage();
						int m = itemStack3.getMaxDamage() - itemStack3.getDamage();
						int n = m + itemStack2.getMaxDamage() * 12 / 100;
						int o = kx + n;
						int p = itemStack2.getMaxDamage() - o;
						if (p < 0) {
							p = 0;
						}
						
						if (p < itemStack2.getDamage()) {
							itemStack2.setDamage(p);
							i += 2;
						}
					}
					
					ItemEnchantmentsComponent itemEnchantmentsComponent = EnchantmentHelper.getEnchantments(itemStack3);
					boolean bl2 = false;
					boolean bl3 = false;
					
					for (Entry<RegistryEntry<Enchantment>> entry : itemEnchantmentsComponent.getEnchantmentEntries()) {
						RegistryEntry<Enchantment> registryEntry = (RegistryEntry<Enchantment>)entry.getKey();
						int q = builder.getLevel(registryEntry);
						int r = entry.getIntValue();
						r = q == r ? r + 1 : Math.max(r, q);
						Enchantment enchantment = registryEntry.value();
						boolean bl4 = enchantment.isAcceptableItem(itemStack);
						if (this.player.getAbilities().creativeMode || itemStack.isOf(Items.ENCHANTED_BOOK)) {
							bl4 = true;
						}
						
						for (RegistryEntry<Enchantment> registryEntry2 : builder.getEnchantments()) {
							if (!registryEntry2.equals(registryEntry) && !Enchantment.canBeCombined(registryEntry, registryEntry2)) {
								bl4 = false;
								i++;
							}
						}
						
						if (!bl4) {
							bl3 = true;
						} else {
							bl2 = true;
							if (r > enchantment.getMaxLevel()) {
								r = enchantment.getMaxLevel();
							}
							
							builder.set(registryEntry, r);
							int s = enchantment.getAnvilCost();
							if (bl) {
								s = Math.max(1, s / 2);
							}
							
							i += s * r;
							if (itemStack.getCount() > 1) {
								i = 40;
							}
						}
					}
					
					if (bl3 && !bl2) {
						this.output.setStack(0, ItemStack.EMPTY);
						this.levelCost.set(0);
						return;
					}
				}
			}
			
			if (this.newItemName != null && !StringHelper.isBlank(this.newItemName)) {
				if (!this.newItemName.equals(itemStack.getName().getString())) {
					j = 1;
					i += j;
					itemStack2.set(DataComponentTypes.CUSTOM_NAME, Text.literal(this.newItemName));
				}
			} else if (itemStack.contains(DataComponentTypes.CUSTOM_NAME)) {
				j = 1;
				i += j;
				itemStack2.remove(DataComponentTypes.CUSTOM_NAME);
			}
			
			int t = (int)MathHelper.clamp(l + i, 0L, 2147483647L);
			this.levelCost.set(t);
			if (i <= 0) {
				itemStack2 = ItemStack.EMPTY;
			}
			
			if (j == i && j > 0 && this.levelCost.get() >= 40) {
				this.levelCost.set(39);
			}
			
			if (!itemStack2.isEmpty()) {
				int kxx = itemStack2.getOrDefault(DataComponentTypes.REPAIR_COST, 0);
				if (kxx < itemStack3.getOrDefault(DataComponentTypes.REPAIR_COST, 0)) {
					kxx = itemStack3.getOrDefault(DataComponentTypes.REPAIR_COST, 0);
				}
				
				Random rand = new LocalRandom(System.currentTimeMillis());
				if ((j != i || j == 0) && rand.nextFloat() < SSWPConfig.getInstance().getNoRepairCostChance()) {
					kxx = getNextCost(kxx);
				}
				
				itemStack2.set(DataComponentTypes.REPAIR_COST, kxx);
				EnchantmentHelper.set(itemStack2, builder.build());
			}
			
			this.output.setStack(0, itemStack2);
			this.sendContentUpdates();
		} else {
			this.output.setStack(0, ItemStack.EMPTY);
			this.levelCost.set(0);
		}
	}
	
	@Override
	public ScreenHandlerType<?> getType() {
		return SSWPScreenHandlerTypes.NETHERITE_ANVIL;
	}
}