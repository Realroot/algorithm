package recursive;

import java.io.*;
import java.util.*;

public class B1629 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long n = sc.nextLong();
		long m = sc.nextLong();
		long h = sc.nextLong();

		System.out.println(multi(n, m, h));
	}

	public static long multi(long a, long b, long c) {

		   if(a==1 || b==1) return a%c;
	        a = a%c;
	        if(b%2 == 0){
	            return multi(a*a%c, b/2, c) % c;
	        } else {
	            return a * multi(a*a%c, b/2, c) % c;
	        }
	    }
}
