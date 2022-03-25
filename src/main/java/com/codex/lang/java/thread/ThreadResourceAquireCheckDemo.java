package com.codex.lang.java.thread;

public class ThreadResourceAquireCheckDemo {
	public static void main(String[] args) throws InterruptedException {
		ThreadResourceAquireCheck th1 = new ThreadResourceAquireCheck();
		ThreadResourceAquireCheck th2 = new ThreadResourceAquireCheck();
		ThreadResourceAquireCheck th3 = new ThreadResourceAquireCheck();
		ThreadResourceAquireCheck th4 = new ThreadResourceAquireCheck();
		th1.start();
		th2.start();
		th3.start();
		th4.start();

	}
}

class ThreadResourceAquireCheck extends Thread {

	@Override
	public void run() {
		try {
			processThreadBasedMethod();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		super.run();
	}

	private void processThreadBasedMethod() throws InterruptedException {
				
		System.out.println("Current running thread is " + Thread.currentThread().getName());
		System.out.println("Current running thread is " + Thread.currentThread().getName());
		
		if(Thread.currentThread().getName() == "Thread-1" )
			Thread.currentThread().join();
		
		if(Thread.currentThread().getName() == "Thread-2" ){
			System.out.println("Sleeping thread-2");
			Thread.sleep(1000);
		}

		if(Thread.currentThread().getName() == "Thread-3" ){
			System.out.println("waiting thread-3");
				Thread.currentThread().wait();
		}
		
		System.out.println("Current running thread is  "+ Thread.currentThread().getName());
		System.out.println("Current running thread is  "+ Thread.currentThread().getName());
		System.out.println("Current running thread is  "+ Thread.currentThread().getName());
	}
}
