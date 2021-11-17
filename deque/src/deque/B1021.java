package deque;

import java.io.*;
import java.util.*;

public class B1021 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		Deque<Integer> deque = new ArrayDeque<Integer>();
		for (int i = 1; i <= N; i++) {
			deque.offerLast(i);
		}
		int sum = 0;
		for (int i = 0; i < M; i++) {
			int number = sc.nextInt();
			Iterator iter = deque.iterator();
			int cnt = 0;
			while (iter.hasNext()) {
				if ((int) iter.next() == number) {
					break;
				} else {
					cnt++;
				}
			}
			if (cnt <=(int) deque.size() / 2) {
				while (number != deque.peekFirst()) {
					deque.offerLast(deque.pollFirst());
					sum++;
				}
			} else {
				while (number != deque.peekFirst()) {
					deque.offerFirst(deque.pollLast());
					sum++;
				}
			}
			deque.pollFirst();
		}
		System.out.println(sum);
	}
}
