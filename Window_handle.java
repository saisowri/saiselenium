package selenium_interviewQuestion_practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_handle {
	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement WindowBtn = driver.findElement(By.xpath("//button[@id='newTabBtn']"));
		String parenwin_ID = driver.getWindowHandle();
	    System.out.println(parenwin_ID);
	    Thread.sleep(1000);
        WebElement web = driver.findElement(By.id("aswift_5"));
	    driver.switchTo().frame(web);
		WindowBtn.click();

	}

}
