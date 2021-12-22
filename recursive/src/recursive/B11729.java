package recursive;

import java.util.*;
import java.io.*;

public class B11729 {
	static int cnt=0;
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		hanoi(N,1,3,2);
	}
	
	public static void hanoi(int N,int start,int end,int sub) {
		if(N == 1) {
			System.out.println(start+" "+end);
			cnt++;
			return ;
		}
		
		hanoi(N-1,start,sub,end);
		hanoi(1,start,end,sub);
		hanoi(N-1,sub,end,start);
	}
}


