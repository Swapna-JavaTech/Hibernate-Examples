package com.hexaware.hibernateonetooneexample.model;

public class Employee {
	
	private Long empId;
	private String empName;
	private String empEmail;
	private float empSalary;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Long empId, String empName, String empEmail, float empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empSalary = empSalary;
	}
	
	public Employee(String empName, String empEmail, float empSalary) {
		super();
		this.empName = empName;
		this.empEmail = empEmail;
		this.empSalary = empSalary;
	}

	public Long getEmpId() {
		return empId;
	}

	public void setEmpId(Long empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public float getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(float empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empEmail=" + empEmail + ", empSalary="
				+ empSalary + "]";
	}
	
	
	

}
