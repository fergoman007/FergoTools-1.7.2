package fergoman123.mods.fergotools.item.pickaxe;

import fergoman123.mods.fergotools.item.materials.ItemBronzeIngot;
import fergoman123.mods.fergotools.lib.strings.ToolStrings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.PickaxeGeneric;
import net.minecraft.item.ItemStack;

public class ItemBronzePickaxe extends PickaxeGeneric
{

    public static ItemBronzePickaxe instance = new ItemBronzePickaxe();
    public ItemBronzePickaxe()
    {
        super(UtilToolArmor.bronze);
        this.setUnlocalizedName(ToolStrings.bronzePickaxe);
        this.setMaxDamage(UtilToolArmor.getBronzeMaxUses());
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(ItemBronzeIngot.instance)) || super.getIsRepairable(stack1, stack2);
    }
}
