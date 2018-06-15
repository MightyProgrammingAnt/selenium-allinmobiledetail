package automationFrameWork;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.BookOnline;
import pageObjects.Contact;
import pageObjects.FunctionalTest;

public class PageObjectModel {
	
	protected static WebDriver driver = null;
	

	public static void main(String[] args) {
		driver = new ChromeDriver();
		FunctionalTest.setUp(driver);
		contact();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//book_online();
		FunctionalTest.cleanUp(driver);
		//FunctionalTest.tearDown(driver);
		
//		driver.switchTo().frame(drive.findElement(By.className("reopen-dropdown fa fa-chevron-down")));
	}
	
	public static void contact()
	{
		Contact.ContactPage(driver).click();
		Contact.yourName(driver).sendKeys("SahniTestTest");
		Contact.yourEmail(driver).sendKeys("sahnicoe@yahoo.com");
		Contact.yourPhoneNumber(driver).sendKeys("760-555-4444");
		Contact.yourCity(driver).sendKeys("Oside");
		Contact.Send(driver).click();
		System.out.println("Hello test is functional");
	}
	
	public static void book_online()
	{
		BookOnline.bookOnline(driver).click();
	}
	
}
