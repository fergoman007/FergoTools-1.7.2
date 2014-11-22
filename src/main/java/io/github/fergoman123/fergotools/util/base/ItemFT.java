 /*
   * Fergoman123's Tools
   * Copyright (c) 2014 fergoman123.
   * All rights reserved. This program and the accompanying materials
   * are made available under the terms of the GNU Lesser Public License v2.1
   * which accompanies this distribution, and is available at
   * http://www.gnu.org/licenses/gpl-3.0.html
   */
  package io.github.fergoman123.fergotools.util.base;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergotools.creativetab.Tabs;
import io.github.fergoman123.fergotools.reference.Reference;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public abstract class ItemFT extends Item{

    /**
     * main constructor
     * @param itemName the item's name
     */
    public ItemFT(String itemName)
    {
        super();
        this.setUnlocalizedName(itemName);
        this.maxStackSize = 64;
        this.setCreativeTab(Tabs.tabFergoItems);
        this.setNoRepair();
    }

    @Override
    public String getUnlocalizedName()
    {
        return String.format("item.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public String getUnlocalizedName(ItemStack stack)
    {
        return String.format("item.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName(stack)));
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister register)
    {
        itemIcon = register.registerIcon(String.format("%s", NameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    public abstract void addInformation(ItemStack stack, EntityPlayer player, List list, boolean b);
}
