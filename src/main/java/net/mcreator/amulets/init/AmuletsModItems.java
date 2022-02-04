
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.amulets.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.amulets.item.Ameythst_OreDustItem;
import net.mcreator.amulets.item.AmeythstItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AmuletsModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item AMEYTHST = register(new AmeythstItem());
	public static final Item AMEYTHST_ORE_DUST = register(new Ameythst_OreDustItem());
	public static final Item AMEYTHST_ORE_ORE = register(AmuletsModBlocks.AMEYTHST_ORE_ORE, AmuletsModTabs.TAB_AMULETS);
	public static final Item AMEYTHST_ORE_BLOCK = register(AmuletsModBlocks.AMEYTHST_ORE_BLOCK, AmuletsModTabs.TAB_AMULETS);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
