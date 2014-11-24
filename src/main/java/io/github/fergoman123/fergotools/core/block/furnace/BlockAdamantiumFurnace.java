/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.core.block.furnace;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergotools.core.FTContent;
import io.github.fergoman123.fergotools.core.tileentity.TileEntityAdamantiumFurnace;
import io.github.fergoman123.fergotools.reference.GuiIds;
import io.github.fergoman123.fergotools.reference.Reference;
import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergotools.reference.names.BlockNames;
import io.github.fergoman123.fergotools.util.base.BlockFurnaceFT;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import java.util.Random;

public class BlockAdamantiumFurnace extends BlockFurnaceFT
{
    public BlockAdamantiumFurnace(boolean isActive, Material material, String furnaceType) {
        super(isActive, material, furnaceType);
        this.isActive = isActive;
    }

    public Item getItemDropped(int par1, Random rand, int par3)
    {
        return Item.getItemFromBlock(FTContent.adamantiumFurnaceIdle);
    }

    public void onBlockAdded(World world, int x, int y, int z)
    {
        super.onBlockAdded(world, x, y, z);
        this.setDefaultDirection(world, x, y, z);
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int par1, int par2)
    {
        if (par2 == 0)
            par2 = 3;
        return par1 == 1 ? this.icons[1] : (par1 == 0 ? this.icons[1] : (par1 != par2 ? this.blockIcon : this.icons[0]));
    }

    public void registerBlockIcons(IIconRegister register)
    {
        this.blockIcon = register.registerIcon(Textures.resourcePrefix + BlockNames.blockAdamantium);
        this.icons[0] = register.registerIcon(Reference.textureLoc + (this.isActive ? BlockNames.adamantiumFurnaceActive : BlockNames.adamantiumFurnaceIdle));
        this.icons[1] = register.registerIcon(Textures.resourcePrefix + BlockNames.blockAdamantium);
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
    {
        if (world.isRemote)
        {
            return true;
        }
        else if (!player.isSneaking())
        {
            TileEntityAdamantiumFurnace furnace = (TileEntityAdamantiumFurnace)world.getTileEntity(x, y, z);
            if (furnace != null)
            {
                player.openGui(FergoTools.getInstance(), GuiIds.adamantiumFurnace.ordinal(), world, x, y, z);
            }
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void updateAdamantiumFurnaceBlockState(boolean active, World world, int x, int y, int z)
    {
        int l = world.getBlockMetadata(x, y, z);
        TileEntity tile = world.getTileEntity(x, y, z);
        keepInventory = true;

        if (active)
        {
            world.setBlock(x, y, z, FTContent.adamantiumFurnaceActive);
        }
        else
        {
            world.setBlock(x, y, z, FTContent.adamantiumFurnaceIdle);
        }

        keepInventory = false;
        world.setBlockMetadataWithNotify(x, y, z, l, 2);

        if (tile != null)
        {
            tile.validate();
            world.setTileEntity(x, y, z, tile);
        }
    }

    public TileEntity createNewTileEntity(World world, int var)
    {
        return new TileEntityAdamantiumFurnace();
    }

    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase elb, ItemStack stack)
    {
        int l = MathHelper.floor_double((double) (elb.rotationYaw * 4.0f / 360.0) + 0.5D) & 3;

        if (l == 0)
        {
            world.setBlockMetadataWithNotify(x, y, z, 2, 2);
        }

        if (l == 1)
        {
            world.setBlockMetadataWithNotify(x, y, z, 5, 2);
        }

        if (l == 2)
        {
            world.setBlockMetadataWithNotify(x, y, z, 3, 2);
        }

        if (l == 3)
        {
            world.setBlockMetadataWithNotify(x, y, z, 4, 2);
        }

        if (stack.hasDisplayName())
        {
            ((TileEntityAdamantiumFurnace)world.getTileEntity(x, y, z)).setGuiDisplayName(stack.getDisplayName());
        }
    }

    public void breakBlock(World world, int x, int y, int z, Block block, int oldBlock)
    {
        if (!keepInventory)
        {
            TileEntityAdamantiumFurnace furnace = (TileEntityAdamantiumFurnace)world.getTileEntity(x, y, z);

            if (furnace != null)
            {
                for (int i = 0; i < furnace.getSizeInventory(); ++i)
                {
                    ItemStack stack = furnace.getStackInSlot(i);

                    if (stack != null)
                    {
                        float f = this.rand.nextFloat() * 0.8F + 0.1F;
                        float f1 = this.rand.nextFloat() * 0.8F + 0.1F;
                        float f2 = this.rand.nextFloat() * 0.8F + 0.1F;

                        while (stack.stackSize > 0)
                        {
                            int j = this.rand.nextInt(21) + 10;

                            if (j > stack.stackSize)
                            {
                                j = stack.stackSize;
                            }

                            stack.stackSize -= j;
                            EntityItem item = new EntityItem(world, (double)((float)x + f), (double)((float)y + f1), (double)((float)z + f2), new ItemStack(stack.getItem(), j, stack.getItemDamage()));

                            if (stack.hasTagCompound())
                            {
                                item.getEntityItem().setTagCompound((NBTTagCompound)stack.getTagCompound().copy());
                            }

                            float f3 = 0.05F;
                            item.motionX = (double)((float)this.rand.nextGaussian() * f3);
                            item.motionY = (double)((float)this.rand.nextGaussian() * f3 + 0.2F);
                            item.motionZ = (double)((float)this.rand.nextGaussian() * f3);
                            world.spawnEntityInWorld(item);
                        }
                    }
                }

                world.func_147453_f(x, y, z, block);
            }
        }
        super.breakBlock(world, x, y, z, block, oldBlock);
    }

    public Item getItem(World world, int x, int y, int z)
    {
        return Item.getItemFromBlock(FTContent.adamantiumFurnaceIdle);
    }
}
