package fergoman123.mods.fergotools.block;

import fergoman123.mods.fergotools.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Fergoman123 on 03/04/2014.
 */
public class Ores {

    public static class BlockOreObsidian extends Block {

        public BlockOreObsidian()
        {
            super(Material.rock);
        }

        public Item getItemDropped(int par1, Random rand, int par3){return Item.getItemFromBlock(this);}
    }

    public static class BlockOreAdamantium extends Block{

        public BlockOreAdamantium()
        {
            super(Material.rock);
        }

        public Item getItemDropped(int par1, Random rand, int par3)
        {
            return Item.getItemFromBlock(this);
        }
    }

    public static class BlockOreBronze extends Block{

        public BlockOreBronze()
        {
            super(Material.rock);
        }

        public Item getItemDropped(int par1, Random rand, int par3)
        {
            return Item.getItemFromBlock(this);
        }
    }

    public static class BlockOreEmeraldCrystal extends Block{

        public BlockOreEmeraldCrystal()
        {
            super(Material.rock);
        }

        public Item getItemDropped(int par1, Random rand, int par3)
        {
            return ModItems.emeraldCrystal;
        }
    }

    public static class BlockOreExperience extends Block{

        public BlockOreExperience()
        {
            super(Material.rock);
        }

        public Item getItemDropped(int par1, Random rand, int par3)
        {
            return ModItems.expShard;
        }

        public int quantityDropped(Random rand)
        {
            return 5 + rand.nextInt(3);
        }
    }

    public static class BlockOreLapisCrystal extends Block{

        public BlockOreLapisCrystal()
        {
            super(Material.rock);
        }

        public Item getItemDropped(int par1, Random rand, int par3)
        {
            return ModItems.lapisCrystal;
        }
    }
}
