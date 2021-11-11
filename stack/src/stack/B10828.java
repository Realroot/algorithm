package stack;

import java.io.*;
import java.util.*;

public class B10828 {
	public static void main(String[] args) throws IOException {
		Stack<Integer> stack = new Stack<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int length = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < length; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			switch(st.nextToken()) {
			case "push": 
			 stack.push(Integer.parseInt(st.nextToken()));
			 break;
			 
			case "pop":
				if(stack.size()==0) {
					System.out.println(-1);
				}else {
				System.out.println(stack.pop());
				}
				break;
			
			case "size":
				System.out.println(stack.size());
				break;
				
			case "empty":
				if(stack.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
				break;
			case "top":
				if(stack.isEmpty()) {
					System.out.println(-1);
				}else {
					System.out.println(stack.peek());
				}
				break;
			}
		}
	}
}
