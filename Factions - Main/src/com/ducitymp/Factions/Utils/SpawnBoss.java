package com.ducitymp.Factions.Utils;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffectType;

import com.ducitymp.Factions.Factions;

public class SpawnBoss {
	
	static List<ScriptedBoss> mob_list = new ArrayList<ScriptedBoss>();

    static ScriptedBoss zombieboss = new ScriptedBoss(new Location(Bukkit.getWorld("world"), 8, 70, 9), EntityType.ZOMBIE, ChatColor.translateAlternateColorCodes('&', "&0&lBlack Guy"), true);
      
    public static void setup(){
       
        for(ScriptedBoss mob : mob_list){
            mob.spawn();
        }
        
        zombieboss.setEquipment(
        		new ItemStack(Material.SKULL_ITEM, 1, (byte) 1),
        		new ItemStack(Material.GOLD_CHESTPLATE, 1, (byte) 0),
        		null,
        		null,
        		new ItemStack(Material.DIAMOND_HOE, 1, (byte) 0));
        
        
        Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(Factions.getInstance(), new Runnable() {
            public void run() {
                for(ScriptedBoss mob : mob_list) {
                   if(mob.invisible) mob.addOPEffect(PotionEffectType.INVISIBILITY);
                   mob.addEffect(PotionEffectType.INCREASE_DAMAGE);
                   mob.addEffect(PotionEffectType.SPEED);
                   mob.addEffect(PotionEffectType.HARM);
                }
            }
        }, 0L, 10L);  
    }
   
    public static void despawn(){
    	
        for(ScriptedBoss mob : mob_list){
            if(mob.IsSpawned()) mob.mob.remove();
            mob.setDeath();
     }
}
   
    public static ScriptedBoss mobList_get(Entity ent){
        ScriptedBoss found_mob = null;
       
        for(ScriptedBoss mob : mob_list)
            if(mob.equals(ent)) found_mob = mob;
       
        return found_mob;
    }  
}