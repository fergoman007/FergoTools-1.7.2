package fergoman123.mods.fergotools.config;

import fergoman123.mods.fergotools.helper.LogHelper;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler
{
    public static Configuration config;

    public static int adamantiumMaxDamage;
    public static int adamantiumDamage;
    public static int adamantiumArmorMaxDamage;
    public static int enchantability;

    public static void init(File configFile)
    {
            config = new Configuration(configFile);

        try
        {

//            enchantability = config.get("enchantability", ConfigHelper.getCategoryGeneral(), Defaults.enchantabilityDefault, 1, 30, "Enchantability Modifier (Min = 1, Max = 30, Default = 30)");
        }
        catch (Exception e)
        {
            LogHelper.error("Config Failed to load because: " + e.getCause());
        }
        finally
        {
            config.save();
        }
    }




}
