package fergoman123.mods.fergotools.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fergoman123.mods.fergotools.block.storage.BlockAdamantium;
import fergoman123.mods.fergotools.config.ConfigHandler;
import fergoman123.mods.fergotools.reference.Reference;
import fergoman123.mods.fergotools.world.TeleporterFDP;
import fergoman123.mods.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBreakable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemMonsterPlacer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public class BlockFDPPortal extends BlockBreakable
{
    public static final Block instance = new BlockFDPPortal();

    public String texture = "portal";

    private IIcon[] icons = new IIcon[6];

    public BlockFDPPortal()
    {
        super("", Material.portal, false);
        this.setTickRandomly(true);
        this.setHardness(-1f);
        this.setLightLevel(0.75f);
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        if (side == 0)
            return icons[0];

        else if (side == 1)
            return icons[1];

        else if (side == 2)
            return icons[2];

        else if (side == 3)
            return icons[3];

        else if (side == 4)
            return icons[4];

        else if (side == 5)
            return icons[5];

        else
            return icons[0];
    }

    public void registerBlockIcons(IIconRegister register)
    {
        this.icons[0] = register.registerIcon(texture);
        this.icons[1] = register.registerIcon(texture);
        this.icons[2] = register.registerIcon(texture);
        this.icons[3] = register.registerIcon(texture);
        this.icons[4] = register.registerIcon(texture);
        this.icons[5] = register.registerIcon(texture);
    }

    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        super.updateTick(par1World, par2, par3, par4, par5Random);
        if (par1World.provider.isSurfaceWorld())
        {
            int l;
            for (l = par3; !par1World.doesBlockHaveSolidTopSurface(par1World, par2, l, par4) && l > 0; --l)
            {
                ;
            }
            if (l > 0 && !par1World.isBlockNormalCubeDefault(par2, l + 1, par4, true))
            {
                Entity entity = ItemMonsterPlacer.spawnCreature(par1World, 57, (double) par2 + 0.5D, (double) l + 1.1D, (double) par4 + 0.5D);
                if (entity != null)
                {
                    entity.timeUntilPortal = entity.getPortalCooldown();
                }
            }
        }
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        return null;
    }

    public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
    {
        float f;
        float f1;
        if (par1IBlockAccess.getBlock(par2 - 1, par3, par4) != this && par1IBlockAccess.getBlock(par2 + 1, par3, par4) != this)
        {
            f = 0.125F;
            f1 = 0.5F;
            this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f1, 0.5F + f, 1.0F, 0.5F + f1);
        }
        else
        {
            f = 0.5F;
            f1 = 0.125F;
            this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f1, 0.5F + f, 1.0F, 0.5F + f1);
        }
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    @Override
    public boolean renderAsNormalBlock()
    {
        return false;
    }

    public String getUnlocalizedName()
    {
        return NameHelper.format("tile.%s%s", Reference.textureLoc , NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public static boolean tryToCreatePortal(World par1World, int par2, int par3, int par4)
    {
        byte b0 = 0;
        byte b1 = 0;
        if (par1World.getBlock(par2 - 1, par3, par4) == BlockAdamantium.instance || par1World.getBlock(par2 + 1, par3, par4) == BlockAdamantium.instance)
        {
            b0 = 1;
        }
        if (par1World.getBlock(par2, par3, par4 - 1) == BlockAdamantium.instance || par1World.getBlock(par2, par3, par4 + 1) == BlockAdamantium.instance)
        {
            b1 = 1;
        }
        if (b0 == b1)
        {
            return false;
        }
        else
        {
            if (par1World.getBlock(par2 - b0, par3, par4 - b1) == Blocks.air)
            {
                par2 -= b0;
                par4 -= b1;
            }
            int l;
            int i1;
            for (l = -1; l <= 2; ++l)
            {
                for (i1 = -1; i1 <= 3; ++i1)
                {
                    boolean flag = l == -1 || l == 2 || i1 == -1 || i1 == 3;
                    if (l != -1 && l != 2 || i1 != -1 && i1 != 3)
                    {
                        Block j1 = par1World.getBlock(par2 + b0 * l, par3 + i1, par4 + b1 * l);
                        if (flag)
                        {
                            if (j1 != BlockAdamantium.instance)
                            {
                                return false;
                            }
                        }
         /*else if (j1 != 0 && j1 != Main.TutorialFire.blockID)
         {
         return false;
         }*/
                    }
                }
            }
            for (l = 0; l < 2; ++l)
            {
                for (i1 = 0; i1 < 3; ++i1)
                {
                    par1World.setBlock(par2 + b0 * l, par3 + i1, par4 + b1 * l, instance, 0, 2);
                }
            }
            return true;
        }
    }

    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    {
        byte b0 = 0;
        byte b1 = 1;
        if (par1World.getBlock(par2 - 1, par3, par4) == this || par1World.getBlock(par2 + 1, par3, par4) == this)
        {
            b0 = 1;
            b1 = 0;
        }
        int i1;
        for (i1 = par3; par1World.getBlock(par2, i1 - 1, par4) == this; --i1)
        {
            ;
        }
        if (par1World.getBlock(par2, i1 - 1, par4) != BlockAdamantium.instance)
        {
            par1World.setBlockToAir(par2, par3, par4);
        }
        else
        {
            int j1;
            for (j1 = 1; j1 < 4 && par1World.getBlock(par2, i1 + j1, par4) == this; ++j1)
            {
                ;
            }
            if (j1 == 3 && par1World.getBlock(par2, i1 + j1, par4) == BlockAdamantium.instance)
            {
                boolean flag = par1World.getBlock(par2 - 1, par3, par4) == this || par1World.getBlock(par2 + 1, par3, par4) == this;
                boolean flag1 = par1World.getBlock(par2, par3, par4 - 1) == this || par1World.getBlock(par2, par3, par4 + 1) == this;
                if (flag && flag1)
                {
                    par1World.setBlockToAir(par2, par3, par4);
                }
                else
                {
                    if ((par1World.getBlock(par2 + b0, par3, par4 + b1) != BlockAdamantium.instance || par1World.getBlock(par2 - b0, par3, par4 - b1) != this) && (par1World.getBlock(par2 - b0, par3, par4 - b1) != BlockAdamantium.instance || par1World.getBlock(par2 + b0, par3, par4 + b1) != this))
                    {
                        par1World.setBlockToAir(par2, par3, par4);
                    }
                }
            }
            else
            {
                par1World.setBlockToAir(par2, par3, par4);
            }
        }
    }

    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess par1IBlockAccess, int par2, int par3, int par4, int par5)
    {
        if (par1IBlockAccess.getBlock(par2, par3, par4) == this)
        {
            return false;
        }
        else
        {
            boolean flag = par1IBlockAccess.getBlock(par2 - 1, par3, par4) == this && par1IBlockAccess.getBlock(par2 - 2, par3, par4) != this;
            boolean flag1 = par1IBlockAccess.getBlock(par2 + 1, par3, par4) == this && par1IBlockAccess.getBlock(par2 + 2, par3, par4) != this;
            boolean flag2 = par1IBlockAccess.getBlock(par2, par3, par4 - 1) == this && par1IBlockAccess.getBlock(par2, par3, par4 - 2) != this;
            boolean flag3 = par1IBlockAccess.getBlock(par2, par3, par4 + 1) == this && par1IBlockAccess.getBlock(par2, par3, par4 + 2) != this;
            boolean flag4 = flag || flag1;
            boolean flag5 = flag2 || flag3;
            return flag4 && par5 == 4 ? true : (flag4 && par5 == 5 ? true : (flag5 && par5 == 2 ? true : flag5 && par5 == 3));
        }
    }

    public int quantityDropped(Random random){return 0;}

    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
    {
        if ((par5Entity.ridingEntity == null) && (par5Entity.riddenByEntity == null) && ((par5Entity instanceof EntityPlayerMP)))
        {
            EntityPlayerMP thePlayer = (EntityPlayerMP)par5Entity;
            if (thePlayer.timeUntilPortal > 0)
            {
                thePlayer.timeUntilPortal = 10;
            }
            else if (thePlayer.dimension != ConfigHandler.dimId)
            {
                // Teleports player to Fergoman123's Dense Plains
                thePlayer.timeUntilPortal = 10;
                thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, ConfigHandler.dimId, new TeleporterFDP(thePlayer.mcServer.worldServerForDimension(ConfigHandler.dimId)));
            }
            else {
                // Return the player to the overworld
                thePlayer.timeUntilPortal = 10;
                thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, 0, new TeleporterFDP(thePlayer.mcServer.worldServerForDimension(0)));
            }
        }
    }

    public int getRenderBlockPass(){return 1;}

    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        if (par5Random.nextInt(100) == 0)
        {
            par1World.playSound((double)par2 + 0.5D, (double)par3 + 0.5D, (double)par4 + 0.5D, "portal.portal", 0.5F, par5Random.nextFloat() * 0.4F + 0.8F, false);
        }
        for (int l = 0; l < 4; ++l)
        {
            double d0 = (double)((float)par2 + par5Random.nextFloat());
            double d1 = (double)((float)par3 + par5Random.nextFloat());
            double d2 = (double)((float)par4 + par5Random.nextFloat());
            double d3 = 0.0D;
            double d4 = 0.0D;
            double d5 = 0.0D;
            int i1 = par5Random.nextInt(2) * 2 - 1;
            d3 = ((double)par5Random.nextFloat() - 0.5D) * 0.5D;
            d4 = ((double)par5Random.nextFloat() - 0.5D) * 0.5D;
            d5 = ((double)par5Random.nextFloat() - 0.5D) * 0.5D;
            if (par1World.getBlock(par2 - 1, par3, par4) != this && par1World.getBlock(par2 + 1, par3, par4) != this)
            {
                d0 = (double)par2 + 0.5D + 0.25D * (double)i1;
                d3 = (double)(par5Random.nextFloat() * 2.0F * (float)i1);
            }
            else
            {
                d2 = (double)par4 + 0.5D + 0.25D * (double)i1;
                d5 = (double)(par5Random.nextFloat() * 2.0F * (float)i1);
            }
            par1World.spawnParticle("portal", d0, d1, d2, d3, d4, d5);
        }
    }

    public Item getItem(World world, int x, int y, int z)
    {
        return Item.getItemFromBlock(instance);
    }
}
