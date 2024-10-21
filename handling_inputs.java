package selenium_interviewQuestion_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class handling_inputs {
	private static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		//sendkeys and use tab
		WebElement f_name = driver.findElement(By.xpath("//input[@id='firstName']"));
		f_name.sendKeys("sowri", Keys.TAB);
//		
//		//getattribute
		WebElement e_mail = driver.findElement(By.xpath("//input[@id='userEmail']"));
		String mail_att = e_mail.getAttribute("placeholder");
		System.out.println(mail_att);
		
		//select radio button
		WebElement radio_click = driver.findElement(By.xpath("(//label[@class='custom-control-label'])[1]"));
		radio_click.click();
		
		//isSELECTED
		boolean checkbox = driver.findElement(By.xpath("//input[@id='hobbies-checkbox-1']")).isSelected();
		System.out.println(checkbox);
		
		//clear
		WebElement dob_clear = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		dob_clear.clear();
		
		
		
		

	}

}
