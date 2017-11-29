package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownAndMultipleSelectOperations {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = "http://toolsqa.wpengine.com/automation-practice-form/";
		driver.get(url);

		// 1 Select ‘Continents’ Drop down ( Use Id to identify the element )
		Select select = new Select(driver.findElement(By.id("continents")));
		
		// 2 Select option ‘Europe’ (Use selectByIndex)
		select.selectByIndex(1);
		
		// 3 Select option ‘Africa’ now (Use selectByVisibleText)
		select.selectByVisibleText("Africa");
		
		// 4 Print all the options for the selected drop down and select one option of your choice
		List<WebElement> size = select.getOptions();
		for (int i=0; i<size.size(); i++) {
			String country = select.getOptions().get(i).getText();
			System.out.println(country);
			
			if (country.equals("North America")) {
				select.selectByIndex(i);
			}
		}
		
		// Select ‘Selenium Commands’ Multiple selection box ( Use Name locator to identify the element )
		Select commands = new Select(driver.findElement(By.name("selenium_commands")));
		
		// Select option ‘Browser Commands’  and then deselect it (Use selectByIndex and deselectByIndex)
		commands.selectByIndex(0);
		commands.deselectByIndex(0);
		
		// Select option ‘Navigation Commands’  and then deselect it (Use selectByVisibleText and deselectByVisibleText)
		commands.selectByVisibleText("Navigation Commands");
		commands.deselectByVisibleText("Navigation Commands");
		
		// Print and select all the options for the selected Multiple selection list.
		List<WebElement> allCommands = commands.getOptions();		
		for (int i=0; i<allCommands.size(); i++) {
			System.out.println(commands.getOptions().get(i).getText());
			commands.selectByIndex(i);
		}
		
		// Deselect all options
		commands.deselectAll();

		
		Thread.sleep(2000);
		driver.close();
	}

}
