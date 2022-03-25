package com.codex.lang.java.basic;

class A {
	A() {
		System.out.println("In class A's constructor");
	}
}

class B extends A {
	B() {
		System.out.println("In class B's constructor");
	}
}

class C extends B {
	C() {
		super();
		System.out.println("In class C's constructor");
	}
}

public class ConstrChainingDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		C c = new C();

	}

}