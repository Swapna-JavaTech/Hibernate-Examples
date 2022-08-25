package com.hexaware.onetomanyunidirectionalexampleusingannotations;

import com.hexaware.onetomanyunidirectionalexampleusingannotations.dao.EmployeeDao;
import com.hexaware.onetomanyunidirectionalexampleusingannotations.entity.Department;
import com.hexaware.onetomanyunidirectionalexampleusingannotations.entity.Employee;

public class OneToManyUsingAnnotationsUniDirectional {
	
	public static void main(String[] args) {
		Employee emp = new Employee("Rama", "ram@gmail.com", 450000);
		EmployeeDao employeeDao = new EmployeeDao();
		
		employeeDao.saveEmployee(emp);
		
		//create some departments
		
		Department hrDept = new Department();
		hrDept.setDepartmentName("HR");
		emp.getDepartments().add(hrDept);
		
		Department accDept = new Department();
		accDept.setDepartmentName("Accounts");
		emp.getDepartments().add(accDept);
		
		
		employeeDao.saveEmployee(emp);

	}

}
