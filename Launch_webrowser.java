import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
public class Launch_webrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("leberty");
		driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("selenium");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("First_name");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Last_name");
			}
}
