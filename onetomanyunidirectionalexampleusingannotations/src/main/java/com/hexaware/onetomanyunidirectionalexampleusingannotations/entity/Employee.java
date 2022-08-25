package com.hexaware.onetomanyunidirectionalexampleusingannotations.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "emp_onetomany")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="empid")
	private Long empId;
	
	@Column(name="empname")
	private String empName;
	
	@Column(name="empemail")
	private String empEmail;
	
	@Column(name="empsal")
	private float empSalary;
	
	@OneToMany(cascade = CascadeType.ALL)
	//@JoinColumn(name = "empdetails_id")
	private Set<Department> departments = new HashSet<Department>();
	
	public Set<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(Set<Department> departments) {
		this.departments = departments;
	}

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
