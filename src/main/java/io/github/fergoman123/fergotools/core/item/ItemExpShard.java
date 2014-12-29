/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.core.item;

import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.reference.names.Locale;
import io.github.fergoman123.fergotools.reference.names.OreDict;
import io.github.fergoman123.fergotools.util.base.ItemFT;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public final class ItemExpShard extends ItemFT
{

    public ItemExpShard() {
        super();
        this.setUnlocalizedName(ItemNames.shardExp);
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
