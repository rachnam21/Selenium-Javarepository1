import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumhq.org/");
	
		String projPath = System.getProperty("user.dir");
		System.out.println("My Project path:" +projPath);
	}

}
