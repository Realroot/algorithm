package recursive;

import java.io.*;
import java.util.*;

public class B1992 {
	static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		int[][] arr = new int[N][N];

		for (int i = 0; i < N; i++) {
			String temp = br.readLine();
			for (int j = 0; j < N; j++) {
				arr[i][j] = temp.charAt(j) -'0';
			}
		}
		
		quadtree(N,arr);
	}
	
	static void quadtree(int n,int[][] arr) {
		int temp = arr[0][0];
		boolean check = false;
		
      
	   Loop1 :
	   for(int i=0;i<arr.length;i++) {
		   Loop2 :
		   for(int j=0;j<arr[0].length;j++) {
			   if(arr[i][j] != temp) {
				   check =true;
				   break Loop1;
			   }
		   }
	   }
		
       if(check) {		
    	   System.out.print("(");
			for(int i =0;i<2;i++) {
				for(int j=0;j<2;j++) {
					int[][] tempArr = new int[n/2][n/2];
					for(int ii=0;ii<n/2;ii++) {
						for(int jj = 0;jj<n/2;jj++) {
						  tempArr[ii][jj] = arr[i*n/2+ii][j*n/2+jj];
						}
					}
					quadtree(n/2,tempArr);
				}
			}
			System.out.print(")");
		}else {
			System.out.print(temp);
		}
		
      
	}
}
