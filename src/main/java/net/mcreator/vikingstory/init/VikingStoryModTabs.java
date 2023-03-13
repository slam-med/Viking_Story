
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.vikingstory.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class VikingStoryModTabs {
	public static CreativeModeTab TAB_VIKING_STORY;

	public static void load() {
		TAB_VIKING_STORY = new CreativeModeTab("tabviking_story") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(VikingStoryModItems.IRON_AX.get());
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
