package com.ducitymp.Factions.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.EnderCrystal;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;

public class EntityDamage implements Listener{
	
	@EventHandler
	public void onEntityDamage(EntityDamageByEntityEvent e){
		if(e.getEntity() instanceof EnderCrystal){
			Location loc = new Location(Bukkit.getWorld("world"), 348, 163, 291);
			if(e.getEntity().getLocation().equals(loc)){
				e.setCancelled(true);
			}
		}
	}

}
