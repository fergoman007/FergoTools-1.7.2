/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.init;

import io.github.fergoman123.fergotools.api.content.FTContent;
import io.github.fergoman123.fergotools.recipes.MaceratorRecipesInit;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import static io.github.fergoman123.fergoutil.helper.RecipeHelper.*;

public class Recipes
{
    public static void init()
    {
        addBlockRecipe(FTContent.oreObsidian, new ItemStack(FTContent.ingotObsidian), 1.25f);
        addBlockRecipe(FTContent.oreGemEmerald, new ItemStack(FTContent.gemEmerald), 1.25f);
        addBlockRecipe(FTContent.oreGemLapis, new ItemStack(FTContent.gemLapis), 1.25f);
        addBlockRecipe(FTContent.oreBronze, new ItemStack(FTContent.ingotBronze), 1.25f);
        addBlockRecipe(Blocks.coal_block, new ItemStack(FTContent.ingotCoal), 1.25f);
        addBlockRecipe(Blocks.glowstone, new ItemStack(FTContent.ingotGlowstone), 1.25f);
        addBlockRecipe(FTContent.oreAdamantium, new ItemStack(FTContent.ingotAdamantium), 1.25f);
        addBlockRecipe(FTContent.oreExperience, new ItemStack(FTContent.shardExp, 5), 1.25f);
        addBlockRecipe(FTContent.oreGemRedstone, new ItemStack(FTContent.gemRedstone), 1.25f);

        addStorageBlockRecipe(new ItemStack(FTContent.blockExperience), new ItemStack(FTContent.shardExp));
        addStorageBlockRecipe(new ItemStack(FTContent.blockExpCollector), new ItemStack(FTContent.expCollector));
        addStorageBlockRecipe(new ItemStack(FTContent.blockObsidian), new ItemStack(FTContent.ingotObsidian));


        MaceratorRecipesInit.initRecipes();
    }

    public static void addBlockRecipe(Block input, ItemStack output, float xp)
    {
        FurnaceRecipes.instance().addSmeltingRecipeForBlock(input, output, xp);
    }
}
