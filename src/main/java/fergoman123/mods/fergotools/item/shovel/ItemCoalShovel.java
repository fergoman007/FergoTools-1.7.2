package fergoman123.mods.fergotools.item.shovel;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.ShovelGeneric;
import net.minecraft.item.ItemStack;

public class ItemCoalShovel extends ShovelGeneric {

    public static ItemCoalShovel instance = new ItemCoalShovel();

    public ItemCoalShovel() {
        super(UtilToolArmor.coal);
        this.setUnlocalizedName(Strings.ToolStrings.coalShovel);
        this.setMaxDamage(UtilToolArmor.getCoalMaxUses());
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ModItems.coalIngot)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
