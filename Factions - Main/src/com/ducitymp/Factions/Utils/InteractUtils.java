package com.ducitymp.Factions.Utils;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import com.ducitymp.Factions.Factions;

public class InteractUtils {
	
	public static void NormalShardsMenuClick(ItemStack item, String name, Player p, String itemname, int cost, ItemStack giveitem){
  		if (item.getItemMeta().getDisplayName()
  				.equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', name)))
  	      {
  	    	 if(Factions.sql.getSHARDS(p) >= cost){
  	    		 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&l(!) You have bought " + itemname + " &a&lfor " + cost + " shards!"));
  	    	     p.getInventory().addItem(giveitem);
  	    	     Factions.sql.setSHARDS(p, Factions.sql.getSHARDS(p) - cost);
  	    	 }else{
  	    		 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&l(!) You don't have enough shards to buy this."));
  	    	 }
  	      }
  	  }
	
	public static void KeyShardsMenuClick(ItemStack item, String name, Player p, String itemname, int cost,  String KEYTYPE, int amount){
  		if (item.getItemMeta().getDisplayName()
  				.equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', name)))
  	      {
  	    	 if(Factions.sql.getSHARDS(p) >= cost){
  	    		 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&a&l(!) You have bought " + itemname + " &a&lfor " + cost + " shards!"));
  	    		 Factions.sql.setKEY(p, Factions.sql.getKEY(p, KEYTYPE) + amount, KEYTYPE);
  	    	     Factions.sql.setSHARDS(p, Factions.sql.getSHARDS(p) - cost);
  	    	 }else{
  	    		 p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&l(!) You don't have enough shards to buy this."));
  	    	 }
  	      }
  	  }

}
