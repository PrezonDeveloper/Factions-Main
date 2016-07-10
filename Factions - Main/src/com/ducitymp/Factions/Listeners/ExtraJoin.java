package com.ducitymp.Factions.Listeners;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import com.ducitymp.Factions.Factions;
import com.ducitymp.Factions.Utils.ScoreboardUtil;

public class ExtraJoin implements Listener{
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		Player p = (Player) e.getPlayer();
		Factions.sql.createAccount(p);
	    ScoreboardUtil.buildScoreboard(p);
	}
}
