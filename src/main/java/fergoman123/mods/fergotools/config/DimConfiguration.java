package fergoman123.mods.fergotools.config;

import fergoman123.mods.fergotools.helper.LogHelper;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;

import java.io.File;

public class DimConfiguration {

    private static final String CATEGORY_FT = "FergoTools";
    private static Configuration config;

    // Dimension
    public static String dimIdString = "Dimension ID";
    public static Property dimIdProp;
    public static String dimIdComment = dimIdProp.comment = "The Dimension ID";
    public static int dimId = dimIdProp.getInt();

    // Biome
    public static String biomeIdString = "Biome ID";
    public static Property biomeIdProp;
    public static String biomeIdComment = biomeIdProp.comment = "The Biome ID";
    public static int biomeId = biomeIdProp.getInt();

    // Lakes
    public static String genLakesString = "genLakes";
    public static Property genLakesProp;
    public static String genLakesComment = genLakesProp.comment = "Whether to Generate lakes or not";
    public static boolean generateLakes = genLakesProp.getBoolean(Defaults.genLakesDefault);

    // Ores
    public static Property oreDensityProp;
    public static String oreDensityComment = oreDensityProp.comment = "The Ore Density, 1 = default, 2 = double ore density";
    public static String oreDensityString = "Ore Density";
    public static int oreDensity = oreDensityProp.getInt();

    //Monsters
    public static Property spawnMonstersProp;
    public static String spawnMonstersString = "Spawn Monsters";
    public static String spawnMonstersComment = spawnMonstersProp.comment = "Whether to spawn monsters or note";
    public static boolean spawnMonsters = spawnMonstersProp.getBoolean(Defaults.spawnMonstersDefault);

    // Animals
    public static Property spawnAnimalsProp;
    public static String spawnAnimalsString = "Spawn Animals";
    public static String spawnAnimalsComment = spawnAnimalsProp.comment = "Whether to spawn animals or note";
    public static boolean spawnAnimals = spawnAnimalsProp.getBoolean(Defaults.spawnAnimalsDefault);

    public static void init(File configFile)
    {
        config = new Configuration(configFile);
        try {
            config.load();

            config.addCustomCategoryComment(CATEGORY_FT, "Fergoman123's Settings");

            dimIdProp = config.get(CATEGORY_FT, dimIdString, Defaults.dimIdDefault, dimIdComment);
            biomeIdProp = config.get(CATEGORY_FT, biomeIdString, Defaults.biomeIdDefault, biomeIdComment);
            genLakesProp = config.get(CATEGORY_FT, genLakesString, Defaults.genLakesDefault, genLakesComment);
            oreDensityProp = config.get(CATEGORY_FT, oreDensityString, Defaults.oreDensityDefault, oreDensityComment);
            spawnMonstersProp = config.get(CATEGORY_FT, spawnMonstersString, Defaults.spawnMonstersDefault, spawnMonstersComment);
            spawnAnimalsProp = config.get(CATEGORY_FT, spawnAnimalsString, Defaults.spawnAnimalsDefault, spawnAnimalsComment);

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
