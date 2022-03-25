package com.codex.lang.java.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableTaskDemo {
	public static void main(String [] args){
		
		
		FutureTask[] randomFutureTask = new FutureTask[4];		
		Callable callable = new CallableTask();
		randomFutureTask[1] = new FutureTask(callable);
		Thread th = new Thread(randomFutureTask[1]);
		th.start();
		
	}

}
