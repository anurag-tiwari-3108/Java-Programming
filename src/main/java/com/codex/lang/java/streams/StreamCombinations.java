package com.codex.lang.java.streams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamCombinations {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		// Printing Sum of Even OR Odd Numbers
		long evenNumbers = list.stream().filter(n -> n % 2 == 0).mapToInt((a) -> a).sum();
		System.out.println("Sum of even numbers" + evenNumbers);

		// Printing All The numbers where N is greater then 3
		list.stream().filter(n -> n > 3).forEach(System.out::println);

		// To Make Stream of any type of list
		Stream<String> strStream = Stream.of("Anurag  ", "Tiwari  ", "Google");
		Stream<Integer> intStream = Stream.of(1, 2, 3, 4);
		Stream<Double> doubleStream = Stream.of(1.1, 2.1, 3.1, 4.1);

		strStream.forEach(System.out::print);
		System.out.println();
		intStream.forEach(System.out::print);
		System.out.println();
		doubleStream.forEach(System.out::print);
		System.out.println();

		// Iterate a map
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "Anurag");
		map.put("2", "Tiwari");
		map.put("3", "Validate");

		System.out.println("Printing using foreach");
		map.forEach((K, V) -> System.out.println(K + " :: " + V));
		System.out.println("Printing using stream + foreach");
		map.entrySet().stream().forEach(System.out::println);

		List<String> nameList = Stream.of("amy", "nick", "margo", "desi").map(s -> s.toUpperCase())
				.collect(Collectors.toList());
		System.out.println("Names in upper case" + nameList);
		
		

	}
}
