package fergoman123.mods.fergotools.item.pickaxe;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.util.item.UtilToolArmor;
import fergoman123.mods.fergotools.util.tool.PickaxeGeneric;
import net.minecraft.item.ItemStack;

public class ItemObsidianPickaxe extends PickaxeGeneric
{

    public static ItemObsidianPickaxe instance = new ItemObsidianPickaxe();

    public ItemObsidianPickaxe()
    {
        super(UtilToolArmor.obsidian);
        this.setUnlocalizedName(Strings.ToolStrings.obsidianPickaxe);
        this.setMaxDamage(UtilToolArmor.getObsidianMaxUses());
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(ModItems.obsidianIngot)) || super.getIsRepairable(stack1, stack2);
    }
}
