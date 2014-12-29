package io.github.fergoman123.fergotools.core.item;

import io.github.fergoman123.fergotools.api.content.FTContent;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.util.item.TM;
import io.github.fergoman123.fergotools.util.tool.ItemPickaxeFT;

public class ItemSilkPickaxe extends ItemPickaxeFT {
    public ItemSilkPickaxe() {
        super(TM.silk, FTContent.gemSilk);
        this.setUnlocalizedName(ItemNames.silkPickaxe);
    }
}
