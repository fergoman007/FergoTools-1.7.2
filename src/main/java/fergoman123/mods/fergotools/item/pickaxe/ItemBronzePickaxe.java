package fergoman123.mods.fergotools.item.pickaxe;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.PickaxeGeneric;
import net.minecraft.item.ItemStack;

/**
 * Created by Fergoman123 on 13/04/2014.
 */
public class ItemBronzePickaxe extends PickaxeGeneric
{
    public ItemBronzePickaxe()
    {
        super(UtilToolArmor.bronze);
        this.setUnlocalizedName(Strings.ToolStrings.bronzePickaxe);
        this.setMaxDamage(UtilToolArmor.getBronzeMaxUses());
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(ModItems.bronzeIngot)) || super.getIsRepairable(stack1, stack2);
    }
}
