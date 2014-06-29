package fergoman123.mods.fergotools.item.sword;

import fergoman123.mods.fergotools.item.materials.ItemBronzeIngot;
import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.SwordGeneric;
import net.minecraft.item.ItemStack;

public class ItemBronzeSword extends SwordGeneric {

    public static ItemBronzeSword instance = new ItemBronzeSword();

    public ItemBronzeSword() {
        super(UtilToolArmor.bronze);
        this.setUnlocalizedName(Strings.ToolStrings.bronzeSword);
        this.setMaxDamage(UtilToolArmor.getBronzeMaxUses());
    }


    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ItemBronzeIngot.instance)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
