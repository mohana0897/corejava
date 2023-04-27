package com.ssd.depatment.service;

import java.util.ArrayList;
import java.util.List;

import com.ssd.depatment.DeptDao;
import com.ssd.depatment.EmpDept;

public class DeptService {
	
	DeptDao dao;
	
	public DeptService() {
		
		dao=new DeptDao();
		
	}
	
	public static void main(String[] args) {
		
		DeptService dm= new DeptService();
		
		System.out.println(dm.getAllDept());
	}
	
	public List<EmpDept> getAllDept(){
		
		List<EmpDept> EmpDeptList=new ArrayList<>();
		
		DeptDao d=new DeptDao();
		
		EmpDeptList=d.emplist();
		
		return EmpDeptList;
		
		
	}
	
	public boolean AddDept(EmpDept deptno) {
		
		 dao.AddDept(deptno);
		 
		 return false;
		
		
	}


}
