package com.codex.lang.java.oops;

import java.util.HashMap;

public class DataHiding {

	private static boolean validate(String userName, String password) {
		boolean flag = false;
		String internalPassword = getPassword(userName);
		if (internalPassword.equalsIgnoreCase(password)) {
			flag = true;
		} else {
			flag = false;
		}
		System.out.println("Flag = "+flag);
		return flag;
	}

	private static String getPassword(String user) {
		String password = null;
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Anurag", "111111");
		map.put("Atul", "222222222");
		map.put("rachit", "33333333");
		map.put("check", "55555555");

		password = map.get(user).toString();
		System.out.println("Returning password " + password);
		return password;

	}
	
	
	public static void main(String [] args){
		
		boolean check = validate("Anurag", "111111");
		if(check==false){
			System.out.println("Worng password");
		}
		else
			System.out.println("Right Password");
	}

}
