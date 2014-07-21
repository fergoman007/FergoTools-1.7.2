package fergoman123.mods.fergotools.block.stairs;

import fergoman123.mods.fergotools.block.storage.BlockEmeraldCrystal;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.base.BlockStairsFT;

public class BlockEmeraldStairs extends BlockStairsFT
{
    public static final BlockStairsFT instance = new BlockObsidianStairs();

    public BlockEmeraldStairs()
    {
        super(BlockEmeraldCrystal.instance);
        this.setBlockName(Names.Blocks.blockEmeraldStairs);
    }
}
