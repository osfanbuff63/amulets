
package net.mcreator.amulets.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.mcreator.amulets.init.AmuletsModTabs;

public class Ameythst_OreDustItem extends Item {
	public Ameythst_OreDustItem() {
		super(new Item.Properties().tab(AmuletsModTabs.TAB_AMULETS).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("ameythst_ore_dust");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
