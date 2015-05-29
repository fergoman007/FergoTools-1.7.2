package io.github.fergoman123.fergotools.api.base;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergoutil.info.BowInfo;
import io.github.fergoman123.fergoutil.item.ItemBowFergo;
import net.minecraft.item.Item;

public class ItemBowFT extends ItemBowFergo {
    public ItemBowFT(BowInfo info)
    {
        super(0, FergoTools.tabFergoTools , info);
    }
}
