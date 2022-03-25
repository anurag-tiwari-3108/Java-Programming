package com.codex.lang.java.pc;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * The factory implements 4 producer and single consumer. the consumer will not
 * start working until the shared resource is full
 * 
 * @author ANRTIWARI
 *
 */
public class ElementsPC {
	private static String cName = ElementsPC.class.getName() + " :: ";

	volatile static BlockingQueue<Integer> QUEUE = new ArrayBlockingQueue<Integer>(4);
	volatile static int CAPACITY = 1;
	volatile static int VALUE = 100;

	public void produce() throws InterruptedException {
		while (true) {
			synchronized (QUEUE) {
				System.out.println(cName + "Size Of Shared Queue "+ QUEUE.size());
				if (QUEUE.size() == CAPACITY) {
					System.out.println(cName+ "Producer Blocked : Resource is full");
					QUEUE.wait();
					Thread.sleep(1000);

				} else {
					System.out.println(cName + "Producer Produced.");
					QUEUE.add(VALUE++);
					QUEUE.notifyAll();
					Thread.sleep(1000);
				}
			}

		}
	}

	public void consume() throws InterruptedException {
		while (true) {
			synchronized (QUEUE) {
				if (QUEUE.size() == CAPACITY) {
					System.out.println(cName + "Consumer Consumes ");
					QUEUE.remove();
					QUEUE.notifyAll();
					Thread.sleep(1000);

				} else {
					System.out.println(cName + "Consumer Blocked : Resource having empty slot");
					QUEUE.wait();
					Thread.sleep(1000);
				}
			}
		}
	}
}
