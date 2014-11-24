/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.util.base.workbench;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergotools.creativetab.Tabs;
import io.github.fergoman123.fergotools.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.Random;

public abstract class BlockWorkbenchFT extends Block
{
    @SideOnly(Side.CLIENT)
    public IIcon topIcon, frontIcon, bottomIcon;

    /**
     * this is the main constructor for workbench
     * blocks
     * @param blockName the name of the workbench
     */
    public BlockWorkbenchFT(String blockName)
    {
        super(Material.wood);
        this.setBlockName(blockName);
        this.setHardness(2.5f);
        this.setCreativeTab(Tabs.tabFergoCT);
    }

    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public abstract IIcon getIcon(int side, int meta);

    public abstract void registerBlockIcons(IIconRegister register);

    public abstract boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ);

    public abstract Item getItemDropped(int metadata, Random rand, int fortune);
}
