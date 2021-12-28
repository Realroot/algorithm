package backtracking;

import java.util.Scanner;

public class B9663 {
	 static int N,cnt=0;
	 static boolean[] visited1,visited2,visited3;
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   N = sc.nextInt();
	   visited1 = new boolean[N+1];
	   visited2 = new boolean[N*2];
	   visited3 = new boolean[N*2];
	   queen(0);
	   System.out.println(cnt);
   }
   
   static void queen(int k) {
	   if(k==N) {
		   cnt++;
		   return;
	   }
	   
	   for(int i=0;i<N;i++) {
		   if(visited1[i] || visited2[i+k] || visited3[k-i+N-1]) {
			   continue;
		   }
		   visited1[i] =true;
		   visited2[i+k] =true;
		   visited3[k-i+N-1] =true;
		   queen(k+1);
		   visited1[i] =false;
		   visited2[i+k] =false;
		   visited3[k-i+N-1] =false;
	   }
   }
}
