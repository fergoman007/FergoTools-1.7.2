package fergoman123.mods.fergotools.item.shovel;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.ShovelGeneric;
import net.minecraft.item.ItemStack;

public class ItemLapisShovel extends ShovelGeneric {

    public static ItemLapisShovel instance = new ItemLapisShovel();

    public ItemLapisShovel() {
        super(UtilToolArmor.lapis);
        this.setUnlocalizedName(Strings.ToolStrings.lapisShovel);
        this.setMaxDamage(UtilToolArmor.lapis.getMaxUses());
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ModItems.lapisCrystal)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
