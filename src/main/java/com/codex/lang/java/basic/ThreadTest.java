package com.codex.lang.java.basic;

public class ThreadTest {
	
	public static void main(String[] args) {		
		Thread th1 = new Thread(new RunnableTest());
		th1.start();
		
		ThreadDemo th2 = new ThreadDemo();
		th2.start();
	}

}
