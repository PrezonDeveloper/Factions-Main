package com.ducitymp.Factions.Utils;

import java.util.ArrayList;
import java.util.List;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;

import com.ducitymp.Factions.Factions;

 
public class SmartMob {
   
    static List<ScriptedMob> mob_list = new ArrayList<ScriptedMob>();

    static ScriptedMob shards = new ScriptedMob(new Location(Bukkit.getWorld("world"), 348, 163, 291)
            , EntityType.ENDER_CRYSTAL, "cristal",  true, true, true, true);
      
    public static void setup(){
       
        for(ScriptedMob mob : mob_list){
            mob.spawn();
            mob.god_mode();
        }
        Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(Factions.getInstance(), new Runnable() {
            public void run() {
                for(ScriptedMob mob : mob_list) {
                    if(!mob.IsSpawned()) mob.spawn();
                    if(!mob.can_move) mob.mob.teleport(mob.spawn_loc);
                }
            }
        }, 0L, 10L);  
    }
   
    public static void despawn(){
    	
        for(ScriptedMob mob : mob_list){
            if(mob.IsSpawned()) mob.mob.remove();
            mob.setDeath();
     }
}
   
    public static ScriptedMob mobList_get(Entity ent){
        ScriptedMob found_mob = null;
       
        for(ScriptedMob mob : mob_list)
            if(mob.equals(ent)) found_mob = mob;
       
        return found_mob;
    }  
}