package io.github.fergoman123.fergotools.block;

import io.github.fergoman123.fergotools.reference.names.BlockNames;
import io.github.fergoman123.fergotools.util.base.BlockStairsFT;
import net.minecraft.block.Block;

public class FTStairs extends BlockStairsFT
{
    public static final Block stairObsidian = new FTStairs(FTPlanks.instance, 0).setBlockName(BlockNames.stairObsidian);
    public static final Block stairEmerald = new FTStairs(FTPlanks.instance, 1).setBlockName(BlockNames.stairEmerald);
    public static final Block stairLapis = new FTStairs(FTPlanks.instance, 2).setBlockName(BlockNames.stairLapis);
    public static final Block stairBronze = new FTStairs(FTPlanks.instance, 3).setBlockName(BlockNames.stairBronze);
    public static final Block stairCoal = new FTStairs(FTPlanks.instance, 4).setBlockName(BlockNames.stairCoal);
    public static final Block stairGlowstone = new FTStairs(FTPlanks.instance, 5).setBlockName(BlockNames.stairGlowstone);
    public static final Block stairAdamantium = new FTStairs(FTPlanks.instance, 6).setBlockName(BlockNames.stairAdamantium);
    public static final Block stairSilk = new FTStairs(FTPlanks.instance, 7).setBlockName(BlockNames.stairSilk);
    public static final Block stairRedstone = new FTStairs(FTPlanks.instance, 8).setBlockName(BlockNames.stairRedstone);

    public FTStairs(Block extender, int meta)
    {
        super(extender, meta);
    }
}
