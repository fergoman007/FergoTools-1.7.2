package fergoman123.mods.fergotools.item.pickaxe;

import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.PickaxeGeneric;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ItemQuartzPickaxe extends PickaxeGeneric
{

    public static ItemQuartzPickaxe instance = new ItemQuartzPickaxe();

    public ItemQuartzPickaxe()
    {
        super(UtilToolArmor.quartz);
        this.setUnlocalizedName(Strings.ToolStrings.quartzPickaxe);
        this.setMaxDamage(UtilToolArmor.getQuartzMaxUses());
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(Items.quartz)) || super.getIsRepairable(stack1, stack2);
    }
}
