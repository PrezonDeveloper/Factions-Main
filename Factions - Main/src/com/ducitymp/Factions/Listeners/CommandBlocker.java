package com.ducitymp.Factions.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class CommandBlocker implements Listener{
	
	@EventHandler
	public void Command(PlayerCommandPreprocessEvent e){
      if(e.getMessage().equalsIgnoreCase("/kit")){
			sendKit(e.getPlayer());
			e.setCancelled(true);
	  }
      if(e.getMessage().equalsIgnoreCase("/pl") && !e.getPlayer().isOp()){
			sendNO(e.getPlayer());
			e.setCancelled(true);
	  }
      
      if(e.getMessage().equalsIgnoreCase("/plugins") && !e.getPlayer().isOp()){
			sendNO(e.getPlayer());
			e.setCancelled(true);
	  }
      
      if(e.getMessage().equalsIgnoreCase("/bukkit:help") && !e.getPlayer().isOp()){
			sendNO(e.getPlayer());
			e.setCancelled(true);
	  }
      
      if(e.getMessage().equalsIgnoreCase("/about") && !e.getPlayer().isOp()){
			sendNO(e.getPlayer());
			e.setCancelled(true);
	  }
      
      if(e.getMessage().equalsIgnoreCase("/bukkit:?") && !e.getPlayer().isOp()){
			sendNO(e.getPlayer());
			e.setCancelled(true);
	  }
      
      if(e.getMessage().equalsIgnoreCase("/bukkit:about") && !e.getPlayer().isOp()){
			sendNO(e.getPlayer());
			e.setCancelled(true);
	  }
      
      if(e.getMessage().equalsIgnoreCase("/?") && !e.getPlayer().isOp()){
			sendNO(e.getPlayer());
			e.setCancelled(true);
	  }
      
      if(e.getMessage().equalsIgnoreCase("/bukkit:pl") && !e.getPlayer().isOp()){
			sendNO(e.getPlayer());
			e.setCancelled(true);
	  }
      
      if(e.getMessage().equalsIgnoreCase("/ver") && !e.getPlayer().isOp()){
			sendNO(e.getPlayer());
			e.setCancelled(true);
	  }
      
      if(e.getMessage().equalsIgnoreCase("/bukkit:plugins") && !e.getPlayer().isOp()){
			sendNO(e.getPlayer());
			e.setCancelled(true);
	  }
      
      if(e.getMessage().equalsIgnoreCase("/bukkit:ver") && !e.getPlayer().isOp()){
			sendNO(e.getPlayer());
			e.setCancelled(true);
	  }
      
      if(e.getMessage().equalsIgnoreCase("/version") && !e.getPlayer().isOp()){
			sendNO(e.getPlayer());
			e.setCancelled(true);
	  }
      
      if(e.getMessage().equalsIgnoreCase("/bukkit:version") && !e.getPlayer().isOp()){
			sendNO(e.getPlayer());
			e.setCancelled(true);
	  }
      
      if(e.getMessage().equalsIgnoreCase("/rl") && !e.getPlayer().isOp()){
			sendNO(e.getPlayer());
			e.setCancelled(true);
	  }
      
      if(e.getMessage().equalsIgnoreCase("/reload") && !e.getPlayer().isOp()){
			sendNO(e.getPlayer());
			e.setCancelled(true);
	  }
      
      if(e.getMessage().equalsIgnoreCase("/restart") && !e.getPlayer().isOp()){
			sendNO(e.getPlayer());
			e.setCancelled(true);
	  }
  }
	
	public void sendKit(Player p){
		p.sendMessage("§c§lPlease use /kits.");
	}

	public void sendNO(Player p){
		p.sendMessage("§c§lYou are not allowed to use this command.");
	}

}
