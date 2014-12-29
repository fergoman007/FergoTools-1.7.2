package io.github.fergoman123.fergotools.core.item;

import io.github.fergoman123.fergotools.api.content.FTContent;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.util.item.TM;
import io.github.fergoman123.fergotools.util.tool.ItemShovelFT;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemRedstoneShovel extends ItemShovelFT{
    public ItemRedstoneShovel() {
        super(TM.redstone, FTContent.gemRedstone);
        this.setUnlocalizedName(ItemNames.redstoneShovel);
    }
}
