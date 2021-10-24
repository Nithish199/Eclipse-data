package Week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();

		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		// Step1: Locate element
		// findElement == used to locate one element
		// findElement == used to locate the all element
		//WebElement eleUsername = driver.findElement(By.name("username"));
	driver.findElement(By.name("USERNAME")).sendKeys("Demosalesmanager");
		//eleUsername.sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
	}

}
