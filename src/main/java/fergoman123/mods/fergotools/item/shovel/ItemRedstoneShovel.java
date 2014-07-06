package fergoman123.mods.fergotools.item.shovel;

import fergoman123.mods.fergotools.item.materials.ItemRedstoneCrystal;
import fergoman123.mods.fergotools.lib.strings.ToolStrings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.ShovelGeneric;
import net.minecraft.item.ItemStack;

public class ItemRedstoneShovel extends ShovelGeneric {

    public static ItemRedstoneShovel instance = new ItemRedstoneShovel();

    public ItemRedstoneShovel()
    {
        super(UtilToolArmor.redstone);
        this.setUnlocalizedName(ToolStrings.redstoneShovel);
        this.setMaxDamage(UtilToolArmor.getRedstoneMaxUses());
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(ItemRedstoneCrystal.instance)) || super.getIsRepairable(stack1, stack2);
    }
}
