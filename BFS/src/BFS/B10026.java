package BFS;

import java.util.*;
import java.io.*;

public class B10026 {
	static int N;
	static char[][] arr;
	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, 1, 0, -1 };
	static boolean[][] visited;
	
	public static void bfs(int x, int y, char color) {
		visited[x][y] = true;
		for (int i = 0; i < 4; i++) {
			int xx = x + dx[i];
			int yy = y + dy[i];
			if (xx >= 0 && yy >= 0 && xx < N && yy < N) {
				if (!visited[xx][yy] && arr[xx][yy] == color) {
					bfs(xx, yy, color);
				}
			}
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		N = Integer.parseInt(br.readLine());
		arr = new char[N][N];
		visited = new boolean[N][N];
 
		for (int i = 0; i < N; i++) {
			String temp = br.readLine();
			for (int j = 0; j < N; j++) {
				arr[i][j] = temp.charAt(j);
			}
		}

		int cnt = 0;
		int cnt2 =0;
		for (int x = 0; x < N; x++) {
			for (int y = 0; y < N; y++) {
				if (!visited[x][y]) {
					bfs(x, y, arr[x][y]);
					cnt++;
				}
			}
		}
		
		for(int x =0; x<N; x++) {
			for(int y =0; y<N;y++) {
				visited[x][y] =false;
				if(arr[x][y]=='R') {
					arr[x][y] ='G';
				}
			}
		}
		
		for (int x = 0; x < N; x++) {
			for (int y = 0; y < N; y++) {
				if (!visited[x][y]) {
					bfs(x, y, arr[x][y]);
					cnt2++;
				}
			}
		}
		
		bw.write(cnt + " "+cnt2+"\n");
		bw.flush();
		bw.close();
	}
}