package fergoman123.mods.fergotools.item.tools;

import fergoman123.mods.fergotools.item.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemEmeraldSword extends ItemSword {

	public ItemEmeraldSword() {
		super(ModItems.emerald);
	}
	
	public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
	{
		return itemstack2.isItemEqual(new ItemStack(ModItems.emeraldCrystal)) || super.getIsRepairable(itemstack1, itemstack2);
	}

}
