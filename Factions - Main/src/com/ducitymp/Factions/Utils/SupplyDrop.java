package com.ducitymp.Factions.Utils;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.Chest;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class SupplyDrop {
	
    public static int min = 30;
    public static int chestleft = 10;
    public static int totalechests = 10;
	
	public static void startTimer(){
	if(min != 0){
		min = min - 1;
	}else{
		Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&f&l&m-----------------------------"));
		Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "    &5&lSupplydrop is falling!!    "));
		Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "        &f&lin the &c&lWARZONE&f&l!    "));
	    Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&f&l&m-----------------------------"));
	    Drop();
	    min = 60;
	}
	
	if(min == 20){
		Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&f&l&m-----------------------------"));
		Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "    &5&l20 minutes for SupplyDrop!    "));
		Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "          &f&lin the &c&lWARZONE&f&l!     "));
	    Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&f&l&m-----------------------------"));
	}
	
	if(min == 10){
		Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&f&l&m-----------------------------"));
		Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "    &5&l10 minutes for SupplyDrop!    "));
		Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "         &f&lin the &c&lWARZONE&f&l!    "));
	    Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&f&l&m-----------------------------"));	
	}
	
	if(min == 5){
		Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&f&l&m-----------------------------"));
		Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "    &5&l5 minutes for SupplyDrop!    "));
		Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "         &f&lin the &c&lWARZONE&f&l!    "));
	    Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&f&l&m-----------------------------"));
	}
	
	if(min == 3){
		Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&f&l&m-----------------------------"));
		Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "    &5&l3 minutes for SupplyDrop!    "));
		Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "         &f&lin the &c&lWARZONE&f&l!    "));
	    Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&f&l&m-----------------------------"));
	}
	
    if(min == 2){
    	Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&f&l&m-----------------------------"));
		Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "    &5&l2 minutes for SupplyDrop!    "));
		Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "         &f&lin the &c&lWARZONE&f&l!    "));
	    Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&f&l&m-----------------------------"));
	}

    if(min == 1){
    	Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&f&l&m-----------------------------"));
		Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "    &5&l1 minute for SupplyDrop!    "));
		Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "        &f&lin the &c&lWARZONE&f&l!    "));
	    Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&f&l&m-----------------------------"));
    }
	
}
	
	private static void Drop(){
		Location loc = new Location(Bukkit.getWorld("world"), 274, 88, 439);
        Block block = loc.getBlock();
        loc.getBlock().setType(Material.CHEST);
        Chest chest = (Chest)block.getState();
        Inventory inv = chest.getInventory();
       
        ItemStack item1 = ItemUtils.item(Material.GOLDEN_APPLE, "&6&lGapple", null, 13, 1);
        ItemStack item2 = ItemUtils.item(Material.PAPER, "&a&l$500.000", null, 1, 0);
        ItemStack item3 = ItemUtils.item(Material.DEAD_BUSH, "&c&lBAD ITEM :P", null, 1, 0);
        ItemStack item4 = ItemUtils.kitenchanteditem(Material.DIAMOND_SWORD, "&5&lOverkill Sword", null, 1, Enchantment.DURABILITY, 140, Enchantment.DAMAGE_ALL, 140);
        
        Random sloter = new Random();
        int slot1 = sloter.nextInt(8);
        int slot2 = sloter.nextInt(13);
        int slot3 = sloter.nextInt(18);
        int slot4 = sloter.nextInt(26);
        
        inv.setItem(slot1, item2);
        inv.setItem(slot2, item1);
        inv.setItem(slot3, item3);
        inv.setItem(slot4, item4);
	}
}
