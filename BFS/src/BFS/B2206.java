package BFS;

import java.util.*;
import java.io.*;

public class B2206 {

	static int N, M;
	static int[][] arr;
	static int[] dx = { 0, 1, 0, -1 };
	static int[] dy = { 1, 0, -1, 0 };
    static boolean[][][] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		arr = new int[M][N];
		visited = new boolean[M][N][2];

		Queue<po> queue = new LinkedList<>();
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < M; i++) {
			String temp = br.readLine();
			for (int j = 0; j < N; j++) {
				arr[i][j] = temp.charAt(j) - '0';
			}
		}

		queue.add(new po(0, 0, 0, 1));

		visited[0][0][1] = true;
		visited[0][0][0] = true;
		
		while (!queue.isEmpty()) {
			po now = queue.remove();
			if (now.x == M - 1 && now.y == N - 1) {
				list.add(now.cnt);
				continue;
			}

			for (int i = 0; i < 4; i++) {
				int xx = now.x + dx[i];
				int yy = now.y + dy[i];
				if (xx >= 0 && yy >= 0 && xx < M && yy < N) {
					if (arr[xx][yy] == 0 && !visited[xx][yy][now.breaked]) {
						visited[xx][yy][now.breaked] = true;
						queue.add(new po(xx, yy, now.breaked, now.cnt + 1));
					} else if (arr[xx][yy] == 1 && now.breaked == 0 && !visited[xx][yy][1]) {
						visited[xx][yy][1] = true;
						queue.add(new po(xx, yy, 1, now.cnt + 1));
					}
				}
			}
		}
		int min = -1;
		for (int i = 0; i < list.size(); i++) {
			if (min > list.get(i) || min == -1) {
				min = list.get(i);
			}
		}
		if (list.size() != 0) {
			System.out.println(min);
		} else {
			System.out.println(-1);
		}
	}
}

class po {
	int x;
	int y;
	int breaked;
	int cnt;

	po(int x, int y, int breaked, int cnt) {
		this.x = x;
		this.y = y;
		this.breaked = breaked;
		this.cnt = cnt;
	}
}
