package fergoman123.mods.fergotools.item.sword;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

/**
 * Created by Fergoman123 on 13/04/2014.
 */
public class ItemCoalSword extends ItemSword {

    public ItemCoalSword() {
        super(ToolArmorMaterials.coal);
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ModItems.coalIngot)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
