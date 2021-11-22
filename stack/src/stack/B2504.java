package stack;

import java.io.*;
import java.util.*;

public class B2504 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Stack<Value> stack = new Stack<>();

		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == '(' || c == '[') {
				Value temp = new Value(c, 0);
				stack.push(temp);
			} else if (c == ')' && !stack.isEmpty() && stack.peek().c == '(') {
				if (stack.peek().value == 0) {
					sum = sum + 2;
				} else {
					sum = sum * 2;
				}
				stack.pop();
				if (!stack.isEmpty()) {
					stack.peek().value = 1;
				}
			} else if (c == ']' && !stack.isEmpty() && stack.peek().c == '[') {
				if (stack.peek().value == 0) {
					sum = sum + 3;
				} else {
					sum = sum * 3;
				}
				stack.pop();
				if (!stack.isEmpty()) {
					stack.peek().value = 1;
				}
			} else {
				sum = 0;
				break;
			}
		}
		System.out.println(sum);
	}
}

class Value {
	char c;
	int value;

	Value(char c, int value) {
		this.c = c;
		this.value = value;
	}
}