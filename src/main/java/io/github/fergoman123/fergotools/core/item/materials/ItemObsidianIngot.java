package io.github.fergoman123.fergotools.core.item.materials;

import io.github.fergoman123.fergotools.reference.names.OreDict;
import io.github.fergoman123.fergotools.util.base.ItemFT;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

/**
 * Created by Fergoman123.
 */
public final class ItemObsidianIngot extends ItemFT
{

    public ItemObsidianIngot(String itemName) {
        super(itemName);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean extraInfo)
    {
        list.add(NameHelper.translateToLocal(OreDict.oreDictName));
        list.add(NameHelper.translateToLocal(OreDict.ingotObsidian));
    }
}
