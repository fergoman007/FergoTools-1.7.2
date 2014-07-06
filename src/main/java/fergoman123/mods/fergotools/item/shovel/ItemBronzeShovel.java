package fergoman123.mods.fergotools.item.shovel;

import fergoman123.mods.fergotools.item.materials.ItemBronzeIngot;
import fergoman123.mods.fergotools.lib.strings.ToolStrings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.ShovelGeneric;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 14/04/2014.
 */
public class ItemBronzeShovel extends ShovelGeneric{

    public static ItemBronzeShovel instance = new ItemBronzeShovel();

    public ItemBronzeShovel() {
        super(UtilToolArmor.bronze);
        this.setUnlocalizedName(ToolStrings.bronzeShovel);
        this.setMaxDamage(UtilToolArmor.getBronzeMaxUses());
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ItemBronzeIngot.instance)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
