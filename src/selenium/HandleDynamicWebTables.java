package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleDynamicWebTables {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = "http://toolsqa.com/automation-practice-table/";
		driver.get(url);
		
		// Get the value from cell ‘Dubai’ and print it on the console
		WebElement tableCell = driver.findElement(By.xpath("//tr[1]/td[2]"));
		System.out.println(tableCell.getText());
		
		// Click on the link ‘Detail’ of the first row and last column
		WebElement link = driver.findElement(By.xpath("//tr[1]/td[6]/a"));
		link.click();
		System.out.println("Link: " + link.getText() + " clicked");
		
		// Get the value from cell ‘Dubai’ with using dynamic xpath
		int row = 1;
		int col = 2;
		WebElement tableCell2 = driver.findElement(By.xpath("//tr["+row+"]/td["+col+"]"));
		System.out.println(tableCell2.getText());
		
		// Print all the column values of row ‘Clock Tower Hotel’
		String expectedhotel = "Clock Tower Hotel";
		for (int i=1; i<5; i++) {
			String actualHotel = driver.findElement(By.xpath("//tr["+i+"]/th")).getText();
			if (actualHotel.equalsIgnoreCase(expectedhotel)) {
				for (int j=1; j<=5; j++) {
					int n=j+1;
					String columnName = driver.findElement(By.xpath("//tr/th["+n+"]")).getText();
					String info = driver.findElement(By.xpath("//tr["+i+"]/td["+j+"]")).getText();
					System.out.println(columnName + ": " + info);
				}
			}
		}
		
		driver.close();
	}
}

