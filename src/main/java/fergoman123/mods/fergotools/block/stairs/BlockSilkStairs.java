package fergoman123.mods.fergotools.block.stairs;

import fergoman123.mods.fergotools.block.storage.BlockSilkGem;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.base.BlockStairsFT;

public class BlockSilkStairs extends BlockStairsFT
{
    public static final BlockStairsFT instance = new BlockSilkStairs();

    public BlockSilkStairs()
    {
        super(BlockSilkGem.instance);
        this.setBlockName(Names.Blocks.blockSilkStairs);
    }
}
