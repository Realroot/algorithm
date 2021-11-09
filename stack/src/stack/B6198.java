package stack;

import java.util.Scanner;
import java.util.Stack;

public class B6198 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		
		for(int i=0;i<length;i++) {
		   int temp = sc.nextInt();
			stack.push(temp);
		}
		int sum =0;
		for(int i=0;i<length;i++) {
			for(int j=i+1;j<length;j++) {
				if(stack.get(i)<stack.get(j)) {
					break;
				}else {
					sum++;
				}
			}
		}
		System.out.println(sum);
	}
}
