package JavaPrograms;

import java.util.Scanner;

public class swap {
	
	// static void findval() {
		//int a=10,b=20,c=0;
	 void findval() {	
//		c=a;
//		a=b;
//		b=c;
//		System.out.println("a is:"+a+"\nb is:"+b);
		
			for (int i = 0; i < 1; i++) {
				
				System.out.println("enter the value:");
				Scanner scan=new Scanner(System.in);
				int a1 = scan.nextInt();
				int b1 = scan.nextInt();
				System.out.println(a1+b1);
				int c=a1;
				a1=b1;
				b1=c;
				System.out.println("a1 is:"+a1+"b1 is:"+b1);
				
	}
			
			
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swap swp=new swap();
		swp.findval();
		
		
        //swap.findval();

	}

}
