/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.core.block.workbench;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergotools.reference.GuiIds;
import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergotools.util.base.workbench.BlockWorkbenchFT;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.Random;

public final class BlockAdamantiumWorkbench extends BlockWorkbenchFT
{

    public BlockAdamantiumWorkbench(String blockName) {
        super(blockName);
    }

    public IIcon getIcon(int side, int meta)
    {
        return side == 1 ? this.topIcon : (side == 0 ? this.bottomIcon : (side != 2 && side != 4 ? this.blockIcon : this.frontIcon));
    }

    @Override
    public void registerBlockIcons(IIconRegister register) {
        this.blockIcon = register.registerIcon(Textures.adamantiumWorkbenchTextures[0]);
        this.topIcon = register.registerIcon(Textures.adamantiumWorkbenchTextures[1]);
        this.frontIcon = register.registerIcon(Textures.adamantiumWorkbenchTextures[2]);
        this.bottomIcon = register.registerIcon(Textures.plankAdamantium);
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
        if (world.isRemote)
        {
            return true;
        }
        else if (!player.isSneaking())
        {
            player.openGui(FergoTools.getInstance(), GuiIds.adamantiumWorkbench.ordinal(), world, x, y, z);
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public Item getItemDropped(int metadata, Random rand, int fortune) {
        return Item.getItemFromBlock(this);
    }
}
