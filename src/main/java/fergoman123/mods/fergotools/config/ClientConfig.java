package fergoman123.mods.fergotools.config;

import fergoman123.mods.fergotools.helper.LogHelper;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ClientConfig {

    private static Configuration config;

    public static void init(File configFile)
    {
        config = new Configuration(configFile);

        try
        {
            config.load();

            config.addCustomCategoryComment(Settings.CATEGORY_FT, Settings.categoryComment);

        }
        catch (Exception e)
        {
            LogHelper.error("Loading of config file failed because " + e.getCause());
        }
        finally
        {
            config.save();
        }
    }
}
