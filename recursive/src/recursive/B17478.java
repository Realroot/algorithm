package recursive;

import java.util.*;
import java.io.*;

public class B17478 {
   public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  
	  int N = sc.nextInt();
	  
	  System.out.println("��� �� ��ǻ�Ͱ��а� �л��� ������ �������� ã�ư� ������.");
	  System.out.println("\"����Լ��� ������?\"");
	  recur(N,0);
	  System.out.println("��� �亯�Ͽ���.");
   }
   
   static void recur(int n,int i) {
	   
	   for(int j =0;j<i*4;j++) {
		   System.out.print(" ");
	   }
	   
	   if(n==0) {
		   System.out.println("\"����Լ��� �ڱ� �ڽ��� ȣ���ϴ� �Լ����\"");
		   return ;
	   }else {
		   System.out.println("\"�� ����. �������� �� �� ����⿡ �̼��� ��� ������ ����� ������ �־���.");
		   for(int j =0;j<i*4;j++) {
			   System.out.print(" ");
		   }
		   System.out.println("���� ������� ��� �� ���ο��� ������ ������ �߰�, ��� �����Ӱ� ����� �־���.");
		   for(int j =0;j<i*4;j++) {
			   System.out.print(" ");
		   }
		   System.out.println("���� ���� ��κ� �ǾҴٰ� �ϳ�. �׷��� ��� ��, �� ���ο��� �� ���� ã�ƿͼ� ������.\"");
	   }
	   
	   for(int j =0;j<(i+1)*4;j++) {
		   System.out.print(" ");
	   }
	   
	   System.out.println("\"����Լ��� ������?\"");
	   recur(n-1,i+1);
	   for(int j =0;j<(i+1)*4;j++) {
		   System.out.print(" ");
	   }
	   System.out.println("��� �亯�Ͽ���.");
   }
}
