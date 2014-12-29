package io.github.fergoman123.fergotools.core.item;

import io.github.fergoman123.fergotools.api.content.FTContent;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.util.item.TM;
import io.github.fergoman123.fergotools.util.tool.ItemSwordFT;

public class ItemLapisSword extends ItemSwordFT {

    public ItemLapisSword() {
        super(TM.lapis, FTContent.gemLapis);
        this.setUnlocalizedName(ItemNames.lapisSword);
    }
}
