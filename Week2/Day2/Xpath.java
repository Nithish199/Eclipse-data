package Week2.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {
public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Chromes");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Nithish");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("K");
		WebElement elesource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropDown=new Select(elesource);
		dropDown.selectByVisibleText("Conference");
		
		WebElement eleindustry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropDown1=new Select(eleindustry);
		dropDown1.selectByIndex(7);
		WebElement eleownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropDown2=new Select(eleownership);
		dropDown2.selectByValue("OWN_PARTNERSHIP");
		driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("Affiliate Sites");
		//Select dropDown3=new Select(elemarkcamp);
		//dropDown3.selectByValue("OWN_PARTNERSHIP");
		driver.findElement( By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("nithish");
	}
}
