package fergoman123.mods.fergotools.item.axe;

import fergoman123.mods.fergotools.item.materials.ItemLapisCrystal;
import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.AxeGeneric;
import net.minecraft.item.ItemStack;

public class ItemLapisAxe extends AxeGeneric {

    public static ItemLapisAxe instance = new ItemLapisAxe();

    public ItemLapisAxe() {
        super(UtilToolArmor.lapis);
        this.setUnlocalizedName(Strings.ToolStrings.lapisAxe);
        this.setMaxDamage(UtilToolArmor.lapis.getMaxUses());
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ItemLapisCrystal.instance)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}