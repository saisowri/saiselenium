package selenium_interviewQuestion_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	private static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Frames.html");
		
//		//handle single frame
//		driver.switchTo().frame(0);//id='singleframe"//
//		WebElement val = driver.findElement(By.xpath("(//input[@type='text'])[1]"));
//		val.sendKeys("hai sai");
//		
//		//handle parentframe
//		driver.switchTo().parentFrame();
//		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		
		//handle multipleframe 
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("saibaba");

	}

}
