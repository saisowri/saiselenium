import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Using_basicxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");//Attribute based
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");//Attribute based
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();//Attribute based
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();//partial based
		driver.findElement(By.xpath("//a[text()='Leads']")).click();//text based
		

	}

}
