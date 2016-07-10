package com.ducitymp.Factions.API;

import java.text.DecimalFormat;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.RegisteredServiceProvider;

import net.milkbowl.vault.economy.Economy;

public class Vault {

public static Economy econ = null;
	
	public static boolean setupEconomy() {
		if (Bukkit.getServer().getPluginManager().getPlugin("Vault") == null) {
			return false;
		}
		RegisteredServiceProvider<Economy> rsp = Bukkit.getServer().getServicesManager().getRegistration(Economy.class);
		if (rsp == null) {
			return false;
		}
		econ = rsp.getProvider();
		return econ != null;
	}
	
public static int doubleToInt(Double d)
    {
	return d.intValue();
    }

public static int getMoney(Player p)
{
  if (Vault.econ != null)
  {
    int m = doubleToInt(Double.valueOf(Vault.econ.getBalance(p)));
    return m;
  }
  return 1;
}
	
    public static String formatbal(Player p) {
    DecimalFormat decimalFormat = new DecimalFormat("###,###,###,###");

    return decimalFormat.format(Vault.econ.getBalance(p));
    }

	@SuppressWarnings("deprecation")
    public static void giveMoney(Player p, int amount){
    	Vault.econ.depositPlayer(p.getName(), amount);
    }
	
    @SuppressWarnings("deprecation")
    public static void takeMoney(Player p, int amount){
    	Vault.econ.withdrawPlayer(p.getName(), amount);
    }
    @SuppressWarnings("deprecation")
	public static boolean hasMoney(Player p, int amount){
    	return Vault.econ.has(p.getName(), amount);
    }
	
}
