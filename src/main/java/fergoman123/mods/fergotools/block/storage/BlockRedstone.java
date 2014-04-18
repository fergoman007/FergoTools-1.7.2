package fergoman123.mods.fergotools.block.storage;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Fergoman123 on 14/04/2014.
 */
public class BlockRedstone extends Block{

    public BlockRedstone()
    {
        super(Material.iron);
    }

    public Item getItemDropped(int par1, Random rand, int par3)
    {
        return Item.getItemFromBlock(this);
    }
}
