package stack;

import java.util.Scanner;
import java.util.Stack;

public class B6198 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		int[] arr = new int[length];
		
		for(int i=0;i<length;i++) {
		  arr[i] = sc.nextInt();
		}
		
		int sum =0;
		for(int i=0;i<length;i++) {
		  
			while(!stack.empty()) {
				if(stack.peek() <= arr[i]) {
					stack.pop();
				}else {
					break;
				}
			}
			sum = sum + stack.size();
			stack.push(arr[i]);
		}
		 StringBuilder sb = new StringBuilder();
		 sb.append(sum);
		 System.out.println(sb);		 
	}
}
 