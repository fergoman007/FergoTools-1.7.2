package fergoman123.mods.fergotools.item.hoe;

import fergoman123.mods.fergotools.item.materials.ItemCoalIngot;
import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.HoeGeneric;
import net.minecraft.item.ItemStack;

public class ItemCoalHoe extends HoeGeneric {

    public static ItemCoalHoe instance = new ItemCoalHoe();

    public ItemCoalHoe()
    {
        super(UtilToolArmor.coal);
        this.setUnlocalizedName(Strings.ToolStrings.coalHoe);
        this.setMaxDamage(UtilToolArmor.coal.getMaxUses());
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ItemCoalIngot.instance)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
