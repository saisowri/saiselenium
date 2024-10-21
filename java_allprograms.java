package JavaPrograms;

import java.util.Scanner;

public class java_allprograms {
	
	
//	public void swap() {
//		int a=10,b=5,c=0;
//		c=a;
//		a=b;
//		b=c;
//		System.out.println("a=10 :"+a+" b=5 :"+b);
//	}
//	 public static  void swap1() {
//		 int a=10,b=20;
//		 a=a+b;//10+20=>30
//		 b=a-b;//30-20=>10
//		 a=a-b;
//		 System.out.println("a=10 :"+a+" b=20 :"+b);
//		 
//	 }
//	 public void small_bignum() {
//		 int a=11,b=10,c=6;
//		 if(a<b) {
//			if(a<c) {
//				System.out.println("a is less");
//			}
//			 }
//		 else {
//			 System.out.println("a is geater");
//		 }
//	 }
//	 public static void count_even() {
//		 Scanner scan=new Scanner(System.in);
//		 int count=0;
//		 for(int i=1;i<5;i++) {
//			 System.out.println("enter the value: "+i);
//			 int num=scan.nextInt();
//			 if(num%2==0) {
//				 count++;
//			 }}System.out.println("even count values :"+count);
//		 }
//	 public static void sumofdigii() {
//		 Scanner scan=new Scanner(System.in);
//		 int count=0, rem=0, temp=0;
//		 System.out.println("enter the value: ");
//		 int num = scan.nextInt();
//		 for (int i = 1; i <=5; i++) {
//			 rem=num%10;
//			 temp=rem+temp;
//			 num=num/10;			
//		}System.out.println("total count is:"+temp);
//	 }
//	 public static void bin_dec() {
//		 Scanner scan=new Scanner(System.in);
//		 int temp=0,rem=0,count=0;
//		 System.out.println("enter the binary values:");
//		 int num = scan.nextInt();
//		 for (int i = 1; i <=4; i++) {
//			 rem=num%10;
//			double product=rem*Math.pow(2, count);
//			temp=(int) (temp+product);
//			count++;
//			num=num/10;
//		}System.out.println(temp);
//	 }
//	 public static void dec_bin() {
//		 int[] bin=new int[30];
//		 Scanner scan=new Scanner(System.in);
//		 System.out.println("enter the dec value:");
//		 int dec = scan.nextInt();
//		 int rem=0;
//		 int index=0;
//		 while(dec>0) {
//			 rem=dec%2;
//			 bin[index++]=rem;
//			  //System.out.print(rem);
//			  dec=dec/2;
//		 }
//		 for (int i = index; i >0; i--) {
//			 System.out.print(bin[i]);
//			
//		}
//	 }
	 public static void revers_number() {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("enter the value: ");
		 int num=scan.nextInt();
		 int rem=0,temp=0,mem=num;
		 while(num>0) {
			 rem=num%10;
			 temp=temp*10+rem;
			 num=num/10;
			 int count = 0;
			count++;
		 }System.out.println(temp);
		if(mem==temp) {
			System.out.println("is an palindrom");
			
		}
		else {
			System.out.println("is not palindrom");
		}
		 }	
	 public static void rever_string() {
		 String name="amma";
		 int len = name.length();
		 String temp="";
		 for(int i=len-1;i>=0;i--) {
			 temp=temp+name.charAt(i);
		 }System.out.println(temp);
		 if(temp.equals(name)) {
			 System.out.println("is palindrome");
		 }
		 else {
			 System.out.println("is not palindrom"); 
		 }
	 }
	 public static void factorial() {
		 Scanner scan=new Scanner(System.in);
		 System.out.println("enter the number: ");
		 int num = scan.nextInt();
		 int temp=1;
		 
		 if(num==0) {
			 System.out.println("zero is not consider for factorial");
		 }
		 else if(num>0) {
			 for(int i=1;i<=5;i++) {     
				 temp=temp*i;
			 }System.out.println("passitive number is: "+temp);
		}
		 else if(num<0) {
			 for(int i=-1;i>=num;i--) {
				 temp=temp*i;
				 }System.out.println("nagative numbers is:"+temp);
			 
		 }
		 
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java_allprograms swp=new java_allprograms();
//		swp.swap();
//		swap1();
//		swp.small_bignum();
//		count_even();
//		sumofdigii();
//		bin_dec();
//		dec_bin();
		revers_number();
		rever_string();
		factorial();

	}
	

}
