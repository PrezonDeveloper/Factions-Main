package com.ducitymp.Factions.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import com.ducitymp.Factions.Utils.Action;

public class CMD_auction implements CommandExecutor{

	private Action auc = new Action();
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String lable, String[] args) {
		if(cmd.getName().equalsIgnoreCase("auction")){
			auc.openAucInv((Player) sender);
		}
		return false;
	}

}
