package io.github.fergoman123.fergotools.core.item;

import io.github.fergoman123.fergotools.api.content.FTContent;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.util.item.TM;
import io.github.fergoman123.fergotools.util.tool.ItemSwordFT;

public class ItemAdamantiumSword extends ItemSwordFT {

    public ItemAdamantiumSword() {
        super(TM.adamantium, FTContent.ingotAdamantium);
        this.setUnlocalizedName(ItemNames.adamantiumSword);
    }
}
