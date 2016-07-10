package com.ducitymp.Factions.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.ducitymp.Factions.Fancifull.FancyMessage;
import com.ducitymp.Factions.Utils.KitUtils;

public class CMD_kits implements CommandExecutor{

	KitUtils kit = new KitUtils();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if(!(sender instanceof Player)){
			sender.sendMessage("Nop");
		}
		if(cmd.getName().equalsIgnoreCase("kits")){
			Player p = (Player) sender;
		if(args.length == 0){
			p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&f&l&m-----------&5&l Gravity Kits &f&l&m-----------"));
			p.sendMessage(ChatColor.translateAlternateColorCodes('&', "  &7&oHover Kits For Info And Click To Recieve"));
			p.sendMessage(ChatColor.translateAlternateColorCodes('&', "                     &8&l&nKits"));
			new FancyMessage("      &8⤖ &5&nStarter".replace("&", "§")).tooltip(
					"&f&lHelmet:         &f&lSword:".replace("&", "§"),
					"&5Protection 20     &5Sharpness 20".replace("&", "§"),
					"&5Unbreaking 20     &5Unbreaking 20".replace("&", "§"),
					" ",
					"&f&lChestplate:     &f&lAxe:".replace("&", "§"),
					"&5Protection 20     &5Efficiency 20".replace("&", "§"),
					"&5Unbreaking 20     &5Unbreaking 20".replace("&", "§"),
					" ",
					"&f&lLeggings:       &f&lShovel:".replace("&", "§"),
					"&5Protection 20     &5Efficiency 20".replace("&", "§"),
					"&5Unbreaking 20     &5Unbreaking 20".replace("&", "§"),
					" ",
					"&f&lBoots:          &f&lFood:".replace("&", "§"),
					"&5Protection 20     &5Gappels 10".replace("&", "§"),
					"&5Unbreaking 20     &5Chicken 64".replace("&", "§")
					).command("/givekit starter").send(p);
			new FancyMessage("                        &8⤖ &5&nHero".replace("&", "§")).tooltip(
					"&f&lHelmet:         &f&lSword:".replace("&", "§"),
					"&5Protection 40     &5Sharpness 40".replace("&", "§"),
					"&5Unbreaking 40     &5Unbreaking 40".replace("&", "§"),
					" ",
					"&f&lChestplate:     &f&lAxe:".replace("&", "§"),
					"&5Protection 40     &5Efficiency 40".replace("&", "§"),
					"&5Unbreaking 40     &5Unbreaking 40".replace("&", "§"),
					" ",
					"&f&lLeggings:       &f&lShovel:".replace("&", "§"),
					"&5Protection 40     &5Efficiency 40".replace("&", "§"),
					"&5Unbreaking 40     &5Unbreaking 40".replace("&", "§"),
					" ",
					"&f&lBoots:          &f&lFood:".replace("&", "§"),
					"&5Protection 40     &5Gappels 20".replace("&", "§"),
					"&5Unbreaking 40     &5Chicken 64".replace("&", "§")
					).command("/givekit hero").send(p);
			new FancyMessage("      &8⤖ &5&nElite".replace("&", "§")).tooltip(
					"&f&lHelmet:         &f&lSword:".replace("&", "§"),
					"&5Protection 60     &5Sharpness 60".replace("&", "§"),
					"&5Unbreaking 60     &5Unbreaking 60".replace("&", "§"),
					" ",
					"&f&lChestplate:     &f&lAxe:".replace("&", "§"),
					"&5Protection 60     &5Efficiency 60".replace("&", "§"),
					"&5Unbreaking 60     &5Unbreaking 60".replace("&", "§"),
					" ",
					"&f&lLeggings:       &f&lShovel:".replace("&", "§"),
					"&5Protection 60     &5Efficiency 60".replace("&", "§"),
					"&5Unbreaking 60     &5Unbreaking 60".replace("&", "§"),
					" ",
					"&f&lBoots:          &f&lFood:".replace("&", "§"),
					"&5Protection 60     &5Gappels 30".replace("&", "§"),
					"&5Unbreaking 60     &5Chicken 64".replace("&", "§")
					).command("/givekit elite").send(p);
			new FancyMessage("                        &8⤖ &5&nGod".replace("&", "§")).tooltip(
					"&f&lHelmet:         &f&lSword:".replace("&", "§"),
					"&5Protection 80     &5Sharpness 80".replace("&", "§"),
					"&5Unbreaking 80     &5Unbreaking 80".replace("&", "§"),
					" ",
					"&f&lChestplate:     &f&lAxe:".replace("&", "§"),
					"&5Protection 80     &5Efficiency 80".replace("&", "§"),
					"&5Unbreaking 80     &5Unbreaking 80".replace("&", "§"),
					" ",
					"&f&lLeggings:       &f&lShovel:".replace("&", "§"),
					"&5Protection 80     &5Efficiency 80".replace("&", "§"),
					"&5Unbreaking 80     &5Unbreaking 80".replace("&", "§"),
					" ",
					"&f&lBoots:          &f&lFood:".replace("&", "§"),
					"&5Protection 80     &5Gappels 40".replace("&", "§"),
					"&5Unbreaking 80     &5Chicken 64".replace("&", "§")
					).command("/givekit god").send(p);
			new FancyMessage("      &8⤖ &5&nLord".replace("&", "§")).tooltip(
					"&f&lHelmet:         &f&lSword:".replace("&", "§"),
					"&5Protection 100     &5Sharpness 100".replace("&", "§"),
					"&5Unbreaking 100     &5Unbreaking 100".replace("&", "§"),
					" ",
					"&f&lChestplate:     &f&lAxe:".replace("&", "§"),
					"&5Protection 100     &5Efficiency 100".replace("&", "§"),
					"&5Unbreaking 100     &5Unbreaking 100".replace("&", "§"),
					" ",
					"&f&lLeggings:       &f&lShovel:".replace("&", "§"),
					"&5Protection 100     &5Efficiency 100".replace("&", "§"),
					"&5Unbreaking 100     &5Unbreaking 100".replace("&", "§"),
					" ",
					"&f&lBoots:          &f&lFood:".replace("&", "§"),
					"&5Protection 100     &5Gappels 50".replace("&", "§"),
					"&5Unbreaking 100     &5Chicken 64".replace("&", "§")
					).command("/givekit lord").send(p);
			new FancyMessage("                        &8⤖ &5&nOverLord".replace("&", "§")).tooltip(
					"&f&lHelmet:         &f&lSword:".replace("&", "§"),
					"&5Protection 120     &5Sharpness 120".replace("&", "§"),
					"&5Unbreaking 120     &5Unbreaking 120".replace("&", "§"),
					" ",
					"&f&lChestplate:     &f&lAxe:".replace("&", "§"),
					"&5Protection 120     &5Efficiency 120".replace("&", "§"),
					"&5Unbreaking 120     &5Unbreaking 120".replace("&", "§"),
					" ",
					"&f&lLeggings:       &f&lShovel:".replace("&", "§"),
					"&5Protection 120     &5Efficiency 120".replace("&", "§"),
					"&5Unbreaking 120     &5Unbreaking 120".replace("&", "§"),
					" ",
					"&f&lBoots:          &f&lFood:".replace("&", "§"),
					"&5Protection 120     &5Gappels 60".replace("&", "§"),
					"&5Unbreaking 120     &5Chicken 64".replace("&", "§")
					).command("/givekit overlord").send(p);
			new FancyMessage("      &8⤖ &5&nOverkill".replace("&", "§")).tooltip(
					"&f&lHelmet:         &f&lSword:".replace("&", "§"),
					"&5Protection 140     &5Sharpness 140".replace("&", "§"),
					"&5Unbreaking 140     &5Unbreaking 140".replace("&", "§"),
					" ",
					"&f&lChestplate:     &f&lAxe:".replace("&", "§"),
					"&5Protection 140     &5Efficiency 140".replace("&", "§"),
					"&5Unbreaking 140     &5Unbreaking 140".replace("&", "§"),
					" ",
					"&f&lLeggings:       &f&lShovel:".replace("&", "§"),
					"&5Protection 140     &5Efficiency 140".replace("&", "§"),
					"&5Unbreaking 140     &5Unbreaking 140".replace("&", "§"),
					" ",
					"&f&lBoots:          &f&lFood:".replace("&", "§"),
					"&5Protection 140     &5Gappels 64".replace("&", "§"),
					"&5Unbreaking 140     &5Chicken 64".replace("&", "§")
					).command("/givekit overkill").send(p);
			p.sendMessage(ChatColor.translateAlternateColorCodes('&', "&f&l&m-----------&5&l Gravity Kits &f&l&m-----------"));
		}
	}
		return false;
	}

}
