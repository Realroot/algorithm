package queue;

import java.io.*;
import java.util.*;

public class B2164 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<Integer>();
		
		for(int i =1; i<=N;i++) {
			queue.add(i);
		}
		
		while(queue.size()>1) {
			queue.poll();
			queue.add(queue.poll());
		}
		
		System.out.println(queue.peek());
	}
}