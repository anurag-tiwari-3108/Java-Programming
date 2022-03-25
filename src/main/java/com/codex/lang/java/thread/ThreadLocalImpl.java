package com.codex.lang.java.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class ThreadLocalImpl {
	// Atomic integer containing the next thread ID to be assigned
	private static final AtomicInteger nextId = new AtomicInteger(0);

	// Thread local variable containing each thread's ID
	private static final ThreadLocal<Integer> threadId = ThreadLocal.<Integer>withInitial(() -> {
		return nextId.getAndIncrement();
	});

	// Returns the current thread's unique ID, assigning it if necessary
	public static int get() {
		return threadId.get();
	}
}

// In this class thread's run method is executed
class MyClass implements Runnable {
	@Override
	public void run() {
		System.out.println("Thread " + Thread.currentThread().getName() + " Value - " + ThreadLocalImpl.get());
	}
}

class ThreadLocalDemo {
	public static void main(String[] args) {
		MyClass mc1 = new MyClass();
		Thread thread1 = new Thread(mc1, "Thread-1");
		Thread thread2 = new Thread(mc1, "Thread-2");
		Thread thread3 = new Thread(mc1, "Thread-3");
		thread1.start();
		thread2.start();
		thread3.start();
	}
}