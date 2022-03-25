package com.codex.lang.java.lambda;

public class LambdaExpression implements FuncInterface{
	public static void main(String [] args) {
		System.out.println("Implementation using lambda expression");
		Runnable r = () ->{
			System.out.println("Inside the runnable method");
		};
		
		new Thread(r).start();
		FuncInterface func = () -> {
			System.out.println("Calling from lambda");
		};		
		func.sam();
	}

	@Override
	public void sam() {
		System.out.println("Sam Method Implementation ");
		
	}
}

