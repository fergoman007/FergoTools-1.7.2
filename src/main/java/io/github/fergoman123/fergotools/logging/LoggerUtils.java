package io.github.fergoman123.fergotools.logging;

import io.github.fergoman123.fergotools.reference.ModInfo;
import net.minecraftforge.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

public class LoggerUtils {

    private static void log(Level level, String message, Object... params){
        FMLLog.log(ModInfo.modid, level, message, params);
    }

    public static void info(String message, Object... params){
        log(Level.INFO, message, params);
    }

    public static void warn(String message, Object... params){
        log(Level.WARN, message, params);
    }

    public static void error(String message, Object... params){
        log(Level.ERROR, message, params);
    }

    public static void debug(String message, Object... params){
        log(Level.INFO, "[Debug] " + message, params);
    }
}
