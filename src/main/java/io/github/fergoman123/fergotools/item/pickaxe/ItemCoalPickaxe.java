package io.github.fergoman123.fergotools.item.pickaxe;

import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.reference.Names;
import io.github.fergoman123.fergotools.util.item.Materials;
import io.github.fergoman123.fergotools.util.tool.ItemPickaxeFT;
import net.minecraft.item.ItemStack;

public class ItemCoalPickaxe extends ItemPickaxeFT
{

    public ItemCoalPickaxe()
    {
        super(Materials.Tools.coal, Materials.Tools.coal.getMaxUses());
        this.setUnlocalizedName(Names.Items.coalPickaxe);
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(ModItems.ingotCoal)) || super.getIsRepairable(stack1, stack2);
    }
}
