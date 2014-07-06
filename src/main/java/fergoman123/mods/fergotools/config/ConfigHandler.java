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
            config.load();
            adamantiumMaxDamage = config.getInt("adamantiumToolMaxDamage", Configuration.CATEGORY_GENERAL, Defaults.adamantiumArmorMaxDamageDefault, 950, Defaults.adamantiumToolMax, "Adamantium Tool Max Damage (Min = 950, Max = 999999999, Default = 1000)");
            adamantiumDamage = config.getInt("adamantiumDamage", Configuration.CATEGORY_GENERAL, Defaults.adamantiumDamageDefault, 15, 25, "Adamantium Sword damage (Min = 15, Max = 25, Default = 20)");

            adamantiumArmorMaxDamage = config.getInt("adamantiumArmorDamage", Configuration.CATEGORY_GENERAL, Defaults.adamantiumArmorMaxDamageDefault, 950, 20000, "The max damage of adamantium armor (Min = 950, Max = 20000, Default 1000)");

            enchantability = config.getInt("enchantability", Configuration.CATEGORY_GENERAL, Defaults.enchantabilityDefault, 1, 30, "Enchantability Modifier (Min = 1, Max = 30, Default = 30)");
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
