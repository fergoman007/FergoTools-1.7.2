package io.github.fergoman123.fergotools.api.base;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergoutil.info.ItemInfo;
import io.github.fergoman123.fergoutil.item.ItemFergo;

public class ItemFT extends ItemFergo {
    public ItemFT(ItemInfo info)
    {
        super(0, FergoTools.tabFergoTools, info);
    }
}
