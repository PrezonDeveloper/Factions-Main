package com.ducitymp.Factions.Shards;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import com.ducitymp.Factions.Utils.InteractUtils;
import com.ducitymp.Factions.Utils.ItemUtils;

public class ShardsInteract implements Listener{
	
	@EventHandler
	  public void onClick(InventoryClickEvent e){
		Player p = (Player) e.getWhoClicked();
	if(e.getInventory().getName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', "&8Crystal Shard Shop"))){
		e.setCancelled(true);
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Right click to add 10 to your power!"));
		InteractUtils.NormalShardsMenuClick(e.getCurrentItem(), "&6Give Power Voucher (10)", p, "an power add", 10, ItemUtils.item(Material.PAPER, "&6Give Power Voucher (10)", lore, 1, 0));
	
	    InteractUtils.KeyShardsMenuClick(e.getCurrentItem(), "&6Gold Key (2)", p, "two gold keys", 20, "Gold", 2);
		 
		List<String> lore2 = new ArrayList<String>();
		lore2.add(ChatColor.translateAlternateColorCodes('&', "&7Right click to get random good and bad stuff!"));
		InteractUtils.NormalShardsMenuClick(e.getCurrentItem(), "&bOverkill Random Chest", p, "Random overkill chests", 60, ItemUtils.item(Material.ENDER_CHEST, "&b&lRandom Overkill Chest", lore2, 3, 0));
		
		List<String> lore3 = new ArrayList<String>();
		lore3.add(ChatColor.translateAlternateColorCodes('&', "&b&lSigned by: &fThe Server"));
		InteractUtils.NormalShardsMenuClick(e.getCurrentItem(), "&a&l$250.000 Check", p, "a check", 10, ItemUtils.item(Material.PAPER, "&a&l$250.000", lore3, 1, 0));
		
		List<String> lore4 = new ArrayList<String>();
		lore4.add(ChatColor.translateAlternateColorCodes('&', "&7Right click to summon an supply drop in the warzone!"));
		InteractUtils.NormalShardsMenuClick(e.getCurrentItem(), "&6Supply Drop Roll", p, "an Supply Drop", 50, ItemUtils.item(Material.PAPER, "&6Supply Drop Roll", lore4, 1, 0));

		InteractUtils.KeyShardsMenuClick(e.getCurrentItem(), "&bUltimate Key", p, "an umtimate key", 100, "Ultimate", 2);
		
		List<String> lore5 = new ArrayList<String>();
		lore5.add(ChatColor.translateAlternateColorCodes('&', "&7Right click to access the Central Faction Computer!"));
		InteractUtils.NormalShardsMenuClick(e.getCurrentItem(), "&6Factions Computer", p, "The Factions Computer", 100, ItemUtils.item(Material.PAINTING, "&6Factions Computer", lore5, 1, 0));
	   
	}
	}
 }
