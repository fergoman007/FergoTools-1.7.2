package fergoman123.mods.fergotools.item.hoe;

import fergoman123.mods.fergotools.item.materials.ItemLapisCrystal;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.HoeGeneric;
import net.minecraft.item.ItemStack;

public class ItemLapisHoe extends HoeGeneric {

    public static ItemLapisHoe instance = new ItemLapisHoe();

    public ItemLapisHoe() {
        super(UtilToolArmor.lapis);
        this.setUnlocalizedName(Names.Items.lapisHoe);
        this.setMaxDamage(UtilToolArmor.lapis.getMaxUses());
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ItemLapisCrystal.instance)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
