package com.ducitymp.Factions.Commands;

import java.io.Console;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.ducitymp.Factions.Factions;
import com.ducitymp.Factions.Utils.ScoreboardUtil;

public class CMD_Shards implements CommandExecutor{

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String cmdlabel, String[] args) {
		if(cmd.getName().equalsIgnoreCase("shards")){
			if(args.length == 0){
				if(sender instanceof Player){
					sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&f[&5&lGravityCraft&f] you have currently &5" + Factions.sql.getSHARDS((Player) sender) + " &fshards!"));
				}else{
					sender.sendMessage("Only players can use this command!");
				}
			}else{
			if(sender.isOp()){
				if(args[0].equalsIgnoreCase("add")){
					if(args.length <= 1 && args.length >= 4){
						sender.sendMessage("Usage: /shards add [amount] [player]");
						return true;
					}
					 Player target = Bukkit.getServer().getPlayer(args[2]);
					  if(target == null){
						  sender.sendMessage("Player is not online!!!");
						  return true;
					  }
					  Factions.sql.setSHARDS(target, Factions.sql.getSHARDS(target) + Integer.valueOf(args[1]));
					  sender.sendMessage("Met succes shards gegeven aan de speler!");
					  ScoreboardUtil.buildScoreboard(target);
				}
			}
		}
	}
		return false;
	}
	
	

}
