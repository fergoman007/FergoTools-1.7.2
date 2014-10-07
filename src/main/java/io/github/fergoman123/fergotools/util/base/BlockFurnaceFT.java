package io.github.fergoman123.fergotools.util.base;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fergoman123.mods.fergoutil.helper.NameHelper;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;

import java.util.Random;

public abstract class BlockFurnaceFT extends BlockContainer
{
    public final Random rand = new Random();
    public IIcon[] icons = new IIcon[2];

    public boolean isActive;
    public BlockFurnaceFT(Material material, String furnaceType)
    {
        super(material);
        this.setBlockName(furnaceType);
        this.setHardness(3.5f);
        this.setResistance(2000f);
    }

    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s%s", NameHelper.getModString(1), NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()), NameHelper.getFurnaceType(this.isActive));
    }

    public abstract Item getItemDropped(int metadata, Random rand, int fortune);

    public abstract void setDefaultDirection(World world, int x, int y, int z);

    public abstract IIcon getIcon(int side, int metadata);

    public abstract void registerBlockIcons(IIconRegister register);

    public abstract boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ);

    public abstract TileEntity createNewTileEntity(World world, int metadata);

    public abstract void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase elb, ItemStack stack);

    @SideOnly(Side.CLIENT)
    public abstract void randomDisplayTick(World world, int x, int y, int z, Random rand);

    public abstract boolean hasComparatorInputOverride();

    public abstract int getComparatorInputOverride(World world, int x, int y, int z, int metadata);

    public abstract Item getItem(World world, int x, int y, int z);
}
