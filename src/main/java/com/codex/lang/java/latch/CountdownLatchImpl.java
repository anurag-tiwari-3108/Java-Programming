package com.codex.lang.java.latch;

import java.util.concurrent.CountDownLatch;


public class CountdownLatchImpl extends Thread {
	private int delay;
	private String nameofEmployee;
	private CountDownLatch latch;

	public CountdownLatchImpl(int delay, CountDownLatch latch, String nameofEmployee) {
		System.out.println("CountdownLatchImpl :: "+Thread.currentThread().getName());
		this.setDelay(delay);
		this.latch = latch;
		this.nameofEmployee = nameofEmployee;
	}

	public void run() {
		System.out.println("CountdownLatchImpl :: Before Await method");
		latch.countDown();
		System.out.println("CountdownLatchImpl :: WorkerThread :: "+ Thread.currentThread().getName());

	}

	public String getEmpName() {
		return nameofEmployee;
	}

	public void setEmpName(String nameofEmployee) {
		this.nameofEmployee = nameofEmployee;
	}

	public int getDelay() {
		return delay;
	}

	public void setDelay(int delay) {
		this.delay = delay;
	}

}
