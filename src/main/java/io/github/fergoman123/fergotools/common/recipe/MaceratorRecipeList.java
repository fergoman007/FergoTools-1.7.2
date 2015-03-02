package io.github.fergoman123.fergotools.common.recipe;

import io.github.fergoman123.fergotools.init.ModBlocks;
import io.github.fergoman123.fergotools.init.ModItems;
import io.github.fergoman123.fergotools.item.crafting.MaceratorRecipes;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;


public class MaceratorRecipeList
{
    public static final RecipeMacerator iron_ore = getRecipe(Blocks.iron_ore, new ItemStack(Items.iron_ingot, 2), 1.4F);
    public static final RecipeMacerator gold_ore = getRecipe(Blocks.gold_ore, new ItemStack(Items.gold_ingot, 2), 2.0F);
    public static final RecipeMacerator diamond_ore = getRecipe(Blocks.diamond_ore, new ItemStack(Items.diamond, 2), 2.0F);
    public static final RecipeMacerator coal_ore = getRecipe(Blocks.coal_ore, new ItemStack(Items.coal, 2), 0.2F);
    public static final RecipeMacerator redstone_ore = getRecipe(Blocks.redstone_ore, new ItemStack(Items.redstone, 2), 1.4F);
    public static final RecipeMacerator lapis_ore = getRecipe(Blocks.lapis_ore, new ItemStack(Items.dye, 2, 4), 0.4F);
    public static final RecipeMacerator quartz_ore = getRecipe(Blocks.quartz_ore, new ItemStack(Items.quartz, 2), 0.4F);

    public static final RecipeMacerator oreObsidian = getRecipe(ModBlocks.oreObsidian, new ItemStack(ModItems.ingotObsidian, 2), 2.5f);
    public static final RecipeMacerator oreGemEmerald = getRecipe(ModBlocks.oreGemEmerald, new ItemStack(ModItems.gemEmerald, 2), 2.5f);
    public static final RecipeMacerator oreGemLapis = getRecipe(ModBlocks.oreGemLapis, new ItemStack(ModItems.gemLapis, 2), 2.5f);
    public static final RecipeMacerator oreBronze = getRecipe(ModBlocks.oreBronze, new ItemStack(ModItems.ingotBronze, 2), 2.5f);
    public static final RecipeMacerator coal_block = getRecipe(Blocks.coal_block, new ItemStack(ModItems.ingotCoal, 2), 2.5f);
    public static final RecipeMacerator glowstone = getRecipe(Blocks.glowstone, new ItemStack(ModItems.ingotGlowstone, 2), 2.5f);
    public static final RecipeMacerator oreAdamantium = getRecipe(ModBlocks.oreAdamantium, new ItemStack(ModItems.ingotAdamantium, 2), 2.5f);
    public static final RecipeMacerator oreExperience = getRecipe(ModBlocks.oreExperience, new ItemStack(ModItems.shardExp, 10), 2.5f);
    public static final RecipeMacerator oreGemRedstone = getRecipe(ModBlocks.oreGemRedstone, new ItemStack(ModItems.gemRedstone, 2), 2.5f);

    private static RecipeMacerator getRecipe(Block block, ItemStack stack, float exp)
    {
        return new RecipeMacerator(block, stack, exp);
    }
}
