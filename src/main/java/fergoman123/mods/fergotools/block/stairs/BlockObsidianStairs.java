package fergoman123.mods.fergotools.block.stairs;

import fergoman123.mods.fergotools.block.storage.BlockObsidianStorage;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.base.BlockStairsFT;

public class BlockObsidianStairs extends BlockStairsFT
{

    public static final BlockStairsFT instance = new BlockObsidianStairs();

    public BlockObsidianStairs()
    {
        super(BlockObsidianStorage.instance);
        this.setBlockName(Names.Blocks.blockObsidianStairs);
    }
}
