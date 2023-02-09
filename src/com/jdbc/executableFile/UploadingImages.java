package com.jdbc.executableFile;

import java.io.FileInputStream;
import java.sql.*;

public class UploadingImages {
	
	public static void main(String[] args) {
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/learningjdbc", "root", "root");
			String qString = "insert into images(picture) value(?)";
			PreparedStatement preparedStatement = connection.prepareStatement(qString);
			preparedStatement.setBinaryStream(1, new FileInputStream("C:\\Users\\xclude\\Desktop\\360-ganesh-O8stPSUBaTY-unsplash.jpg"));
			preparedStatement.executeUpdate();
			System.out.println("done..");
		} catch (Exception e) {
			e.getLocalizedMessage();
		}finally {
			try {
				connection.close();
			} catch (Exception e2) {
				e2.getLocalizedMessage();
			}
		}
	}

}
