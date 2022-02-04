
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.amulets.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;

import net.mcreator.amulets.block.Ameythst_OreOreBlock;
import net.mcreator.amulets.block.Ameythst_OreBlockBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AmuletsModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block AMEYTHST_ORE_ORE = register(new Ameythst_OreOreBlock());
	public static final Block AMEYTHST_ORE_BLOCK = register(new Ameythst_OreBlockBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}
}
