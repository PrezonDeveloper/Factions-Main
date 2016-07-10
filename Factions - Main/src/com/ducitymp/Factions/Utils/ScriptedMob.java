package com.ducitymp.Factions.Utils;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Villager;
import org.bukkit.entity.Villager.Profession;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
 
public class ScriptedMob {
 
    Location spawn_loc;
    EntityType type;
    Entity mob;
   
    boolean cancel_rightclick, can_move, god_mode, can_dmg;
    ItemStack helmet, chestplate, leggings, boots, weapon;
    String mob_name;
   
    Profession prof;
   
    public ScriptedMob(Location spawn_loc, EntityType type, String name, boolean cancel_rightclick, boolean can_move, boolean god_mode, boolean can_dmg){
       
        this.mob = null;
        this.spawn_loc = spawn_loc;
        this.type = type;
        this.mob_name = name;
        this.prof = null;
       
        this.cancel_rightclick = cancel_rightclick;
        this.can_move = can_move;
        this.god_mode = god_mode;
        this.can_dmg = can_dmg;
      
       
        SmartMob.mob_list.add(this);
    }
   
    private void applyProfession(){
        if(this.IsSpawned() && this.mob.getType().equals(EntityType.VILLAGER) && prof != null)
            ((Villager) mob).setProfession(prof);
    }
   
    public void setProfession(Profession prof){
        this.prof = prof;
       
        applyProfession();
    }
    
    public void setDeath(){
    	if(this.IsSpawned()){
    		mob.remove();
    	}
    }
    
    public Location getLocation(){
    	return mob.getLocation();
    }
    public World getWorld(){
    	return mob.getWorld();
    }
   
    public void spawn(){
        if(this.IsSpawned()) return;
       
        mob = spawn_loc.getWorld().spawnEntity(spawn_loc, type);
       
        if(!(mob instanceof LivingEntity)) return;
       
         ((LivingEntity) mob).setRemoveWhenFarAway(false);
       
        if(!mob_name.isEmpty()) {
            mob.setCustomName(mob_name);
            mob.setCustomNameVisible(true);
        }
       
        if(!can_move){
            ((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.SLOW, Integer.MAX_VALUE, 128));
            ((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.JUMP, Integer.MAX_VALUE, -2));
        }
       
        applyProfession();
    }
   
    public boolean equals(Entity ent){
        return ent.equals(mob);
    }
   
    public boolean IsSpawned(){
        return mob != null && mob.isValid();
    }
   
    public boolean god_mode(){
        return god_mode;
    }
   
    public boolean can_damage(){
        return can_dmg;
    }
   
}