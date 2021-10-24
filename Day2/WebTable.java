package Week4.Day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	// step 1 : find the table
	// step 2: Get all the rows
	// get the number of rows in the table
	// get the number of columns
	// print all the contents of the table
	// print the contents of column 2 alone
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Find the table
		WebElement webTable = driver.findElement(By.id("table_id"));
		// Get the number of rows in the table
		List<WebElement> tableRows = webTable.findElements(By.tagName("tr"));
		System.out.println("Number of the rows in the table:" + tableRows.size());
		// Get the number of columns in the table

		WebElement firstRow = tableRows.get(0);
		List<WebElement> tableCol = firstRow.findElements(By.tagName("th"));
		System.out.println("Number of columns in the table :" + tableCol.size());

//print all the content in the of table
		/*
		 * foreach -->ctrl+space for (WebElement webElement : tableCol) {
		 * 
		 * } //no index no reverse option
		 */
		for (WebElement eachRowElement : tableCol) {
			System.out.println(eachRowElement.getText());
			// print the contents of 2 column alone
			for (int i = 1; i < tableRows.size(); i++) {
				WebElement row = tableRows.get(i);
				List<WebElement> col = row.findElements(By.tagName("td"));
				String colText = col.get(1).getText();
				System.out.println(colText);
			}
		}
	}
}
