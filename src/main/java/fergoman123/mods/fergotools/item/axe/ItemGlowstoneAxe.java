package fergoman123.mods.fergotools.item.axe;

import fergoman123.mods.fergotools.item.materials.ItemGlowstoneIngot;
import fergoman123.mods.fergotools.lib.Strings.ToolStrings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.AxeGeneric;
import net.minecraft.item.ItemStack;

public class ItemGlowstoneAxe extends AxeGeneric {

    public static ItemGlowstoneAxe instance = new ItemGlowstoneAxe();

    public ItemGlowstoneAxe() {
        super(UtilToolArmor.glowstone);
        this.setUnlocalizedName(ToolStrings.glowstoneAxe);
        this.setMaxDamage(UtilToolArmor.glowstone.getMaxUses());
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ItemGlowstoneIngot.instance)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
