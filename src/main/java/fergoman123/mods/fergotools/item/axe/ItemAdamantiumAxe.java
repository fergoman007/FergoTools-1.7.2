package fergoman123.mods.fergotools.item.axe;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 13/04/2014.
 */
public class ItemAdamantiumAxe extends ItemAxe {

    public ItemAdamantiumAxe()
    {
        super(UtilToolArmor.adamantium);
    }

    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return par2ItemStack.isItemEqual(new ItemStack(ModItems.fergoMaterials, 1, 6)) || super.getIsRepairable(par1ItemStack, par2ItemStack);
    }

}
