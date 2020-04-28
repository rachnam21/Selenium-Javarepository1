package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

@SuppressWarnings("unused")
public class GoogleSearchTEST {
	private static WebDriver driver = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			googleSearch();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			}
	
	public static void googleSearch() throws Exception{
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		//go to google.com
		driver.get("https://google.com");
		
		//enter text in search box
		//driver.findElement(By.id("fakebox-text")).sendKeys("Automation step by step");
		
	GoogleSearchPage.textbox_search(driver).sendKeys("Automation");
	
	GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
	//driver.findElement(By.className("search-icon")).sendKeys(Keys.RETURN);
		//close browser
		driver.close();
		
		System.out.println("Test completed successfully");
	}

}
