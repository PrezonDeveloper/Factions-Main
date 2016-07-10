package com.ducitymp.Factions.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import com.ducitymp.Factions.Crates.CratesMainMenu;

public class BlockInteract implements Listener{
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e){
		Location loc = new Location(Bukkit.getServer().getWorld("world"), 20, 69, 15);
		if(e.getAction().equals(Action.LEFT_CLICK_BLOCK) && e.getClickedBlock().getLocation().equals(loc) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK) && e.getClickedBlock().getLocation().equals(loc)){
			Player p = (Player) e.getPlayer();
			e.setCancelled(true);
			CratesMainMenu.open(p);
		}
	}

}
