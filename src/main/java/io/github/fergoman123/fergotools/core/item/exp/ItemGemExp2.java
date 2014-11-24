/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.core.item.exp;

import io.github.fergoman123.fergotools.reference.Reference;
import io.github.fergoman123.fergotools.reference.names.ItemNames;
import io.github.fergoman123.fergotools.reference.names.Locale;
import io.github.fergoman123.fergotools.util.base.ItemFT;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

import java.util.List;

public final class ItemGemExp2 extends ItemFT
{

    public ItemGemExp2(String itemName) {
        super(itemName);
    }

    @Override
    public boolean hasEffect(ItemStack par1ItemStack, int pass) {
        return true;
    }

    @Override
    public void registerIcons(IIconRegister register)
    {
        this.itemIcon = register.registerIcon(Reference.textureLoc + ItemNames.gemExp);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b) {
        list.add(NameHelper.translateToLocal(Locale.gemExpToolTip2));
    }
}
