package io.github.fergoman123.fergotools.item.pickaxe;

import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.reference.Names;
import io.github.fergoman123.fergotools.util.item.Materials;
import io.github.fergoman123.fergotools.util.tool.ItemPickaxeFT;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ItemQuartzPickaxe extends ItemPickaxeFT
{

    public ItemQuartzPickaxe()
    {
        super(Materials.Tools.quartz, Materials.Tools.quartz.getMaxUses());
        this.setUnlocalizedName(Names.Items.quartzPickaxe);
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(Items.quartz)) || super.getIsRepairable(stack1, stack2);
    }
}
