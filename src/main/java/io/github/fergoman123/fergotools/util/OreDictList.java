package io.github.fergoman123.fergotools.util;

import io.github.fergoman123.fergotools.reference.names.OreDict;
import io.github.fergoman123.fergoutil.oredict.OreDictBlock;
import io.github.fergoman123.fergoutil.oredict.OreDictItem;
import io.github.fergoman123.fergoutil.oredict.OreDictItemStack;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class OreDictList
{
    public static final OreDictBlock

    private static OreDictBlock getBlock(String name, Block block)
    {
        return new OreDictBlock(name, block);
    }

    private static OreDictItem getItem(String name, Item item)
    {
        return new OreDictItem(name, item)
    }

    public static OreDictItemStack getItemStack(String name, ItemStack stack)
    {
        return new OreDictItemStack(name, stack);
    }
}
