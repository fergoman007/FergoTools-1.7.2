package fergoman123.mods.fergotools.block.ore;

import fergoman123.mods.fergotools.init.ModItems;
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
public class BlockOreExperience extends Block{

    public BlockOreExperience()
    {
        super(Material.rock);
        this.setBlockName(Strings.BlockStrings.oreExperience);
        this.setHardness(2.5f);
        this.setResistance(50f);
        this.setCreativeTab(Tabs.tabFergoBlocks);
        this.setBlockTextureName(Textures.BlockTextures.oreExperience);
    }

    public Item getItemDropped(int par1, Random rand, int par3)
    {
        return ModItems.fergoMaterials;
    }

    public int quantityDropped(Random rand)
    {
        return 5 + rand.nextInt(3);
    }

    public int damageDropped(int dmg)
    {
        return 7;
    }
}
