package io.github.fergoman123.fergotools.core.itemblock.block;

import io.github.fergoman123.fergotools.core.FTContent;
import io.github.fergoman123.fergotools.util.base.ItemBlockFT;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Created by Fergoman123.
 */
public final class ItemBlockExpCollector extends ItemBlockFT
{

    public ItemBlockExpCollector(Block block) {
        super(FTContent.blockExpCollector);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
        list.add("Used to Store Experience Collectors");
    }
}
