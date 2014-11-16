package io.github.fergoman123.fergotools.core.itemblock.ore;

import io.github.fergoman123.fergotools.core.FTContent;
import io.github.fergoman123.fergotools.reference.names.OreDict;
import io.github.fergoman123.fergotools.util.base.ItemBlockFT;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Created by Fergoman123.
 */
public final class ItemBlockOreObsidian extends ItemBlockFT
{
    public ItemBlockOreObsidian(Block block){super(FTContent.oreObsidian);}

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
        for (String i : OreDict.oreObsidianArray) {
            list.add(NameHelper.translateToLocal(i));
        }
    }
}
