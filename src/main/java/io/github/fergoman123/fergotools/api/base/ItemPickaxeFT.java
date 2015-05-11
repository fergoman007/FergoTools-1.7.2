package io.github.fergoman123.fergotools.api.base;

import io.github.fergoman123.fergotools.creativetab.Tabs;
import io.github.fergoman123.fergoutil.item.tools.ItemPickaxeFergo;

public class ItemPickaxeFT extends ItemPickaxeFergo
{
    public ItemPickaxeFT(ToolMaterial material, String name) {
        super(material, 0, Tabs.tabFergoTools, name);
    }
}
