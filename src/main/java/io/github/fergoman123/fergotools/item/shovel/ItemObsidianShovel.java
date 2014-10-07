package io.github.fergoman123.fergotools.item.shovel;

import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.reference.Names;
import io.github.fergoman123.fergotools.util.item.Materials;
import io.github.fergoman123.fergotools.util.tool.ItemShovelFT;
import net.minecraft.item.ItemStack;

public class ItemObsidianShovel extends ItemShovelFT {


    public ItemObsidianShovel() {
        super(Materials.Tools.obsidian, Materials.Tools.obsidian.getMaxUses());
        this.setUnlocalizedName(Names.Items.obsidianShovel);
    }

    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(ModItems.ingotObsidian)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
