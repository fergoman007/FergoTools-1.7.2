package fergoman123.mods.fergotools.item.hoe;

import fergoman123.mods.fergotools.item.materials.ItemGlowstoneIngot;
import fergoman123.mods.fergotools.lib.strings.ToolStrings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.HoeGeneric;
import net.minecraft.item.ItemStack;

public class ItemGlowstoneHoe extends HoeGeneric {

    public static ItemGlowstoneHoe instance = new ItemGlowstoneHoe();

    public ItemGlowstoneHoe() {
        super(UtilToolArmor.glowstone);
        this.setUnlocalizedName(ToolStrings.glowstoneHoe);
        this.setMaxDamage(UtilToolArmor.glowstone.getMaxUses());
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ItemGlowstoneIngot.instance)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
