package com.codex.lang.java.thread;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.Thread.State;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WritingThreadStatus{
	
	public static void main (String [] args){
		Thread[] aThread = new Thread [10];
		Thread.State aStatus[]=new Thread.State[10];

		for (int i = 0; i < 10; i++) {
			aThread[i] = new Thread(new PrintingThreadInLogs(i));
			if ((i % 2) == 0) {
				aThread[i].setPriority(Thread.MAX_PRIORITY);
			} else {
				aThread[i].setPriority(Thread.MIN_PRIORITY);
			}
			aThread[i].setName("Thread " + i);
		}
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MMM-dd");
		Date date = new Date();
		String formatedDate = dateFormat.format(date);
		System.out.println(formatedDate); //2014/08/06 15:59:48
		
		FileWriter file = null;
		try {
			file = new FileWriter("C:\\Users\\Anurag\\thread_log_"+formatedDate+".log");
		} catch (IOException e) {
			e.printStackTrace();
		}
		PrintWriter pw = new PrintWriter(file);
		for (int i = 0; i < 10; i++) {
			pw.println("Main : Status of Thread " + i + " : "+ aThread[i].getState());
			aStatus[i] = aThread[i].getState();
		}
		
		for (int i = 0; i < 10; i++) {
			aThread[i].start();
		}
		
		boolean finish = false;
		while (!finish) {
			for (int i = 0; i < 10; i++) {
				if (aThread[i].getState() != aStatus[i]) {
					
					writeThreadInfo(pw, aThread[i], aStatus[i]);
					aStatus[i] = aThread[i].getState();
				}
			}
			finish = true;
			for (int i = 0; i < 10; i++) {
				finish = finish && (aThread[i].getState() == State.TERMINATED);
			}
		}
	}

	private static void writeThreadInfo(PrintWriter pw, Thread thread,State state) {

		pw.printf("Main : Id %d - %s\n",thread.getId(),thread.getName());
		pw.printf("Main : Priority: %d\n",thread.getPriority());
		pw.printf("Main : Old State: %s\n",state);
		pw.printf("Main : New State: %s\n",thread.getState());
		pw.printf("Main : ************************************\n");

	}
}
