package com.ssd.depatment;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	
	public static Connection conn() {
		
		Connection connect=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connect= DriverManager.getConnection("jdbc:mysql://localhost:3306/ssd-emp", "root", "asdf1234");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connect;
		
		
		
	}

}
