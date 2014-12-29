package io.github.fergoman123.fergotools.core.item;

import io.github.fergoman123.fergotools.api.content.FTContent;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.util.item.TM;
import io.github.fergoman123.fergotools.util.tool.ItemHoeFT;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemLapisHoe extends ItemHoeFT {

    public ItemLapisHoe() {
        super(TM.lapis, FTContent.gemLapis);
        this.setUnlocalizedName(ItemNames.lapisHoe);
    }
}
