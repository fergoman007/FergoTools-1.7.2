package fergoman123.mods.fergotools.block.stairs;

import fergoman123.mods.fergotools.block.storage.BlockAdamantium;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.base.BlockStairsFT;

public class BlockAdamantiumStairs extends BlockStairsFT
{
    public static final BlockStairsFT instance = new BlockAdamantiumStairs();

    public BlockAdamantiumStairs()
    {
        super(BlockAdamantium.instance);
        this.setBlockName(Names.Blocks.blockAdamantiumStairs);
    }
}
