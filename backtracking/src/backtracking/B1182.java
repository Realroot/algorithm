package backtracking;

import java.util.*;
import java.io.*;

public class B1182 {
	static int N, S,cnt;
	static int[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		arr = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i =0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		subsequence(0,0);
		if(S == 0) cnt--;
		
		System.out.println(cnt);
	}

	static void subsequence(int k,int j) {
		if(k ==N ) {
			if(j ==S)cnt++;
			return;
		}
		subsequence(k+1, j);
		subsequence(k+1, j+arr[k]);
	   	}
}
