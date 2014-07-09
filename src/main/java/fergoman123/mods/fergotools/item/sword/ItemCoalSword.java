package fergoman123.mods.fergotools.item.sword;

import fergoman123.mods.fergotools.item.materials.ItemCoalIngot;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.SwordGeneric;
import net.minecraft.item.ItemStack;

public class ItemCoalSword extends SwordGeneric {

    public static ItemCoalSword instance = new ItemCoalSword();

    public ItemCoalSword() {
        super(UtilToolArmor.coal);
        this.setUnlocalizedName(Names.Items.coalSword);
        this.setMaxDamage(UtilToolArmor.getCoalMaxUses());
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ItemCoalIngot.instance)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
