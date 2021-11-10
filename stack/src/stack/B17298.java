package stack;

import java.util.Scanner;
import java.util.Stack;

public class B17298 {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   Stack<Integer> stack = new Stack<Integer>();
	   int length = sc.nextInt();
	   int[] arr = new int[length];
 
	   for(int i =0;i<length;i++) {
		   arr[i] = sc.nextInt();
	   }
	  
	   for(int i=0;i<length;i++) {
		   
		   while(!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
				arr[stack.pop()] = arr[i];
			}
			 
		 stack.push(i);
	   }
	   int size = stack.size();
	   for(int i =0; i<size;i++) {
		   arr[stack.pop()]= -1;
	   }
	   
	   StringBuilder sb = new StringBuilder();
		for(int i = 0; i < length; i++) {
			sb.append(arr[i]).append(' ');
		}
		System.out.println(sb);
	}
}
