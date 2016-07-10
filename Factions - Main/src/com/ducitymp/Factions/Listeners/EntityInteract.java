package com.ducitymp.Factions.Listeners;

import org.bukkit.Location;
import org.bukkit.entity.EnderCrystal;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

import com.ducitymp.Factions.Shards.ShardsMenu;

public class EntityInteract implements Listener{
	
	@EventHandler
	public void onInteract(PlayerInteractEntityEvent e){
		Player p = (Player) e.getPlayer();
		Location loc = new Location(p.getWorld(), 348, 163, 291);
		if(e.getRightClicked() instanceof EnderCrystal && e.getRightClicked().getLocation().equals(loc)){
			ShardsMenu.open(p);
		}
	}

}
