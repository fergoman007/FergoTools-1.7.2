package io.github.fergoman123.fergotools.api.base;

import io.github.fergoman123.fergotools.FergoTools;
import net.minecraft.item.Item;

public class ItemFT extends Item {
    public ItemFT(String name)
    {
        this.setCreativeTab(FergoTools.tabFergoTools);
        this.setUnlocalizedName("ft." + name);
    }
}
