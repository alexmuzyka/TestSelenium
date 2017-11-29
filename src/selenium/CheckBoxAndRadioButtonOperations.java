package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxAndRadioButtonOperations {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = "http://toolsqa.wpengine.com/automation-practice-form/";
		driver.get(url);
		
		// 1 Select the deselected Radio button for category Sex (Use IsSelected method)
		List<WebElement> sexRadioButton = driver.findElements(By.name("sex"));
		
		boolean isSelected = false;
		
		isSelected = sexRadioButton.get(0).isSelected();
		
		if (isSelected == true) {
			sexRadioButton.get(1).click();
		} else {
			sexRadioButton.get(0).click();
		}
		
		// 2 Select the Third radio button for category ‘Years of Exp’ (Use Id attribute to select Radio button)
		WebElement yearsRadioButton = driver.findElement(By.id("exp-2"));
		yearsRadioButton.click();
		
		// 3 check the Check Box ‘Automation Tester’ for category ‘Profession'( Use Value attribute to match the selection)
		List<WebElement> professionRadioButton = driver.findElements(By.name("profession"));
		
		int listSize = professionRadioButton.size();
		
		for (int i=0; i<listSize; i++) {
			String professionRadioButtonText = professionRadioButton.get(i).getAttribute("value");
			if (professionRadioButtonText.equalsIgnoreCase("Automation Tester")) {
				professionRadioButton.get(i).click();
				break;
			}
		}
		
		// 4 check the Check Box ‘Selenium IDE’ for category ‘Automation Tool’ (Use cssSelector)
		WebElement toolCheckBox = driver.findElement(By.cssSelector("input[value='Selenium IDE']"));
		toolCheckBox.click();
		
		Thread.sleep(3000);
		driver.close();
	}

}
