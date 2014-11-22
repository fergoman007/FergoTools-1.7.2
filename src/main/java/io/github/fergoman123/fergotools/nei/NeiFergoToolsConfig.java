package io.github.fergoman123.fergotools.nei;

import codechicken.nei.api.API;
import codechicken.nei.api.IConfigureNEI;

/**
 * Created by Fergoman123.
 */
public class NeiFergoToolsConfig implements IConfigureNEI
{
    @Override
    public String getName() {
        return ModInfo.name;
    }

    @Override
    public String getVersion() {
        return ModInfo.versionMain;
    }

    @Override
    public void loadConfig()
    {
        MaceratorRecipeHandler maceratorRecipeHandler = new MaceratorRecipeHandler();

        API.registerRecipeHandler(maceratorRecipeHandler);

        API.registerUsageHandler(maceratorRecipeHandler);
    }
}
