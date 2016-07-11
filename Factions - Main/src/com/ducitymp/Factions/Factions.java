package com.ducitymp.Factions;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import com.ducitymp.Factions.API.Vault;
import com.ducitymp.Factions.Commands.CMD_Shards;
import com.ducitymp.Factions.Commands.CMD_auction;
import com.ducitymp.Factions.Commands.CMD_givekit;
import com.ducitymp.Factions.Commands.CMD_kits;
import com.ducitymp.Factions.Listeners.BlockInteract;
import com.ducitymp.Factions.Listeners.CommandBlocker;
import com.ducitymp.Factions.Listeners.EntityDamage;
import com.ducitymp.Factions.Listeners.EntityInteract;
import com.ducitymp.Factions.Listeners.ExtraJoin;
import com.ducitymp.Factions.Listeners.Join;
import com.ducitymp.Factions.Listeners.RandomCrate;
import com.ducitymp.Factions.MySQL.SQLSettings;
import com.ducitymp.Factions.Shards.ShardsInteract;
import com.ducitymp.Factions.Utils.ScoreboardUtil;
import com.ducitymp.Factions.Utils.SupplyDrop;

public class Factions extends JavaPlugin{
	
	private static Plugin pl;
	public static SQLSettings sql;
	
	private void spawnChest(){
		Location loc = new Location(getServer().getWorld("world"), 20, 69, 15);
		loc.getBlock().setType(Material.CHEST);
	}
	
	public void onEnable(){
    pl = this;
    
    sql = new SQLSettings(this, "151.80.11.114", "KH_3398", "KH_3398", "128b0e7734");
    
    if (!Vault.setupEconomy() ) {
		getLogger().severe(String.format("[%s] - Disable De plugin Vault zit er nog niet in!", getDescription().getName()));
		getServer().getPluginManager().disablePlugin(this);
		return;
	}
    
	spawnChest();
	SupplyDrop.startTimer();
	sql.setKITDELAYALL(0, "STARTER");
	sql.setKITDELAYALL(0, "ELITE");
	sql.setKITDELAYALL(0, "GOD");
	sql.setKITDELAYALL(0, "LORD");
	sql.setKITDELAYALL(0, "OVERLORD");
	sql.setKITDELAYALL(0, "OVERKILL");
	
	Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(Factions.getInstance(), new Runnable()
    {
      public void run()
      {
    	  SupplyDrop.startTimer();
    	  for(Player p : Bukkit.getOnlinePlayers()){
    			ScoreboardUtil.buildScoreboard(p);
    		}
      }
    }, 0, 20*60);
	
	// petervisjes@outlook.com
	// Breakdance91q	
	
    getServer().getPluginManager().registerEvents(new EntityInteract(), getInstance());
    getServer().getPluginManager().registerEvents(new EntityDamage(), getInstance());
    getServer().getPluginManager().registerEvents(new BlockInteract(), getInstance());
    getServer().getPluginManager().registerEvents(new Join(), getInstance());
    getServer().getPluginManager().registerEvents(new ExtraJoin(), getInstance());
    getServer().getPluginManager().registerEvents(new ShardsInteract(), getInstance());
    getServer().getPluginManager().registerEvents(new RandomCrate(), getInstance());
    getServer().getPluginManager().registerEvents(new CommandBlocker(), getInstance());
    
    getCommand("shards").setExecutor(new CMD_Shards());
    getCommand("kits").setExecutor(new CMD_kits());
    getCommand("givekit").setExecutor(new CMD_givekit());
    getCommand("auction").setExecutor(new CMD_auction());
    
    if (!Bukkit.getPluginManager().isPluginEnabled("HolographicDisplays")) {
    	getLogger().severe("*** HolographicDisplays is not installed or not enabled. ***");
    	getLogger().severe("*** This plugin will be disabled. ***");
    	this.setEnabled(false);
    	return;
    	}
    
	}
	
	public static Plugin getInstance(){
		return pl;
	}

}
