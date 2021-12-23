package recursive;

import java.io.*;
import java.util.*;

public class B1780 {
   
	static int cnt0 =0;
	static int cnt1 =0;
	static int cnt2 =0;
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
	   System.out.println(cnt0);
	   System.out.println(cnt1);
	   System.out.println(cnt2);
   }
	
	static void cut(int n,int[][] arr) {
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
			for(int i =0;i<3;i++) {
				for(int j=0;j<3;j++) {
					int[][] tempArr = new int[n/3][n/3];
					for(int ii=0;ii<n/3;ii++) {
						for(int jj = 0;jj<n/3;jj++) {
						  tempArr[ii][jj] = arr[i*n/3+ii][j*n/3+jj];
						}
					}
					cut(n/3,tempArr);
				}
			}
		}else {
			if(temp == -1) {
				cnt0++;
			}else if(temp == 0) {
				cnt1++;
			}else {
				cnt2++;
			}
		}
	   
	   
	}
}
