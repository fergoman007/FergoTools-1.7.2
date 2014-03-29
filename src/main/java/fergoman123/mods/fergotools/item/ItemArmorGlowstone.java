package fergoman123.mods.fergotools.item;

import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.lib.strings.Strings;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemArmorGlowstone extends ItemArmor {
	
	public ItemArmorGlowstone(int type)
	{
		super(ModItems.glowstoneArmor, FergoTools.proxy.addArmor("glowstone"), type);
	}

	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == ModItems.glowstoneHelmet || stack.getItem() == ModItems.glowstoneChestplate || stack.getItem() == ModItems.glowstoneBoots)
		{
			return Strings.glowstoneArmorRender[0];
		}
		
		if(stack.getItem() == ModItems.glowstoneLeggings)
		{
			return Strings.glowstoneArmorRender[1];
		}
		else
		{
			return null;
		}
	}

}
