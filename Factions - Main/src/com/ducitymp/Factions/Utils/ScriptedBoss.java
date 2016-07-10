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
 
public class ScriptedBoss{
 
    Location spawn_loc;
    EntityType type;
    Entity mob;
   
    boolean invisible;
    ItemStack helmet, chestplate, leggings, boots, weapon;
    String mob_name;
   
    Profession prof;
   
    public ScriptedBoss(Location spawn_loc, EntityType type, String name, boolean invisble){
        this.mob = null;
        this.spawn_loc = spawn_loc;
        this.type = type;
        this.mob_name = name;
        this.invisible = invisble;
      
        SpawnBoss.mob_list.add(this);
    }
    
    public void setEquipment(ItemStack helm, ItemStack chestplate, ItemStack leggings, ItemStack boots, ItemStack weapon){
        this.helmet = helm;
        this.chestplate = chestplate;
        this.leggings = leggings;
        this.boots = boots;
       
        this.weapon = weapon;
       
        equip();
    }
   
    private void equip(){
        if(this.IsSpawned() && mob instanceof LivingEntity){
            if(helmet != null) ((LivingEntity) mob).getEquipment().setHelmet(this.helmet);
            if(chestplate != null) ((LivingEntity) mob).getEquipment().setChestplate(this.chestplate);
            if(leggings != null) ((LivingEntity) mob).getEquipment().setLeggings(this.leggings);
            if(boots != null) ((LivingEntity) mob).getEquipment().setBoots(this.boots);
           
            if(weapon != null) ((LivingEntity) mob).getEquipment().setItemInMainHand(this.weapon);
           
        }
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
       
        if(invisible){
            ((LivingEntity) mob).addPotionEffect(new PotionEffect(PotionEffectType.INVISIBILITY, Integer.MAX_VALUE, 128));
        }
       
    }
   
    public boolean equals(Entity ent){
        return ent.equals(mob);
    }
    
    public void addEffect(PotionEffectType effect){
    	((LivingEntity) mob).addPotionEffect(new PotionEffect(effect, Integer.MAX_VALUE, 4));
    }
    
    public void addOPEffect(PotionEffectType effect){
    	((LivingEntity) mob).addPotionEffect(new PotionEffect(effect, Integer.MAX_VALUE, 128));
    }
   
    public boolean IsSpawned(){
        return mob != null && mob.isValid();
    }
   
}