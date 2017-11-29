package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBrowserCommands {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		String url = "http://google.com";
		driver.get(url);
		
		String title = driver.getTitle();
		int titleLength = driver.getTitle().length();
		System.out.println("Length of the title is: " + titleLength);
		System.out.println("Title of the page is: " + title);
		
		String actualUrl = driver.getCurrentUrl();
		
		if (actualUrl.equals(url)) {
			System.out.println("Verification Successful - The correct Url is opened.");
		} else {
			System.out.println("Verification Failed - An incorrect Url is opened.");
			System.out.println("Actual URL is : " + actualUrl);
			System.out.println("Expected URL is : " + url);
		}
		
		String pageSource = driver.getPageSource();
		int pageSourceLength = pageSource.length();
		System.out.println("Total length of the Pgae Source is: " + pageSourceLength);
		
		driver.findElement(By.xpath("//*[@name='btnI']")).click();
		
		driver.close();
	}

}
