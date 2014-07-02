package fergoman123.mods.fergotools.item.axe;

import fergoman123.mods.fergotools.item.materials.ItemObsidianIngot;
import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.AxeGeneric;
import net.minecraft.item.ItemStack;

public class ItemObsidianAxe extends AxeGeneric {

    public static ItemObsidianAxe instance = new ItemObsidianAxe();

    public ItemObsidianAxe() {
        super(UtilToolArmor.obsidian);
        this.setUnlocalizedName(Strings.ToolStrings.obsidianAxe);
        this.setMaxDamage(UtilToolArmor.obsidian.getMaxUses());
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ItemObsidianIngot.instance)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}