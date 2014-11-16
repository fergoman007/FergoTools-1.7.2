package io.github.fergoman123.fergotools.core.item.exp;

import io.github.fergoman123.fergotools.reference.names.Locale;
import io.github.fergoman123.fergotools.reference.names.OreDict;
import io.github.fergoman123.fergotools.util.base.ItemFT;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

/**
 * Created by Fergoman123.
 */
public final class ItemExpShard extends ItemFT
{

    public ItemExpShard(String itemName) {
        super(itemName);
        this.setMaxStackSize(64);
    }

    @Override
    public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player) {
        player.addExperienceLevel(1);
        stack.stackSize--;
        return stack;
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
        for(String string : new String[]{OreDict.oreDictName, OreDict.shardExp, "", Locale.expShardToolTip})
        {
            list.add(NameHelper.translateToLocal(string));
        }
    }
}
