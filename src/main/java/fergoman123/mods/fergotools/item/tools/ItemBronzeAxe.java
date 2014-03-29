package fergoman123.mods.fergotools.item.tools;

import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.item.ModItems;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ItemBronzeAxe extends ItemAxe {
	
	public static FergoTools mod;

	public ItemBronzeAxe() {
		super(ModItems.bronze);
	}
	
	public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
	{
		return itemstack2.isItemEqual(new ItemStack(ModItems.bronzeIngot)) || super.getIsRepairable(itemstack1, itemstack2);
	}

}
