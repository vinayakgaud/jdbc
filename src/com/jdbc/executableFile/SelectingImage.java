package com.jdbc.executableFile;

import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Blob;
import com.jdbc.databaseActivity.ConnectionProvider;

public class SelectingImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection connection = null;
			try {
				connection = ConnectionProvider.getConnection();
				String quString = "select picture from images";
				Statement statement = connection.createStatement();
				ResultSet set = statement.executeQuery(quString);
				while (set.next()) {
					Blob b = set.getBlob(1);
					byte[] bArr = b.getBytes(1,(int)b.length());
					FileOutputStream fStream = new FileOutputStream("G:\\JAVA_Projects\\Full Stack Projects\\FileHandling\\FileStorage\\dbImage.png");
					fStream.write(bArr);
					fStream.close();
				}
			} finally {
				// TODO: handle finally clause
				connection.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.getMessage();
		}
	}

}
