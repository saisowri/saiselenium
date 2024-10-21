package selenium_interviewQuestion_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Script {
	private static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//javascriptexecute is good and faster interacting with webelement.
		//when normal sendkey and click method not working we will used to javascriptexector methods.
		
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement e_mail = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','sai@gmail.com')", e_mail);
		
		WebElement pwd = driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value','12345sai')", pwd);
		
		Object io = js.executeScript("return arguments[0].getAttribute('value')", pwd);
		String show=(String)io;
		System.out.println(show);

	}

}
