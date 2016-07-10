package com.ducitymp.Factions.Crates;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class CratesMainMenu {

	public static void open(Player p){
		Inventory inv = Bukkit.createInventory(null, 9, "&8Select your key".replace("&", "§"));
		
		p.openInventory(inv);
		
		}

	
}
