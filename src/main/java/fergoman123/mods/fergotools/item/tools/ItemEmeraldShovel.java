package fergoman123.mods.fergotools.item.tools;

import fergoman123.mods.fergotools.item.ModItems;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class ItemEmeraldShovel extends ItemSpade {

	public ItemEmeraldShovel() {
		super(ModItems.emerald);
	}
	
	public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
	{
		return itemstack2.isItemEqual(new ItemStack(ModItems.emeraldCrystal)) || super.getIsRepairable(itemstack1, itemstack2);
	}

}
