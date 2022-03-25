package com.codex.lang.java.interview;


import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class FirstNonRepitativeString {
	public static void main(String[] args) {
		System.out.println(firstUniqueName2(new String[] { "Abbi", "Adeline","Abbi", "Adalia", "Abbi", "Adeline","Abbi", "Adalia", "Abbi","anurag" ,"Adeline","Abbi", "Adalia" }));
	}

	public static String firstUniqueName2(String[] names) {
		Arrays.sort(names);
		String a ="";
		for (int i = 0; i < names.length-1; i++) {
			System.out.print("  Values : "+names[i]);
			if (names[i] != names[i+1]){
				System.out.println("Chek "+names[i]);
				a =names[i];
			}
		}
		return a;
	}
	
	
	public static String firstUniqueName(String[] names) {
		Map<String, Integer> map = new TreeMap<>();
		String rsult = "";

		for (int i = 0; i < names.length; i++) {
			if (map.containsKey(names[i])) {
				int count = map.get(names[i]);
				map.put(names[i], count + 1);
			} else
				map.put(names[i], 1);

		}

		System.out.println(map);
		for (int i = 0; i < names.length; i++) {
			Integer count = map.get(names[i]);
			System.out.println("count :: " + count);
			if (count == 1) {
				rsult = names[i];
				break;
			}
		}
		return rsult;

	}

}
