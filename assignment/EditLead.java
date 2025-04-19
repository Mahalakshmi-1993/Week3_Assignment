package week3.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		//EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();	
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Mahalakshmi");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("S");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Maha");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Tester");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("ABCD");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("maha@gmail.com");
		WebElement stateElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateDropdown=new Select(stateElement);
		stateDropdown.selectByVisibleText("Texas");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("xyz");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String titleOfPage=driver.getTitle();
		System.out.println(titleOfPage); 
	}

}
