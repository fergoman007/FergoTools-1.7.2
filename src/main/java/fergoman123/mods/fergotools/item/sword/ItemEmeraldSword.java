package fergoman123.mods.fergotools.item.sword;

import fergoman123.mods.fergotools.item.materials.ItemEmeraldCrystal;
import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.SwordGeneric;
import net.minecraft.item.ItemStack;

public class ItemEmeraldSword extends SwordGeneric {

    public static ItemEmeraldSword instance = new ItemEmeraldSword();;

    public ItemEmeraldSword() {
        super(UtilToolArmor.emerald);
        this.setUnlocalizedName(Strings.ToolStrings.emeraldSword);
        this.setMaxDamage(UtilToolArmor.getEmeraldMaxUses());
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ItemEmeraldCrystal.instance)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
