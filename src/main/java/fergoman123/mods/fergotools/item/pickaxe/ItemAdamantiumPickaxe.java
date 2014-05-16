package fergoman123.mods.fergotools.item.pickaxe;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 13/04/2014.
 */
public class ItemAdamantiumPickaxe extends ItemPickaxe {

    public ItemAdamantiumPickaxe() {
        super(UtilToolArmor.adamantium);
    }

    public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
    {
        return par2ItemStack.isItemEqual(new ItemStack(ModItems.fergoMaterials, 1, 6)) || super.getIsRepairable(par1ItemStack, par2ItemStack);
    }

}
