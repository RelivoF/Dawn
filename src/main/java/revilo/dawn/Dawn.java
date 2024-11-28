package revilo.dawn;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.*;
import gregapi.api.Abstract_Mod;
import gregapi.api.Abstract_Proxy;
import gregapi.code.ModData;

/**
 * @author Revilo
 */
@Mod(modid=Dawn.MOD_ID, name=Dawn.MOD_NAME, version=Dawn.VERSION, dependencies="required-after:gregapi_post")
public final class Dawn extends Abstract_Mod {
	public static final String MOD_ID = "dawn";
	public static final String MOD_NAME = "Dawn";
	public static final String VERSION = "0.0.1";
	public static ModData MOD_DATA = new ModData(MOD_ID, MOD_NAME);

	@cpw.mods.fml.common.SidedProxy(modId = MOD_ID, clientSide = "revilo.dawn.ProxyClient", serverSide = "revilo.dawn.ProxyServer")
	public static ProxyServer PROXY;

	@Override public String getModID() {return MOD_ID;}
	@Override public String getModName() {return MOD_NAME;}
	@Override public String getModNameForLog() {return "Dawn";}
	@Override public Abstract_Proxy getProxy() {return PROXY;}

	// DON'T CHANGE (I will find where you live if you do)!
	@Mod.EventHandler public final void onPreLoad           (FMLPreInitializationEvent    aEvent) {onModPreInit(aEvent);}
	@Mod.EventHandler public final void onLoad              (FMLInitializationEvent       aEvent) {onModInit(aEvent);}
	@Mod.EventHandler public final void onPostLoad          (FMLPostInitializationEvent    aEvent) {onModPostInit(aEvent);}
	@Mod.EventHandler public final void onServerStarting    (FMLServerStartingEvent       aEvent) {onModServerStarting(aEvent);}
	@Mod.EventHandler public final void onServerStarted     (FMLServerStartedEvent        aEvent) {onModServerStarted(aEvent);}
	@Mod.EventHandler public final void onServerStopping    (FMLServerStoppingEvent       aEvent) {onModServerStopping(aEvent);}
	@Mod.EventHandler public final void onServerStopped     (FMLServerStoppedEvent        aEvent) {onModServerStopped(aEvent);}

	@Override
	public void onModPreInit2(FMLPreInitializationEvent aEvent) {}

	@Override
	public void onModInit2(FMLInitializationEvent aEvent) {}

	@Override
	public void onModPostInit2(FMLPostInitializationEvent aEvent) {}

	@Override
	public void onModServerStarting2(FMLServerStartingEvent aEvent) {}

	@Override
	public void onModServerStarted2(FMLServerStartedEvent aEvent) {}

	@Override
	public void onModServerStopping2(FMLServerStoppingEvent aEvent) {}

	@Override
	public void onModServerStopped2(FMLServerStoppedEvent aEvent) {}
}
