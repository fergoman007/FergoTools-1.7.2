package io.github.fergoman123.fergotools.common.blocks;

import io.github.fergoman123.fergotools.FergoTools;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;
import java.util.Random;

public abstract class BlockMultiFT extends Block
{
    public String[] subNames;

    public BlockMultiFT(Material material, float hardness, float resistance, String[] subNames, String name){
        super(material);
        this.setHardness(hardness);
        this.setResistance(resistance);
        this.setCreativeTab(FergoTools.tabFergoTools);
        this.setUnlocalizedName(name);
        this.subNames = subNames;
    }

    public String getUnlocalizedName(){
        return NameHelper.formatBlockName(0, NameHelper.getUnlocalizedName(super.getUnlocalizedName()));
    }

    public abstract int damageDropped(IBlockState state);
    public abstract IBlockState getStateFromMeta(int meta);
    public abstract int getMetaFromState(IBlockState state);
    public abstract BlockState createBlockState();

    @SuppressWarnings("unchecked")
    public void getSubBlocks(Item item, CreativeTabs tab, List list){
        for(int i = 0; i < subNames.length; i++)
            list.add(new ItemStack(item, 1, i));
    }

    public abstract Item getItemDropped(IBlockState state, Random rand, int fortune);
}
