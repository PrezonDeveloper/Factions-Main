package com.ducitymp.Factions.MySQL;

import java.sql.ResultSet;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class SQLSettings {
	
	private JavaPlugin instance;
	private MySQL mysql;

	public SQLSettings(JavaPlugin plugin, String Host, String User, String DB, String Pass) {
		this.instance = plugin;
		this.mysql = new MySQL(User, Pass, Host, DB);
		this.mysql.Update(
		"CREATE TABLE IF NOT EXISTS PlayerData(username varchar(100) PRIMARY KEY, COINS int NOT NULL, KEY_Vote int NOT NULL , KEY_Normal int NOT NULL, KEY_Gold int NOT NULL, KEY_Unique int NOT NULL, KEY_Ultimate int NOT NULL, SHARDS int NOT NULL)");
		
		this.mysql.Update(
				"CREATE TABLE IF NOT EXISTS Kit(username varchar(100) PRIMARY KEY, STARTER_DELAY int NOT NULL, HERO_DELAY int NOT NULL , ELITE_DELAY int NOT NULL, GOD_DELAY int NOT NULL, LORD_DELAY int NOT NULL, OVERLORD_DELAY int NOT NULL, OVERKILL_DELAY int NOT NULL)");
}

	public void createAccount(Player p) {
		boolean PlayerDataExist = false;
		boolean KitExist = false;
		
		try {
			ResultSet rs = this.mysql
					.Query("SELECT username FROM Kit WHERE username='" + p.getName() + "' LIMIT 1");
			if (rs.next()) {
				PlayerDataExist = true;
			}
		} catch (Exception err) {
			System.err.println(err);
		}
		if (!PlayerDataExist) {
			this.mysql
					.Update("INSERT INTO Kit(username,STARTER_DELAY,HERO_DELAY,ELITE_DELAY,GOD_DELAY,LORD_DELAY,OVERLORD_DELAY,OVERKILL_DELAY) values ('"
							+ p.getName() + "','" + 0 + "','" + 0 + "','" + 0 + "','" + 0 + "','" + 0 + "','" + 0 + "','" + 0 + "')");
		}
		
		try {
			ResultSet rs = this.mysql
					.Query("SELECT username FROM PlayerData WHERE username='" + p.getName() + "' LIMIT 1");
			if (rs.next()) {
				PlayerDataExist = true;
			}
		} catch (Exception err) {
			System.err.println(err);
		}
		if (!PlayerDataExist) {
			this.mysql
					.Update("INSERT INTO PlayerData(username,COINS,KEY_Vote,KEY_Normal,KEY_Gold,KEY_Unique,KEY_Ultimate,SHARDS) values ('"
							+ p.getName() + "','" + 0 + "','" + 0 + "','" + 0 + "','" + 0 + "','" + 0 + "','" + 0 + "','" + 0 + "')");
		}
	}
	
	public int getKITDELAY(Player p, String KIT) {
		int c = 0;
		try {
			ResultSet rs = this.mysql.Query("SELECT " + KIT + "_DELAY FROM Kit WHERE username='" + p.getName() + "'");
			while (rs.next()) {
				c = rs.getInt(1);
			}
		} catch (Exception err) {
			System.err.println(err);
		}
		return c;
	}
	
	public void setKITDELAY(Player p, int amount, String KIT) {
		this.mysql.Update("UPDATE Kit SET " + KIT + "_DELAY='" + (amount) + "' WHERE username='" + p.getName() + "'");
	}
	
	public void setKITDELAYALL(int amount, String KIT) {
		this.mysql.Update("UPDATE Kit SET " + KIT + "_DELAY='" + (amount) + "'");
	}
	
	public int getCOINS(Player p) {
		int c = 0;
		try {
			ResultSet rs = this.mysql.Query("SELECT COINS FROM PlayerData WHERE username='" + p.getName() + "'");
			while (rs.next()) {
				c = rs.getInt(1);
			}
		} catch (Exception err) {
			System.err.println(err);
		}
		return c;
	}
	
	public void setCOINS(Player p, int amount) {
		this.mysql.Update("UPDATE PlayerData SET COINS='" + (amount) + "' WHERE username='" + p.getName() + "'");
	}
	
	public int getKEY(Player p, String KEYTYPE) {
		int c = 0;
		try {
			ResultSet rs = this.mysql.Query("SELECT KEY_" + KEYTYPE + " FROM PlayerData WHERE username='" + p.getName() + "'");
			while (rs.next()) {
				c = rs.getInt(1);
			}
		} catch (Exception err) {
			System.err.println(err);
		}
		return c;
	}
	
	public void setKEY(Player p, int amount, String KEYTYPE) {
		this.mysql.Update("UPDATE PlayerData SET KEY_" + KEYTYPE + "='" + (amount) + "' WHERE username='" + p.getName() + "'");
	}
	
	public int getSHARDS(Player p) {
		int c = 0;
		try {
			ResultSet rs = this.mysql.Query("SELECT SHARDS FROM PlayerData WHERE username='" + p.getName() + "'");
			while (rs.next()) {
				c = rs.getInt(1);
			}
		} catch (Exception err) {
			System.err.println(err);
		}
		return c;
	}
	
	public void setSHARDS(Player p, int amount) {
		this.mysql.Update("UPDATE PlayerData SET SHARDS='" + (amount) + "' WHERE username='" + p.getName() + "'");
	}
	
}