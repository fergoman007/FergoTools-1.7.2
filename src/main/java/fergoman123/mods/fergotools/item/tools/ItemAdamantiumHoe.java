package fergoman123.mods.fergotools.item.tools;

import fergoman123.mods.fergotools.item.ModItems;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class ItemAdamantiumHoe extends ItemHoe{

	public ItemAdamantiumHoe() {
		super(ModItems.adamantium);
	}
	
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return par2ItemStack.isItemEqual(new ItemStack(ModItems.adamantiumIngot)) || super.getIsRepairable(par1ItemStack, par2ItemStack);
    }

}
