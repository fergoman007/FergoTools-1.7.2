package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.item.ModItems;
import fergoman123.mods.fergotools.lib.strings.Strings;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemArmorCoal extends ItemArmor{
	
	public ItemArmorCoal(int type)
	{
		super(ModItems.coalArmor, FergoTools.proxy.addArmor("coal"), type);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == ModItems.coalHelmet || stack.getItem() == ModItems.coalChestplate || stack.getItem() == ModItems.coalBoots)
		{
			return Strings.coalArmorRender[0];
		}
		
		if(stack.getItem() == ModItems.coalLeggings)
		{
			return Strings.coalArmorRender[1];
		}
		else
		{
			return null;
		}
	}

}
