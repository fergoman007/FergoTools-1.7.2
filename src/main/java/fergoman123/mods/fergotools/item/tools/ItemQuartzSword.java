package fergoman123.mods.fergotools.item.tools;


import fergoman123.mods.fergotools.item.ModItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemQuartzSword extends ItemSword {

	public ItemQuartzSword() {
		super(ModItems.quartz);
	}
	
	public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
	{
		return itemstack2.isItemEqual(new ItemStack(Items.quartz)) || super.getIsRepairable(itemstack1, itemstack2);
	}

}
