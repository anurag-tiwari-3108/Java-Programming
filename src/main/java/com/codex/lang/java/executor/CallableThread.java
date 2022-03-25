package com.codex.lang.java.executor;

import java.util.concurrent.Callable;

public class CallableThread implements Callable<String> {

	private int count = 0;
	private String myName = "";
	private long timeStamp = 0;

	public CallableThread(int count, String myName, long timeStamp) {

		this.count = count;
		this.myName = myName;
		this.timeStamp = timeStamp;
	}

	@Override
	public String call() throws Exception {
		String futureString = "";

		for (int i = 0; i <= this.count; i++) {
			System.out.println(myName+ " Calling the thread method via callable statement for count="+ count + " and time=" + timeStamp);
			futureString=this.myName;
		}
		return futureString;
	}

}
