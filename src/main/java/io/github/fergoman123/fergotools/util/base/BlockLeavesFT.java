package io.github.fergoman123.fergotools.util.base;

import io.github.fergoman123.fergotools.creativetab.Tabs;
import io.github.fergoman123.fergotools.reference.Reference;
import io.github.fergoman123.fergoutil.block.BlockLeavesFergo;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.BlockLeaves;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.IIcon;

public class BlockLeavesFT extends BlockLeaves
{
    public String texture;

    public IIcon opaqueIcon;
    public IIcon fancyIcon;

    public static final boolean isOpaque = !Minecraft.getMinecraft().gameSettings.fancyGraphics;

    public BlockLeavesFT(String texture)
    {
        super();
        this.setCreativeTab(Tabs.tabFergoWood);
        this.texture = texture;
    }

    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public void registerBlockIcons(IIconRegister register) {
        this.opaqueIcon = register.registerIcon(String.format("%sleaves/%s/leaves%sOpaque", Reference.textureLoc, this.texture.toLowerCase(), this.texture));
        this.fancyIcon = register.registerIcon(String.format("%sleaves/%s/leaves%s", Reference.textureLoc, this.texture.toLowerCase(), this.texture));
    }

    @Override
    public IIcon getIcon(int side, int meta) {
        if (isOpaque)
        {
            return this.opaqueIcon;
        }
        else
        {
            return this.fancyIcon;
        }
    }

    @Override
    public String[] func_150125_e() {
        return new String[0];
    }
}
