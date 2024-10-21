package JavaPrograms;

import java.util.Iterator;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first=0, second=1, temp=0;
		for (int i = 0; i <= 5; i++) {
			System.out.print(first+" ");
			temp=first+second;
			first=second;
			second=temp;
			}
		

	}

}
