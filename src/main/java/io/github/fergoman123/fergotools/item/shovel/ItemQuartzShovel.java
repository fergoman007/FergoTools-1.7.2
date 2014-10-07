package io.github.fergoman123.fergotools.item.shovel;

import io.github.fergoman123.fergotools.reference.Names;
import io.github.fergoman123.fergotools.util.item.Materials;
import io.github.fergoman123.fergotools.util.tool.ItemShovelFT;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ItemQuartzShovel extends ItemShovelFT {


    public ItemQuartzShovel() {
        super(Materials.Tools.quartz, Materials.Tools.quartz.getMaxUses());
        this.setUnlocalizedName(Names.Items.quartzShovel);
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(Items.quartz)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
