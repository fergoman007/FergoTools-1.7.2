package fergoman123.mods.fergotools.item.shovel;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 14/04/2014.
 */
public class ItemEmeraldShovel extends ItemSpade {

    public ItemEmeraldShovel() {
        super(UtilToolArmor.emerald);
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ModItems.fergoMaterials, 1, 1)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
