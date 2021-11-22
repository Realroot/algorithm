package stack;
import java.util.*;
import java.io.*;

public class B4949 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		for (int i = 0; i < s.length(); i++) {
			Stack<Character> stack = new Stack<Character>();
			if (s.charAt(i) == '[' || s.charAt(i)== '(') {
				char temp = s.charAt(i);
				stack.push(temp);
			} else if (s.charAt(i) == ']') {
				if (stack.size() != 0 && stack.peek() == '[') {
					stack.pop();
				} else {
					System.out.println("no");
					break;
				}
			} else if (s.charAt(i) == ')') {
				if (stack.size() != 0 && stack.peek() == '(') {
					stack.pop();
				} else {
					System.out.println("no");
					break;
				}
			} else if (s.charAt(i) == '.') {
				if (stack.size() == 0) {
					break;
				} else {
					System.out.println("no");
					break;
				}
			}
		}
	}
}
