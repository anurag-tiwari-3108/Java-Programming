package com.codex.lang.java.serilization;

import java.io.Serializable;

public class ConstructorSerilization implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int check;
	
	
	public ConstructorSerilization() {
		check = 10;
		System.out.println("Calling Cons");
	}
	
	public void modifyValue(){
		check = 20;
	}
	
}
