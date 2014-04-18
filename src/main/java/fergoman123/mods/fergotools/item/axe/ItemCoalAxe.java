package fergoman123.mods.fergotools.item.axe;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 13/04/2014.
 */
public class ItemCoalAxe extends ItemAxe {

    public ItemCoalAxe() {
        super(ToolArmorMaterials.coal);
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack1.isItemEqual(new ItemStack(ModItems.coalIngot)) || super.getIsRepairable(itemstack1, itemstack2);
    }
}
