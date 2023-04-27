package com.ssd.service;

import java.util.ArrayList;
import java.util.List;

import com.ssd.ebank.Dao;
import com.ssd.ebank.Emp;

public class EmpService {
	
	public List<Emp> getAllEmp(){
		
		List<Emp> empList=new ArrayList<Emp>();
		
		Dao d=new Dao();
		
		empList= d.getAllEmp();
		
		return empList;
		
	
	}

}
