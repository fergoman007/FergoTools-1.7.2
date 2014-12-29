package io.github.fergoman123.fergotools.core.item;

import io.github.fergoman123.fergotools.api.content.FTContent;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.util.item.TM;
import io.github.fergoman123.fergotools.util.tool.ItemAxeFT;

public class ItemLapisAxe extends ItemAxeFT {

    public ItemLapisAxe() {
        super(TM.lapis, FTContent.gemLapis);
        this.setUnlocalizedName(ItemNames.lapisAxe);
    }
}
