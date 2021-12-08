package BFS;

import java.util.*;
import java.io.*;

public class B2583 {
	static int M, N, K;
	static int[] dx = { 0, -1, 0, 1 };
	static int[] dy = { 1, 0, -1, 0 };
	static int[][] arr;
	static boolean[][] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		arr = new int[M][N];
		visited = new boolean[M][N];

		for (int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			int startx = Integer.parseInt(st.nextToken());
			int starty = Integer.parseInt(st.nextToken());
			int endx = Integer.parseInt(st.nextToken());
			int endy = Integer.parseInt(st.nextToken());
			for (int j = starty; j < endy; j++) {
				for (int k = startx; k < endx; k++) {
					arr[j][k] = 1;
				}
			}
		}
		Queue<index> queue = new LinkedList<>();
		ArrayList<Integer> list = new ArrayList<Integer>();

		int cnt = 0;
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (arr[i][j] == 0 && !visited[i][j]) {
					queue.add(new index(i, j));
					int width = 0;
					while (!queue.isEmpty()) {
						index now = queue.remove();
						visited[now.x][now.y] = true;
						width++;
						for (int k = 0; k < 4; k++) {
							int xx = now.x + dx[k];
							int yy = now.y + dy[k];
							if (xx >= 0 && yy >= 0 && xx < M && yy < N) {
								if (arr[xx][yy] == 0 && !visited[xx][yy]) {
									queue.add(new index(xx, yy));
									visited[xx][yy]= true;
								}
							}
						}
					}
					list.add(width);
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		Collections.sort(list);
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i)+" ");
		}

	}
}
