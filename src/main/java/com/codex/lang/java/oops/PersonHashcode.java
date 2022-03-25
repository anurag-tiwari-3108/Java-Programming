package com.codex.lang.java.oops;

public class PersonHashcode {
	
	public static void main(String [] args) {
		Person p1 = new Person("Anurag", "TIwari", "Sector-23", "Gurgaon");
		Person p2 = new Person("Anurag", "TIwari", "UK", "London");
		Person p3 = new Person("Anurag", "TIwari", "USA", "New York");
		Person p4 = new Person("Anurag", "TIwari", "Ireland", "Dublin");
		Person p5 = new Person("Anurag", "TIwari", "Sector-23", "Gurgaon");
		
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals(p4));
		System.out.println(p1.equals(p5));
	}

}
