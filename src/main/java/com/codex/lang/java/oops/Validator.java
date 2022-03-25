package com.codex.lang.java.oops;

public interface Validator {

	void non_validate();

	default void validate() {
		System.out.println("Interface Default Validator");
	}

	static void static_validate() {
		System.out.println("Interface Static validator");
	}
}
