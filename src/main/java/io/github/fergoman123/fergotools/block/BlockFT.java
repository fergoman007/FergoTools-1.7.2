package io.github.fergoman123.fergotools.block;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public abstract class BlockFT extends Block{

    public BlockFT(Material materialIn, String name) {
        super(materialIn);
        this.setUnlocalizedName(name);
    }

    public String getUnlocalizedName(){
        return NameHelper.getName(super.getUnlocalizedName());
    }

    public abstract Item getItemDropped(IBlockState state, Random rand, int fortune);
    public abstract int quantityDropped(Random rand);
}
