package fergoman123.mods.fergotools.item.tools;

import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.item.ModItems;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class ItemBronzeHoe extends ItemHoe {
	
	public static FergoTools mod;

	public ItemBronzeHoe() {
		super(ModItems.bronze);
	}
	
	public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
	{
		return itemstack2.isItemEqual(new ItemStack(ModItems.bronzeIngot)) || super.getIsRepairable(itemstack1, itemstack2);
	}

}
