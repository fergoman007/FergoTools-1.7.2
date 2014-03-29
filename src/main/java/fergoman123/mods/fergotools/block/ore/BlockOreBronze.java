package fergoman123.mods.fergotools.block.ore;

import fergoman123.mods.fergotools.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Fergoman123 on 15/03/14.
 */
public class BlockOreBronze extends Block{

    public BlockOreBronze()
    {
        super(Material.rock);
    }

    public Item getItemDropped(int par1, Random rand, int par3)
    {
        return Item.getItemFromBlock(ModBlocks.oreBronze);
    }
}
