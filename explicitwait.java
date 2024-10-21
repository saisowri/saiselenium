package selenium_interviewQuestion_practice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitwait {
	private static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver =new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//alertispresent for explicitwait
		/*driver.get("https://demo.automationtesting.in/Alerts.html");
		WebElement alt = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		alt.click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alert.getText());
		alert.accept();
		driver.close();*/
		driver.get("https://www.lambdatest.com/automation-demos");
			 // Initialize WebDriverWait with a timeout of 5 seconds
			 WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
			 // ExpectedCondition for Presence of Element Located
			 WebElement elementLocated = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
			 elementLocated.sendKeys("xyz@lambdatest");
			 driver.findElement(By.id("password")).sendKeys("LambdaTest");
			 // ExpectedCondition for Element to be Clickable
			 WebElement clickableElement = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Blogs")));
			 clickableElement.click();
//			 // ExpectedCondition for Visibility of Element Located
//			 WebElement visibleElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"menu-item-35\"]/a")));
//			 String elementText = visibleElement.getText();
//			 System.out.println(elementText);
			
//			 // ExpectedCondition for Visibility of All Elements Located
//			 //List<WebElement> allVisibleElements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@id=\"site-navigation\"]/div")));
//			 for (WebElement element : allVisibleElements) {
//			 System.out.println(element.getText());
//			 }
//			 // Close the browser
//			 driver.quit();
			 
		
		
		
//		Alert alert = driver.switchTo().alert();
//		System.out.println(alert.getText()); 
//		alert.accept();
		
		
		

	}

}
