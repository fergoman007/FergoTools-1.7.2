package io.github.fergoman123.fergotools.api.base;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergoutil.info.MultiItemInfo;
import io.github.fergoman123.fergoutil.item.ItemMultiFergo;

public class ItemMultiFT extends ItemMultiFergo
{
    public ItemMultiFT(MultiItemInfo info) {
        super(0, FergoTools.tabFergoTools, info);
    }
}
