package io.github.fergoman123.fergotools.init;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.github.fergoman123.fergotools.reference.Reference;
import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergotools.reference.names.BlockNames;
import io.github.fergoman123.fergotools.util.base.BlockFT;
import io.github.fergoman123.fergotools.util.base.BlockGlassFT;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public class FergoBlocks
{

    public static final class BlockFergoGlass extends BlockGlassFT {
        public static final BlockFergoGlass instance = new BlockFergoGlass();

        protected IIcon[] icons = new IIcon[16];
        private  boolean shouldRenderSelectionBox = true;
        private int renderPass = 0;

        public BlockFergoGlass(){super();this.setBlockName(BlockNames.blockFergoGlass);}
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
        public static final BlockObsidianStorage instance = new BlockObsidianStorage();

        public BlockObsidianStorage()
        {
            super(Material.iron);
            this.setBlockName(BlockNames.blockObsidian);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockEmeraldCrystal extends BlockFT
    {
        public static final BlockEmeraldCrystal instance = new BlockEmeraldCrystal();

        public BlockEmeraldCrystal()
        {
            super(Material.iron);
            this.setBlockName(BlockNames.blockEmeraldCrystal);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockLapisCrystal extends BlockFT
    {
        public static final BlockLapisCrystal instance = new BlockLapisCrystal();
        public BlockLapisCrystal()
        {
            super(Material.iron);
            this.setBlockName(BlockNames.blockLapisCrystal);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockBronze extends BlockFT
    {
        public static final BlockBronze instance = new BlockBronze();
        public BlockBronze()
        {
            super(Material.iron);
            this.setBlockName(BlockNames.blockBronze);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockCoalStorage extends BlockFT
    {
        public static final BlockCoalStorage instance = new BlockCoalStorage();
        public BlockCoalStorage()
        {
            super(Material.iron);
            this.setBlockName(BlockNames.blockCoal);
        }

        public Item getItemDropped(int metadata, Random random, int fortune)
        {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockGlowstoneStorage extends BlockFT
    {
        public static final BlockGlowstoneStorage instance = new BlockGlowstoneStorage();
        public BlockGlowstoneStorage()
        {
            super(Material.iron);
            this.setBlockName(BlockNames.blockGlowstone);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockAdamantium extends BlockFT
    {
        public static final BlockAdamantium instance = new BlockAdamantium();
        public BlockAdamantium()
        {
            super(Material.iron);
            this.setBlockName(BlockNames.blockAdamantium);
        }

        public Item getItemDropped(int metadata, Random random, int fortune)
        {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockSilkGem extends BlockFT
    {
        public static final BlockSilkGem instance = new BlockSilkGem();
        public BlockSilkGem()
        {
            super(Material.iron);
            this.setBlockName(BlockNames.blockSilkGem);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockRedstoneCrystal extends BlockFT
    {
        public static final BlockRedstoneCrystal instance = new BlockRedstoneCrystal();
        public BlockRedstoneCrystal()
        {
            super(Material.iron);
            this.setBlockName(BlockNames.blockRedstoneCrystal);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockExperience extends BlockFT
    {
        public static final BlockExperience instance = new BlockExperience();
        public BlockExperience()
        {
            super(Material.iron);
            this.setBlockName(BlockNames.blockExperience);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockExpCollector extends BlockFT {
        public static final BlockExpCollector instance = new BlockExpCollector();
        public BlockExpCollector() {
            super();
            this.setBlockName(BlockNames.blockExpCollector);
        }

        @Override
        public Item getItemDropped(int metadata, Random rand, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockOreObsidian extends BlockFT
    {
        public static final BlockOreObsidian instance = new BlockOreObsidian();
        public BlockOreObsidian()
        {
            super(Material.rock);
            this.setBlockName(BlockNames.oreObsidian);
        }

        public Item getItemDropped(int metadata, Random random, int fortune)
        {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockOreEmeraldCrystal extends BlockFT
    {

        public static final BlockOreEmeraldCrystal instance = new BlockOreEmeraldCrystal();
        public BlockOreEmeraldCrystal()
        {
            super(Material.rock);
            this.setBlockName(BlockNames.oreEmeraldCrystal);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return FergoItems.ItemEmeraldGem.instance;
        }
    }

    public static final class BlockOreLapisCrystal extends BlockFT
    {
        public static final BlockOreLapisCrystal instance = new BlockOreLapisCrystal();
        public BlockOreLapisCrystal()
        {
            super(Material.rock);
            this.setBlockName(BlockNames.oreLapisCrystal);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return FergoItems.ItemLapisGem.instance;
        }
    }

    public static final class BlockOreBronze extends BlockFT
    {
        public static final BlockOreBronze instance = new BlockOreBronze();
        public BlockOreBronze()
        {
            super(Material.rock);
            this.setBlockName(BlockNames.oreBronze);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockOreAdamantium extends BlockFT
    {
        public static final BlockOreAdamantium instance = new BlockOreAdamantium();
        public BlockOreAdamantium()
        {
            super(Material.rock);
            this.setBlockName(BlockNames.oreAdamantium);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return Item.getItemFromBlock(this);
        }
    }

    public static final class BlockOreExperience extends BlockFT
    {
        public static final BlockOreExperience instance = new BlockOreExperience();
        public BlockOreExperience()
        {
            super(Material.rock);
            this.setBlockName(BlockNames.oreExperience);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return FergoItems.ItemExpShard.instance;
        }

        public int quantityDropped(Random rand)
        {
            return 5 + rand.nextInt(3);
        }
    }

    public static final class BlockOreRedCrystal extends BlockFT
    {
        public static final BlockOreRedCrystal instance = new BlockOreRedCrystal();
        public BlockOreRedCrystal()
        {
            super(Material.iron);
            this.setBlockName(BlockNames.oreCrystalRed);
        }

        @Override
        public Item getItemDropped(int metadata, Random random, int fortune) {
            return FergoItems.ItemRedstoneGem.instance;
        }
    }
}
