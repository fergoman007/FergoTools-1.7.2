package fergoman123.mods.fergotools.block.furnace;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.init.ModBlocks;
import fergoman123.mods.fergotools.lib.Reference;
import fergoman123.mods.fergotools.lib.Textures.*;
import fergoman123.mods.fergotools.tileentity.TileEntityObsidianFurnace;
import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

import java.util.Random;

import static cpw.mods.fml.relauncher.Side.CLIENT;

/**
 * Created by Fergoman123 on 24/03/2014.
 */
public class BlockObsidianFurnace extends BlockContainer {

    private final Random rand = new Random();

    private final boolean isActive;

    private static boolean keepInventory;

    @SideOnly(CLIENT)
    private IIcon iconTop;
    @SideOnly(CLIENT)
    private IIcon iconFront;


    public BlockObsidianFurnace(boolean isActive)
    {
        super(Material.iron);
        this.isActive = isActive;
    }

    public Item getItemDropped(int par1, Random rand, int par2)
    {
        return Item.getItemFromBlock(ModBlocks.obsidianFurnaceIdle);
    }

    public void onBlockAdded(World world, int x, int y, int z)
    {
        super.onBlockAdded(world, x, y, z);
        this.setDefaultDirection(world, x, y, z);
    }

    private void setDefaultDirection(World world, int x, int y, int z) {
        if (!world.isRemote)
        {
            Block a = world.getBlock(x, y, z - 1);
            Block b = world.getBlock(x, y, z + 1);
            Block c = world.getBlock(x - 1, y, z);
            Block d = world.getBlock(x + 1, y, z);
            byte b0 = 3;

            if (a.func_149730_j() && !b.func_149730_j())
            {
                b0 = 3;
            }

            if (b.func_149730_j() && !a.func_149730_j())
            {
                b0 = 2;
            }

            if(c.func_149730_j() && !d.func_149730_j())
            {
                b0 = 5;
            }

            if (d.func_149730_j() && !c.func_149730_j())
            {
                b0 = 4;
            }

            world.setBlockMetadataWithNotify(x, y, z, b0, 2);
        }
    }

