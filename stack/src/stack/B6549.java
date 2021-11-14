package stack;

import java.util.*;
import java.io.*;

public class B6549 {
  public static void main(String[] args) throws IOException {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  StringTokenizer st;
	  
	  while(true) {
		st=new StringTokenizer(br.readLine());  
		int N = Integer.parseInt(st.nextToken());
		if(N ==0) break;
		
		Stack<Integer> stack = new Stack<Integer>();
		int[] height = new int[N];
		long max = 0;
		
		for(int i=0;i<N;i++) {
			height[i] = Integer.parseInt(st.nextToken());
			while(!stack.isEmpty() &&  height[i] < height[stack.peek()]) {
				int temp =stack.pop();
				int result = stack.isEmpty() ? i : i-stack.peek()-1;
				max = Math.max(max, (long)result*height[temp]);
			}
			stack.push(i);
		}
		while(!stack.isEmpty()) {
			int temp = stack.pop();
			int result = stack.isEmpty()? N:N-stack.peek()-1;
			max = Math.max(max, (long)result*height[temp]);
		}
		System.out.println(max);
	  }  
  }
}
