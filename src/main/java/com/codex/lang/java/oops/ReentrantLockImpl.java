package com.codex.lang.java.oops;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockImpl {
	public static void main(String [] args) {
		ReentrantLock lock = new ReentrantLock();
		Thread th1 = new Thread(new ReentrantLockDemo("Thread-1", lock));
		Thread th2 = new Thread(new ReentrantLockDemo("Thread-1", lock));
		th1.start();
		th2.start();
		
	}

}
