package com.codex.lang.java.concurrency;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


/**
 * While iterating any collection with iterator if any other thread tries to do any changes
 * then the iterator throws Eception call ConcurrentModificationEception
 * 
 * ToAvoid this exxception we can:
 * 1) We can convert the list into array but this approch works only for small 
 * and medium size list for bigger this approch will create Performance issue
 * 
 * 2) We can lock the list with synchronized but it will the benefits of multithreading
 * 
 * 3) We can use ConcurrentHashMap or CopyOnWriteArrayListclasses -- > Best approch
 * 
 * 	You can use the iterator remove() function to remove the object from underlying collection object. 
 *	But in this case you can remove the same object and not any other object from the list.
 
 	@author Anurag
 */

public class ConcurrentModificationException {
	public static void main(String args[]){
        List<String> myList = new ArrayList<String>();
         
        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("5");
         
        Iterator<String> it = myList.iterator();
        while(it.hasNext()){
            String value = it.next();
            System.out.println("List Value:"+value);
            if(value.equals("3")) myList.remove(value);
        }
         
        Map<String,String> myMap = new HashMap<String,String>();
        myMap.put("1", "1");
        myMap.put("2", "2");
        myMap.put("3", "3");
 
        Iterator<String> it1 = myMap.keySet().iterator();
        while(it1.hasNext()){
            String key = it1.next();
            System.out.println("Map Value:"+myMap.get(key));
            if(key.equals("2")){
                myMap.put("1","4");
                //myMap.put("4", "4");
            }
        }
	}
}
