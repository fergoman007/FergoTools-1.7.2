package fergoman123.mods.fergotools.item.tools;

import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.item.ModItems;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemBronzeSword extends ItemSword {

	public static FergoTools mod;
		
	public ItemBronzeSword() {
		super(ModItems.bronze);
	}

	
	public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
	{
		return itemstack2.isItemEqual(new ItemStack(ModItems.bronzeIngot)) || super.getIsRepairable(itemstack1, itemstack2);
	}

}
