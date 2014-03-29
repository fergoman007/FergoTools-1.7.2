package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.item.ModItems;
import fergoman123.mods.fergotools.lib.strings.Strings;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemArmorLapis extends  ItemArmor{
	
	public ItemArmorLapis(int type)
	{
		super(ModItems.lapisArmor, FergoTools.proxy.addArmor("lapis"), type);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == ModItems.lapisHelmet || stack.getItem() == ModItems.lapisChestplate || stack.getItem() == ModItems.lapisBoots)
		{
			return Strings.lapisArmorRender[0];
		}
		
		if(stack.getItem() == ModItems.lapisLeggings)
		{
			return Strings.lapisArmorRender[1];
		}
		else
		{
			return null;
		}
	}

}
