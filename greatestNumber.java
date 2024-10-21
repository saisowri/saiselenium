package JavaPrograms;

import java.util.Scanner;

public class greatestNumber {
	int a=10;
	int b=10;
	
	
	void check() {
		System.out.println("enter the value:");
		Scanner scan=new Scanner(System.in);
		int a = scan.nextInt();
		int b=scan.nextInt();
	if(a>b) {
		System.out.println("a is greatest number");
		
	}
	else if(b>a) {
		System.out.println("b is greatest number");
	}
	else {
		System.out.println("numbers are same");
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		greatestNumber great=new greatestNumber();
		great.check();
		

	}

}
