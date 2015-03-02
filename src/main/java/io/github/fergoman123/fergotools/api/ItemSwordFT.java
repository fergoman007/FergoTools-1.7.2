package io.github.fergoman123.fergotools.api;

import io.github.fergoman123.fergotools.common.CTFT;
import io.github.fergoman123.fergoutil.item.ItemSwordFergo;

public class ItemSwordFT extends ItemSwordFergo
{
    public ItemSwordFT(ToolMaterial material, String name) {
        super(material, 0, CTFT.instance, name);
    }
}
