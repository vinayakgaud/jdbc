package com.jdbc.executableFile;

import java.sql.Connection;
import java.sql.Statement;

import com.jdbc.databaseActivity.ConnectionProvider;

public class UpdatingData {

	public static void main(String[] args) {
		Connection connection = null;
		try {
			connection = ConnectionProvider.getConnection();
			try {
				String queryString = "update user set email = 'camcam@test.com' where uid = 3";
				Statement statement = connection.createStatement();
				statement.executeUpdate(queryString);
			} finally {
				connection.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
