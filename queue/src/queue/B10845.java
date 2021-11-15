package queue;

import java.util.*;
import java.io.*;

public class B10845 {
  public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int length = Integer.parseInt(br.readLine());
		Queue<Integer> queue = new LinkedList<Integer>();
		int back = 0;
		for(int i =0;i<length;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			switch(st.nextToken()) {
			case "push":
				back = Integer.parseInt(st.nextToken());
				queue.add(back);
				break;
			case "pop":
				if(!queue.isEmpty()) {
					System.out.println(queue.poll());	
				}else {
					System.out.println(-1);
				}
				break;
			case "size":
				System.out.println(queue.size());
				break;
			case "empty":
				if(!queue.isEmpty()) {
					System.out.println(0);
				}else {
					System.out.println(1);
				}
				break;
			case "front":
				if(queue.size() != 0) {
					System.out.println(queue.peek());
				}else {
					System.out.println(-1);
				}
				break;
			case "back":
				if(queue.size() != 0) {
					System.out.println(back);
				}else {
					System.out.println(-1);
				}
				break;
			}
		}
  }
}
