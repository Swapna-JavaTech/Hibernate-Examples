package com.hexaware.hibernateonetomanyusingxml;

import java.util.HashSet;
import java.util.Set;

import com.hexaware.hibernateonetomanyusingxml.dao.OneToManyDao;
import com.hexaware.hibernateonetomanyusingxml.dao.OneToManyDaoFactory;
import com.hexaware.hibernateonetomanyusingxml.entity.Department;
import com.hexaware.hibernateonetomanyusingxml.entity.Employee;

public class OneToManyExample {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		//emp.setEmpId(12023L);
		emp.setEmpName("Rama");
		emp.setEmpEmail("ram@gmail.com");
		emp.setEmpSalary(45000);
		
		Department dept = new Department();
		//dept.setDepartmentId(2001L);
		dept.setDepartmentName("HR");
		
		Department dept1 = new Department();
		//dept.setDepartmentId(2002L);
		dept.setDepartmentName("Accounts");
		
		Set<Department> empDepts = new HashSet<Department>();
		empDepts.add(dept);
		empDepts.add(dept1);
		
		emp.setDepartments(empDepts);
		
		OneToManyDao dao = OneToManyDaoFactory.getInstance();
		dao.saveEmployee(emp);
		
		
	}

}
