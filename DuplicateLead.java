package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();//setup the browser
		ChromeDriver driver = new ChromeDriver();//Launch the browser
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Shital");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Lotke");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ssl27@gmail.com");
		
		WebElement Source = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select drop2 = new Select(Source);
		//drop2.deselectByVisibleText("Texas");
		drop2.selectByVisibleText("Texas");
		
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Swati");
		driver.findElement(By.className("smallSubmit")).click();
		
		
		
	    
		
		String url = driver.getCurrentUrl();
		System.out.println("URL : " +url);
				               
		String title = driver.getTitle();
		System.out.println("Title : " +title);
				
		
		
		
		
	}

}
