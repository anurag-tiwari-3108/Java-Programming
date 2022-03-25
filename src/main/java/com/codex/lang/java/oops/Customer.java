package com.codex.lang.java.oops;

public class Customer {
	String name;
	int age;
	String city;

	public Customer(String name, int age, String city) {
		this.age = age;
		this.city = city;
		this.name = name;
	}
	@Override
	public int hashCode() {
		final int prime_number = 31;
		return prime_number * age;
	}
	
	@Override 
	public boolean equals(Object obj) {
		if (obj instanceof Customer) {
			Customer cust =(Customer)obj;
			if(name.equals(cust.name) && age == cust.age && city.equals(cust.city)) {
				return true;
			}
		}
		
		return false;
	}

}
