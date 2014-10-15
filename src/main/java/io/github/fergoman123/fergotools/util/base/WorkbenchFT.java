package io.github.fergoman123.fergotools.util.base;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fergoman123.mods.fergoutil.helper.NameHelper;
import io.github.fergoman123.fergotools.creativetab.Tabs;
import io.github.fergoman123.fergotools.reference.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

public abstract class WorkbenchFT extends Block {

    public abstract class BlockWorkbenchFT
    {

    }

    @SideOnly(Side.CLIENT)
    public IIcon topIcon;

    @SideOnly(Side.CLIENT)
    public IIcon frontIcon;

    public WorkbenchFT()
    {
        super(Material.wood);
        this.setCreativeTab(Tabs.tabFergoCT);
    }

    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @SideOnly(Side.CLIENT)
    public abstract IIcon getIcon(int side, int meta);

    public abstract void registerBlockIcons(IIconRegister register);

    public abstract boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ);
}
