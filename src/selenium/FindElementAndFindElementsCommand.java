package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElementAndFindElementsCommand {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		String url = "http://google.com";
		driver.get(url);
		
		WebElement element = driver.findElement(By.id("lst-ib"));
		element.sendKeys("What if...");
				
		WebElement parentElement = driver.findElement(By.className("jsb"));
		WebElement childElement = parentElement.findElement(By.name("btnI"));
		childElement.click();
				
		driver.navigate().back();
	
		// tagName(String name) elements by their TAGNAMES.
				
		driver.findElement(By.partialLinkText("Беларуская")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("Бела")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.name("btnI")).click();
		
		//Step 2
		driver.get("http://toolsqa.wpengine.com/Automation-practice-form/");
 
		// Type Name in the FirstName text box      
		driver.findElement(By.name("firstname")).sendKeys("Lakshay"); 
 
		//Type LastName in the LastName text box
		driver.findElement(By.name("lastname")).sendKeys("Sharma");
 
		// Click on the Submit button
		driver.findElement(By.id("submit")).click();
		
		
		// Click on "Partial Link Text" link
		driver.findElement(By.partialLinkText("Partial")).click();
		System.out.println("Partial Link Test Pass");

		// Convert element in to a string 
		String sClass = driver.findElements(By.tagName("button")).toString();
		System.out.println(sClass);

		// Click on "Link Text" link
		driver.findElement(By.linkText("Link Test")).click();
		System.out.println("Link Test Pass");
		
		driver.close();
	}

}
