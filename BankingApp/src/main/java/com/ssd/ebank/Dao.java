package com.ssd.ebank;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Dao {
	
	private Connection conn;
	private java.sql.Statement stmt;
	private ResultSet rs;
	private String SELECT_ALL="select * from emp";
	
	public List<Emp> getAllEmp(){
		
		List<Emp> empList=new ArrayList<>();
		
		conn=DbConnection.getConnection();
		
		try {
			stmt=conn.createStatement();
			
			rs=stmt.executeQuery("SELECT_ALL");
			
			while(rs.next()) {
				
				//empno, ename, job, mgr, hiredate, sal, comm, deptno
				
				Emp e=new Emp(rs.getInt(1),
							rs.getString(2),
							rs.getString(3),
							rs.getInt(4),
							rs.getString(5),
							rs.getDouble(6),
							rs.getDouble(7),
							rs.getInt(8));
							  
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return empList;
		
		
		
	}

}
