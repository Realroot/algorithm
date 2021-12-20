package BFS;

import java.util.*;
import java.io.*;

public class B9466 {
	static int T,N,cnt=0;
	static int[] arr;
	static boolean[] visited;
	
  public static void main (String[] args) throws IOException{
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  StringTokenizer st = new StringTokenizer(br.readLine());
	  T = Integer.parseInt(st.nextToken());
	  
	  while(T-->0) {
		  st = new StringTokenizer(br.readLine());
		  N = Integer.parseInt(st.nextToken());
		  st = new StringTokenizer(br.readLine());
		  
		  arr = new int[N+1];
		  visited = new boolean[N+1];
		  
		  for(int i =1; i<=N; i++) {
			  arr[i] = Integer.parseInt(st.nextToken());
		  }
		  
		  Queue<Integer> queue = new LinkedList<>();
		  
		  for(int i =1;i<=N;i++) {
			  if(!visited[i]) {
				  queue.add(i);
				  while(!queue.isEmpty()) {
					  int now = queue.peek();
					  visited[i] = true;
					  if(visited[now] == true) {
						  while(!queue.isEmpty()) {
							  
						  }
					  }else {
						  queue.add(now);
					  }
				  }
			  }
		  }
			  
	  }
	  
  }
}
