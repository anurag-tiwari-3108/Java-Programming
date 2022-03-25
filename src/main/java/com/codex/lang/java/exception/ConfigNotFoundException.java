package com.codex.lang.java.exception;

public class ConfigNotFoundException extends Exception {

	private static final long serialVersionUID = 1997753363232807009L;

	public ConfigNotFoundException() {
	}

	public ConfigNotFoundException(String message) {
		super(message);
	}

	public ConfigNotFoundException(Throwable cause) {
		super(cause);
	}

	public ConfigNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

}
