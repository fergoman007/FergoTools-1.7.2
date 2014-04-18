package fergoman123.mods.fergotools.item.axe;

import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import net.minecraft.init.Items;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 13/04/2014.
 */
public class ItemQuartzAxe extends ItemAxe {

    public ItemQuartzAxe() {
        super(ToolArmorMaterials.quartz);
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(Items.quartz)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
