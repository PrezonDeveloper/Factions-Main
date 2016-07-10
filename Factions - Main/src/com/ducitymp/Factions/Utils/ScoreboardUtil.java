package com.ducitymp.Factions.Utils;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.DisplaySlot;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.ScoreboardManager;

import com.ducitymp.Factions.Factions;
import com.ducitymp.Factions.API.Vault;
import com.ducitymp.Factions.FactionsAPI.FactionsAPI;

import ru.tehkode.permissions.bukkit.PermissionsEx;

public class ScoreboardUtil {
	
	private static ScoreboardManager manager;
	private static org.bukkit.scoreboard.Scoreboard scoreboard;
	private static Objective objective;
	private static Score score5;
	private static Score score2;
	private static Score timer;
	private static FactionsAPI api = new FactionsAPI();
	
	public static void buildScoreboard(final Player p) {
		manager = Bukkit.getScoreboardManager();
		scoreboard = manager.getNewScoreboard();
	    	
		objective = scoreboard.registerNewObjective("test", "dummy");
	    objective.setDisplaySlot(DisplaySlot.SIDEBAR);
	    objective.setDisplayName(ChatColor.translateAlternateColorCodes('&', " &8&l✗ &5&lGravityCraft &8&l✗ "));
	    	
	    Score score6 = objective.getScore(ChatColor.translateAlternateColorCodes('&', "&7Balance:"));
		score6.setScore(7);
	    
	    score5 = objective.getScore(ChatColor.translateAlternateColorCodes('&', "&8⤖  &5$" + Vault.formatbal(p)));
		score5.setScore(6);

	    Score score3 = objective.getScore(ChatColor.translateAlternateColorCodes('&', "&7Power:"));
		score3.setScore(5);
	
		score2 = objective.getScore(ChatColor.translateAlternateColorCodes('&', "&8⤖  &5" + Vault.doubleToInt(api.getPower(p))));
		score2.setScore(4);

	    Score score0 = objective.getScore(ChatColor.translateAlternateColorCodes('&', "&7Shards:"));
		score0.setScore(3);
		
		Score score = objective.getScore(ChatColor.translateAlternateColorCodes('&', "&6&l&m&8⤖  &5" + Factions.sql.getSHARDS(p)));
		score.setScore(2);
		
		Score score11 = objective.getScore(ChatColor.translateAlternateColorCodes('&', "&7Rank:"));
	    score11.setScore(1);
			
		timer = objective.getScore(ChatColor.translateAlternateColorCodes('&', "&8⤖  &5" + PermissionsEx.getUser(p).getPrefix()));
		timer.setScore(0);
	  
				
	    p.setScoreboard(scoreboard);
	}
}
