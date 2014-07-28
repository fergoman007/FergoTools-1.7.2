package fergoman123.mods.fergotools.block.ore;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.item.materials.ItemExpShard;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.base.BlockFT;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockOreExperience extends BlockFT{


    public BlockOreExperience()
    {
        super();
        this.setBlockName(Names.Blocks.oreExperience);
        this.setHardness(2.5f);
        this.setResistance(50f);
    }

    public Item getItemDropped(int par1, Random rand, int par3)
    {
        return ModItems.expShard;
    }

    public int quantityDropped(Random rand)
    {
        return 5 + rand.nextInt(3);
    }

    public int damageDropped(int dmg)
    {
        return 7;
    }
}
