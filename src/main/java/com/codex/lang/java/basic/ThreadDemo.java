package com.codex.lang.java.basic;

public class ThreadDemo extends Thread{
	
	@Override
	public void run() {		
		System.out.println("Thread process from ThreadDeom'");
		super.run();
	}

}
