package io.github.fergoman123.fergotools.core.item;

import io.github.fergoman123.fergotools.api.content.FTContent;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.util.item.TM;
import io.github.fergoman123.fergotools.util.tool.ItemHoeFT;

public class ItemGlowstoneHoe extends ItemHoeFT {

    public ItemGlowstoneHoe() {
        super(TM.glowstone, FTContent.ingotGlowstone);
        this.setUnlocalizedName(ItemNames.glowstoneHoe);
    }
}
