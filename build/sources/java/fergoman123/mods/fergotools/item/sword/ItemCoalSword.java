package fergoman123.mods.fergotools.item.sword;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.util.recipe.UtilToolArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

/**
 * Created by Fergoman123 on 13/04/2014.
 */
public class ItemCoalSword extends ItemSword {

    public ItemCoalSword() {
        super(UtilToolArmor.coal);
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ModItems.fergoMaterials, 1, 4)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
