package com.ducitymp.Factions.Utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import com.ducitymp.Factions.Factions;

public class Action implements Listener{
	
	public Action(){
		
	}
	
	public Player topbidder = null;
	
	public int cost = 0;
	
	public int topbid = 0;
	
	public int auctime = 0;
	
	public Player auctioner = null;
	
	public Inventory inv = null;
	
	public ItemStack aucitem = null;
	
	public boolean isBid = false;
	
	public boolean isStart = false;
	
	public int task;
	
	public void startAction(Player auctioner, int cost, int time){
		this.auctioner = auctioner;
		this.cost = cost;
		this.auctime = time;
		
		this.isStart = true;
		
		this.aucitem = auctioner.getInventory().getItemInMainHand();
		this.aucitem.clone();
		auctioner.getInventory().remove(this.aucitem);
		
		startTimer();
		
		
		
		//TODO MESSAGE
	}
	
	private void startTimer(){
  task = Bukkit.getServer().getScheduler().scheduleSyncRepeatingTask(Factions.getInstance(), new Runnable()
	    {
	      public void run()
	      {
             if(auctime != 0){
            	 auctime = auctime - 1;
             }else{
            	 Bukkit.getScheduler().cancelTask(task);
             }
	      }
	    }, 0, 20*60);
	}
	
	private ItemStack spacer(){
		ItemStack i = ItemUtils.item(Material.STAINED_GLASS_PANE, "&5&lGravity&d&lAuction", null, 1, 0);
	return i;
	}
	
	public void bid(Player bidder, int bid){
		this.topbidder = bidder;
		this.topbid = bid;
		this.isBid = true;
	}
	
	public void openAucInv(Player p){
		inv = Bukkit.createInventory(null, 9*3, ChatColor.translateAlternateColorCodes('&', "&5&lGravity&d&lAction"));
			for(int i = 0; i < 4; i++){
				this.inv.setItem(i, this.spacer());
			}
			for(int i = 5; i < 9; i++){
				this.inv.setItem(i, this.spacer());
			}
			for(int i = 18; i < 22; i++){
				this.inv.setItem(i, this.spacer());
			}
			
			for(int i = 23; i < 27; i++){
				this.inv.setItem(i, this.spacer());
			}
			
			inv.setItem(4, ItemUtils.item(Material.STAINED_GLASS_PANE, ChatColor.translateAlternateColorCodes('&', "&5&lGravity&d&lAction"), null, 1, 2));
			inv.setItem(22, ItemUtils.item(Material.STAINED_GLASS_PANE, ChatColor.translateAlternateColorCodes('&', "&5&lGravity&d&lAction"), null, 1, 2));
	
		    inv.setItem(9, ItemUtils.skull("&a&lAuctioner: &f" + this.auctioner.getName(), null, 1, 3, p, this.auctioner));	

			p.openInventory(this.inv);
	}
	
	public void endAuction(){
		if(this.isBid = false){
			Bukkit.broadcastMessage(ChatColor.translateAlternateColorCodes('&', "&5&lGravity&d&lAuction &f&l>> &&lAuction is stopped with no bids."));
		}else{
			
		}
	}

}
