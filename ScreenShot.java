package selenium_interviewQuestion_practice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	private static WebDriver driver;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		TakesScreenshot tk=(TakesScreenshot)driver;
		File src = tk.getScreenshotAs(OutputType.FILE);
		File des=new File ("D:\\SeleniumYoutube\\screen\\img.png");
		FileUtils.copyFile(src, des);
		
		//take screenshot to particular content
		WebElement screen = driver.findElement(By.xpath("//div[@ class=' nav nav-tabs']"));
		File src1 = screen.getScreenshotAs(OutputType.FILE);
		File des1=new File("./screen/img3.png");
		FileUtils.copyFile(src1, des1);
		
		
		

	}

}
