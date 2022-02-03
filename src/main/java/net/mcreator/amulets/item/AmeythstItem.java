
package net.mcreator.amulets.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.amulets.procedures.AmeythstRightClickedInAirProcedure;
import net.mcreator.amulets.procedures.AmeythstItemInHandTickProcedure;
import net.mcreator.amulets.init.AmuletsModTabs;

public class AmeythstItem extends Item {
	public AmeythstItem() {
		super(new Item.Properties().tab(AmuletsModTabs.TAB_AMULETS).durability(32).rarity(Rarity.UNCOMMON));
		setRegistryName("ameythst");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

	@Override
	public boolean isFoil(ItemStack itemstack) {
		return true;
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		ItemStack itemstack = ar.getObject();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();

		AmeythstRightClickedInAirProcedure.execute(entity, itemstack);
		return ar;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		if (selected)
			AmeythstItemInHandTickProcedure.execute(entity);
	}
}
