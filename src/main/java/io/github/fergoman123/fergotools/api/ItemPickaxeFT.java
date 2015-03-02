package io.github.fergoman123.fergotools.api;

import io.github.fergoman123.fergotools.common.CTFT;
import io.github.fergoman123.fergoutil.item.ItemPickaxeFergo;

public class ItemPickaxeFT extends ItemPickaxeFergo
{
    public ItemPickaxeFT(ToolMaterial material, String name) {
        super(material, 0, CTFT.instance, name);
    }
}
