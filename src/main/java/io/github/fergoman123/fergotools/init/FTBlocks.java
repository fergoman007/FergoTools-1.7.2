package io.github.fergoman123.fergotools.init;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.github.fergoman123.fergotools.reference.Reference;
import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergotools.reference.names.BlockNames;
import io.github.fergoman123.fergotools.util.base.BlockFT;
import io.github.fergoman123.fergotools.util.base.BlockGlassFT;
import io.github.fergoman123.fergotools.util.base.BlockRotatedPillarFT;
import io.github.fergoman123.fergotools.util.base.BlockStairsFT;
import io.github.fergoman123.fergotools.util.base.leaves.BlockLeavesFT;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public class FTBlocks
{

    public static final class BlockFergoGlass extends BlockGlassFT {
        public static final BlockFergoGlass instance = new BlockFergoGlass();

        protected IIcon[] icons = new IIcon[16];
        private  boolean shouldRenderSelectionBox = true;
        private int renderPass = 0;

        public BlockFergoGlass(){super();}
        public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, int side) {Block b = world.getBlock(x, y, z); return b == (Block) this ? false : super.shouldSideBeRendered(world, x, y, z, side);}
        public void registerBlockIcons(IIconRegister register) {for (int i = 0; i < Textures.blockFergoGlassTex.length; i++){icons[i] = register.registerIcon(Reference.textureLoc + Textures.ctmLoc + Textures.blockFergoGlassTex[i]);}}
        public int getRenderBlockPass() {return renderPass;}
        public boolean shouldConnectToBlock(IBlockAccess world, int x, int y, int z, Block block, int side){return block == (Block) this;}
        public IIcon getIcon(IBlockAccess world, int x, int y, int z, int side) {return world.getBlockMetadata(x, y, z) == 15 ? icons[0] : getConnectedBlockTexture(world, x, y, z, side, icons);}

        @SideOnly(Side.CLIENT)
        public IIcon getConnectedBlockTexture(IBlockAccess world, int x, int y, int z, int side, IIcon[] icons) {
            boolean isOpenUp = false, isOpenDown = false, isOpenLeft = false, isOpenRight = false;
            switch (side) {
                case 0:
                    if (shouldConnectToBlock(world, x, y, z, world.getBlock(x - 1, y, z), world.getBlockMetadata(x - 1, y, z))){isOpenDown = true;}
                    if (shouldConnectToBlock(world, x, y, z, world.getBlock(x + 1, y, z), world.getBlockMetadata(x + 1, y, z))){isOpenUp = true;}
                    if (shouldConnectToBlock(world, x, y, z, world.getBlock(x, y, z - 1), world.getBlockMetadata(x, y, z - 1))){isOpenLeft = true;}
                    if (shouldConnectToBlock(world, x, y, z, world.getBlock(x, y, z + 1), world.getBlockMetadata(x, y, z + 1))){isOpenRight = true;}
                    if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight){return icons[15];}
                    else if(isOpenUp && isOpenDown && isOpenLeft){return icons[11];}
                    else if (isOpenUp && isOpenDown && isOpenRight){return icons[12];}
                    else if (isOpenUp && isOpenLeft && isOpenRight){return icons[13];}
                    else if (isOpenDown && isOpenLeft && isOpenRight){return icons[14];}
                    else if (isOpenDown && isOpenUp){return icons[5];}
                    else if (isOpenLeft && isOpenRight){return icons[6];}
                    else if (isOpenDown && isOpenLeft){return icons[8];}
                    else if (isOpenDown && isOpenRight){return icons[10];}
                    else if (isOpenUp && isOpenLeft){return icons[7];}
                    else if (isOpenUp && isOpenRight){return icons[9];}
                    else if (isOpenDown){return icons[3];}
                    else if (isOpenUp){return icons[4];}
                    else if (isOpenLeft){return icons[2];}
                    else if (isOpenRight){return icons[1];}
                    break;
                case 1:
                    if (shouldConnectToBlock(world, x, y, z, world.getBlock(x - 1, y, z), world.getBlockMetadata(x - 1, y, z))){isOpenDown = true;}
                    if (shouldConnectToBlock(world, x, y, z, world.getBlock(x + 1, y, z), world.getBlockMetadata(x + 1, y, z))){isOpenUp = true;}
                    if (shouldConnectToBlock(world, x, y, z, world.getBlock(x, y, z - 1), world.getBlockMetadata(x, y, z - 1))){isOpenLeft = true;}
                    if (shouldConnectToBlock(world, x, y, z, world.getBlock(x, y, z + 1), world.getBlockMetadata(x, y, z + 1))){isOpenRight = true;}
                    if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight){return icons[15];}
                    else if (isOpenUp && isOpenDown && isOpenLeft){return icons[11];}
                    else if (isOpenUp && isOpenDown && isOpenRight){return icons[12];}
                    else if (isOpenUp && isOpenLeft && isOpenRight){return icons[13];}
                    else if (isOpenDown && isOpenLeft && isOpenRight){return icons[14];}
                    else if (isOpenDown && isOpenUp){return icons[5];}
                    else if (isOpenLeft && isOpenRight){return icons[6];}
                    else if (isOpenDown && isOpenLeft){return icons[8];}
                    else if (isOpenDown && isOpenRight){return icons[10];}
                    else if (isOpenUp && isOpenLeft){return icons[7];}
                    else if (isOpenUp && isOpenRight){return icons[9];}
                    else if (isOpenDown){return icons[3];}
                    else if (isOpenUp){return icons[4];}
                    else if (isOpenLeft){return icons[2];}
                    else if (isOpenRight){return icons[1];}
                    break;
                case 2:
                    if (shouldConnectToBlock(world, x, y, z, world.getBlock(x, y - 1, z), world.getBlockMetadata(x, y - 1, z))){isOpenDown = true;}
                    if (shouldConnectToBlock(world, x, y, z, world.getBlock(x, y + 1, z), world.getBlockMetadata(x, y + 1, z))){isOpenUp = true;}
                    if (shouldConnectToBlock(world, x, y, z, world.getBlock(x - 1, y, z), world.getBlockMetadata(x - 1, y, z))){isOpenLeft = true;}
                    if (shouldConnectToBlock(world, x, y, z, world.getBlock(x + 1, y, z), world.getBlockMetadata(x + 1, y, z))){isOpenRight = true;}
                    if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight){return icons[15];}
                    else if (isOpenUp && isOpenDown && isOpenLeft){return icons[13];}
                    else if (isOpenUp && isOpenDown && isOpenRight){return icons[14];}
                    else if (isOpenUp && isOpenLeft && isOpenRight){return icons[11];}
                    else if (isOpenDown && isOpenLeft && isOpenRight){return icons[12];}
                    else if (isOpenDown && isOpenUp){return icons[6];}
                    else if (isOpenLeft && isOpenRight){return icons[5];}
                    else if (isOpenDown && isOpenLeft){return icons[9];}
                    else if (isOpenDown && isOpenRight){return icons[10];}
                    else if (isOpenUp && isOpenLeft){return icons[7];}
                    else if (isOpenUp && isOpenRight){return icons[8];}
                    else if (isOpenDown){return icons[1];}
                    else if (isOpenUp){return icons[2];}
                    else if (isOpenLeft){return icons[4];}
                    else if (isOpenRight){return icons[3];}
                    break;
                case 3:
                    if (shouldConnectToBlock(world, x, y, z, world.getBlock(x, y - 1, z), world.getBlockMetadata(x, y - 1, z))){isOpenDown = true;}
                    if (shouldConnectToBlock(world, x, y, z, world.getBlock(x, y + 1, z), world.getBlockMetadata(x, y + 1, z))){isOpenUp = true;}
                    if (shouldConnectToBlock(world, x, y, z, world.getBlock(x - 1, y, z), world.getBlockMetadata(x - 1, y, z))){isOpenLeft = true;}
                    if (shouldConnectToBlock(world, x, y, z, world.getBlock(x + 1, y, z), world.getBlockMetadata(x + 1, y, z))) {isOpenRight = true;}
                    if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight){return icons[15];}
                    else if (isOpenUp && isOpenDown && isOpenLeft){return icons[14];}
                    else if (isOpenUp && isOpenDown && isOpenRight){return icons[13];}
                    else if (isOpenUp && isOpenLeft && isOpenRight){return icons[11];}
                    else if (isOpenDown && isOpenLeft && isOpenRight){return icons[12];}
                    else if (isOpenDown && isOpenUp){return icons[6];}
                    else if (isOpenLeft && isOpenRight){return icons[5];}
                    else if (isOpenDown && isOpenLeft){return icons[10];}
                    else if (isOpenDown && isOpenRight){return icons[9];}
                    else if (isOpenUp && isOpenLeft){return icons[8];}
                    else if (isOpenUp && isOpenRight){return icons[7];}
                    else if (isOpenDown){return icons[1];}
                    else if (isOpenUp){return icons[2];}
                    else if (isOpenLeft){return icons[3];}
                    else if (isOpenRight){return icons[4];}
                    break;
                case 4:
                    if (shouldConnectToBlock(world, x, y, z, world.getBlock(x, y - 1, z), world.getBlockMetadata(x, y - 1, z))){isOpenDown = true;}
                    if (shouldConnectToBlock(world, x, y, z, world.getBlock(x, y + 1, z), world.getBlockMetadata(x, y + 1, z))){isOpenUp = true;}
                    if (shouldConnectToBlock(world, x, y, z, world.getBlock(x, y, z - 1), world.getBlockMetadata(x, y, z - 1))){isOpenLeft = true;}
                    if (shouldConnectToBlock(world, x, y, z, world.getBlock(x, y, z + 1), world.getBlockMetadata(x, y, z + 1))){isOpenRight = true;}
                    if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight){return icons[15];}
                    else if (isOpenUp && isOpenDown && isOpenLeft){return icons[14];}
                    else if (isOpenUp && isOpenDown && isOpenRight){return icons[13];}
                    else if (isOpenUp && isOpenLeft && isOpenRight){return icons[11];}
                    else if (isOpenDown && isOpenLeft && isOpenRight){return icons[12];}
                    else if (isOpenDown && isOpenUp){return icons[6];}
                    else if (isOpenLeft && isOpenRight){return icons[5];}
                    else if (isOpenDown && isOpenLeft){return icons[10];}
                    else if (isOpenDown && isOpenRight){return icons[9];}
                    else if (isOpenUp && isOpenLeft){return icons[8];}
                    else if (isOpenUp && isOpenRight){return icons[7];}
                    else if (isOpenDown){return icons[1];}
                    else if (isOpenUp){return icons[2];}
                    else if (isOpenLeft){return icons[3];}
                    else if (isOpenRight){return icons[4];}
                    break;
                case 5: if(shouldConnectToBlock(world, x, y, z, world.getBlock(x, y - 1, z), world.getBlockMetadata(x, y - 1, z))){ isOpenDown = true;}
                    if (shouldConnectToBlock(world, x, y, z, world.getBlock(x, y + 1, z), world.getBlockMetadata(x, y + 1, z))){isOpenUp = true;}
                    if (shouldConnectToBlock(world, x, y, z, world.getBlock(x, y, z - 1), world.getBlockMetadata(x, y, z - 1))){isOpenLeft = true;}
                    if (shouldConnectToBlock(world, x, y, z, world.getBlock(x, y, z + 1), world.getBlockMetadata(x, y, z + 1))){isOpenRight = true;}
                    if (isOpenUp && isOpenDown && isOpenLeft && isOpenRight){return icons[15];}
                    else if (isOpenUp && isOpenDown && isOpenLeft){return icons[13];}
                    else if (isOpenUp && isOpenDown && isOpenRight){return icons[14];}
                    else if (isOpenUp && isOpenLeft && isOpenRight){return icons[11];}
                    else if (isOpenDown && isOpenLeft && isOpenRight){return icons[12];}
                    else if (isOpenDown && isOpenUp){return icons[6];}
                    else if (isOpenLeft && isOpenRight){return icons[5];}
                    else if (isOpenDown && isOpenLeft){return icons[9];}
                    else if (isOpenDown && isOpenRight){return icons[10];}
                    else if (isOpenUp && isOpenLeft){return icons[7];}
                    else if (isOpenUp && isOpenRight){return icons[8];}
                    else if (isOpenDown){return icons[1];}
                    else if (isOpenUp){return icons[2];}
                    else if (isOpenLeft){return icons[4];}
                    else if (isOpenRight){return icons[3];}break;}return icons[0];}
        public IIcon getIcon(int side, int meta){return icons[0];}
        public AxisAlignedBB getSelectedBoundingBoxFromPool(World world, int x, int y, int z){if(shouldRenderSelectionBox){return super.getSelectedBoundingBoxFromPool(world, x, y, z);}else{return AxisAlignedBB.getBoundingBox(0D, 0D, 0D, 0D, 0D, 0D);}}
        public boolean canPlaceTorchOnTop(World world, int x, int y, int z){return true;}
    }

    public static final class BlockObsidianStorage extends BlockFT
    {

        public BlockObsidianStorage(Material material) {
            super(material);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockEmeraldCrystal extends BlockFT
    {

        public BlockEmeraldCrystal(Material material) {
            super(material);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockLapisCrystal extends BlockFT
    {

        public BlockLapisCrystal(Material material) {
            super(material);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockBronze extends BlockFT
    {

        public BlockBronze(Material material) {
            super(material);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockCoalStorage extends BlockFT
    {

        public BlockCoalStorage(Material material) {
            super(material);
        }

        public Item getItemDropped(int metadata, Random random, int fortune)
        {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockGlowstoneStorage extends BlockFT
    {

        public BlockGlowstoneStorage(Material material) {
            super(material);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockAdamantium extends BlockFT
    {

        public BlockAdamantium(Material material) {
            super(material);
        }

        public Item getItemDropped(int metadata, Random random, int fortune)
        {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockSilkGem extends BlockFT
    {

        public BlockSilkGem(Material material) {
            super(material);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockRedstoneCrystal extends BlockFT
    {
        public BlockRedstoneCrystal(Material material)
        {
            super(material);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockExperience extends BlockFT
    {
        public BlockExperience(Material material)
        {
            super(material);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockExpCollector extends BlockFT {
        public BlockExpCollector(Material material) {
            super(material);
        }

        @Override
        public Item getItemDropped(int metadata, Random rand, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockOreObsidian extends BlockFT
    {
        public BlockOreObsidian(Material material)
        {
            super(material);
        }

        public Item getItemDropped(int metadata, Random random, int fortune)
        {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockOreEmeraldCrystal extends BlockFT
    {
        public BlockOreEmeraldCrystal(Material material)
        {
            super(material);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return null;//FTItems.ItemEmeraldGem.instance;
        }
    }

    public static final class BlockOreLapisCrystal extends BlockFT
    {
        public BlockOreLapisCrystal(Material material)
        {
            super(material);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return null;//FTItems.ItemLapisGem.instance;
        }
    }

    public static final class BlockOreBronze extends BlockFT
    {
        public BlockOreBronze(Material material)
        {
            super(material);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockOreAdamantium extends BlockFT
    {
        public BlockOreAdamantium(Material material)
        {
            super(material);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockOreExperience extends BlockFT
    {
        public BlockOreExperience(Material material)
        {
            super(material);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return null;//FTItems.ItemExpShard.instance;
        }

        public int quantityDropped(Random rand)
        {
            return 5 + rand.nextInt(3);
        }
    }

    public static final class BlockOreRedCrystal extends BlockFT
    {
        public BlockOreRedCrystal(Material material)
        {
            super(material);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return null;//FTItems.ItemRedstoneGem.instance;
        }
    }

    public static final class BlockLogObsidian extends BlockRotatedPillarFT
    {
        public BlockLogObsidian()
        {
            super();
        }

        @Override
        public IIcon getSideIcon(int meta) {
            return this.sideIcon;
        }

        @Override
        public IIcon getTopIcon(int meta) {
            return this.topIcon;
        }

        @Override
        public void registerBlockIcons(IIconRegister register) {
            this.sideIcon = register.registerIcon(Textures.logObsidian);
            this.topIcon = register.registerIcon(Textures.logObsidianTop);
        }
    }

    public static final class BlockLogEmerald extends BlockRotatedPillarFT
    {
        public BlockLogEmerald()
        {
            super();
        }

        @Override
        public void registerBlockIcons(IIconRegister register) {
            this.sideIcon = register.registerIcon(Textures.logEmerald);
            this.topIcon = register.registerIcon(Textures.logEmeraldTop);
        }

        @Override
        public IIcon getSideIcon(int meta) {
            return this.sideIcon;
        }

        @Override
        public IIcon getTopIcon(int meta) {
            return this.topIcon;
        }
    }

    public static final class BlockLogLapis extends BlockRotatedPillarFT
        {
            public BlockLogLapis()
            {
                super();
            }

            @Override
            public void registerBlockIcons(IIconRegister register) {
                this.sideIcon = register.registerIcon(Textures.logLapis);
                this.topIcon = register.registerIcon(Textures.logLapisTop);
            }

            @Override
            public IIcon getSideIcon(int meta) {
                return this.sideIcon;
            }

            @Override
            public IIcon getTopIcon(int meta) {
                return this.topIcon;
            }
        }

    public static final class BlockLogBronze extends BlockRotatedPillarFT
        {
            public BlockLogBronze()
            {
                super();
            }

            @Override
            public void registerBlockIcons(IIconRegister register) {
                this.sideIcon = register.registerIcon(Textures.logBronze);
                this.topIcon = register.registerIcon(Textures.logBronzeTop);
            }

            @Override
            public IIcon getSideIcon(int meta) {
                return this.sideIcon;
            }

            @Override
            public IIcon getTopIcon(int meta) {
                return this.topIcon;
            }
        }

    public static final class BlockLogCoal extends BlockRotatedPillarFT
        {
            public BlockLogCoal()
            {
                super();
            }

            @Override
            public void registerBlockIcons(IIconRegister register) {
                this.sideIcon = register.registerIcon(Textures.logCoal);
                this.topIcon = register.registerIcon(Textures.logCoalTop);
            }

            @Override
            public IIcon getSideIcon(int meta) {
                return this.sideIcon;
            }

            @Override
            public IIcon getTopIcon(int meta) {
                return this.topIcon;
            }
        }

    public static final class BlockLogGlowstone extends BlockRotatedPillarFT
        {
            public BlockLogGlowstone()
            {
                super();
            }

            @Override
            public void registerBlockIcons(IIconRegister register) {
                this.sideIcon = register.registerIcon(Textures.logGlowstone);
                this.topIcon = register.registerIcon(Textures.logGlowstoneTop);
            }

            @Override
            public IIcon getSideIcon(int meta) {
                return this.sideIcon;
            }

            @Override
            public IIcon getTopIcon(int meta) {
                return this.topIcon;
            }
        }

    public static final class BlockLogAdamantium extends BlockRotatedPillarFT
        {
            public BlockLogAdamantium()
            {
                super();
            }

            @Override
            public void registerBlockIcons(IIconRegister register) {
                this.sideIcon = register.registerIcon(Textures.logAdamantium);
                this.topIcon = register.registerIcon(Textures.logAdamantiumTop);
            }

            @Override
            public IIcon getSideIcon(int meta) {
                return this.sideIcon;
            }

            @Override
            public IIcon getTopIcon(int meta) {
                return this.topIcon;
            }
        }

    public static final class BlockLogSilk extends BlockRotatedPillarFT
        {
            public BlockLogSilk()
            {
                super();
            }

            @Override
            public void registerBlockIcons(IIconRegister register) {
                this.sideIcon = register.registerIcon(Textures.logSilk);
                this.topIcon = register.registerIcon(Textures.logSilkTop);
            }

            @Override
            public IIcon getSideIcon(int meta) {
                return this.sideIcon;
            }

            @Override
            public IIcon getTopIcon(int meta) {
                return this.topIcon;
            }
        }

    public static final class BlockLogRedstone extends BlockRotatedPillarFT
        {
            public BlockLogRedstone()
            {
                super();
            }

            @Override
            public void registerBlockIcons(IIconRegister register) {
                this.sideIcon = register.registerIcon(Textures.logRedstone);
                this.topIcon = register.registerIcon(Textures.logRedstoneTop);
            }

            @Override
            public IIcon getSideIcon(int meta) {
                return this.sideIcon;
            }

            @Override
            public IIcon getTopIcon(int meta) {
                return this.topIcon;
            }
        }

    public static final class BlockPlankObsidian extends BlockFT
    {
        public BlockPlankObsidian(Material material)
        {
        super(material);
        }

        @Override
        public void registerBlockIcons(IIconRegister register)
        {
            this.blockIcon = register.registerIcon(Textures.plankObsidian);
        }

        @Override
        public Item getItemDropped(int metadata, Random rand, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockPlankEmerald extends BlockFT
    {
        public BlockPlankEmerald(Material material)
        {
        super(material);
        }

        @Override
        public void registerBlockIcons(IIconRegister register)
        {
            this.blockIcon = register.registerIcon(Textures.plankEmerald);
        }

        @Override
        public Item getItemDropped(int metadata, Random rand, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }
    
    public static final class BlockPlankLapis extends BlockFT
    {
        public BlockPlankLapis(Material material)
        {
        super(material);
        }
        
        @Override
        public void registerBlockIcons(IIconRegister register)
        {
            this.blockIcon = register.registerIcon(Textures.plankLapis);
        }
    
        @Override
        public Item getItemDropped(int metadata, Random rand, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }
    
    public static final class BlockPlankBronze extends BlockFT
    {
        
        public BlockPlankBronze(Material material)
        {
        super(material);
        }
        
        @Override
        public void registerBlockIcons(IIconRegister register)
        {
            this.blockIcon = register.registerIcon(Textures.plankBronze);
        }
    
        @Override
        public Item getItemDropped(int metadata, Random rand, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }
    
    public static final class BlockPlankCoal extends BlockFT
    {
        public BlockPlankCoal(Material material)
        {
        super(material);
        }
        
        @Override
        public void registerBlockIcons(IIconRegister register)
        {
            this.blockIcon = register.registerIcon(Textures.plankCoal);
        }
    
        @Override
        public Item getItemDropped(int metadata, Random rand, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }
    
    public static final class BlockPlankGlowstone extends BlockFT
    {
        public BlockPlankGlowstone(Material material)
        {
        super(material);
        }
        
        @Override
        public void registerBlockIcons(IIconRegister register)
        {
            this.blockIcon = register.registerIcon(Textures.plankGlowstone);
        }
    
        @Override
        public Item getItemDropped(int metadata, Random rand, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }
    
    public static final class BlockPlankAdamantium extends BlockFT
    {
        
        public BlockPlankAdamantium(Material material)
        {
        super(material);
        }
        
        @Override
        public void registerBlockIcons(IIconRegister register)
        {
            this.blockIcon = register.registerIcon(Textures.plankAdamantium);
        }
    
        @Override
        public Item getItemDropped(int metadata, Random rand, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }
    
    public static final class BlockPlankSilk extends BlockFT
    {
        
        public BlockPlankSilk(Material material)
        {
        super(material);
        }
        
        @Override
        public void registerBlockIcons(IIconRegister register)
        {
            this.blockIcon = register.registerIcon(Textures.plankSilk);
        }
    
        @Override
        public Item getItemDropped(int metadata, Random rand, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }
    
    public static final class BlockPlankRedstone extends BlockFT
    {
        public BlockPlankRedstone(Material material)
        {
        super(material);
        }
        
        @Override
        public void registerBlockIcons(IIconRegister register)
        {
            this.blockIcon = register.registerIcon(Textures.plankRedstone);
        }
    
        @Override
        public Item getItemDropped(int metadata, Random rand, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockStairObsidian extends BlockStairsFT
    {

        public BlockStairObsidian(Block extender) {
            super(extender);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockStairEmerald extends BlockStairsFT
    {

        public BlockStairEmerald(Block extender) {
            super(extender);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockStairLapis extends BlockStairsFT
    {

        public BlockStairLapis(Block extender) {
            super(extender);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockStairBronze extends BlockStairsFT
    {

        public BlockStairBronze(Block extender) {
            super(extender);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return null;
        }
    }
}