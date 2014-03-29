package fergoman123.mods.fergotools.item.tools;

import fergoman123.mods.fergotools.item.ModItems;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class ItemLapisShovel extends ItemSpade {

	public ItemLapisShovel() {
		super(ModItems.lapis);
	}
	
	public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
	{
		return itemstack2.isItemEqual(new ItemStack(ModItems.lapisCrystal)) || super.getIsRepairable(itemstack1, itemstack2);
	}

}
