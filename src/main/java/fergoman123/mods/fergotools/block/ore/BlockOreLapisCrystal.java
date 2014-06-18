package fergoman123.mods.fergotools.block.ore;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.tabs.Tabs;
import fergoman123.mods.fergotools.util.BlockFT;
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
        this.setBlockName(Strings.BlockStrings.oreLapisCrystal);
        this.setHardness(2.5f);
        this.setResistance(50f);
        this.setCreativeTab(Tabs.tabFergoBlocks);
    }

    public Item getItemDropped(int par1, Random rand, int par3)
    {
        return ModItems.lapisCrystal;
    }

    public int damageDropped(int par1)
    {
        return 2;
    }
}
