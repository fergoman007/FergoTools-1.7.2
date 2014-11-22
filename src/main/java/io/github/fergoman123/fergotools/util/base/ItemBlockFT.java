package io.github.fergoman123.fergotools.util.base;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;

import java.util.List;

public abstract class ItemBlockFT extends ItemBlock
{
    /**
     * this is the main structure for
     * itemblocks
     * @param block the block
     */
    public ItemBlockFT(Block block) {
        super(block);
    }

    public abstract void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b);
}
