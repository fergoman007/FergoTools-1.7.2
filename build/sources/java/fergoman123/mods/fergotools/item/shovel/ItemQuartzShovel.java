package fergoman123.mods.fergotools.item.shovel;

import fergoman123.mods.fergotools.util.recipe.UtilToolArmor;
import net.minecraft.init.Items;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 14/04/2014.
 */
public class ItemQuartzShovel extends ItemSpade {

    public ItemQuartzShovel() {
        super(UtilToolArmor.quartz);
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(Items.quartz)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}