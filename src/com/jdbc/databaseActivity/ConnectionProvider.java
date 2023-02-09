package com.jdbc.databaseActivity;

import java.sql.*;

public class ConnectionProvider {
	
	private static Connection connection;
	public static String  string = "hello";
	public static Connection getConnection() {
		
		if(connection == null) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				String username = "root";
				String password = "root";
				String url = "jdbc:mysql://localhost:3306/learningjdbc";
				
				connection = DriverManager.getConnection(url,username,password);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		return connection;
	}

}
