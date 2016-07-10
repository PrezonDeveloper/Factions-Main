package com.ducitymp.Factions.MySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.bukkit.Bukkit;

public class MySQL {
	
	private String user = "KH_3398";
	private String pass = "128b0e7734";
	private String host = "151.80.11.114";
	private String db = "KH_3398";
	private Connection connection;

	public MySQL(String user, String pass, String host, String db) {
		this.connect();
	}

	public void close() {
		try {
			if (this.connection != null) {
				this.connection.close();
			}
		} catch (Exception ex) {
			System.err.println(ex);
		}
	}

	public void connect() {
		try {
			this.connection = DriverManager.getConnection("jdbc:mysql://" + host + ":3306/" + db + "?autoReconnect=true", user, pass);
		} catch (SQLException e) {
			e.printStackTrace();
			Bukkit.broadcastMessage("§c§lKAN DATABASE NIET VINDEN!!! Meld dit aub aan 'ducitymp', 'PrezonDeveloper' of 'jelleclaus2'!");
			Bukkit.broadcastMessage("§c§lTwitter: @ducitymp1 / mail: ducitymp@gmail.com");
		}
	}

	public void Update(String qry) {
		try {
			Statement stmt = this.connection.createStatement();
			stmt.executeUpdate(qry);
			stmt.close();
		} catch (Exception ex) {
			this.connect();
			System.err.println(ex);
		}
	}

	public ResultSet Query(String qry) {
		ResultSet rs = null;
		try {
			Statement stmt = this.connection.createStatement();
			rs = stmt.executeQuery(qry);
		} catch (Exception ex) {
			this.connect();
			System.err.println(ex);
		}
		return rs;
	}
}