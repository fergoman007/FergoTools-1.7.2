package fergoman123.mods.fergotools.item.tools;

import fergoman123.mods.fergotools.item.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class ItemQuartzAxe extends ItemAxe {

	public ItemQuartzAxe() {
        super(ModItems.quartz);
	}
	
	public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
	{
		return itemstack2.isItemEqual(new ItemStack(Items.quartz)) || super.getIsRepairable(itemstack1, itemstack2);
	}

}
