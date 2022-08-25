package com.hexaware.hibernateonetooneexample.model;

public class EmployeeDetails {
	
	private Long empDetailsId;
	private String empPermAddr;
	private float empTotalExp;
	private String empBaseLocation;
	private String empPassportNo;
	
	private Employee employee;
	
	public EmployeeDetails() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeDetails(Long empDetailsId, String empPermAddr, float empTotalExp, String empBaseLocation,
			String empPassportNo) {
		super();
		this.empDetailsId = empDetailsId;
		this.empPermAddr = empPermAddr;
		this.empTotalExp = empTotalExp;
		this.empBaseLocation = empBaseLocation;
		this.empPassportNo = empPassportNo;
	}

	public EmployeeDetails(String empPermAddr, float empTotalExp, String empBaseLocation,
			String empPassportNo) {
		super();
		this.empPermAddr = empPermAddr;
		this.empTotalExp = empTotalExp;
		this.empBaseLocation = empBaseLocation;
		this.empPassportNo = empPassportNo;
	}
	
	

	public EmployeeDetails(String empPermAddr, float empTotalExp, String empBaseLocation,
			String empPassportNo, Employee employee) {
		super();
		
		this.empPermAddr = empPermAddr;
		this.empTotalExp = empTotalExp;
		this.empBaseLocation = empBaseLocation;
		this.empPassportNo = empPassportNo;
		this.employee = employee;
	}

	public Long getEmpDetailsId() {
		return empDetailsId;
	}

	public void setEmpDetailsId(Long empDetailsId) {
		this.empDetailsId = empDetailsId;
	}

	public String getEmpPermAddr() {
		return empPermAddr;
	}

	public void setEmpPermAddr(String empPermAddr) {
		this.empPermAddr = empPermAddr;
	}

	public float getEmpTotalExp() {
		return empTotalExp;
	}

	public void setEmpTotalExp(float empTotalExp) {
		this.empTotalExp = empTotalExp;
	}

	public String getEmpBaseLocation() {
		return empBaseLocation;
	}

	public void setEmpBaseLocation(String empBaseLocation) {
		this.empBaseLocation = empBaseLocation;
	}

	public String getEmpPassportNo() {
		return empPassportNo;
	}

	public void setEmpPassportNo(String empPassportNo) {
		this.empPassportNo = empPassportNo;
	}

	@Override
	public String toString() {
		return "EmployeeDetails [empDetailsId=" + empDetailsId + ", empPermAddr=" + empPermAddr + ", empTotalExp="
				+ empTotalExp + ", empBaseLocation=" + empBaseLocation + ", empPassportNo=" + empPassportNo + "]";
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	

}
