package com.codex.lang.java.thread;

import java.util.LinkedList;

public class ListProducerConsumer {
	LinkedList<Integer> list = new LinkedList<Integer>();
	int capacity = 2;

	public void produce() throws InterruptedException {
		int value = 0;
		while (true) {
			synchronized (list) {
				while (list.size() == capacity) {
					wait();
				}
				System.out.println("Produce the value "+value);
				list.add(value++);
				notify();
				Thread.sleep(10000);
			}
		}
	}

	public void consume() throws InterruptedException {
		while (true) {
			synchronized (list) {
				while (list.size() == 0) {
					wait();
				}
				System.out.println("Consume the value");
				list.removeFirst();
				notify();
				Thread.sleep(10000);
			}
		}
	}
}
