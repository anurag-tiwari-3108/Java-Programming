package com.codex.lang.java.concurrency;

public class SequentialDisplayDemo {
	static Object monitor = new Object();
	static boolean one = true;
	static boolean two = false;
	static boolean three = false;
	static int count =1;
	static int tableOfTwo =2;
	static int tableIndex = 1;

	public static void main(String[] args) {
		Thread th1 = new Thread(new SequentialPrintImpl(1));
		Thread th2 = new Thread(new SequentialPrintImpl(2));
		Thread th3 = new Thread(new SequentialPrintImpl(3));
		
		th1.start();
		th2.start();
		th3.start();

	}

	static class SequentialPrintImpl implements Runnable{
		int threadId;
		public SequentialPrintImpl(int threadId) {
			this.threadId = threadId;
		}
		
		@Override
		public void run(){
			try {
				print();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		private void print() throws InterruptedException {
			while (count < 30) {
			synchronized (monitor) {
				if (1 == threadId) {
					if (!one) {
						monitor.wait();
					} else {
						System.out.println("Thread-" + threadId + " "+count+" Table of two "+tableOfTwo*tableIndex);
						one = false;
						two = true;
						three = false;
						monitor.notifyAll();
						count++;
						tableIndex++;
					}
				}
				
				if(2 == threadId){
					if(!two){
						monitor.wait();
					}
					else {
//						System.out.println("Thread-" + threadId+ " "+count);
						one = false;
						two = false;
						three = true;
						monitor.notifyAll();
						count++;
					}
				}
				
				if(3 == threadId){
					if(!three){
						monitor.wait();						
					}
					else {
//						System.out.println("Thread-"+threadId+ " "+count);
						one = true;
						two = false;
						three = false;
						monitor.notifyAll();
						count++;
					}
				}
			}

		}
	}
}
}