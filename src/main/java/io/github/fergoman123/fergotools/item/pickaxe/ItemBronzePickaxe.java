package io.github.fergoman123.fergotools.item.pickaxe;

import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.reference.Names;
import io.github.fergoman123.fergotools.util.item.Materials;
import io.github.fergoman123.fergotools.util.tool.ItemPickaxeFT;
import net.minecraft.item.ItemStack;

public class ItemBronzePickaxe extends ItemPickaxeFT
{
    public ItemBronzePickaxe()
    {
        super(Materials.Tools.bronze, Materials.Tools.bronze.getMaxUses());
        this.setUnlocalizedName(Names.Items.bronzePickaxe);
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(ModItems.ingotBronze)) || super.getIsRepairable(stack1, stack2);
    }
}
