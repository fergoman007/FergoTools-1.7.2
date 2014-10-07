package io.github.fergoman123.fergotools.item.pickaxe;

import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.reference.Names;
import io.github.fergoman123.fergotools.util.item.Materials;
import io.github.fergoman123.fergotools.util.tool.ItemPickaxeFT;
import net.minecraft.item.ItemStack;

public class ItemRedstonePickaxe extends ItemPickaxeFT {

    public ItemRedstonePickaxe()
    {
        super(Materials.Tools.redstone, Materials.Tools.redstone.getMaxUses());
        this.setUnlocalizedName(Names.Items.redstonePickaxe);
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(ModItems.gemRedstone)) || super.getIsRepairable(stack1, stack2);
    }
}
