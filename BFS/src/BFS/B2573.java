package BFS;

import java.util.*;
import java.io.*;

public class B2573 {

	static int M, N, cnt = 0, year = 0;
	static int[][] arr;
	
	static int[] dx = { 0, 0, 1, -1 };
	static int[] dy = { 1, -1, 0, 0 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		arr = new int[M][N];
		Queue<index> queue = new LinkedList<>();

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		while (cnt < 2) {
			cnt = 0;
			boolean[][] visited;
			visited = new boolean[M][N];
            int[][] temp = new int[M][N];
			
			
			for(int i=0;i<M;i++) {
				for(int j=0;j<N;j++) {
					temp[i][j] = arr[i][j];
				}
			}
			
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					if (arr[i][j] != 0 && !visited[i][j]) {
						queue.add(new index(i, j));
						while (!queue.isEmpty()) {
							index now = queue.remove();
							visited[now.x][now.y] = true;
							for (int k = 0; k < 4; k++) {
								int xx = now.x + dx[k];
								int yy = now.y + dy[k];
								if (xx >= 0 && yy >= 0 && xx < M && yy < N) {
									if (arr[xx][yy] != 0 && !visited[xx][yy]) {
										queue.add(new index(xx, yy));
										visited[xx][yy] = true;
									}
								}
							}
						}
						cnt++;
					}
				}
			}
			
			if (cnt >= 2) {
				break;
			}
            System.out.println(cnt);
			
			for (int i = 0; i < M; i++) {
				for (int j = 0; j < N; j++) {
					if (arr[i][j] != 0) {
						int sea = 0;
						for (int k = 0; k < 4; k++) {
							int xx = i + dx[k];
							int yy = j + dy[k];
							if (xx >= 0 && yy >= 0 && xx < M && yy < N) {
								if (temp[xx][yy] == 0) {
									sea++;
								}
							}
						}
						arr[i][j] = arr[i][j] - sea;
						if (arr[i][j] < 0) {
							arr[i][j] = 0;
						}
					}
				}
			}
			year++;
		}

		System.out.println(year);
	}
}
