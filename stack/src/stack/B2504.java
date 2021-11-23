package stack;

import java.io.*;
import java.util.*;

public class B2504 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		Stack<Character> stack = new Stack<>();
   
		int sum = 0;
		int temp = 1;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			switch (c) {
			case  '(':
				stack.push(c);
				temp =temp *2;
				break;
			case '[':
				stack.push(c);
				temp =temp *3;
			case ')':
				if(stack.isEmpty()) {sum = 0;break;}
				if(stack.peek()  == '[') {sum =0; break;}
				if(str.charAt(i-1) == '(') {sum = sum+temp; break;}
			    stack.pop();
			    temp /=2 ;
			    break;
			case ']' :
				if(stack.isEmpty()) {sum = 0;break;}
				if(stack.peek()  == '(') {sum =0; break;}
				if(str.charAt(i-1) == '[') {sum = sum+temp; break;}
			    stack.pop();
			    temp /=3 ;
			    break;
			}
		}
		if(!stack.isEmpty()) sum =0;
		System.out.println(sum);
	}
}
