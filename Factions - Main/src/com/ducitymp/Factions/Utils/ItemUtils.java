package com.ducitymp.Factions.Utils;

import java.util.List;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public class ItemUtils {
	
	public static ItemStack item(Material mat, String name, List<String> lore, int amount, int metadata){
		ItemStack i = new ItemStack(mat, amount, (short) metadata);
		ItemMeta glass14fmeta = i.getItemMeta();
		glass14fmeta.setDisplayName(name.replace("&", "§"));
		glass14fmeta.setLore(lore);
		
		i.setItemMeta(glass14fmeta);
		return i;
	}
	
	public static ItemStack skull(String name, List<String> lore, int amount, int metadata, Player p, Player topbidder){
		ItemStack i = new ItemStack(Material.SKULL_ITEM, amount, (short) metadata);
	if(metadata == 3){
		SkullMeta glass14fmeta = (SkullMeta) i.getItemMeta();
		glass14fmeta.setDisplayName(name.replace("&", "§"));
		glass14fmeta.setLore(lore);
		glass14fmeta.setOwner(p.getName());
		
		i.setItemMeta(glass14fmeta);
	}else{
		ItemMeta glass14fmeta = (ItemMeta) i.getItemMeta();
		
		glass14fmeta.setDisplayName(name.replace("&", "§"));
		glass14fmeta.setLore(lore);
		
		i.setItemMeta(glass14fmeta);
	}
		return i;
	}
	
	public static ItemStack enchanteditem(Material mat, String name, List<String> lore, int amount, Enchantment ench, int enchlevel){
		ItemStack i = new ItemStack(mat, amount);
		ItemMeta glass14fmeta = i.getItemMeta();
		glass14fmeta.setDisplayName(name.replace("&", "§"));
		glass14fmeta.setLore(lore);
		glass14fmeta.addEnchant(ench, enchlevel, true);
		
		i.setItemMeta(glass14fmeta);
		return i;
	}
	
	public static ItemStack kitenchanteditem(Material mat, String name, List<String> lore, int amount, Enchantment ench, int enchlevel, Enchantment ench2, int enchlevel2){
		ItemStack i = new ItemStack(mat, amount);
		ItemMeta glass14fmeta = i.getItemMeta();
		glass14fmeta.setDisplayName(name.replace("&", "§"));
		glass14fmeta.setLore(lore);
		glass14fmeta.addEnchant(ench, enchlevel, true);
		glass14fmeta.addEnchant(ench2, enchlevel2, true);
		
		i.setItemMeta(glass14fmeta);
		return i;
	}

}
