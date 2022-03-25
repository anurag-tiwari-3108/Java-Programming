package com.codex.lang.java.basic;


/**
 * Make your class final, so that no other classes can extend it.
 * Make all your fields final, so that they’re initialized only once inside the constructor and never modified afterward.
 * Don’t expose setter methods.
 * When exposing methods which modify the state of the class, you must always return a new instance of the class.
 * If the class holds a mutable object:
 * Inside the constructor, make sure to use a clone copy of the passed argument and never set your mutable 
 * field to the real instance passed through constructor, this is to prevent the clients who pass the object 
 * from modifying it afterwards. Make sure to always return a clone copy of the field and never return the real 
 * object instance.
 * 
 * @author ANRTIWARI
 *
 */
public class ImmutableClassDemo {
	
	public static void main(String [] args) {

	}
	
}

