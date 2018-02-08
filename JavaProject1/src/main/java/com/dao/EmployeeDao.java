package com.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.bo.Employee;

public class EmployeeDao {

public List<Employee> getAllEmployee(){
	Employee e1=new Employee();
	Employee e2=new Employee();
	Employee e3=new Employee();
	List<Employee> eList=new ArrayList<>();
	e1.setAddress("kjr");
	e1.setDesg("manager");
	e1.setId(123);
	e1.setName("Susman");
	
	
	e2.setAddress("ctc");
	e2.setDesg("cleark");
	e2.setId(345);
	e2.setName("rama");
	
	e3.setAddress("gm");
	e3.setDesg("Hr");
	e3.setId(564);
	e3.setName("hari");
	eList.addAll(Arrays.asList(e1,e2,e3));
	return eList;
}
}
