package io.github.fergoman123.fergotools.api;

import io.github.fergoman123.fergotools.common.CTFT;
import io.github.fergoman123.fergoutil.item.ItemShovelFergo;

public class ItemShovelFT extends ItemShovelFergo
{
    public ItemShovelFT(ToolMaterial material, String name) {
        super(material, 0, CTFT.instance, name);
    }
}
