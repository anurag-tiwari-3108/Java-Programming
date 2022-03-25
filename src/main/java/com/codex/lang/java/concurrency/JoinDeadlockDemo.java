package com.codex.lang.java.concurrency;

public class JoinDeadlockDemo {
	
	public static void main(String ...args) throws InterruptedException{
	
		System.out.println("Calling Join method for deadlock ::  "+Thread.currentThread().getName());
		Thread.currentThread().join();		
	}

}
