
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.amulets.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class AmuletsModTabs {
	public static CreativeModeTab TAB_AMULETS;

	public static void load() {
		TAB_AMULETS = new CreativeModeTab("tabamulets") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(Blocks.AMETHYST_BLOCK);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
