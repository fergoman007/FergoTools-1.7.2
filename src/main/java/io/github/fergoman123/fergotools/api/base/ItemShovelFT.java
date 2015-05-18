package io.github.fergoman123.fergotools.api.base;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergoutil.item.tools.ItemShovelFergo;

public class ItemShovelFT extends ItemShovelFergo
{
    public ItemShovelFT(ToolMaterial material, String name) {
        super(material, 0, FergoTools.tabFergoTools, name);
    }
}
