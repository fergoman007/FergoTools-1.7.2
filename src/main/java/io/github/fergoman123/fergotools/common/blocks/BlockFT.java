package io.github.fergoman123.fergotools.common.blocks;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockFT extends Block{

    public BlockFT(Material material, float hardness, float resistance, String name){
        super(material);
        this.setCreativeTab(FergoTools.tabFergoTools);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setUnlocalizedName(name);
    }

    public String getUnlocalizedName(){
        return NameHelper.formatBlockName(0, NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }
}
