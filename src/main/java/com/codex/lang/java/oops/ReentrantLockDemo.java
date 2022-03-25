package com.codex.lang.java.oops;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockDemo implements Runnable {
	String threadName;
	ReentrantLock lock;

	ReentrantLockDemo(String threadName, ReentrantLock lock) {
		this.lock = lock;
		this.threadName = threadName;
	}

	public void run() {
		lock.lock();
		try {
			System.out.println("Calling Sleep After Getting Lock");
			Thread.sleep(5000);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		finally {
			System.out.println("Unlocking Finally");
			lock.unlock();
		}
	}

}
