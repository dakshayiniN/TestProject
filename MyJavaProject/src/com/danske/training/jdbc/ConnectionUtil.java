package com.danske.training.jdbc;



import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.util.ResourceBundle;



public class ConnectionUtil {
	
	
	public static Connection getConnection() {
		Connection c = null;
		try {
			ResourceBundle config = ResourceBundle.getBundle("config");			
			String url = config.getString("url");
			String user = config.getString("user");
			String pass = config.getString("pass");
			c = DriverManager.getConnection(url,user,pass);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return c;
	}
	

	public static void main(String[] args) {
		
		try (Connection c = getConnection()) {
			DatabaseMetaData meta = c.getMetaData();
			System.out.println(meta.getDatabaseProductName());
			System.out.println(meta.getDatabaseProductVersion());
			c.close();
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
