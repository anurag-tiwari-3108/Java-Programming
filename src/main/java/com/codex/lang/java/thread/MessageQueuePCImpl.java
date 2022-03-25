package com.codex.lang.java.thread;
/**
 * Producer Consumer using Blocking Queue 
 */
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class MessageQueuePCImpl {

	
	public static void main(String [] args) {
		BlockingQueue<MessageQueue> queue = new ArrayBlockingQueue<MessageQueue>(1);
		MessageQueueProducer prod = new MessageQueueProducer(queue);
		MessageQueueConsumer con = new MessageQueueConsumer(queue);
		new Thread(prod).start();
		new Thread(con).start();
		System.out.println("BlockingQueue Producer/Consumer Started");
		
	}
}
