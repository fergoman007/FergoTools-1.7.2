package io.github.fergoman123.fergotools.core.itemblock.furnaceactive;

import io.github.fergoman123.fergotools.core.FTContent;
import io.github.fergoman123.fergotools.reference.names.Locale;
import io.github.fergoman123.fergotools.util.base.ItemBlockFT;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Created by Fergoman123.
 */
public final class ItemBlockLapisFurnaceActive extends ItemBlockFT {
    public ItemBlockLapisFurnaceActive(Block block) {
        super(FTContent.lapisFurnaceActive);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
        list.add(NameHelper.translateToLocal(Locale.lapisFurnaceSpeed));
    }
}
