package fergoman123.mods.fergotools.block.storage;

import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.util.base.BlockFT;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Fergoman123 on 14/04/2014.
 */
public class BlockAdamantium extends BlockFT{

    public static BlockAdamantium instance = new BlockAdamantium();

    public BlockAdamantium()
    {
        super(Material.iron);
        this.setBlockName(Strings.BlockStrings.blockAdamantium);
        this.setHardness(2.5f);
        this.setResistance(50f);
    }

    public Item getItemDropped(int par1, Random rand, int par3)
    {
        return Item.getItemFromBlock(this);
    }
}
