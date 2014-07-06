package fergoman123.mods.fergotools.block.storage;

import fergoman123.mods.fergotools.lib.strings.BlockStrings;
import fergoman123.mods.fergotools.util.base.BlockFT;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Fergoman123 on 14/04/2014.
 */
public class BlockRedstoneCrystal extends BlockFT{

    public static BlockRedstoneCrystal instance = new BlockRedstoneCrystal();

    public BlockRedstoneCrystal()
    {
        super(Material.iron);
        this.setBlockName(BlockStrings.blockRedstoneCrystal);
        this.setHardness(2.5f);
        this.setResistance(50f);
    }

    public Item getItemDropped(int par1, Random rand, int par3)
    {
        return Item.getItemFromBlock(this);
    }
}
