package com.hexaware.onetooneusingannotations.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "empdetailsdata4567")
public class EmployeeDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="empdetailsid")
	private Long empDetailsId;
	
	@Column(name="emppermaddr")
	private String empPermAddr;
	
	@Column(name="emptotalexp")
	private float empTotalExp;
	
	@Column(name="empbaseloc")
	private String empBaseLocation;
	
	@Column(name="emppassportno")
	private String empPassportNo;
	

	
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


}
