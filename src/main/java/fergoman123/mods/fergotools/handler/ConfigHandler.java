package fergoman123.mods.fergotools.handler;

import fergoman123.mods.fergotools.config.DimConfiguration;

import java.io.File;

public class ConfigHandler {

    public static void init(String configPath)
    {
        DimConfiguration.init(new File(configPath + "FergoTools.cfg"));
    }
}
