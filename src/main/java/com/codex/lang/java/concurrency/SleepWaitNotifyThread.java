package com.codex.lang.java.concurrency;

import java.util.ArrayList;
import java.util.Scanner;


public class SleepWaitNotifyThread implements Runnable {
	ArrayList namelist = null;
	public SleepWaitNotifyThread(ArrayList name) {
		this.namelist = name;
	}

	@Override
	public void run() {
		processSleepWaitNotify();
		
	}

	private void processSleepWaitNotify() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter your name");		
		String name  = scn.next();		
		try {
			System.out.println("Sleeping...50ms");
			Thread.sleep(50);
			printDetails(name);
			System.out.println("Current Thread before wait "+Thread.currentThread().getName());
			namelist.wait();
			namelist.notify();
			System.out.println("Current Thread after wait "+Thread.currentThread().getName());

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	private void printDetails(String name) {
		System.out.println("Hello "+name);		
	}
}
