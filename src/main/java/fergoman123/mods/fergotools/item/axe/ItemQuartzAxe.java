package fergoman123.mods.fergotools.item.axe;

import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.AxeGeneric;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ItemQuartzAxe extends AxeGeneric {

    public static ItemQuartzAxe instance = new ItemQuartzAxe();

    public ItemQuartzAxe() {
        super(UtilToolArmor.quartz);
        this.setUnlocalizedName(Names.Items.quartzAxe);
        this.setMaxDamage(UtilToolArmor.quartz.getMaxUses());
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(Items.quartz)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
