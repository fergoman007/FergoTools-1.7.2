package io.github.fergoman123.fergotools.util.base;

import io.github.fergoman123.fergotools.creativetab.Tabs;
import io.github.fergoman123.fergotools.reference.Reference;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public abstract class BlockWoodFT extends Block
{

    public IIcon[] icons;

    public BlockWoodFT()
    {
        super(Material.wood);
        this.setHardness(2.5f);
        this.setCreativeTab(Tabs.tabFergoWood);
    }

    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public abstract void registerBlockIcons(IIconRegister register);

    public IIcon getIcon(int side, int meta)
    {
        return this.icons[meta];
    }



}
