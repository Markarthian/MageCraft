package magecraft.configuration;

import java.io.File;
import java.util.logging.Level;

import magecraft.lib.ItemIds;
import magecraft.lib.Strings;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.FMLLog;

public class ConfigurationHandler {

    public static Configuration configuration;

    
    public static void init(File configFile) {
        
        configuration = new Configuration(configFile);

        try {
            configuration.load();
            
            ItemIds.ALCHEMIST_CATALYST_ID = configuration.getItem(Strings.ALCHEMIST_CATALYST_NAME, ItemIds.ALCHEMIST_CATALYST_ID).getInt();
            ItemIds.ALCHEMIST_CHARGE_ID = configuration.getItem(Strings.ALCHEMIST_CHARGE_NAME, ItemIds.ALCHEMIST_CHARGE_ID).getInt();
            ItemIds.ESSENCE_TIER_1_ID = configuration.getItem(Strings.ESSENCE_TIER_1_NAME, ItemIds.ESSENCE_TIER_1_ID).getInt();
            ItemIds.ESSENCE_TIER_2_ID = configuration.getItem(Strings.ESSENCE_TIER_2_NAME, ItemIds.ESSENCE_TIER_2_ID).getInt();
            ItemIds.INGOT_ADAMANT_ID = configuration.getItem(Strings.INGOT_ADAMANT_NAME, ItemIds.INGOT_ADAMANT_ID).getInt();
            ItemIds.INGOT_MITHRIL_ID = configuration.getItem(Strings.INGOT_MITHRIL_NAME, ItemIds.INGOT_MITHRIL_ID).getInt();
            ItemIds.WOOL_CLOTH_ID = configuration.getItem(Strings.WOOL_CLOTH_NAME, ItemIds.WOOL_CLOTH_ID).getInt();
            
            }
        catch (Exception e)
        {
            FMLLog.log(Level.SEVERE, e, "[MageCraft] Error while loading config file", new Object[0]);
            throw new RuntimeException(e);
        }
        finally
        {
            configuration.save();
        }
    }
}
