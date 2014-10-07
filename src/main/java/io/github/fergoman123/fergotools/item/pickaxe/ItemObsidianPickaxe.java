package io.github.fergoman123.fergotools.item.pickaxe;

import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.reference.Names;
import io.github.fergoman123.fergotools.util.item.Materials;
import io.github.fergoman123.fergotools.util.tool.ItemPickaxeFT;
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
