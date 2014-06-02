package fergoman123.mods.fergotools.item.hoe;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.HoeGeneric;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 14/04/2014.
 */
public class ItemObsidianHoe extends HoeGeneric {

    public ItemObsidianHoe() {
        super(UtilToolArmor.obsidian);
        this.setUnlocalizedName(Strings.ToolStrings.obsidianHoe);
        this.setMaxDamage(UtilToolArmor.obsidian.getMaxUses());
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ModItems.obsidianIngot)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
