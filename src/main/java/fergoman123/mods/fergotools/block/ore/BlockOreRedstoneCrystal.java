package fergoman123.mods.fergotools.block.ore;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.item.materials.ItemRedstoneCrystal;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.base.BlockFT;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockOreRedstoneCrystal extends BlockFT{



    public BlockOreRedstoneCrystal()
    {
        super();
        this.setBlockName(Names.Blocks.oreRedstoneCrystal);
        this.setHardness(2.5f);
        this.setResistance(50f);
    }

    public Item getItemDropped(int par1, Random rand, int par3)
    {
        return ModItems.redstoneCrystal;
    }

    public int damageDropped(int dmg)
    {
        return 9;
    }
}
