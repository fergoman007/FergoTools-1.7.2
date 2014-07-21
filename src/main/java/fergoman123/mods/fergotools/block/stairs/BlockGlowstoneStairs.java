package fergoman123.mods.fergotools.block.stairs;

import fergoman123.mods.fergotools.block.storage.BlockGlowstoneStorage;
import fergoman123.mods.fergotools.reference.Names;
import fergoman123.mods.fergotools.util.base.BlockStairsFT;

public class BlockGlowstoneStairs extends BlockStairsFT
{
    public static final BlockStairsFT instance = new BlockGlowstoneStairs();

    public BlockGlowstoneStairs()
    {
        super(BlockGlowstoneStorage.instance);
        this.setBlockName(Names.Blocks.blockGlowstoneStairs);
    }
}
