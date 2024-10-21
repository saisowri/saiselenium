package selenium_interviewQuestion_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_Class {
	public static  WebDriver driver;
	public static void drap_drop() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Accepted%20Elements");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//li[@id='Accepted Elements']")).click();
		driver.switchTo().frame(4);
		WebElement src = driver.findElement(By.id("draggable-nonvalid"));
		WebElement des = driver.findElement(By.id("draggable"));
		Actions build=new Actions(driver);
		build.dragAndDrop(src, des).perform();
		
		
		 
	}
	public static void movetoelement() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Electronics")).click();
		WebElement elect = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions act=new Actions(driver);
		act.moveToElement(elect).perform();
		driver.findElement(By.linkText("Apple")).click();
		WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
		Thread.sleep(2000);
		String attribute = element.getAttribute("value");
		System.out.println("order name is : "+ attribute);
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		drap_drop();

	}

}
