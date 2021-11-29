package BFS;
import java.util.*;
import java.io.*;

public class B7576 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[][] arr = new int[m][n];
		Queue<index> queue = new LinkedList<>();
		int[] dx = { 1, 0, -1, 0 };
		int[] dy = { 0, 1, -0, -1 };

		for (int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j]==1) {
					queue.add(new index(i,j));
				}
			}
		}

		while (!queue.isEmpty()) {
			index now = queue.remove();
			for(int i=0;i<dx.length;i++) {
				int xx = now.x + dx[i];
				int yy = now.y + dy[i];
				if(xx>=0 && yy>=0 && xx<m && yy<n) {
					if(arr[xx][yy]==0) {
						arr[xx][yy] = arr[now.x][now.y]+1;
						queue.add(new index(xx,yy));
					}
				}
			}
		}
		
		int max =-1;
		for(int i =0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(arr[i][j]==0) {
					max = 0;
					break;
				}
				if(max <arr[i][j]) {
					max = arr[i][j];
				}
			}
			if(max == 0) {
				break;
			}
		}
		System.out.println(max-1);
	}
}

//class index {
//	int x, y;
//
//	index(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//}