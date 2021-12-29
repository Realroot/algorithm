package backtracking;

import java.util.*;
import java.io.*;

public class B15652 {
	static int N, M;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[M];
				
		sequence(0,1);
		System.out.println(sb);
	}

	static void sequence(int k,int n) {
		if(k==M) {
			for(int i =0;i<M;i++) {
				sb.append(arr[i]).append(' ');
			}
			sb.append('\n');
			return ;
		}
		
		for(int i=n;i<=N;i++) {
				arr[k] =i;
				sequence(k+1,i);
		}
	}
}
