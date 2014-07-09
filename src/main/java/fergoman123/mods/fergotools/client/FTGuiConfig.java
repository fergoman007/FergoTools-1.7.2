package fergoman123.mods.fergotools.client;

import cpw.mods.fml.client.config.GuiConfig;
import fergoman123.mods.fergotools.config.ConfigHandler;
import fergoman123.mods.fergotools.reference.ModInfo;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;

public class FTGuiConfig extends GuiConfig
{
    public FTGuiConfig(GuiScreen screen)
    {
        super
                (
                screen,
                new ConfigElement(ConfigHandler.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(),
                ModInfo.modid,
                false,
                false,
                GuiConfig.getAbridgedConfigPath(ConfigHandler.config.toString())
                );
    }
}
