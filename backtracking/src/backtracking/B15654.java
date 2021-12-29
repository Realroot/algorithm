package backtracking;

import java.util.*;
import java.io.*;

public class B15654 {
	static int N, M;
	static int[] arr;
	static int[] result;
	static StringBuilder sb = new StringBuilder();
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N];
		result = new int[M];
		visited = new boolean[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		
		sequence(0,1);
		System.out.println(sb);
	}

	static void sequence(int k,int n) {
		if(k==M) {
			for(int i =0;i<M;i++) {
				sb.append(result[i]).append(' ');
			}
			sb.append('\n');
			return ;
		}
		
		for(int i=0;i<N;i++) {
			if(!visited[i]) {
				result[k] = arr[i];
				visited[i] = true;
				sequence(k+1,i+1);
				visited[i] = false;
			}
		}
	}
}
