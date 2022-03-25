package com.codex.lang.java.thread;

public class WaitNotifyPCImpl {
	static boolean consumed = true;
	static boolean produced = false;

	public static void main(String[] args) {
		WaitNotifyPCImpl moniter = new WaitNotifyPCImpl();
		Thread th1 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (moniter) {
					for (int i = 0; i < 5; i++) {
						while (!produced) {
							try {
								Thread.sleep(5000);
								moniter.wait();
								System.out.println("Producing With " + Thread.currentThread().getName());
								produced = Boolean.TRUE;
								consumed = Boolean.FALSE;
								moniter.notify();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
					}
				}
			}
		}, "Thread-1");
		Thread th2 = new Thread(new Runnable() {

			@Override
			public void run() {
				synchronized (moniter) {
					for (int i = 0; i < 5; i++) {
						while (!consumed) {
							try {
								moniter.wait();
								System.out.println("Consuming With " + Thread.currentThread().getName());
								consumed = Boolean.TRUE;
								produced = Boolean.FALSE;
								moniter.notify();
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}						
					}
				}
			}
		}, "Thread-2");

		th1.start();
		th2.start();
	}
}
