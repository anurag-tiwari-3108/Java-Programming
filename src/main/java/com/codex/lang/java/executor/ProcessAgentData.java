package com.codex.lang.java.executor;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ProcessAgentData {
	
	int count = 1; 
	Map<String , String> aMap = null;
	public void processAgentData (String initiator){
		aMap = new HashMap<String, String>();
		aMap.put("initiator_"+count, initiator);
		count++;
		Iterator<String> itr = aMap.keySet().iterator();
		System.out.println("ProcessAgentData :: "
		+Thread.currentThread().getName() + " Value " +aMap.get(itr.next()) + " | Size " +aMap.size());
	}
}
