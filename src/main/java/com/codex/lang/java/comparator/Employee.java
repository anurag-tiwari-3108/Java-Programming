package com.codex.lang.java.comparator;

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

	public Employee(int empid, String name) {
		this.empid = empid;
		this.name = name;
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

	@Override
	public int hashCode() {
		final int prime = 40;
		int result = 1;
		result = prime * result + empid;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		System.out.println("Employee :: Returning Hashcode for" + getName() + " . Hashcode is " + result);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empid != other.getEmpId())
			return false;
		if (name == null) {
			if (other.getName() != null)
				return false;
		} else if (!name.equals(other.getName()))
			return false;
		return true;
	}
}
