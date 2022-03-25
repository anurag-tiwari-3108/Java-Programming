package com.codex.lang.java.thread;

public class MessageQueue {
	public String msg;

	public MessageQueue(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return this.msg;
	}
	
	public void setMsg(String str) {
        this.msg=str;
    }

}
