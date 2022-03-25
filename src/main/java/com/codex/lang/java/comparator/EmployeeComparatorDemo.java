package com.codex.lang.java.comparator;

import java.util.ArrayList;
import java.util.Collections;

/**
 * --TODO -- Needs to add Comparator use and other application
 * 
 * @author ANRTIWARI
 *
 */
public class EmployeeComparatorDemo {

	public static void main(String[] args) {
		Employee e1 = new Employee(2, "zzzzzz");
		Employee e2 = new Employee(3, "vvvvv");
		Employee e3 = new Employee(1, "aaaaaa");

		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(e1);
		list.add(e2);
		list.add(e3);

		Collections.sort(list, new EmployeeComparator());
		System.out.println("Employee ID Based Sorting " + list.get(0).getEmpId() + " : " + list.get(1).getEmpId()
				+ " : " + list.get(2).getEmpId());

//		Collections.sort(list,new EmployeeComparator.NameComparator());
//		System.out.println("Employee Name Based Sorting "
//				+ "["+ list.get(0).getName()+ "," +list.get(1).getName()+","+list.get(2).getName()+"]");
//

	}

}
