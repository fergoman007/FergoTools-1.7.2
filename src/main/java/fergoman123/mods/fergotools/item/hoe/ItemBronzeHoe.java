package fergoman123.mods.fergotools.item.hoe;

import fergoman123.mods.fergotools.item.materials.ItemBronzeIngot;
import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.HoeGeneric;
import net.minecraft.item.ItemStack;

public class ItemBronzeHoe extends HoeGeneric {

    public static ItemBronzeHoe instance = new ItemBronzeHoe();

    public ItemBronzeHoe() {
        super(UtilToolArmor.bronze);
        this.setUnlocalizedName(Strings.ToolStrings.bronzeHoe);
        this.setMaxDamage(UtilToolArmor.bronze.getMaxUses());
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ItemBronzeIngot.instance)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
