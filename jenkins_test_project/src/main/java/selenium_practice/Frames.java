package selenium_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Frames {
	WebDriver driver;
	
	@Test
	public void FrameHandling() {
	System.setProperty("webdriver.chrome.driver","C:/Selenium/Drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS); 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	String title=driver.getTitle();
    System.out.println("Title of the page is "+ title);

}
}