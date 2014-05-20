package fergoman123.mods.fergotools.block.ore;

import fergoman123.mods.fergotools.init.ModItems;
import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.lib.Textures;
import fergoman123.mods.fergotools.tabs.Tabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Random;

/**
 * Created by Fergoman123 on 14/04/2014.
 */
public class BlockOreEmeraldCrystal extends Block{

    public static ItemStack stack;

    public BlockOreEmeraldCrystal()
    {
        super(Material.rock);
        this.setBlockName(Strings.BlockStrings.oreEmeraldCrystal);
        this.setHardness(2.5f);
        this.setResistance(50f);
        this.setCreativeTab(Tabs.tabFergoBlocks);
        this.setBlockTextureName(Textures.BlockTextures.oreEmeraldCrystal);
    }

    public Item getItemDropped(int par1, Random rand, int par3)
    {
        return ModItems.fergoMaterials;
    }
    public int damageDropped(int dmg){return 1;}

    public int quantityDropped(Random random) {
        return 1;
    }
}
