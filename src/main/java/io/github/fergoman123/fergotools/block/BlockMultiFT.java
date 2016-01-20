package io.github.fergoman123.fergotools.block;

import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import java.util.List;
import java.util.Random;

public abstract class BlockMultiFT extends Block {

    private String[] subNames;

    public BlockMultiFT(Material materialIn, String[] subNames, String name) {
        super(materialIn);
        this.setUnlocalizedName(name);
        this.subNames = subNames;
    }

    public String getUnlocalizedName() {
        return NameHelper.getName(super.getUnlocalizedName());
    }

    public String[] getSubNames() {
        return this.subNames;
    }

    public abstract Item getItemDropped(IBlockState state, Random rand, int fortune);

    public abstract int damageDropped(IBlockState state);

    public abstract IBlockState getStateFromMeta(int meta);

    public abstract void getSubBlocks(Item item, CreativeTabs tab, List list);

    public abstract int getMetaFromState(IBlockState state);

    public abstract BlockState createBlockState();
}
