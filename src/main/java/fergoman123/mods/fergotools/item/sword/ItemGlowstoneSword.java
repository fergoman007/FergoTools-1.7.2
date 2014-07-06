package fergoman123.mods.fergotools.item.sword;

import fergoman123.mods.fergotools.item.materials.ItemGlowstoneIngot;
import fergoman123.mods.fergotools.lib.strings.ToolStrings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.SwordGeneric;
import net.minecraft.item.ItemStack;

public class ItemGlowstoneSword extends SwordGeneric {

    public static ItemGlowstoneSword instance = new ItemGlowstoneSword();

    public ItemGlowstoneSword() {
        super(UtilToolArmor.glowstone);
        this.setUnlocalizedName(ToolStrings.glowstoneSword);
        this.setMaxDamage(UtilToolArmor.getGlowstoneMaxUses());
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ItemGlowstoneIngot.instance)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
