package fergoman123.mods.fergotools.block.stairs;

import fergoman123.mods.fergotools.block.storage.BlockCoalStorage;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.base.BlockStairsFT;

public class BlockCoalStairs extends BlockStairsFT
{
    public static final BlockStairsFT instance = new BlockCoalStairs();

    public BlockCoalStairs()
    {
        super(BlockCoalStorage.instance);
        this.setBlockName(Names.Blocks.blockCoalStairs);
    }
}
