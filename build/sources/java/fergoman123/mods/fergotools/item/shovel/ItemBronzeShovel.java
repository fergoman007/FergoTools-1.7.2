package fergoman123.mods.fergotools.item.shovel;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.util.recipe.UtilToolArmor;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 14/04/2014.
 */
public class ItemBronzeShovel extends ItemSpade {

    public ItemBronzeShovel() {
        super(UtilToolArmor.bronze);
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ModItems.fergoMaterials, 1, 3)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
