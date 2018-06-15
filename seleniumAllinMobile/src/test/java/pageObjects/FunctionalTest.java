package pageObjects;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalTest {
	
	//before class
	public static void setUp(WebDriver driver)
	{
		driver.get("https://allinmobiledetail.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	
	//after 
	public static void cleanUp(WebDriver driver)
	{
		driver.manage().deleteAllCookies();
	}
	
	//after class
	public static void tearDown(WebDriver driver)
	{
		driver.close();
	}

}
