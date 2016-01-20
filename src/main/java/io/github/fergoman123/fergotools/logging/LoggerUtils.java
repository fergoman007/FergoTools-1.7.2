package io.github.fergoman123.fergotools.logging;

import net.minecraftforge.fml.common.FMLLog;

public class LoggerUtils {
    public static void info(String message, Object... params){
        FMLLog.info("[FergoTools] " + message, params);
    }

    public static void warn(String message, Object... params){
        FMLLog.info("[FergoTools] " + message, params);
    }

    public static void error(String message, Object... params){
        FMLLog.severe("[FergoTools] " + message, params);
    }
}
