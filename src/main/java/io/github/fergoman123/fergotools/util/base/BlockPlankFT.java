package io.github.fergoman123.fergotools.util.base;

import io.github.fergoman123.fergotools.creativetab.Tabs;
import io.github.fergoman123.fergotools.reference.Reference;
import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;

import java.util.Random;

public abstract class BlockPlankFT extends Block
{
    /**
     * main constructor
     * @param blockName the block's name
     */
    public BlockPlankFT(String blockName)
    {
        super(Material.wood);
        this.setBlockName(blockName);
        this.setCreativeTab(Tabs.tabFergoWood);

    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    @Override
    public void registerBlockIcons(IIconRegister register) {
        blockIcon = register.registerIcon(String.format("%s%s%s", Reference.textureLoc, Textures.woodLoc, NameHelper.getUnwrappedUnlocalizedNameForRegistry(this.getUnlocalizedName())));
    }

    public abstract Item getItemDropped(int metadata, Random random, int fortune);

    @Override
    public boolean isWood(IBlockAccess world, int x, int y, int z) {
        return true;
    }
}
