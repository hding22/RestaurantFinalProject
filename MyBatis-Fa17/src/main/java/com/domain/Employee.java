package com.domain;

import java.math.BigDecimal;

public class Employee {
	
	private String fname;
	private String lname;
	private String ssn;
	private BigDecimal salary;
	
	
	public Employee() {
		super();
	}
	
	public Employee(String fname, String lname, String ssn, BigDecimal salary) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.ssn = ssn;
		this.salary = salary;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}	
	

}
