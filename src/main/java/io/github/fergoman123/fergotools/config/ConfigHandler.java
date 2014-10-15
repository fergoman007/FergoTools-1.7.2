 /*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.config;


import io.github.fergoman123.fergoutil.helper.ConfigHelper;
import io.github.fergoman123.fergotools.helper.LogHelper;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler
{
    public static Configuration config;

    public static int enchantability;

    public static void init(File configFile)
    {
            config = new Configuration(configFile);

        try
        {

            enchantability = config.getInt("enchantability", ConfigHelper.getCategoryGeneral(), Defaults.enchantabilityDefault, 1, 30, "Enchantability Modifier (Min = 1, Max = 30, Default = 30)");
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
