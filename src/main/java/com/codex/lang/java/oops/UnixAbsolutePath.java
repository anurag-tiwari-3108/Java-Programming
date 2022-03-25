package com.codex.lang.java.oops;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Input 1:
    A = "/home/"
Output 1:
    "/home"

Input 2:
    A = "/a/./b/../../c/"
Output 2:
    "/c"
 *
 */
public class UnixAbsolutePath {
	public static void main(String [] args) {
		System.out.println(simplifyPath("/home/./anutiwar/../../packet/"));
	}
	public static String simplifyPath(String A) {

		if (A == null || A.length() == 0) {
			return null;
		}

		A = (String) A.subSequence(1, A.length());
		
		String[] arr = A.split("[/]");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		Deque<String> stack = new LinkedList<String>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("..")) {
				if (!stack.isEmpty())
					stack.pop();
			} else if (arr[i].matches("[a-zA-Z]+")) {
				stack.push("/" + arr[i]);
			}
		}

		StringBuilder sb = new StringBuilder();
		if (stack.isEmpty())
			return "/";

		while (!stack.isEmpty()) {
			sb.append(stack.removeLast());
		}

		return sb.toString();

	}
}
