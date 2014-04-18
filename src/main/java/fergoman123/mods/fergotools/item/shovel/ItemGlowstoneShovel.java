package fergoman123.mods.fergotools.item.shovel;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.util.item.ToolArmorMaterials;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 14/04/2014.
 */
public class ItemGlowstoneShovel extends ItemSpade {

    public ItemGlowstoneShovel() {
        super(ToolArmorMaterials.glowstone);
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ModItems.glowstoneIngot)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
