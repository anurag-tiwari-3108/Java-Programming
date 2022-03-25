package com.codex.lang.java.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableThreadDemo {
	
	
	public static void main(String [] args) {
	
		ExecutorService executor = Executors.newFixedThreadPool(2);
		
		Runnable taskOne = new WorkerThread("Thread 1", 2, 100);
		Runnable taskTwo = new WorkerThread("Thread 2", 2, 100);
		Runnable taskThree = new WorkerThread("Thread 3", 2, 100);

		executor.execute(taskOne);
		executor.execute(taskTwo);
		executor.execute(taskThree);

	}
}
