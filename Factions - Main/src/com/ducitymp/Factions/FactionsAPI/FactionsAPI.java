package com.ducitymp.Factions.FactionsAPI;

import org.bukkit.entity.Player;

import com.massivecraft.factions.FPlayer;
import com.massivecraft.factions.FPlayers;

public class FactionsAPI {
	
	public FactionsAPI(){
		
	}
	
	public void setPower(Player p, Double d){
		
	   FPlayer fplayer = FPlayers.getInstance().getByPlayer(p);
	   
	   fplayer.alterPower(d);
	}
	
	public Double getPower(Player p){
         FPlayer fplayer = FPlayers.getInstance().getByPlayer(p);
		   
		 return fplayer.getPower();
		}
	
	public String getFName(Player p){
		FPlayer fplayer = FPlayers.getInstance().getByPlayer(p);
		
		return fplayer.getChatTag();
	}

}