package stack;

import java.io.*;
import java.util.*;

public class B3986 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.valueOf(st.nextToken());
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			Stack<Character> stack = new Stack<Character>();
			String s = br.readLine();
			stack.push(s.charAt(0));
			
			for (int j = 1; j < s.length(); j++) {
				char c = s.charAt(j);
				if(!stack.isEmpty()) {
					if(stack.peek() == c) {
						stack.pop();
						continue;
					}
				}
					stack.push(c);
			}
			if (stack.isEmpty()) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
