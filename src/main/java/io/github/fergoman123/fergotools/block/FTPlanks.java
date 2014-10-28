package io.github.fergoman123.fergotools.block;

import io.github.fergoman123.fergotools.reference.Textures;
import io.github.fergoman123.fergotools.reference.names.BlockNames;
import io.github.fergoman123.fergotools.util.base.BlockWoodFT;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

import java.util.List;

public final class FTPlanks extends BlockWoodFT
{
    public static final FTPlanks instance = new FTPlanks();

    public FTPlanks()
    {
        super();
        this.setBlockName(BlockNames.plankFergo);
    }


    @Override
    public void registerBlockIcons(IIconRegister register) {
        this.icons = new IIcon[BlockNames.planks.length];

        for (int i = 0; i < BlockNames.planks.length; i++)
        {
            this.icons[i] = register.registerIcon(Textures.planks[i]);
        }
    }

    public void getSubBlocks(Item item, CreativeTabs tab, List list)
    {
        for (int i = 0; i < BlockNames.planks.length; i++) {
            list.add(new ItemStack(item, 1, i));
        }
    }
}
