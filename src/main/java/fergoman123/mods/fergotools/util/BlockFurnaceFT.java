package fergoman123.mods.fergotools.util;


import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import fergoman123.mods.fergotools.tabs.Tabs;
import net.minecraft.block.Block;
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

public abstract class BlockFurnaceFT extends BlockContainer {

    public BlockFurnaceFT(Material material) {
        super(material);
        this.setHardness(2.5f);
        this.setResistance(2000f);
        this.setStepSound(Block.soundTypeStone);
        this.setCreativeTab(Tabs.tabFergoFurnaces);
    }


    public abstract Item getItemDropped(int par1, Random rand, int par3);

    public abstract void setDefaultDirection(World world, int x, int y, int z);

    public abstract IIcon getIcon(int par1, int par2);

    public abstract void registerBlockIcons(IIconRegister register);

    public abstract boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ);

    @SideOnly(Side.CLIENT)
    public abstract void randomDisplayTick(World world, int x, int y, int z, Random rand);

    public abstract TileEntity createNewTileEntity(World world, int var);

    public abstract void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase elb, ItemStack stack);

    public abstract boolean hasComparatorInputOverride();

    public abstract int getComparatorInputOverride(World world, int x, int y, int z, int par5);

    public abstract Item getItem(World world, int x, int y, int z);
}
