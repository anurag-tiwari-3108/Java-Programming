package com.codex.lang.java.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimpleThreadPool {

	public static void main(String [] args) {
		ExecutorService executor = Executors.newFixedThreadPool(5);
		for(int i=1 ;i < 6; i++) {
			WorkerThread worker = new WorkerThread(" "+i);
			executor.execute(worker);
		}
		
		executor.shutdown();
		while (!executor.isTerminated() || ! executor.isShutdown()) {
			executor.shutdown();
		}
		System.out.println("All Threads Are Finished");
	}
}
