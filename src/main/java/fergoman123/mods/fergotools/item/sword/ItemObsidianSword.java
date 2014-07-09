package fergoman123.mods.fergotools.item.sword;

import fergoman123.mods.fergotools.item.materials.ItemObsidianIngot;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.SwordGeneric;
import net.minecraft.item.ItemStack;

public class ItemObsidianSword extends SwordGeneric {

    public static ItemObsidianSword instance = new ItemObsidianSword();

    public ItemObsidianSword() {
        super(UtilToolArmor.obsidian);
        this.setUnlocalizedName(Names.Items.obsidianSword);
        this.setMaxDamage(UtilToolArmor.getObsidianMaxUses());
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ItemObsidianIngot.instance)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
