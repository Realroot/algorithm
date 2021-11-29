package BFS;

import java.util.*;
import java.io.*;

public class B1926 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] arr = new int[n][m];
		Stack<bfs> stack = new Stack<>();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		int max = 0;
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr[i][j] == 1) {
					bfs temp = new bfs(i, j);
					stack.push(temp);
					int count = 0;
					while (!stack.isEmpty()) {
						int x = stack.peek().x;
						int y = stack.peek().y;
						stack.pop();
						if (x + 1 != n && arr[x + 1][y] == 1) {
							bfs temp2 = new bfs(x + 1, y);
							stack.push(temp2);
						} else if (x - 1 != -1 && arr[x - 1][y] == 1) {
							bfs temp2 = new bfs(x - 1, y);
							stack.push(temp2);
						} else if (y + 1 != m && arr[x][y + 1] == 1) {
							bfs temp2 = new bfs(x, y + 1);
							stack.push(temp2);
						} else if (y - 1 != -1 && arr[x][y - 1] == 1) {
							bfs temp2 = new bfs(x, y - 1);
							stack.push(temp2);
						}
						arr[x][y] = 0;
						count++;
					}
					if (max < count)
						max = count;
					cnt++;
				}
			}
		}
		System.out.println(cnt);
		System.out.println(max);
	}
}

class bfs {
	int x;
	int y;

	bfs(int x, int y) {
		this.x = x;
		this.y = y;
	}
}