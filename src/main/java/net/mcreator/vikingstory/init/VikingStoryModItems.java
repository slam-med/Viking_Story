
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vikingstory.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.vikingstory.item.IronaxItem;
import net.mcreator.vikingstory.item.CrystalItem;
import net.mcreator.vikingstory.VikingStoryMod;

public class VikingStoryModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, VikingStoryMod.MODID);
	public static final RegistryObject<Item> CRYSTAL = REGISTRY.register("crystal", () -> new CrystalItem());
	public static final RegistryObject<Item> IRON_AX = REGISTRY.register("iron_ax", () -> new IronaxItem());
	public static final RegistryObject<Item> CRYSTALCLUSTER = block(VikingStoryModBlocks.CRYSTALCLUSTER, VikingStoryModTabs.TAB_VIKING_STORY);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
