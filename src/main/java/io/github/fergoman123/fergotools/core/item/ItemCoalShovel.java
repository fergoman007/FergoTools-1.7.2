package io.github.fergoman123.fergotools.core.item;

import io.github.fergoman123.fergotools.api.content.FTContent;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.util.item.TM;
import io.github.fergoman123.fergotools.util.tool.ItemShovelFT;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemCoalShovel extends ItemShovelFT {
    public ItemCoalShovel() {
        super(TM.coal, FTContent.ingotCoal);
        this.setUnlocalizedName(ItemNames.coalShovel);
    }
}
