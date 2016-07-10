package com.ducitymp.Factions.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.scoreboard.Scoreboard;
import org.bukkit.scoreboard.Team;

import com.ducitymp.Factions.Fancifull.FancyMessage;

import ru.tehkode.permissions.bukkit.PermissionsEx;

public class Join implements Listener{
	
	Scoreboard board = Bukkit.getScoreboardManager().getMainScoreboard();
    Team team = null;
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e){
		Player p = (Player) e.getPlayer();
       
		if(board.getTeam(p.getName()) == null){
            team = board.registerNewTeam(p.getName());
    }else{
            team = board.getTeam(p.getName());
    }
   
    team.setPrefix(ChatColor.translateAlternateColorCodes('&', PermissionsEx.getUser(p).getPrefix()));
    team.addPlayer(p);
	}
	
	@EventHandler
	public void onJoin2(PlayerJoinEvent e){
		Player p = (Player) e.getPlayer();
		e.setJoinMessage("&8«&a+&8» &a".replace("&", "§") + p.getName().replace("&", "§"));
		p.sendMessage("&8&l&m--------------&5&l GravityCraft &8&l&m--------------".replace("&", "§"));
		p.sendMessage(" ");
		p.sendMessage("   &7Welcome &5&l".replace("&", "§") + p.getName() + " &7to &5&lGravityCraft&7!".replace("&", "§"));
		p.sendMessage(" ");
		p.sendMessage("                   &7There are [&5&l".replace("&", "§") + Bukkit.getServer().getOnlinePlayers().size() + "&7] players online!".replace("&", "§"));
		p.sendMessage(" ");
		new FancyMessage("                    &5&lClick here for the shop                ".replace("&", "§")).tooltip("Click here for the shop!").link("http://shop.gravitycraft.eu").send(p);
		p.sendMessage(" ");
		p.sendMessage("&8&l&m--------------&5&l GravityCraft &8&l&m---------------".replace("&", "§"));
	}
	@EventHandler
	public void LEFT(PlayerQuitEvent e){
		Player p = (Player) e.getPlayer();
		e.setQuitMessage("&8«&c-&8» &c".replace("&", "§") + p.getName());
	}

}
