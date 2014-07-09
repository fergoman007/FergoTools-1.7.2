package fergoman123.mods.fergotools.block.ore;

import fergoman123.mods.fergotools.item.materials.ItemLapisCrystal;
import fergoman123.mods.fergotools.reference.strings.BlockStrings;
import fergoman123.mods.fergotools.util.base.BlockFT;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Fergoman123 on 14/04/2014.
 */
public class BlockOreLapisCrystal extends BlockFT{

    public static BlockOreLapisCrystal instance = new BlockOreLapisCrystal();

    public BlockOreLapisCrystal()
    {
        super();
        this.setBlockName(BlockStrings.oreLapisCrystal);
        this.setHardness(2.5f);
        this.setResistance(50f);
    }

    public Item getItemDropped(int par1, Random rand, int par3)
    {
        return ItemLapisCrystal.instance;
    }

    public int damageDropped(int par1)
    {
        return 2;
    }
}
