 /*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.client;


import io.github.fergoman123.fergotools.config.ConfigHandler;
import io.github.fergoman123.fergotools.reference.ModInfo;
import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.config.GuiConfig;

 /**
  * this class is used to show the configuration
  * gui for Fergoman123's Tools
  */
public class FTGuiConfig extends GuiConfig
{
    public FTGuiConfig(GuiScreen screen)
    {
        super(screen, new ConfigElement(ConfigHandler.config.getCategory(Configuration.CATEGORY_GENERAL)).getChildElements(), ModInfo.modid, false, false, GuiConfig.getAbridgedConfigPath(ConfigHandler.config.toString()));
    }
}
