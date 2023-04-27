package com.ssd.DeptServlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ssd.depatment.EmpDept;
import com.ssd.depatment.service.DeptService;

@WebServlet("/DeptServlet")
public class DeptServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public DeptServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		List<EmpDept> empList=new ArrayList<>();
		
		DeptService ds=new DeptService();
		
		empList=ds.getAllDept();
		
		
		
		request.setAttribute("DeptList", empList);
		
		request.getRequestDispatcher("Dept.jsp").forward(request, response);
		
		
		
		
	}

}
