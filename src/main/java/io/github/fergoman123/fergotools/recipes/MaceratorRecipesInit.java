/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.recipes;

import io.github.fergoman123.fergotools.api.content.FTContent;
import io.github.fergoman123.fergotools.crafting.MaceratorRecipes;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class MaceratorRecipesInit
{
    public static void initRecipes()
    {
        MaceratorRecipes.macerating().addSmeltingRecipeForBlock(Blocks.iron_ore, new ItemStack(Items.iron_ingot, 2), 1.4F);
        MaceratorRecipes.macerating().addSmeltingRecipeForBlock(Blocks.gold_ore, new ItemStack(Items.gold_ingot, 2), 2.0F);
        MaceratorRecipes.macerating().addSmeltingRecipeForBlock(Blocks.diamond_ore, new ItemStack(Items.diamond, 2), 2.0F);
        MaceratorRecipes.macerating().addSmeltingRecipeForBlock(Blocks.coal_ore, new ItemStack(Items.coal, 2), 0.2F);
        MaceratorRecipes.macerating().addSmeltingRecipeForBlock(Blocks.redstone_ore, new ItemStack(Items.redstone, 2), 1.4F);
        MaceratorRecipes.macerating().addSmeltingRecipeForBlock(Blocks.lapis_ore, new ItemStack(Items.dye, 2, 4), 0.4F);
        MaceratorRecipes.macerating().addSmeltingRecipeForBlock(Blocks.quartz_ore, new ItemStack(Items.quartz, 2), 0.4F);

        MaceratorRecipes.macerating().addSmeltingRecipeForBlock(FTContent.oreObsidian, new ItemStack(FTContent.ingotObsidian, 2), 2.5f);
        MaceratorRecipes.macerating().addSmeltingRecipeForBlock(FTContent.oreGemEmerald, new ItemStack(FTContent.gemEmerald, 2), 2.5f);
        MaceratorRecipes.macerating().addSmeltingRecipeForBlock(FTContent.oreGemLapis, new ItemStack(FTContent.gemLapis, 2), 2.5f);
        MaceratorRecipes.macerating().addSmeltingRecipeForBlock(FTContent.oreBronze, new ItemStack(FTContent.ingotBronze, 2), 2.5f);
        MaceratorRecipes.macerating().addSmeltingRecipeForBlock(Blocks.coal_block, new ItemStack(FTContent.ingotCoal, 2), 2.5f);
        MaceratorRecipes.macerating().addSmeltingRecipeForBlock(Blocks.glowstone, new ItemStack(FTContent.ingotGlowstone, 2), 2.5f);
        MaceratorRecipes.macerating().addSmeltingRecipeForBlock(FTContent.oreAdamantium, new ItemStack(FTContent.ingotAdamantium, 2), 2.5f);
        MaceratorRecipes.macerating().addSmeltingRecipeForBlock(FTContent.oreExperience, new ItemStack(FTContent.shardExp, 10), 2.5f);
        MaceratorRecipes.macerating().addSmeltingRecipeForBlock(FTContent.oreGemRedstone, new ItemStack(FTContent.gemRedstone, 2), 2.5f);
    }
}
