package fergoman123.mods.fergotools.block.ore;

import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.util.base.BlockFT;
import fergoman123.mods.fergotools.util.UtilBlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Fergoman123 on 14/04/2014.
 */
public class BlockOreAdamantium extends BlockFT{

    public static BlockOreAdamantium instance = new BlockOreAdamantium();

    public BlockOreAdamantium() {
        super(Material.rock);
        this.setBlockName(Strings.BlockStrings.oreAdamantium);
        this.setHardness(2.5f);
        this.setResistance(50f);
    }

    public Item getItemDropped(int par1, Random rand, int par3)
    {
        return UtilBlockItem.oreAdamantium;
    }
}
