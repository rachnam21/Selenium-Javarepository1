import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DesiredCapablites_DEMO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://seleniumhq.org/");
	
		String projPath = System.getProperty("user.dir");
		System.out.println("My Project path:" +projPath);
	}

}
