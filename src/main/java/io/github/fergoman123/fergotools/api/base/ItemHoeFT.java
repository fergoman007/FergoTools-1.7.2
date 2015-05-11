package io.github.fergoman123.fergotools.api.base;

import io.github.fergoman123.fergotools.creativetab.Tabs;
import io.github.fergoman123.fergoutil.item.tools.ItemHoeFergo;

public class ItemHoeFT extends ItemHoeFergo
{
    public ItemHoeFT(ToolMaterial material, String name) {
        super(material, 0, Tabs.tabFergoTools, name);
    }
}
