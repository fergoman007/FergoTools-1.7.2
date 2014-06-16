package fergoman123.mods.fergotools.item.axe;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.util.tool.AxeGeneric;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 13/04/2014.
 */
public class ItemEmeraldAxe extends AxeGeneric {

    public static ItemEmeraldAxe instance = new ItemEmeraldAxe();

    public ItemEmeraldAxe() {
        super(UtilToolArmor.emerald);
        this.setUnlocalizedName(Strings.ToolStrings.emeraldAxe);
        this.setMaxDamage(UtilToolArmor.emerald.getMaxUses());
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ModItems.emeraldCrystal)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
