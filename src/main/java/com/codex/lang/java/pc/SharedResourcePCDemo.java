package com.codex.lang.java.pc;


public class SharedResourcePCDemo {

	public static void main(String... args) throws InterruptedException {
		final SharedResourcePC shared = new SharedResourcePC();
		Thread th1 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					shared.produce();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		Thread th2 = new Thread(new Runnable() {

			@Override
			public void run() {
				try {
					shared.consume();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});

		th1.start();
		th2.start();

		th1.join();
		th2.join();

	}
}