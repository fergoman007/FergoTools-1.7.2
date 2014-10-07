package io.github.fergoman123.fergotools.item.pickaxe;

import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.reference.Names;
import io.github.fergoman123.fergotools.util.item.Materials;
import io.github.fergoman123.fergotools.util.tool.ItemPickaxeFT;
import net.minecraft.item.ItemStack;

public class ItemLapisPickaxe extends ItemPickaxeFT
{

    public ItemLapisPickaxe()
    {
        super(Materials.Tools.lapis, Materials.Tools.lapis.getMaxUses());
        this.setUnlocalizedName(Names.Items.lapisPickaxe);
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(ModItems.gemLapis)) || super.getIsRepairable(stack1, stack2);
    }
}
