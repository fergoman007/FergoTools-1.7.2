package fergoman123.mods.fergotools.block.furnace;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.handler.TileHandler;
import fergoman123.mods.fergotools.init.ModBlocks;
import fergoman123.mods.fergotools.lib.Reference;
import fergoman123.mods.fergotools.tileentity.TileEntityMacerator;
import fergoman123.mods.fergotools.util.BlockFurnaceFT;
import net.minecraft.block.Block;
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

/**
 * Created by Fergoman123 on 05/06/2014.
 */
public class BlockMacerator extends BlockFurnaceFT {

    private final Random rand = new Random();

    private final boolean isActive;

    private static boolean keepInventory;

    @SideOnly(Side.CLIENT)
    private IIcon iconTop;

    @SideOnly(Side.CLIENT)
    private IIcon iconFront;

    public BlockMacerator(boolean isActive) {
        super(Material.iron);
        this.isActive = isActive;
    }

    @Override
    public Item getItemDropped(int par1, Random rand, int par3) {
        return Item.getItemFromBlock(ModBlocks.maceratorIdle);
    }

    public void onBlockAdded(World world, int x, int y, int z)
    {
        super.onBlockAdded(world, x, y, z);
        this.setDefaultDirection(world, x, y, z);
    }

    @Override
    public void setDefaultDirection(World world, int x, int y, int z)
    {
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

            if (c.func_149730_j() && !d.func_149730_j())
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

    @Override
    public IIcon getIcon(int par1, int par2) {
       if (par2 == 0)
           par2 =3;
        return par1 == 1 ? this.iconTop : (par1 == 0 ? this.iconTop : (par1 != par2 ? this.blockIcon : this.iconFront));
    }

    @Override
    public void registerBlockIcons(IIconRegister register)
    {
        this.blockIcon = register.registerIcon("iron_block");
        this.iconFront = register.registerIcon(Reference.textureLoc + (this.isActive ? "maceratorActive" : "maceratorIdle"));
        this.iconTop = register.registerIcon("iron_block");
    }

    @Override
    public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ)
    {
        if (world.isRemote)
        {
            return true;
        }
        else if (!player.isSneaking())
        {
            TileEntityMacerator macerator = (TileEntityMacerator)world.getTileEntity(x, y, z);
            if (macerator != null)
            {
                player.openGui(FergoTools.instance, 10, world, x, y, z);
            }
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void updateMaceratorBlockState(boolean active, World world, int x, int y, int z)
    {
        int l = world.getBlockMetadata(x, y, z);
        TileEntity entity = world.getTileEntity(x, y, z);
        keepInventory = true;

        if (active)
        {
            world.setBlock(x, y, z, ModBlocks.maceratorActive);
        }
        else
        {
            world.setBlock(x, y, z, ModBlocks.maceratorIdle);
        }

        keepInventory = false;
        world.setBlockMetadataWithNotify(x, y, z, l, 2);

        if (entity != null)
        {
            entity.validate();
            world.setTileEntity(x, y, z, entity);
        }
    }

    @Override
    public void randomDisplayTick(World world, int x, int y, int z, Random rand) {
        if (this.isActive)
        {
            int l = world.getBlockMetadata(x, y, z);
            float f = (float)x + 0.5F;
            float f1 = (float)y + 0.0F + rand.nextFloat() * 6.0F / 16.0F;
            float f2 = (float)z + 0.5F;
            float f3 = 0.52F;
            float f4 = rand.nextFloat() * 0.6F - 0.3F;

            if (l == 4)
            {
                world.spawnParticle("smoke", (double)(f - f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
                world.spawnParticle("flame", (double)(f - f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
            }
            else if (l == 5)
            {
                world.spawnParticle("smoke", (double)(f + f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
                world.spawnParticle("flame", (double)(f + f3), (double)f1, (double)(f2 + f4), 0.0D, 0.0D, 0.0D);
            }
            else if (l == 2)
            {
                world.spawnParticle("smoke", (double)(f + f4), (double)f1, (double)(f2 - f3), 0.0D, 0.0D, 0.0D);
                world.spawnParticle("flame", (double)(f + f4), (double)f1, (double)(f2 - f3), 0.0D, 0.0D, 0.0D);
            }
            else if (l == 3)
            {
                world.spawnParticle("smoke", (double)(f + f4), (double)f1, (double)(f2 + f3), 0.0D, 0.0D, 0.0D);
                world.spawnParticle("flame", (double)(f + f4), (double)f1, (double)(f2 + f3), 0.0D, 0.0D, 0.0D);
            }
        }
    }

    @Override
    public TileEntity createNewTileEntity(World world, int var) {
        return TileHandler.macerator;
    }

    @Override
    public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase elb, ItemStack stack) {
        int l = MathHelper.floor_double((double)(elb.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;

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
            ((TileEntityMacerator)world.getTileEntity(x, y, z)).setGuiDisplayName(stack.getDisplayName());
        }
    }

    public void breakBlock(World world, int x, int y, int z, Block block, int oldBlock)
    {
        if (!keepInventory)
        {
            TileEntityMacerator macerator = (TileEntityMacerator)world.getTileEntity(x, y, z);

            if (macerator != null)
            {
                for (int j1 = 0; j1 < macerator.getSizeInventory(); ++j1)
                {
                    ItemStack itemstack = macerator.getStackInSlot(j1);

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
                            EntityItem entityitem = new EntityItem(world, (double)((float)x + f), (double)((float)y + f1), (double)((float)z + f2), new ItemStack(itemstack.getItem(), k1, itemstack.getItemDamage()));

                            if (itemstack.hasTagCompound())
                            {
                                entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
                            }

                            float f3 = 0.05F;
                            entityitem.motionX = (double)((float)this.rand.nextGaussian() * f3);
                            entityitem.motionY = (double)((float)this.rand.nextGaussian() * f3 + 0.2F);
                            entityitem.motionZ = (double)((float)this.rand.nextGaussian() * f3);
                            world.spawnEntityInWorld(entityitem);
                        }
                    }
                }

                world.func_147453_f(x, y, z, block);
            }
        }

        super.breakBlock(world, x, y, z, block, oldBlock);
    }

    public boolean hasComparatorInputOverride(){return true;}

    public int getComparatorInputOverride(World world, int x, int y, int z, int par5)
    {
        return Container.calcRedstoneFromInventory((IInventory)world.getTileEntity(x, y, z));
    }

    public Item getItem(World world, int x, int y, int z)
    {
        return Item.getItemFromBlock(ModBlocks.maceratorIdle);
    }
}
