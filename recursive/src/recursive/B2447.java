package recursive;

import java.util.Scanner;

public class B2447 {
	static int N;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		star(N,false);
	}
	
	static void star(int n,boolean check) {
		if(n==1  && !check ) {
			System.out.print("*");
			return ;
		}else if(n==1 && check) {
			System.out.print(" ");
			return ;
		}
		
		boolean temp = check;
		
		
		star(n/3,check);
		star(n/3,check);
		star(n/3,check);
		if(n==9) {
			System.out.println("");
		}
		
		star(n/3,check);
		check = true;
		star(n/3,check);
		if(temp) {
			check = true; 
		}else {
			check = false;
		}
		star(n/3,check);
		if(n==9) {
			System.out.println("");	
		}
		
		star(n/3,check);
		star(n/3,check);
		star(n/3,check);
		if(n==9) {
			System.out.println("");
			
		}
	} 
}
