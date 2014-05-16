package fergoman123.mods.fergotools.item.sword;

import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

/**
 * Created by Fergoman123 on 13/04/2014.
 */
public class ItemQuartzSword extends ItemSword {

    public ItemQuartzSword() {
        super(UtilToolArmor.quartz);
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(Items.quartz)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
