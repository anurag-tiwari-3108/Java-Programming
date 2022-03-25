package com.codex.lang.java.pc;

import java.util.ArrayList;

public class InnerClassessPCDemo {

	volatile static ArrayList<Integer> list = new ArrayList<Integer>();
	volatile static int ELEMENT = 100;
	volatile static int INDEX = 0;
	volatile static boolean ONE = Boolean.TRUE;
	volatile static boolean TWO = Boolean.FALSE;
	
	public static void main(String [] args){
		Thread th1 = new Thread(new Processor(1));
		Thread th2 = new Thread(new Processor(2));		
		th1.start();
		th2.start();		
	}
	
	
	public static class Processor implements Runnable{
		int threadId;
		public Processor(int threadId) {
			this.threadId = threadId;
		}
		
		@Override
		public void run() {
			try {
				processProducerConsumer();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		private void processProducerConsumer() throws InterruptedException {
			while(list.size() < 10){
			synchronized (list) {
				if (1 == threadId ) {
					if (!ONE) {
						list.wait();
					} else {
						System.out.println("Added Elememnt "+ELEMENT+" Into the list of size "+list.size());
						list.add(ELEMENT);
						ONE = false;
						TWO = true;
						list.notifyAll();
					}
				}
				if(2 == threadId){
					if(!TWO){
						list.wait();						
					}
					else {
						System.out.println("Got Element from list "+list.get(0));
						ONE = Boolean.TRUE;
						TWO = Boolean.FALSE;
						list.notifyAll();
					}
				}
			}
			ELEMENT++;
			INDEX++;
		}
	}
}
}