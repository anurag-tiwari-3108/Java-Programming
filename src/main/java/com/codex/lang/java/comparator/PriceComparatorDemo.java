package com.codex.lang.java.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PriceComparatorDemo {
	
	public static void main(String[] args) {
		Map<String, Integer> aMap = new HashMap<String, Integer>();
		
		aMap.put("Anurag-1", 10);
		aMap.put("Anurag-2", 20);
		aMap.put("Anurag-3", 20);
		aMap.put("Anurag-4", 40);
		aMap.put("Anurag-5", 50);
		aMap.put("Anurag-6", 60);
		aMap.put("Anurag-7", 70);
		aMap.put("Anurag-8", 80);
		
        Set<Entry<String, Integer>> set = aMap.entrySet();
        System.out.println("SET :: "+set);
        ArrayList<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        System.out.println("LIST :: "+list);		
		Collections.sort(list, new PriceComparator());

		System.out.println("Sorted Map :: ");
        for(Map.Entry<String, Integer> entry:list){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }

	}

}
