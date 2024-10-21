package JavaPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num = scan.nextInt();
		boolean check=false;
		for (int i = 2; i <num; i++) {
			if(num%i==0) {
				check=true;
			}
		}
		if(check==true) {
			System.out.println("it is not prime number");
		}
		else {
			System.out.println("its prime number");
		}

	}

}
