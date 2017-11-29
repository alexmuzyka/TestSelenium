package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebElementCommands {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		String url = "http://google.com";
		driver.get(url);
		
		WebElement element = driver.findElement(By.id("lst-ib"));
		element.sendKeys("What if...");
		element.clear();
		
		WebElement elementButton = driver.findElement(By.xpath("//*[@name='btnI']"));
		System.out.println(elementButton.getTagName());
		System.out.println(elementButton.getAttribute("value"));
		Dimension size = elementButton.getSize();
		System.out.println("Height: " + size.height + " Width: "+ size.width);
		org.openqa.selenium.Point point = elementButton.getLocation();
		System.out.println("X cordinate : " + point.x + " Y cordinate: " + point.y);
		
		if (elementButton.isDisplayed()) {
			System.out.println("Button is displayed");
		} else {
			System.out.println("Button is not displayed");
		}
		
		if (elementButton.isEnabled()) {
			System.out.println("Button is enabled");
		} else {
			System.out.println("Button is not enabled");
		}
		
		String link = driver.findElement(By.xpath("//a[1]")).getText();
		System.out.println(link);
		
		
		// isSelected() for Checkboxes, Select Options and Radio Buttons
		
		// submit() if the current element is a form, or an element within a form
		
		// getCssvalue() this method Fetch CSS property value of the give element
		
		elementButton.click();
		
		driver.close();
	}

}
