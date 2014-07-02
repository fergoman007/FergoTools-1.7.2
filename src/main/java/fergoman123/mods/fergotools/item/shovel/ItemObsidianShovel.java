package fergoman123.mods.fergotools.item.shovel;

import fergoman123.mods.fergotools.item.materials.ItemObsidianIngot;
import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.ShovelGeneric;
import net.minecraft.item.ItemStack;

public class ItemObsidianShovel extends ShovelGeneric {

    public static ItemObsidianShovel instance = new ItemObsidianShovel();

    public ItemObsidianShovel() {
        super(UtilToolArmor.obsidian);
        this.setUnlocalizedName(Strings.ToolStrings.obsidianShovel);
        this.setMaxDamage(UtilToolArmor.getObsidianMaxUses());
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ItemObsidianIngot.instance)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
