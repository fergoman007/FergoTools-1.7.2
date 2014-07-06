package fergoman123.mods.fergotools.item.shovel;

import fergoman123.mods.fergotools.item.materials.ItemCoalIngot;
import fergoman123.mods.fergotools.lib.strings.ToolStrings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.ShovelGeneric;
import net.minecraft.item.ItemStack;

public class ItemCoalShovel extends ShovelGeneric {

    public static ItemCoalShovel instance = new ItemCoalShovel();

    public ItemCoalShovel() {
        super(UtilToolArmor.coal);
        this.setUnlocalizedName(ToolStrings.coalShovel);
        this.setMaxDamage(UtilToolArmor.getCoalMaxUses());
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ItemCoalIngot.instance)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
