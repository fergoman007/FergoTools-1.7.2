package fergoman123.mods.fergotools.item.tools;

import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.item.ModItems;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ItemCoalAxe extends ItemAxe {
	
	public static FergoTools mod;

	public ItemCoalAxe() {
		super(ModItems.coal);
	}
	
	public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
	{
		return itemstack1.isItemEqual(new ItemStack(ModItems.coalIngot)) || super.getIsRepairable(itemstack1, itemstack2);
	}

}
