package com.codex.lang.java.thread;

public class ListProducerConsumerImpl {
	public static void main(String[] args) throws InterruptedException {
		final ListProducerConsumer lpc = new ListProducerConsumer();
		Thread th1 = new Thread(new Runnable() {
			public void run() {
				try {
					lpc.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		Thread th2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					lpc.consume();
				} catch (InterruptedException e) {
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
