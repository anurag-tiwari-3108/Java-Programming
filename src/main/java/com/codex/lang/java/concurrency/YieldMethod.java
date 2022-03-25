package com.codex.lang.java.concurrency;

public class YieldMethod extends Thread{
	
	@Override
	public void run() {
		for(int j =0 ; j<= 10 ; j++){
			System.out.println(YieldMethod.class.getName()+" :: "+Thread.currentThread().getName());
			Thread.yield();
		}
		super.run();
	}
	

}
