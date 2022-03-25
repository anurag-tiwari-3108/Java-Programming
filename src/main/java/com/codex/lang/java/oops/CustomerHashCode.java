package com.codex.lang.java.oops;

public class CustomerHashCode {
	
	public static void main(String [] args) {
		Customer cust = new Customer("Anurag", 30, "New York");
		Customer cust1 = new Customer("Anurag", 30, "New York");
		Customer cust2 = new Customer("Anurag", 31, "New York");
		Customer cust3 = new Customer("AnuragT", 30, "New York");
		
		System.out.println(cust.equals(cust1));
		System.out.println(cust.equals(cust2));
		System.out.println(cust.equals(cust3));

	}

}
