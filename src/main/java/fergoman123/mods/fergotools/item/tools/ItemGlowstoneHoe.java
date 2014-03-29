package fergoman123.mods.fergotools.item.tools;

import fergoman123.mods.fergotools.item.ModItems;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class ItemGlowstoneHoe extends ItemHoe {

	public ItemGlowstoneHoe() {
		super(ModItems.glowstone);
	}
	
	public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
	{
		return itemstack2.isItemEqual(new ItemStack(ModItems.glowstoneIngot)) || super.getIsRepairable(itemstack1, itemstack2);
	}

}
