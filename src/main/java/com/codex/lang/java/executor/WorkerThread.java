package com.codex.lang.java.executor;

public class WorkerThread implements Runnable{
	
	private String name;
	private int count;
	private  long timeSleep;

	public WorkerThread(String name, int newcount, int newtimeSleep) {
		this.name = name;
	    this.count = newcount;
	    this.timeSleep = newtimeSleep;
	}
	
	@Override
	public void run() {


		int sum = 0;
	    for (int i = 1; i <= this.count; i++) {
	    	sum = sum + i;
	    }
	    System.out.println(name + " thread has sum = " + sum + " and is going to sleep for " + timeSleep);
	    try {
			Thread.sleep(this.timeSleep);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	    
	    finally{
	    	System.out.println("Finally block");
	    }
	}
	

}