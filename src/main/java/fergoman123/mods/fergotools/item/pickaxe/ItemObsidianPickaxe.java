package fergoman123.mods.fergotools.item.pickaxe;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.item.Materials;
import fergoman123.mods.fergotools.util.tool.ItemPickaxeFT;
import net.minecraft.item.ItemStack;

public class ItemObsidianPickaxe extends ItemPickaxeFT
{

    public ItemObsidianPickaxe()
    {
        super(Materials.Tools.obsidian, Materials.Tools.obsidian.getMaxUses());
        this.setUnlocalizedName(Names.Items.obsidianPickaxe);
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(ModItems.ingotObsidian)) || super.getIsRepairable(stack1, stack2);
    }
}
