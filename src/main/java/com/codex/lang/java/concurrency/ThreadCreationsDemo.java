package com.codex.lang.java.concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * 1) Introduction
 * 2) Ways to define a thread(thread class and by implementing Runnable interface)
 * 3) Getting and setting names of Thread
 * 4) Thread Priority
 * 5) Methods to prevent Thread Execution(yield,join,sleep)
 * 6) Synchronzation
 * 7) Inter Thread Commucation 
 * 8) Deadlock(a lock without key)
 * 9) Demone Threads
 * 10)Multithreadin Enhancement(Lock,ReintrentLock,ThreadGroup,Threadloacl,ExecutorFramework etc)
 * 
 * @author ANRTIWARI
 *
 */
public class ThreadCreationsDemo {
	private static String cName = ThreadCreationsDemo.class.getName() + " :: ";

	public static void main(String [] args) {
		System.out.println(cName+"===========================================");
		System.out.println(cName+"Calling Producer/Consumer via wait/notify");
		System.out.println(cName+"===========================================");
		BlockingQueue<String> queue = new ArrayBlockingQueue(10);
		ThreadCreations thread  = new ThreadCreations(queue); 
		/**
		 * Creating child thread.
		 * Here main thread starts Child thread.
		 */
		thread.start(); 
	}
}
