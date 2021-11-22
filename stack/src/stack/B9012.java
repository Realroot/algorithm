package stack;

import java.io.*;
import java.util.*;

public class B9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.valueOf(st.nextToken());

		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			Stack<Character> stack = new Stack<>();
			for (int j = 0; j < str.length(); j++) {
				char c = str.charAt(j);
			    if(c =='(') {
			    	stack.push(c);
			    }else if(stack.empty() && c== ')') {
			    	stack.push('a');
			    	break;
			    }else {
			    	stack.pop();
			    }
			 
			}
			if(!stack.isEmpty()) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}
		}
	}
}
