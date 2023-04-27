package com.ssd.DeptServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssd.depatment.EmpDept;
import com.ssd.depatment.service.DeptService;

@WebServlet("/AddDept")
public class AddDept extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public AddDept() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		EmpDept dept = new EmpDept();

		String dno = request.getParameter("dno");

		int deptno = Integer.parseInt(dno);

		String dname = request.getParameter("deptname");

		String loc = request.getParameter("location");

		dept.setDeptno(deptno);

		dept.setDname(dname);

		dept.setLoc(loc);

		DeptService ds = new DeptService();

		ds.AddDept(dept);
		
		System.out.println(dept);

		boolean isCreated = ds.AddDept(dept);

		if (!isCreated) {

			request.getRequestDispatcher("DeptServlet").forward(request, response);
		}
	}

}
