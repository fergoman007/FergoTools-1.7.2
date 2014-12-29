package io.github.fergoman123.fergotools.core.item;

import io.github.fergoman123.fergotools.api.content.FTContent;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.util.item.TM;
import io.github.fergoman123.fergotools.util.tool.ItemHoeFT;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemSilkHoe extends ItemHoeFT {

    public ItemSilkHoe() {
        super(TM.silk, FTContent.gemSilk);
        this.setUnlocalizedName(ItemNames.silkHoe);
    }
}
