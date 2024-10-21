package selenium_interviewQuestion_practice;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.asynchttpclient.util.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class File_Upload {
	private static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get("https://the-internet.herokuapp.com/upload");
		  File uploadFile = new File("D:\\SeleniumYoutube\\screen\\img.jpg");

		    WebElement fileInput = driver.findElement(By.cssSelector("input[type=file]"));
		    fileInput.sendKeys(uploadFile.getAbsolutePath());
		    driver.findElement(By.id("file-submit")).click();

		    WebElement fileName = driver.findElement(By.id("uploaded-files"));
		    String text = fileName.getText();
		    System.out.println(text);
		    if(text.equals("img.jpg")) {
		    	System.out.println("verification is completed");
		    }
		    Thread.sleep(1000);
		    Assert.assertEquals(text, "img.jpg");

	}

}
