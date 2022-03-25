package com.codex.lang.java.oops;

public class Person {
	String fname;
	String lname;
	String address, city;

	public Person(String fname, String lname, String address, String city) {
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.city = city;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			Person per = (Person) obj;
			if (fname.equals(per.fname) && lname.equals(per.lname) && city.equals(per.city)
					&& address.equals(per.address)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int hashCode() {
		int hashcode =Math.abs( ( (31* city.length() + lname.length()*fname.length())/17) *192816 );
		System.out.println("Hashcode for "+lname+" :: "+city+" Would be "+hashcode);
		return hashcode;
	}
}
