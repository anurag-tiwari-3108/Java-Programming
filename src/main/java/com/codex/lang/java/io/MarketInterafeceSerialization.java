package com.codex.lang.java.io;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

class SerializationSampleTest implements Serializable {
	private static final String className = "SerializationSampleTest :: ";
	private static final long serialVersionUID = 4427636358385270765L;

	private void readObject(ObjectInputStream inputStream) throws IOException,ClassNotFoundException {
		inputStream.defaultReadObject();
		generateThumbnail();
	}

	private void generateThumbnail() {
		
		System.out.println(className+ "Implementing Serialization");
	}
}
