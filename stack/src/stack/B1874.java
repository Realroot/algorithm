package stack;

import java.util.Scanner;
import java.util.Stack;

public class B1874 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();	
		Stack<Integer> stack = new Stack<Integer>();
		int length = sc.nextInt();
		int start = 0;
	
		for(int i=0;i<length;i++) {
			int value = sc.nextInt();
			if(value > start) {
				for(int j = start + 1; j <= value; j++) {
					stack.push(j);
					sb.append('+').append('\n');
				}
				start = value; 			
			} 
			else if(stack.peek() != value) {
				System.out.println("NO");
				return;		 
			}			
			stack.pop();
			sb.append('-').append('\n');			
		}
		
		System.out.println(sb);
	}
}
