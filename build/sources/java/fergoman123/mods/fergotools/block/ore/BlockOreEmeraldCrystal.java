package fergoman123.mods.fergotools.block.ore;

import fergoman123.mods.fergotools.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
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
    }

    public Item getItemDropped(int par1, Random rand, int par3)
    {
        return ModItems.fergoMaterials;
    }
    public int damageDropped(int dmg){return 1;}

    @Override
    public int quantityDropped(int meta, int fortune, Random random) {

        if (EnchantmentHelper.getEnchantmentLevel(Enchantment.fortune.effectId, stack) == 1)
        {
            return 3;
        }
        else if (EnchantmentHelper.getEnchantmentLevel(Enchantment.fortune.effectId, stack) == 2)
        {
            return 5;
        }
        else if (EnchantmentHelper.getEnchantmentLevel(Enchantment.fortune.effectId, stack) == 3)
        {
            return 7;
        }
        else
        {
            return 1;
        }
    }
}
