package com.codex.lang.java.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeComparatorImpl {
	
	public static void main(String [] args) {
	    List<Employee> empList = new ArrayList<Employee>();

	    Employee emp1 = new Employee(110, "Trajesh", "newyour", "district-1");
	    Employee emp2 = new Employee(11, "Apaul", "ireland", "district-2");
	    Employee emp3 = new Employee(14, "Bjohn", "norway", "district-3");
	    Employee emp4 = new Employee(15, "Znitish", "london", "district-4");
	    empList.add(emp1);
	    empList.add(emp2);
	    empList.add(emp3);
	    empList.add(emp4);
		Collections.sort(empList, new EmployeeComparator());
		
		for(Employee empcomp : empList) {
			System.out.println("Emp Name : "+empcomp.getEmpId());
		}
	}

}
