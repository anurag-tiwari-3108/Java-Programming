package com.codex.lang.java.serilization;

import java.io.Serializable;

public class ParentSerilizationImpl extends ParentSerilization implements Serializable {

	String name;
	String type;

	public ParentSerilizationImpl() {
		name = "Anurag Tiwari";
		type = "Cashin";
	}
}
