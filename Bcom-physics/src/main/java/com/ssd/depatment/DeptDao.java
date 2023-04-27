package com.ssd.depatment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DeptDao {

	private Statement stmt;

	private ResultSet rs;

	private Connection con;

	private String str = "SELECT * FROM DEPT";

	private String str1 = "insert into dept "+" (deptno,dname,loc) values "+" (?,?,?)";

	public List<EmpDept> emplist() {

		List<EmpDept> empList = new ArrayList<>();

		try {
			con = DbConnection.conn();

			stmt = con.createStatement();

			rs = stmt.executeQuery(str);

			while (rs.next()) {

				EmpDept emp = new EmpDept();

				emp.setDeptno(rs.getInt(1));
				emp.setDname(rs.getString(2));
				emp.setLoc(rs.getString(3));
				empList.add(emp);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return empList;

	}

	public boolean AddDept(EmpDept dept) {

		try {

			con = DbConnection.conn();

			PreparedStatement ps = con.prepareStatement(str1);

			ps.setInt(1, dept.getDeptno());

			ps.setString(2, dept.getDname());

			ps.setString(3, dept.getLoc());

			ps.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;

	}

}
