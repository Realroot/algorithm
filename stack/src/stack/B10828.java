package stack;

import java.util.Scanner;
import java.util.Stack;

public class B10828 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		for (int i = 0; i < length; i++) {
			String temp = sc.nextLine();
			String[] behavior = temp.split(" ");
		    int index = stack.size()-1;
			switch(behavior[0]) {
			case "push": 
			 stack.push(Integer.valueOf(behavior[1]));
			 break;
			 
			case "pop":
				if(index+1==0) {
					System.out.println(-1);
				}else {
				System.out.println(stack.pop());
				}
				break;
			
			case "size":
				System.out.println(stack.size());
				break;
				
			case "empty":
				if(index+1 == 0) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
				break;
			case "top":
				System.out.println(stack.get(index));
				break;
			}
			for(int j=0;j<stack.size();j++) {
				System.out.println(stack.get(j));
			}
		}
	}
}
