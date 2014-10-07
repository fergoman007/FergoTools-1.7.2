package io.github.fergoman123.fergotools.item.hoe;

import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.reference.Names;
import io.github.fergoman123.fergotools.util.item.Materials;
import io.github.fergoman123.fergotools.util.tool.ItemHoeFT;
import net.minecraft.item.ItemStack;

public class ItemLapisHoe extends ItemHoeFT {

    public ItemLapisHoe() {
        super(Materials.Tools.lapis, Materials.Tools.lapis.getMaxUses());
        this.setUnlocalizedName(Names.Items.lapisHoe);
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ModItems.gemLapis)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
