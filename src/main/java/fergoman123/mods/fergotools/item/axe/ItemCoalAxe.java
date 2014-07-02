package fergoman123.mods.fergotools.item.axe;

import fergoman123.mods.fergotools.item.materials.ItemCoalIngot;
import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.AxeGeneric;
import net.minecraft.item.ItemStack;

public class ItemCoalAxe extends AxeGeneric {

    public static ItemCoalAxe instance = new ItemCoalAxe();

    public ItemCoalAxe() {
        super(UtilToolArmor.coal);
        this.setUnlocalizedName(Strings.ToolStrings.coalAxe);
        this.setMaxDamage(UtilToolArmor.coal.getMaxUses());
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack1.isItemEqual(new ItemStack(ItemCoalIngot.instance)) || super.getIsRepairable(itemstack1, itemstack2);
    }
}
