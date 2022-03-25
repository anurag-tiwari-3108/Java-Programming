package com.codex.lang.java.concurrency;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * To hault the execution of current thread and give priority to another threads.
 * which is having more or equal priority 
 * @author ANRTIWARI
 *
 */
public class YieldMethodDemo {

	private static String cName = YieldMethodDemo.class.getName() + " :: ";
	volatile static BlockingQueue<Integer> QUEUE = new ArrayBlockingQueue<Integer>(4);
	volatile static int CAPACITY = 4;
	volatile static int VALUE = 100;
	
	
	public static void main(String[] args) {
		System.out.println(cName + "Calling Yield Implemented PC");
		
		YieldMethod th1  = new YieldMethod();
		th1.start();
		Thread.currentThread().yield();
		for(int i = 1 ; i <=10 ; i++){
			System.out.println(cName+Thread.currentThread().getName());
		}

		
	}
}
