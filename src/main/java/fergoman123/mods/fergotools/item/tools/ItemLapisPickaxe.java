package fergoman123.mods.fergotools.item.tools;

import fergoman123.mods.fergotools.item.ModItems;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class ItemLapisPickaxe extends ItemPickaxe {

	public ItemLapisPickaxe() {
		super(ModItems.lapis);
	}
	
	public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
	{
		return itemstack2.isItemEqual(new ItemStack(ModItems.lapisCrystal)) || super.getIsRepairable(itemstack1, itemstack2);
	}

}
