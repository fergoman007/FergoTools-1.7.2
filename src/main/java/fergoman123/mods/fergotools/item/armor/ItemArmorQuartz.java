package fergoman123.mods.fergotools.item.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.item.ModItems;
import fergoman123.mods.fergotools.lib.strings.ArmorStrings;

public class ItemArmorQuartz extends ItemArmor {
	
	public ItemArmorQuartz(int type)
	{
		super(ModItems.quartzArmor, FergoTools.proxy.addArmor("quartz"), type);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == ModItems.quartzHelmet || stack.getItem() == ModItems.quartzChestplate || stack.getItem() == ModItems.quartzBoots)
		{
			return ArmorStrings.quartzArmorRender[0];
		}
		
		
		if(stack.getItem() == ModItems.quartzLeggings)
		{
			return ArmorStrings.quartzArmorRender[1];
		}
		else
		{
			return null;
		}
	}

}
