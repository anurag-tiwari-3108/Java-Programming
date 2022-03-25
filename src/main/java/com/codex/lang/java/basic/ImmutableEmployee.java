package com.codex.lang.java.basic;

public class ImmutableEmployee {
	private String name;
	private String company;
	private double id;
	private Address address;

	public ImmutableEmployee(String name, String company, Address address) {

		this.address = address;
		this.company = company;
		this.name = name;
		this.id = Math.random();

	}

	public Address getAddress() {
		Address ads = new Address();
		return ads;
	}

	public String getCompany() {
		return company;
	}

	public double getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}

class Address {

}
