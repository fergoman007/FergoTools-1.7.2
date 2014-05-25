package fergoman123.mods.fergotools.item.axe;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.util.recipe.UtilToolArmor;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 13/04/2014.
 */
public class ItemLapisAxe extends ItemAxe {

    public ItemLapisAxe() {
        super(UtilToolArmor.lapis);
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ModItems.fergoMaterials, 1, 2)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}