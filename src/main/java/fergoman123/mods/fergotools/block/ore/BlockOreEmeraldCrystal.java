package fergoman123.mods.fergotools.block.ore;

import fergoman123.mods.fergotools.item.materials.ItemEmeraldCrystal;
import fergoman123.mods.fergotools.lib.Strings;
import fergoman123.mods.fergotools.util.base.BlockFT;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockOreEmeraldCrystal extends BlockFT{

    public static BlockOreEmeraldCrystal instance = new BlockOreEmeraldCrystal();

    public BlockOreEmeraldCrystal()
    {
        super(Material.rock);
        this.setBlockName(Strings.BlockStrings.oreEmeraldCrystal);
        this.setHardness(2.5f);
        this.setResistance(50f);
    }

    public Item getItemDropped(int par1, Random rand, int par3)
    {
        return ItemEmeraldCrystal.instance;
    }

    public int quantityDropped(Random random) {
        return 1;
    }
}
