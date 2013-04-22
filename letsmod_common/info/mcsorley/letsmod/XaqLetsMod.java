package info.mcsorley.letsmod;

import java.util.logging.Level;

import info.mcsorley.letsmod.helper.Logging;
import info.mcsorley.letsmod.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION_NUMBER)

public class XaqLetsMod {
    @PreInit
    public void preInit(FMLPreInitializationEvent event) {
        Logging.init();
        Logging.log(Level.INFO, "XaqLetsMod preInit START ********");
        
        
        Logging.log(Level.INFO, "XaqLetsMod preInit END   ********");
    }
    
    
    @Init
    public void load(FMLInitializationEvent event) {
        Logging.log(Level.INFO, "XaqLetsMod Init START ********");
        
        
        Logging.log(Level.INFO, "XaqLetsMod Init END   ********");
    }

    
    @PostInit
    public void modsLoaded(FMLPostInitializationEvent event) {
        Logging.log(Level.INFO, "XaqLetsMod PostInit Start ********");
        
        
        Logging.log(Level.INFO, "XaqLetsMod PostInit END   ********");
    }

}
