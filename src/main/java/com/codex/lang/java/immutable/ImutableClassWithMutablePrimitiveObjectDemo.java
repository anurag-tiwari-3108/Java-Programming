package com.codex.lang.java.immutable;

import java.util.Date;
import java.util.HashMap;

public class ImutableClassWithMutablePrimitiveObjectDemo {
	
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("100", "Anurag");
		map.put("101", "tiwari");		
		Date date = new Date();
		ImutableClassWithMutablePrimitiveObject immune = new ImutableClassWithMutablePrimitiveObject(10, "Anurag Tiwari", date ,map );
		System.out.println("BEFORE :: "+immune.getImmutableString()+" | "+immune.getMutabledate()+" | "+immune.getMutableHashmap().keySet());
		immune.getMutableHashmap().put("102", "changes");
		System.out.println("AFTER  :: "+immune.getImmutableString()+" | "+immune.getMutabledate()+" | "+immune.getMutableHashmap().keySet());
	}

}
