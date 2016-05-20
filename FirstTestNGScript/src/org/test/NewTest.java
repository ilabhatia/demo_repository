package org.test;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTest {
	public static WebDriver driver;

	@BeforeMethod 
	public void setUp()  {
		
		driver = new RemoteWebDriver(DesiredCapabilities.firefox());
	    //driver = new FirefoxDriver();
	}
	@Test 
	public void testSearch() throws Exception {
		   driver.get("http://www.google.com");
	        //WebElement element = driver.findElement(By.name("q"));
	        WebElement element = driver.findElement(By.xpath("//*[@id='lst-ib']"));
	        element.sendKeys("Cheese!");
	        // Now submit the form. WebDriver will find the form for us from the element
	        element.submit();
	        //String actualText = element.findElement(By.xpath("//*[@id='rso']/div[1]/div[1]/div/h3/a")).getText();
	        //System.out.println(actualText);
	        // Should see: "cheese! - Google Search"
	        System.out.println("Page title is: " + driver.getTitle());
	        
	        
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
	    driver.quit();  
	}
}
