
package net.mcreator.vikingstory.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import net.mcreator.vikingstory.init.VikingStoryModTabs;

public class CrystalItem extends Item {
	public CrystalItem() {
		super(new Item.Properties().tab(VikingStoryModTabs.TAB_VIKING_STORY).stacksTo(32).rarity(Rarity.RARE));
	}
}
