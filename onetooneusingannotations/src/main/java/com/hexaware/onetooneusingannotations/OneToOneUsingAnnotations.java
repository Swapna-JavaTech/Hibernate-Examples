package com.hexaware.onetooneusingannotations;

import com.hexaware.onetooneusingannotations.dao.EmployeeDao;
import com.hexaware.onetooneusingannotations.entity.Employee;
import com.hexaware.onetooneusingannotations.entity.EmployeeDetails;

public class OneToOneUsingAnnotations {

	public static void main(String[] args) {
		
		Employee emp = new Employee("Rama", "ram@gmail.com", 450000);
		EmployeeDetails empDetails = new EmployeeDetails("Bangalore", 17, "Hyderabad", "K891235")
;
		emp.setEmpDetails(empDetails);
		EmployeeDao employeeDao = new EmployeeDao();
		employeeDao.saveEmployee(emp);
	}

}
