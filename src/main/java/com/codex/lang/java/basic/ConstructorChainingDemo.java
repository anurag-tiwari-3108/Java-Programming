package com.codex.lang.java.basic;;

/**
 * The order follow superclass -->subclass. In case of constructor chaining always super class constructor called first
 * follow by subclass constructor.
 * @author anutiwar
 *
 */
public class ConstructorChainingDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ConstructorChainSub cons = new ConstructorChainSub();
		cons.display();
	}

}