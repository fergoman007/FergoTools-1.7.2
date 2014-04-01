package fergoman123.mods.fergotools.item.armor;

import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.item.ModItems;
import fergoman123.mods.fergotools.lib.strings.ArmorStrings;

public class ItemArmorEmerald extends ItemArmor{
	
	public ItemArmorEmerald(int type)
	{
		super(ModItems.emeraldArmor, FergoTools.proxy.addArmor("emerald"), type);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == ModItems.emeraldHelmet || stack.getItem() == ModItems.emeraldChestplate || stack.getItem() == ModItems.emeraldBoots)
		{
			return ArmorStrings.emeraldArmorRender[0];
		}
		
		if(stack.getItem() == ModItems.emeraldLeggings)
		{
			return ArmorStrings.emeraldArmorRender[1];
		}
		else
		{
			return null;
		}
	}

}
