package com.hexaware.hibernateonetomanyusingxml.entity;

public class Department {
	
	private Long departmentId;
	private String departmentName;
	
	private Employee employee;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}

	public Department(Long departmentId, String departmentName) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
	}
	
	public Department(String departmentName, Employee employee) {
		super();
		this.departmentName = departmentName;
		this.employee = employee;
	}

	public Department(String departmentName) {
		super();
		this.departmentName = departmentName;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	

}
