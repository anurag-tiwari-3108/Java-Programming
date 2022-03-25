package com.codex.lang.java.basic;

public class Student {

	String name;
	int rollno;

	public static void getDetails(Student s) {
		s.name = "ankit";
		
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.name = "anurag";	
		getDetails(s);
		System.out.println(s.name);
	}
}
