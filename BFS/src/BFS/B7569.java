package BFS;

import java.io.*;
import java.util.*;

public class B7569 {

	static int M, N, H;
	static int[][][] arr;
	static int[] dx = { 0, 1, 0, -1, 0, 0 };
	static int[] dy = { 1, 0, -1, 0, 0, 0 };
	static int[] dh = { 0, 0, 0, -0, 1, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		H = Integer.parseInt(st.nextToken());
		arr = new int[H][N][M];
		Queue<indexed> queue = new LinkedList<>();

		for (int i = 0; i < H; i++) {
			for (int j = 0; j < N; j++) {
				st = new StringTokenizer(br.readLine());
				for (int k = 0; k < M; k++) {
					arr[i][j][k] = Integer.parseInt(st.nextToken());
					if(arr[i][j][k] == 1) {
						queue.add(new indexed(i,j,k));
					}
				}
			}
		}
		
        while(!queue.isEmpty()) {
        	indexed now = queue.remove();
        	for(int i=0;i<6;i++) {
        		int xx = now.x +dx[i];
        		int yy = now.y + dy[i];
        		int hh = now.h + dh[i];
        		if(xx>=0 && yy>=0 && hh>=0 && xx<H && yy< N && hh<M) {
        			if(arr[xx][yy][hh] ==0) {
        				arr[xx][yy][hh] = arr[now.x][now.y][now.h] +1;
        				queue.add(new indexed(xx,yy,hh));
        			}
        		}
        	}
        }
        int max = 0;
        for (int i = 0; i < H; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < M; k++) {
					if(max <arr[i][j][k]) max = arr[i][j][k];
					if(arr[i][j][k]==0) {max = 0; break;}				
				}
				if(max ==0) break;
			}
			if(max ==0) break;
		}
      

      System.out.println(max-1);
	}
}

class indexed {
	int x,y,h;
    indexed (int x,int y,int h){
		this.x = x;
		this.y = y;
		this.h = h;
		
	}
}