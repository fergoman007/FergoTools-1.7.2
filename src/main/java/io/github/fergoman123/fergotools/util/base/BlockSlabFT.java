package io.github.fergoman123.fergotools.util.base;

import io.github.fergoman123.fergotools.creativetab.Tabs;
import io.github.fergoman123.fergotools.reference.Reference;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockSlabFT extends BlockSlab
{

    public BlockSlabFT(boolean isDoubleSlab)
    {
        super(isDoubleSlab, Material.wood);
        this.setHardness(2.0f);
        this.setResistance(5.0f);
        this.setStepSound(Block.soundTypeWood);
        if (!isDoubleSlab)
        {
            this.setCreativeTab(Tabs.tabFergoWood);
        }

        useNeighborBrightness = true;
    }

    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public void registerIcons(IIconRegister register)
    {
        this.blockIcon = register.registerIcon(String.format("%s", NameHelper.getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }

    @Override
    // TODO:      getFullSlabName()
    public String func_150002_b(int i)
    {
        return super.getUnlocalizedName();
    }
}
