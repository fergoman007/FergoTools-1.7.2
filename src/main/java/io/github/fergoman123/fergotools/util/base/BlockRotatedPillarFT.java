package io.github.fergoman123.fergotools.util.base;

import io.github.fergoman123.fergotools.creativetab.Tabs;
import io.github.fergoman123.fergotools.reference.Reference;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public abstract class BlockRotatedPillarFT extends BlockRotatedPillar
{
    public IIcon topIcon, sideIcon;
    protected BlockRotatedPillarFT()
    {
        super(Material.wood);
        this.setHardness(2.0f);
        this.setStepSound(Block.soundTypeWood);
        this.setCreativeTab(Tabs.tabFergoWood);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public abstract IIcon getSideIcon(int meta);
    public abstract IIcon getTopIcon(int meta);
    public abstract void registerBlockIcons(IIconRegister register);

    public boolean isWood(World world, int x, int y, int z) {
        return true;
    }
}