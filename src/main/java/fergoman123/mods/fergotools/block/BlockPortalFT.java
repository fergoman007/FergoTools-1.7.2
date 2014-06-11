package fergoman123.mods.fergotools.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fergoman123.mods.fergotools.handler.WorldHandler;
import fergoman123.mods.fergotools.init.ModBlocks;
import fergoman123.mods.fergotools.lib.Reference;
import fergoman123.mods.fergotools.world.teleporter.TeleporterFT;
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

public class BlockPortalFT extends BlockBreakable {

    private IIcon icon1;
    private IIcon icon2;
    private IIcon icon3;
    private IIcon icon4;
    private IIcon icon5;
    private IIcon icon6;

    public BlockPortalFT()
    {
        super("", Material.portal, false);
        this.setTickRandomly(true);
        this.setHardness(-1.0F);
        this.setLightLevel(0.75F);
        this.setBlockName("blockPortalFT");
    }

    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(int side, int meta)
    {
        if (side == 0)
            return icon1;

        else if (side == 1)
            return icon2;

        else if (side == 2)
            return icon3;

        else if (side == 3)
            return icon4;

        else if (side == 4)
            return icon6;

        else if (side == 5)
            return icon5;

        else
            return icon1;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void registerBlockIcons(IIconRegister register)
    {
        this.icon1 = register.registerIcon(Reference.textureLoc + "blockPortalFT");
        this.icon2 = register.registerIcon(Reference.textureLoc + "blockPortalFT");
        this.icon3 = register.registerIcon(Reference.textureLoc + "blockPortalFT");
        this.icon4 = register.registerIcon(Reference.textureLoc + "blockPortalFT");
        this.icon5 = register.registerIcon(Reference.textureLoc + "blockPortalFT");
        this.icon6 = register.registerIcon(Reference.textureLoc + "blockPortalFT");
    }

    public void updateTick(World world, int x, int y, int z, Random rand)
    {
        if (world.provider.isSurfaceWorld())
        {
            int l;
            for (l = y; !world.doesBlockHaveSolidTopSurface(world, x, l, z) && l > 0; --l)
            {
                ;
            }
            if (l > 0 && !world.isBlockNormalCubeDefault(x, l + 1, z, true))
            {
                Entity entity = ItemMonsterPlacer.spawnCreature(world, 57, (double) x + 0.5D, (double) l + 1.1D, (double) z + 0.5D);
                if (entity != null)
                {
                    entity.timeUntilPortal = entity.getPortalCooldown();
                }
            }
        }
    }

    public AxisAlignedBB getCollisionBoundingBoxFromPool(World world, int x, int y, int z)
    {
        return null;
    }

    public void setBlockBoundsBasedOnState(IBlockAccess blockAccess, int x, int y, int z)
    {
        float f;
        float f1;
        if (blockAccess.getBlock(x - 1, y, z) != this && blockAccess.getBlock(x + 1, y, z) != this)
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

    public boolean renderAsNormalBlock()
    {
        return false;
    }

    public boolean tryToCreatePortal(World world, int x, int y, int z)
    {
        byte b0 = 0;
        byte b1 = 0;
        if (world.getBlock(x - 1, y, z) == Blocks.stone || world.getBlock(x + 1, y, z) == Blocks.stone)
        {
            b0 = 1;
        }
        if (world.getBlock(x, y, z - 1) == Blocks.stone || world.getBlock(x, y, z + 1) == Blocks.stone)
        {
            b1 = 1;
        }
        if (b0 == b1)
        {
            return false;
        }
        else
        {
            if (world.getBlock(x - b0, y, z - b1) == Blocks.air)
            {
                x -= b0;
                z -= b1;
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
                        Block j1 = world.getBlock(x + b0 * l, y + i1, z + b1 * l);
                        if (flag)
                        {
                            if (j1 != ModBlocks.blockObsidian)
                            {
                                return false;
                            }
                        }
                    }
                }
            }
            for (l = 0; l < 2; ++l)
            {
                for (i1 = 0; i1 < 3; ++i1)
                {
                    world.setBlock(x + b0 * l, y + i1, z + b1 * l, WorldHandler.portal, 0, 2);
                }
            }
            return true;
        }
    }

