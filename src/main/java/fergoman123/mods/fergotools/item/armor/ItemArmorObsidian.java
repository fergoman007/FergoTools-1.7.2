package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.item.ModItems;
import fergoman123.mods.fergotools.lib.strings.Strings;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemArmorObsidian extends ItemArmor{
	
	public ItemArmorObsidian(int type)
	{
		super(ModItems.obsidianArmor, FergoTools.proxy.addArmor("obsidian"), type);
	}
	
	public String getArmorTexture(ItemStack is, Entity entity, int slot, String type)
	{
		if(is.getItem() == ModItems.obsidianHelmet || is.getItem() == ModItems.obsidianChestplate || is.getItem() == ModItems.obsidianBoots)
		{
			return Strings.obsidianArmorRender[0];
		}
		
		if(is.getItem() == ModItems.obsidianLeggings)
		{
			return Strings.obsidianArmorRender[1];
		}
		else
		{
			return null;
		}
	}

}
