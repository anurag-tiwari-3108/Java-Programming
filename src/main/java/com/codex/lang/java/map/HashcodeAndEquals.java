package com.codex.lang.java.map;

public class HashcodeAndEquals {
	EmployeeCustom emp_1 = new EmployeeCustom(1, "Emp-1");
	EmployeeCustom emp_2 = new EmployeeCustom(2, "Emp-2");
	EmployeeCustom emp_3 = new EmployeeCustom(3, "Emp-3");
	EmployeeCustom emp_4 = new EmployeeCustom(4, "Emp-4");
}

class EmployeeCustom {
	int empId;
	String name;

	public EmployeeCustom(int empid, String name) {
		this.empId = empid;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return super.hashCode() * this.empId;
	}

	@Override
	public boolean equals(Object obj) {

		return super.equals(obj);
	}
}