package io.github.fergoman123.fergotools.common.recipe;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

public class RecipeMacerator
{
    private Block block;
    private ItemStack stack;
    private float exp;

    public RecipeMacerator(Block block, ItemStack stack, float exp)
    {
        this.block = block;
        this.stack = stack;
        this.exp = exp;
    }

    public Block getBlock()
    {
        return this.block;
    }

    public ItemStack getStack()
    {
        return this.stack;
    }

    public float getExp()
    {
        return this.exp;
    }
}
