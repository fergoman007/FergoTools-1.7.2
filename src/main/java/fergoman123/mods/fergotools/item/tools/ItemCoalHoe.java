package fergoman123.mods.fergotools.item.tools;

import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.item.ModItems;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class ItemCoalHoe extends ItemHoe {
	
	public static FergoTools mod;

	public ItemCoalHoe()
    {
        super(ModItems.coal);
	}

	public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
	{
		return itemstack2.isItemEqual(new ItemStack(ModItems.coalIngot)) || super.getIsRepairable(itemstack1, itemstack2);
	}

}
