package fergoman123.mods.fergotools.item.pickaxe;

import fergoman123.mods.fergotools.item.materials.ItemRedstoneCrystal;
import fergoman123.mods.fergotools.lib.strings.ToolStrings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.PickaxeGeneric;
import net.minecraft.item.ItemStack;

public class ItemRedstonePickaxe extends PickaxeGeneric {

    public static ItemRedstonePickaxe instance = new ItemRedstonePickaxe();

    public ItemRedstonePickaxe()
    {
        super(UtilToolArmor.redstone);
        this.setUnlocalizedName(ToolStrings.redstonePickaxe);
        this.setMaxDamage(UtilToolArmor.getRedstoneMaxUses());
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(ItemRedstoneCrystal.instance)) || super.getIsRepairable(stack1, stack2);
    }
}
