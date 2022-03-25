package com.codex.lang.java.oops;

import java.util.Stack;

public class RedundantBraces {

	public static void main(String[] args) {
		System.out.println("Is RedundantBraces : " + redundantBraces("((a+b))"));
	}

	public static boolean redundantBraces(String exp) {
		Stack<Character> stack = new Stack<>();
		for (char ch : exp.toCharArray()) {

			if (ch == ')') {
				char top = stack.peek();
				stack.pop();
				boolean flag = true;
				while (top != '(') {
					if (ch == '+' || ch == '/' || ch == '-' || ch == '*') {
						flag = false;
					}
					top = stack.peek();
					stack.pop();
				}
				if (flag == true) {
					return true;
				}

				else {
					stack.pop();
				}
			}
		}
		return false;

	}

}
