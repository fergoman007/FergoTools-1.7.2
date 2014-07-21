package fergoman123.mods.fergotools.block.stairs;

import fergoman123.mods.fergotools.block.storage.BlockRedstoneCrystal;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.base.BlockStairsFT;

public class BlockRedstoneStairs extends BlockStairsFT
{
    public static BlockStairsFT instance = new BlockRedstoneStairs();

    public BlockRedstoneStairs()
    {
        super(BlockRedstoneCrystal.instance);
        this.setBlockName(Names.Blocks.blockRedstoneStairs);
    }
}
