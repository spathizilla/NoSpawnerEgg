package net.playminecraft.nospawneregg;

import java.util.logging.Logger;

import org.bukkit.event.Event;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;

public class NoSpawnerEgg extends JavaPlugin {
	public Logger log = Logger.getLogger("Minecraft");
	public PluginManager pm;
	public NSEPlayerListener pl;
		
	public void onEnable() {	
		pm = this.getServer().getPluginManager();
		pl = new NSEPlayerListener(this);
		pm.registerEvents(pl, this);
		log.info("[NoSpawnerEgg] Enabled");
	}
	
	public void onDisable() {
		log.info("[NoSpawnerEgg] Disabled.");
	}
}
