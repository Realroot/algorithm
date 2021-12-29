package backtracking;

import java.util.*;
import java.io.*;

public class B15650 {
	static int N, M;
	static int[] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		arr = new int[M];
				
		sequence(0,1);
	}

	static void sequence(int k,int n) {
		if(k==M) {
			for(int i =0;i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.println("");
			return ;
		}
		
		for(int i=n;i<=N;i++) {
				arr[k] =i;
				sequence(k+1,i+1);
		}
	}
}
