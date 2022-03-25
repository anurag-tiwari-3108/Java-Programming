package com.codex.lang.java.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerImpl {

	
	public static void main(String [] args) {
		BlockingQueue<Message> queue = new ArrayBlockingQueue<Message>(1);
		MessageProducer prod = new MessageProducer(queue);
		MessageConsumer con = new MessageConsumer(queue);
		new Thread(prod).start();
		new Thread(con).start();
		System.out.println("BlockingQueue Producer/Consumer Started");
		
	}
}
