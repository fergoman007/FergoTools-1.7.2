package fergoman123.mods.fergotools.block.stairs;

import fergoman123.mods.fergotools.block.storage.BlockBronze;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.base.BlockStairsFT;

public class BlockBronzeStairs extends BlockStairsFT
{
    public static BlockBronzeStairs instance = new BlockBronzeStairs();

    public BlockBronzeStairs()
    {
        super(BlockBronze.instance);
        this.setBlockName(Names.Blocks.blockBronzeStairs);
    }
}
