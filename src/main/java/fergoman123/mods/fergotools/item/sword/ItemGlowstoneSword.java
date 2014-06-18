package fergoman123.mods.fergotools.item.sword;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.SwordGeneric;
import net.minecraft.item.ItemStack;

public class ItemGlowstoneSword extends SwordGeneric {

    public static ItemGlowstoneSword instance = new ItemGlowstoneSword();

    public ItemGlowstoneSword() {
        super(UtilToolArmor.glowstone);
        this.setUnlocalizedName(Strings.ToolStrings.glowstoneSword);
        this.setMaxDamage(UtilToolArmor.getGlowstoneMaxUses());
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ModItems.glowstoneIngot)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
