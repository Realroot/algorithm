package backtracking;

import java.util.*;
import java.io.*;

public class B15651 {
	static int N, M;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[M];
				
		sequence(0);
		System.out.println(sb);
	}

	static void sequence(int k) {
		if(k==M) {
			for(int i =0;i<M;i++) {
				sb.append(arr[i]).append(' ');
			}
			sb.append('\n');
			return ;
		}
		
		for(int i=1;i<=N;i++) {
				arr[k] =i;
				sequence(k+1);
		}
	}
}
