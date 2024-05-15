package com.masai.Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	public static Connection getConnections() {
		Connection conn=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ev4","root","nitesh");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		
		return conn;
	}

}
