package fergoman123.mods.fergotools.item.hoe;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 14/04/2014.
 */
public class ItemGlowstoneHoe extends ItemHoe {

    public ItemGlowstoneHoe() {
        super(ToolArmorMaterials.glowstone);
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ModItems.glowstoneIngot)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
