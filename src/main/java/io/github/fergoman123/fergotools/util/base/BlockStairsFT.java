package io.github.fergoman123.fergotools.util.base;

import io.github.fergoman123.fergotools.creativetab.Tabs;
import io.github.fergoman123.fergotools.reference.Reference;
import io.github.fergoman123.fergoutil.helper.NameHelper;
import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.item.Item;

import java.util.Random;

public abstract class BlockStairsFT extends BlockStairs
{
    /**
     * the main constuctor
     * @param extender the block that the stairs gets
     *                 it's textures from
     * @param blockName the block's name
     */
    public BlockStairsFT(Block extender, String blockName)
    {
        super(extender, 0);
        this.setBlockName(blockName);
        this.setHardness(2.0f);
        this.setLightOpacity(0);
        this.setCreativeTab(Tabs.tabFergoWood);
    }

    @Override
    public String getUnlocalizedName() {
        return String.format("tile.%s%s", Reference.textureLoc, NameHelper.getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }

    public abstract Item getItemDropped(int metadata, Random random, int fortune);
}
