package com.codex.lang.java.immutable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map.Entry;


final public class ImutableClassWithMutablePrimitiveObject {
	
	
	private final Integer immutableInteger ;
	private final String immutableString; 
	private final Date mutabledate ;
	private final HashMap<String, String> mutableHashmap ;
		
	public ImutableClassWithMutablePrimitiveObject(Integer immutabbleInt, String immutableString, 
			Date mutableDate, HashMap<String, String> mutableMap) {
		this.immutableInteger = immutabbleInt;
		this.immutableString = immutableString;
		this.mutabledate = new Date(mutableDate.getTime());
		this.mutableHashmap = new HashMap<String, String>();
		
		for(Entry<String, String> entry : mutableMap.entrySet()){
			this.mutableHashmap.put(entry.getKey(), entry.getValue());
		}
	}

	public Integer getImmutableInteger() {
		return immutableInteger;
	}


	public String getImmutableString() {
		return immutableString;
	}


	public Date getMutabledate() {
		return mutabledate;
	}


	@SuppressWarnings("unchecked")
	public HashMap<String, String> getMutableHashmap() {
		return (HashMap<String, String>) (mutableHashmap.clone());
	}
	
	
	
}
