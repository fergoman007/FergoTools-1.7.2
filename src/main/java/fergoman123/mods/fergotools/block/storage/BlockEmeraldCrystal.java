package fergoman123.mods.fergotools.block.storage;

import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.lib.Textures;
import fergoman123.mods.fergotools.tabs.Tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by Fergoman123 on 14/04/2014.
 */
public class BlockEmeraldCrystal extends Block{

    public BlockEmeraldCrystal()
    {
        super(Material.iron);
        this.setBlockName(Strings.BlockStrings.blockEmeraldCrystal);
        this.setHardness(2.5f);
        this.setResistance(50f);
        this.setCreativeTab(Tabs.tabFergoBlocks);
        this.setBlockTextureName(Textures.BlockTextures.blockEmeraldCrystal);
    }

    public Item getItemDropped(int par1, Random rand, int par3)
    {
        return Item.getItemFromBlock(this);
    }
}
