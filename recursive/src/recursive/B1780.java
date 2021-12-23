package recursive;

import java.io.*;
import java.util.*;

public class B1780 {
   
	
	public static  void main(String[] args) throws IOException{
	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   
	   int N = Integer.parseInt(st.nextToken());
	   int[][] arr = new int[N][N];
	   
	   for(int i =0;i<N;i++) {
		   st = new StringTokenizer(br.readLine());
		   for(int j =0;j<N;j++) {
			  arr[i][j] = Integer.parseInt(st.nextToken()); 
		   }
	   }
	   
	   cut(N,arr);
   }
	
	static int cut(int n,int[][] arr) {
		
		return 1;
	}
	
}
