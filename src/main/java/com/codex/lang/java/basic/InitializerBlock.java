package com.codex.lang.java.basic;
/**
 * 
 * InitializerBlock  always executed first follow by constructor and after that the called methods.
 * The Java compiler copies initializer blocks into every constructor. 
 * Therefore, this approach can be used to share a block of code between multiple constructors. 
 * If you have some common code that you want to be executed regardless of which constructor is used, 
 * that code can be put in an initializer block in Java.
 * 
 * @author anutiwar
 *
 */
public class InitializerBlock {

	public InitializerBlock() {
		System.out.println("Constructor.. !!");
	}
	{
		System.out.println("Initializer block");
	}
	private void display() {
		System.out.println("Display method for testing");
	}

	public static void main(String[] args) {
		System.out.println("Going to create the object");
		InitializerBlock block = new InitializerBlock();
		System.out.println("Object Created ..!!");
		block.display();
	}
}
