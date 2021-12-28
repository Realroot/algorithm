package backtracking;

import java.util.*;
import java.io.*;

public class B15649 {
	static int N, M;
	static int[] arr;
	static boolean[] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		visited = new boolean[N+1];
		arr = new int[M];
				
		sequence(0);
	}

	static void sequence(int k) {
		if(k==M) {
			for(int i =0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println("");
			return ;
		}
		
		for(int i=1;i<=N;i++) {
			if(!visited[i]) {
				arr[k] =i;
				visited[i] = true;
				sequence(k+1);
				visited[i] = false;
			}
		}
	}
}
