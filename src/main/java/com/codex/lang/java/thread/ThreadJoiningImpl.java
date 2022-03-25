package com.codex.lang.java.thread;

public class ThreadJoiningImpl {
	public static void main(String[] args) {
		ThreadJoining t1 = new ThreadJoining();
		ThreadJoining t2 = new ThreadJoining();
		ThreadJoining t3 = new ThreadJoining();

		
		t1.start();
		System.out.println("Current Thread : " + Thread.currentThread().getName());
		try {
			System.out.println("Calling Join");
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Current Thread : " + Thread.currentThread().getName());
		t2.start();
		System.out.println("Current Thread : " + Thread.currentThread().getName());
		try {
			System.out.println("Calling Join");
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
