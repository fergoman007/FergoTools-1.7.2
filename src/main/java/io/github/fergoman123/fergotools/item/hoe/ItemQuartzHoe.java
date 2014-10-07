package io.github.fergoman123.fergotools.item.hoe;

import io.github.fergoman123.fergotools.reference.Names;
import io.github.fergoman123.fergotools.util.item.Materials;
import io.github.fergoman123.fergotools.util.tool.ItemHoeFT;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ItemQuartzHoe extends ItemHoeFT {

    public ItemQuartzHoe() {
        super(Materials.Tools.quartz, Materials.Tools.quartz.getMaxUses());
        this.setUnlocalizedName(Names.Items.quartzHoe);
    }


    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2) {
        return itemstack2.isItemEqual(new ItemStack(Items.quartz)) || super.getIsRepairable(itemstack1, itemstack2);
    }
}


