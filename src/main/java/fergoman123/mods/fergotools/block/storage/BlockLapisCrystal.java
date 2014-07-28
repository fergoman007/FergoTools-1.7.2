package fergoman123.mods.fergotools.block.storage;

import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.base.BlockFT;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockLapisCrystal extends BlockFT{


    public BlockLapisCrystal()
    {
        super(Material.iron);
        this.setBlockName(Names.Blocks.blockLapisCrystal);
        this.setHardness(2.5f);
        this.setResistance(50f);
    }

    public Item getItemDropped(int par1, Random rand, int par3)
    {
        return Item.getItemFromBlock(this);
    }
}
