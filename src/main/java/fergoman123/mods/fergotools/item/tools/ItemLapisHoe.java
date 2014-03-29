package fergoman123.mods.fergotools.item.tools;

import fergoman123.mods.fergotools.item.ModItems;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class ItemLapisHoe extends ItemHoe {

	public ItemLapisHoe() {
		super(ModItems.lapis);
    }
	
	public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
	{
		return itemstack2.isItemEqual(new ItemStack(ModItems.lapisCrystal)) || super.getIsRepairable(itemstack1, itemstack2);
	}

}
