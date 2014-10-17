package io.github.fergoman123.fergotools.util.base.leaves;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.world.IBlockAccess;

public class BlockLeavesBaseFT extends Block
{
    public boolean opaque;

    public BlockLeavesBaseFT(Material material, boolean opaque)
    {
        super(material);
        this.opaque = opaque;
    }

    public boolean isOpaqueCube()
    {
        return false;
    }

    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess world, int x, int y, int z, int meta)
    {
        Block block = world.getBlock(x, y, z);
        return !this.opaque && block == this ? false : super.shouldSideBeRendered(world, x, y, z, meta);
    }
}
