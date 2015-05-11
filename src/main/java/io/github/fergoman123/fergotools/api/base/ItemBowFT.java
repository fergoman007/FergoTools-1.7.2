package io.github.fergoman123.fergotools.api.base;

import io.github.fergoman123.fergotools.creativetab.Tabs;
import io.github.fergoman123.fergoutil.item.ItemBowFergo;
import net.minecraft.item.Item;

public class ItemBowFT extends ItemBowFergo {
    public ItemBowFT(ToolMaterial material, Item repairItem, String name)
    {
        super(material, 0, Tabs.tabFergoTools, repairItem, name);
    }
}
