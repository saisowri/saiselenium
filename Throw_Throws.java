package selenium_interviewQuestion_practice;

//import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import  org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Throw_Throws {
	private static WebDriver driver;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.id("email")).sendKeys("sai@gmail.com");
		try {
			driver.findElement(By.id("email1")).sendKeys("sai@gmail.com");
		} catch (NoSuchElementException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.err.println("element problems");
			//throw new RuntimeException();
		}
		driver.findElement(By.id("pass")).sendKeys("123455");
		}

}
