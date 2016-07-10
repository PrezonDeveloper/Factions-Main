package com.ducitymp.Factions.Utils;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;

import com.ducitymp.Factions.Factions;

public class KitUtils {
	
	KitDelay delay = new KitDelay();
	
	public KitUtils(){
		
	}
	
	//86,400
	
	public void giveStarter(Player p){
	if(p.hasPermission("kits.starter")){
        if(p.isOp()){
		p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_HELMET, "&8Starter Helmet", null, 1, Enchantment.DURABILITY, 20, Enchantment.PROTECTION_ENVIRONMENTAL, 20));
		p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_CHESTPLATE, "&8Starter Chestplate", null, 1, Enchantment.DURABILITY, 20, Enchantment.PROTECTION_ENVIRONMENTAL, 20));
		p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_LEGGINGS, "&8Starter Leggings", null, 1, Enchantment.DURABILITY, 20, Enchantment.PROTECTION_ENVIRONMENTAL, 20));
		p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_BOOTS, "&8Starter Boots", null, 1, Enchantment.DURABILITY, 20, Enchantment.PROTECTION_ENVIRONMENTAL, 20));
		
		p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_SWORD, "&8Starter Sword", null, 1, Enchantment.DURABILITY, 20, Enchantment.DAMAGE_ALL, 20));
		p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_AXE, "&8Starter Axe", null, 1, Enchantment.DURABILITY, 20, Enchantment.DIG_SPEED, 20));
		p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_SPADE, "&8Starter Shovel", null, 1, Enchantment.DURABILITY, 20, Enchantment.DIG_SPEED, 20));
		
		p.getInventory().addItem(ItemUtils.item(Material.GOLDEN_APPLE, "&6&lGappel", null, 10, 1));
		p.getInventory().addItem(ItemUtils.item(Material.COOKED_CHICKEN, "&8Chicken", null, 64, 0));
	    }else if(Factions.sql.getKITDELAY(p, "STARTER") == 0){
	    	p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_HELMET, "&8Starter Helmet", null, 1, Enchantment.DURABILITY, 20, Enchantment.PROTECTION_ENVIRONMENTAL, 20));
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_CHESTPLATE, "&8Starter Chestplate", null, 1, Enchantment.DURABILITY, 20, Enchantment.PROTECTION_ENVIRONMENTAL, 20));
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_LEGGINGS, "&8Starter Leggings", null, 1, Enchantment.DURABILITY, 20, Enchantment.PROTECTION_ENVIRONMENTAL, 20));
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_BOOTS, "&8Starter Boots", null, 1, Enchantment.DURABILITY, 20, Enchantment.PROTECTION_ENVIRONMENTAL, 20));
			
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_SWORD, "&8Starter Sword", null, 1, Enchantment.DURABILITY, 20, Enchantment.DAMAGE_ALL, 20));
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_AXE, "&8Starter Axe", null, 1, Enchantment.DURABILITY, 20, Enchantment.DIG_SPEED, 20));
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_SPADE, "&8Starter Shovel", null, 1, Enchantment.DURABILITY, 20, Enchantment.DIG_SPEED, 20));
			
			p.getInventory().addItem(ItemUtils.item(Material.GOLDEN_APPLE, "&6&lGappel", null, 10, 1));
			p.getInventory().addItem(ItemUtils.item(Material.COOKED_CHICKEN, "&8Chicken", null, 64, 0));
	        Factions.sql.setKITDELAY(p, 86400, "STARTER");
	        delay.start(p);
	    }else{
	    	p.sendMessage("§c§lYou can't use this now. Wait time is §4§l" + Factions.sql.getKITDELAY(p, "STARTER") + " §c§lseconds.");
	  }
	    }else{
	    	p.sendMessage("§c§lNo permission.");
	    }
	}
	
	//-----------------------------------------------------------------------------------//
	
	public void giveHero(Player p){
		if(p.hasPermission("kits.hero")){
	        if(p.isOp()){
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_HELMET, "&6&lHero Helmet", null, 1, Enchantment.DURABILITY, 40, Enchantment.PROTECTION_ENVIRONMENTAL, 40));
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_CHESTPLATE, "&6&lHero Chestplate", null, 1, Enchantment.DURABILITY, 40, Enchantment.PROTECTION_ENVIRONMENTAL, 40));
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_LEGGINGS, "&6&lHero Leggings", null, 1, Enchantment.DURABILITY, 40, Enchantment.PROTECTION_ENVIRONMENTAL, 40));
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_BOOTS, "&6&lHero Boots", null, 1, Enchantment.DURABILITY, 40, Enchantment.PROTECTION_ENVIRONMENTAL, 40));
			
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_SWORD, "&6&lHero Sword", null, 1, Enchantment.DURABILITY, 40, Enchantment.DAMAGE_ALL, 40));
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_AXE, "&6&lHero Axe", null, 1, Enchantment.DURABILITY, 40, Enchantment.DIG_SPEED, 40));
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_SPADE, "&6&lHero Shovel", null, 1, Enchantment.DURABILITY, 40, Enchantment.DIG_SPEED, 40));
			
			p.getInventory().addItem(ItemUtils.item(Material.GOLDEN_APPLE, "&6&lGappel", null, 20, 1));
			p.getInventory().addItem(ItemUtils.item(Material.COOKED_CHICKEN, "&8Chicken", null, 64, 0));
		    }else if(Factions.sql.getKITDELAY(p, "HERO") == 0){
		    	p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_HELMET, "&6&lHero Helmet", null, 1, Enchantment.DURABILITY, 40, Enchantment.PROTECTION_ENVIRONMENTAL, 40));
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_CHESTPLATE, "&6&lHero Chestplate", null, 1, Enchantment.DURABILITY, 40, Enchantment.PROTECTION_ENVIRONMENTAL, 40));
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_LEGGINGS, "&6&lHero Leggings", null, 1, Enchantment.DURABILITY, 40, Enchantment.PROTECTION_ENVIRONMENTAL, 40));
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_BOOTS, "&6&lHero Boots", null, 1, Enchantment.DURABILITY, 40, Enchantment.PROTECTION_ENVIRONMENTAL, 40));
				
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_SWORD, "&6&lHero Sword", null, 1, Enchantment.DURABILITY, 40, Enchantment.DAMAGE_ALL, 40));
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_AXE, "&6&lHero Axe", null, 1, Enchantment.DURABILITY, 40, Enchantment.DIG_SPEED, 40));
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_SPADE, "&6&lHero Shovel", null, 1, Enchantment.DURABILITY, 40, Enchantment.DIG_SPEED, 40));
				
				p.getInventory().addItem(ItemUtils.item(Material.GOLDEN_APPLE, "&6&lGappel", null, 20, 1));
				p.getInventory().addItem(ItemUtils.item(Material.COOKED_CHICKEN, "&8Chicken", null, 64, 0));
		        Factions.sql.setKITDELAY(p, 86400, "HERO");
		        delay.start(p);
		    }else{
		    	p.sendMessage("§c§lYou can't use this now. Wait time is §4§l" + Factions.sql.getKITDELAY(p, "HERO") + " §c§lseconds.");
		  }
		    }else{
		    	p.sendMessage("§c§lNo permission.");
		    }
		}
	
	//-----------------------------------------------------------------------------------//
	
	public void giveElite(Player p){
		if(p.hasPermission("kits.elite")){
	        if(p.isOp()){
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_HELMET, "&2&lElite Helmet", null, 1, Enchantment.DURABILITY, 60, Enchantment.PROTECTION_ENVIRONMENTAL, 60));
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_CHESTPLATE, "&2&lElite Chestplate", null, 1, Enchantment.DURABILITY, 60, Enchantment.PROTECTION_ENVIRONMENTAL, 60));
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_LEGGINGS, "&2&lElite Leggings", null, 1, Enchantment.DURABILITY, 60, Enchantment.PROTECTION_ENVIRONMENTAL, 60));
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_BOOTS, "&2&lElite Boots", null, 1, Enchantment.DURABILITY, 60, Enchantment.PROTECTION_ENVIRONMENTAL, 60));
			
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_SWORD, "&2&lElite Sword", null, 1, Enchantment.DURABILITY, 60, Enchantment.DAMAGE_ALL, 60));
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_AXE, "&2&lElite Axe", null, 1, Enchantment.DURABILITY, 60, Enchantment.DIG_SPEED, 60));
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_SPADE, "&2&lElite Shovel", null, 1, Enchantment.DURABILITY, 60, Enchantment.DIG_SPEED, 60));
			
			p.getInventory().addItem(ItemUtils.item(Material.GOLDEN_APPLE, "&6&lGappel", null, 30, 1));
			p.getInventory().addItem(ItemUtils.item(Material.COOKED_CHICKEN, "&8Chicken", null, 64, 0));
		    }else if(Factions.sql.getKITDELAY(p, "ELITE") == 0){
		    	p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_HELMET, "&2&lElite Helmet", null, 1, Enchantment.DURABILITY, 60, Enchantment.PROTECTION_ENVIRONMENTAL, 60));
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_CHESTPLATE, "&2&lElite Chestplate", null, 1, Enchantment.DURABILITY, 60, Enchantment.PROTECTION_ENVIRONMENTAL, 60));
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_LEGGINGS, "&2&lElite Leggings", null, 1, Enchantment.DURABILITY, 60, Enchantment.PROTECTION_ENVIRONMENTAL, 60));
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_BOOTS, "&2&lElite Boots", null, 1, Enchantment.DURABILITY, 60, Enchantment.PROTECTION_ENVIRONMENTAL, 60));
				
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_SWORD, "&2&lElite Sword", null, 1, Enchantment.DURABILITY, 60, Enchantment.DAMAGE_ALL, 60));
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_AXE, "&2&lElite Axe", null, 1, Enchantment.DURABILITY, 60, Enchantment.DIG_SPEED, 60));
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_SPADE, "&2&lElite Shovel", null, 1, Enchantment.DURABILITY, 60, Enchantment.DIG_SPEED, 60));
				
				p.getInventory().addItem(ItemUtils.item(Material.GOLDEN_APPLE, "&6&lGappel", null, 30, 1));
				p.getInventory().addItem(ItemUtils.item(Material.COOKED_CHICKEN, "&8Chicken", null, 64, 0));
		        Factions.sql.setKITDELAY(p, 86400, "ELITE");
		        delay.start(p);
		    }else{
		    	p.sendMessage("§c§lYou can't use this now. Wait time is §4§l" + Factions.sql.getKITDELAY(p, "ELITE") + " §c§lseconds.");
		  }
		    }else{
		    	p.sendMessage("§c§lNo permission.");
		    }
		}
	
	//-----------------------------------------------------------------------------------//
	
	public void giveGod(Player p){
		if(p.hasPermission("kits.god")){
	        if(p.isOp()){
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_HELMET, "&d&lGod Helmet", null, 1, Enchantment.DURABILITY, 80, Enchantment.PROTECTION_ENVIRONMENTAL, 80));
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_CHESTPLATE, "&d&lGod Chestplate", null, 1, Enchantment.DURABILITY, 80, Enchantment.PROTECTION_ENVIRONMENTAL, 80));
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_LEGGINGS, "&d&lGod Leggings", null, 1, Enchantment.DURABILITY, 80, Enchantment.PROTECTION_ENVIRONMENTAL, 80));
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_BOOTS, "&d&lGod Boots", null, 1, Enchantment.DURABILITY, 80, Enchantment.PROTECTION_ENVIRONMENTAL, 80));
			
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_SWORD, "&d&lGod Sword", null, 1, Enchantment.DURABILITY, 80, Enchantment.DAMAGE_ALL, 80));
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_AXE, "&d&lGod Axe", null, 1, Enchantment.DURABILITY, 80, Enchantment.DIG_SPEED, 80));
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_SPADE, "&d&lGod Shovel", null, 1, Enchantment.DURABILITY, 80, Enchantment.DIG_SPEED, 80));
			
			p.getInventory().addItem(ItemUtils.item(Material.GOLDEN_APPLE, "&6&lGappel", null, 40, 1));
			p.getInventory().addItem(ItemUtils.item(Material.COOKED_CHICKEN, "&8Chicken", null, 64, 0));
		    }else if(Factions.sql.getKITDELAY(p, "GOD") == 0){
		    	p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_HELMET, "&d&lGod Helmet", null, 1, Enchantment.DURABILITY, 80, Enchantment.PROTECTION_ENVIRONMENTAL, 80));
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_CHESTPLATE, "&d&lGod Chestplate", null, 1, Enchantment.DURABILITY, 80, Enchantment.PROTECTION_ENVIRONMENTAL, 80));
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_LEGGINGS, "&d&lGod Leggings", null, 1, Enchantment.DURABILITY, 80, Enchantment.PROTECTION_ENVIRONMENTAL, 80));
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_BOOTS, "&d&lGod Boots", null, 1, Enchantment.DURABILITY, 80, Enchantment.PROTECTION_ENVIRONMENTAL, 80));
				
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_SWORD, "&d&lGod Sword", null, 1, Enchantment.DURABILITY, 80, Enchantment.DAMAGE_ALL, 80));
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_AXE, "&d&lGod Axe", null, 1, Enchantment.DURABILITY, 80, Enchantment.DIG_SPEED, 80));
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_SPADE, "&d&lGod Shovel", null, 1, Enchantment.DURABILITY, 80, Enchantment.DIG_SPEED, 80));
				
				p.getInventory().addItem(ItemUtils.item(Material.GOLDEN_APPLE, "&6&lGappel", null, 40, 1));
				p.getInventory().addItem(ItemUtils.item(Material.COOKED_CHICKEN, "&8Chicken", null, 64, 0));
		        Factions.sql.setKITDELAY(p, 86400, "GOD");
		        delay.start(p);
		    }else{
		    	p.sendMessage("§c§lYou can't use this now. Wait time is §4§l" + Factions.sql.getKITDELAY(p, "GOD") + " §c§lseconds.");
		  }
		    }else{
		    	p.sendMessage("§c§lNo permission.");
		    }
		}

	
	//-----------------------------------------------------------------------------------//
	
	public void giveLord(Player p){
		if(p.hasPermission("kits.lord")){
	        if(p.isOp()){
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_HELMET, "&4&lLord Helmet", null, 1, Enchantment.DURABILITY, 100, Enchantment.PROTECTION_ENVIRONMENTAL, 100));
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_CHESTPLATE, "&4&lLord Chestplate", null, 1, Enchantment.DURABILITY, 100, Enchantment.PROTECTION_ENVIRONMENTAL, 100));
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_LEGGINGS, "&4&lLord Leggings", null, 1, Enchantment.DURABILITY, 100, Enchantment.PROTECTION_ENVIRONMENTAL, 100));
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_BOOTS, "&4&lLord Boots", null, 1, Enchantment.DURABILITY, 100, Enchantment.PROTECTION_ENVIRONMENTAL, 100));
			
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_SWORD, "&4&lLord Sword", null, 1, Enchantment.DURABILITY, 100, Enchantment.DAMAGE_ALL, 100));
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_AXE, "&4&lLord Axe", null, 1, Enchantment.DURABILITY, 100, Enchantment.DIG_SPEED, 100));
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_SPADE, "&4&lLord Shovel", null, 1, Enchantment.DURABILITY, 100, Enchantment.DIG_SPEED, 100));
			
			p.getInventory().addItem(ItemUtils.item(Material.GOLDEN_APPLE, "&6&lGappel", null, 50, 1));
			p.getInventory().addItem(ItemUtils.item(Material.COOKED_CHICKEN, "&8Chicken", null, 64, 0));
		    }else if(Factions.sql.getKITDELAY(p, "LORD") == 0){
		    	p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_HELMET, "&4&lLord Helmet", null, 1, Enchantment.DURABILITY, 100, Enchantment.PROTECTION_ENVIRONMENTAL, 100));
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_CHESTPLATE, "&4&lLord Chestplate", null, 1, Enchantment.DURABILITY, 100, Enchantment.PROTECTION_ENVIRONMENTAL, 100));
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_LEGGINGS, "&4&lLord Leggings", null, 1, Enchantment.DURABILITY, 100, Enchantment.PROTECTION_ENVIRONMENTAL, 100));
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_BOOTS, "&4&lLord Boots", null, 1, Enchantment.DURABILITY, 100, Enchantment.PROTECTION_ENVIRONMENTAL, 100));
				
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_SWORD, "&4&lLord Sword", null, 1, Enchantment.DURABILITY, 100, Enchantment.DAMAGE_ALL, 100));
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_AXE, "&4&lLord Axe", null, 1, Enchantment.DURABILITY, 100, Enchantment.DIG_SPEED, 100));
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_SPADE, "&4&lLord Shovel", null, 1, Enchantment.DURABILITY, 100, Enchantment.DIG_SPEED, 100));
				
				p.getInventory().addItem(ItemUtils.item(Material.GOLDEN_APPLE, "&6&lGappel", null, 50, 1));
				p.getInventory().addItem(ItemUtils.item(Material.COOKED_CHICKEN, "&8Chicken", null, 64, 0));
		        Factions.sql.setKITDELAY(p, 86400, "LORD");
		        delay.start(p);
		    }else{
		    	p.sendMessage("§c§lYou can't use this now. Wait time is §4§l" + Factions.sql.getKITDELAY(p, "LORD") + " §c§lseconds.");
		  }
		    }else{
		    	p.sendMessage("§c§lNo permission.");
		    }
		}

	
	//-----------------------------------------------------------------------------------//
	
	public void giveOverLord(Player p){
		if(p.hasPermission("kits.overlord")){
	        if(p.isOp()){
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_HELMET, "&6&lOver&4&lLord Helmet", null, 1, Enchantment.DURABILITY, 120, Enchantment.PROTECTION_ENVIRONMENTAL, 120));
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_CHESTPLATE, "&6&lOver&4&lLord Chestplate", null, 1, Enchantment.DURABILITY, 120, Enchantment.PROTECTION_ENVIRONMENTAL, 120));
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_LEGGINGS, "&6&lOver&4&lLord Leggings", null, 1, Enchantment.DURABILITY, 120, Enchantment.PROTECTION_ENVIRONMENTAL, 120));
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_BOOTS, "&6&lOver&4&lLord Boots", null, 1, Enchantment.DURABILITY, 120, Enchantment.PROTECTION_ENVIRONMENTAL, 120));
			
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_SWORD, "&6&lOver&4&lLord Sword", null, 1, Enchantment.DURABILITY, 120, Enchantment.DAMAGE_ALL, 120));
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_AXE, "&6&lOver&4&lLord Axe", null, 1, Enchantment.DURABILITY, 120, Enchantment.DIG_SPEED, 120));
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_SPADE, "&6&lOver&4&lLord Shovel", null, 1, Enchantment.DURABILITY, 120, Enchantment.DIG_SPEED, 120));
			
			p.getInventory().addItem(ItemUtils.item(Material.GOLDEN_APPLE, "&6&lGappel", null, 60, 1));
			p.getInventory().addItem(ItemUtils.item(Material.COOKED_CHICKEN, "&8Chicken", null, 64, 0));
		    }else if(Factions.sql.getKITDELAY(p, "OVERLORD") == 0){
		    	p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_HELMET, "&6&lOver&4&lLord Helmet", null, 1, Enchantment.DURABILITY, 120, Enchantment.PROTECTION_ENVIRONMENTAL, 120));
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_CHESTPLATE, "&6&lOver&4&lLord Chestplate", null, 1, Enchantment.DURABILITY, 120, Enchantment.PROTECTION_ENVIRONMENTAL, 120));
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_LEGGINGS, "&6&lOver&4&lLord Leggings", null, 1, Enchantment.DURABILITY, 120, Enchantment.PROTECTION_ENVIRONMENTAL, 120));
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_BOOTS, "&6&lOver&4&lLord Boots", null, 1, Enchantment.DURABILITY, 120, Enchantment.PROTECTION_ENVIRONMENTAL, 120));
				
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_SWORD, "&6&lOver&4&lLord Sword", null, 1, Enchantment.DURABILITY, 120, Enchantment.DAMAGE_ALL, 120));
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_AXE, "&6&lOver&4&lLord Axe", null, 1, Enchantment.DURABILITY, 120, Enchantment.DIG_SPEED, 120));
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_SPADE, "&6&lOver&4&lLord Shovel", null, 1, Enchantment.DURABILITY, 120, Enchantment.DIG_SPEED, 120));
				
				p.getInventory().addItem(ItemUtils.item(Material.GOLDEN_APPLE, "&6&lGappel", null, 60, 1));
				p.getInventory().addItem(ItemUtils.item(Material.COOKED_CHICKEN, "&8Chicken", null, 64, 0));
		        Factions.sql.setKITDELAY(p, 86400, "OVERLORD");
		        delay.start(p);
		    }else{
		    	p.sendMessage("§c§lYou can't use this now. Wait time is §4§l" + Factions.sql.getKITDELAY(p, "OVERLORD") + " §c§lseconds.");
		  }
		    }else{
		    	p.sendMessage("§c§lNo permission.");
		    }
		}

	
	//-----------------------------------------------------------------------------------//
	
	public void giveOverkill(Player p){
		if(p.hasPermission("kits.overkill")){
	        if(p.isOp()){
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_HELMET, "&5&lOverkill Helmet", null, 1, Enchantment.DURABILITY, 140, Enchantment.PROTECTION_ENVIRONMENTAL, 140));
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_CHESTPLATE, "&5&lOverkill Chestplate", null, 1, Enchantment.DURABILITY, 140, Enchantment.PROTECTION_ENVIRONMENTAL, 140));
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_LEGGINGS, "&5&lOverkill Leggings", null, 1, Enchantment.DURABILITY, 140, Enchantment.PROTECTION_ENVIRONMENTAL, 140));
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_BOOTS, "&5&lOverkill Boots", null, 1, Enchantment.DURABILITY, 140, Enchantment.PROTECTION_ENVIRONMENTAL, 140));
			
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_SWORD, "&5&lOverkill Sword", null, 1, Enchantment.DURABILITY, 140, Enchantment.DAMAGE_ALL, 140));
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_AXE, "&5&lOverkill Axe", null, 1, Enchantment.DURABILITY, 140, Enchantment.DIG_SPEED, 140));
			p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_SPADE, "&5&lOverkill Shovel", null, 1, Enchantment.DURABILITY, 140, Enchantment.DIG_SPEED, 140));
			
			p.getInventory().addItem(ItemUtils.item(Material.GOLDEN_APPLE, "&6&lGappel", null, 70, 1));
			p.getInventory().addItem(ItemUtils.item(Material.COOKED_CHICKEN, "&8Chicken", null, 64, 0));
		    }else if(Factions.sql.getKITDELAY(p, "OVERKILL") == 0){
		    	p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_HELMET, "&5&lOverkill Helmet", null, 1, Enchantment.DURABILITY, 140, Enchantment.PROTECTION_ENVIRONMENTAL, 140));
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_CHESTPLATE, "&5&lOverkill Chestplate", null, 1, Enchantment.DURABILITY, 140, Enchantment.PROTECTION_ENVIRONMENTAL, 140));
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_LEGGINGS, "&5&lOverkill Leggings", null, 1, Enchantment.DURABILITY, 140, Enchantment.PROTECTION_ENVIRONMENTAL, 140));
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_BOOTS, "&5&lOverkill Boots", null, 1, Enchantment.DURABILITY, 140, Enchantment.PROTECTION_ENVIRONMENTAL, 140));
				
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_SWORD, "&5&lOverkill Sword", null, 1, Enchantment.DURABILITY, 140, Enchantment.DAMAGE_ALL, 140));
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_AXE, "&5&lOverkill Axe", null, 1, Enchantment.DURABILITY, 140, Enchantment.DIG_SPEED, 140));
				p.getInventory().addItem(ItemUtils.kitenchanteditem(Material.DIAMOND_SPADE, "&5&lOverkill Shovel", null, 1, Enchantment.DURABILITY, 140, Enchantment.DIG_SPEED, 140));
				
				p.getInventory().addItem(ItemUtils.item(Material.GOLDEN_APPLE, "&6&lGappel", null, 70, 1));
				p.getInventory().addItem(ItemUtils.item(Material.COOKED_CHICKEN, "&8Chicken", null, 64, 0));
		        Factions.sql.setKITDELAY(p, 86400, "OVERKILL");
		        delay.start(p);
		    }else{
		    	p.sendMessage("§c§lYou can't use this now. Wait time is §4§l" + Factions.sql.getKITDELAY(p, "OVERKILL") + " §c§lseconds.");
		  }
		    }else{
		    	p.sendMessage("§c§lNo permission.");
		    }
		}



}
