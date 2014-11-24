/*
  * Fergoman123's Tools
  * Copyright (c) 2014 fergoman123.
  * All rights reserved. This program and the accompanying materials
  * are made available under the terms of the GNU Lesser Public License v2.1
  * which accompanies this distribution, and is available at
  * http://www.gnu.org/licenses/gpl-3.0.html
  */

package io.github.fergoman123.fergotools.helper;

import cpw.mods.fml.common.FMLLog;
import io.github.fergoman123.fergoutil.logging.ILogLevel;
import io.github.fergoman123.fergotools.reference.ModInfo;
import org.apache.logging.log4j.Level;

public class LogHelper implements ILogLevel
{

    public static void log(Level level, Object object)
    {
        FMLLog.log(ModInfo.modid, level, String.valueOf(object));
    }

    public static void all(Object object)
    {
        log(all, object);
    }

    public static void debug(Object object)
    {
        log(debug, object);
    }

    public static void error(Object object)
    {
        log(error, object);
    }

    public static void fatal(Object object)
    {
        log(fatal, object);
    }

    public static void info(Object object)
    {
        log(info, object);
    }

    public static void off(Object object)
    {
        log(off, object);
    }

    public static void trace(Object object)
    {
        log(trace, object);
    }

    public static void warn(Object object)
    {
        log(warn, object);
    }
}
