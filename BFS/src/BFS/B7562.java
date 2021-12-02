package BFS;

import java.util.*;
import java.io.*;

public class B7562 {
	static int T, N;
	static int[][] arr;
    static int startx,starty;
    static int endx,endy;
    static int[] dx = {1,1,2,2,-1,-1,-2,-2};
    static int[] dy = {2,-2,-1,1,2,-2,-1,1};
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		T = Integer.parseInt(st.nextToken());

		while (T-- > 0) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
            arr = new int[N][N];
            st = new StringTokenizer(br.readLine());
            startx = Integer.parseInt(st.nextToken());
            starty = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            endx = Integer.parseInt(st.nextToken());
            endy = Integer.parseInt(st.nextToken());
            Queue<index> queue = new LinkedList<>();
            queue.add(new index(startx,starty));
 			arr[startx][starty] =1;
 			
            while(!queue.isEmpty() && arr[endx][endy] == 0) {
            	index now = queue.remove();
            	//
            	for(int i=0;i<8;i++) {
            		int xx =now.x + dx[i];
            		int yy =now.y + dy[i];
            		if(xx>=0 && yy>=0 && xx<N && yy<N) {
            			if(arr[xx][yy] ==0) {
            				arr[xx][yy] = arr[now.x][now.y] +1;
            				queue.add(new index(xx,yy));
            			}
            		}
            	}	
            }
         System.out.println(arr[endx][endy]-1);
		}
	}
}
