package com.codex.lang.java.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeComparableDemo {
	
	public static void main(String [] args) {
	    List<EmployeeComparable> empList = new ArrayList<EmployeeComparable>();

		EmployeeComparable emp1 = new EmployeeComparable(101, "Trajesh", "newyour", "district-1");
		EmployeeComparable emp2 = new EmployeeComparable(102, "Apaul", "ireland", "district-2");
		EmployeeComparable emp3 = new EmployeeComparable(103, "Bjohn", "norway", "district-3");
		EmployeeComparable emp4 = new EmployeeComparable(104, "Znitish", "london", "district-4");
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		
		Collections.sort(empList);
		
		for(EmployeeComparable empcomp : empList) {
			System.out.println("Emp Name : "+empcomp.getName());
		}
	}

}
