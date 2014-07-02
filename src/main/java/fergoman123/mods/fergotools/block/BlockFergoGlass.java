package fergoman123.mods.fergotools.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fergoman123.mods.fergotools.util.base.BlockGlassFT;
import net.minecraft.block.Block;
import net.minecraft.world.IBlockAccess;

public class BlockFergoGlass extends BlockGlassFT
{
    public static Block instance = new BlockFergoGlass().setBlockName("blockFergoGlass");

    public BlockFergoGlass()
    {
        super();
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, int side) {
        Block block = world.getBlock(x, y, z);
        return block == (Block) this ? false : super.shouldSideBeRendered(world, x, y, z, side);
    }


}
