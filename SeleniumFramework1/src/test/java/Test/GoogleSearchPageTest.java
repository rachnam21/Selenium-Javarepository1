package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.GoogleSearchpageObjects;

public class GoogleSearchPageTest {
	private static WebDriver driver = null;
	public static void main(String[] args) {
		googleSearchTest();
	}

	public static void googleSearchTest(){
		
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
	
		 GoogleSearchpageObjects searchPageobj = new GoogleSearchpageObjects(driver);
	driver.get("https://google.com");
	searchPageobj.setTextInSearchBox("Rachna");
	searchPageobj.clickSearchBtn();
	driver.close();
	
	}
	}

