package selenium_interviewQuestion_practice;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exception {
	private static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//driver=new ChromeDriver();
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number: ");
		
		try {
			int number = scan.nextInt();
			int val=number%0;
			System.out.println(val);
		} 
		catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			//System.out.println(e.getMessage());
			//e.printStackTrace();
			System.out.println("divisible by 0 is not possible");
		}
		catch (InputMismatchException e) {
			// TODO: handle exception
			System.err.println("pls must be input in string");
		}
		/*catch (Exception e) {
			// TODO: handle exception
			System.out.println("unwanted decleartion");
		}*/
		finally {
			System.out.println("exception is close");
		}
		//System.out.println("exception is complered");
		

	}

}
