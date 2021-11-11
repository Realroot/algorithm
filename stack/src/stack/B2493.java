package stack;

import java.io.*;
import java.util.*;

public class B2493 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int length = Integer.parseInt(br.readLine());
		StringTokenizer stz = new StringTokenizer(br.readLine());
		 Stack<Integer> stack = new Stack<Integer>();
		int[] arr;
		arr = new int[length + 1];

		for (int i = 1; i <= length; i++) {
			arr[i] = Integer.parseInt(stz.nextToken()); 
		}
		
		for(int i =length;i>0;i--) {
			while(!stack.isEmpty() && arr[stack.peek()]<arr[i]) {
				arr[stack.pop()] = i;
			}
			stack.push(i);
		}
		
		while(!stack.isEmpty()) {
			arr[stack.pop()] =0;
		}
		
		for(int i =1;i<=length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
