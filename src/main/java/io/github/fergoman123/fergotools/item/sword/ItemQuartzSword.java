package io.github.fergoman123.fergotools.item.sword;

import io.github.fergoman123.fergotools.reference.Names;
import io.github.fergoman123.fergotools.util.item.Materials;
import io.github.fergoman123.fergotools.util.tool.ItemSwordFT;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ItemQuartzSword extends ItemSwordFT {

    public ItemQuartzSword() {
        super(Materials.Tools.quartz, Materials.Tools.quartz.getMaxUses());
        this.setUnlocalizedName(Names.Items.quartzSword);
    }


    public boolean getIsRepairable(ItemStack itemstack1, ItemStack itemstack2)
    {
        return itemstack2.isItemEqual(new ItemStack(Items.quartz)) || super.getIsRepairable(itemstack1, itemstack2);
    }

}
