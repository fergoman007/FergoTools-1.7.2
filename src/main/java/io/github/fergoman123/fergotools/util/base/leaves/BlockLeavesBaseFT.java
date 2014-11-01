package io.github.fergoman123.fergotools.util.base.leaves;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

public abstract class BlockLeavesBaseFT extends Block
{
    public boolean opaque;
    public BlockLeavesBaseFT(Material material, boolean opaque)
    {
        super(Material.leaves);
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, int side)
    {
        Block block = world.getBlock(x, y, z);
        return !this.opaque && block == this ? false : super.shouldSideBeRendered(world, x, y, z, side);
    }
}
