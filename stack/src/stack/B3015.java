package stack;

import java.util.Scanner;
import java.util.Stack;

public class B3015 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Person> stack = new Stack<>();
		int length = sc.nextInt();
		long result = 0;

		for (int i = 0; i < length; i++) {
			int hei = sc.nextInt();
			Person person = new Person(hei,1); 
			 
			while(!stack.empty() && stack.peek().height <= hei) {
				Person pop = stack.pop();
				result = result + pop.count;
				if(pop.height ==hei) {
					person.count +=pop.count;
				}
			}
			
			if(!stack.empty()) {
				result++;
			}
			
			stack.push(person);
		}
		
		System.out.println(result);
	}
}

class Person{
	int height;
	int count;
	
	Person(int height,int count){
		this.height = height;
		this.count = count;
	}
}

