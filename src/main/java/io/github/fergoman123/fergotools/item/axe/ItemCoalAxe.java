package io.github.fergoman123.fergotools.item.axe;

import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.reference.Names;
import io.github.fergoman123.fergotools.util.item.Materials;
import io.github.fergoman123.fergotools.util.tool.ItemAxeFT;
import net.minecraft.item.ItemStack;

public class ItemCoalAxe extends ItemAxeFT {

    public ItemCoalAxe() {
        super(Materials.Tools.coal, Materials.Tools.coal.getMaxUses());
        this.setUnlocalizedName(Names.Items.coalAxe);
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack1.isItemEqual(new ItemStack(ModItems.ingotCoal)) || super.getIsRepairable(itemstack1, itemstack2);
    }
}
