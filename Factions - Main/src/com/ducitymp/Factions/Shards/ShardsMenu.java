package com.ducitymp.Factions.Shards;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import net.md_5.bungee.api.ChatColor;

public class ShardsMenu {
	
private static ItemStack item(Material mat, String name, Player p, int data, List<String> lore, int amount){
		
		ItemStack i = new ItemStack(mat, amount, (short) data);
		ItemMeta glass14fmeta = i.getItemMeta();
		glass14fmeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', name));
		glass14fmeta.setLore(lore);
		
		i.setItemMeta(glass14fmeta);
		
		return i;
	}
	
	public static void open(Player p){
		Inventory inv = Bukkit.createInventory(null, 9, "&8Crystal Shard Shop".replace("&", "§"));
		
		List<String> lore = new ArrayList<String>();
		lore.add(ChatColor.translateAlternateColorCodes('&', "&7Gives you 10 power."));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&9&m------------------------"));
		lore.add(ChatColor.translateAlternateColorCodes('&', "&fClick to buy &e1x &ffor: &b 10"));
		inv.setItem(0, item(Material.PAPER, "&6Give Power Voucher (10)", p, 0, lore, 1));
		
		List<String> lore2 = new ArrayList<String>();
		lore2.add(ChatColor.translateAlternateColorCodes('&', "&7Gives you a gold key."));
		lore2.add(ChatColor.translateAlternateColorCodes('&', "&9&m------------------------"));
		lore2.add(ChatColor.translateAlternateColorCodes('&', "&fClick to buy &e2x &ffor: &b 20"));
		inv.setItem(1, item(Material.GOLDEN_CARROT, "&6Gold Key (2)", p, 0, lore2, 2));
		
		List<String> lore3 = new ArrayList<String>();
		lore3.add(ChatColor.translateAlternateColorCodes('&', "&7Is random stuff that you want?"));
		lore3.add(ChatColor.translateAlternateColorCodes('&', "&9&m------------------------"));
		lore3.add(ChatColor.translateAlternateColorCodes('&', "&fClick to buy &e3x &ffor: &b 60"));
		inv.setItem(2, item(Material.ENDER_CHEST, "&bOverkill Random Chest", p, 0, lore3, 3));
		
		List<String> lore4 = new ArrayList<String>();
		lore4.add(ChatColor.translateAlternateColorCodes('&', "&b&lSigned by: &fThe Server"));
		lore4.add(ChatColor.translateAlternateColorCodes('&', "&9&m------------------------"));
		lore4.add(ChatColor.translateAlternateColorCodes('&', "&fClick to buy &e1x &ffor: &b 10"));
		inv.setItem(3, item(Material.PAPER, "&a&l$250.000 Check", p, 0, lore4, 1));
		
		List<String> lore5 = new ArrayList<String>();
		lore5.add(ChatColor.translateAlternateColorCodes('&', "&7Summons a supply drop in the warzone"));
		lore5.add(ChatColor.translateAlternateColorCodes('&', "&9&m------------------------"));
		lore5.add(ChatColor.translateAlternateColorCodes('&', "&fClick to buy &e1x &ffor: &b 50"));
		inv.setItem(4, item(Material.PAPER, "&6Supply Drop Roll", p, 0, lore5, 1));
		
		List<String> lore6 = new ArrayList<String>();
		lore6.add(ChatColor.translateAlternateColorCodes('&', "&7Use this key to open an ULTIMATE crate"));
		lore6.add(ChatColor.translateAlternateColorCodes('&', "&9&m------------------------"));
		lore6.add(ChatColor.translateAlternateColorCodes('&', "&fClick to buy &e1x &ffor: &b 100"));
		inv.setItem(5, item(Material.EYE_OF_ENDER, "&bUltimate key", p, 0, lore6, 1));
		
		List<String> lore7 = new ArrayList<String>();
		lore7.add(ChatColor.translateAlternateColorCodes('&', "&7Get a special suffix!"));
		lore7.add(ChatColor.translateAlternateColorCodes('&', "&7See all your tags with &a/tags&f!"));
		lore7.add(ChatColor.translateAlternateColorCodes('&', "&9&m------------------------"));
		lore7.add(ChatColor.translateAlternateColorCodes('&', "&fClick to buy &e1x &ffor: &b 70"));
		inv.setItem(6, item(Material.PAPER, "&6Random tag", p, 0, lore7, 1));
		
		List<String> lore8 = new ArrayList<String>();
		lore8.add(ChatColor.translateAlternateColorCodes('&', "&7Right click to access the Central Factions Computer"));
		lore8.add(ChatColor.translateAlternateColorCodes('&', "&9&m------------------------"));
		lore8.add(ChatColor.translateAlternateColorCodes('&', "&fClick to buy &e1x &ffor: &b 100"));
		inv.setItem(7, item(Material.PAINTING, "&6Factions Computer", p, 0, lore8, 1));
		
		List<String> lore9 = new ArrayList<String>();
		lore9.add(ChatColor.translateAlternateColorCodes('&', "&7Get an LEGENDARY enchanting book"));
		lore9.add(ChatColor.translateAlternateColorCodes('&', "&9&m------------------------"));
		lore9.add(ChatColor.translateAlternateColorCodes('&', "&fClick to buy &e1x &ffor: &b 20"));
		inv.setItem(8, item(Material.ENCHANTED_BOOK, "&fRandom &6&lLegendary &fenchanting book", p, 0, lore9, 1));
		
		
		p.openInventory(inv);
		
		}

}
