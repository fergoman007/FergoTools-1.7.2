/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.init;

import io.github.fergoman123.fergotools.recipes.MaceratorRecipesInit;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;

public class Recipes
{
    public static void init()
    {
        addBlockRecipe(ModBlocks.oreObsidian, new ItemStack(ModItems.ingotObsidian), 1.25f);
        addBlockRecipe(ModBlocks.oreGemEmerald, new ItemStack(ModItems.gemEmerald), 1.25f);
        addBlockRecipe(ModBlocks.oreGemLapis, new ItemStack(ModItems.gemLapis), 1.25f);
        addBlockRecipe(ModBlocks.oreBronze, new ItemStack(ModItems.ingotBronze), 1.25f);
        addBlockRecipe(Blocks.coal_block, new ItemStack(ModItems.ingotCoal), 1.25f);
        addBlockRecipe(Blocks.glowstone, new ItemStack(ModItems.ingotGlowstone), 1.25f);
        addBlockRecipe(ModBlocks.oreAdamantium, new ItemStack(ModItems.ingotAdamantium), 1.25f);
        addBlockRecipe(ModBlocks.oreExperience, new ItemStack(ModItems.shardExp, 5), 1.25f);
        addBlockRecipe(ModBlocks.oreGemRedstone, new ItemStack(ModItems.gemRedstone), 1.25f);


        MaceratorRecipesInit.initRecipes();
    }

    public static void addBlockRecipe(Block input, ItemStack output, float xp)
    {
        FurnaceRecipes.instance().addSmeltingRecipeForBlock(input, output, xp);
    }
}
