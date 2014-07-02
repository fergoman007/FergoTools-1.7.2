package fergoman123.mods.fergotools.config;

import fergoman123.mods.fergotools.FergoTools;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler
{
    private static Configuration config;

    public static void init(String configPath)
    {
        FergoTools.proxy.addClientConfig(new File(configPath + "client.cfg"));
    }
}
