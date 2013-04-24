package magecraft;



import java.io.File;

import magecraft.configuration.ConfigurationHandler;
import magecraft.core.helper.LogHelper;
import magecraft.core.proxy.CommonProxy;
import magecraft.creativetab.CreativeTabMageCraft;
import magecraft.item.ModItems;
import magecraft.lib.Reference;
import magecraft.lib.Strings;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(
        modid= Reference.MOD_ID,
        name= Reference.MOD_NAME,
        version= Reference.VERSION_NUMBER,
        dependencies= Reference.DEPENDENCIES)

@NetworkMod(
        clientSideRequired=true,
        serverSideRequired=false)

public class Magecraft {
    
    @Instance(Reference.MOD_ID)
    public static Magecraft instance;
    
    /*@SidedProxy(
     *       clientSide = Reference.CLIENT_PROXY_CLASS,
     *       serverSide = Reference.COMMON_PROXY_CLASS)
    *public static CommonProxy proxy;
  */
    
    
    public static CreativeTabs tabsMageCraft = new CreativeTabMageCraft(CreativeTabs.getNextID(), Reference.MOD_ID);
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event){
        
        
        LogHelper.init();
        
        ModItems.init();
        
        
        ConfigurationHandler.init(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.CHANNEL_NAME + File.separator + Reference.MOD_ID + ".cfg"));
        
    }
    
    @Init
    public void Init(FMLInitializationEvent event){
        
        //CraftingRecipes.init();
        
        //proxy.registerRenderThings();
        
        LanguageRegistry.addName(ModItems.alchemistCatalyst, Strings.ALCHEMIST_CATALYST_NAME);
        LanguageRegistry.addName(ModItems.alchemistCharge, Strings.ALCHEMIST_CHARGE_NAME);
        LanguageRegistry.addName(ModItems.essenceTier1, Strings.ESSENCE_TIER_1_NAME);
        LanguageRegistry.addName(ModItems.essenceTier2, Strings.ESSENCE_TIER_2_NAME);
        LanguageRegistry.addName(ModItems.ingotMithril, Strings.INGOT_MITHRIL_NAME);
        LanguageRegistry.addName(ModItems.ingotAdamant, Strings.INGOT_ADAMANT_NAME);
        LanguageRegistry.addName(ModItems.woolCloth, Strings.WOOL_CLOTH_NAME);
        
       
    }
    
    @PostInit
    public void modsLoaded(FMLPostInitializationEvent event){
        
    }

}
