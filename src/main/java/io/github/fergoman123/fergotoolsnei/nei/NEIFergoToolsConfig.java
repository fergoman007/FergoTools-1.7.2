package io.github.fergoman123.fergotoolsnei.nei;

import codechicken.nei.api.API;
import codechicken.nei.api.IConfigureNEI;
import io.github.fergoman123.fergotoolsnei.FergoToolsNEI;

/**
 * Created by Fergoman123.
 */
public class NEIFergoToolsConfig implements IConfigureNEI
{

    @Override
    public void loadConfig()
    {
        API.registerRecipeHandler(new MaceratorRecipeHandler());
        API.registerUsageHandler(new MaceratorRecipeHandler());
    }

    @Override
    public String getName() {
        return FergoToolsNEI.FergoToolsNEIInfo.name;
    }

    @Override
    public String getVersion() {
        return FergoToolsNEI.FergoToolsNEIInfo.version;
    }
}