    public void onNeighborBlockChange(World world, int x, int y, int z, int par5)
    {
        byte b0 = 0;
        byte b1 = 1;
        if (world.getBlock(x - 1, y, z) == this || world.getBlock(x + 1, y, z) == this)
        {
            b0 = 1;
            b1 = 0;
        }
        int i1;
        for (i1 = y; world.getBlock(x, i1 - 1, z) == this; --i1)
        {
            ;
        }
        if (world.getBlock(x, i1 - 1, z) != Blocks.stone)
        {
            world.setBlockToAir(x, y, z);
        }
        else
        {
            int j1;
            for (j1 = 1; j1 < 4 && world.getBlock(x, i1 + j1, z) == this; ++j1)
            {
                ;
            }
            if (j1 == 3 && world.getBlock(x, i1 + j1, z) == Blocks.stone)
            {
                boolean flag = world.getBlock(x - 1, y, z) == this || world.getBlock(x + 1, y, z) == this;
                boolean flag1 = world.getBlock(x, y, z - 1) == this || world.getBlock(x, y, z + 1) == this;
                if (flag && flag1)
                {
                    world.setBlockToAir(x, y, z);
                }
                else
                {
                    if ((world.getBlock(x + b0, y, z + b1) != Blocks.stone || world.getBlock(x - b0, y, z - b1) != this) && (world.getBlock(x - b0, y, z - b1) != Blocks.stone || world.getBlock(x + b0, y, z + b1) != this))
                    {
                        world.setBlockToAir(x, y, z);
                    }
                }
            }
            else
            {
                world.setBlockToAir(x, y, z);
            }
        }
    }

    public boolean shouldSideBeRendered(IBlockAccess blockAccess, int x, int y, int z, int par5)
    {
        if (blockAccess.getBlock(x, y, z) == this)
        {
            return false;
        }
        else
        {
            boolean flag = blockAccess.getBlock(x - 1, y, y) == this && blockAccess.getBlock(x - 2, y, z) != this;
            boolean flag1 = blockAccess.getBlock(x + 1, y, y) == this && blockAccess.getBlock(x + 2, y, z) != this;
            boolean flag2 = blockAccess.getBlock(x, y, y - 1) == this && blockAccess.getBlock(x, y, z - 2) != this;
            boolean flag3 = blockAccess.getBlock(x, y, y + 1) == this && blockAccess.getBlock(x, y, z + 2) != this;
            boolean flag4 = flag || flag1;
            boolean flag5 = flag2 || flag3;
            return flag4 && par5 == 4 ? true : (flag4 && par5 == 5 ? true : (flag5 && par5 == 2 ? true : flag5 && par5 == 3));
        }
    }

    public int quantityDropped(Random rand){return 0;}

    public void onEntityCollidedWithBlock(World world, int x, int y, int z, Entity entity)
    {
        if ((entity.ridingEntity == null) && (entity.riddenByEntity == null) && (entity instanceof EntityPlayerMP))
        {
            EntityPlayerMP player = (EntityPlayerMP)entity;
            if (player.timeUntilPortal > 0)
            {
                player.timeUntilPortal = 10;
            }
            else if (player.dimension != WorldHandler.dimId)
            {
             player.timeUntilPortal = 10;
                player.mcServer.getConfigurationManager().transferPlayerToDimension(player, WorldHandler.dimId, new TeleporterFT(player.mcServer.worldServerForDimension(WorldHandler.dimId)));
            }
            else
            {
                player.timeUntilPortal = 10;
                player.mcServer.getConfigurationManager().transferPlayerToDimension(player, 0, new TeleporterFT(player.mcServer.worldServerForDimension(0)));
            }
        }
    }

    @SideOnly(Side.CLIENT)
    public int getRenderBlockPass()
    {
        return 1;
    }

    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World world, int x, int y, int z, Random rand)
    {
        if (rand.nextInt(100) == 0)
        {
            world.playSound((double)x + 0.5D, (double)y + 0.5D, (double)z + 0.5D, "portal.portal", 0.5F, rand.nextFloat() * 0.4F + 0.8F, false);
        }
        for (int l = 0; l < 4; ++l)
        {
            double d0 = (double)((float)x + rand.nextFloat());
            double d1 = (double)((float)y + rand.nextFloat());
            double d2 = (double)((float)z + rand.nextFloat());
            double d3 = 0.0D;
            double d4 = 0.0D;
            double d5 = 0.0D;
            int i1 = rand.nextInt(2) * 2 - 1;
            d3 = ((double)rand.nextFloat() - 0.5D) * 0.5D;
            d4 = ((double)rand.nextFloat() - 0.5D) * 0.5D;
            d5 = ((double)rand.nextFloat() - 0.5D) * 0.5D;
            if (world.getBlock(x - 1, y, z) != this && world.getBlock(x + 1, y, z) != this)
            {
                d0 = (double)x + 0.5D + 0.25D * (double)i1;
                d3 = (double)(rand.nextFloat() * 2.0F * (float)i1);
            }
            else
            {
                d2 = (double)z + 0.5D + 0.25D * (double)i1;
                d5 = (double)(rand.nextFloat() * 2.0F * (float)i1);
            }
            world.spawnParticle("portal", d0, d1, d2, d3, d4, d5);
        }
    }

    public Item getItem(World world, int x, int y, int z)
    {
        return Item.getItemFromBlock(WorldHandler.portal);
    }
}
