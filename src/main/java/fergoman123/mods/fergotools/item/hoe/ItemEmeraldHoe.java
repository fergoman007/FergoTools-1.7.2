package fergoman123.mods.fergotools.item.hoe;

import fergoman123.mods.fergotools.item.materials.ItemEmeraldCrystal;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.HoeGeneric;
import net.minecraft.item.ItemStack;

public class ItemEmeraldHoe extends HoeGeneric {

    public static ItemEmeraldHoe instance = new ItemEmeraldHoe();

    public ItemEmeraldHoe() {
        super(UtilToolArmor.emerald);
        this.setUnlocalizedName(Names.Items.emeraldHoe);
        this.setMaxDamage(UtilToolArmor.emerald.getMaxUses());
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ItemEmeraldCrystal.instance)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
