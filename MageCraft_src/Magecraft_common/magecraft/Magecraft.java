package magecraft;



import java.io.File;

import magecraft.configuration.ConfigurationHandler;
import magecraft.core.helper.LogHelper;
import magecraft.creativetab.CreativeTabMageCraft;
import magecraft.item.ModItems;
import magecraft.item.crafting.CraftingRecipes;
import magecraft.lib.Reference;
import net.minecraft.creativetab.CreativeTabs;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

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
    *        clientSide = Reference.CLIENT_PROXY_CLASS,
    *        serverSide = Reference.COMMON_PROXY_CLASS)
    *public static CommonProxy proxy;
    *
    *Why won't this work?! One of the easiest things! ~Rage~
    */
    
    
    public static CreativeTabs tabsMageCraft = new CreativeTabMageCraft(CreativeTabs.getNextID(), Reference.MOD_ID);
    
    @PreInit
    public void preInit(FMLPreInitializationEvent event){
        
        LogHelper.init();
        
        ModItems.init();
        
        CraftingRecipes.init();
        
        ConfigurationHandler.init(new File(event.getModConfigurationDirectory().getAbsolutePath() + File.separator + Reference.CHANNEL_NAME + File.separator + Reference.MOD_ID + ".cfg"));
        
    }
    
    @Init
    public void Init(FMLInitializationEvent event){
        
    }

}
