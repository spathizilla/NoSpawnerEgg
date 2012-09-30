package net.playminecraft.nospawneregg;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.inventory.ItemStack;

public class NSEPlayerListener implements Listener {

		NoSpawnerEgg plugin;
		
		public NSEPlayerListener(NoSpawnerEgg plugin) {
			this.plugin = plugin;
		}

		@EventHandler(priority = EventPriority.MONITOR)
		public void onPlayerInteract(PlayerInteractEvent event) {
			if(!event.isCancelled()) {
				ItemStack is = event.getPlayer().getItemInHand();
				Player player = event.getPlayer();
				if(is.getTypeId() == 383 && event.getClickedBlock() != null && event.getAction() == Action.RIGHT_CLICK_BLOCK) {
					if(player.hasPermission("nospawneregg.bypass")) {
						return;
					} else {
						event.setCancelled(true);
					}
				}
			}
		}
}
