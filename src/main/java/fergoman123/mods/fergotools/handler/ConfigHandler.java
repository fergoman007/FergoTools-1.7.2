package fergoman123.mods.fergotools.handler;

import fergoman123.mods.fergotools.helper.LogHelper;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler {

    private static final String CATEGORY_FT = "FergoTools";
    private static Configuration config;

    public static void init(File configFile)
    {
        config = new Configuration(configFile);

        try {
            config.load();

            config.addCustomCategoryComment(CATEGORY_FT, "Fergoman123's Settings");

        }
        catch (Exception e)
        {
            LogHelper.error("FergoTools has had a problem loading its general configuration");
        }
        finally {
            config.save();
        }
    }
}
