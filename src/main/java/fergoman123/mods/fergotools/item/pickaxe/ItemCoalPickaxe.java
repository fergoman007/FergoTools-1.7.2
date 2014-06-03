package fergoman123.mods.fergotools.item.pickaxe;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.PickaxeGeneric;
import net.minecraft.item.ItemStack;

public class ItemCoalPickaxe extends PickaxeGeneric
{
    public ItemCoalPickaxe()
    {
        super(UtilToolArmor.coal);
        this.setUnlocalizedName(Strings.ToolStrings.coalPickaxe);
        this.setMaxDamage(UtilToolArmor.getCoalMaxUses());
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(ModItems.coalIngot)) || super.getIsRepairable(stack1, stack2);
    }
}
