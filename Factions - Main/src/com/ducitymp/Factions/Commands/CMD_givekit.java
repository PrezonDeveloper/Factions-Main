package com.ducitymp.Factions.Commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.ducitymp.Factions.Utils.KitUtils;

public class CMD_givekit implements CommandExecutor{

	KitUtils kit = new KitUtils();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
	Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("givekit")){
			if(args.length == 1){
				if(args[0].equalsIgnoreCase("starter")){
					kit.giveStarter(p);
					
				}else if(args[0].equalsIgnoreCase("hero")){
					kit.giveHero(p);
					
				}else if(args[0].equalsIgnoreCase("god")){
					kit.giveGod(p);
					
				}else if(args[0].equalsIgnoreCase("elite")){
					kit.giveElite(p);
				}else if(args[0].equalsIgnoreCase("lord")){
					kit.giveLord(p);
					}else if(args[0].equalsIgnoreCase("overlord")){
					kit.giveOverLord(p);
					
				}else if(args[0].equalsIgnoreCase("overkill")){
					kit.giveOverkill(p);
					
				}else{
					sender.sendMessage("§c§lInvalid kit.");
					return true;
				}
			}else if(args.length == 2){
				
				if(args[0].equalsIgnoreCase("starter")){
					Player target = Bukkit.getPlayer(args[1]);
					if(target == null){
						sender.sendMessage("§c§lPlayer is not online.");
						return true;
					}
					
					kit.giveStarter(target);
				}else if(args[0].equalsIgnoreCase("hero")){
					Player target = Bukkit.getPlayer(args[1]);
					if(target == null){
						sender.sendMessage("§c§lPlayer is not online.");
						return true;
					}
					
					kit.giveHero(target);
				}else if(args[0].equalsIgnoreCase("god")){
					Player target = Bukkit.getPlayer(args[1]);
					if(target == null){
						sender.sendMessage("§c§lPlayer is not online.");
						return true;
					}
					
					kit.giveGod(target);
					}else if(args[0].equalsIgnoreCase("elite")){
					Player target = Bukkit.getPlayer(args[1]);
					if(target == null){
						sender.sendMessage("§c§lPlayer is not online.");
						return true;
					}
					
					kit.giveElite(target);
					}else if(args[0].equalsIgnoreCase("lord")){
					Player target = Bukkit.getPlayer(args[1]);
					if(target == null){
						sender.sendMessage("§c§lPlayer is not online.");
						return true;
					}
					
					kit.giveLord(target);
				}else if(args[0].equalsIgnoreCase("overlord")){
					Player target = Bukkit.getPlayer(args[1]);
					if(target == null){
						sender.sendMessage("§c§lPlayer is not online.");
						return true;
					}
					
					kit.giveOverLord(p);
					}else if(args[0].equalsIgnoreCase("overkill")){
					Player target = Bukkit.getPlayer(args[1]);
					if(target == null){
						sender.sendMessage("§c§lPlayer is not online.");
						return true;
					}
					
					kit.giveOverkill(target);
					}else{
					sender.sendMessage("§c§lInvalid kit.");
					return true;
				}
				
			}else{
				p.sendMessage("§4§lUsage: §c§l/givekit [kit] (player)");
				return true;
			}
		}
		return false;
	}
	
	

}
