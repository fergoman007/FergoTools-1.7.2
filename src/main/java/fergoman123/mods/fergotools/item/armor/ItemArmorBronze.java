package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.item.ModItems;
import fergoman123.mods.fergotools.lib.strings.Strings;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemArmorBronze extends ItemArmor{
	
	public ItemArmorBronze(int type)
	{
		super(ModItems.bronzeArmor, FergoTools.proxy.addArmor("bronze"), type);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == ModItems.bronzeHelmet || stack.getItem() == ModItems.bronzeChestplate || stack.getItem() == ModItems.bronzeBoots)
		{
			return Strings.bronzeArmorRender[0];
		}
		
		if(stack.getItem() == ModItems.bronzeLeggings)
		{
			return Strings.bronzeArmorRender[1];
		}
		else
		{
			return null;
		}
	}

}
