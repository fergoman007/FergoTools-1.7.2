package fergoman123.mods.fergotools.item.shovel;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 14/04/2014.
 */
public class ItemAdamantiumShovel extends ItemSpade {

    public ItemAdamantiumShovel() {
        super(UtilToolArmor.adamantium);
    }

    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return par2ItemStack.isItemEqual(new ItemStack(ModItems.fergoMaterials, 1, 6)) || super.getIsRepairable(par1ItemStack, par2ItemStack);
    }

}
