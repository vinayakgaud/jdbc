package com.jdbc.executableFile;

import java.sql.*;
public class MysqlConnectCreatingTable {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learningjdbc", "root", "root");
			String query="create table user9 like user";
			Statement statement = connection.createStatement();
			statement.executeUpdate(query);
			System.out.println("table user9 created");
			
			String queString = "create table user10("
					+ "id int primary key not null auto_increment,"
					+ "name varchar(20) not null"
					+ ")";
			Statement statement2 = connection.createStatement();
			statement2.executeUpdate(queString);
			System.out.println("table user10 created");
			connection.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.getLocalizedMessage();
		}
	}

}
