package fergoman123.mods.fergotools.item.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.item.ModItems;
import fergoman123.mods.fergotools.lib.strings.ArmorStrings;

public class ItemArmorCoal extends ItemArmor{
	
	public ItemArmorCoal(int type)
	{
		super(ModItems.coalArmor, FergoTools.proxy.addArmor("coal"), type);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == ModItems.coalHelmet || stack.getItem() == ModItems.coalChestplate || stack.getItem() == ModItems.coalBoots)
		{
			return ArmorStrings.coalArmorRender[0];
		}
		
		if(stack.getItem() == ModItems.coalLeggings)
		{
			return ArmorStrings.coalArmorRender[1];
		}
		else
		{
			return null;
		}
	}

}
