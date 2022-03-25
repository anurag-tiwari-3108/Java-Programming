package com.codex.lang.java.immutable;

public class EmployeeBean {
	
	private String id;
	private String name;
	private String dept;
	private String company;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public Object EmployeeBean() throws CloneNotSupportedException {
		return new EmployeeBean().clone();
	}
}
