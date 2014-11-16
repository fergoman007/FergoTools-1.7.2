package io.github.fergoman123.fergotools.core.block.plank;

import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergotools.util.base.BlockPlankFT;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Fergoman123.
 */
public final class BlockPlankObsidian extends BlockPlankFT
{

    public BlockPlankObsidian(String blockName) {
        super(blockName);
    }

    @Override
    public void registerBlockIcons(IIconRegister register)
    {
        this.blockIcon = register.registerIcon(Textures.plankObsidian);
    }

    @Override
    public Item getItemDropped(int metadata, Random rand, int fortune) {
        return Item.getItemFromBlock(this);
    }
}
