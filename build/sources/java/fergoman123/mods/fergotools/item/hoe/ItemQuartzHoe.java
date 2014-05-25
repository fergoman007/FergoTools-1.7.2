package fergoman123.mods.fergotools.item.hoe;

import fergoman123.mods.fergotools.util.recipe.UtilToolArmor;
import net.minecraft.init.Items;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 14/04/2014.
 */
public class ItemQuartzHoe extends ItemHoe {

    public ItemQuartzHoe() {
        super(UtilToolArmor.quartz);
    }


    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2) {
        return itemstack2.isItemEqual(new ItemStack(Items.quartz)) || super.getIsRepairable(itemstack1, itemstack2);
    }
}


