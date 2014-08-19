package fergoman123.mods.fergotools.item.crafting;

import fergoman123.mods.fergotools.init.ModItems;
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

import java.util.HashMap;
import java.util.Map;

public class MaceratorRecipes
{
    private static final MaceratorRecipes smeltingBase = new MaceratorRecipes();

    public static FurnaceRecipes vanillaSmelting;

    private Map smeltingList = new HashMap();
    private Map experienceList = new HashMap();

    public static MaceratorRecipes smelting()
    {
        return smeltingBase;
    }

    public static FurnaceRecipes getVanillaSmelting()
    {
        return vanillaSmelting;
    }


    private MaceratorRecipes()
    {
       addItemSmelting(Items.diamond, new ItemStack(ModItems.ingotObsidian), 2.0f);
    }

    public void addItemSmelting(Item item, ItemStack output, float xp)
    {
        getVanillaSmelting().func_151396_a(item, output, xp);
    }

    public void addBlockSmelting(Block block, ItemStack output, float xp)
    {
        getVanillaSmelting().func_151393_a(block, output, xp);
    }

    public void addItemStackSmelting(ItemStack stack, ItemStack output, float xp)
    {
        getVanillaSmelting().func_151394_a(stack, output, xp);
    }

    public
}
