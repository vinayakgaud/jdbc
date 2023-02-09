package com.jdbc.executableFile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.databaseActivity.ConnectionProvider;

public class ConnectingDB {
	public static void main(String[] args) throws FileNotFoundException {
		try {
			Connection connection = null;
			try {
				connection = ConnectionProvider.getConnection();
				String qString = "show tables";
				Statement statement = connection.createStatement();
				ResultSet set = statement.executeQuery(qString);
				while(set.next()) {
					System.out.println(set.getString(1));
				}
				
			} finally {
				connection.close();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
