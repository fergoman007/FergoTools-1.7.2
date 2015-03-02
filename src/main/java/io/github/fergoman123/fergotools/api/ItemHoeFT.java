package io.github.fergoman123.fergotools.api;

import io.github.fergoman123.fergotools.common.CTFT;
import io.github.fergoman123.fergoutil.item.ItemHoeFergo;

public class ItemHoeFT extends ItemHoeFergo
{
    public ItemHoeFT(ToolMaterial material, String name) {
        super(material, 0, CTFT.instance, name);
    }
}
