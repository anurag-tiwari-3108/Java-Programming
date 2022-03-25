package com.codex.lang.java.exception;

public class InvalidAgeException extends Exception {

	private static final long serialVersionUID = 1997753363232807009L;


	public InvalidAgeException() {
	}

	public InvalidAgeException(String message) {
		super(message);
	}

	public InvalidAgeException(Throwable cause) {
		super(cause);
	}

	public InvalidAgeException(String message, Throwable cause) {
		super(message, cause);
	}

}
