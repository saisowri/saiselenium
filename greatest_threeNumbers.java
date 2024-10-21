package JavaPrograms;

public class greatest_threeNumbers {
	int a=3;
	int b=3;
	int c=1;
	 void check() {
		 if(a>b) {
			
			 if(a>c) {
				 System.out.println("a is greatest number");
			 }
			 else if(c>a) {
				 System.out.println("c is greatest number");
			 }
			 else {
				 System.out.println("a is equal to c");
			 }
		 }
		 else if(b>a) {
			 if(b>c) {
				 System.out.println("b is greater number");
			 }
			 else if(c>b) {
				 System.out.println("c is greater number");
			 }
			 else {
				 System.out.println("b is equal to c");
			 }
			 
		 }
		 else {
			 System.out.println("a is equal to b");
		 }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		greatest_threeNumbers gthree=new greatest_threeNumbers();
		gthree.check();

	}

}
