package com.ducitymp.Factions.Listeners;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.player.PlayerInteractEvent;

import com.ducitymp.Factions.Factions;
import com.ducitymp.Factions.API.Vault;
import com.ducitymp.Factions.FactionsAPI.FactionsAPI;
import com.ducitymp.Factions.Utils.ItemUtils;
import com.ducitymp.Factions.Utils.ScoreboardUtil;
import com.ducitymp.Factions.Utils.SupplyDrop;

import net.md_5.bungee.api.ChatColor;

public class RandomCrate implements Listener{
	
	private static FactionsAPI api = new FactionsAPI();
	
	@EventHandler
	public void onInteract(PlayerInteractEvent e){
		Player p = (Player) e.getPlayer();
if(!(e.getPlayer().getInventory().getItemInMainHand().getType().equals(Material.AIR)) || !(e.getPlayer().getInventory().getItemInMainHand() == null)){
	if(e.getAction().equals(Action.RIGHT_CLICK_AIR) || e.getAction().equals(Action.RIGHT_CLICK_BLOCK)){
		if(e.getItem().getItemMeta().getDisplayName().equalsIgnoreCase("§6Supply Drop Roll")){
		SupplyDrop.min = 1;
		
		if(e.getItem().getAmount() != 1){
			e.getItem().setAmount(e.getItem().getAmount() - 1);
	    }else{
		 p.getInventory().remove(e.getItem());
	    }
	 
		
		Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&f&l&m-----------------------------"));
		Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "      &5&lSupplyDrop forced to 1 minute!    "));
		Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "             &f&lBY §c§l" + p.getName().toUpperCase() + "!"));
	    Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&f&l&m-----------------------------"));
		}
		if(e.getItem().getItemMeta().getDisplayName().contains(ChatColor.translateAlternateColorCodes('&', "&a&l$"))){
			int waarde = Integer.valueOf(ChatColor.stripColor(e.getItem().getItemMeta().getDisplayName()).replace("$", "").replace(".", ""));
			 if(e.getItem().getAmount() != 1){
					e.getItem().setAmount(e.getItem().getAmount() - 1);
			 }else{
				 p.getInventory().remove(e.getItem());
			 }
			 
			Vault.giveMoney(p, waarde);
			ScoreboardUtil.buildScoreboard(p);
			p.sendMessage("§a§l(!) You have recieved " + waarde + " §a§lmoney.");
		}
	if(e.getItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', "&6Give Power Voucher (10)"))){
			 if(e.getItem().getAmount() != 1){
					e.getItem().setAmount(e.getItem().getAmount() - 1);
			 }else{
				 p.getInventory().remove(e.getItem());
			 }
			api.setPower(p, 10.0);
			p.sendMessage("§a§l(!) There is 10 power added to your account.");
			ScoreboardUtil.buildScoreboard(p);
		}
			if(e.getItem().getItemMeta().getDisplayName().equalsIgnoreCase(ChatColor.translateAlternateColorCodes('&', "&b&lRandom Overkill Chest"))){
				e.setCancelled(true);
				Random random = new Random();
				int Chance = random.nextInt(90);
				if(Chance <= 10){
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b&lChoosing price..."));
					if(e.getItem().getAmount() != 1){
						e.getItem().setAmount(e.getItem().getAmount() - 1);
				    }else{
					 p.getInventory().remove(e.getItem());
				    }
                     Bukkit.getScheduler().runTaskLater(Factions.getInstance(), new Runnable() {
						
						@Override
						public void run() {
							p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b&lYou won an &f&lNORMAL CRATE KEY&b&l!"));
							Factions.sql.setKEY(p, Factions.sql.getKEY(p, "Normal") + 1, "Normal");
						}
					}, (20 * 3));
				
				}else if(Chance <= 20){
					
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b&lChoosing price..."));
					if(e.getItem().getAmount() != 1){
						e.getItem().setAmount(e.getItem().getAmount() - 1);
				 }else{
					 p.getInventory().remove(e.getItem());
				 }
					
                    Bukkit.getScheduler().runTaskLater(Factions.getInstance(), new Runnable() {
						
						@Override
						public void run() {
							p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b&lYou won an &f&l100k CHECK&b&l!"));
							List<String> lore = new ArrayList<String>();
							lore.add(ChatColor.translateAlternateColorCodes('&', "&b&lSigned by: &fThe Server"));
							p.getInventory().addItem(ItemUtils.item(Material.PAPER, "&a&l$100.000", lore, 1, 0));
						}
					}, (20 * 3));
					
				}else if(Chance <= 30){
					
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b&lChoosing price..."));
					if(e.getItem().getAmount() != 1){
						e.getItem().setAmount(e.getItem().getAmount() - 1);
				 }else{
					 p.getInventory().remove(e.getItem());
				 }
				Bukkit.getScheduler().runTaskLater(Factions.getInstance(), new Runnable() {
				@Override
				public void run() {
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lYou are not very lucky today..."));
				Bukkit.getWorld(p.getWorld().getName()).spawnEntity(p.getLocation(), EntityType.PRIMED_TNT);
					}
				}, (20 * 3));
					
				}else if(Chance <= 40){
					
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b&lChoosing price..."));
					if(e.getItem().getAmount() != 1){
						e.getItem().setAmount(e.getItem().getAmount() - 1);
				 }else{
					 p.getInventory().remove(e.getItem());
				 }
					
                    Bukkit.getScheduler().runTaskLater(Factions.getInstance(), new Runnable() {
						
						@Override
						public void run() {
							p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b&lYou won &f&l5 SHARDS&b&l!"));
							Factions.sql.setSHARDS(p, Factions.sql.getSHARDS(p) + 5);
						}
					}, (20 * 3));
					
				}else if(Chance <= 50){
					
			     p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b&lChoosing price..."));
				 if(e.getItem().getAmount() != 1){
				 e.getItem().setAmount(e.getItem().getAmount() - 1);
				 }else{
				 p.getInventory().remove(e.getItem());
				 }
				 
				Bukkit.getScheduler().runTaskLater(Factions.getInstance(), new Runnable() {
				@Override
				public void run() {
				p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&c&lYou are not very lucky today..."));
				Bukkit.getWorld(p.getWorld().getName()).spawnEntity(p.getLocation(), EntityType.CREEPER);
				Bukkit.getWorld(p.getWorld().getName()).spawnEntity(p.getLocation(), EntityType.CREEPER);
				Bukkit.getWorld(p.getWorld().getName()).spawnEntity(p.getLocation(), EntityType.CREEPER);
					}
				}, (20 * 3));
					
				}else if(Chance <= 60){
					
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b&lChoosing price..."));
					if(e.getItem().getAmount() != 1){
						e.getItem().setAmount(e.getItem().getAmount() - 1);
				 }else{
					 p.getInventory().remove(e.getItem());
				 }
					
                    Bukkit.getScheduler().runTaskLater(Factions.getInstance(), new Runnable() {
						
						@Override
						public void run() {
							p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b&lYou won an &f&lDIAMOND HELMET&b&l!"));
							List<String> lore = new ArrayList<String>();
							p.getInventory().addItem(ItemUtils.enchanteditem(Material.DIAMOND_HELMET, "&6&l&ki&5&lGravity Helmet&6&l&ki", lore, 1, Enchantment.PROTECTION_ENVIRONMENTAL, 500));
						}
					}, (20 * 3));
					
				}else if(Chance <= 70){
					
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b&lChoosing price..."));
					if(e.getItem().getAmount() != 1){
						e.getItem().setAmount(e.getItem().getAmount() - 1);
				 }else{
					 p.getInventory().remove(e.getItem());
				 }
					
                    Bukkit.getScheduler().runTaskLater(Factions.getInstance(), new Runnable() {
						
						@Override
						public void run() {
							p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b&lYou won an &f&lELYTRA&b&l!"));
							List<String> lore = new ArrayList<String>();
							p.getInventory().addItem(ItemUtils.enchanteditem(Material.ELYTRA, "&6&l&ki&5&lGravity Elytra&6&l&ki", lore, 1, Enchantment.DURABILITY, 500));
						}
					}, (20 * 3));
					
				}else if(Chance <= 80){
					
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b&lChoosing price..."));
					if(e.getItem().getAmount() != 1){
						e.getItem().setAmount(e.getItem().getAmount() - 1);
				 }else{
					 p.getInventory().remove(e.getItem());
				 }
					
                    Bukkit.getScheduler().runTaskLater(Factions.getInstance(), new Runnable() {
						
						@Override
						public void run() {
							p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b&lYou won an &f&lDIAMOND PICKAXE&b&l!"));
							List<String> lore = new ArrayList<String>();
							p.getInventory().addItem(ItemUtils.enchanteditem(Material.DIAMOND_PICKAXE, "&6&l&ki&5&lGravity Pickaxe&6&l&ki", lore, 1, Enchantment.DIG_SPEED, 500));
						}
					}, (20 * 3));
					
				}else if(Chance <= 90){
					
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b&lChoosing price..."));
					if(e.getItem().getAmount() != 1){
						e.getItem().setAmount(e.getItem().getAmount() - 1);
				 }else{
					 p.getInventory().remove(e.getItem());
				 }
					
                    Bukkit.getScheduler().runTaskLater(Factions.getInstance(), new Runnable() {
						
						@Override
						public void run() {
							p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&b&lYou won an &f&lDIAMOND SWORD&b&l!"));
							List<String> lore = new ArrayList<String>();
							p.getInventory().addItem(ItemUtils.enchanteditem(Material.DIAMOND_SWORD, "&6&l&ki&5&lGravity Sword&6&l&ki", lore, 1, Enchantment.DAMAGE_ALL, 500));
						}
					}, (20 * 3));
					
				}
			   }
			}
		}
	}

}