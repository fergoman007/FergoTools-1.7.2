package fergoman123.mods.fergotools.block.ore;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Fergoman123 on 14/04/2014.
 */
public class BlockOreAdamantium extends Block{

    public BlockOreAdamantium()
    {
        super(Material.rock);
    }

    public Item getItemDropped(int par1, Random rand, int par3)
    {
        return Item.getItemFromBlock(this);
    }
}
