package BFS;
import java.util.*;
import java.io.*;

public class B2178 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] arr = new int[n][m];
		int[] dx = { 1, 0, -1, 0 };
		int[] dy = { 0, 1, 0, -1 };
		boolean[][] visited=new boolean[n][m];

		Queue<index> queue = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			String temp = br.readLine();
			for (int j = 0; j < m; j++) {
				arr[i][j] = (int) temp.charAt(j) - '0';
				visited[i][j] = false;
			}
		}

		queue.add(new index(0, 0));
		visited[0][0] = true;
		
		while (!queue.isEmpty()) {
			index now = queue.remove();
			for (int i = 0; i < dx.length; i++) {
				int xx = now.x + dx[i];
				int yy = now.y + dy[i];
				if (xx >= 0 && yy >= 0 && xx < n && yy < m) {
					if (arr[xx][yy] != 0 && !visited[xx][yy]) {
						visited[xx][yy] = true;
						arr[xx][yy] = arr[now.x][now.y] + 1;
						queue.add(new index(xx, yy));
					}
				}
			}
		}
		System.out.println(arr[n-1][m-1]);
	}
}

class index {
	int x, y;

	index(int x, int y) {
		this.x = x;
		this.y = y;
	}
}