    @SideOnly(CLIENT)
    public IIcon getIcon(int par1, int par2)
    {
        if(par2 == 0)
            par2 = 3;
        return par1 == 1 ?this.iconTop :(par1 == 0 ? this.iconTop : (par1 != par2 ? this.blockIcon : this.iconFront));
    }
    @SideOnly(CLIENT)
    public void registerBlockIcons(IIconRegister register)
    {
     this.blockIcon = register.registerIcon(BlockTextures.blockObsidian);
     this.iconFront = register.registerIcon(Reference.textureLoc + (this.isActive ? FurnaceTextures.obsidianFurnaceActive : FurnaceTextures.obsidianFurnaceIdle));
     this.iconTop = register.registerIcon(BlockTextures.blockObsidian);
    }

    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitz)
    {
        if (world.isRemote)
        {
            return true;
        }
        else if (!player.isSneaking())
        {
            TileEntityObsidianFurnace furnace = (TileEntityObsidianFurnace)world.getTileEntity(x, y, z);
            if (furnace != null)
            {
                player.openGui(FergoTools.instance, 1, world, x, y, z);
            }
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void updateFurnaceBlockState(boolean active, World world, int x, int y, int z)
    {
        int l = world.getBlockMetadata(x, y, z);
        TileEntity entity = world.getTileEntity(x, y, z);
        keepInventory = true;

        if (active)
        {
            world.setBlock(x, y, z, ModBlocks.obsidianFurnaceActive);
        }
        else
        {
            world.setBlock(x, y, z, ModBlocks.obsidianFurnaceIdle);
        }

        keepInventory = false;
        world.setBlockMetadataWithNotify(x, y, z, l, 2);

        if (entity != null)
        {
            entity.validate();
            world.setTileEntity(x, y, z, entity);
        }
    }

    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (this.isActive)
        {
            int l = par1World.getBlockMetadata(par2, par3, par4);
            float f = (float)par2 + 0.5F;
            float f1 = (float)par3 + 0.0F + par5Random.nextFloat() * 6.0F / 16.0F;
            float f2 = (float)par4 + 0.5F;
            float f3 = 0.52F;
            float f4 = par5Random.nextFloat() * 0.6F - 0.3F;

            if (l == 4)
            {
                par1World.spawnParticle("smoke", (double)(f - f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
                par1World.spawnParticle("flame", (double)(f - f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
            }
            else if (l == 5)
            {
                par1World.spawnParticle("smoke", (double)(f + f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
                par1World.spawnParticle("flame", (double)(f + f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
            }
            else if (l == 2)
            {
                par1World.spawnParticle("smoke", (double)(f + f4), (double)f1, (double)(f2 - f3), 0.0D, 0.0D, 0.0D);
                par1World.spawnParticle("flame", (double)(f + f4), (double)f1, (double)(f2 - f3), 0.0D, 0.0D, 0.0D);
            }
            else if (l == 3)
            {
                par1World.spawnParticle("smoke", (double)(f + f4), (double)f1, (double)(f2 + f3), 0.0D, 0.0D, 0.0D);
                par1World.spawnParticle("flame", (double)(f + f4), (double)f1, (double)(f2 + f3), 0.0D, 0.0D, 0.0D);
            }
        }
    }

    public TileEntity createNewTileEntity(World world, int var1)
    {
        return new TileEntityObsidianFurnace();
    }

    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase elb, ItemStack stack)
    {
        int l = MathHelper.floor_double((double) (elb.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

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
            ((TileEntityObsidianFurnace)world.getTileEntity(x, y, z)).setGuiDisplayName(stack.getDisplayName());
        }
    }

    public void breakBlock(World par1World, int par2, int par3, int par4, Block block, int par6)
    {
        if (!keepInventory)
        {
            TileEntityObsidianFurnace tileentityfurnace = (TileEntityObsidianFurnace)par1World.getTileEntity(par2, par3, par4);

            if (tileentityfurnace != null)
            {
                for (int j1 = 0; j1 < tileentityfurnace.getSizeInventory(); ++j1)
                {
                    ItemStack itemstack = tileentityfurnace.getStackInSlot(j1);

                    if (itemstack != null)
                    {
                        float f = this.rand.nextFloat() * 0.8F + 0.1F;
                        float f1 = this.rand.nextFloat() * 0.8F + 0.1F;
                        float f2 = this.rand.nextFloat() * 0.8F + 0.1F;

                        while (itemstack.stackSize > 0)
                        {
                            int k1 = this.rand.nextInt(21) + 10;

                            if (k1 > itemstack.stackSize)
                            {
                                k1 = itemstack.stackSize;
                            }

                            itemstack.stackSize -= k1;
                            EntityItem entityitem = new EntityItem(par1World, (double)((float)par2 + f), (double)((float)par3 + f1), (double)((float)par4 + f2), new ItemStack(itemstack.getItem(), k1, itemstack.getItemDamage()));

                            if (itemstack.hasTagCompound())
                            {
                                entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
                            }

                            float f3 = 0.05F;
                            entityitem.motionX = (double)((float)this.rand.nextGaussian() * f3);
                            entityitem.motionY = (double)((float)this.rand.nextGaussian() * f3 + 0.2F);
                            entityitem.motionZ = (double)((float)this.rand.nextGaussian() * f3);
                            par1World.spawnEntityInWorld(entityitem);
                        }
                    }
                }

                par1World.func_147453_f(par2, par3, par4, block);
            }
        }

        super.breakBlock(par1World, par2, par3, par4, block, par6);
    }

    public boolean hasComparatorInputOverride(){return true;}

    public int getComparatorInputOverride(World par1World, int x, int y, int z, int par5){return Container.calcRedstoneFromInventory((IInventory)par1World.getTileEntity(x, y, z));}

    @SideOnly(Side.CLIENT)
    public Item getItem(World world, int x, int y, int z)
    {
        return Item.getItemFromBlock(ModBlocks.obsidianFurnaceIdle);
    }
}