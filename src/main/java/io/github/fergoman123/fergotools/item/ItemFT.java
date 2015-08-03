package io.github.fergoman123.fergotools.item;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergoutil.item.ItemFergo;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemFT extends ItemFergo {
    public ItemFT(String name){
        super("ft", FergoTools.tabFergoTools, name);
    }
}
