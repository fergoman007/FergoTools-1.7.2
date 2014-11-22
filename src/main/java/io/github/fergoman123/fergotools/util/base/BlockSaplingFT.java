package io.github.fergoman123.fergotools.util.base;

import io.github.fergoman123.fergotools.creativetab.Tabs;
import io.github.fergoman123.fergotools.reference.Reference;
import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.*;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.*;

import java.util.Random;

public abstract class BlockSaplingFT extends BlockSapling implements IGrowable
{
    public String blockName;

    /**
     * this the main constructor
     * @param blockName the block name
     */
    public BlockSaplingFT(String blockName)
    {
        super();
        this.blockName = blockName;
        this.setBlockName(blockName);
        float f = 0.4F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
        this.setCreativeTab(Tabs.tabFergoWood);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Reference.textureLoc, this.blockName);
    }

    public void registerBlockIcons(IIconRegister register){
        blockIcon = register.registerIcon(String.format("%s%s%s", Reference.textureLoc, Textures.saplingLoc, this.blockName));
    }

    public abstract void func_149878_d(World world, int x, int y, int z, Random random);
}
