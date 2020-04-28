package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGMultiBrowserDemo {

	WebDriver driver = null;
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName)
	{
		System.out.println("Browser name is:"+browserName);
		if (browserName.equalsIgnoreCase("chrome"))
				{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Varun\\workspace\\SeleniumFramework1\\drivers\\chrome");	
				driver = new ChromeDriver();	
					}
			}
	
	@Test
	public void browserTest() throws Exception {
System.out.println("test");
	} 

	@AfterTest
	public void teardown(){

	}
}
