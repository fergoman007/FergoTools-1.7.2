package io.github.fergoman123.fergotools.helper;

import codechicken.nei.api.API;
import codechicken.nei.recipe.ICraftingHandler;
import codechicken.nei.recipe.IUsageHandler;

/**
 * Created by Fergoman123.
 */
public class NeiHelper
{
    public static void registerRecipeHandler(ICraftingHandler handler)
    {
        API.registerRecipeHandler(handler);
    }

    public static void registerUsageHandler(IUsageHandler handler)
    {
        API.registerUsageHandler(handler);
    }
}
