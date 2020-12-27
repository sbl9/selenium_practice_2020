package selenium_practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DropDown {
	WebDriver driver;
	
	@Test
	public void DropdownSelect() {
	System.setProperty("webdriver.chrome.driver","C:/Selenium/Drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS); 
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	String title=driver.getTitle();
    System.out.println("Title of the page is "+ title);
    
    driver.findElement(By.xpath("//a[@id='u_0_2']")).click();

    
    
    WebElement mon=driver.findElement(By.id("month"));
    mon.click();
    
    
    List<WebElement> ll=driver.findElements(By.id("month"));
    for(WebElement ee:ll) {
    	String text=ee.getText();
    	System.out.println(text);
    }
    
		
		  Select sel=new Select(mon);
		  sel.selectByValue("1"); 
		  sel.selectByIndex(2);
		  sel.selectByVisibleText("Aug");
		  
		  WebElement days=driver.findElement(By.id("day")); 
		  Select selday=new Select(days); 
		  selday.selectByValue("4");
		  
		  WebElement years=driver.findElement(By.id("year")); 
		  Select selyear=new
		  Select(years);
		  selyear.selectByVisibleText("2017");
		  driver.close();
		  //Assert.assertEquals("text","expected");
		 // Assert.assertNotEquals("actual","expected");
		 // Assert.assertTrue("condition"," not displayed");
	
         
    
    
    
}
}
