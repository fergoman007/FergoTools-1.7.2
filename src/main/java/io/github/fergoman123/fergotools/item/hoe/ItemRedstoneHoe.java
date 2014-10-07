package io.github.fergoman123.fergotools.item.hoe;

import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.reference.Names;
import io.github.fergoman123.fergotools.util.item.Materials;
import io.github.fergoman123.fergotools.util.tool.ItemHoeFT;
import net.minecraft.item.ItemStack;

public class ItemRedstoneHoe extends ItemHoeFT {

    public ItemRedstoneHoe()
    {
        super(Materials.Tools.redstone, Materials.Tools.redstone.getMaxUses());
        this.setUnlocalizedName(Names.Items.redstoneHoe);
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(ModItems.gemRedstone)) || super.getIsRepairable(stack1, stack2);
    }
}
