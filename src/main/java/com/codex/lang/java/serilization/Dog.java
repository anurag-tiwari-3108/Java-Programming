package com.codex.lang.java.serilization;

import java.io.Serializable;

/**
 * 
 * @author ANRTIWARI
 *
 */
public class Dog extends Animal implements Serializable{
	private static final long serialVersionUID = -1046248280980452347L;
	public int age = 10;
	public String sirname = "check";
	public String name = "tomy";
	public static String type = "Doberman";
	public final String length = "10mm";
	public transient static String owner = "Ramlal";
	public transient final static String city = "Delhi";
	public transient String state = "state of dog";

	@Override
		public void prepareAnimal() {
			// TODO Auto-generated method stub
			super.prepareAnimal();
		}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getType() {
		return type;
	}
	public static void setType(String type) {
		Dog.type = type;
	}
	public static String getOwner() {
		return owner;
	}
	public static void setOwner(String owner) {
		Dog.owner = owner;
	}
	public String getState() {
		return state;
	}
	public String getLength() {
		return length;
	}
	public static String getCity() {
		return city;
	}
}
