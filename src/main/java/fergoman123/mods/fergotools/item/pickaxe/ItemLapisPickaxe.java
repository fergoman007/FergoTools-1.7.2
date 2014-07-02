package fergoman123.mods.fergotools.item.pickaxe;

import fergoman123.mods.fergotools.item.materials.ItemLapisCrystal;
import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.PickaxeGeneric;
import net.minecraft.item.ItemStack;

public class ItemLapisPickaxe extends PickaxeGeneric
{

    public static ItemLapisPickaxe instance = new ItemLapisPickaxe();

    public ItemLapisPickaxe()
    {
        super(UtilToolArmor.lapis);
        this.setUnlocalizedName(Strings.ToolStrings.lapisPickaxe);
        this.setMaxDamage(UtilToolArmor.getLapisMaxUses());
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(ItemLapisCrystal.instance)) || super.getIsRepairable(stack1, stack2);
    }
}
