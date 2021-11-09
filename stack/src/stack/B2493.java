package stack;

import java.util.Scanner;
import java.util.Stack;
public class B2493 {
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		for(int i=0;i<length;i++) {
			   int temp = sc.nextInt();
				stack.push(temp);
			}
		int[] arr;
		arr= new int[length];
		for(int i =length-1; i>=0;i--) {
			for(int j=i-1;j>=0;j--) {
				if(stack.get(i)<stack.get(j)) {
					arr[i] = j+1;
					break;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) { System.out.printf("%d ",arr[i]); }
	}
}
