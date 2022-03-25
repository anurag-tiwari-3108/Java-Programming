package com.codex.lang.java.comparator;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	public int compare(Employee emp1, Employee emp2) {

		return emp1.getEmpId() > emp2.getEmpId() ? 1 : -1;
	}

}
