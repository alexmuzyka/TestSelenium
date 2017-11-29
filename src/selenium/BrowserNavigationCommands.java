package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserNavigationCommands {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		String url = "http://google.com";
		driver.get(url);
		
		driver.findElement(By.xpath("//*[@name='btnI']")).click();
		
		driver.navigate().refresh();
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().to(url);

		driver.close();
	}

}
