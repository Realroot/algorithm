package BFS;

import java.util.*;
import java.io.*;

public class B1012 {
	static int[] dx = { -1, 0, 1, 0 };
	static int[] dy = { 0, -1, 0, 1 };
	static boolean[][] visited;
	static int[][] arr;
	static int M, N, K;
    static int count;
    
    static void dfs(int x, int y) {
		visited[x][y] = true;
		for (int i = 0; i < 4; i++) {
			int xx = x + dx[i];
			int yy = y + dy[i];
           // System.out.println(x+" "+" "+y+" "+xx+" "+yy);
			if (xx >= 0 && yy >= 0 && xx < N && yy < M) {
				if (arr[xx][yy] == 1 && !visited[xx][yy]) {				
					dfs(xx, yy);
				}
			}
		}
	}
    
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int T = Integer.parseInt(st.nextToken());

		while (T-- > 0) {
			st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			arr = new int[N][M];
			visited = new boolean[N][M];
            count=0;
            
			for (int i = 0; i < K; i++) {
				st = new StringTokenizer(br.readLine());
				int col = Integer.parseInt(st.nextToken());
				int row = Integer.parseInt(st.nextToken());
				arr[row][col] = 1;
			}

		
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < M; j++) {
					if (arr[i][j] == 1 && !visited[i][j]) {
						dfs(i, j);
						//System.out.println(count);
						count++;
					}
				}
			}
			bw.write(count + "\n");
		}
		bw.flush();
		bw.close();
	}
}