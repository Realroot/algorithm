package stack;

import java.io.*;
import java.util.*;

public class B3986 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		String temp = sc.nextLine();
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			Stack<Character> stack = new Stack<Character>();
			String s = sc.nextLine();
			cnt++;
			for (int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);
			    if(stack.isEmpty()) {
			    	stack.push(c);
			    }else if (stack.peek() == c) {
			    	stack.pop();
			    }else if(stack.peek() != c) {
			    	cnt--;
			    	
			    }
			}
			if(!stack.isEmpty()) {
				cnt--;
			}
		}
		System.out.println(cnt);
	}
}
