package stack;

import java.util.Scanner;
import java.util.ArrayList;

public class B10773 {
	public static void main(String[] args) {
		ArrayList<Integer> stack = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		for(int i =0;i<length;i++) {
			int temp = sc.nextInt();
			if(temp ==0) {
				stack.remove(stack.size()-1);
			}else {
				stack.add(temp);
			}
		}
		int sum =0;
		for(int i =0;i<stack.size();i++) {
			sum = sum + stack.get(i);
		}
		System.out.println(sum);
	}
}
