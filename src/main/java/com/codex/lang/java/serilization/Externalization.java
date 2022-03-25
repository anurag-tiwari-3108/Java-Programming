package com.codex.lang.java.serilization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Date;

/**
 * In Externalization developer has all the responsibility for serialize jvm does not care about the 
 * Serialization. 
 * 
 * With Externalization we can even serialize some param of class also and even we can serialize parent class
 * but not the child class
 * 
 * For Externalization we need to implements the class with Externalizable interface.
 * 
 * The prob with Serialization we need to serialize class hierarchy which can cause memory issue or
 * performance issue. there can be some case where we wanted to serilize a few params not the whole object
 * so for that we have Externalization 
 * 
 * In readExternal method JVM call the object and add externalize params/data/object into it. For for this
 * the object should have public no-arg constructor. If we dont provide the no-arg constructor then it will
 * throw exception InvalidClassException();.
 * 
 * This no-arg constructor will call @ time of externalization.
 * 
 * @author ANRTIWARI
 *
 */
public class Externalization implements Externalizable {
	public static final long serialVersionUID = 1234L;

	// attributes
	private int code;
	private String name;
	private String password;
	private int socialSecurityNumber;
	
	public Externalization(int code, String name, String pass, int secnumber) {		
		this.name = name;
		this.code = code;
		this.socialSecurityNumber = secnumber;
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException,
			ClassNotFoundException {
		this.code = in.readInt();
		this.name = (String) in.readObject();
		this.password = (String) in.readObject();
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(code);
		out.writeObject(name);
		out.writeObject("");
	}

}
