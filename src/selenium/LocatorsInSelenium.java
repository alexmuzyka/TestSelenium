package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsInSelenium {

	public static void main(String[] args) {
		
		// Info class
		
		System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		driver.get("http://www.tut.by");
		
		// ID Locator
		WebElement element1 = driver.findElement(By.id("pageLogo"));
		System.out.println(element1);
		
		// Name Locator
		WebElement element2 = driver.findElement(By.name("viewport"));
		System.out.println(element2);

		// Class NAme Locator
		WebElement element3 = driver.findElement(By.className("header-logo"));
		System.out.println(element3);
		
		// Css Selector
		WebElement element4 = driver.findElement(By.cssSelector(".header-logo"));
		System.out.println(element4);
		
		// Link Text
		WebElement element5 = driver.findElement(By.linkText("Twitter"));
		System.out.println(element5.getText());
		
		// Partial Link Text
		WebElement element6 = driver.findElement(By.partialLinkText("Tw"));
		System.out.println(element6.getText());
		
		// Xpath
		WebElement element7 = driver.findElement(By.xpath("//input[@name='search']"));
		System.out.println(element7);
		
		// Tag Name
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Links count is: "+allLinks.size());
		for(WebElement link : allLinks)
		System.out.print(link.getText());
		
		driver.close();
	}

}
