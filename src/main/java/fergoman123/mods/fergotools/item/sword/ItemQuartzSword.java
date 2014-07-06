package fergoman123.mods.fergotools.item.sword;

import fergoman123.mods.fergotools.lib.strings.ToolStrings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.SwordGeneric;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ItemQuartzSword extends SwordGeneric {

    public static ItemQuartzSword instance = new ItemQuartzSword();

    public ItemQuartzSword() {
        super(UtilToolArmor.quartz);
        this.setUnlocalizedName(ToolStrings.quartzSword);
        this.setMaxDamage(UtilToolArmor.quartz.getMaxUses());
    }


    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(Items.quartz)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
