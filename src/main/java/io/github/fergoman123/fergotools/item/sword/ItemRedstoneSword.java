package io.github.fergoman123.fergotools.item.sword;

import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.reference.Names;
import io.github.fergoman123.fergotools.util.item.Materials;
import io.github.fergoman123.fergotools.util.tool.ItemSwordFT;
import net.minecraft.item.ItemStack;

public class ItemRedstoneSword extends ItemSwordFT {

    public ItemRedstoneSword()
    {
        super(Materials.Tools.redstone, Materials.Tools.redstone.getMaxUses());
        this.setUnlocalizedName(Names.Items.redstoneSword);
    }

    public boolean getIsRepairable(ItemStack stack1, ItemStack stack2)
    {
        return stack2.isItemEqual(new ItemStack(ModItems.gemRedstone)) || super.getIsRepairable(stack1, stack2);
    }
}
