package io.github.fergoman123.fergotools.block;

import io.github.fergoman123.fergotools.FergoTools;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;

public class BlockStairsFT extends BlockStairs{
    private String name;

    public BlockStairsFT(IBlockState modelState, String name) {
        super(modelState);
        this.setCreativeTab(FergoTools.tabFergoTools);
        this.setUnlocalizedName(name);
        this.name = name;
    }

    public String getUnlocalizedName(){
        return String.format("tile.ft.%s", this.name);
    }

    public String getName() {
        return name;
    }
}
