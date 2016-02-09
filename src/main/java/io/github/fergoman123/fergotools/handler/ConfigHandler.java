package io.github.fergoman123.fergotools.handler;

import io.github.fergoman123.fergotools.reference.ModInfo;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

public class ConfigHandler {

    private static Configuration config;

    public ConfigHandler(File configFile){
        config = new Configuration(configFile);
        MinecraftForge.EVENT_BUS.register(this);
        initConfig();
    }

    @SubscribeEvent
    public void onConfigChange(ConfigChangedEvent.OnConfigChangedEvent evt){
        if (evt.modID.equalsIgnoreCase(ModInfo.modid)){
            initConfig();
        }
    }

    private void initConfig(){
        adamantiumArmorRecipe = config.get(cats[0], "Adamantium Armor Recipes Enabled", true).getBoolean(true);
        adamantiumToolRecipe = config.get(cats[0] , "Adamantium Tool Recipes Enabled", true).getBoolean(true);

        adamantiumArmorEnabled = config.get(cats[1], "Adamantium Armor Enabled", true).getBoolean(true);
        adamantiumToolsEnabled = config.get(cats[1], "Adamantium Tools Enabled", true).getBoolean(true);

        debugEnabled = config.get(cats[2], "Debug Log Messages", false).getBoolean(false);

        config.save();
    }

    public static boolean adamantiumArmorRecipe;
    public static boolean adamantiumToolRecipe;

    public static boolean adamantiumArmorEnabled;
    public static boolean adamantiumToolsEnabled;

    public static boolean debugEnabled;

    public static final String[] cats = {"Crafting", "Items", "Debug"};

    public static Configuration getConfig(){
        return config;
    }
}
