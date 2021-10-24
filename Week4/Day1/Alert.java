package Week4.Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alert {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leafground.com/pages/Alert.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
	org.openqa.selenium.Alert alert = driver.switchTo().alert();
	alert.sendKeys("hi");
	Thread.sleep(2000);
	String text = alert.getText();
	System.out.println(text);
	alert.accept();
	
}
}
