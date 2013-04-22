package magecraft.core.helper;

import java.util.logging.Level;
import java.util.logging.Logger;

import magecraft.lib.Reference;
import cpw.mods.fml.common.FMLLog;

public class LogHelper {

    private static Logger magecraftLogger = Logger.getLogger(Reference.MOD_ID);

    public static void init() {

        magecraftLogger.setParent(FMLLog.getLogger());
    }

    public static void log(Level logLevel, String message) {

        magecraftLogger.log(logLevel, message);
    }

}
