package fergoman123.mods.fergotools.item.armor;

import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.item.ModItems;
import fergoman123.mods.fergotools.lib.strings.Strings;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class ItemArmorEmerald extends ItemArmor{
	
	public ItemArmorEmerald(int type)
	{
		super(ModItems.emeraldArmor, FergoTools.proxy.addArmor("emerald"), type);
	}
	
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type)
	{
		if(stack.getItem() == ModItems.emeraldHelmet || stack.getItem() == ModItems.emeraldChestplate || stack.getItem() == ModItems.emeraldBoots)
		{
			return Strings.emeraldArmorRender[0];
		}
		
		if(stack.getItem() == ModItems.emeraldLeggings)
		{
			return Strings.emeraldArmorRender[1];
		}
		else
		{
			return null;
		}
	}

}
