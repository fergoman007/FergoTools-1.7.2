package fergoman123.mods.fergotools.item.hoe;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 14/04/2014.
 */
public class ItemAdamantiumHoe extends ItemHoe {

    public ItemAdamantiumHoe() {
        super(UtilToolArmor.adamantium);
    }

    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return par2ItemStack.isItemEqual(new ItemStack(ModItems.fergoMaterials, 1, 6)) || super.getIsRepairable(par1ItemStack, par2ItemStack);
    }

}
