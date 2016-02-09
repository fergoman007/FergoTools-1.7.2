package io.github.fergoman123.fergotools.item;

import io.github.fergoman123.fergoutil.item.ItemFergo;
import net.minecraft.creativetab.CreativeTabs;

public class ItemFT extends ItemFergo {

    public ItemFT(CreativeTabs tab, String name) {
        super(tab, "fergotools", name);
        this.setUnlocalizedName(name);
    }
}
