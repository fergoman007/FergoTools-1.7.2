package io.github.fergoman123.fergotools.client;

import io.github.fergoman123.fergotools.handler.ConfigHandler;
import io.github.fergoman123.fergotools.logging.LoggerUtils;
import io.github.fergoman123.fergotools.reference.ModInfo;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;

import java.util.ArrayList;
import java.util.List;

public class FTGuiConfig extends GuiConfig {
    static Configuration cfg = ConfigHandler.getConfig();


    public FTGuiConfig(GuiScreen parentScreen) {
        super(parentScreen, generateConfigList(), ModInfo.modid, false, false, GuiConfig.getAbridgedConfigPath(cfg.toString()));
    }

    public static List<IConfigElement> generateConfigList(){
        ArrayList<IConfigElement> elements = new ArrayList<IConfigElement>();
        for(String category : ConfigHandler.cats){
            elements.add(new ConfigElement(cfg.getCategory(category)));
            LoggerUtils.info("Added Config Category " + category);
        }
        return elements;
    }
}
