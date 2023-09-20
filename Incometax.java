package Using_ifelse;

public class Incometax {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		//int income=0;
		float amt=183251;
		if (amt<=0) {
			System.out.println("no pat tax 0 income");
				
			}
		else if (amt<=8925) {
			System.out.println("you will pay tax: 0.10");
			}
		else if (amt<=36250) {
			System.out.println("you will pay tax: 0.15");
		}
		else if (amt<=87850) {
			System.out.println("you will pay tax: 0.23");
		}
		else if (amt<=183250) {
			System.out.println("you will pay tax: 0.28");
		}
		else if (amt<=398350) {
			System.out.println("you will pay tax: 0.33");
		}
		else if (amt<=400000) {
			System.out.println("you will pay tax: 0.35");
		}
		else {
			System.out.println("pls check tax amt\n THANK YOU!!!");
		}
			

	}

}
