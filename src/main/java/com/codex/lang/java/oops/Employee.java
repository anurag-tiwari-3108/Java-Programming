package com.codex.lang.java.oops;

public class Employee {
	private String name;
	private String city;
	private String address;
	private int empid;

	public Employee(int empid, String name, String city, String address) {
		this.empid = empid;
		this.name = name;
		this.city = city;
		this.address = address;
	}

	public int getEmpId() {
		return this.empid;
	}

	public void setEmpId(int empId) {
		this.empid = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
