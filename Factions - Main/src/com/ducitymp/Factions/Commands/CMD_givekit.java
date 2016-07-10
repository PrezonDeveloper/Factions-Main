package com.ducitymp.Factions.Commands;

import org.bukkit.ChatColor;
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
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&5&l>&d&l>&f&l> Recieved kit starter <&d&l<&5&l<"));
				}else if(args[0].equalsIgnoreCase("hero")){
					kit.giveHero(p);
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&5&l>&d&l>&f&l> Recieved kit hero <&d&l<&5&l<"));
				}else if(args[0].equalsIgnoreCase("god")){
					kit.giveGod(p);
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&5&l>&d&l>&f&l> Recieved kit god <&d&l<&5&l<"));
				}else if(args[0].equalsIgnoreCase("elite")){
					kit.giveElite(p);
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&5&l>&d&l>&f&l> Recieved kit elite <&d&l<&5&l<"));
				}else if(args[0].equalsIgnoreCase("lord")){
					kit.giveLord(p);
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&5&l>&d&l>&f&l> Recieved kit lord <&d&l<&5&l<"));
				}else if(args[0].equalsIgnoreCase("overlord")){
					kit.giveOverLord(p);
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&5&l>&d&l>&f&l> Recieved kit overlord <&d&l<&5&l<"));
				}else if(args[0].equalsIgnoreCase("overkill")){
					kit.giveOverkill(p);
					p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&5&l>&d&l>&f&l> Recieved kit overkill <&d&l<&5&l<"));
				}else{
					sender.sendMessage("§c§lInvalid kit.");
					return true;
				}
			}else{
				p.sendMessage("§4§lUsage: §c§l/givekit (kit)");
				return true;
			}
		}
		return false;
	}
	
	

}
