package com.ducitymp.Factions.Utils;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import com.ducitymp.Factions.Factions;

public class KitDelay {
	
    public KitDelay(){
    	
    }
    
    public void start(Player p){
    if(Factions.sql.getKITDELAY(p, "STARTER") != 0){
    	Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(Factions.getInstance(), new Runnable()
        {
          public void run()
          {
         if(Factions.sql.getKITDELAY(p, "STARTER") != 0){
        	Factions.sql.setKITDELAY(p, Factions.sql.getKITDELAY(p, "STARTER") - 1, "STARTER");
              }
           }
        }, 0, 20);
     }
    
    if(Factions.sql.getKITDELAY(p, "HERO") != 0){
    	Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(Factions.getInstance(), new Runnable()
        {
          public void run()
          {
         if(Factions.sql.getKITDELAY(p, "HERO") != 0){
        	Factions.sql.setKITDELAY(p, Factions.sql.getKITDELAY(p, "HERO") - 1, "HERO");
              }
           }
        }, 0, 20);
     }
    
    if(Factions.sql.getKITDELAY(p, "ELITE") != 0){
    	Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(Factions.getInstance(), new Runnable()
        {
          public void run()
          {
         if(Factions.sql.getKITDELAY(p, "ELITE") != 0){
        	Factions.sql.setKITDELAY(p, Factions.sql.getKITDELAY(p, "ELITE") - 1, "ELITE");
              }
           }
        }, 0, 20);
     }
    
    if(Factions.sql.getKITDELAY(p, "GOD") != 0){
    	Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(Factions.getInstance(), new Runnable()
        {
          public void run()
          {
         if(Factions.sql.getKITDELAY(p, "GOD") != 0){
        	Factions.sql.setKITDELAY(p, Factions.sql.getKITDELAY(p, "GOD") - 1, "GOD");
              }
           }
        }, 0, 20);
     }
    
    if(Factions.sql.getKITDELAY(p, "LORD") != 0){
    	Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(Factions.getInstance(), new Runnable()
        {
          public void run()
          {
         if(Factions.sql.getKITDELAY(p, "LORD") != 0){
        	Factions.sql.setKITDELAY(p, Factions.sql.getKITDELAY(p, "LORD") - 1, "LORD");
              }
           }
        }, 0, 20);
     }
    
    if(Factions.sql.getKITDELAY(p, "OVERLORD") != 0){
    	Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(Factions.getInstance(), new Runnable()
        {
          public void run()
          {
         if(Factions.sql.getKITDELAY(p, "OVERLORD") != 0){
        	Factions.sql.setKITDELAY(p, Factions.sql.getKITDELAY(p, "OVERLORD") - 1, "OVERLORD");
              }
           }
        }, 0, 20);
     }
    
    if(Factions.sql.getKITDELAY(p, "OVERKILL") != 0){
    	Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(Factions.getInstance(), new Runnable()
        {
          public void run()
          {
         if(Factions.sql.getKITDELAY(p, "OVERKILL") != 0){
        	Factions.sql.setKITDELAY(p, Factions.sql.getKITDELAY(p, "OVERKILL") - 1, "OVERKILL");
              }
           }
        }, 0, 20);
     }
    
  }
}
