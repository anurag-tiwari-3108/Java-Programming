package com.codex.lang.java.thread;

public class SequentialPrintingName {
	static Object moniter = new Object();
	static boolean ONE = true;
	static boolean TWO = false;
	static boolean THREE = false;
	static int COUNT = 0;

	static int indexOfTable2 = 1;
	static int indexOfTable3 = 1;
	static int indexOfTable4 = 1;

	public static void main(String[] args) {		
		Thread th1 = new Thread(new SequentialPrinting(1));
		Thread th2 = new Thread(new SequentialPrinting(2));
		Thread th3 = new Thread(new SequentialPrinting(3));

		th1.start();
		th2.start();
		th3.start();

	}

	static class SequentialPrinting implements Runnable {
		int threadId;

		public SequentialPrinting(int threadId) {
			this.threadId = threadId;
		}

		@Override
		public void run() {
			try {
				print();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		private void print() throws InterruptedException {
			while(COUNT < 15){
				synchronized(moniter){
					
					if(1==threadId){
						if(!ONE){
							moniter.wait();
						}
						else{
							System.out.println(Thread.currentThread().getName()+" :: is printing the First Name :: ALOK_"+COUNT);
							ONE=false;
							TWO=true;
							THREE=false;
							COUNT++;
							moniter.notifyAll();
						}
							
					}
					if(2==threadId){
						if(!TWO){
							moniter.wait();
						}
						else{
							System.out.println(Thread.currentThread().getName()+" :: is printing the Middle Name :: PRASAD_"+COUNT);
							ONE=false;
							TWO=false;
							THREE=true;
							COUNT++;
							moniter.notifyAll();
						}
							
					}
					if(3==threadId){
						if(!THREE){
							moniter.wait();
						}
						else{
							System.out.println(Thread.currentThread().getName()+" :: is printing the Last Name :: SHARMA_"+COUNT);
							ONE=true;
							TWO=false;
							THREE=false;
							COUNT++;
							moniter.notifyAll();
						}
							
					}

				}
			}
			
		}
	}
}
