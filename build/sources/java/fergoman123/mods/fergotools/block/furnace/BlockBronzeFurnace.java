package fergoman123.mods.fergotools.block.furnace;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fergoman123.mods.fergotools.FergoTools;
import fergoman123.mods.fergotools.init.ModBlocks;
import fergoman123.mods.fergotools.lib.Reference;
import fergoman123.mods.fergotools.lib.Textures.BlockTextures;
import fergoman123.mods.fergotools.lib.Textures.FurnaceTextures;
import fergoman123.mods.fergotools.tileentity.TileEntityBronzeFurnace;
import fergoman123.mods.fergotools.util.UtilBlockItem;
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

public class BlockBronzeFurnace extends BlockContainer
{

	
		private final Random rand = new Random();

        private TileEntityBronzeFurnace furnace = new TileEntityBronzeFurnace();
		
		private final boolean isActive;
		
		private static boolean keepInventory;
		@SideOnly(Side.CLIENT)
		public IIcon iconTop;
		@SideOnly(Side.CLIENT)
		public IIcon iconFront;
		
		public BlockBronzeFurnace(boolean isActive)
		{
			super(Material.rock);
			this.isActive = isActive;
		}
		
		public Item getItemDropped(int par1, Random rand, int par2)
		{
			return UtilBlockItem.itemBronzeFurnace;
		}
		
		public void onBlockAdded(World world, int x, int y, int z)
		{
			super.onBlockAdded(world, x, y, z);
			this.setDefaultDirection(world, x, y, z);
		}

    private void setDefaultDirection(World par1World, int par2, int par3, int par4)
    {
        if (!par1World.isRemote)
        {
            Block a = par1World.getBlock(par2, par3, par4 - 1);
            Block b = par1World.getBlock(par2, par3, par4 + 1);
            Block c = par1World.getBlock(par2 - 1, par3, par4);
            Block d = par1World.getBlock(par2 + 1, par3, par4);
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

            par1World.setBlockMetadataWithNotify(par2, par3, par4, b0, 2);
        }
    }
		
		@SideOnly(Side.CLIENT)
		public IIcon getIcon(int par1, int par2)
		{
			if(par2 == 0)
			par2 = 3;
			return par1 == 1 ? this.iconTop : (par1 == 0 ? this.iconTop : (par1 != par2 ? this.blockIcon : this.iconFront));
		}
		
		@SideOnly(Side.CLIENT)
		public void registerBlockIcons(IIconRegister register)
        {
            this.blockIcon = register.registerIcon(BlockTextures.blockBronze);
			this.iconFront = register.registerIcon(Reference.textureLoc + (this.isActive ? FurnaceTextures.bronzeFurnaceActive : FurnaceTextures.bronzeFurnaceIdle));
			this.iconTop = register.registerIcon(BlockTextures.blockBronze);
		}
		
		public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int par6, float par7, float par8, float par9)
		{
			if(world.isRemote)
			{
				return true;
			}
			else if(!player.isSneaking())
			{
                TileEntityBronzeFurnace var10 = (TileEntityBronzeFurnace) world.getTileEntity(x, y, z);
				if(var10 != null)
				{
					player.openGui(FergoTools.instance, 4, world, x, y, z);
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
			
			if(active)
			{
                world.setBlock(x, y, z, ModBlocks.bronzeFurnaceActive);
			}
			else
			{
                world.setBlock(x, y, z, ModBlocks.bronzeFurnaceIdle);
			}
			
			keepInventory = false;
			world.setBlockMetadataWithNotify(x, y, z, l, 2);
			
			if(entity != null)
			{
				entity.validate();
				world.setTileEntity(x, y, z, entity);
			}
		}
		
		@SideOnly(Side.CLIENT)
		public void randomDisplayTick(World world, int x, int y, int z, Random rand)
	    {
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
		
		public TileEntity createNewTileEntity(World world, int var)
		{
			return this.furnace;
		}
		
		public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase elb, ItemStack itemstack)
		{
			int l = MathHelper.floor_double((double)(elb.rotationYaw * 4f / 360f) + 0.5d) & 3;
			
			if(l == 0)
			{
                world.setBlockMetadataWithNotify(x, y, z, 2, 2);
			}
			
			if(l == 1)
			{
                world.setBlockMetadataWithNotify(x, y, z, 5, 2);
			}
			
			if(l == 2)
			{
                world.setBlockMetadataWithNotify(x, y, z, 3, 2);
			}
			
			if(l == 3)
			{
                world.setBlockMetadataWithNotify(x, y, z, 4, 2);
			}
			
			if(itemstack.hasDisplayName())
			{
				((TileEntityBronzeFurnace)world.getTileEntity(x, y, z)).setGuiDisplayName(itemstack.getDisplayName());
			}
		}
		
		public void breakBlock(World world, int x, int y, int z, Block block, int par6)
		{
			if (!keepInventory)
	        {
                TileEntityBronzeFurnace tileentityfurnace = (TileEntityBronzeFurnace)world.getTileEntity(x, y, z);

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

	        super.breakBlock(world, x, y, z, block, par6);
		}
		
		public boolean hasComparatorInputOverride()
		{
			return true;
		}
		
		public int getComparatorInputOverride(World world, int x, int y, int z, int par1)
		{
			return Container.calcRedstoneFromInventory((IInventory)world.getTileEntity(x, y, z));
		}
		
		public Item getItem(World world, int x, int y, int z)
		{
			return Item.getItemFromBlock(ModBlocks.bronzeFurnaceIdle);
		}
}