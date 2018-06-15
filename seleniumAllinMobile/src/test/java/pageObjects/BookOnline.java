package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookOnline {
	
	private static WebElement element = null;
	
	public static WebElement bookOnline(WebDriver driver)
	{
		element = driver.findElement(By.id("menu-item-410"));
		return element;
	}
	
}
