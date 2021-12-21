package BFS;

import java.io.*;
import java.util.*;

public class B13549 {

	static int N, M;
	static boolean[] arr;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		Queue<number> queue = new LinkedList<>();
        arr = new boolean[M*2];
        
		queue.add(new number(0,N));
		while(!queue.isEmpty()) {
			number now = queue.remove();
			System.out.println(now.number + " " + now.cnt);
			if(now.number == M) {
				System.out.println(now.cnt);
				break;
			}
			
			int xPlus =now.number+1;
			int xMinus =now.number-1;
			int xMulti =now.number*2;
			
			boolean plus=false,minus=false,multi =false;
			
			
			if(now.number <= M && !arr[xMulti]) {
				queue.add(new number(now.cnt,xMulti));
				arr[xMulti] = true;
			}
			
			if(!minus && xMinus > 0) {
				queue.add(new number(now.cnt+1,xMinus));
				arr[xMinus] =true;
			}
			
			
			if(!plus && xPlus <= M) {
				queue.add(new number(now.cnt+1,xPlus));
				arr[xPlus] =true;
			}
			
		}
	}
}

class number {
	int cnt;
    int number;
    number(int cnt,int number){
       this.cnt = cnt;
       this.number = number;
    }
}