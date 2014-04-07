package fergoman123.mods.fergotools.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Fergoman123 on 03/04/2014.
 */
public class StorageBlocks {

    public static class BlockAdamantium extends Block {
        public BlockAdamantium() {
            super(Material.iron);
        }

        public Item getItemDropped(int par1, Random rand, int par3)
        {
            return Item.getItemFromBlock(this);
        }
    }

    public static class BlockBronze extends Block{
        public BlockBronze() {
            super(Material.iron);
        }

        public Item getItemDropped(int par1, Random rand, int par3)
        {
            return Item.getItemFromBlock(ModBlocks.blockBronze);
        }
    }

    public static class BlockCoalStorage extends Block {
        public BlockCoalStorage() {
            super(Material.iron);
        }

        public Item getItemDropped(int par1, Random rand, int par3)
        {
            return Item.getItemFromBlock(ModBlocks.blockCoal);
        }
    }

    public static class BlockEmeraldCrystal extends Block{
        public BlockEmeraldCrystal() {
            super(Material.iron);
        }

        public Item getItemDropped(int par1, Random rand, int par3)
        {
            return Item.getItemFromBlock(ModBlocks.blockEmeraldCrystal);
        }
    }

    public static class BlockExperience extends Block{
        public BlockExperience() {
            super(Material.iron);
        }

        public Item getItemDropped(int par1, Random rand, int par3)
        {
            return Item.getItemFromBlock(ModBlocks.blockExperience);
        }
    }

    public static class BlockGlowstoneStorage extends Block {
        public BlockGlowstoneStorage() {
            super(Material.iron);
        }

        public Item getItemDropped(int par1, Random rand, int par3)
        {
            return Item.getItemFromBlock(ModBlocks.blockGlowstone);
        }
    }

    public static class BlockLapisCrystal extends Block{

        public BlockLapisCrystal()
        {
            super(Material.iron);
        }

        public Item getItemDropped(int par1, Random rand, int par3)
        {
            return Item.getItemFromBlock(ModBlocks.blockLapisCrystal);
        }
    }

    public static class BlockObsidianStorage extends Block{
        public BlockObsidianStorage() {
            super(Material.iron);
        }

        public Item getItemDropped(int par1, Random rand, int par3)
        {
            return Item.getItemFromBlock(ModBlocks.blockObsidian);
        }
    }

    public static class BlockSilkGem extends Block {

        public BlockSilkGem()
        {
            super(Material.iron);
        }

        public Item getItemDropped(int par1, Random rand, int par3)
        {
            return Item.getItemFromBlock(this);
        }

    }

}
