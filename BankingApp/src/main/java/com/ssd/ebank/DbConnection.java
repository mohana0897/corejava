package com.ssd.ebank;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	
	public static Connection getConnection(){
		
		Connection con=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ssd-emp","root","asdf1234");
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return con;
		
	}

}
