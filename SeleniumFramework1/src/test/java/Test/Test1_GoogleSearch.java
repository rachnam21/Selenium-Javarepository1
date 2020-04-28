package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_GoogleSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		googleSearch();
			}
	
	public static void googleSearch(){
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//go to google.com
		driver.get("https://google.com");
		
		//enter text in search box
		driver.findElement(By.id("fakebox-text")).sendKeys("Automation step by step");
		driver.findElement(By.className("search-icon")).sendKeys(Keys.RETURN);
		
		//close browser
		driver.close();
		
		System.out.println("Test completed successfully");
	}

}
