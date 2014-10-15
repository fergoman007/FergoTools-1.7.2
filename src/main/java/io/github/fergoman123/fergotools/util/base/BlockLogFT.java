package io.github.fergoman123.fergotools.util.base;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergotools.creativetab.Tabs;
import io.github.fergoman123.fergotools.reference.Reference;
import net.minecraft.block.BlockLog;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

import java.util.Random;

public abstract class BlockLogFT extends BlockLog
{
    public IIcon topIcon;
    public IIcon sideIcon;

    public BlockLogFT()
    {
        super();
        this.setCreativeTab(Tabs.tabFergoWood);
    }

    public IIcon getSideIcon(int par1) {
        return this.sideIcon;
    }

    @Override
    protected IIcon getTopIcon(int p_150161_1_) {
        return this.topIcon;
    }

    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public abstract void registerBlockIcons(IIconRegister register);

    public abstract Item getItemDropped(int metadata, Random random, int fortune);


}
