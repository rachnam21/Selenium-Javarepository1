package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG__DEMO2 {

	static WebDriver driver = null;
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
			}
	
	@Test
	public static void googleSearch2(){
		
		//go to google.com
		driver.get("https://google.com");
		
		//enter text in search box
		driver.findElement(By.id("fakebox-text")).sendKeys("Automation step by step");
		driver.findElement(By.className("search-icon")).sendKeys(Keys.RETURN);
	}
	
	
public static void googleSearch3(){
		
		//go to google.com
		driver.get("https://google.com");
		
		//enter text in search box
		driver.findElement(By.id("fakebox-text")).sendKeys("Automation step by step");
		driver.findElement(By.className("search-icon")).sendKeys(Keys.RETURN);
	}
	
	
	@AfterTest
	public void teardown()
		{
		//close browser
				driver.close();
				driver.quit();
				System.out.println("Test completed successfully");
	}
		
		
	

}
