package io.github.fergoman123.fergotools.core.item;

import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.util.item.TM;
import io.github.fergoman123.fergotools.util.tool.ItemShovelFT;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class ItemQuartzShovel extends ItemShovelFT
{
    public ItemQuartzShovel() {
        super(TM.quartz, Items.quartz);
        this.setUnlocalizedName(ItemNames.quartzShovel);
    }
}
