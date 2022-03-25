package com.codex.lang.java.serilization;

public class Animal {
	public static String walk;
	public static String eat;
	public static String getWalk() {
		return walk;
	}
	public static void setWalk(String walk) {
		Animal.walk = walk;
	}
	public static String getEat() {
		return eat;
	}
	public static void setEat(String eat) {
		Animal.eat = eat;
	}
	
	public void prepareAnimal(){
		System.out.println("Calling Animal Method");
	}

}
