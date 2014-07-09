package fergoman123.mods.fergotools.item.sword;

import fergoman123.mods.fergotools.item.materials.ItemLapisCrystal;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.SwordGeneric;
import net.minecraft.item.ItemStack;

public class ItemLapisSword extends SwordGeneric {
    public static ItemLapisSword instance = new ItemLapisSword();

    public ItemLapisSword() {
        super(UtilToolArmor.lapis);
        this.setUnlocalizedName(Names.Items.lapisSword);
        this.setMaxDamage(UtilToolArmor.getLapisMaxUses());
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ItemLapisCrystal.instance)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
