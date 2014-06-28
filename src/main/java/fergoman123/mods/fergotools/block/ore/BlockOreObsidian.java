package fergoman123.mods.fergotools.block.ore;

import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.util.base.BlockFT;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Fergoman123 on 14/04/2014.
 */
public class BlockOreObsidian extends BlockFT {

    public static BlockOreObsidian instance = new BlockOreObsidian();

    public BlockOreObsidian()
    {
        super();
        this.setBlockName(Strings.BlockStrings.oreObsidian);
        this.setHardness(2.5f);
        this.setResistance(50f);
    }

    public Item getItemDropped(int par1, Random rand, int par3){return Item.getItemFromBlock(this);}
}
