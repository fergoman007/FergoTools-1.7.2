package io.github.fergoman123.fergotools.util.base;

import fergoman123.mods.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergotools.creativetab.Tabs;
import io.github.fergoman123.fergotools.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public abstract class BlockWoodFT extends Block
{

    public BlockWoodFT()
    {
        super(Material.wood);
        this.setCreativeTab(Tabs.tabFergoWood);
    }

    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public void registerBlockIcons(IIconRegister register)
    {
        blockIcon = register.registerIcon(String.format("%s%s%s", Reference.textureLoc,  "wood/", NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName())));
    }

    public IIcon getIcon(int side, int meta)
    {
        return this.blockIcon;
    }



}
