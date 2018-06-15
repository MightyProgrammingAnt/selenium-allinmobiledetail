package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Contact {
	
	private static WebElement element = null;
	
	
	public static WebElement ContactPage(WebDriver driver)
	{
		element = driver.findElement(By.id("menu-item-16"));
		return element;
	}
	
	public static WebElement yourName(WebDriver driver)
	{
		element = driver.findElement(By.name("your-name"));
		return element;
	}
	
	public static WebElement yourEmail(WebDriver driver)
	{
		element = driver.findElement(By.name("your-email"));
		return element;
	}
	
	public static WebElement yourPhoneNumber(WebDriver driver)
	{
		element = driver.findElement(By.name("phone"));
		return element;
	}
	
	public static WebElement yourCity(WebDriver driver)
	{
		element = driver.findElement(By.name("City"));
		return element;
	}
	
	public static WebElement Send(WebDriver driver)
	{
		element = driver.findElement(By.className("cf-button"));
		return element;
	}
	
}
