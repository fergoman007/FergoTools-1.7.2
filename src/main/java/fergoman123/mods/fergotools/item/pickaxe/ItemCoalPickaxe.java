package fergoman123.mods.fergotools.item.pickaxe;

import fergoman123.mods.fergotools.item.materials.ItemCoalIngot;
import fergoman123.mods.fergotools.lib.strings.ToolStrings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.PickaxeGeneric;
import net.minecraft.item.ItemStack;

public class ItemCoalPickaxe extends PickaxeGeneric
{

    public static ItemCoalPickaxe instance = new ItemCoalPickaxe();

    public ItemCoalPickaxe()
    {
        super(UtilToolArmor.coal);
        this.setUnlocalizedName(ToolStrings.coalPickaxe);
        this.setMaxDamage(UtilToolArmor.getCoalMaxUses());
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(ItemCoalIngot.instance)) || super.getIsRepairable(stack1, stack2);
    }
}
