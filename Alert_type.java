package selenium_interviewQuestion_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Alert_type {
	public static Alert alert;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebElement btn = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		btn.click();
		
		//Simple Alert
		alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Simple alert example: "+text);
		alert.accept();
		
		//Confirm Alert
		WebElement click_btn = driver.findElement(By.linkText("Alert with OK & Cancel"));
		click_btn.click();
		WebElement click_confirm = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
		click_confirm.click();
		String confirmalert = alert.getText();
		System.out.println(confirmalert);
		alert.accept();
		WebElement pas = driver.findElement(By.xpath("//div[@id='CancelTab']/p"));
		String att_val = pas.getText();
		System.out.println("Confirm alert example: "+att_val);
		
		//prompt alert
		WebElement p_click = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		p_click.click();
		WebElement prm_clk = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
		prm_clk.click();
		alert.sendKeys("hai sowri welcome to alert");
		alert.accept();
		WebElement prm_text = driver.findElement(By.xpath("//div[@id='Textbox']/p"));//parent to child 
		String prm_value = prm_text.getText();
		System.out.println(prm_value);
		
		
		//String prm_value = alert.getText();
		//System.out.println("Promptalert example: "+prm_value);
	}

}
