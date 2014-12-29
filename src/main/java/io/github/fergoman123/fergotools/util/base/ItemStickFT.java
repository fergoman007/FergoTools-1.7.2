 /*
   * Fergoman123's Tools
   * Copyright (c) 2014 fergoman123.
   * All rights reserved. This program and the accompanying materials
   * are made available under the terms of the GNU Lesser Public License v2.1
   * which accompanies this distribution, and is available at
   * http://www.gnu.org/licenses/gpl-3.0.html
   */
 package io.github.fergoman123.fergotools.util.base;

import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergotools.reference.names.OreDict;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergotools.creativetab.Tabs;
import io.github.fergoman123.fergotools.reference.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class ItemStickFT extends Item
{
    public ItemStickFT()
    {
        super();
        this.setMaxStackSize(64);
        this.setCreativeTab(Tabs.tabFergoWood);
    }

    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public String getUnlocalizedName(ItemStack stack)
    {
        return String.format("item.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName(stack)));
    }

    public void registerIcons(IIconRegister register)
    {
        itemIcon = register.registerIcon(String.format("%s%s%s", Reference.textureLoc, Textures.stickLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName())));
    }

    @SuppressWarnings("unchecked")
    public void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b)
    {
        for (String i : OreDict.stickWoodArray)
        {
            list.add(NameHelper.translateToLocal(i));
        }
    }
}
