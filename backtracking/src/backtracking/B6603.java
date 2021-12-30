package backtracking;

import java.util.*;
import java.io.*;

public class B6603 {
	
	static int k;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();
	static int[] result;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
			
		while(true) {
			k = Integer.parseInt(st.nextToken());
			if(k == 0) break;
			
			arr = new int[k];
			result = new int[k];
			for(int i=0;i<k;i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			lotto(0,0);
			st = new StringTokenizer(br.readLine());
		}
		
	}

	static void lotto(int n,int x) {
		if(n==6) {
			for(int i=0;i<6;i++) {
				System.out.print(result[i]+" ");
			}
			System.out.println("");
			return ;
		}
		
		for(int i=x;i<k;i++) {
			result[n] = arr[i];
			lotto(n+1,i+1);
		}
		}
}
