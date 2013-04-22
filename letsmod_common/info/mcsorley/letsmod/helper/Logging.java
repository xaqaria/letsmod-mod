package info.mcsorley.letsmod.helper;

import java.util.logging.Level;
import java.util.logging.Logger;

import info.mcsorley.letsmod.lib.Reference;

import cpw.mods.fml.common.FMLLog;

public class Logging {

    private static Logger xaqLogger = Logger.getLogger(Reference.MOD_ID);

    public static void init() {

        xaqLogger.setParent(FMLLog.getLogger());
    }

    public static void log(Level logLevel, String message) {

        xaqLogger.log(logLevel, message);
    }

}