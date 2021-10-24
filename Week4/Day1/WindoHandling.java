package Week4.Day1;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindoHandling {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	// To disable the notifications
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--disable-notifications");
	ChromeDriver driver = new ChromeDriver(options);
	driver.get("https://www.irctc.co.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//div[@class='text-center col-xs-12']//button[1]")).click();
driver.findElement(By.linkText("FLIGHTS")).click();
Set<String>winSet=driver.getWindowHandles();
List

}
}
