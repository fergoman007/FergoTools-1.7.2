/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.core.block;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergotools.reference.GuiIds;
import io.github.fergoman123.fergotools.reference.Reference;
import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergotools.util.base.workbench.BlockWorkbenchFT;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.List;
import java.util.Random;

public final class BlockFergoWorkbench extends BlockWorkbenchFT {

    public IIcon[] topIcons;
    public IIcon[] bottomIcons;
    public IIcon[] frontIcons;
    public IIcon[] backIcons;
    public static final String[] types = new String[]{"obsidian", "emerald", "lapis", "bronze", "coal", "glowstone", "adamantium", "silk", "redstone"};
    public BlockFergoWorkbench() {
        super();
    }

    @Override
    public void registerBlockIcons(IIconRegister register) {
        this.topIcons = new IIcon[types.length];
        this.bottomIcons = new IIcon[types.length];
        this.frontIcons = new IIcon[types.length];
        this.backIcons = new IIcon[types.length];

        for (int i = 0; i < types.length; i++) {
            this.topIcons[i] = register.registerIcon(String.format("%sworkbench/%s/%sWorkbenchTop", Reference.textureLoc, types[i], types[i]));
            this.bottomIcons[i] = register.registerIcon(String.format("%sworkbench/%s/%sWorkbenchBottom", Reference.textureLoc, types[i], types[i]));
            this.frontIcons[i] = register.registerIcon(String.format("%sworkbench/%s/%sWorkbenchFront", Reference.textureLoc, types[i], types[i]));
            this.backIcons[i] = register.registerIcon(String.format("%sworkbench/%s/%sWorkbenchSide", Reference.textureLoc, types[i], types[i]));

            //TODO: Workbench Icons
        }
    }

    @Override
    public IIcon getIcon(int side, int meta) {
        return side == 1 ? this.topIcons[meta] : (side == 0 ? this.bottomIcons[meta] : (side != 2 && side != 4 ? this.backIcons[meta] : this.frontIcons[meta]));
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
    {
        int metadata = world.getBlockMetadata(x, y, z);
        if (world.isRemote)
        {
            return true;
        }
        else if (!player.isSneaking())
        {
            if (metadata == 0)
            {
                player.openGui(FergoTools.getInstance(), GuiIds.obsidianWorkbench.ordinal(), world, x, y, z);
            }
            else if (metadata == 1)
            {
                player.openGui(FergoTools.getInstance(), GuiIds.emeraldWorkbench.ordinal(), world, x, y, z);
            }
            else if (metadata == 2)
            {
                player.openGui(FergoTools.getInstance(), GuiIds.lapisWorkbench.ordinal(), world, x, y, z);
            }
            else if (metadata == 3)
            {
                player.openGui(FergoTools.getInstance(), GuiIds.bronzeWorkbench.ordinal(), world, x, y, z);
            }
            else if (metadata == 4)
            {
                player.openGui(FergoTools.getInstance(), GuiIds.coalWorkbench.ordinal(), world, x, y, z);
            }
            else if (metadata == 5)
            {
                player.openGui(FergoTools.getInstance(), GuiIds.glowstoneWorkbench.ordinal(), world, x, y, z);
            }
            else if (metadata == 6)
            {
                player.openGui(FergoTools.getInstance(), GuiIds.adamantiumWorkbench.ordinal(), world, x, y, z);
            }
            else if (metadata == 7)
            {
                player.openGui(FergoTools.getInstance(), GuiIds.silkWorkbench.ordinal(), world, x, y, z);
            }
            else if (metadata == 8)
            {
                player.openGui(FergoTools.getInstance(), GuiIds.redstoneWorkbench.ordinal(), world, x, y, z);
            }
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

    public int damageDropped(int meta)
    {
        return meta;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void getSubBlocks(Item item, CreativeTabs tab, List list) {
        list.add(new ItemStack(item, 1, 0));
        list.add(new ItemStack(item, 1, 1));
        list.add(new ItemStack(item, 1, 2));
        list.add(new ItemStack(item, 1, 3));
        list.add(new ItemStack(item, 1, 4));
        list.add(new ItemStack(item, 1, 5));
        list.add(new ItemStack(item, 1, 6));
        list.add(new ItemStack(item, 1, 7));
        list.add(new ItemStack(item, 1, 8));
    }
}
