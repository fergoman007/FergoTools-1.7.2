/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.util.base;

import io.github.fergoman123.fergotools.creativetab.Tabs;
import io.github.fergoman123.fergotools.reference.Reference;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockRotatedPillarFT extends BlockRotatedPillar
{
    public IIcon topIcon, sideIcon;
    public String type;
    public BlockRotatedPillarFT(String type)
    {
        super(Material.wood);
        this.setHardness(2.0f);
        this.type = type;
        this.setStepSound(Block.soundTypeWood);
        this.setCreativeTab(Tabs.tabFergoWood);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }


    public IIcon getSideIcon(int meta) {
        return this.sideIcon;
    }

    public IIcon getTopIcon(int meta) {
        return this.topIcon;
    }

    public void registerBlockIcons(IIconRegister register) {
        this.sideIcon = register.registerIcon(String.format("%slog/%s/%s", Reference.textureLoc, this.type.toLowerCase(), NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName())));
        this.topIcon = register.registerIcon(String.format("%slog/%s/%sTop", Reference.textureLoc, this.type.toLowerCase(), NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName())));
    }

    public boolean isWood(IBlockAccess world, int x, int y, int z) {
        return true;
    }
}
