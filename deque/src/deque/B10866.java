package deque;

import java.io.*;
import java.util.*;

public class B10866 {
 public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int length = Integer.parseInt(br.readLine());
		Deque<Integer> deque = new ArrayDeque<Integer>();
		for(int i=0;i<length;i++) {
			st = new StringTokenizer(br.readLine(), " ");
			switch(st.nextToken()) {
			case "push_front":
				deque.offerFirst(Integer.parseInt(st.nextToken()));
				break;
			case "push_back":
				deque.offerLast(Integer.parseInt(st.nextToken()));
				break;
			case "pop_front":
				if(deque.size() != 0) {
					System.out.println(deque.pollFirst());
				}else {
					System.out.println(-1);
				}
				break;
			case "pop_back":
				if(deque.size() != 0) {
					System.out.println(deque.pollLast());
				}else {
					System.out.println(-1);
				}
				break;
			case "size":
				System.out.println(deque.size());
				break;
			case "empty":
				if(deque.isEmpty()) {
					System.out.println(1);
				}else {
					System.out.println(0);
				}
				break;
			case "front":
				if(deque.size() != 0) {
					System.out.println(deque.peekFirst());
				}else {
					System.out.println(-1);
				}
				break;
			case "back":
				if(deque.size() != 0) {
					System.out.println(deque.peekLast());
				}else {
					System.out.println(-1);
				}
				break;
			}
		}
 }
}
