package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Irctc {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.irctc.co.in/nget/train-search");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//div[@class='col-xs-12 text-center']//label[1]")).click();
	driver.findElement(By.xpath("//div[@class='text-center col-xs-12']//button[1]")).click();
	driver.findElement(By.xpath("html[1]/body[1]/app-root[1]/app-home[1]/div[1]/app-header[1]/div[1]/div[2]/a[1]/i[1]")).click();
	driver.findElement(By.cssSelector("div#slide-menu>p-sidebar>div>nav>div>label>button")).click();
	driver.findElement(By.name("userId")).sendKeys("nithish1127");
	driver.findElement(By.name("pwd")).sendKeys("1127@Nithish");
	driver.findElement(By.xpath("//label[text()='Login & Booking With OTP']")).click();
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	driver.findElement(By.xpath("(//button[@class='search_btn train_Search'])[2]")).click();
	driver.findElement(By.xpath("//div[@class='avatar-container']/following-sibling::div")).click();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
	String String = driver.findElement(By.xpath("//img[@src='https://irctclive.nlpcaptcha.in/index.php/media/getTC/0F6C_VTByVk1UdjJzaklocU1Gc1NuUWFqQktkVHExZlArZkgvMWltRFBmWGN4S2dWcS9YcVdFejlhRnd1K1ROb1BUQTlZT2JXZHI3cHNpeXJnK2tXM3l4aEE9PQ==/banner']")).getAttribute("border");
	}

}
