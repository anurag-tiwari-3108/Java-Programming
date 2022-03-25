package com.codex.lang.java.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashmapSorting {

	public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("java", 20);
        map.put("C++", 45);
        map.put("Java2Novice", 2);
        map.put("Unix", 67);
        map.put("MAC", 26);
        map.put("Why this kolavari", 93);
        Set<Entry<String, Integer>> set = map.entrySet();
        System.out.println("SET :: "+set);
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        System.out.println("LIST :: "+list);
        
        Collections.sort(list,new MapComparator());
        System.out.println("Sorted Map :: ");
        for(Map.Entry<String, Integer> entry:list){
            System.out.println(entry.getKey()+" = "+entry.getValue());
        }
    }
}