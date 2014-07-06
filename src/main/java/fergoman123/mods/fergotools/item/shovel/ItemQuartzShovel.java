package fergoman123.mods.fergotools.item.shovel;

import fergoman123.mods.fergotools.lib.strings.ToolStrings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.ShovelGeneric;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ItemQuartzShovel extends ShovelGeneric {

    public static ItemQuartzShovel instance = new ItemQuartzShovel();

    public ItemQuartzShovel() {
        super(UtilToolArmor.quartz);
        this.setUnlocalizedName(ToolStrings.quartzShovel);
        this.setMaxDamage(UtilToolArmor.quartz.getMaxUses());
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(Items.quartz)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
