package com.codex.lang.java.map;

import java.util.*;
public class EmployeeDemo {

	public static String cName = "org.java.app.Map.EmployeeDemo :: ";
	public static void main(String [] args){
		Map<Employee, String> aMap  = new HashMap<Employee, String>();
		Employee emp1 = new Employee(101001, "Anurag", 10000000);
		Employee emp2 = new Employee(101002, "Anurag", 10000000);
		Employee emp3 = new Employee(101003, "Anurag", 10000000);
		Employee emp4 = new Employee(101004, "Anurag", 10000000);
		Employee emp5 = new Employee(101005, "Anurag", 10000000);

		System.out.println(cName+"Created 5 Emp Objects");
		try {
		aMap.put(emp1, "Working in BFSI emp1");
		Thread.currentThread().sleep(1000);		
		aMap.put(emp2, "Working in BFSI emp2");
		Thread.currentThread().sleep(1000);		
		aMap.put(emp3, "Working in BFSI emp3");
		Thread.currentThread().sleep(1000);		
		aMap.put(emp4, "Working in BFSI emp4");
		Thread.currentThread().sleep(1000);		
		aMap.put(emp5, "Working in BFSI emp5");
		Thread.currentThread().sleep(1000);
		
		System.out.println(cName+"Employee Data insertion into map is completed");

		Thread.currentThread().sleep(1000);
		System.out.println(aMap.get(emp1));
		Thread.currentThread().sleep(1000);
		System.out.println(aMap.get(emp2));
		Thread.currentThread().sleep(1000);
		System.out.println(aMap.get(emp3));
		Thread.currentThread().sleep(1000);
		System.out.println(aMap.get(emp4));
		Thread.currentThread().sleep(1000);
		System.out.println(aMap.get(emp5));
		Thread.currentThread().sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	
		
		
	}
}
