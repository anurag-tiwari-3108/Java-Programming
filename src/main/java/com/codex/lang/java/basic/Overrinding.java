package com.codex.lang.java.basic;

/**
 * Static methods can not be overridden in Java. Though it is possible to have a static method with same signature in sub-class 
 * but in that case sub-class method hides the super class method rather than overriding it. 
 * There won't be any run time polymorphism in that case as static methods are bound during compile time; 
 * they are not resolved at run time.
 * 
 * Static methods can't be override
 * @author anutiwar
 *
 */
public class Overrinding extends Overloading{
	
	@Override
	public void display(int a, int b) {
		// TODO Auto-generated method stub
		super.display(a, b);
	}
	
	
	
 
}
