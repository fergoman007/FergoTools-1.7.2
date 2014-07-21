package fergoman123.mods.fergotools.block.stairs;

import fergoman123.mods.fergotools.block.storage.BlockLapisCrystal;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.base.BlockStairsFT;

public class BlockLapisStairs extends BlockStairsFT
{
    public static final BlockStairsFT instance = new BlockObsidianStairs();

    public BlockLapisStairs()
    {
        super(BlockLapisCrystal.instance);
        this.setBlockName(Names.Blocks.blockLapisStairs);
    }
}
