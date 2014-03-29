package fergoman123.mods.fergotools.item.tools;

import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.item.ModItems;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class ItemBronzeShovel extends ItemSpade {
	
	public static FergoTools mod;

	public ItemBronzeShovel() {
		super(ModItems.bronze);
	}
	
	public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
	{
		return itemstack2.isItemEqual(new ItemStack(ModItems.bronzeIngot)) || super.getIsRepairable(itemstack1, itemstack2);
	}

}
