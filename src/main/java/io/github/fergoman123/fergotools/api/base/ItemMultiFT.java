package io.github.fergoman123.fergotools.api.base;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergoutil.item.ItemMultiFergo;

public abstract class ItemMultiFT extends ItemMultiFergo
{
    public ItemMultiFT(String[] names, String name) {
        super(0, FergoTools.tabFergoTools, names, name);
    }
}
