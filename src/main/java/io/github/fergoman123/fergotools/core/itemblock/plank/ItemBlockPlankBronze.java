package io.github.fergoman123.fergotools.core.itemblock.plank;

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
public final class ItemBlockPlankBronze extends ItemBlockFT {
    public ItemBlockPlankBronze(Block block) {
        super(FTContent.plankBronze);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
        for (String i : OreDict.plankWoodArray) {
            list.add(NameHelper.translateToLocal(i));
        }
    }
}