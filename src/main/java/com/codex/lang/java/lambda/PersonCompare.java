package com.codex.lang.java.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonCompare {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("AT");
		Person p2 = new Person();
		p2.setName("ZT");
		List<Person> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		Collections.sort(list, (Person a, Person b) -> a.getName().compareTo(b.getName()));
		list.forEach((N) -> System.out.println(N.getName()));

	}

}
