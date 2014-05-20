package fergoman123.mods.fergotools.block.ore;

import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.lib.Textures;
import fergoman123.mods.fergotools.tabs.Tabs;
import fergoman123.mods.fergotools.util.UtilBlockItem;
import fergoman123.mods.fergoutil.util.IBlockOre;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Fergoman123 on 14/04/2014.
 */
public class BlockOreAdamantium extends Block implements IBlockOre{
    public BlockOreAdamantium() {
        super(Material.rock);
        this.setBlockName(Strings.BlockStrings.oreAdamantium);
        this.setHardness(2.5f);
        this.setResistance(50f);
        this.setCreativeTab(Tabs.tabFergoBlocks);
        this.setBlockTextureName(Textures.BlockTextures.oreAdamantium);
    }

    public Item getItemDropped(int par1, Random rand, int par3)
    {
        return UtilBlockItem.itemOreAdamantium;
    }

    @Override
    public int damageDropped(Random rand) {
        return 0;
    }
}
